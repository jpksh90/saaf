#!/bin/bash
#get the actual path of this script
SAAF_BIN="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
VM_ARGS="-Xms500M -Xmx500M"
java $VM_ARGS \
-Dfile.encoding=UTF-8 \
-jar ../bin/SAAF.jar "$@"
