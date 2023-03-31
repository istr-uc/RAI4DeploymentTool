/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage
 * @generated
 */
public interface PasysFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PasysFactory eINSTANCE = PASYS_Metamodel.pasys.impl.PasysFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Computational System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computational System</em>'.
	 * @generated
	 */
	ComputationalSystem createComputationalSystem();

	/**
	 * Returns a new object of class '<em>Physical Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Processing Node</em>'.
	 * @generated
	 */
	PhysicalProcessingNode createPhysicalProcessingNode();

	/**
	 * Returns a new object of class '<em>AWS Virtual Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AWS Virtual Processing Node</em>'.
	 * @generated
	 */
	AWSVirtualProcessingNode createAWSVirtualProcessingNode();

	/**
	 * Returns a new object of class '<em>Processing Node Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Node Cluster</em>'.
	 * @generated
	 */
	ProcessingNodeCluster createProcessingNodeCluster();

	/**
	 * Returns a new object of class '<em>Orchestration Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestration Cluster</em>'.
	 * @generated
	 */
	OrchestrationCluster createOrchestrationCluster();

	/**
	 * Returns a new object of class '<em>Kubernetes Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kubernetes Cluster</em>'.
	 * @generated
	 */
	KubernetesCluster createKubernetesCluster();

	/**
	 * Returns a new object of class '<em>Swarm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swarm Cluster</em>'.
	 * @generated
	 */
	SwarmCluster createSwarmCluster();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>AVRO Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVRO Service</em>'.
	 * @generated
	 */
	AVROService createAVROService();

	/**
	 * Returns a new object of class '<em>Zookeeper Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zookeeper Service</em>'.
	 * @generated
	 */
	ZookeeperService createZookeeperService();

	/**
	 * Returns a new object of class '<em>Kafka Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Service</em>'.
	 * @generated
	 */
	KafkaService createKafkaService();

	/**
	 * Returns a new object of class '<em>Node Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Scheduler</em>'.
	 * @generated
	 */
	NodeScheduler createNodeScheduler();

	/**
	 * Returns a new object of class '<em>Spark Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spark Service</em>'.
	 * @generated
	 */
	SparkService createSparkService();

	/**
	 * Returns a new object of class '<em>Storm Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storm Service</em>'.
	 * @generated
	 */
	StormService createStormService();

	/**
	 * Returns a new object of class '<em>Storm UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storm UI</em>'.
	 * @generated
	 */
	StormUI createStormUI();

	/**
	 * Returns a new object of class '<em>Storm Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storm Nimbus</em>'.
	 * @generated
	 */
	StormNimbus createStormNimbus();

	/**
	 * Returns a new object of class '<em>Storm Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storm Supervisor</em>'.
	 * @generated
	 */
	StormSupervisor createStormSupervisor();

	/**
	 * Returns a new object of class '<em>Mem SQL Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem SQL Service</em>'.
	 * @generated
	 */
	MemSQLService createMemSQLService();

	/**
	 * Returns a new object of class '<em>Cassandra Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cassandra Service</em>'.
	 * @generated
	 */
	CassandraService createCassandraService();

	/**
	 * Returns a new object of class '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center</em>'.
	 * @generated
	 */
	DataCenter createDataCenter();

	/**
	 * Returns a new object of class '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack</em>'.
	 * @generated
	 */
	Rack createRack();

	/**
	 * Returns a new object of class '<em>Neo4 JService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo4 JService</em>'.
	 * @generated
	 */
	Neo4JService createNeo4JService();

	/**
	 * Returns a new object of class '<em>Prometheus Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prometheus Service</em>'.
	 * @generated
	 */
	PrometheusService createPrometheusService();

	/**
	 * Returns a new object of class '<em>Stream Data Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Data Partition</em>'.
	 * @generated
	 */
	StreamDataPartition createStreamDataPartition();

	/**
	 * Returns a new object of class '<em>Flow Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Stream Data</em>'.
	 * @generated
	 */
	FlowStreamData createFlowStreamData();

	/**
	 * Returns a new object of class '<em>Kafka Flow Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Flow Stream Data</em>'.
	 * @generated
	 */
	KafkaFlowStreamData createKafkaFlowStreamData();

	/**
	 * Returns a new object of class '<em>Derived Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Stream Data</em>'.
	 * @generated
	 */
	DerivedStreamData createDerivedStreamData();

	/**
	 * Returns a new object of class '<em>Workload Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload Stream Data</em>'.
	 * @generated
	 */
	WorkloadStreamData createWorkloadStreamData();

	/**
	 * Returns a new object of class '<em>Kafka Workload Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kafka Workload Stream Data</em>'.
	 * @generated
	 */
	KafkaWorkloadStreamData createKafkaWorkloadStreamData();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Schedulable Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedulable Set</em>'.
	 * @generated
	 */
	SchedulableSet createSchedulableSet();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Task Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Executor</em>'.
	 * @generated
	 */
	TaskExecutor createTaskExecutor();

	/**
	 * Returns a new object of class '<em>Processing Node Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Node Utilization</em>'.
	 * @generated
	 */
	ProcessingNodeUtilization createProcessingNodeUtilization();

	/**
	 * Returns a new object of class '<em>Processing Node Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Node Memory</em>'.
	 * @generated
	 */
	ProcessingNodeMemory createProcessingNodeMemory();

	/**
	 * Returns a new object of class '<em>Network Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Utilization</em>'.
	 * @generated
	 */
	NetworkUtilization createNetworkUtilization();

	/**
	 * Returns a new object of class '<em>Workflow Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Latency</em>'.
	 * @generated
	 */
	WorkflowLatency createWorkflowLatency();

	/**
	 * Returns a new object of class '<em>Task Processing Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Processing Amount</em>'.
	 * @generated
	 */
	TaskProcessingAmount createTaskProcessingAmount();

	/**
	 * Returns a new object of class '<em>Stream Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Data Rate</em>'.
	 * @generated
	 */
	StreamDataRate createStreamDataRate();

	/**
	 * Returns a new object of class '<em>Prometheus Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prometheus Meter</em>'.
	 * @generated
	 */
	PrometheusMeter createPrometheusMeter();

	/**
	 * Returns a new object of class '<em>Node Resource Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Resource Meter</em>'.
	 * @generated
	 */
	NodeResourceMeter createNodeResourceMeter();

	/**
	 * Returns a new object of class '<em>Communication Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Meter</em>'.
	 * @generated
	 */
	CommunicationMeter createCommunicationMeter();

	/**
	 * Returns a new object of class '<em>Stream Rate Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Rate Meter</em>'.
	 * @generated
	 */
	StreamRateMeter createStreamRateMeter();

	/**
	 * Returns a new object of class '<em>Workflow Latency Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Latency Meter</em>'.
	 * @generated
	 */
	WorkflowLatencyMeter createWorkflowLatencyMeter();

	/**
	 * Returns a new object of class '<em>Task Processing Amount Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Processing Amount Meter</em>'.
	 * @generated
	 */
	TaskProcessingAmountMeter createTaskProcessingAmountMeter();

	/**
	 * Returns a new object of class '<em>Orchestrator Deployment Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestrator Deployment Conf</em>'.
	 * @generated
	 */
	OrchestratorDeploymentConf createOrchestratorDeploymentConf();

	/**
	 * Returns a new object of class '<em>Node Deployment Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Deployment Conf</em>'.
	 * @generated
	 */
	NodeDeploymentConf createNodeDeploymentConf();

	/**
	 * Returns a new object of class '<em>File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Descriptor</em>'.
	 * @generated
	 */
	FileDescriptor createFileDescriptor();

	/**
	 * Returns a new object of class '<em>Artifact Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Descriptor</em>'.
	 * @generated
	 */
	ArtifactDescriptor createArtifactDescriptor();

	/**
	 * Returns a new object of class '<em>Exporter Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exporter Data</em>'.
	 * @generated
	 */
	ExporterData createExporterData();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Swarm Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swarm Port</em>'.
	 * @generated
	 */
	SwarmPort createSwarmPort();

	/**
	 * Returns a new object of class '<em>Kubernetes Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kubernetes Port</em>'.
	 * @generated
	 */
	KubernetesPort createKubernetesPort();

	/**
	 * Returns a new object of class '<em>Deployment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Constraints</em>'.
	 * @generated
	 */
	DeploymentConstraints createDeploymentConstraints();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Deployment File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment File Descriptor</em>'.
	 * @generated
	 */
	DeploymentFileDescriptor createDeploymentFileDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PasysPackage getPasysPackage();

} //PasysFactory
