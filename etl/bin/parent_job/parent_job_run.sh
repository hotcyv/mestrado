#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms512M -Xmx2048M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jakarta-oro-2.0.8.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/talend_file_enhanced_20070724.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/parent_job_0_1.jar:$ROOT_PATH/child_job_0_1.jar: mestrado.parent_job_0_1.parent_job --context=Default "$@" 