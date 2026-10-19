#!/usr/bin/env bash
#
# Sets the Maven artifact version for all modules to the given version.
# Reads the version from the VERSION argument; falls back to $GITHUB_REF_NAME
# when no argument is supplied (for compatibility with CI environments).
#
# Usage: scripts/set-maven-version.sh [<version>]
#
# When called with no argument the script behaves identically to the old
# build/setMavenVersion.sh: it uses $GITHUB_REF_NAME and is a no-op when
# that variable is unset (non-tagged build).

set -euo pipefail

cd "$(dirname "$0")/.."

if [ "$#" -ge 1 ] && [ -n "$1" ]; then
  VERSION="$1"
elif [ -n "${GITHUB_REF_NAME:-}" ]; then
  VERSION="$GITHUB_REF_NAME"
else
  printf "\n>>>>> Bypassing artifact version setting for non-tagged build\n"
  exit 0
fi

printf "\n>>>>> Setting artifact version to: %s\n" "$VERSION"
mvn -B versions:set -DnewVersion="$VERSION" -DgenerateBackupPoms=false
