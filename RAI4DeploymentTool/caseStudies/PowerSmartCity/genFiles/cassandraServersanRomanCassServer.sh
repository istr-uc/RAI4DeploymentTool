#!/bin/bash
cd /home/gestor/apache/servers/cassandra/scripts
rm -rf /home/gestor/apache/servers/cassandra/data/data/system/*
rm -f /home/gestor/apache/servers/cassandra/conf/cassandra-topology.properties
/home/gestor/apache/servers/cassandra/bin/cassandra -Dcassandra.config=file:////home/gestor/apache/servers/cassandra/conf/cassandrasanRomanCassServer.yaml
sleep 60 
/home/gestor/apache/servers/cassandra/bin/cqlsh 172.31.16.63 -f /home/gestor/apache/servers/cassandra/scripts/PSG4C_Basic.cdl
