/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.AVROServer;
import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraServer;
import PASYS_Metamodel.pasys.CommunicationMeter;
import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.ExternalElementType;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaServer;
import PASYS_Metamodel.pasys.KafkaWorkloadStreamData;
import PASYS_Metamodel.pasys.MemSQLServer;
import PASYS_Metamodel.pasys.Neo4JServer;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.PasysFactory;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformServer;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusServer;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.SparkServer;
import PASYS_Metamodel.pasys.StormServer;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SystemAdapter;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.SystemElementAdapter;
import PASYS_Metamodel.pasys.SystemExternalElement;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatency;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkloadStreamData;
import PASYS_Metamodel.pasys.ZookeeperServer;

import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PasysFactoryImpl extends EFactoryImpl implements PasysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PasysFactory init() {
		try {
			PasysFactory thePasysFactory = (PasysFactory)EPackage.Registry.INSTANCE.getEFactory(PasysPackage.eNS_URI);
			if (thePasysFactory != null) {
				return thePasysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PasysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PasysPackage.COMPUTATIONAL_SYSTEM: return createComputationalSystem();
			case PasysPackage.SYSTEM_EXTERNAL_ELEMENT: return createSystemExternalElement();
			case PasysPackage.SYSTEM_ADAPTER: return createSystemAdapter();
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER: return createSystemElementAdapter();
			case PasysPackage.PROCESSING_NODE: return createProcessingNode();
			case PasysPackage.PHYSICAL_PROCESSING_NODE: return createPhysicalProcessingNode();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE: return createAWSVirtualProcessingNode();
			case PasysPackage.RESOURCE_CLUSTER: return createResourceCluster();
			case PasysPackage.NODE_CLUSTER: return createNodeCluster();
			case PasysPackage.NETWORK: return createNetwork();
			case PasysPackage.PLATFORM_SERVER: return createPlatformServer();
			case PasysPackage.AVRO_SERVER: return createAVROServer();
			case PasysPackage.ZOOKEEPER_SERVER: return createZookeeperServer();
			case PasysPackage.KAFKA_SERVER: return createKafkaServer();
			case PasysPackage.NODE_SCHEDULER: return createNodeScheduler();
			case PasysPackage.SPARK_SERVER: return createSparkServer();
			case PasysPackage.STORM_SERVER: return createStormServer();
			case PasysPackage.MEM_SQL_SERVER: return createMemSQLServer();
			case PasysPackage.CASSANDRA_SERVER: return createCassandraServer();
			case PasysPackage.NEO4_JSERVER: return createNeo4JServer();
			case PasysPackage.PROMETHEUS_SERVER: return createPrometheusServer();
			case PasysPackage.STREAM_DATA_PARTITION: return createStreamDataPartition();
			case PasysPackage.FLOW_STREAM_DATA: return createFlowStreamData();
			case PasysPackage.KAFKA_FLOW_STREAM_DATA: return createKafkaFlowStreamData();
			case PasysPackage.DERIVED_STREAM_DATA: return createDerivedStreamData();
			case PasysPackage.WORKLOAD_STREAM_DATA: return createWorkloadStreamData();
			case PasysPackage.KAFKA_WORKLOAD_STREAM_DATA: return createKafkaWorkloadStreamData();
			case PasysPackage.WORKFLOW: return createWorkflow();
			case PasysPackage.SCHEDULABLE_SET: return createSchedulableSet();
			case PasysPackage.TASK: return createTask();
			case PasysPackage.TASK_EXECUTOR: return createTaskExecutor();
			case PasysPackage.PROCESSING_NODE_UTILIZATION: return createProcessingNodeUtilization();
			case PasysPackage.PROCESSING_NODE_MEMORY: return createProcessingNodeMemory();
			case PasysPackage.NETWORK_UTILIZATION: return createNetworkUtilization();
			case PasysPackage.WORKFLOW_LATENCY: return createWorkflowLatency();
			case PasysPackage.TASK_PROCESSING_AMOUNT: return createTaskProcessingAmount();
			case PasysPackage.STREAM_DATA_RATE: return createStreamDataRate();
			case PasysPackage.PROMETHEUS_METER: return createPrometheusMeter();
			case PasysPackage.NODE_RESOURCE_METER: return createNodeResourceMeter();
			case PasysPackage.COMMUNICATION_METER: return createCommunicationMeter();
			case PasysPackage.STREAM_RATE_METER: return createStreamRateMeter();
			case PasysPackage.WORKFLOW_LATENCY_METER: return createWorkflowLatencyMeter();
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER: return createTaskProcessingAmountMeter();
			case PasysPackage.FILE_DESCRIPTOR: return createFileDescriptor();
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR: return createDeploymentFileDescriptor();
			case PasysPackage.ARTIFACT_DESCRIPTOR: return createArtifactDescriptor();
			case PasysPackage.EXPORTER_DATA: return createExporterData();
			case PasysPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PasysPackage.EXTERNAL_ELEMENT_TYPE:
				return createExternalElementTypeFromString(eDataType, initialValue);
			case PasysPackage.SYSTEM_COMPONENT_TYPE:
				return createSystemComponentTypeFromString(eDataType, initialValue);
			case PasysPackage.PROPERTIES:
				return createPropertiesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PasysPackage.EXTERNAL_ELEMENT_TYPE:
				return convertExternalElementTypeToString(eDataType, instanceValue);
			case PasysPackage.SYSTEM_COMPONENT_TYPE:
				return convertSystemComponentTypeToString(eDataType, instanceValue);
			case PasysPackage.PROPERTIES:
				return convertPropertiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputationalSystem createComputationalSystem() {
		ComputationalSystemImpl computationalSystem = new ComputationalSystemImpl();
		return computationalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemExternalElement createSystemExternalElement() {
		SystemExternalElementImpl systemExternalElement = new SystemExternalElementImpl();
		return systemExternalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemAdapter createSystemAdapter() {
		SystemAdapterImpl systemAdapter = new SystemAdapterImpl();
		return systemAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemElementAdapter createSystemElementAdapter() {
		SystemElementAdapterImpl systemElementAdapter = new SystemElementAdapterImpl();
		return systemElementAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode createProcessingNode() {
		ProcessingNodeImpl processingNode = new ProcessingNodeImpl();
		return processingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalProcessingNode createPhysicalProcessingNode() {
		PhysicalProcessingNodeImpl physicalProcessingNode = new PhysicalProcessingNodeImpl();
		return physicalProcessingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSVirtualProcessingNode createAWSVirtualProcessingNode() {
		AWSVirtualProcessingNodeImpl awsVirtualProcessingNode = new AWSVirtualProcessingNodeImpl();
		return awsVirtualProcessingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster createResourceCluster() {
		ResourceClusterImpl resourceCluster = new ResourceClusterImpl();
		return resourceCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster createNodeCluster() {
		NodeClusterImpl nodeCluster = new NodeClusterImpl();
		return nodeCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformServer createPlatformServer() {
		PlatformServerImpl platformServer = new PlatformServerImpl();
		return platformServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AVROServer createAVROServer() {
		AVROServerImpl avroServer = new AVROServerImpl();
		return avroServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZookeeperServer createZookeeperServer() {
		ZookeeperServerImpl zookeeperServer = new ZookeeperServerImpl();
		return zookeeperServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaServer createKafkaServer() {
		KafkaServerImpl kafkaServer = new KafkaServerImpl();
		return kafkaServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeScheduler createNodeScheduler() {
		NodeSchedulerImpl nodeScheduler = new NodeSchedulerImpl();
		return nodeScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparkServer createSparkServer() {
		SparkServerImpl sparkServer = new SparkServerImpl();
		return sparkServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormServer createStormServer() {
		StormServerImpl stormServer = new StormServerImpl();
		return stormServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemSQLServer createMemSQLServer() {
		MemSQLServerImpl memSQLServer = new MemSQLServerImpl();
		return memSQLServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CassandraServer createCassandraServer() {
		CassandraServerImpl cassandraServer = new CassandraServerImpl();
		return cassandraServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neo4JServer createNeo4JServer() {
		Neo4JServerImpl neo4JServer = new Neo4JServerImpl();
		return neo4JServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrometheusServer createPrometheusServer() {
		PrometheusServerImpl prometheusServer = new PrometheusServerImpl();
		return prometheusServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamDataPartition createStreamDataPartition() {
		StreamDataPartitionImpl streamDataPartition = new StreamDataPartitionImpl();
		return streamDataPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowStreamData createFlowStreamData() {
		FlowStreamDataImpl flowStreamData = new FlowStreamDataImpl();
		return flowStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaFlowStreamData createKafkaFlowStreamData() {
		KafkaFlowStreamDataImpl kafkaFlowStreamData = new KafkaFlowStreamDataImpl();
		return kafkaFlowStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedStreamData createDerivedStreamData() {
		DerivedStreamDataImpl derivedStreamData = new DerivedStreamDataImpl();
		return derivedStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkloadStreamData createWorkloadStreamData() {
		WorkloadStreamDataImpl workloadStreamData = new WorkloadStreamDataImpl();
		return workloadStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaWorkloadStreamData createKafkaWorkloadStreamData() {
		KafkaWorkloadStreamDataImpl kafkaWorkloadStreamData = new KafkaWorkloadStreamDataImpl();
		return kafkaWorkloadStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulableSet createSchedulableSet() {
		SchedulableSetImpl schedulableSet = new SchedulableSetImpl();
		return schedulableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskExecutor createTaskExecutor() {
		TaskExecutorImpl taskExecutor = new TaskExecutorImpl();
		return taskExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeUtilization createProcessingNodeUtilization() {
		ProcessingNodeUtilizationImpl processingNodeUtilization = new ProcessingNodeUtilizationImpl();
		return processingNodeUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeMemory createProcessingNodeMemory() {
		ProcessingNodeMemoryImpl processingNodeMemory = new ProcessingNodeMemoryImpl();
		return processingNodeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkUtilization createNetworkUtilization() {
		NetworkUtilizationImpl networkUtilization = new NetworkUtilizationImpl();
		return networkUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowLatency createWorkflowLatency() {
		WorkflowLatencyImpl workflowLatency = new WorkflowLatencyImpl();
		return workflowLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskProcessingAmount createTaskProcessingAmount() {
		TaskProcessingAmountImpl taskProcessingAmount = new TaskProcessingAmountImpl();
		return taskProcessingAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamDataRate createStreamDataRate() {
		StreamDataRateImpl streamDataRate = new StreamDataRateImpl();
		return streamDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrometheusMeter createPrometheusMeter() {
		PrometheusMeterImpl prometheusMeter = new PrometheusMeterImpl();
		return prometheusMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeResourceMeter createNodeResourceMeter() {
		NodeResourceMeterImpl nodeResourceMeter = new NodeResourceMeterImpl();
		return nodeResourceMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationMeter createCommunicationMeter() {
		CommunicationMeterImpl communicationMeter = new CommunicationMeterImpl();
		return communicationMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamRateMeter createStreamRateMeter() {
		StreamRateMeterImpl streamRateMeter = new StreamRateMeterImpl();
		return streamRateMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowLatencyMeter createWorkflowLatencyMeter() {
		WorkflowLatencyMeterImpl workflowLatencyMeter = new WorkflowLatencyMeterImpl();
		return workflowLatencyMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskProcessingAmountMeter createTaskProcessingAmountMeter() {
		TaskProcessingAmountMeterImpl taskProcessingAmountMeter = new TaskProcessingAmountMeterImpl();
		return taskProcessingAmountMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDescriptor createFileDescriptor() {
		FileDescriptorImpl fileDescriptor = new FileDescriptorImpl();
		return fileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactDescriptor createArtifactDescriptor() {
		ArtifactDescriptorImpl artifactDescriptor = new ArtifactDescriptorImpl();
		return artifactDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExporterData createExporterData() {
		ExporterDataImpl exporterData = new ExporterDataImpl();
		return exporterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentFileDescriptor createDeploymentFileDescriptor() {
		DeploymentFileDescriptorImpl deploymentFileDescriptor = new DeploymentFileDescriptorImpl();
		return deploymentFileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalElementType createExternalElementTypeFromString(EDataType eDataType, String initialValue) {
		ExternalElementType result = ExternalElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentType createSystemComponentTypeFromString(EDataType eDataType, String initialValue) {
		SystemComponentType result = SystemComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createPropertiesFromString(EDataType eDataType, String initialValue) {
		return (Properties)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PasysPackage getPasysPackage() {
		return (PasysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PasysPackage getPackage() {
		return PasysPackage.eINSTANCE;
	}

} //PasysFactoryImpl
