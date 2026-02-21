#!/bin/bash

# This script will check $GITHUB_REF_NAME to see if we need to run maven to
# set the artifact version #'s.
# Called by semantic-release during the release process.

if [[ -n "${GITHUB_REF_NAME}" ]]; then
    printf "\n>>>>> Setting artifact version #'s to: %s\n" ${GITHUB_REF_NAME}
    mvn versions:set -DnewVersion=${GITHUB_REF_NAME} -DgenerateBackupPoms=false
else
    printf "\n>>>>> Bypassing artifact version setting for non-tagged build\n"
fi