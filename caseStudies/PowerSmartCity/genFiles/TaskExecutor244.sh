#!/bin/bash
cd /home/gestor/apache/app/psg4c/workflows/scriptsFolder
java -javaagent:/home/gestor/apache/servers/prometheus/exporters/tpaExporter/TaskExecutorMeterAgent-0.0.1-jar-with-dependencies.jar=244;/home/gestor/apache/app/psg4c/workflows/configFolder/244.cfg -jar /home/gestor/apache/app/psg4c/workflows/scriptsFolder/DailyConformationExecutor.jar 240 172.31.16.53:9092 172.31.16.53:7000
