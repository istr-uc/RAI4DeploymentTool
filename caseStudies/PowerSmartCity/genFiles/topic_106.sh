#!/bin/bash
cd /home/gestor/apache/app/psg4c/topics/scripts
TOPIC_NAME="ConfigCS"
/home/gestor/apache/servers/kafka/bin/kafka-topics.sh/kafka-topics.sh --list --bootstrap-server 172.31.16.48:9092 | grep ConfigCS
#Si existe el topico 
if [ $? -eq 0 ]; then
exit 0
fi
#Si no existe el topico se crea 
/home/gestor/apache/servers/kafka/bin/kafka-topics.sh/kafka-topics.sh --create --bootstrap-server 172.31.16.48:9092 --replication-factor 1 --partitions 2 --topic ConfigCS
