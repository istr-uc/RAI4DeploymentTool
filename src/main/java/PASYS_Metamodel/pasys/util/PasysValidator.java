/**
 */
package PASYS_Metamodel.pasys.util;

import PASYS_Metamodel.pasys.AVROService;
import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraService;
import PASYS_Metamodel.pasys.CommunicationMeter;
import PASYS_Metamodel.pasys.CommunicationService;
import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DataCenter;
import PASYS_Metamodel.pasys.DeployableComponent;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.DeploymentConstraints;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.DistributionService;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.ExternalElementType;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaService;
import PASYS_Metamodel.pasys.KafkaWorkloadStreamData;
import PASYS_Metamodel.pasys.KubernetesPort;
import PASYS_Metamodel.pasys.KubernetesService;
import PASYS_Metamodel.pasys.LaunchException;
import PASYS_Metamodel.pasys.MemSQLService;
import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.Metric;
import PASYS_Metamodel.pasys.MonitoringService;
import PASYS_Metamodel.pasys.NamedElement;
import PASYS_Metamodel.pasys.Neo4JService;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeClusterDeploymentConf;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.OrchestrationService;
import PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceService;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.PlatformService;
import PASYS_Metamodel.pasys.PlatformServiceDeploymentConf;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.PortMode;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusService;
import PASYS_Metamodel.pasys.Protocol;
import PASYS_Metamodel.pasys.Rack;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.SchedulingService;
import PASYS_Metamodel.pasys.SerializationService;
import PASYS_Metamodel.pasys.SparkService;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SwarmPort;
import PASYS_Metamodel.pasys.SwarmService;
import PASYS_Metamodel.pasys.SystemAdapter;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.SystemElement;
import PASYS_Metamodel.pasys.SystemElementAdapter;
import PASYS_Metamodel.pasys.SystemExternalElement;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;
import PASYS_Metamodel.pasys.VirtualProcessingNode;
import PASYS_Metamodel.pasys.Volume;
import PASYS_Metamodel.pasys.VolumeAccessMode;
import PASYS_Metamodel.pasys.VolumeType;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatency;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkflowStreamData;
import PASYS_Metamodel.pasys.WorkloadStreamData;
import PASYS_Metamodel.pasys.ZookeeperService;

import java.util.Map;
import java.util.Properties;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage
 * @generated
 */
public class PasysValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PasysValidator INSTANCE = new PasysValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "PASYS_Metamodel.pasys";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PasysPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM:
				return validateComputationalSystem((ComputationalSystem)value, diagnostics, context);
			case PasysPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case PasysPackage.SYSTEM_ELEMENT:
				return validateSystemElement((SystemElement)value, diagnostics, context);
			case PasysPackage.SYSTEM_EXTERNAL_ELEMENT:
				return validateSystemExternalElement((SystemExternalElement)value, diagnostics, context);
			case PasysPackage.SYSTEM_ADAPTER:
				return validateSystemAdapter((SystemAdapter)value, diagnostics, context);
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER:
				return validateSystemElementAdapter((SystemElementAdapter)value, diagnostics, context);
			case PasysPackage.PLATFORM_RESOURCE:
				return validatePlatformResource((PlatformResource)value, diagnostics, context);
			case PasysPackage.PROCESSING_NODE:
				return validateProcessingNode((ProcessingNode)value, diagnostics, context);
			case PasysPackage.PHYSICAL_PROCESSING_NODE:
				return validatePhysicalProcessingNode((PhysicalProcessingNode)value, diagnostics, context);
			case PasysPackage.VIRTUAL_PROCESSING_NODE:
				return validateVirtualProcessingNode((VirtualProcessingNode)value, diagnostics, context);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE:
				return validateAWSVirtualProcessingNode((AWSVirtualProcessingNode)value, diagnostics, context);
			case PasysPackage.RESOURCE_CLUSTER:
				return validateResourceCluster((ResourceCluster)value, diagnostics, context);
			case PasysPackage.NODE_CLUSTER:
				return validateNodeCluster((NodeCluster)value, diagnostics, context);
			case PasysPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case PasysPackage.PLATFORM_SERVICE:
				return validatePlatformService((PlatformService)value, diagnostics, context);
			case PasysPackage.ORCHESTRATION_SERVICE:
				return validateOrchestrationService((OrchestrationService)value, diagnostics, context);
			case PasysPackage.KUBERNETES_SERVICE:
				return validateKubernetesService((KubernetesService)value, diagnostics, context);
			case PasysPackage.SWARM_SERVICE:
				return validateSwarmService((SwarmService)value, diagnostics, context);
			case PasysPackage.SERIALIZATION_SERVICE:
				return validateSerializationService((SerializationService)value, diagnostics, context);
			case PasysPackage.AVRO_SERVICE:
				return validateAVROService((AVROService)value, diagnostics, context);
			case PasysPackage.DISTRIBUTION_SERVICE:
				return validateDistributionService((DistributionService)value, diagnostics, context);
			case PasysPackage.ZOOKEEPER_SERVICE:
				return validateZookeeperService((ZookeeperService)value, diagnostics, context);
			case PasysPackage.COMMUNICATION_SERVICE:
				return validateCommunicationService((CommunicationService)value, diagnostics, context);
			case PasysPackage.KAFKA_SERVICE:
				return validateKafkaService((KafkaService)value, diagnostics, context);
			case PasysPackage.SCHEDULING_SERVICE:
				return validateSchedulingService((SchedulingService)value, diagnostics, context);
			case PasysPackage.NODE_SCHEDULER:
				return validateNodeScheduler((NodeScheduler)value, diagnostics, context);
			case PasysPackage.SPARK_SERVICE:
				return validateSparkService((SparkService)value, diagnostics, context);
			case PasysPackage.STORM_SERVICE:
				return validateStormService((StormService)value, diagnostics, context);
			case PasysPackage.PERSISTENCE_SERVICE:
				return validatePersistenceService((PersistenceService)value, diagnostics, context);
			case PasysPackage.MEM_SQL_SERVICE:
				return validateMemSQLService((MemSQLService)value, diagnostics, context);
			case PasysPackage.CASSANDRA_SERVICE:
				return validateCassandraService((CassandraService)value, diagnostics, context);
			case PasysPackage.DATA_CENTER:
				return validateDataCenter((DataCenter)value, diagnostics, context);
			case PasysPackage.RACK:
				return validateRack((Rack)value, diagnostics, context);
			case PasysPackage.NEO4_JSERVICE:
				return validateNeo4JService((Neo4JService)value, diagnostics, context);
			case PasysPackage.MONITORING_SERVICE:
				return validateMonitoringService((MonitoringService)value, diagnostics, context);
			case PasysPackage.PROMETHEUS_SERVICE:
				return validatePrometheusService((PrometheusService)value, diagnostics, context);
			case PasysPackage.EXPORTER_DATA:
				return validateExporterData((ExporterData)value, diagnostics, context);
			case PasysPackage.STREAM_DATA:
				return validateStreamData((StreamData)value, diagnostics, context);
			case PasysPackage.STREAM_DATA_PARTITION:
				return validateStreamDataPartition((StreamDataPartition)value, diagnostics, context);
			case PasysPackage.WORKFLOW_STREAM_DATA:
				return validateWorkflowStreamData((WorkflowStreamData)value, diagnostics, context);
			case PasysPackage.FLOW_STREAM_DATA:
				return validateFlowStreamData((FlowStreamData)value, diagnostics, context);
			case PasysPackage.KAFKA_FLOW_STREAM_DATA:
				return validateKafkaFlowStreamData((KafkaFlowStreamData)value, diagnostics, context);
			case PasysPackage.DERIVED_STREAM_DATA:
				return validateDerivedStreamData((DerivedStreamData)value, diagnostics, context);
			case PasysPackage.WORKLOAD_STREAM_DATA:
				return validateWorkloadStreamData((WorkloadStreamData)value, diagnostics, context);
			case PasysPackage.KAFKA_WORKLOAD_STREAM_DATA:
				return validateKafkaWorkloadStreamData((KafkaWorkloadStreamData)value, diagnostics, context);
			case PasysPackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case PasysPackage.SCHEDULABLE_SET:
				return validateSchedulableSet((SchedulableSet)value, diagnostics, context);
			case PasysPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case PasysPackage.TASK_EXECUTOR:
				return validateTaskExecutor((TaskExecutor)value, diagnostics, context);
			case PasysPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			case PasysPackage.PROCESSING_NODE_UTILIZATION:
				return validateProcessingNodeUtilization((ProcessingNodeUtilization)value, diagnostics, context);
			case PasysPackage.PROCESSING_NODE_MEMORY:
				return validateProcessingNodeMemory((ProcessingNodeMemory)value, diagnostics, context);
			case PasysPackage.NETWORK_UTILIZATION:
				return validateNetworkUtilization((NetworkUtilization)value, diagnostics, context);
			case PasysPackage.WORKFLOW_LATENCY:
				return validateWorkflowLatency((WorkflowLatency)value, diagnostics, context);
			case PasysPackage.TASK_PROCESSING_AMOUNT:
				return validateTaskProcessingAmount((TaskProcessingAmount)value, diagnostics, context);
			case PasysPackage.STREAM_DATA_RATE:
				return validateStreamDataRate((StreamDataRate)value, diagnostics, context);
			case PasysPackage.METER:
				return validateMeter((Meter)value, diagnostics, context);
			case PasysPackage.PROMETHEUS_METER:
				return validatePrometheusMeter((PrometheusMeter)value, diagnostics, context);
			case PasysPackage.NODE_HOSTED_METER:
				return validateNodeHostedMeter((NodeHostedMeter)value, diagnostics, context);
			case PasysPackage.NODE_RESOURCE_METER:
				return validateNodeResourceMeter((NodeResourceMeter)value, diagnostics, context);
			case PasysPackage.COMMUNICATION_METER:
				return validateCommunicationMeter((CommunicationMeter)value, diagnostics, context);
			case PasysPackage.STREAM_RATE_METER:
				return validateStreamRateMeter((StreamRateMeter)value, diagnostics, context);
			case PasysPackage.WORKFLOW_LATENCY_METER:
				return validateWorkflowLatencyMeter((WorkflowLatencyMeter)value, diagnostics, context);
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER:
				return validateTaskProcessingAmountMeter((TaskProcessingAmountMeter)value, diagnostics, context);
			case PasysPackage.DEPLOYABLE_COMPONENT:
				return validateDeployableComponent((DeployableComponent)value, diagnostics, context);
			case PasysPackage.DEPLOYMENT_CONFIGURATION:
				return validateDeploymentConfiguration((DeploymentConfiguration)value, diagnostics, context);
			case PasysPackage.PLATFORM_SERVICE_DEPLOYMENT_CONF:
				return validatePlatformServiceDeploymentConf((PlatformServiceDeploymentConf)value, diagnostics, context);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF:
				return validateOrchestrationServiceDeploymentConf((OrchestrationServiceDeploymentConf)value, diagnostics, context);
			case PasysPackage.NODE_CLUSTER_DEPLOYMENT_CONF:
				return validateNodeClusterDeploymentConf((NodeClusterDeploymentConf)value, diagnostics, context);
			case PasysPackage.VOLUME:
				return validateVolume((Volume)value, diagnostics, context);
			case PasysPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case PasysPackage.SWARM_PORT:
				return validateSwarmPort((SwarmPort)value, diagnostics, context);
			case PasysPackage.KUBERNETES_PORT:
				return validateKubernetesPort((KubernetesPort)value, diagnostics, context);
			case PasysPackage.DEPLOYMENT_CONSTRAINTS:
				return validateDeploymentConstraints((DeploymentConstraints)value, diagnostics, context);
			case PasysPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			case PasysPackage.CONFIGURATION_EXCEPTION:
				return validateConfigurationException((ConfigurationException)value, diagnostics, context);
			case PasysPackage.DEPLOYMENT_EXCEPTION:
				return validateDeploymentException((DeploymentException)value, diagnostics, context);
			case PasysPackage.LAUNCH_EXCEPTION:
				return validateLaunchException((LaunchException)value, diagnostics, context);
			case PasysPackage.STRING_TO_STRING_MAP:
				return validateStringToStringMap((Map.Entry<?, ?>)value, diagnostics, context);
			case PasysPackage.FILE_DESCRIPTOR:
				return validateFileDescriptor((FileDescriptor)value, diagnostics, context);
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR:
				return validateDeploymentFileDescriptor((DeploymentFileDescriptor)value, diagnostics, context);
			case PasysPackage.ARTIFACT_DESCRIPTOR:
				return validateArtifactDescriptor((ArtifactDescriptor)value, diagnostics, context);
			case PasysPackage.EXTERNAL_ELEMENT_TYPE:
				return validateExternalElementType((ExternalElementType)value, diagnostics, context);
			case PasysPackage.VOLUME_TYPE:
				return validateVolumeType((VolumeType)value, diagnostics, context);
			case PasysPackage.VOLUME_ACCESS_MODE:
				return validateVolumeAccessMode((VolumeAccessMode)value, diagnostics, context);
			case PasysPackage.PORT_MODE:
				return validatePortMode((PortMode)value, diagnostics, context);
			case PasysPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case PasysPackage.SYSTEM_COMPONENT_TYPE:
				return validateSystemComponentType((SystemComponentType)value, diagnostics, context);
			case PasysPackage.PROPERTIES:
				return validateProperties((Properties)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputationalSystem(ComputationalSystem computationalSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computationalSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemElement(SystemElement systemElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemExternalElement(SystemExternalElement systemExternalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemExternalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAdapter(SystemAdapter systemAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemElementAdapter(SystemElementAdapter systemElementAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemElementAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformResource(PlatformResource platformResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platformResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingNode(ProcessingNode processingNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalProcessingNode(PhysicalProcessingNode physicalProcessingNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalProcessingNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualProcessingNode(VirtualProcessingNode virtualProcessingNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualProcessingNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAWSVirtualProcessingNode(AWSVirtualProcessingNode awsVirtualProcessingNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(awsVirtualProcessingNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCluster(ResourceCluster resourceCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceCluster, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeCluster(NodeCluster nodeCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nodeCluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nodeCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateNodeCluster_allNodes(nodeCluster, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the allNodes constraint of '<em>Node Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE_CLUSTER__ALL_NODES__EEXPRESSION = "resources->forAll(r|r.oclIsKindOf(ProcessingNode))";

	/**
	 * Validates the allNodes constraint of '<em>Node Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeCluster_allNodes(NodeCluster nodeCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PasysPackage.Literals.NODE_CLUSTER,
				 nodeCluster,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allNodes",
				 NODE_CLUSTER__ALL_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(network, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformService(PlatformService platformService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(platformService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(platformService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(platformService, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hostOrOrchestrator constraint of '<em>Platform Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLATFORM_SERVICE__HOST_OR_ORCHESTRATOR__EEXPRESSION = "host<>null xor orchestrator<>null";

	/**
	 * Validates the hostOrOrchestrator constraint of '<em>Platform Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformService_hostOrOrchestrator(PlatformService platformService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PasysPackage.Literals.PLATFORM_SERVICE,
				 platformService,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hostOrOrchestrator",
				 PLATFORM_SERVICE__HOST_OR_ORCHESTRATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrchestrationService(OrchestrationService orchestrationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(orchestrationService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(orchestrationService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(orchestrationService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKubernetesService(KubernetesService kubernetesService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kubernetesService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kubernetesService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(kubernetesService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwarmService(SwarmService swarmService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(swarmService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(swarmService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(swarmService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializationService(SerializationService serializationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serializationService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serializationService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(serializationService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAVROService(AVROService avroService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(avroService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(avroService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(avroService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionService(DistributionService distributionService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(distributionService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(distributionService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(distributionService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZookeeperService(ZookeeperService zookeeperService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zookeeperService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zookeeperService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(zookeeperService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationService(CommunicationService communicationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(communicationService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKafkaService(KafkaService kafkaService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kafkaService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kafkaService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(kafkaService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingService(SchedulingService schedulingService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulingService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schedulingService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(schedulingService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeScheduler(NodeScheduler nodeScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nodeScheduler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nodeScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(nodeScheduler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSparkService(SparkService sparkService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sparkService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sparkService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(sparkService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormService(StormService stormService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stormService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stormService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(stormService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceService(PersistenceService persistenceService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persistenceService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persistenceService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(persistenceService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemSQLService(MemSQLService memSQLService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memSQLService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memSQLService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(memSQLService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCassandraService(CassandraService cassandraService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cassandraService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cassandraService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(cassandraService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataCenter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rack, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeo4JService(Neo4JService neo4JService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(neo4JService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neo4JService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(neo4JService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoringService(MonitoringService monitoringService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(monitoringService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(monitoringService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(monitoringService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrometheusService(PrometheusService prometheusService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prometheusService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prometheusService, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlatformService_hostOrOrchestrator(prometheusService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExporterData(ExporterData exporterData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exporterData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamData(StreamData streamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamDataPartition(StreamDataPartition streamDataPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamDataPartition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowStreamData(WorkflowStreamData workflowStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowStreamData(FlowStreamData flowStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKafkaFlowStreamData(KafkaFlowStreamData kafkaFlowStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kafkaFlowStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedStreamData(DerivedStreamData derivedStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkloadStreamData(WorkloadStreamData workloadStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workloadStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKafkaWorkloadStreamData(KafkaWorkloadStreamData kafkaWorkloadStreamData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kafkaWorkloadStreamData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulableSet(SchedulableSet schedulableSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulableSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskExecutor(TaskExecutor taskExecutor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskExecutor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingNodeUtilization(ProcessingNodeUtilization processingNodeUtilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingNodeUtilization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingNodeMemory(ProcessingNodeMemory processingNodeMemory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingNodeMemory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkUtilization(NetworkUtilization networkUtilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkUtilization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowLatency(WorkflowLatency workflowLatency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowLatency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskProcessingAmount(TaskProcessingAmount taskProcessingAmount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskProcessingAmount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamDataRate(StreamDataRate streamDataRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamDataRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeter(Meter meter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrometheusMeter(PrometheusMeter prometheusMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prometheusMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeHostedMeter(NodeHostedMeter nodeHostedMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeHostedMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeResourceMeter(NodeResourceMeter nodeResourceMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeResourceMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMeter(CommunicationMeter communicationMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamRateMeter(StreamRateMeter streamRateMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamRateMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowLatencyMeter(WorkflowLatencyMeter workflowLatencyMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowLatencyMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskProcessingAmountMeter(TaskProcessingAmountMeter taskProcessingAmountMeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskProcessingAmountMeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployableComponent(DeployableComponent deployableComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployableComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deploymentConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatformServiceDeploymentConf(PlatformServiceDeploymentConf platformServiceDeploymentConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(platformServiceDeploymentConf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrchestrationServiceDeploymentConf(OrchestrationServiceDeploymentConf orchestrationServiceDeploymentConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orchestrationServiceDeploymentConf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeClusterDeploymentConf(NodeClusterDeploymentConf nodeClusterDeploymentConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeClusterDeploymentConf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolume(Volume volume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volume, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwarmPort(SwarmPort swarmPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(swarmPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKubernetesPort(KubernetesPort kubernetesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kubernetesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentConstraints(DeploymentConstraints deploymentConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deploymentConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateException(Exception exception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)exception, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConfigurationException(ConfigurationException configurationException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDeploymentException(DeploymentException deploymentException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLaunchException(LaunchException launchException, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringToStringMap(Map.Entry<?, ?> stringToStringMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)stringToStringMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileDescriptor(FileDescriptor fileDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentFileDescriptor(DeploymentFileDescriptor deploymentFileDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deploymentFileDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactDescriptor(ArtifactDescriptor artifactDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalElementType(ExternalElementType externalElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType(VolumeType volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeAccessMode(VolumeAccessMode volumeAccessMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortMode(PortMode portMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemComponentType(SystemComponentType systemComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PasysValidator
