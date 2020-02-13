/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.CommunicationServer;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SystemComponentType;
import deploymentTool.DeploymentToolsUtils;

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
	public void deploy() throws ConfigurationException {
		
		CommunicationServer server = this.getHolder();
		if (!(server instanceof KafkaServer)) 
			throw new ConfigurationException("The topic "+getName()+ " is not assigned to a Kafka Server");
		
		
		// Launching script generation
		// De estos puede haber muchos en un mismo nodo, as� que le ponemos el id
		String scriptName = "topic_"+this.getId()+".sh";
		
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, scriptFolderPath, 
				getScriptContent(getName(), server), SystemComponentType.KAFKA_FLOW_STREAM);
		server.getHost().getLaunchingScripts().add(script);
	}
	
	private String getScriptContent(String topicName, CommunicationServer server) {
		String ip = server.getHost().getIp();
		int port = ((KafkaServer)server).getClientPort();
		
		String baseKafkaScript = this.artifactLocator+"/"+this.artifactName;
		String scriptContent = "TOPIC_NAME=\""+topicName+"\"\n";
		scriptContent += baseKafkaScript+" --list --bootstrap-server "+ip+":"+port+ " | grep "+topicName+"\n";
		scriptContent += "#Si existe el topico \n";
		scriptContent += "if [ $? -eq 0 ]; then\n"+"exit 0\n"+"fi\n";
		scriptContent +=  "#Si no existe el topico se crea \n";
		scriptContent += this.artifactLocator+"/"+this.artifactName+" --create --bootstrap-server " +ip+":"+port+
				" --replication-factor "+this.numReplication+ " --partitions "+this.numPartitions + " --topic "+this.getName();

		
		//TODO Me falta los valores que van con --config
		scriptContent=DeploymentToolsUtils.scriptHeaders(getScriptFolderPath())+scriptContent;
		return scriptContent;
	}
	

} //KafkaFlowStreamDataImpl
