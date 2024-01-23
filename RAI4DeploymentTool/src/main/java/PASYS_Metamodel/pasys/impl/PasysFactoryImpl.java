/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.AVROService;
import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraService;
import PASYS_Metamodel.pasys.CommunicationMeter;
import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.DataCenter;
import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.DeploymentConstraints;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaService;
import PASYS_Metamodel.pasys.KafkaWorkloadStreamData;
import PASYS_Metamodel.pasys.KubernetesCluster;
import PASYS_Metamodel.pasys.KubernetesDeploymentConf;
import PASYS_Metamodel.pasys.MemSQLService;
import PASYS_Metamodel.pasys.Neo4JService;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeDeploymentConf;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.NomadCluster;
import PASYS_Metamodel.pasys.NomadDeploymentConf;
import PASYS_Metamodel.pasys.NomadDriver;
import PASYS_Metamodel.pasys.OrchestrationCluster;
import PASYS_Metamodel.pasys.PasysFactory;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.PortMode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusService;
import PASYS_Metamodel.pasys.Protocol;
import PASYS_Metamodel.pasys.Rack;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.ServiceType;
import PASYS_Metamodel.pasys.SparkService;
import PASYS_Metamodel.pasys.StormNimbus;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.StormSupervisor;
import PASYS_Metamodel.pasys.StormUI;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SwarmCluster;
import PASYS_Metamodel.pasys.SwarmDeploymentConf;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;
import PASYS_Metamodel.pasys.Volume;
import PASYS_Metamodel.pasys.VolumeAccessMode;
import PASYS_Metamodel.pasys.VolumeType;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatency;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkloadStreamData;
import PASYS_Metamodel.pasys.ZookeeperService;
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
			case PasysPackage.PHYSICAL_PROCESSING_NODE: return createPhysicalProcessingNode();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE: return createAWSVirtualProcessingNode();
			case PasysPackage.PROCESSING_NODE_CLUSTER: return createProcessingNodeCluster();
			case PasysPackage.ORCHESTRATION_CLUSTER: return createOrchestrationCluster();
			case PasysPackage.KUBERNETES_CLUSTER: return createKubernetesCluster();
			case PasysPackage.SWARM_CLUSTER: return createSwarmCluster();
			case PasysPackage.NOMAD_CLUSTER: return createNomadCluster();
			case PasysPackage.NETWORK: return createNetwork();
			case PasysPackage.AVRO_SERVICE: return createAVROService();
			case PasysPackage.ZOOKEEPER_SERVICE: return createZookeeperService();
			case PasysPackage.KAFKA_SERVICE: return createKafkaService();
			case PasysPackage.NODE_SCHEDULER: return createNodeScheduler();
			case PasysPackage.SPARK_SERVICE: return createSparkService();
			case PasysPackage.STORM_SERVICE: return createStormService();
			case PasysPackage.STORM_UI: return createStormUI();
			case PasysPackage.STORM_NIMBUS: return createStormNimbus();
			case PasysPackage.STORM_SUPERVISOR: return createStormSupervisor();
			case PasysPackage.NEO4_JSERVICE: return createNeo4JService();
			case PasysPackage.MEM_SQL_SERVICE: return createMemSQLService();
			case PasysPackage.CASSANDRA_SERVICE: return createCassandraService();
			case PasysPackage.DATA_CENTER: return createDataCenter();
			case PasysPackage.RACK: return createRack();
			case PasysPackage.PROMETHEUS_SERVICE: return createPrometheusService();
			case PasysPackage.EXPORTER_DATA: return createExporterData();
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
			case PasysPackage.NODE_DEPLOYMENT_CONF: return createNodeDeploymentConf();
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF: return createKubernetesDeploymentConf();
			case PasysPackage.SWARM_DEPLOYMENT_CONF: return createSwarmDeploymentConf();
			case PasysPackage.NOMAD_DEPLOYMENT_CONF: return createNomadDeploymentConf();
			case PasysPackage.VOLUME: return createVolume();
			case PasysPackage.PORT: return createPort();
			case PasysPackage.DEPLOYMENT_CONSTRAINTS: return createDeploymentConstraints();
			case PasysPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case PasysPackage.FILE_DESCRIPTOR: return createFileDescriptor();
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR: return createDeploymentFileDescriptor();
			case PasysPackage.ARTIFACT_DESCRIPTOR: return createArtifactDescriptor();
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
			case PasysPackage.VOLUME_ACCESS_MODE:
				return createVolumeAccessModeFromString(eDataType, initialValue);
			case PasysPackage.VOLUME_TYPE:
				return createVolumeTypeFromString(eDataType, initialValue);
			case PasysPackage.NOMAD_DRIVER:
				return createNomadDriverFromString(eDataType, initialValue);
			case PasysPackage.PORT_MODE:
				return createPortModeFromString(eDataType, initialValue);
			case PasysPackage.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case PasysPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case PasysPackage.DEPLOYABLE_COMPONENT_TYPE:
				return createDeployableComponentTypeFromString(eDataType, initialValue);
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
			case PasysPackage.VOLUME_ACCESS_MODE:
				return convertVolumeAccessModeToString(eDataType, instanceValue);
			case PasysPackage.VOLUME_TYPE:
				return convertVolumeTypeToString(eDataType, instanceValue);
			case PasysPackage.NOMAD_DRIVER:
				return convertNomadDriverToString(eDataType, instanceValue);
			case PasysPackage.PORT_MODE:
				return convertPortModeToString(eDataType, instanceValue);
			case PasysPackage.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case PasysPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case PasysPackage.DEPLOYABLE_COMPONENT_TYPE:
				return convertDeployableComponentTypeToString(eDataType, instanceValue);
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
	public PhysicalProcessingNode createPhysicalProcessingNode() {
		PhysicalProcessingNodeImpl physicalProcessingNode = new PhysicalProcessingNodeImpl();
		return physicalProcessingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public ProcessingNodeCluster createProcessingNodeCluster() {
		ProcessingNodeClusterImpl processingNodeCluster = new ProcessingNodeClusterImpl();
		return processingNodeCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrchestrationCluster createOrchestrationCluster() {
		OrchestrationClusterImpl orchestrationCluster = new OrchestrationClusterImpl();
		return orchestrationCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesCluster createKubernetesCluster() {
		KubernetesClusterImpl kubernetesCluster = new KubernetesClusterImpl();
		return kubernetesCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwarmCluster createSwarmCluster() {
		SwarmClusterImpl swarmCluster = new SwarmClusterImpl();
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NomadCluster createNomadCluster() {
		NomadClusterImpl nomadCluster = new NomadClusterImpl();
		return nomadCluster;
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
	public AVROService createAVROService() {
		AVROServiceImpl avroService = new AVROServiceImpl();
		return avroService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZookeeperService createZookeeperService() {
		ZookeeperServiceImpl zookeeperService = new ZookeeperServiceImpl();
		return zookeeperService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaService createKafkaService() {
		KafkaServiceImpl kafkaService = new KafkaServiceImpl();
		return kafkaService;
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
	public SparkService createSparkService() {
		SparkServiceImpl sparkService = new SparkServiceImpl();
		return sparkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormService createStormService() {
		StormServiceImpl stormService = new StormServiceImpl();
		return stormService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormUI createStormUI() {
		StormUIImpl stormUI = new StormUIImpl();
		return stormUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormNimbus createStormNimbus() {
		StormNimbusImpl stormNimbus = new StormNimbusImpl();
		return stormNimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormSupervisor createStormSupervisor() {
		StormSupervisorImpl stormSupervisor = new StormSupervisorImpl();
		return stormSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemSQLService createMemSQLService() {
		MemSQLServiceImpl memSQLService = new MemSQLServiceImpl();
		return memSQLService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CassandraService createCassandraService() {
		CassandraServiceImpl cassandraService = new CassandraServiceImpl();
		return cassandraService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neo4JService createNeo4JService() {
		Neo4JServiceImpl neo4JService = new Neo4JServiceImpl();
		return neo4JService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrometheusService createPrometheusService() {
		PrometheusServiceImpl prometheusService = new PrometheusServiceImpl();
		return prometheusService;
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
	@Override
	public NodeDeploymentConf createNodeDeploymentConf() {
		NodeDeploymentConfImpl nodeDeploymentConf = new NodeDeploymentConfImpl();
		return nodeDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesDeploymentConf createKubernetesDeploymentConf() {
		KubernetesDeploymentConfImpl kubernetesDeploymentConf = new KubernetesDeploymentConfImpl();
		return kubernetesDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwarmDeploymentConf createSwarmDeploymentConf() {
		SwarmDeploymentConfImpl swarmDeploymentConf = new SwarmDeploymentConfImpl();
		return swarmDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NomadDeploymentConf createNomadDeploymentConf() {
		NomadDeploymentConfImpl nomadDeploymentConf = new NomadDeploymentConfImpl();
		return nomadDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConstraints createDeploymentConstraints() {
		DeploymentConstraintsImpl deploymentConstraints = new DeploymentConstraintsImpl();
		return deploymentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
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
	public PortMode createPortModeFromString(EDataType eDataType, String initialValue) {
		PortMode result = PortMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue) {
		ServiceType result = ServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableComponentType createDeployableComponentTypeFromString(EDataType eDataType, String initialValue) {
		DeployableComponentType result = DeployableComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeployableComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeType createVolumeTypeFromString(EDataType eDataType, String initialValue) {
		VolumeType result = VolumeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NomadDriver createNomadDriverFromString(EDataType eDataType, String initialValue) {
		NomadDriver result = NomadDriver.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNomadDriverToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeAccessMode createVolumeAccessModeFromString(EDataType eDataType, String initialValue) {
		VolumeAccessMode result = VolumeAccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeAccessModeToString(EDataType eDataType, Object instanceValue) {
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
