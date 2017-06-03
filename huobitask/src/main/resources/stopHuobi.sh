#!/bin/sh
PID=$(cat ./record.pid)
kill -9 $PID
