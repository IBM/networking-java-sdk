#!/bin/bash

# This script is used to publish javadocs to the project's gh-pages branch
# when running in a GitHub Actions workflow.

set -e

printf "\n>>>>> Publishing javadoc for release build: repo=%s branch=%s build_num=%s job_num=%s\n" ${GH_REPO_SLUG} ${GITHUB_REF} ${GITHUB_RUN_NUMBER} ${GITHUB_JOB}

# Avoid publishing javadocs for PR builds
if [ "${GITHUB_EVENT_NAME}" == "pull_request" ]; then
    printf "\n>>>>> PR build detected, skipping javadoc publishing.\n"
    exit 0
fi

# Only publish javadocs for tagged releases
if [ -z "${GH_TAG}" ]; then
    printf "\n>>>>> No tag detected, skipping javadoc publishing.\n"
    exit 0
fi

printf "\n>>>>> Cloning repository's gh-pages branch into directory 'gh-pages'\n"
git clone --branch=gh-pages https://x-access-token:${GITHUB_TOKEN}@github.com/${GH_REPO_SLUG} gh-pages

printf "\n>>>>> Finished cloning...\n"

pushd gh-pages
  
  # Create a new directory for this release's javadocs
  rm -rf docs/${GH_TAG}
  mkdir -p docs/${GH_TAG}

  # Copy the aggregated javadocs to the new directory
  printf "\n>>>>> Copying aggregated javadocs to docs/%s\n" ${GH_TAG}
  cp -rf ../target/site/apidocs/* docs/${GH_TAG}

  # Update the 'latest' symlink to point to this release
  printf "\n>>>>> Updating 'docs/latest' symlink\n"
  cd docs
  rm -f latest
  ln -s ./${GH_TAG} latest
  git add latest
  cd ..

  printf "\n>>>>> Committing new javadocs\n"
  git add -f docs/${GH_TAG}
  git commit -m "Published javadocs for release ${GH_TAG}"
  
  printf "\n>>>>> Pushing new javadocs to gh-pages branch\n"
  git push -f origin gh-pages

popd

printf "\n>>>>> Published javadocs for release build: repo=%s branch=%s build_num=%s job_num=%s\n" ${GH_REPO_SLUG} ${GITHUB_REF} ${GITHUB_RUN_NUMBER} ${GITHUB_JOB}

