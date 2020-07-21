cd /home/gestor/apache/servers/kafka/scripts
rm -f /home/gestor/apache/servers/kafka/logs/meta.properties
/home/gestor/apache/servers/kafka/bin/kafka-server-start.sh -daemon /home/gestor/apache/servers/kafka/config/kafka1.properties
