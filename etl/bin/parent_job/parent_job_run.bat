%~d0
cd %~dp0
java -Xms512M -Xmx2048M -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/jakarta-oro-2.0.8.jar;../lib/log4j-1.2.16.jar;../lib/talend_file_enhanced_20070724.jar;../lib/talendcsv.jar;parent_job_0_1.jar;child_job_0_1.jar; mestrado.parent_job_0_1.parent_job --context=Default %* 