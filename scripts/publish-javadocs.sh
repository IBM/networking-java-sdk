#!/usr/bin/env bash
#
# Builds the aggregate Javadoc and publishes it to the gh-pages branch.
# Delegates the gh-pages push to scripts/publish-javadocs-push.sh.
#
# Usage: scripts/publish-javadocs.sh <version>
#
# Required environment variables:
#   GH_TOKEN  - GitHub personal access token with repo write access
#
# The version argument is validated (must be a semver string) and exported
# as GH_TAG so that scripts/publish-javadocs-push.sh picks it up unchanged.

set -euo pipefail

if [ "$#" -ne 1 ]; then
  echo "Usage: $0 <version>" >&2
  exit 2
fi

VERSION="$1"
SEMVER='^[0-9]+\.[0-9]+\.[0-9]+([-+][0-9A-Za-z.-]+)?$'
if ! [[ "$VERSION" =~ $SEMVER ]]; then
  echo "ERROR: '$VERSION' is not a valid semantic version" >&2
  exit 2
fi

: "${GH_TOKEN:?GH_TOKEN environment variable is required}"
export GH_REPO_SLUG="IBM/networking-java-sdk"

cd "$(dirname "$0")/.."

printf "\n>>>>> Building aggregate Javadoc for version %s\n" "$VERSION"
mvn -B clean package javadoc:aggregate -DskipTests -DskipITs

printf "\n>>>>> Publishing Javadoc to gh-pages\n"
export GH_TAG="$VERSION"
"$(dirname "$0")/publish-javadocs-push.sh"

printf "\n>>>>> Javadoc published: repo=%s tag=%s\n" "$GH_REPO_SLUG" "$GH_TAG"
