#!/bin/bash
cd /home/gestor/apache/app/psg4c/workflows/scriptsFolder
java -jar /home/gestor/apache/app/psg4c/workflows/scriptsFolder/HourlyST_StatusExecutor.jar 250 172.31.16.53:9092 172.31.16.53:7000
