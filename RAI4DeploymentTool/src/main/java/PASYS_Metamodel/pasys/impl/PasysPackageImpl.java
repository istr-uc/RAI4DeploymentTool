/**
 */
package PASYS_Metamodel.pasys.impl;

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
import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.DeploymentConstraints;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.DistributionService;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaService;
import PASYS_Metamodel.pasys.KafkaWorkloadStreamData;
import PASYS_Metamodel.pasys.KubernetesCluster;
import PASYS_Metamodel.pasys.KubernetesPort;
import PASYS_Metamodel.pasys.LaunchException;
import PASYS_Metamodel.pasys.MemSQLService;
import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.Metric;
import PASYS_Metamodel.pasys.MonitoringService;
import PASYS_Metamodel.pasys.NamedElement;
import PASYS_Metamodel.pasys.Neo4JService;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeDeploymentConf;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.OrchestrationCluster;
import PASYS_Metamodel.pasys.OrchestratorDeploymentConf;
import PASYS_Metamodel.pasys.PasysFactory;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceService;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.PlatformService;
import PASYS_Metamodel.pasys.PlatformServiceDeploymentConf;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.PortMode;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusService;
import PASYS_Metamodel.pasys.Protocol;
import PASYS_Metamodel.pasys.Rack;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.SchedulingService;
import PASYS_Metamodel.pasys.SecurityService;
import PASYS_Metamodel.pasys.SerializationService;
import PASYS_Metamodel.pasys.SparkService;
import PASYS_Metamodel.pasys.StormNimbus;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.StormSupervisor;
import PASYS_Metamodel.pasys.StormUI;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SwarmCluster;
import PASYS_Metamodel.pasys.SwarmPort;
import PASYS_Metamodel.pasys.SystemElement;
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
import java.lang.Exception;

import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PasysPackageImpl extends EPackageImpl implements PasysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalProcessingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsVirtualProcessingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingNodeClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestrationClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kubernetesClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swarmClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avroServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zookeeperServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormNimbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormSupervisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memSQLServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cassandraServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neo4JServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prometheusServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamDataPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaFlowStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaWorkloadStreamDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulableSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExecutorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingNodeUtilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingNodeMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkUtilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLatencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskProcessingAmountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamDataRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeHostedMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeResourceMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamRateMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLatencyMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskProcessingAmountMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformServiceDeploymentConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestratorDeploymentConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDeploymentConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentFileDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exporterDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swarmPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kubernetesPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prometheusMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deployableComponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum volumeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum volumeAccessModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertiesEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PASYS_Metamodel.pasys.PasysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PasysPackageImpl() {
		super(eNS_URI, PasysFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PasysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PasysPackage init() {
		if (isInited) return (PasysPackage)EPackage.Registry.INSTANCE.getEPackage(PasysPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPasysPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PasysPackageImpl thePasysPackage = registeredPasysPackage instanceof PasysPackageImpl ? (PasysPackageImpl)registeredPasysPackage : new PasysPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePasysPackage.createPackageContents();

		// Initialize created meta-data
		thePasysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePasysPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PasysPackage.eNS_URI, thePasysPackage);
		return thePasysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputationalSystem() {
		return computationalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputationalSystem_Name() {
		return (EAttribute)computationalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputationalSystem_Date() {
		return (EAttribute)computationalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputationalSystem_Authors() {
		return (EAttribute)computationalSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputationalSystem_TargetPlatformName() {
		return (EAttribute)computationalSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputationalSystem_Doc() {
		return (EAttribute)computationalSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputationalSystem_OwnedElements() {
		return (EReference)computationalSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputationalSystem_AuthenticationFiles() {
		return (EReference)computationalSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComputationalSystem__DeployAndLaunch() {
		return computationalSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComputationalSystem__CleanDeployment() {
		return computationalSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Id() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemElement() {
		return systemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemElement_Owner() {
		return (EReference)systemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformResource() {
		return platformResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingNode() {
		return processingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_ConcurrencyLevel() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_ConnectedTo() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_LaunchingScripts() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_ConfigFiles() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_OwnedMeters() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_Ip() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_Os() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_UserName() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_MemorySize() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_SpeedFactor() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_ConfigData() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_CodeFiles() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__PrepareForDeployment() {
		return processingNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__DeployAndLaunch() {
		return processingNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__BringBackConfiguration() {
		return processingNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__BringBackDeployment() {
		return processingNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__AbortLaunching() {
		return processingNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor() {
		return processingNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessingNode__AddConfigFile__DeploymentFileDescriptor() {
		return processingNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalProcessingNode() {
		return physicalProcessingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualProcessingNode() {
		return virtualProcessingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualProcessingNode_ExternalIP() {
		return (EAttribute)virtualProcessingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAWSVirtualProcessingNode() {
		return awsVirtualProcessingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_Vpc() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_SubNet() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_KeyPair() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_SecurityGroup() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_AMI() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWSVirtualProcessingNode_InstanceType() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingResourceCluster() {
		return processingResourceClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingNodeCluster() {
		return processingNodeClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNodeCluster_Nodes() {
		return (EReference)processingNodeClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrchestrationCluster() {
		return orchestrationClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKubernetesCluster() {
		return kubernetesClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKubernetesCluster_ApiVersion() {
		return (EAttribute)kubernetesClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwarmCluster() {
		return swarmClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Bandwith() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformService() {
		return platformServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformService_Host() {
		return (EReference)platformServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSerializationService() {
		return serializationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAVROService() {
		return avroServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistributionService() {
		return distributionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZookeeperService() {
		return zookeeperServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_ServerId() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_TickTime() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_LeaderServers() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_InitLimit() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_SyncLimit() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_ClientPort() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_PeerPort() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperService_LeaderPort() {
		return (EAttribute)zookeeperServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationService() {
		return communicationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKafkaService() {
		return kafkaServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_CommId() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_AutoCreateTopicEnable() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_DeleteTopicEnable() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKafkaService_ZookeeperConnect() {
		return (EReference)kafkaServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_ZookeeperConnectionTimeout() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_NumPartitions() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_NumRecoveryThreadsPerDataDir() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_LogFlushIntervalMessages() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_LogFlushInterval() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_Listeners() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_AdvertisedListeners() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_NumNetworkThreads() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_NumIOThreads() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_SocketSendBufferBytes() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_SocketReceiveBufferBytes() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_SocketRequestMaxBytes() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaService_ClientPort() {
		return (EAttribute)kafkaServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingService() {
		return schedulingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulingService_Workflows() {
		return (EReference)schedulingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityService() {
		return securityServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeScheduler() {
		return nodeSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSparkService() {
		return sparkServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSparkService_Load() {
		return (EReference)sparkServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_DriverCores() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_DriverMaxResultSize() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_DriverMemory() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_LocalDir() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSparkService_Master() {
		return (EReference)sparkServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_WindowSize() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_ExecutorMemory() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_ExtraListener() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_LogConf() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_SubmitDeployMode() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_LogCallerContext() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkService_DriverSuperviser() {
		return (EAttribute)sparkServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStormService() {
		return stormServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormService_ZookeeperConnect() {
		return (EReference)stormServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormService_LocalDir() {
		return (EAttribute)stormServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormService_Nimbus() {
		return (EReference)stormServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormService_Supervisor() {
		return (EReference)stormServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormService_Ui() {
		return (EReference)stormServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStormUI() {
		return stormUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormUI_UiPort() {
		return (EAttribute)stormUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormUI_Owner() {
		return (EReference)stormUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormUI_Host() {
		return (EReference)stormUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStormNimbus() {
		return stormNimbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormNimbus_Owner() {
		return (EReference)stormNimbusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormNimbus_Host() {
		return (EReference)stormNimbusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStormSupervisor() {
		return stormSupervisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormSupervisor_SupervisorSlotPorts() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormSupervisor_Owner() {
		return (EReference)stormSupervisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormSupervisor_Host() {
		return (EReference)stormSupervisorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceService() {
		return persistenceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceService_Logging() {
		return (EAttribute)persistenceServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceService_Passwd() {
		return (EAttribute)persistenceServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceService_Port() {
		return (EAttribute)persistenceServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemSQLService() {
		return memSQLServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCassandraService() {
		return cassandraServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_NumTokens() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraService_Seeds() {
		return (EReference)cassandraServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_SeedProviderClass() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_EndpointSnitch() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_DataFileDir() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_StoragePort() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_AutoBootstrap() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraService_CqlSchemas() {
		return (EReference)cassandraServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraService_DataCenters() {
		return (EReference)cassandraServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_SslStoragePort() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraService_RpcPort() {
		return (EAttribute)cassandraServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCenter_Racks() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRack_Nodes() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeo4JService() {
		return neo4JServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringService() {
		return monitoringServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringService_MonitorizedMeters() {
		return (EReference)monitoringServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrometheusService() {
		return prometheusServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrometheusService_ExportersData() {
		return (EReference)prometheusServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamData() {
		return streamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_Retention_ms() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_Retention_bytes() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_CleanupPolicy() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_NumPartitions() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_NumReplication() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamData_OwnedMeters() {
		return (EReference)streamDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamData_AssignedPartition() {
		return (EReference)streamDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_MessageSize() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamData_SchemaFile() {
		return (EAttribute)streamDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamDataPartition() {
		return streamDataPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamDataPartition_Key() {
		return (EAttribute)streamDataPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamDataPartition_Host() {
		return (EReference)streamDataPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowStreamData() {
		return workflowStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowStreamData_IsSingleUse() {
		return (EAttribute)workflowStreamDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowStreamData_Owner() {
		return (EReference)workflowStreamDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowStreamData() {
		return flowStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowStreamData_Source() {
		return (EReference)flowStreamDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowStreamData_Predecessor() {
		return (EReference)flowStreamDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowStreamData_Holder() {
		return (EReference)flowStreamDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlowStreamData_IsImplemented() {
		return (EAttribute)flowStreamDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKafkaFlowStreamData() {
		return kafkaFlowStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedStreamData() {
		return derivedStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedStreamData_Pattern() {
		return (EAttribute)derivedStreamDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedStreamData_Inputs() {
		return (EReference)derivedStreamDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkloadStreamData() {
		return workloadStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkloadStreamData_Holder() {
		return (EReference)workloadStreamDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKafkaWorkloadStreamData() {
		return kafkaWorkloadStreamDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_OwnedStreamData() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_OwnedTasks() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_RootTask() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Scheduler() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_OwnedMeters() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_OwnedTaskExecutors() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulableSet() {
		return schedulableSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulableSet_Workflows() {
		return (EReference)schedulableSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_ImplementingClassName() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_ReturnedStreamData() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_TriggerStreamData() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Owner() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_InputStreamData() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskExecutor() {
		return taskExecutorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskExecutor_ExecutedTasks() {
		return (EReference)taskExecutorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskExecutor_OwnedMeters() {
		return (EReference)taskExecutorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskExecutor_Owner() {
		return (EReference)taskExecutorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingNodeUtilization() {
		return processingNodeUtilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNodeUtilization_Target() {
		return (EReference)processingNodeUtilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNodeUtilization_Meter() {
		return (EReference)processingNodeUtilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingNodeMemory() {
		return processingNodeMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNodeMemory_Target() {
		return (EReference)processingNodeMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNodeMemory_Meter() {
		return (EReference)processingNodeMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkUtilization() {
		return networkUtilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkUtilization_Target() {
		return (EReference)networkUtilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkUtilization_Meter() {
		return (EReference)networkUtilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowLatency() {
		return workflowLatencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowLatency_Target() {
		return (EReference)workflowLatencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowLatency_Meter() {
		return (EReference)workflowLatencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskProcessingAmount() {
		return taskProcessingAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskProcessingAmount_Target() {
		return (EReference)taskProcessingAmountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskProcessingAmount_Meter() {
		return (EReference)taskProcessingAmountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskProcessingAmount_HistogramBuckectNum() {
		return (EAttribute)taskProcessingAmountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskProcessingAmount_ExpectedMaxTPA() {
		return (EAttribute)taskProcessingAmountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskProcessingAmount_ExpectedMinTPA() {
		return (EAttribute)taskProcessingAmountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskProcessingAmount_LinearBucketDistribution() {
		return (EAttribute)taskProcessingAmountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamDataRate() {
		return streamDataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamDataRate_Target() {
		return (EReference)streamDataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamDataRate_Meter() {
		return (EReference)streamDataRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeter() {
		return meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeter_MonitoringServer() {
		return (EReference)meterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeHostedMeter() {
		return nodeHostedMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeHostedMeter_Owner() {
		return (EReference)nodeHostedMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeResourceMeter() {
		return nodeResourceMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeResourceMeter_UMetric() {
		return (EReference)nodeResourceMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeResourceMeter_MMetric() {
		return (EReference)nodeResourceMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationMeter() {
		return communicationMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationMeter_Metric() {
		return (EReference)communicationMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamRateMeter() {
		return streamRateMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamRateMeter_Owner() {
		return (EReference)streamRateMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamRateMeter_Metric() {
		return (EReference)streamRateMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowLatencyMeter() {
		return workflowLatencyMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowLatencyMeter_Owner() {
		return (EReference)workflowLatencyMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowLatencyMeter_Metric() {
		return (EReference)workflowLatencyMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskProcessingAmountMeter() {
		return taskProcessingAmountMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskProcessingAmountMeter_Owner() {
		return (EReference)taskProcessingAmountMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskProcessingAmountMeter_Metric() {
		return (EReference)taskProcessingAmountMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployableComponent() {
		return deployableComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployableComponent_DeploymentConfig() {
		return (EReference)deployableComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeployableComponent__ConfigureDeployment() {
		return deployableComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentConfiguration() {
		return deploymentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlatformServiceDeploymentConf() {
		return platformServiceDeploymentConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrchestratorDeploymentConf() {
		return orchestratorDeploymentConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_Image() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_ImageTag() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_ImagePullPolicy() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_Replicas() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_Command() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_Args() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_RestartPolicy() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrchestratorDeploymentConf_Env() {
		return (EAttribute)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrchestratorDeploymentConf_Volumes() {
		return (EReference)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrchestratorDeploymentConf_Ports() {
		return (EReference)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrchestratorDeploymentConf_Constraints() {
		return (EReference)orchestratorDeploymentConfEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeDeploymentConf() {
		return nodeDeploymentConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_Arguments() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_ArtifactLocator() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_ArtifactName() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_ConfigFolderPath() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_ScriptFolderPath() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_DataFolderPath() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_LogFolderPath() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_CodeFolderPath() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodeDeploymentConf_IsRunning() {
		return (EAttribute)nodeDeploymentConfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileDescriptor() {
		return fileDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileDescriptor_FilePath() {
		return (EAttribute)fileDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileDescriptor_FileName() {
		return (EAttribute)fileDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifactDescriptor() {
		return artifactDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifactDescriptor_LocalPath() {
		return (EAttribute)artifactDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentFileDescriptor() {
		return deploymentFileDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentFileDescriptor_FileContent() {
		return (EAttribute)deploymentFileDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentFileDescriptor_ElementType() {
		return (EAttribute)deploymentFileDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeploymentFileDescriptor_Owner() {
		return (EReference)deploymentFileDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationException() {
		return configurationExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentException() {
		return deploymentExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaunchException() {
		return launchExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExporterData() {
		return exporterDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExporterData_Name() {
		return (EAttribute)exporterDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExporterData_Artifact() {
		return (EAttribute)exporterDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Target() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Published() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwarmPort() {
		return swarmPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwarmPort_Protocol() {
		return (EAttribute)swarmPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwarmPort_Mode() {
		return (EAttribute)swarmPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKubernetesPort() {
		return kubernetesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKubernetesPort_Name() {
		return (EAttribute)kubernetesPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKubernetesPort_Internal() {
		return (EAttribute)kubernetesPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentConstraints() {
		return deploymentConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentConstraints_Labels() {
		return (EAttribute)deploymentConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentConstraints_Resources() {
		return (EAttribute)deploymentConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Source() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Target() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Type() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_AccessMode() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrometheusMeter() {
		return prometheusMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrometheusMeter_MonitoringPort() {
		return (EAttribute)prometheusMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrometheusMeter_MonitoringTime() {
		return (EAttribute)prometheusMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrometheusMeter__GetPrometheusServerConfiguration() {
		return prometheusMeterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortMode() {
		return portModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeployableComponentType() {
		return deployableComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVolumeType() {
		return volumeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVolumeAccessMode() {
		return volumeAccessModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProperties() {
		return propertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PasysFactory getPasysFactory() {
		return (PasysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		computationalSystemEClass = createEClass(COMPUTATIONAL_SYSTEM);
		createEAttribute(computationalSystemEClass, COMPUTATIONAL_SYSTEM__NAME);
		createEAttribute(computationalSystemEClass, COMPUTATIONAL_SYSTEM__DATE);
		createEAttribute(computationalSystemEClass, COMPUTATIONAL_SYSTEM__AUTHORS);
		createEAttribute(computationalSystemEClass, COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME);
		createEAttribute(computationalSystemEClass, COMPUTATIONAL_SYSTEM__DOC);
		createEReference(computationalSystemEClass, COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS);
		createEReference(computationalSystemEClass, COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES);
		createEOperation(computationalSystemEClass, COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH);
		createEOperation(computationalSystemEClass, COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);

		systemElementEClass = createEClass(SYSTEM_ELEMENT);
		createEReference(systemElementEClass, SYSTEM_ELEMENT__OWNER);

		platformResourceEClass = createEClass(PLATFORM_RESOURCE);

		processingNodeEClass = createEClass(PROCESSING_NODE);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__IP);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__OS);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__CONCURRENCY_LEVEL);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__MEMORY_SIZE);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__SPEED_FACTOR);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__CONFIG_DATA);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__USER_NAME);
		createEReference(processingNodeEClass, PROCESSING_NODE__CONNECTED_TO);
		createEReference(processingNodeEClass, PROCESSING_NODE__LAUNCHING_SCRIPTS);
		createEReference(processingNodeEClass, PROCESSING_NODE__CONFIG_FILES);
		createEReference(processingNodeEClass, PROCESSING_NODE__CODE_FILES);
		createEReference(processingNodeEClass, PROCESSING_NODE__OWNED_METERS);
		createEOperation(processingNodeEClass, PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT);
		createEOperation(processingNodeEClass, PROCESSING_NODE___DEPLOY_AND_LAUNCH);
		createEOperation(processingNodeEClass, PROCESSING_NODE___BRING_BACK_CONFIGURATION);
		createEOperation(processingNodeEClass, PROCESSING_NODE___BRING_BACK_DEPLOYMENT);
		createEOperation(processingNodeEClass, PROCESSING_NODE___ABORT_LAUNCHING);
		createEOperation(processingNodeEClass, PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR);
		createEOperation(processingNodeEClass, PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR);

		physicalProcessingNodeEClass = createEClass(PHYSICAL_PROCESSING_NODE);

		virtualProcessingNodeEClass = createEClass(VIRTUAL_PROCESSING_NODE);
		createEAttribute(virtualProcessingNodeEClass, VIRTUAL_PROCESSING_NODE__EXTERNAL_IP);

		awsVirtualProcessingNodeEClass = createEClass(AWS_VIRTUAL_PROCESSING_NODE);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__VPC);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__SUB_NET);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__AMI);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE);

		processingResourceClusterEClass = createEClass(PROCESSING_RESOURCE_CLUSTER);

		processingNodeClusterEClass = createEClass(PROCESSING_NODE_CLUSTER);
		createEReference(processingNodeClusterEClass, PROCESSING_NODE_CLUSTER__NODES);

		orchestrationClusterEClass = createEClass(ORCHESTRATION_CLUSTER);

		kubernetesClusterEClass = createEClass(KUBERNETES_CLUSTER);
		createEAttribute(kubernetesClusterEClass, KUBERNETES_CLUSTER__API_VERSION);

		swarmClusterEClass = createEClass(SWARM_CLUSTER);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__BANDWITH);

		platformServiceEClass = createEClass(PLATFORM_SERVICE);
		createEReference(platformServiceEClass, PLATFORM_SERVICE__HOST);

		serializationServiceEClass = createEClass(SERIALIZATION_SERVICE);

		distributionServiceEClass = createEClass(DISTRIBUTION_SERVICE);

		communicationServiceEClass = createEClass(COMMUNICATION_SERVICE);

		schedulingServiceEClass = createEClass(SCHEDULING_SERVICE);
		createEReference(schedulingServiceEClass, SCHEDULING_SERVICE__WORKFLOWS);

		securityServiceEClass = createEClass(SECURITY_SERVICE);

		persistenceServiceEClass = createEClass(PERSISTENCE_SERVICE);
		createEAttribute(persistenceServiceEClass, PERSISTENCE_SERVICE__LOGGING);
		createEAttribute(persistenceServiceEClass, PERSISTENCE_SERVICE__PASSWD);
		createEAttribute(persistenceServiceEClass, PERSISTENCE_SERVICE__PORT);

		monitoringServiceEClass = createEClass(MONITORING_SERVICE);
		createEReference(monitoringServiceEClass, MONITORING_SERVICE__MONITORIZED_METERS);

		avroServiceEClass = createEClass(AVRO_SERVICE);

		zookeeperServiceEClass = createEClass(ZOOKEEPER_SERVICE);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__SERVER_ID);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__CLIENT_PORT);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__TICK_TIME);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__LEADER_SERVERS);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__PEER_PORT);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__LEADER_PORT);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__INIT_LIMIT);
		createEAttribute(zookeeperServiceEClass, ZOOKEEPER_SERVICE__SYNC_LIMIT);

		kafkaServiceEClass = createEClass(KAFKA_SERVICE);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__COMM_ID);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__CLIENT_PORT);
		createEReference(kafkaServiceEClass, KAFKA_SERVICE__ZOOKEEPER_CONNECT);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__LISTENERS);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__ADVERTISED_LISTENERS);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__DELETE_TOPIC_ENABLE);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__NUM_PARTITIONS);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__LOG_FLUSH_INTERVAL);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__NUM_NETWORK_THREADS);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__NUM_IO_THREADS);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES);
		createEAttribute(kafkaServiceEClass, KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES);

		nodeSchedulerEClass = createEClass(NODE_SCHEDULER);

		sparkServiceEClass = createEClass(SPARK_SERVICE);
		createEReference(sparkServiceEClass, SPARK_SERVICE__LOAD);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__DRIVER_CORES);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__DRIVER_MEMORY);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__LOCAL_DIR);
		createEReference(sparkServiceEClass, SPARK_SERVICE__MASTER);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__WINDOW_SIZE);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__EXECUTOR_MEMORY);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__EXTRA_LISTENER);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__LOG_CONF);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__SUBMIT_DEPLOY_MODE);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__LOG_CALLER_CONTEXT);
		createEAttribute(sparkServiceEClass, SPARK_SERVICE__DRIVER_SUPERVISER);

		stormServiceEClass = createEClass(STORM_SERVICE);
		createEReference(stormServiceEClass, STORM_SERVICE__ZOOKEEPER_CONNECT);
		createEAttribute(stormServiceEClass, STORM_SERVICE__LOCAL_DIR);
		createEReference(stormServiceEClass, STORM_SERVICE__NIMBUS);
		createEReference(stormServiceEClass, STORM_SERVICE__SUPERVISOR);
		createEReference(stormServiceEClass, STORM_SERVICE__UI);

		stormUIEClass = createEClass(STORM_UI);
		createEAttribute(stormUIEClass, STORM_UI__UI_PORT);
		createEReference(stormUIEClass, STORM_UI__OWNER);
		createEReference(stormUIEClass, STORM_UI__HOST);

		stormNimbusEClass = createEClass(STORM_NIMBUS);
		createEReference(stormNimbusEClass, STORM_NIMBUS__OWNER);
		createEReference(stormNimbusEClass, STORM_NIMBUS__HOST);

		stormSupervisorEClass = createEClass(STORM_SUPERVISOR);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS);
		createEReference(stormSupervisorEClass, STORM_SUPERVISOR__OWNER);
		createEReference(stormSupervisorEClass, STORM_SUPERVISOR__HOST);

		neo4JServiceEClass = createEClass(NEO4_JSERVICE);

		memSQLServiceEClass = createEClass(MEM_SQL_SERVICE);

		cassandraServiceEClass = createEClass(CASSANDRA_SERVICE);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__NUM_TOKENS);
		createEReference(cassandraServiceEClass, CASSANDRA_SERVICE__SEEDS);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__SEED_PROVIDER_CLASS);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__ENDPOINT_SNITCH);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__DATA_FILE_DIR);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__STORAGE_PORT);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__AUTO_BOOTSTRAP);
		createEReference(cassandraServiceEClass, CASSANDRA_SERVICE__CQL_SCHEMAS);
		createEReference(cassandraServiceEClass, CASSANDRA_SERVICE__DATA_CENTERS);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__SSL_STORAGE_PORT);
		createEAttribute(cassandraServiceEClass, CASSANDRA_SERVICE__RPC_PORT);

		dataCenterEClass = createEClass(DATA_CENTER);
		createEReference(dataCenterEClass, DATA_CENTER__RACKS);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__NODES);

		prometheusServiceEClass = createEClass(PROMETHEUS_SERVICE);
		createEReference(prometheusServiceEClass, PROMETHEUS_SERVICE__EXPORTERS_DATA);

		exporterDataEClass = createEClass(EXPORTER_DATA);
		createEAttribute(exporterDataEClass, EXPORTER_DATA__NAME);
		createEAttribute(exporterDataEClass, EXPORTER_DATA__ARTIFACT);

		streamDataEClass = createEClass(STREAM_DATA);
		createEAttribute(streamDataEClass, STREAM_DATA__RETENTION_MS);
		createEAttribute(streamDataEClass, STREAM_DATA__RETENTION_BYTES);
		createEAttribute(streamDataEClass, STREAM_DATA__CLEANUP_POLICY);
		createEAttribute(streamDataEClass, STREAM_DATA__NUM_PARTITIONS);
		createEAttribute(streamDataEClass, STREAM_DATA__NUM_REPLICATION);
		createEReference(streamDataEClass, STREAM_DATA__OWNED_METERS);
		createEReference(streamDataEClass, STREAM_DATA__ASSIGNED_PARTITION);
		createEAttribute(streamDataEClass, STREAM_DATA__MESSAGE_SIZE);
		createEAttribute(streamDataEClass, STREAM_DATA__SCHEMA_FILE);

		streamDataPartitionEClass = createEClass(STREAM_DATA_PARTITION);
		createEAttribute(streamDataPartitionEClass, STREAM_DATA_PARTITION__KEY);
		createEReference(streamDataPartitionEClass, STREAM_DATA_PARTITION__HOST);

		workflowStreamDataEClass = createEClass(WORKFLOW_STREAM_DATA);
		createEAttribute(workflowStreamDataEClass, WORKFLOW_STREAM_DATA__IS_SINGLE_USE);
		createEReference(workflowStreamDataEClass, WORKFLOW_STREAM_DATA__OWNER);

		flowStreamDataEClass = createEClass(FLOW_STREAM_DATA);
		createEReference(flowStreamDataEClass, FLOW_STREAM_DATA__SOURCE);
		createEReference(flowStreamDataEClass, FLOW_STREAM_DATA__PREDECESSOR);
		createEReference(flowStreamDataEClass, FLOW_STREAM_DATA__HOLDER);
		createEAttribute(flowStreamDataEClass, FLOW_STREAM_DATA__IS_IMPLEMENTED);

		kafkaFlowStreamDataEClass = createEClass(KAFKA_FLOW_STREAM_DATA);

		derivedStreamDataEClass = createEClass(DERIVED_STREAM_DATA);
		createEAttribute(derivedStreamDataEClass, DERIVED_STREAM_DATA__PATTERN);
		createEReference(derivedStreamDataEClass, DERIVED_STREAM_DATA__INPUTS);

		workloadStreamDataEClass = createEClass(WORKLOAD_STREAM_DATA);
		createEReference(workloadStreamDataEClass, WORKLOAD_STREAM_DATA__HOLDER);

		kafkaWorkloadStreamDataEClass = createEClass(KAFKA_WORKLOAD_STREAM_DATA);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__OWNED_STREAM_DATA);
		createEReference(workflowEClass, WORKFLOW__OWNED_TASKS);
		createEReference(workflowEClass, WORKFLOW__ROOT_TASK);
		createEReference(workflowEClass, WORKFLOW__OWNED_TASK_EXECUTORS);
		createEReference(workflowEClass, WORKFLOW__SCHEDULER);
		createEReference(workflowEClass, WORKFLOW__OWNED_METERS);

		schedulableSetEClass = createEClass(SCHEDULABLE_SET);
		createEReference(schedulableSetEClass, SCHEDULABLE_SET__WORKFLOWS);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__OWNER);
		createEAttribute(taskEClass, TASK__IMPLEMENTING_CLASS_NAME);
		createEReference(taskEClass, TASK__RETURNED_STREAM_DATA);
		createEReference(taskEClass, TASK__TRIGGER_STREAM_DATA);
		createEReference(taskEClass, TASK__INPUT_STREAM_DATA);

		taskExecutorEClass = createEClass(TASK_EXECUTOR);
		createEReference(taskExecutorEClass, TASK_EXECUTOR__OWNER);
		createEReference(taskExecutorEClass, TASK_EXECUTOR__EXECUTED_TASKS);
		createEReference(taskExecutorEClass, TASK_EXECUTOR__OWNED_METERS);

		metricEClass = createEClass(METRIC);

		processingNodeUtilizationEClass = createEClass(PROCESSING_NODE_UTILIZATION);
		createEReference(processingNodeUtilizationEClass, PROCESSING_NODE_UTILIZATION__TARGET);
		createEReference(processingNodeUtilizationEClass, PROCESSING_NODE_UTILIZATION__METER);

		processingNodeMemoryEClass = createEClass(PROCESSING_NODE_MEMORY);
		createEReference(processingNodeMemoryEClass, PROCESSING_NODE_MEMORY__TARGET);
		createEReference(processingNodeMemoryEClass, PROCESSING_NODE_MEMORY__METER);

		networkUtilizationEClass = createEClass(NETWORK_UTILIZATION);
		createEReference(networkUtilizationEClass, NETWORK_UTILIZATION__TARGET);
		createEReference(networkUtilizationEClass, NETWORK_UTILIZATION__METER);

		workflowLatencyEClass = createEClass(WORKFLOW_LATENCY);
		createEReference(workflowLatencyEClass, WORKFLOW_LATENCY__TARGET);
		createEReference(workflowLatencyEClass, WORKFLOW_LATENCY__METER);

		taskProcessingAmountEClass = createEClass(TASK_PROCESSING_AMOUNT);
		createEReference(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__TARGET);
		createEReference(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__METER);
		createEAttribute(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM);
		createEAttribute(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA);
		createEAttribute(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA);
		createEAttribute(taskProcessingAmountEClass, TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION);

		streamDataRateEClass = createEClass(STREAM_DATA_RATE);
		createEReference(streamDataRateEClass, STREAM_DATA_RATE__TARGET);
		createEReference(streamDataRateEClass, STREAM_DATA_RATE__METER);

		meterEClass = createEClass(METER);
		createEReference(meterEClass, METER__MONITORING_SERVER);

		prometheusMeterEClass = createEClass(PROMETHEUS_METER);
		createEAttribute(prometheusMeterEClass, PROMETHEUS_METER__MONITORING_PORT);
		createEAttribute(prometheusMeterEClass, PROMETHEUS_METER__MONITORING_TIME);
		createEOperation(prometheusMeterEClass, PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION);

		nodeHostedMeterEClass = createEClass(NODE_HOSTED_METER);
		createEReference(nodeHostedMeterEClass, NODE_HOSTED_METER__OWNER);

		nodeResourceMeterEClass = createEClass(NODE_RESOURCE_METER);
		createEReference(nodeResourceMeterEClass, NODE_RESOURCE_METER__UMETRIC);
		createEReference(nodeResourceMeterEClass, NODE_RESOURCE_METER__MMETRIC);

		communicationMeterEClass = createEClass(COMMUNICATION_METER);
		createEReference(communicationMeterEClass, COMMUNICATION_METER__METRIC);

		streamRateMeterEClass = createEClass(STREAM_RATE_METER);
		createEReference(streamRateMeterEClass, STREAM_RATE_METER__OWNER);
		createEReference(streamRateMeterEClass, STREAM_RATE_METER__METRIC);

		workflowLatencyMeterEClass = createEClass(WORKFLOW_LATENCY_METER);
		createEReference(workflowLatencyMeterEClass, WORKFLOW_LATENCY_METER__OWNER);
		createEReference(workflowLatencyMeterEClass, WORKFLOW_LATENCY_METER__METRIC);

		taskProcessingAmountMeterEClass = createEClass(TASK_PROCESSING_AMOUNT_METER);
		createEReference(taskProcessingAmountMeterEClass, TASK_PROCESSING_AMOUNT_METER__OWNER);
		createEReference(taskProcessingAmountMeterEClass, TASK_PROCESSING_AMOUNT_METER__METRIC);

		deployableComponentEClass = createEClass(DEPLOYABLE_COMPONENT);
		createEReference(deployableComponentEClass, DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG);
		createEOperation(deployableComponentEClass, DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT);

		deploymentConfigurationEClass = createEClass(DEPLOYMENT_CONFIGURATION);

		platformServiceDeploymentConfEClass = createEClass(PLATFORM_SERVICE_DEPLOYMENT_CONF);

		orchestratorDeploymentConfEClass = createEClass(ORCHESTRATOR_DEPLOYMENT_CONF);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__ARGS);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY);
		createEAttribute(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__ENV);
		createEReference(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES);
		createEReference(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__PORTS);
		createEReference(orchestratorDeploymentConfEClass, ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS);

		nodeDeploymentConfEClass = createEClass(NODE_DEPLOYMENT_CONF);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__ARGUMENTS);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__ARTIFACT_NAME);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH);
		createEAttribute(nodeDeploymentConfEClass, NODE_DEPLOYMENT_CONF__IS_RUNNING);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__SOURCE);
		createEAttribute(volumeEClass, VOLUME__TARGET);
		createEAttribute(volumeEClass, VOLUME__TYPE);
		createEAttribute(volumeEClass, VOLUME__ACCESS_MODE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TARGET);
		createEAttribute(portEClass, PORT__PUBLISHED);

		swarmPortEClass = createEClass(SWARM_PORT);
		createEAttribute(swarmPortEClass, SWARM_PORT__PROTOCOL);
		createEAttribute(swarmPortEClass, SWARM_PORT__MODE);

		kubernetesPortEClass = createEClass(KUBERNETES_PORT);
		createEAttribute(kubernetesPortEClass, KUBERNETES_PORT__NAME);
		createEAttribute(kubernetesPortEClass, KUBERNETES_PORT__INTERNAL);

		deploymentConstraintsEClass = createEClass(DEPLOYMENT_CONSTRAINTS);
		createEAttribute(deploymentConstraintsEClass, DEPLOYMENT_CONSTRAINTS__LABELS);
		createEAttribute(deploymentConstraintsEClass, DEPLOYMENT_CONSTRAINTS__RESOURCES);

		exceptionEClass = createEClass(EXCEPTION);

		configurationExceptionEClass = createEClass(CONFIGURATION_EXCEPTION);

		deploymentExceptionEClass = createEClass(DEPLOYMENT_EXCEPTION);

		launchExceptionEClass = createEClass(LAUNCH_EXCEPTION);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		fileDescriptorEClass = createEClass(FILE_DESCRIPTOR);
		createEAttribute(fileDescriptorEClass, FILE_DESCRIPTOR__FILE_PATH);
		createEAttribute(fileDescriptorEClass, FILE_DESCRIPTOR__FILE_NAME);

		deploymentFileDescriptorEClass = createEClass(DEPLOYMENT_FILE_DESCRIPTOR);
		createEAttribute(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT);
		createEAttribute(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE);
		createEReference(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__OWNER);

		artifactDescriptorEClass = createEClass(ARTIFACT_DESCRIPTOR);
		createEAttribute(artifactDescriptorEClass, ARTIFACT_DESCRIPTOR__LOCAL_PATH);

		// Create enums
		volumeTypeEEnum = createEEnum(VOLUME_TYPE);
		volumeAccessModeEEnum = createEEnum(VOLUME_ACCESS_MODE);
		portModeEEnum = createEEnum(PORT_MODE);
		protocolEEnum = createEEnum(PROTOCOL);
		deployableComponentTypeEEnum = createEEnum(DEPLOYABLE_COMPONENT_TYPE);

		// Create data types
		propertiesEDataType = createEDataType(PROPERTIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemElementEClass.getESuperTypes().add(this.getNamedElement());
		platformResourceEClass.getESuperTypes().add(this.getSystemElement());
		processingNodeEClass.getESuperTypes().add(this.getPlatformResource());
		physicalProcessingNodeEClass.getESuperTypes().add(this.getProcessingNode());
		virtualProcessingNodeEClass.getESuperTypes().add(this.getProcessingNode());
		awsVirtualProcessingNodeEClass.getESuperTypes().add(this.getVirtualProcessingNode());
		processingResourceClusterEClass.getESuperTypes().add(this.getPlatformResource());
		processingNodeClusterEClass.getESuperTypes().add(this.getProcessingResourceCluster());
		orchestrationClusterEClass.getESuperTypes().add(this.getProcessingResourceCluster());
		kubernetesClusterEClass.getESuperTypes().add(this.getOrchestrationCluster());
		swarmClusterEClass.getESuperTypes().add(this.getOrchestrationCluster());
		networkEClass.getESuperTypes().add(this.getPlatformResource());
		platformServiceEClass.getESuperTypes().add(this.getPlatformResource());
		platformServiceEClass.getESuperTypes().add(this.getDeployableComponent());
		serializationServiceEClass.getESuperTypes().add(this.getPlatformService());
		distributionServiceEClass.getESuperTypes().add(this.getPlatformService());
		communicationServiceEClass.getESuperTypes().add(this.getPlatformService());
		schedulingServiceEClass.getESuperTypes().add(this.getPlatformService());
		securityServiceEClass.getESuperTypes().add(this.getPlatformService());
		persistenceServiceEClass.getESuperTypes().add(this.getPlatformService());
		monitoringServiceEClass.getESuperTypes().add(this.getPlatformService());
		avroServiceEClass.getESuperTypes().add(this.getSerializationService());
		zookeeperServiceEClass.getESuperTypes().add(this.getDistributionService());
		kafkaServiceEClass.getESuperTypes().add(this.getCommunicationService());
		nodeSchedulerEClass.getESuperTypes().add(this.getSchedulingService());
		sparkServiceEClass.getESuperTypes().add(this.getSchedulingService());
		stormServiceEClass.getESuperTypes().add(this.getSchedulingService());
		stormUIEClass.getESuperTypes().add(this.getDeployableComponent());
		stormUIEClass.getESuperTypes().add(this.getNamedElement());
		stormNimbusEClass.getESuperTypes().add(this.getDeployableComponent());
		stormNimbusEClass.getESuperTypes().add(this.getNamedElement());
		stormSupervisorEClass.getESuperTypes().add(this.getDeployableComponent());
		stormSupervisorEClass.getESuperTypes().add(this.getNamedElement());
		neo4JServiceEClass.getESuperTypes().add(this.getPersistenceService());
		memSQLServiceEClass.getESuperTypes().add(this.getPersistenceService());
		cassandraServiceEClass.getESuperTypes().add(this.getPersistenceService());
		dataCenterEClass.getESuperTypes().add(this.getNamedElement());
		rackEClass.getESuperTypes().add(this.getNamedElement());
		prometheusServiceEClass.getESuperTypes().add(this.getMonitoringService());
		streamDataEClass.getESuperTypes().add(this.getDeployableComponent());
		workflowStreamDataEClass.getESuperTypes().add(this.getNamedElement());
		workflowStreamDataEClass.getESuperTypes().add(this.getStreamData());
		flowStreamDataEClass.getESuperTypes().add(this.getWorkflowStreamData());
		kafkaFlowStreamDataEClass.getESuperTypes().add(this.getFlowStreamData());
		derivedStreamDataEClass.getESuperTypes().add(this.getWorkflowStreamData());
		workloadStreamDataEClass.getESuperTypes().add(this.getSystemElement());
		workloadStreamDataEClass.getESuperTypes().add(this.getStreamData());
		kafkaWorkloadStreamDataEClass.getESuperTypes().add(this.getWorkloadStreamData());
		workflowEClass.getESuperTypes().add(this.getSystemElement());
		workflowEClass.getESuperTypes().add(this.getDeployableComponent());
		schedulableSetEClass.getESuperTypes().add(this.getSystemElement());
		taskEClass.getESuperTypes().add(this.getNamedElement());
		taskExecutorEClass.getESuperTypes().add(this.getNamedElement());
		taskExecutorEClass.getESuperTypes().add(this.getDeployableComponent());
		metricEClass.getESuperTypes().add(this.getSystemElement());
		processingNodeUtilizationEClass.getESuperTypes().add(this.getMetric());
		processingNodeMemoryEClass.getESuperTypes().add(this.getMetric());
		networkUtilizationEClass.getESuperTypes().add(this.getMetric());
		workflowLatencyEClass.getESuperTypes().add(this.getMetric());
		taskProcessingAmountEClass.getESuperTypes().add(this.getMetric());
		streamDataRateEClass.getESuperTypes().add(this.getMetric());
		meterEClass.getESuperTypes().add(this.getNamedElement());
		meterEClass.getESuperTypes().add(this.getDeployableComponent());
		prometheusMeterEClass.getESuperTypes().add(this.getMeter());
		nodeHostedMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		nodeResourceMeterEClass.getESuperTypes().add(this.getNodeHostedMeter());
		communicationMeterEClass.getESuperTypes().add(this.getNodeHostedMeter());
		streamRateMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		workflowLatencyMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		taskProcessingAmountMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		platformServiceDeploymentConfEClass.getESuperTypes().add(this.getDeploymentConfiguration());
		orchestratorDeploymentConfEClass.getESuperTypes().add(this.getPlatformServiceDeploymentConf());
		nodeDeploymentConfEClass.getESuperTypes().add(this.getPlatformServiceDeploymentConf());
		swarmPortEClass.getESuperTypes().add(this.getPort());
		kubernetesPortEClass.getESuperTypes().add(this.getPort());
		configurationExceptionEClass.getESuperTypes().add(this.getException());
		deploymentExceptionEClass.getESuperTypes().add(this.getException());
		launchExceptionEClass.getESuperTypes().add(this.getException());
		deploymentFileDescriptorEClass.getESuperTypes().add(this.getFileDescriptor());
		artifactDescriptorEClass.getESuperTypes().add(this.getFileDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(computationalSystemEClass, ComputationalSystem.class, "ComputationalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputationalSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Date(), ecorePackage.getEString(), "date", null, 1, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Authors(), ecorePackage.getEString(), "authors", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_TargetPlatformName(), ecorePackage.getEString(), "targetPlatformName", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationalSystem_OwnedElements(), this.getSystemElement(), this.getSystemElement_Owner(), "ownedElements", null, 0, -1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputationalSystem_AuthenticationFiles(), this.getStringToStringMap(), null, "authenticationFiles", null, 0, -1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComputationalSystem__DeployAndLaunch(), null, "deployAndLaunch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComputationalSystem__CleanDeployment(), null, "cleanDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementEClass, SystemElement.class, "SystemElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemElement_Owner(), this.getComputationalSystem(), this.getComputationalSystem_OwnedElements(), "owner", null, 1, 1, SystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformResourceEClass, PlatformResource.class, "PlatformResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingNodeEClass, ProcessingNode.class, "ProcessingNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingNode_Ip(), ecorePackage.getEString(), "ip", null, 1, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_Os(), ecorePackage.getEString(), "os", null, 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_ConcurrencyLevel(), ecorePackage.getEInt(), "concurrencyLevel", "1", 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_MemorySize(), ecorePackage.getEInt(), "memorySize", null, 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_SpeedFactor(), ecorePackage.getEDouble(), "speedFactor", "1.0", 1, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_ConfigData(), this.getProperties(), "configData", null, 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_ConnectedTo(), this.getNetwork(), null, "connectedTo", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_LaunchingScripts(), this.getDeploymentFileDescriptor(), null, "launchingScripts", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_ConfigFiles(), this.getDeploymentFileDescriptor(), null, "configFiles", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_CodeFiles(), this.getArtifactDescriptor(), null, "codeFiles", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_OwnedMeters(), this.getNodeHostedMeter(), this.getNodeHostedMeter_Owner(), "ownedMeters", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcessingNode__PrepareForDeployment(), null, "prepareForDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getConfigurationException());

		op = initEOperation(getProcessingNode__DeployAndLaunch(), null, "deployAndLaunch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getLaunchException());
		addEException(op, this.getDeploymentException());

		initEOperation(getProcessingNode__BringBackConfiguration(), null, "bringBackConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessingNode__BringBackDeployment(), null, "bringBackDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessingNode__AbortLaunching(), null, "abortLaunching", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor(), null, "addLaunchingScript", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeploymentFileDescriptor(), "script", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProcessingNode__AddConfigFile__DeploymentFileDescriptor(), null, "addConfigFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDeploymentFileDescriptor(), "configFile", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalProcessingNodeEClass, PhysicalProcessingNode.class, "PhysicalProcessingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessingNodeEClass, VirtualProcessingNode.class, "VirtualProcessingNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualProcessingNode_ExternalIP(), ecorePackage.getEString(), "externalIP", null, 1, 1, VirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsVirtualProcessingNodeEClass, AWSVirtualProcessingNode.class, "AWSVirtualProcessingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAWSVirtualProcessingNode_Vpc(), ecorePackage.getEString(), "vpc", null, 0, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_SubNet(), ecorePackage.getEString(), "subNet", null, 0, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_KeyPair(), ecorePackage.getEString(), "keyPair", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 0, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_AMI(), ecorePackage.getEString(), "AMI", null, 0, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_InstanceType(), ecorePackage.getEString(), "instanceType", null, 0, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceClusterEClass, ProcessingResourceCluster.class, "ProcessingResourceCluster", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingNodeClusterEClass, ProcessingNodeCluster.class, "ProcessingNodeCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingNodeCluster_Nodes(), this.getProcessingNode(), null, "nodes", null, 1, -1, ProcessingNodeCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orchestrationClusterEClass, OrchestrationCluster.class, "OrchestrationCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kubernetesClusterEClass, KubernetesCluster.class, "KubernetesCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKubernetesCluster_ApiVersion(), ecorePackage.getEString(), "apiVersion", null, 0, 1, KubernetesCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swarmClusterEClass, SwarmCluster.class, "SwarmCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Bandwith(), ecorePackage.getEDouble(), "bandwith", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformServiceEClass, PlatformService.class, "PlatformService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformService_Host(), this.getProcessingResourceCluster(), null, "host", null, 1, 1, PlatformService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializationServiceEClass, SerializationService.class, "SerializationService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributionServiceEClass, DistributionService.class, "DistributionService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationServiceEClass, CommunicationService.class, "CommunicationService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingServiceEClass, SchedulingService.class, "SchedulingService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingService_Workflows(), this.getWorkflow(), this.getWorkflow_Scheduler(), "workflows", null, 0, -1, SchedulingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityServiceEClass, SecurityService.class, "SecurityService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistenceServiceEClass, PersistenceService.class, "PersistenceService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceService_Logging(), ecorePackage.getEString(), "logging", null, 1, 1, PersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceService_Passwd(), ecorePackage.getEString(), "passwd", null, 1, 1, PersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceService_Port(), ecorePackage.getEInt(), "port", "9098", 1, 1, PersistenceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitoringServiceEClass, MonitoringService.class, "MonitoringService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitoringService_MonitorizedMeters(), this.getMeter(), this.getMeter_MonitoringServer(), "monitorizedMeters", null, 0, -1, MonitoringService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avroServiceEClass, AVROService.class, "AVROService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zookeeperServiceEClass, ZookeeperService.class, "ZookeeperService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZookeeperService_ServerId(), ecorePackage.getEInt(), "serverId", null, 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_ClientPort(), ecorePackage.getEInt(), "clientPort", "2181", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_TickTime(), ecorePackage.getELong(), "tickTime", "2000", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_LeaderServers(), ecorePackage.getEBoolean(), "leaderServers", "true", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_PeerPort(), ecorePackage.getEInt(), "peerPort", "2888", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_LeaderPort(), ecorePackage.getEInt(), "leaderPort", "3888", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_InitLimit(), ecorePackage.getEInt(), "initLimit", "5", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperService_SyncLimit(), ecorePackage.getEInt(), "syncLimit", "3", 1, 1, ZookeeperService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaServiceEClass, KafkaService.class, "KafkaService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaService_CommId(), ecorePackage.getEInt(), "commId", null, 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_ClientPort(), ecorePackage.getEInt(), "clientPort", "9092", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaService_ZookeeperConnect(), this.getZookeeperService(), null, "zookeeperConnect", null, 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_ZookeeperConnectionTimeout(), ecorePackage.getEInt(), "zookeeperConnectionTimeout", "6000", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_Listeners(), ecorePackage.getEString(), "listeners", "\u201dPLAINTEXT\u201d", 0, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_AdvertisedListeners(), ecorePackage.getEString(), "advertisedListeners", "PLAINTEXT", 0, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_AutoCreateTopicEnable(), ecorePackage.getEBoolean(), "autoCreateTopicEnable", "false", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_DeleteTopicEnable(), ecorePackage.getEBoolean(), "deleteTopicEnable", "false", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_NumPartitions(), ecorePackage.getEInt(), "numPartitions", "4", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_NumRecoveryThreadsPerDataDir(), ecorePackage.getEInt(), "numRecoveryThreadsPerDataDir", "1", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_LogFlushIntervalMessages(), ecorePackage.getEInt(), "logFlushIntervalMessages", "10000", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_LogFlushInterval(), ecorePackage.getEInt(), "logFlushInterval", "1000", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_NumNetworkThreads(), ecorePackage.getEInt(), "numNetworkThreads", "3", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_NumIOThreads(), ecorePackage.getEInt(), "numIOThreads", "8", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_SocketSendBufferBytes(), ecorePackage.getEInt(), "socketSendBufferBytes", "102400", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_SocketReceiveBufferBytes(), ecorePackage.getEInt(), "socketReceiveBufferBytes", "102400", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaService_SocketRequestMaxBytes(), ecorePackage.getEInt(), "socketRequestMaxBytes", "104857600", 1, 1, KafkaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSchedulerEClass, NodeScheduler.class, "NodeScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sparkServiceEClass, SparkService.class, "SparkService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSparkService_Load(), this.getSchedulableSet(), null, "load", null, 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_DriverCores(), ecorePackage.getEInt(), "driverCores", "1", 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_DriverMaxResultSize(), ecorePackage.getEString(), "driverMaxResultSize", "1g", 0, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_DriverMemory(), ecorePackage.getELong(), "driverMemory", "1000000000", 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_LocalDir(), ecorePackage.getEString(), "localDir", "/home/apache/spark/localDir", 0, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSparkService_Master(), this.getProcessingResourceCluster(), null, "master", null, 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_WindowSize(), ecorePackage.getEInt(), "windowSize", null, 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_ExecutorMemory(), ecorePackage.getELong(), "executorMemory", "1000000000", 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_ExtraListener(), ecorePackage.getEString(), "extraListener", null, 0, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_LogConf(), ecorePackage.getEBoolean(), "logConf", "false", 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_SubmitDeployMode(), ecorePackage.getEString(), "submitDeployMode", null, 0, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_LogCallerContext(), ecorePackage.getEString(), "logCallerContext", null, 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkService_DriverSuperviser(), ecorePackage.getEBoolean(), "driverSuperviser", "false", 1, 1, SparkService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stormServiceEClass, StormService.class, "StormService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStormService_ZookeeperConnect(), this.getZookeeperService(), null, "zookeeperConnect", null, 1, 1, StormService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStormService_LocalDir(), ecorePackage.getEString(), "localDir", "storm-local", 0, 1, StormService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormService_Nimbus(), this.getStormNimbus(), this.getStormNimbus_Owner(), "nimbus", null, 1, 1, StormService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormService_Supervisor(), this.getStormSupervisor(), this.getStormSupervisor_Owner(), "supervisor", null, 1, 1, StormService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormService_Ui(), this.getStormUI(), this.getStormUI_Owner(), "ui", null, 0, 1, StormService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stormUIEClass, StormUI.class, "StormUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormUI_UiPort(), ecorePackage.getEInt(), "uiPort", "8080", 1, 1, StormUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormUI_Owner(), this.getStormService(), this.getStormService_Ui(), "owner", null, 1, 1, StormUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormUI_Host(), this.getProcessingResourceCluster(), null, "host", null, 0, 1, StormUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stormNimbusEClass, StormNimbus.class, "StormNimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStormNimbus_Owner(), this.getStormService(), this.getStormService_Nimbus(), "owner", null, 1, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormNimbus_Host(), this.getProcessingResourceCluster(), null, "host", null, 0, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stormSupervisorEClass, StormSupervisor.class, "StormSupervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormSupervisor_SupervisorSlotPorts(), ecorePackage.getEString(), "supervisorSlotPorts", null, 0, -1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormSupervisor_Owner(), this.getStormService(), this.getStormService_Supervisor(), "owner", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormSupervisor_Host(), this.getProcessingResourceCluster(), null, "host", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neo4JServiceEClass, Neo4JService.class, "Neo4JService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memSQLServiceEClass, MemSQLService.class, "MemSQLService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cassandraServiceEClass, CassandraService.class, "CassandraService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCassandraService_NumTokens(), ecorePackage.getEInt(), "numTokens", "256", 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraService_Seeds(), this.getProcessingNodeCluster(), null, "seeds", null, 0, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_SeedProviderClass(), ecorePackage.getEString(), "seedProviderClass", null, 0, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_EndpointSnitch(), ecorePackage.getEString(), "endpointSnitch", "SimpleSnitch", 0, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_DataFileDir(), ecorePackage.getEString(), "dataFileDir", null, 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_StoragePort(), ecorePackage.getEInt(), "storagePort", "7000", 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_AutoBootstrap(), ecorePackage.getEBoolean(), "autoBootstrap", "false", 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraService_CqlSchemas(), this.getFileDescriptor(), null, "cqlSchemas", null, 0, -1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraService_DataCenters(), this.getDataCenter(), null, "dataCenters", null, 1, -1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_SslStoragePort(), ecorePackage.getEInt(), "sslStoragePort", "7001", 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraService_RpcPort(), ecorePackage.getEInt(), "rpcPort", "9160", 1, 1, CassandraService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCenter_Racks(), this.getRack(), null, "racks", null, 1, -1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rackEClass, Rack.class, "Rack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Nodes(), this.getProcessingNodeCluster(), null, "nodes", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prometheusServiceEClass, PrometheusService.class, "PrometheusService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrometheusService_ExportersData(), this.getExporterData(), null, "exportersData", null, 0, -1, PrometheusService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exporterDataEClass, ExporterData.class, "ExporterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExporterData_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExporterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExporterData_Artifact(), ecorePackage.getEString(), "artifact", null, 1, 1, ExporterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamDataEClass, StreamData.class, "StreamData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreamData_Retention_ms(), ecorePackage.getELong(), "retention_ms", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_Retention_bytes(), ecorePackage.getEInt(), "retention_bytes", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_CleanupPolicy(), ecorePackage.getEBoolean(), "cleanupPolicy", "false", 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_NumPartitions(), ecorePackage.getEInt(), "numPartitions", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_NumReplication(), ecorePackage.getEInt(), "numReplication", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamData_OwnedMeters(), this.getStreamRateMeter(), this.getStreamRateMeter_Owner(), "ownedMeters", null, 0, -1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamData_AssignedPartition(), this.getStreamDataPartition(), null, "assignedPartition", null, 0, -1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_MessageSize(), ecorePackage.getEInt(), "messageSize", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_SchemaFile(), ecorePackage.getEString(), "schemaFile", null, 0, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamDataPartitionEClass, StreamDataPartition.class, "StreamDataPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreamDataPartition_Key(), ecorePackage.getEString(), "key", null, 0, 1, StreamDataPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamDataPartition_Host(), this.getProcessingNode(), null, "host", null, 1, 1, StreamDataPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowStreamDataEClass, WorkflowStreamData.class, "WorkflowStreamData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowStreamData_IsSingleUse(), ecorePackage.getEBoolean(), "isSingleUse", null, 1, 1, WorkflowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowStreamData_Owner(), this.getWorkflow(), this.getWorkflow_OwnedStreamData(), "owner", null, 1, 1, WorkflowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowStreamDataEClass, FlowStreamData.class, "FlowStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowStreamData_Source(), this.getStreamData(), null, "source", null, 1, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowStreamData_Predecessor(), this.getStreamData(), null, "predecessor", null, 1, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowStreamData_Holder(), this.getCommunicationService(), null, "holder", null, 0, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowStreamData_IsImplemented(), ecorePackage.getEBoolean(), "isImplemented", null, 1, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaFlowStreamDataEClass, KafkaFlowStreamData.class, "KafkaFlowStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedStreamDataEClass, DerivedStreamData.class, "DerivedStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedStreamData_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, DerivedStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedStreamData_Inputs(), this.getStreamData(), null, "inputs", null, 1, -1, DerivedStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadStreamDataEClass, WorkloadStreamData.class, "WorkloadStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkloadStreamData_Holder(), this.getCommunicationService(), null, "holder", null, 1, 1, WorkloadStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaWorkloadStreamDataEClass, KafkaWorkloadStreamData.class, "KafkaWorkloadStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_OwnedStreamData(), this.getWorkflowStreamData(), this.getWorkflowStreamData_Owner(), "ownedStreamData", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_OwnedTasks(), this.getTask(), this.getTask_Owner(), "ownedTasks", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_RootTask(), this.getTask(), null, "rootTask", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_OwnedTaskExecutors(), this.getTaskExecutor(), this.getTaskExecutor_Owner(), "ownedTaskExecutors", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Scheduler(), this.getSchedulingService(), this.getSchedulingService_Workflows(), "scheduler", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_OwnedMeters(), this.getWorkflowLatencyMeter(), this.getWorkflowLatencyMeter_Owner(), "ownedMeters", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulableSetEClass, SchedulableSet.class, "SchedulableSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulableSet_Workflows(), this.getWorkflow(), null, "workflows", null, 1, -1, SchedulableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Owner(), this.getWorkflow(), this.getWorkflow_OwnedTasks(), "owner", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ImplementingClassName(), ecorePackage.getEString(), "implementingClassName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ReturnedStreamData(), this.getStreamData(), null, "returnedStreamData", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TriggerStreamData(), this.getStreamData(), null, "triggerStreamData", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_InputStreamData(), this.getStreamData(), null, "inputStreamData", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskExecutorEClass, TaskExecutor.class, "TaskExecutor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskExecutor_Owner(), this.getWorkflow(), this.getWorkflow_OwnedTaskExecutors(), "owner", null, 1, 1, TaskExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskExecutor_ExecutedTasks(), this.getTask(), null, "executedTasks", null, 1, -1, TaskExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskExecutor_OwnedMeters(), this.getTaskProcessingAmountMeter(), this.getTaskProcessingAmountMeter_Owner(), "ownedMeters", null, 0, -1, TaskExecutor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingNodeUtilizationEClass, ProcessingNodeUtilization.class, "ProcessingNodeUtilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingNodeUtilization_Target(), this.getProcessingNode(), null, "target", null, 1, 1, ProcessingNodeUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNodeUtilization_Meter(), this.getNodeResourceMeter(), this.getNodeResourceMeter_UMetric(), "meter", null, 1, 1, ProcessingNodeUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingNodeMemoryEClass, ProcessingNodeMemory.class, "ProcessingNodeMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingNodeMemory_Target(), this.getProcessingNode(), null, "target", null, 1, 1, ProcessingNodeMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNodeMemory_Meter(), this.getNodeResourceMeter(), this.getNodeResourceMeter_MMetric(), "meter", null, 1, 1, ProcessingNodeMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkUtilizationEClass, NetworkUtilization.class, "NetworkUtilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkUtilization_Target(), this.getNetwork(), null, "target", null, 1, 1, NetworkUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkUtilization_Meter(), this.getCommunicationMeter(), this.getCommunicationMeter_Metric(), "meter", null, 1, 1, NetworkUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowLatencyEClass, WorkflowLatency.class, "WorkflowLatency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowLatency_Target(), this.getWorkflow(), null, "target", null, 1, 1, WorkflowLatency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLatency_Meter(), this.getWorkflowLatencyMeter(), this.getWorkflowLatencyMeter_Metric(), "meter", null, 1, 1, WorkflowLatency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskProcessingAmountEClass, TaskProcessingAmount.class, "TaskProcessingAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskProcessingAmount_Target(), this.getTask(), null, "target", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProcessingAmount_Meter(), this.getTaskProcessingAmountMeter(), this.getTaskProcessingAmountMeter_Metric(), "meter", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_HistogramBuckectNum(), ecorePackage.getEInt(), "histogramBuckectNum", "11", 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_ExpectedMaxTPA(), ecorePackage.getELong(), "expectedMaxTPA", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_ExpectedMinTPA(), ecorePackage.getELong(), "expectedMinTPA", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_LinearBucketDistribution(), ecorePackage.getEBoolean(), "linearBucketDistribution", "true", 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamDataRateEClass, StreamDataRate.class, "StreamDataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamDataRate_Target(), this.getStreamData(), null, "target", null, 1, 1, StreamDataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamDataRate_Meter(), this.getStreamRateMeter(), this.getStreamRateMeter_Metric(), "meter", null, 1, 1, StreamDataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeter_MonitoringServer(), this.getMonitoringService(), this.getMonitoringService_MonitorizedMeters(), "monitoringServer", null, 0, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prometheusMeterEClass, PrometheusMeter.class, "PrometheusMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrometheusMeter_MonitoringPort(), ecorePackage.getEInt(), "monitoringPort", null, 1, 1, PrometheusMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrometheusMeter_MonitoringTime(), ecorePackage.getELong(), "monitoringTime", null, 1, 1, PrometheusMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrometheusMeter__GetPrometheusServerConfiguration(), ecorePackage.getEString(), "getPrometheusServerConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeHostedMeterEClass, NodeHostedMeter.class, "NodeHostedMeter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeHostedMeter_Owner(), this.getProcessingNode(), this.getProcessingNode_OwnedMeters(), "owner", null, 1, 1, NodeHostedMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeResourceMeterEClass, NodeResourceMeter.class, "NodeResourceMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeResourceMeter_UMetric(), this.getProcessingNodeUtilization(), this.getProcessingNodeUtilization_Meter(), "uMetric", null, 0, 1, NodeResourceMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeResourceMeter_MMetric(), this.getProcessingNodeMemory(), this.getProcessingNodeMemory_Meter(), "mMetric", null, 0, 1, NodeResourceMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationMeterEClass, CommunicationMeter.class, "CommunicationMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMeter_Metric(), this.getNetworkUtilization(), this.getNetworkUtilization_Meter(), "metric", null, 1, 1, CommunicationMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamRateMeterEClass, StreamRateMeter.class, "StreamRateMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamRateMeter_Owner(), this.getStreamData(), this.getStreamData_OwnedMeters(), "owner", null, 1, 1, StreamRateMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamRateMeter_Metric(), this.getStreamDataRate(), this.getStreamDataRate_Meter(), "metric", null, 1, 1, StreamRateMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowLatencyMeterEClass, WorkflowLatencyMeter.class, "WorkflowLatencyMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowLatencyMeter_Owner(), this.getWorkflow(), this.getWorkflow_OwnedMeters(), "owner", null, 1, 1, WorkflowLatencyMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLatencyMeter_Metric(), this.getWorkflowLatency(), this.getWorkflowLatency_Meter(), "metric", null, 0, 1, WorkflowLatencyMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskProcessingAmountMeterEClass, TaskProcessingAmountMeter.class, "TaskProcessingAmountMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskProcessingAmountMeter_Owner(), this.getTaskExecutor(), this.getTaskExecutor_OwnedMeters(), "owner", null, 1, 1, TaskProcessingAmountMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProcessingAmountMeter_Metric(), this.getTaskProcessingAmount(), this.getTaskProcessingAmount_Meter(), "metric", null, 1, 1, TaskProcessingAmountMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableComponentEClass, DeployableComponent.class, "DeployableComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployableComponent_DeploymentConfig(), this.getDeploymentConfiguration(), null, "deploymentConfig", null, 1, 1, DeployableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDeployableComponent__ConfigureDeployment(), null, "configureDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getConfigurationException());

		initEClass(deploymentConfigurationEClass, DeploymentConfiguration.class, "DeploymentConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformServiceDeploymentConfEClass, PlatformServiceDeploymentConf.class, "PlatformServiceDeploymentConf", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orchestratorDeploymentConfEClass, OrchestratorDeploymentConf.class, "OrchestratorDeploymentConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrchestratorDeploymentConf_Image(), ecorePackage.getEString(), "image", null, 1, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_ImageTag(), ecorePackage.getEString(), "imageTag", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_ImagePullPolicy(), ecorePackage.getEString(), "imagePullPolicy", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_Replicas(), ecorePackage.getEInt(), "replicas", "1", 1, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_Command(), ecorePackage.getEString(), "command", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_Args(), ecorePackage.getEString(), "args", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrchestratorDeploymentConf_Env(), this.getProperties(), "env", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestratorDeploymentConf_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestratorDeploymentConf_Ports(), this.getPort(), null, "ports", null, 0, -1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestratorDeploymentConf_Constraints(), this.getDeploymentConstraints(), null, "constraints", null, 0, 1, OrchestratorDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDeploymentConfEClass, NodeDeploymentConf.class, "NodeDeploymentConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeDeploymentConf_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_ArtifactLocator(), ecorePackage.getEString(), "artifactLocator", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_ConfigFolderPath(), ecorePackage.getEString(), "configFolderPath", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_ScriptFolderPath(), ecorePackage.getEString(), "scriptFolderPath", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_DataFolderPath(), ecorePackage.getEString(), "dataFolderPath", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_LogFolderPath(), ecorePackage.getEString(), "logFolderPath", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_CodeFolderPath(), ecorePackage.getEString(), "codeFolderPath", null, 0, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeDeploymentConf_IsRunning(), ecorePackage.getEBoolean(), "isRunning", null, 1, 1, NodeDeploymentConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Source(), ecorePackage.getEString(), "source", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Target(), ecorePackage.getEString(), "target", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Type(), this.getVolumeType(), "type", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_AccessMode(), this.getVolumeAccessMode(), "accessMode", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Target(), ecorePackage.getEString(), "target", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Published(), ecorePackage.getEString(), "published", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swarmPortEClass, SwarmPort.class, "SwarmPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwarmPort_Protocol(), this.getProtocol(), "protocol", null, 1, 1, SwarmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwarmPort_Mode(), this.getPortMode(), "mode", null, 1, 1, SwarmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kubernetesPortEClass, KubernetesPort.class, "KubernetesPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKubernetesPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, KubernetesPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKubernetesPort_Internal(), ecorePackage.getEBoolean(), "internal", "false", 1, 1, KubernetesPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentConstraintsEClass, DeploymentConstraints.class, "DeploymentConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentConstraints_Labels(), this.getProperties(), "labels", null, 0, 1, DeploymentConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentConstraints_Resources(), this.getProperties(), "resources", null, 0, 1, DeploymentConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, Exception.class, "Exception", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationExceptionEClass, ConfigurationException.class, "ConfigurationException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentExceptionEClass, DeploymentException.class, "DeploymentException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(launchExceptionEClass, LaunchException.class, "LaunchException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDescriptorEClass, FileDescriptor.class, "FileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDescriptor_FilePath(), ecorePackage.getEString(), "filePath", null, 1, 1, FileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileDescriptor_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, FileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentFileDescriptorEClass, DeploymentFileDescriptor.class, "DeploymentFileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentFileDescriptor_FileContent(), ecorePackage.getEString(), "fileContent", null, 1, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentFileDescriptor_ElementType(), this.getDeployableComponentType(), "elementType", null, 0, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentFileDescriptor_Owner(), this.getProcessingNode(), null, "owner", null, 0, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactDescriptorEClass, ArtifactDescriptor.class, "ArtifactDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactDescriptor_LocalPath(), ecorePackage.getEString(), "localPath", null, 1, 1, ArtifactDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(volumeTypeEEnum, VolumeType.class, "VolumeType");
		addEEnumLiteral(volumeTypeEEnum, VolumeType.VOLUME);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.BIND);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.TMPFS);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.NPIPE);

		initEEnum(volumeAccessModeEEnum, VolumeAccessMode.class, "VolumeAccessMode");
		addEEnumLiteral(volumeAccessModeEEnum, VolumeAccessMode.READWRITEONCE);
		addEEnumLiteral(volumeAccessModeEEnum, VolumeAccessMode.READONLYMANY);
		addEEnumLiteral(volumeAccessModeEEnum, VolumeAccessMode.READWRITEMANY);
		addEEnumLiteral(volumeAccessModeEEnum, VolumeAccessMode.READWRITEONCEPOD);

		initEEnum(portModeEEnum, PortMode.class, "PortMode");
		addEEnumLiteral(portModeEEnum, PortMode.HOST);
		addEEnumLiteral(portModeEEnum, PortMode.INGRESS);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.TCP);
		addEEnumLiteral(protocolEEnum, Protocol.UDP);

		initEEnum(deployableComponentTypeEEnum, DeployableComponentType.class, "DeployableComponentType");
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.PROMETHEUS_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.ZOOKEEPER_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.KAFKA_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.CASSANDRA_SERVICE_SEED);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.CASSANDRA_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.STORM_NIMBUS);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.STORM_SUPERVISOR);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.STORM_UI);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.SPARK_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.KAFKA_WORKLOAD_STREAM);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.KAFKA_FLOW_STREAM);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.AVRO_SERVICE);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.NODE_RESOURCE_METER);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.TASK_EXECUTOR);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.TASK_AMOUNT_METER);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.DOCKER_STACK);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.CASSANDRA_SCHEMA);
		addEEnumLiteral(deployableComponentTypeEEnum, DeployableComponentType.WORKFLOW);

		// Initialize data types
		initEDataType(propertiesEDataType, Properties.class, "Properties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PasysPackageImpl
