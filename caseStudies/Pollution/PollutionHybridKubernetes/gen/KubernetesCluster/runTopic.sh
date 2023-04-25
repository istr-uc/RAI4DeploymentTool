kubectl cp /home/gestor/orchestrator/topics/topic_Pollution.sh pollutionKafka-0:/tmp/topic_Pollution.sh
kubectl exec pollutionKafka-0 /bin/bash /tmp/topic_Pollution.sh

