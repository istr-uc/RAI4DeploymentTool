#!/bin/bash
cd /home/gestor/apache/services/cassandra/scripts
rm -rf /home/gestor/apache/services/cassandra/data/data/system/*
rm -f /home/gestor/apache/services/cassandra/config/cassandra-topology.properties
/home/gestor/apache/services/cassandra/bin/cassandra -Dcassandra.config=file:////home/gestor/apache/services/cassandra/config/cassandraPollutionCassandra.yaml
sleep 60 
/home/gestor/apache/services/cassandra/bin/cqlsh 172.31.16.47 -f /home/gestor/apache/services/cassandra/scripts/cassandra_schema.sql
