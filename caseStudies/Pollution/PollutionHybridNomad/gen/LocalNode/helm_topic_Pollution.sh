kubectl cp C:\Temp\localScripts\topic_Pollution.sh PollutionKafka-0
kubectl exec PollutionKafka-0 -- /bin/bash topic_Pollution.sh
