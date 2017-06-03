#!/bin/sh
java -jar huobi-task-1.0-SNAPSHOT-jar-with-dependencies.jar &
echo $!>./record.pid
