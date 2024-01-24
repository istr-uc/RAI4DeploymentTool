#!/bin/bash
cd /tmp
TOPIC_NAME="Pollution"
kafka-topics.sh --list --bootstrap-server PollutionKafka-hs:9092 | grep Pollution
#Si existe el topico 
if [ $? -eq 0 ]; then
exit 0
fi
#Si no existe el topico se crea 
kafka-topics.sh --create --bootstrap-server PollutionKafka-hs:9092 --replication-factor 1 --partitions 1 --topic Pollution
