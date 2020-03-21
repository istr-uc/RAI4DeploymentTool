/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.AVROServer;
import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraServer;
import PASYS_Metamodel.pasys.CommunicationMeter;
import PASYS_Metamodel.pasys.CommunicationServer;
import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.ContainerizationServer;
import PASYS_Metamodel.pasys.Deployment;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.DistributionServer;
import PASYS_Metamodel.pasys.DockerContainer;
import PASYS_Metamodel.pasys.DockerServer;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.ExternalElementType;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.Image;
import PASYS_Metamodel.pasys.KafkaFlowStreamData;
import PASYS_Metamodel.pasys.KafkaServer;
import PASYS_Metamodel.pasys.KafkaWorkloadStreamData;
import PASYS_Metamodel.pasys.LaunchException;
import PASYS_Metamodel.pasys.MemSQLServer;
import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.Metric;
import PASYS_Metamodel.pasys.MonitoringServer;
import PASYS_Metamodel.pasys.NamedElement;
import PASYS_Metamodel.pasys.Neo4JServer;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NetworkDriver;
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.OrchestrationServer;
import PASYS_Metamodel.pasys.PasysFactory;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceServer;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.PlatformServer;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.PortMode;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusServer;
import PASYS_Metamodel.pasys.Protocol;
import PASYS_Metamodel.pasys.Repository;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.SchedulingServer;
import PASYS_Metamodel.pasys.SerializationServer;
import PASYS_Metamodel.pasys.Service;
import PASYS_Metamodel.pasys.ServiceNetwork;
import PASYS_Metamodel.pasys.SparkServer;
import PASYS_Metamodel.pasys.Stack;
import PASYS_Metamodel.pasys.StormServer;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SwarmCluster;
import PASYS_Metamodel.pasys.SwarmNetwork;
import PASYS_Metamodel.pasys.SwarmServer;
import PASYS_Metamodel.pasys.SystemAdapter;
import PASYS_Metamodel.pasys.SystemComponent;
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
import PASYS_Metamodel.pasys.VolumeType;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatency;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkflowStreamData;
import PASYS_Metamodel.pasys.WorkloadStreamData;
import PASYS_Metamodel.pasys.ZookeeperServer;

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
	private EClass systemExternalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementAdapterEClass = null;

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
	private EClass resourceClusterEClass = null;

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
	private EClass platformServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avroServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zookeeperServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kafkaServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingServerEClass = null;

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
	private EClass sparkServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memSQLServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cassandraServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neo4JServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prometheusServerEClass = null;

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
	private EClass systemComponentEClass = null;

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
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerizationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestrationServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swarmServerEClass = null;

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
	private EClass stackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

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
	private EClass serviceNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swarmNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

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
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeClusterEClass = null;

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
	private EEnum externalElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemComponentTypeEEnum = null;

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
	private EEnum networkDriverEEnum = null;

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
		PasysPackageImpl thePasysPackage = (PasysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PasysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PasysPackageImpl());

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
	public EReference getComputationalSystem_ReferencedSystems() {
		return (EReference)computationalSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputationalSystem_AuthenticationFiles() {
		return (EReference)computationalSystemEClass.getEStructuralFeatures().get(7);
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
	public EClass getSystemExternalElement() {
		return systemExternalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemExternalElement_ElementType() {
		return (EAttribute)systemExternalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemAdapter() {
		return systemAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemAdapter_IdPrefix() {
		return (EAttribute)systemAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemAdapter_Prefix() {
		return (EAttribute)systemAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemAdapter_ElemMapping() {
		return (EReference)systemAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemAdapter_SystemTarget() {
		return (EReference)systemAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemAdapter_TargetSysLocator() {
		return (EAttribute)systemAdapterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemElementAdapter() {
		return systemElementAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemElementAdapter_ElemName() {
		return (EAttribute)systemElementAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemElementAdapter_SourceElemId() {
		return (EAttribute)systemElementAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemElementAdapter_TargetElemId() {
		return (EAttribute)systemElementAdapterEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_ConnectedTo() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_LaunchingScripts() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_ConfigFiles() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_PropertyConfigData() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_OwnedMeters() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingNode_Ip() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingNode_UserName() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_MemorySize() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingNode_SpeedFactor() {
		return (EAttribute)processingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingNode_CodeFiles() {
		return (EReference)processingNodeEClass.getEStructuralFeatures().get(7);
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
	public EClass getPhysicalProcessingNode() {
		return physicalProcessingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalProcessingNode_Os() {
		return (EAttribute)physicalProcessingNodeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getVirtualProcessingNode_ExternalIP() {
		return (EAttribute)virtualProcessingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWSVirtualProcessingNode() {
		return awsVirtualProcessingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_Vpc() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_SubNet() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_KeyPair() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_SecurityGroup() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_AMI() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSVirtualProcessingNode_InstanceType() {
		return (EAttribute)awsVirtualProcessingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceCluster() {
		return resourceClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceCluster_Resources() {
		return (EReference)resourceClusterEClass.getEStructuralFeatures().get(0);
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
	public EClass getPlatformServer() {
		return platformServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformServer_Host() {
		return (EReference)platformServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlatformServer_Target() {
		return (EReference)platformServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformServer_Container() {
		return (EReference)platformServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSerializationServer() {
		return serializationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAVROServer() {
		return avroServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistributionServer() {
		return distributionServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZookeeperServer() {
		return zookeeperServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_ServerId() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_TickTime() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_LeaderServers() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_InitLimit() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_SyncLimit() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_ClientPort() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_PeerPort() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZookeeperServer_LeaderPort() {
		return (EAttribute)zookeeperServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationServer() {
		return communicationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKafkaServer() {
		return kafkaServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_CommId() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_AutoCreateTopicEnable() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_DeleteTopicEnable() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKafkaServer_ZookeeperConnect() {
		return (EReference)kafkaServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_ZookeeperConnectionTimeout() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_NumPartitions() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_NumRecoveryThreadsPerDataDir() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_LogFlushIntervalMessages() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_LogFlushInterval() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_Listeners() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_AdvertisedListeners() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_NumNetworkThreads() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_NumIOThreads() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_SocketSendBufferBytes() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_SocketReceiveBufferBytes() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_SocketRequestMaxBytes() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKafkaServer_ClientPort() {
		return (EAttribute)kafkaServerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingServer() {
		return schedulingServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulingServer_Workflows() {
		return (EReference)schedulingServerEClass.getEStructuralFeatures().get(0);
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
	public EClass getSparkServer() {
		return sparkServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSparkServer_Load() {
		return (EReference)sparkServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_DriverCores() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_DriverMaxResultSize() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_DriverMemory() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_LocalDir() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSparkServer_Master() {
		return (EReference)sparkServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_WindowSize() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_ExecutorMemory() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_ExtraListener() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_LogConf() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_SubmitDeployMode() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_LogCallerContext() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSparkServer_DriverSuperviser() {
		return (EAttribute)sparkServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStormServer() {
		return stormServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormServer_ZookeeperConnect() {
		return (EReference)stormServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormServer_LocalDir() {
		return (EAttribute)stormServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormServer_NimbusSeeds() {
		return (EReference)stormServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormServer_SupervisorSlotPorts() {
		return (EAttribute)stormServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormServer_DrpcServers() {
		return (EReference)stormServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStormServer_Supervisors() {
		return (EReference)stormServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStormServer_UiPort() {
		return (EAttribute)stormServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormServer_IsNimbus() {
		return (EAttribute)stormServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceServer() {
		return persistenceServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceServer_Logging() {
		return (EAttribute)persistenceServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceServer_Passwd() {
		return (EAttribute)persistenceServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistenceServer_Port() {
		return (EAttribute)persistenceServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemSQLServer() {
		return memSQLServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCassandraServer() {
		return cassandraServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_NumTokens() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_Seeds() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_SeedProviderClass() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_ListenAddress() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_RpcAddress() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_EndpointSnitch() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_DataCenter() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_CqlSchemas() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCassandraServer_IsSeed() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_DataFileDir() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_NativeTransportPort() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCassandraServer_Rack() {
		return (EReference)cassandraServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCassandraServer_AutoBootstrap() {
		return (EAttribute)cassandraServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeo4JServer() {
		return neo4JServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringServer() {
		return monitoringServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringServer_MonitorizedMeters() {
		return (EReference)monitoringServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrometheusServer() {
		return prometheusServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrometheusServer_ExportersData() {
		return (EReference)prometheusServerEClass.getEStructuralFeatures().get(0);
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
	public EClass getSystemComponent() {
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_ArtifactName() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_ArtifactLocator() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_Arguments() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_ScriptFolderPath() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_ConfigFolderPath() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_DataFolderPath() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_LogFolderPath() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponent_IsRunning() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSystemComponent__Deploy() {
		return systemComponentEClass.getEOperations().get(0);
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
	public EAttribute getArtifactDescriptor_FileLocator() {
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
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Host() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerContainer() {
		return dockerContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Service() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerizationServer() {
		return containerizationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerServer() {
		return dockerServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServer_Stacks() {
		return (EReference)dockerServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServer_SwarmCluster() {
		return (EReference)dockerServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestrationServer() {
		return orchestrationServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwarmServer() {
		return swarmServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwarmCluster() {
		return swarmClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwarmCluster_Workers() {
		return (EReference)swarmClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwarmCluster_Manager() {
		return (EReference)swarmClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStack() {
		return stackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_Services() {
		return (EReference)stackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_SwarmCluster() {
		return (EReference)stackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStack_Version() {
		return (EAttribute)stackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStack_Networks() {
		return (EReference)stackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Stack() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_EnvFile() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Env() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_DependsOn() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Image() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Volumes() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Ports() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Networks() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_DeploymentParam() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Target() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Published() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Protocol() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Mode() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNetwork() {
		return serviceNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNetwork_Ipv4Address() {
		return (EAttribute)serviceNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceNetwork_Aliases() {
		return (EAttribute)serviceNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNetwork_Network() {
		return (EReference)serviceNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwarmNetwork() {
		return swarmNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwarmNetwork_Subnets() {
		return (EReference)swarmNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwarmNetwork_Driver() {
		return (EAttribute)swarmNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Repository() {
		return (EReference)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Tag() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_DockerFile() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Description() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Size() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Source() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Target() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_ReadOnly() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Type() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Replicas() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Placement() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_RestartPolicy() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistry() {
		return registryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistry_Url() {
		return (EAttribute)registryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistry_Repositories() {
		return (EReference)registryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Images() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_IsPrivate() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeCluster() {
		return nodeClusterEClass;
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
	public EEnum getExternalElementType() {
		return externalElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSystemComponentType() {
		return systemComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortMode() {
		return portModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkDriver() {
		return networkDriverEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVolumeType() {
		return volumeTypeEEnum;
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
		createEReference(computationalSystemEClass, COMPUTATIONAL_SYSTEM__REFERENCED_SYSTEMS);
		createEReference(computationalSystemEClass, COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES);
		createEOperation(computationalSystemEClass, COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);

		systemElementEClass = createEClass(SYSTEM_ELEMENT);
		createEReference(systemElementEClass, SYSTEM_ELEMENT__OWNER);

		systemExternalElementEClass = createEClass(SYSTEM_EXTERNAL_ELEMENT);
		createEAttribute(systemExternalElementEClass, SYSTEM_EXTERNAL_ELEMENT__ELEMENT_TYPE);

		systemAdapterEClass = createEClass(SYSTEM_ADAPTER);
		createEAttribute(systemAdapterEClass, SYSTEM_ADAPTER__ID_PREFIX);
		createEAttribute(systemAdapterEClass, SYSTEM_ADAPTER__PREFIX);
		createEReference(systemAdapterEClass, SYSTEM_ADAPTER__ELEM_MAPPING);
		createEReference(systemAdapterEClass, SYSTEM_ADAPTER__SYSTEM_TARGET);
		createEAttribute(systemAdapterEClass, SYSTEM_ADAPTER__TARGET_SYS_LOCATOR);

		systemElementAdapterEClass = createEClass(SYSTEM_ELEMENT_ADAPTER);
		createEAttribute(systemElementAdapterEClass, SYSTEM_ELEMENT_ADAPTER__ELEM_NAME);
		createEAttribute(systemElementAdapterEClass, SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID);
		createEAttribute(systemElementAdapterEClass, SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID);

		platformResourceEClass = createEClass(PLATFORM_RESOURCE);

		processingNodeEClass = createEClass(PROCESSING_NODE);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__CONCURRENCY_LEVEL);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__MEMORY_SIZE);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__SPEED_FACTOR);
		createEReference(processingNodeEClass, PROCESSING_NODE__CONNECTED_TO);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__PROPERTY_CONFIG_DATA);
		createEReference(processingNodeEClass, PROCESSING_NODE__LAUNCHING_SCRIPTS);
		createEReference(processingNodeEClass, PROCESSING_NODE__CONFIG_FILES);
		createEReference(processingNodeEClass, PROCESSING_NODE__CODE_FILES);
		createEReference(processingNodeEClass, PROCESSING_NODE__OWNED_METERS);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__IP);
		createEAttribute(processingNodeEClass, PROCESSING_NODE__USER_NAME);
		createEOperation(processingNodeEClass, PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT);
		createEOperation(processingNodeEClass, PROCESSING_NODE___DEPLOY_AND_LAUNCH);
		createEOperation(processingNodeEClass, PROCESSING_NODE___BRING_BACK_CONFIGURATION);
		createEOperation(processingNodeEClass, PROCESSING_NODE___BRING_BACK_DEPLOYMENT);
		createEOperation(processingNodeEClass, PROCESSING_NODE___ABORT_LAUNCHING);

		physicalProcessingNodeEClass = createEClass(PHYSICAL_PROCESSING_NODE);
		createEAttribute(physicalProcessingNodeEClass, PHYSICAL_PROCESSING_NODE__OS);

		virtualProcessingNodeEClass = createEClass(VIRTUAL_PROCESSING_NODE);
		createEAttribute(virtualProcessingNodeEClass, VIRTUAL_PROCESSING_NODE__EXTERNAL_IP);

		awsVirtualProcessingNodeEClass = createEClass(AWS_VIRTUAL_PROCESSING_NODE);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__VPC);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__SUB_NET);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__AMI);
		createEAttribute(awsVirtualProcessingNodeEClass, AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE);

		resourceClusterEClass = createEClass(RESOURCE_CLUSTER);
		createEReference(resourceClusterEClass, RESOURCE_CLUSTER__RESOURCES);

		nodeClusterEClass = createEClass(NODE_CLUSTER);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__BANDWITH);

		platformServerEClass = createEClass(PLATFORM_SERVER);
		createEReference(platformServerEClass, PLATFORM_SERVER__HOST);
		createEReference(platformServerEClass, PLATFORM_SERVER__TARGET);
		createEReference(platformServerEClass, PLATFORM_SERVER__CONTAINER);

		serializationServerEClass = createEClass(SERIALIZATION_SERVER);

		avroServerEClass = createEClass(AVRO_SERVER);

		distributionServerEClass = createEClass(DISTRIBUTION_SERVER);

		zookeeperServerEClass = createEClass(ZOOKEEPER_SERVER);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__SERVER_ID);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__TICK_TIME);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__LEADER_SERVERS);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__INIT_LIMIT);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__SYNC_LIMIT);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__CLIENT_PORT);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__PEER_PORT);
		createEAttribute(zookeeperServerEClass, ZOOKEEPER_SERVER__LEADER_PORT);

		communicationServerEClass = createEClass(COMMUNICATION_SERVER);

		kafkaServerEClass = createEClass(KAFKA_SERVER);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__COMM_ID);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__AUTO_CREATE_TOPIC_ENABLE);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__DELETE_TOPIC_ENABLE);
		createEReference(kafkaServerEClass, KAFKA_SERVER__ZOOKEEPER_CONNECT);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__ZOOKEEPER_CONNECTION_TIMEOUT);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__NUM_PARTITIONS);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__NUM_RECOVERY_THREADS_PER_DATA_DIR);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__LOG_FLUSH_INTERVAL_MESSAGES);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__LOG_FLUSH_INTERVAL);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__LISTENERS);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__ADVERTISED_LISTENERS);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__NUM_NETWORK_THREADS);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__NUM_IO_THREADS);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__SOCKET_SEND_BUFFER_BYTES);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__SOCKET_RECEIVE_BUFFER_BYTES);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__SOCKET_REQUEST_MAX_BYTES);
		createEAttribute(kafkaServerEClass, KAFKA_SERVER__CLIENT_PORT);

		schedulingServerEClass = createEClass(SCHEDULING_SERVER);
		createEReference(schedulingServerEClass, SCHEDULING_SERVER__WORKFLOWS);

		nodeSchedulerEClass = createEClass(NODE_SCHEDULER);

		sparkServerEClass = createEClass(SPARK_SERVER);
		createEReference(sparkServerEClass, SPARK_SERVER__LOAD);
		createEAttribute(sparkServerEClass, SPARK_SERVER__DRIVER_CORES);
		createEAttribute(sparkServerEClass, SPARK_SERVER__DRIVER_MAX_RESULT_SIZE);
		createEAttribute(sparkServerEClass, SPARK_SERVER__DRIVER_MEMORY);
		createEAttribute(sparkServerEClass, SPARK_SERVER__LOCAL_DIR);
		createEReference(sparkServerEClass, SPARK_SERVER__MASTER);
		createEAttribute(sparkServerEClass, SPARK_SERVER__WINDOW_SIZE);
		createEAttribute(sparkServerEClass, SPARK_SERVER__EXECUTOR_MEMORY);
		createEAttribute(sparkServerEClass, SPARK_SERVER__EXTRA_LISTENER);
		createEAttribute(sparkServerEClass, SPARK_SERVER__LOG_CONF);
		createEAttribute(sparkServerEClass, SPARK_SERVER__SUBMIT_DEPLOY_MODE);
		createEAttribute(sparkServerEClass, SPARK_SERVER__LOG_CALLER_CONTEXT);
		createEAttribute(sparkServerEClass, SPARK_SERVER__DRIVER_SUPERVISER);

		stormServerEClass = createEClass(STORM_SERVER);
		createEReference(stormServerEClass, STORM_SERVER__ZOOKEEPER_CONNECT);
		createEAttribute(stormServerEClass, STORM_SERVER__LOCAL_DIR);
		createEReference(stormServerEClass, STORM_SERVER__NIMBUS_SEEDS);
		createEAttribute(stormServerEClass, STORM_SERVER__SUPERVISOR_SLOT_PORTS);
		createEReference(stormServerEClass, STORM_SERVER__DRPC_SERVERS);
		createEReference(stormServerEClass, STORM_SERVER__SUPERVISORS);
		createEAttribute(stormServerEClass, STORM_SERVER__UI_PORT);
		createEAttribute(stormServerEClass, STORM_SERVER__IS_NIMBUS);

		persistenceServerEClass = createEClass(PERSISTENCE_SERVER);
		createEAttribute(persistenceServerEClass, PERSISTENCE_SERVER__LOGGING);
		createEAttribute(persistenceServerEClass, PERSISTENCE_SERVER__PASSWD);
		createEAttribute(persistenceServerEClass, PERSISTENCE_SERVER__PORT);

		memSQLServerEClass = createEClass(MEM_SQL_SERVER);

		cassandraServerEClass = createEClass(CASSANDRA_SERVER);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__NUM_TOKENS);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__SEEDS);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__SEED_PROVIDER_CLASS);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__LISTEN_ADDRESS);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__RPC_ADDRESS);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__ENDPOINT_SNITCH);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__DATA_CENTER);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__DATA_FILE_DIR);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__NATIVE_TRANSPORT_PORT);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__RACK);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__AUTO_BOOTSTRAP);
		createEReference(cassandraServerEClass, CASSANDRA_SERVER__CQL_SCHEMAS);
		createEAttribute(cassandraServerEClass, CASSANDRA_SERVER__IS_SEED);

		neo4JServerEClass = createEClass(NEO4_JSERVER);

		monitoringServerEClass = createEClass(MONITORING_SERVER);
		createEReference(monitoringServerEClass, MONITORING_SERVER__MONITORIZED_METERS);

		prometheusServerEClass = createEClass(PROMETHEUS_SERVER);
		createEReference(prometheusServerEClass, PROMETHEUS_SERVER__EXPORTERS_DATA);

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

		systemComponentEClass = createEClass(SYSTEM_COMPONENT);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__ARTIFACT_NAME);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__ARTIFACT_LOCATOR);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__ARGUMENTS);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__CONFIG_FOLDER_PATH);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__DATA_FOLDER_PATH);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__LOG_FOLDER_PATH);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__IS_RUNNING);
		createEOperation(systemComponentEClass, SYSTEM_COMPONENT___DEPLOY);

		fileDescriptorEClass = createEClass(FILE_DESCRIPTOR);
		createEAttribute(fileDescriptorEClass, FILE_DESCRIPTOR__FILE_PATH);
		createEAttribute(fileDescriptorEClass, FILE_DESCRIPTOR__FILE_NAME);

		deploymentFileDescriptorEClass = createEClass(DEPLOYMENT_FILE_DESCRIPTOR);
		createEAttribute(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT);
		createEAttribute(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE);
		createEReference(deploymentFileDescriptorEClass, DEPLOYMENT_FILE_DESCRIPTOR__OWNER);

		artifactDescriptorEClass = createEClass(ARTIFACT_DESCRIPTOR);
		createEAttribute(artifactDescriptorEClass, ARTIFACT_DESCRIPTOR__FILE_LOCATOR);

		exceptionEClass = createEClass(EXCEPTION);

		configurationExceptionEClass = createEClass(CONFIGURATION_EXCEPTION);

		deploymentExceptionEClass = createEClass(DEPLOYMENT_EXCEPTION);

		launchExceptionEClass = createEClass(LAUNCH_EXCEPTION);

		exporterDataEClass = createEClass(EXPORTER_DATA);
		createEAttribute(exporterDataEClass, EXPORTER_DATA__NAME);
		createEAttribute(exporterDataEClass, EXPORTER_DATA__ARTIFACT);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__HOST);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__SERVICE);

		containerizationServerEClass = createEClass(CONTAINERIZATION_SERVER);

		dockerServerEClass = createEClass(DOCKER_SERVER);
		createEReference(dockerServerEClass, DOCKER_SERVER__STACKS);
		createEReference(dockerServerEClass, DOCKER_SERVER__SWARM_CLUSTER);

		orchestrationServerEClass = createEClass(ORCHESTRATION_SERVER);

		swarmServerEClass = createEClass(SWARM_SERVER);

		swarmClusterEClass = createEClass(SWARM_CLUSTER);
		createEReference(swarmClusterEClass, SWARM_CLUSTER__WORKERS);
		createEReference(swarmClusterEClass, SWARM_CLUSTER__MANAGER);

		stackEClass = createEClass(STACK);
		createEReference(stackEClass, STACK__SERVICES);
		createEReference(stackEClass, STACK__SWARM_CLUSTER);
		createEAttribute(stackEClass, STACK__VERSION);
		createEReference(stackEClass, STACK__NETWORKS);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__STACK);
		createEAttribute(serviceEClass, SERVICE__ENV_FILE);
		createEReference(serviceEClass, SERVICE__ENV);
		createEReference(serviceEClass, SERVICE__DEPENDS_ON);
		createEReference(serviceEClass, SERVICE__IMAGE);
		createEReference(serviceEClass, SERVICE__VOLUMES);
		createEReference(serviceEClass, SERVICE__PORTS);
		createEReference(serviceEClass, SERVICE__NETWORKS);
		createEReference(serviceEClass, SERVICE__DEPLOYMENT_PARAM);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TARGET);
		createEAttribute(portEClass, PORT__PUBLISHED);
		createEAttribute(portEClass, PORT__PROTOCOL);
		createEAttribute(portEClass, PORT__MODE);

		serviceNetworkEClass = createEClass(SERVICE_NETWORK);
		createEAttribute(serviceNetworkEClass, SERVICE_NETWORK__IPV4_ADDRESS);
		createEAttribute(serviceNetworkEClass, SERVICE_NETWORK__ALIASES);
		createEReference(serviceNetworkEClass, SERVICE_NETWORK__NETWORK);

		swarmNetworkEClass = createEClass(SWARM_NETWORK);
		createEReference(swarmNetworkEClass, SWARM_NETWORK__SUBNETS);
		createEAttribute(swarmNetworkEClass, SWARM_NETWORK__DRIVER);

		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__REPOSITORY);
		createEAttribute(imageEClass, IMAGE__TAG);
		createEAttribute(imageEClass, IMAGE__DOCKER_FILE);
		createEAttribute(imageEClass, IMAGE__DESCRIPTION);
		createEAttribute(imageEClass, IMAGE__SIZE);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__SOURCE);
		createEAttribute(volumeEClass, VOLUME__TARGET);
		createEAttribute(volumeEClass, VOLUME__READ_ONLY);
		createEAttribute(volumeEClass, VOLUME__TYPE);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__REPLICAS);
		createEReference(deploymentEClass, DEPLOYMENT__PLACEMENT);
		createEReference(deploymentEClass, DEPLOYMENT__RESTART_POLICY);

		registryEClass = createEClass(REGISTRY);
		createEAttribute(registryEClass, REGISTRY__URL);
		createEReference(registryEClass, REGISTRY__REPOSITORIES);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__IMAGES);
		createEAttribute(repositoryEClass, REPOSITORY__IS_PRIVATE);

		// Create enums
		externalElementTypeEEnum = createEEnum(EXTERNAL_ELEMENT_TYPE);
		systemComponentTypeEEnum = createEEnum(SYSTEM_COMPONENT_TYPE);
		portModeEEnum = createEEnum(PORT_MODE);
		protocolEEnum = createEEnum(PROTOCOL);
		networkDriverEEnum = createEEnum(NETWORK_DRIVER);
		volumeTypeEEnum = createEEnum(VOLUME_TYPE);

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
		systemExternalElementEClass.getESuperTypes().add(this.getSystemElement());
		platformResourceEClass.getESuperTypes().add(this.getSystemElement());
		processingNodeEClass.getESuperTypes().add(this.getPlatformResource());
		physicalProcessingNodeEClass.getESuperTypes().add(this.getProcessingNode());
		virtualProcessingNodeEClass.getESuperTypes().add(this.getProcessingNode());
		awsVirtualProcessingNodeEClass.getESuperTypes().add(this.getVirtualProcessingNode());
		resourceClusterEClass.getESuperTypes().add(this.getPlatformResource());
		nodeClusterEClass.getESuperTypes().add(this.getResourceCluster());
		networkEClass.getESuperTypes().add(this.getPlatformResource());
		platformServerEClass.getESuperTypes().add(this.getPlatformResource());
		platformServerEClass.getESuperTypes().add(this.getSystemComponent());
		serializationServerEClass.getESuperTypes().add(this.getPlatformServer());
		avroServerEClass.getESuperTypes().add(this.getSerializationServer());
		distributionServerEClass.getESuperTypes().add(this.getPlatformServer());
		zookeeperServerEClass.getESuperTypes().add(this.getDistributionServer());
		zookeeperServerEClass.getESuperTypes().add(this.getSystemComponent());
		communicationServerEClass.getESuperTypes().add(this.getPlatformServer());
		kafkaServerEClass.getESuperTypes().add(this.getCommunicationServer());
		kafkaServerEClass.getESuperTypes().add(this.getSystemComponent());
		schedulingServerEClass.getESuperTypes().add(this.getPlatformServer());
		nodeSchedulerEClass.getESuperTypes().add(this.getSchedulingServer());
		sparkServerEClass.getESuperTypes().add(this.getSchedulingServer());
		sparkServerEClass.getESuperTypes().add(this.getSystemComponent());
		stormServerEClass.getESuperTypes().add(this.getSchedulingServer());
		stormServerEClass.getESuperTypes().add(this.getSystemComponent());
		persistenceServerEClass.getESuperTypes().add(this.getPlatformServer());
		memSQLServerEClass.getESuperTypes().add(this.getPersistenceServer());
		memSQLServerEClass.getESuperTypes().add(this.getSystemComponent());
		cassandraServerEClass.getESuperTypes().add(this.getPersistenceServer());
		cassandraServerEClass.getESuperTypes().add(this.getSystemComponent());
		neo4JServerEClass.getESuperTypes().add(this.getPersistenceServer());
		neo4JServerEClass.getESuperTypes().add(this.getSystemComponent());
		monitoringServerEClass.getESuperTypes().add(this.getPlatformServer());
		prometheusServerEClass.getESuperTypes().add(this.getMonitoringServer());
		prometheusServerEClass.getESuperTypes().add(this.getSystemComponent());
		streamDataEClass.getESuperTypes().add(this.getSystemComponent());
		workflowStreamDataEClass.getESuperTypes().add(this.getNamedElement());
		workflowStreamDataEClass.getESuperTypes().add(this.getStreamData());
		flowStreamDataEClass.getESuperTypes().add(this.getWorkflowStreamData());
		kafkaFlowStreamDataEClass.getESuperTypes().add(this.getFlowStreamData());
		derivedStreamDataEClass.getESuperTypes().add(this.getWorkflowStreamData());
		workloadStreamDataEClass.getESuperTypes().add(this.getSystemElement());
		workloadStreamDataEClass.getESuperTypes().add(this.getStreamData());
		kafkaWorkloadStreamDataEClass.getESuperTypes().add(this.getWorkloadStreamData());
		workflowEClass.getESuperTypes().add(this.getSystemElement());
		workflowEClass.getESuperTypes().add(this.getSystemComponent());
		schedulableSetEClass.getESuperTypes().add(this.getSystemElement());
		taskEClass.getESuperTypes().add(this.getNamedElement());
		taskExecutorEClass.getESuperTypes().add(this.getNamedElement());
		taskExecutorEClass.getESuperTypes().add(this.getSystemComponent());
		metricEClass.getESuperTypes().add(this.getSystemElement());
		processingNodeUtilizationEClass.getESuperTypes().add(this.getMetric());
		processingNodeMemoryEClass.getESuperTypes().add(this.getMetric());
		networkUtilizationEClass.getESuperTypes().add(this.getMetric());
		workflowLatencyEClass.getESuperTypes().add(this.getMetric());
		taskProcessingAmountEClass.getESuperTypes().add(this.getMetric());
		streamDataRateEClass.getESuperTypes().add(this.getMetric());
		meterEClass.getESuperTypes().add(this.getNamedElement());
		prometheusMeterEClass.getESuperTypes().add(this.getMeter());
		nodeHostedMeterEClass.getESuperTypes().add(this.getSystemComponent());
		nodeHostedMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		nodeResourceMeterEClass.getESuperTypes().add(this.getNodeHostedMeter());
		communicationMeterEClass.getESuperTypes().add(this.getNodeHostedMeter());
		streamRateMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		workflowLatencyMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		taskProcessingAmountMeterEClass.getESuperTypes().add(this.getPrometheusMeter());
		deploymentFileDescriptorEClass.getESuperTypes().add(this.getFileDescriptor());
		artifactDescriptorEClass.getESuperTypes().add(this.getFileDescriptor());
		configurationExceptionEClass.getESuperTypes().add(this.getException());
		deploymentExceptionEClass.getESuperTypes().add(this.getException());
		launchExceptionEClass.getESuperTypes().add(this.getException());
		containerEClass.getESuperTypes().add(this.getPlatformResource());
		dockerContainerEClass.getESuperTypes().add(this.getContainer());
		containerizationServerEClass.getESuperTypes().add(this.getPlatformServer());
		dockerServerEClass.getESuperTypes().add(this.getContainerizationServer());
		orchestrationServerEClass.getESuperTypes().add(this.getPlatformServer());
		swarmServerEClass.getESuperTypes().add(this.getOrchestrationServer());
		swarmClusterEClass.getESuperTypes().add(this.getResourceCluster());
		stackEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		swarmNetworkEClass.getESuperTypes().add(this.getNamedElement());
		imageEClass.getESuperTypes().add(this.getNamedElement());
		registryEClass.getESuperTypes().add(this.getSystemElement());
		repositoryEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(computationalSystemEClass, ComputationalSystem.class, "ComputationalSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputationalSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Date(), ecorePackage.getEString(), "date", null, 1, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Authors(), ecorePackage.getEString(), "authors", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_TargetPlatformName(), ecorePackage.getEString(), "targetPlatformName", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalSystem_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationalSystem_OwnedElements(), this.getSystemElement(), this.getSystemElement_Owner(), "ownedElements", null, 0, -1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputationalSystem_ReferencedSystems(), this.getSystemAdapter(), this.getSystemAdapter_SystemTarget(), "referencedSystems", null, 0, -1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationalSystem_AuthenticationFiles(), this.getStringToStringMap(), null, "authenticationFiles", null, 0, -1, ComputationalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComputationalSystem__DeployAndLaunch(), null, "deployAndLaunch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementEClass, SystemElement.class, "SystemElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemElement_Owner(), this.getComputationalSystem(), this.getComputationalSystem_OwnedElements(), "owner", null, 1, 1, SystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemExternalElementEClass, SystemExternalElement.class, "SystemExternalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemExternalElement_ElementType(), this.getExternalElementType(), "elementType", null, 0, 1, SystemExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemAdapterEClass, SystemAdapter.class, "SystemAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemAdapter_IdPrefix(), ecorePackage.getEString(), "idPrefix", null, 1, 1, SystemAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAdapter_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, SystemAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAdapter_ElemMapping(), this.getSystemElementAdapter(), null, "elemMapping", null, 0, -1, SystemAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAdapter_SystemTarget(), this.getComputationalSystem(), this.getComputationalSystem_ReferencedSystems(), "systemTarget", null, 1, 1, SystemAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAdapter_TargetSysLocator(), ecorePackage.getEString(), "targetSysLocator", null, 0, 1, SystemAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemElementAdapterEClass, SystemElementAdapter.class, "SystemElementAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemElementAdapter_ElemName(), ecorePackage.getEString(), "elemName", null, 1, 1, SystemElementAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemElementAdapter_SourceElemId(), ecorePackage.getEString(), "sourceElemId", null, 1, 1, SystemElementAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemElementAdapter_TargetElemId(), ecorePackage.getEString(), "targetElemId", null, 1, 1, SystemElementAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformResourceEClass, PlatformResource.class, "PlatformResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingNodeEClass, ProcessingNode.class, "ProcessingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingNode_ConcurrencyLevel(), ecorePackage.getEInt(), "concurrencyLevel", "1", 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_MemorySize(), ecorePackage.getEInt(), "memorySize", null, 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_SpeedFactor(), ecorePackage.getEDouble(), "speedFactor", "1.0", 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_ConnectedTo(), this.getNetwork(), null, "connectedTo", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_PropertyConfigData(), this.getProperties(), "propertyConfigData", null, 0, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_LaunchingScripts(), this.getDeploymentFileDescriptor(), this.getDeploymentFileDescriptor_Owner(), "launchingScripts", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_ConfigFiles(), this.getDeploymentFileDescriptor(), null, "configFiles", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_CodeFiles(), this.getArtifactDescriptor(), null, "codeFiles", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingNode_OwnedMeters(), this.getNodeHostedMeter(), this.getNodeHostedMeter_Owner(), "ownedMeters", null, 0, -1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_Ip(), ecorePackage.getEString(), "ip", null, 1, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingNode_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, ProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcessingNode__PrepareForDeployment(), null, "prepareForDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getConfigurationException());

		op = initEOperation(getProcessingNode__DeployAndLaunch(), null, "deployAndLaunch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getLaunchException());
		addEException(op, this.getDeploymentException());

		initEOperation(getProcessingNode__BringBackConfiguration(), null, "bringBackConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessingNode__BringBackDeployment(), null, "bringBackDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessingNode__AbortLaunching(), null, "abortLaunching", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalProcessingNodeEClass, PhysicalProcessingNode.class, "PhysicalProcessingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalProcessingNode_Os(), ecorePackage.getEString(), "os", null, 0, 1, PhysicalProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualProcessingNodeEClass, VirtualProcessingNode.class, "VirtualProcessingNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualProcessingNode_ExternalIP(), ecorePackage.getEString(), "externalIP", null, 1, 1, VirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsVirtualProcessingNodeEClass, AWSVirtualProcessingNode.class, "AWSVirtualProcessingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAWSVirtualProcessingNode_Vpc(), ecorePackage.getEString(), "vpc", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_SubNet(), ecorePackage.getEString(), "subNet", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_KeyPair(), ecorePackage.getEString(), "keyPair", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_AMI(), ecorePackage.getEString(), "AMI", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSVirtualProcessingNode_InstanceType(), ecorePackage.getEString(), "instanceType", null, 1, 1, AWSVirtualProcessingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceClusterEClass, ResourceCluster.class, "ResourceCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceCluster_Resources(), this.getPlatformResource(), null, "resources", null, 1, -1, ResourceCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeClusterEClass, NodeCluster.class, "NodeCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Bandwith(), ecorePackage.getEDouble(), "bandwith", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformServerEClass, PlatformServer.class, "PlatformServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformServer_Host(), this.getProcessingNode(), null, "host", null, 0, 1, PlatformServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformServer_Target(), this.getResourceCluster(), null, "target", null, 1, 1, PlatformServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformServer_Container(), this.getContainer(), null, "container", null, 0, 1, PlatformServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializationServerEClass, SerializationServer.class, "SerializationServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avroServerEClass, AVROServer.class, "AVROServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributionServerEClass, DistributionServer.class, "DistributionServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zookeeperServerEClass, ZookeeperServer.class, "ZookeeperServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZookeeperServer_ServerId(), ecorePackage.getEInt(), "serverId", null, 1, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_TickTime(), ecorePackage.getELong(), "tickTime", "2000", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_LeaderServers(), ecorePackage.getEBoolean(), "leaderServers", "true", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_InitLimit(), ecorePackage.getEInt(), "initLimit", "5", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_SyncLimit(), ecorePackage.getEInt(), "syncLimit", "3", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_ClientPort(), ecorePackage.getEInt(), "clientPort", "2181", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_PeerPort(), ecorePackage.getEInt(), "peerPort", "2888", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZookeeperServer_LeaderPort(), ecorePackage.getEInt(), "leaderPort", "3888", 0, 1, ZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationServerEClass, CommunicationServer.class, "CommunicationServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kafkaServerEClass, KafkaServer.class, "KafkaServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKafkaServer_CommId(), ecorePackage.getEInt(), "commId", null, 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_AutoCreateTopicEnable(), ecorePackage.getEBoolean(), "autoCreateTopicEnable", "false", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_DeleteTopicEnable(), ecorePackage.getEBoolean(), "deleteTopicEnable", "false", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKafkaServer_ZookeeperConnect(), this.getResourceCluster(), null, "zookeeperConnect", null, 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_ZookeeperConnectionTimeout(), ecorePackage.getEInt(), "zookeeperConnectionTimeout", "6000", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_NumPartitions(), ecorePackage.getEInt(), "numPartitions", "1", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_NumRecoveryThreadsPerDataDir(), ecorePackage.getEInt(), "numRecoveryThreadsPerDataDir", "1", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_LogFlushIntervalMessages(), ecorePackage.getEInt(), "logFlushIntervalMessages", "10000", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_LogFlushInterval(), ecorePackage.getEInt(), "logFlushInterval", "1000", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_Listeners(), ecorePackage.getEString(), "listeners", "\u201dPLAINTEXT\u201d", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_AdvertisedListeners(), ecorePackage.getEString(), "advertisedListeners", "PLAINTEXT", 0, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_NumNetworkThreads(), ecorePackage.getEInt(), "numNetworkThreads", "3", 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_NumIOThreads(), ecorePackage.getEInt(), "numIOThreads", "8", 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_SocketSendBufferBytes(), ecorePackage.getEInt(), "socketSendBufferBytes", "102400", 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_SocketReceiveBufferBytes(), ecorePackage.getEInt(), "socketReceiveBufferBytes", "102400", 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_SocketRequestMaxBytes(), ecorePackage.getEInt(), "socketRequestMaxBytes", "104857600", 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKafkaServer_ClientPort(), ecorePackage.getEInt(), "clientPort", null, 1, 1, KafkaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingServerEClass, SchedulingServer.class, "SchedulingServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingServer_Workflows(), this.getWorkflow(), this.getWorkflow_Scheduler(), "workflows", null, 0, -1, SchedulingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSchedulerEClass, NodeScheduler.class, "NodeScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sparkServerEClass, SparkServer.class, "SparkServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSparkServer_Load(), this.getSchedulableSet(), null, "load", null, 1, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_DriverCores(), ecorePackage.getEInt(), "driverCores", "1", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_DriverMaxResultSize(), ecorePackage.getEString(), "driverMaxResultSize", "1g", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_DriverMemory(), ecorePackage.getELong(), "driverMemory", "1000000000", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_LocalDir(), ecorePackage.getEString(), "localDir", "/home/apache/spark/localDir", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSparkServer_Master(), this.getResourceCluster(), null, "master", null, 1, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_WindowSize(), ecorePackage.getEInt(), "windowSize", null, 1, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_ExecutorMemory(), ecorePackage.getELong(), "executorMemory", "1000000000", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_ExtraListener(), ecorePackage.getEString(), "extraListener", null, 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_LogConf(), ecorePackage.getEBoolean(), "logConf", "false", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_SubmitDeployMode(), ecorePackage.getEString(), "submitDeployMode", null, 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_LogCallerContext(), ecorePackage.getEString(), "logCallerContext", null, 1, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSparkServer_DriverSuperviser(), ecorePackage.getEBoolean(), "driverSuperviser", "false", 0, 1, SparkServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stormServerEClass, StormServer.class, "StormServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStormServer_ZookeeperConnect(), this.getResourceCluster(), null, "zookeeperConnect", null, 1, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStormServer_LocalDir(), ecorePackage.getEString(), "localDir", "storm-local", 0, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormServer_NimbusSeeds(), this.getNodeCluster(), null, "nimbusSeeds", null, 1, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStormServer_SupervisorSlotPorts(), ecorePackage.getEInt(), "supervisorSlotPorts", null, 0, -1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormServer_DrpcServers(), this.getNodeCluster(), null, "drpcServers", null, 0, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStormServer_Supervisors(), this.getNodeCluster(), null, "supervisors", null, 1, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStormServer_UiPort(), ecorePackage.getEInt(), "uiPort", "8080", 0, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStormServer_IsNimbus(), ecorePackage.getEBoolean(), "isNimbus", null, 1, 1, StormServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceServerEClass, PersistenceServer.class, "PersistenceServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceServer_Logging(), ecorePackage.getEString(), "logging", null, 1, 1, PersistenceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceServer_Passwd(), ecorePackage.getEString(), "passwd", null, 1, 1, PersistenceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceServer_Port(), ecorePackage.getEInt(), "port", "9098", 0, 1, PersistenceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memSQLServerEClass, MemSQLServer.class, "MemSQLServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cassandraServerEClass, CassandraServer.class, "CassandraServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCassandraServer_NumTokens(), ecorePackage.getEInt(), "numTokens", "256", 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_Seeds(), this.getResourceCluster(), null, "seeds", null, 1, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_SeedProviderClass(), ecorePackage.getEString(), "seedProviderClass", null, 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_ListenAddress(), this.getProcessingNode(), null, "listenAddress", null, 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_RpcAddress(), this.getProcessingNode(), null, "rpcAddress", null, 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_EndpointSnitch(), ecorePackage.getEString(), "endpointSnitch", "SimpleSnitch", 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_DataCenter(), this.getResourceCluster(), null, "dataCenter", null, 1, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_DataFileDir(), ecorePackage.getEString(), "dataFileDir", null, 1, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_NativeTransportPort(), ecorePackage.getEInt(), "nativeTransportPort", "9042", 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_Rack(), this.getResourceCluster(), null, "rack", null, 1, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_AutoBootstrap(), ecorePackage.getEBoolean(), "autoBootstrap", "false", 1, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCassandraServer_CqlSchemas(), this.getFileDescriptor(), null, "cqlSchemas", null, 0, -1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCassandraServer_IsSeed(), ecorePackage.getEBoolean(), "isSeed", null, 0, 1, CassandraServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neo4JServerEClass, Neo4JServer.class, "Neo4JServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitoringServerEClass, MonitoringServer.class, "MonitoringServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitoringServer_MonitorizedMeters(), this.getMeter(), this.getMeter_MonitoringServer(), "monitorizedMeters", null, 0, -1, MonitoringServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prometheusServerEClass, PrometheusServer.class, "PrometheusServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrometheusServer_ExportersData(), this.getExporterData(), null, "exportersData", null, 0, -1, PrometheusServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamDataEClass, StreamData.class, "StreamData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreamData_Retention_ms(), ecorePackage.getELong(), "retention_ms", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_Retention_bytes(), ecorePackage.getEInt(), "retention_bytes", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_CleanupPolicy(), ecorePackage.getEBoolean(), "cleanupPolicy", "false", 0, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_NumPartitions(), ecorePackage.getEInt(), "numPartitions", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_NumReplication(), ecorePackage.getEInt(), "numReplication", null, 1, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamData_OwnedMeters(), this.getStreamRateMeter(), this.getStreamRateMeter_Owner(), "ownedMeters", null, 0, -1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamData_AssignedPartition(), this.getStreamDataPartition(), null, "assignedPartition", null, 0, -1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamData_MessageSize(), ecorePackage.getEInt(), "messageSize", null, 0, 1, StreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getFlowStreamData_Holder(), this.getCommunicationServer(), null, "holder", null, 0, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowStreamData_IsImplemented(), ecorePackage.getEBoolean(), "isImplemented", null, 0, 1, FlowStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaFlowStreamDataEClass, KafkaFlowStreamData.class, "KafkaFlowStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedStreamDataEClass, DerivedStreamData.class, "DerivedStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedStreamData_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, DerivedStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedStreamData_Inputs(), this.getStreamData(), null, "inputs", null, 1, -1, DerivedStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadStreamDataEClass, WorkloadStreamData.class, "WorkloadStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkloadStreamData_Holder(), this.getCommunicationServer(), null, "holder", null, 1, 1, WorkloadStreamData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kafkaWorkloadStreamDataEClass, KafkaWorkloadStreamData.class, "KafkaWorkloadStreamData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_OwnedStreamData(), this.getWorkflowStreamData(), this.getWorkflowStreamData_Owner(), "ownedStreamData", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_OwnedTasks(), this.getTask(), this.getTask_Owner(), "ownedTasks", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_RootTask(), this.getTask(), null, "rootTask", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_OwnedTaskExecutors(), this.getTaskExecutor(), this.getTaskExecutor_Owner(), "ownedTaskExecutors", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Scheduler(), this.getSchedulingServer(), this.getSchedulingServer_Workflows(), "scheduler", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getTaskProcessingAmount_HistogramBuckectNum(), ecorePackage.getEInt(), "histogramBuckectNum", "11", 0, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_ExpectedMaxTPA(), ecorePackage.getELong(), "expectedMaxTPA", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_ExpectedMinTPA(), ecorePackage.getELong(), "expectedMinTPA", null, 1, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskProcessingAmount_LinearBucketDistribution(), ecorePackage.getEBoolean(), "linearBucketDistribution", "true", 0, 1, TaskProcessingAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamDataRateEClass, StreamDataRate.class, "StreamDataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamDataRate_Target(), this.getStreamData(), null, "target", null, 1, 1, StreamDataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamDataRate_Meter(), this.getStreamRateMeter(), this.getStreamRateMeter_Metric(), "meter", null, 1, 1, StreamDataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeter_MonitoringServer(), this.getMonitoringServer(), this.getMonitoringServer_MonitorizedMeters(), "monitoringServer", null, 0, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prometheusMeterEClass, PrometheusMeter.class, "PrometheusMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrometheusMeter_MonitoringPort(), ecorePackage.getEInt(), "monitoringPort", null, 0, 1, PrometheusMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrometheusMeter_MonitoringTime(), ecorePackage.getELong(), "monitoringTime", null, 0, 1, PrometheusMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemComponent_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_ArtifactLocator(), ecorePackage.getEString(), "artifactLocator", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_ScriptFolderPath(), ecorePackage.getEString(), "scriptFolderPath", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_ConfigFolderPath(), ecorePackage.getEString(), "configFolderPath", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_DataFolderPath(), ecorePackage.getEString(), "dataFolderPath", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_LogFolderPath(), ecorePackage.getEString(), "logFolderPath", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemComponent_IsRunning(), ecorePackage.getEBoolean(), "isRunning", null, 1, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSystemComponent__Deploy(), null, "deploy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getConfigurationException());

		initEClass(fileDescriptorEClass, FileDescriptor.class, "FileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDescriptor_FilePath(), ecorePackage.getEString(), "filePath", null, 1, 1, FileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileDescriptor_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, FileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentFileDescriptorEClass, DeploymentFileDescriptor.class, "DeploymentFileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentFileDescriptor_FileContent(), ecorePackage.getEString(), "fileContent", null, 1, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploymentFileDescriptor_ElementType(), this.getSystemComponentType(), "elementType", null, 0, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentFileDescriptor_Owner(), this.getProcessingNode(), this.getProcessingNode_LaunchingScripts(), "owner", null, 0, 1, DeploymentFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactDescriptorEClass, ArtifactDescriptor.class, "ArtifactDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactDescriptor_FileLocator(), ecorePackage.getEString(), "fileLocator", null, 1, 1, ArtifactDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, Exception.class, "Exception", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationExceptionEClass, ConfigurationException.class, "ConfigurationException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentExceptionEClass, DeploymentException.class, "DeploymentException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(launchExceptionEClass, LaunchException.class, "LaunchException", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exporterDataEClass, ExporterData.class, "ExporterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExporterData_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExporterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExporterData_Artifact(), ecorePackage.getEString(), "artifact", null, 1, 1, ExporterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, PASYS_Metamodel.pasys.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Host(), this.getContainerizationServer(), null, "host", null, 1, 1, PASYS_Metamodel.pasys.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerEClass, DockerContainer.class, "DockerContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerContainer_Service(), this.getService(), null, "service", null, 1, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerizationServerEClass, ContainerizationServer.class, "ContainerizationServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dockerServerEClass, DockerServer.class, "DockerServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerServer_Stacks(), this.getStack(), null, "stacks", null, 0, -1, DockerServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerServer_SwarmCluster(), this.getSwarmCluster(), null, "swarmCluster", null, 0, 1, DockerServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orchestrationServerEClass, OrchestrationServer.class, "OrchestrationServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swarmServerEClass, SwarmServer.class, "SwarmServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swarmClusterEClass, SwarmCluster.class, "SwarmCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwarmCluster_Workers(), this.getDockerServer(), null, "workers", null, 1, -1, SwarmCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwarmCluster_Manager(), this.getDockerServer(), null, "manager", null, 1, 1, SwarmCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackEClass, Stack.class, "Stack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStack_Services(), this.getService(), this.getService_Stack(), "services", null, 1, -1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStack_SwarmCluster(), this.getSwarmCluster(), null, "swarmCluster", null, 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStack_Version(), ecorePackage.getEString(), "version", "3.7", 0, 1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStack_Networks(), this.getSwarmNetwork(), null, "networks", null, 0, -1, Stack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Stack(), this.getStack(), this.getStack_Services(), "stack", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_EnvFile(), ecorePackage.getEString(), "envFile", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Env(), this.getStringToStringMap(), null, "env", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_DependsOn(), this.getService(), null, "dependsOn", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Image(), this.getImage(), null, "image", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getPort(), null, "ports", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Networks(), this.getServiceNetwork(), null, "networks", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_DeploymentParam(), this.getDeployment(), null, "deploymentParam", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Target(), ecorePackage.getEString(), "target", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Published(), ecorePackage.getEString(), "published", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Protocol(), this.getProtocol(), "protocol", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Mode(), this.getPortMode(), "mode", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNetworkEClass, ServiceNetwork.class, "ServiceNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceNetwork_Ipv4Address(), ecorePackage.getEString(), "ipv4Address", null, 1, 1, ServiceNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceNetwork_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, ServiceNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceNetwork_Network(), this.getSwarmNetwork(), null, "network", null, 0, 1, ServiceNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swarmNetworkEClass, SwarmNetwork.class, "SwarmNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwarmNetwork_Subnets(), this.getStringToStringMap(), null, "subnets", null, 0, 1, SwarmNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwarmNetwork_Driver(), this.getNetworkDriver(), "driver", null, 1, 1, SwarmNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_Repository(), this.getRepository(), null, "repository", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_DockerFile(), ecorePackage.getEString(), "dockerFile", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Description(), ecorePackage.getEString(), "description", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Size(), ecorePackage.getEDouble(), "size", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Source(), ecorePackage.getEString(), "source", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Target(), ecorePackage.getEString(), "target", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Type(), this.getVolumeType(), "type", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Replicas(), ecorePackage.getEInt(), "replicas", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Placement(), this.getStringToStringMap(), null, "placement", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_RestartPolicy(), this.getStringToStringMap(), null, "restartPolicy", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryEClass, PASYS_Metamodel.pasys.Registry.class, "Registry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistry_Url(), ecorePackage.getEString(), "url", null, 1, 1, PASYS_Metamodel.pasys.Registry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegistry_Repositories(), this.getRepository(), null, "repositories", null, 1, -1, PASYS_Metamodel.pasys.Registry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Images(), this.getImage(), null, "images", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_IsPrivate(), ecorePackage.getEBoolean(), "isPrivate", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(externalElementTypeEEnum, ExternalElementType.class, "ExternalElementType");
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.PROCESSING_NODE);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.COMMUNICATION_SERVER);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.SCHEDULING_SERVER);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.NODE_CLUSTER);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.PLATFORM_RESOURCE);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.WORKFLOW);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.SCHEDULABLE_SET);
		addEEnumLiteral(externalElementTypeEEnum, ExternalElementType.TASK);

		initEEnum(systemComponentTypeEEnum, SystemComponentType.class, "SystemComponentType");
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.PROMETHEUS_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.ZOOKEEPER_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.KAFKA_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.CASSANDRA_SERVER_SEED);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.CASSANDRA_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.STORM_NIMBUS);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.STORM_SUPERVISOR);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.SPARK_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.KAFKA_WORKLOAD_STREAM);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.KAFKA_FLOW_STREAM);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.AVRO_SERVER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.NODE_RESOURCE_METER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.TASK_EXECUTOR);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.TASK_AMOUNT_METER);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.DOCKER_STACK);
		addEEnumLiteral(systemComponentTypeEEnum, SystemComponentType.WORKFLOW);

		initEEnum(portModeEEnum, PortMode.class, "PortMode");
		addEEnumLiteral(portModeEEnum, PortMode.PORT);
		addEEnumLiteral(portModeEEnum, PortMode.INGRESS);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.TCP);
		addEEnumLiteral(protocolEEnum, Protocol.UDP);

		initEEnum(networkDriverEEnum, NetworkDriver.class, "NetworkDriver");
		addEEnumLiteral(networkDriverEEnum, NetworkDriver.BRIDGE);
		addEEnumLiteral(networkDriverEEnum, NetworkDriver.OVERLAY);

		initEEnum(volumeTypeEEnum, VolumeType.class, "VolumeType");
		addEEnumLiteral(volumeTypeEEnum, VolumeType.VOLUME);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.BIND);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.TMPFS);
		addEEnumLiteral(volumeTypeEEnum, VolumeType.NPIPE);

		// Initialize data types
		initEDataType(propertiesEDataType, Properties.class, "Properties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PasysPackageImpl
