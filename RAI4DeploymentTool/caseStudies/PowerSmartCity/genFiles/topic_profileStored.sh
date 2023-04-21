#!/bin/bash
cd /home/gestor/apache/app/psg4c/topics/scriptFolder
TOPIC_NAME="profileStored"
/home/gestor/apache/servers/kafka/bin/kafka-topics.sh --list --bootstrap-server 172.31.16.38:9092 | grep profileStored
#Si existe el topico 
if [ $? -eq 0 ]; then
exit 0
fi
#Si no existe el topico se crea 
/home/gestor/apache/servers/kafka/bin/kafka-topics.sh --create --bootstrap-server 172.31.16.38:9092 --replication-factor 1 --partitions 6 --topic profileStored
