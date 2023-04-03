/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.CommunicationService;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.NodeDeploymentConf;
import PASYS_Metamodel.pasys.KafkaService;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.DeployableComponentType;
import deploymentTool.DeploymentToolsUtils;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kafka Flow Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KafkaFlowStreamDataImpl extends FlowStreamDataImpl implements KafkaFlowStreamData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaFlowStreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.KAFKA_FLOW_STREAM_DATA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		
		CommunicationService server = this.getHolder();
		if (!(server instanceof KafkaService)) 
			throw new ConfigurationException("The topic "+getName()+ " is not assigned to a Kafka Server");
		
		NodeDeploymentConf conf = (NodeDeploymentConf) getDeploymentConfig();
		// Launching script generation
		// De estos puede haber muchos en un mismo nodo, asi que le ponemos el id
		String scriptName = "topic_"+this.getId()+".sh";
		
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, conf.getScriptFolderPath(), 
				getScriptContent(getName(), server), DeployableComponentType.KAFKA_FLOW_STREAM);
		ProcessingNodeCluster serverCluster = (ProcessingNodeCluster) server.getHost();
		ProcessingNode node = serverCluster.getNodes().get(0);
		node.addLaunchingScript(script);
	}
	
	private String getScriptContent(String topicName, CommunicationService server) {
		
		ProcessingNodeCluster serverCluster = (ProcessingNodeCluster) server.getHost();	
		String ip = serverCluster.getNodes().get(0).getIp();
		int port = ((KafkaService)server).getClientPort();
		NodeDeploymentConf conf = (NodeDeploymentConf) getDeploymentConfig();
		
		String baseKafkaScript = conf.getArtifactLocator()+"/"+conf.getArtifactName();
		String scriptContent = "TOPIC_NAME=\""+topicName+"\"\n";
		scriptContent += baseKafkaScript+" --list --bootstrap-server "+ip+":"+port+ " | grep "+topicName+"\n";
		scriptContent += "#Si existe el topico \n";
		scriptContent += "if [ $? -eq 0 ]; then\n"+"exit 0\n"+"fi\n";
		scriptContent +=  "#Si no existe el topico se crea \n";
		scriptContent += conf.getArtifactLocator()+"/"+conf.getArtifactName()+" --create --bootstrap-server " +ip+":"+port+
				" --replication-factor "+this.numReplication+ " --partitions "+this.numPartitions + " --topic "+this.getName();

		
		//TODO Me falta los valores que van con --config
		scriptContent=DeploymentToolsUtils.scriptHeaders(conf.getScriptFolderPath())+scriptContent;
		return scriptContent;
	}
	

	

} //KafkaFlowStreamDataImpl
