#!/usr/bin/env bash
#
# Clones the gh-pages branch, copies the generated Javadoc into docs/<version>,
# regenerates the index, and pushes back.
#
# This script is called by scripts/publish-javadocs.sh after the Maven
# javadoc:aggregate goal has already been run.  Do not call it directly.
#
# Required environment variables:
#   GH_TOKEN  - GitHub personal access token with repo write access
#   GH_TAG    - the release version string (e.g. 0.49.2)

set -euo pipefail

: "${GH_TOKEN:?GH_TOKEN environment variable is required}"
: "${GH_TAG:?GH_TAG environment variable is required}"
GH_REPO_SLUG="IBM/networking-java-sdk"

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

printf "\n>>>>> Publishing javadoc for release build: repo=%s tag=%s\n" "$GH_REPO_SLUG" "$GH_TAG"

printf "\n>>>>> Cloning repository's gh-pages branch into directory 'gh-pages'\n"
rm -fr "$REPO_ROOT/gh-pages"
git config --global user.email "Devx.Network.Services@ibm.com"
git config --global user.name "DevxNetworkServices"
git clone --branch=gh-pages "https://${GH_TOKEN}@github.com/${GH_REPO_SLUG}.git" "$REPO_ROOT/gh-pages"

printf "\n>>>>> Finished cloning...\n"

pushd "$REPO_ROOT/gh-pages"

# Create a new directory for this tag and copy the javadocs there.
printf "\n>>>>> Copying javadocs to new directory: docs/%s\n" "$GH_TAG"
rm -rf "docs/${GH_TAG}"
mkdir -p "docs/${GH_TAG}"
cp -rf "$REPO_ROOT/target/reports/apidocs/." "docs/${GH_TAG}"

printf "\n>>>>> Generating gh-pages index.html...\n"
"$SCRIPT_DIR/generate-javadoc-index.sh" > index.html

printf "\n>>>>> Committing new javadoc...\n"
git add -f .
git commit -m "docs: latest javadoc for ${GH_TAG}"
git push -f origin gh-pages

popd

printf "\n>>>>> Published javadoc for release build: repo=%s tag=%s\n" "$GH_REPO_SLUG" "$GH_TAG"
