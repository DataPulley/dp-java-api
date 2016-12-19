#!/bin/bash

set -euo pipefail

case "$JOB" in
CI)
  mvn test verify -B -e -V
  ;;
ITS)
  # Setup something before (database, files...)
  mvn test verify -Pit -Dcategory=$IT_CATEGORY
  ;;
esac
