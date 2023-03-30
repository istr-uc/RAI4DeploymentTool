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
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceService;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.PlatformService;
import PASYS_Metamodel.pasys.PlatformServiceDeploymentConf;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusService;
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
import PASYS_Metamodel.pasys.SystemAdapter;
import PASYS_Metamodel.pasys.SystemElement;
import PASYS_Metamodel.pasys.SystemElementAdapter;
import PASYS_Metamodel.pasys.SystemExternalElement;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;
import PASYS_Metamodel.pasys.VirtualProcessingNode;
import PASYS_Metamodel.pasys.Volume;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatency;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkflowStreamData;
import PASYS_Metamodel.pasys.WorkloadStreamData;
import PASYS_Metamodel.pasys.ZookeeperService;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage
 * @generated
 */
public class PasysAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PasysPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PasysPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasysSwitch<Adapter> modelSwitch =
		new PasysSwitch<Adapter>() {
			@Override
			public Adapter caseComputationalSystem(ComputationalSystem object) {
				return createComputationalSystemAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseSystemElement(SystemElement object) {
				return createSystemElementAdapter();
			}
			@Override
			public Adapter caseSystemExternalElement(SystemExternalElement object) {
				return createSystemExternalElementAdapter();
			}
			@Override
			public Adapter caseSystemAdapter(SystemAdapter object) {
				return createSystemAdapterAdapter();
			}
			@Override
			public Adapter caseSystemElementAdapter(SystemElementAdapter object) {
				return createSystemElementAdapterAdapter();
			}
			@Override
			public Adapter casePlatformResource(PlatformResource object) {
				return createPlatformResourceAdapter();
			}
			@Override
			public Adapter caseProcessingNode(ProcessingNode object) {
				return createProcessingNodeAdapter();
			}
			@Override
			public Adapter casePhysicalProcessingNode(PhysicalProcessingNode object) {
				return createPhysicalProcessingNodeAdapter();
			}
			@Override
			public Adapter caseVirtualProcessingNode(VirtualProcessingNode object) {
				return createVirtualProcessingNodeAdapter();
			}
			@Override
			public Adapter caseAWSVirtualProcessingNode(AWSVirtualProcessingNode object) {
				return createAWSVirtualProcessingNodeAdapter();
			}
			@Override
			public Adapter caseProcessingResourceCluster(ProcessingResourceCluster object) {
				return createProcessingResourceClusterAdapter();
			}
			@Override
			public Adapter caseProcessingNodeCluster(ProcessingNodeCluster object) {
				return createProcessingNodeClusterAdapter();
			}
			@Override
			public Adapter caseOrchestrationCluster(OrchestrationCluster object) {
				return createOrchestrationClusterAdapter();
			}
			@Override
			public Adapter caseKubernetesCluster(KubernetesCluster object) {
				return createKubernetesClusterAdapter();
			}
			@Override
			public Adapter caseSwarmCluster(SwarmCluster object) {
				return createSwarmClusterAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter casePlatformService(PlatformService object) {
				return createPlatformServiceAdapter();
			}
			@Override
			public Adapter caseSerializationService(SerializationService object) {
				return createSerializationServiceAdapter();
			}
			@Override
			public Adapter caseDistributionService(DistributionService object) {
				return createDistributionServiceAdapter();
			}
			@Override
			public Adapter caseCommunicationService(CommunicationService object) {
				return createCommunicationServiceAdapter();
			}
			@Override
			public Adapter caseSchedulingService(SchedulingService object) {
				return createSchedulingServiceAdapter();
			}
			@Override
			public Adapter caseSecurityService(SecurityService object) {
				return createSecurityServiceAdapter();
			}
			@Override
			public Adapter casePersistenceService(PersistenceService object) {
				return createPersistenceServiceAdapter();
			}
			@Override
			public Adapter caseMonitoringService(MonitoringService object) {
				return createMonitoringServiceAdapter();
			}
			@Override
			public Adapter caseAVROService(AVROService object) {
				return createAVROServiceAdapter();
			}
			@Override
			public Adapter caseZookeeperService(ZookeeperService object) {
				return createZookeeperServiceAdapter();
			}
			@Override
			public Adapter caseKafkaService(KafkaService object) {
				return createKafkaServiceAdapter();
			}
			@Override
			public Adapter caseNodeScheduler(NodeScheduler object) {
				return createNodeSchedulerAdapter();
			}
			@Override
			public Adapter caseSparkService(SparkService object) {
				return createSparkServiceAdapter();
			}
			@Override
			public Adapter caseStormService(StormService object) {
				return createStormServiceAdapter();
			}
			@Override
			public Adapter caseStormUI(StormUI object) {
				return createStormUIAdapter();
			}
			@Override
			public Adapter caseStormNimbus(StormNimbus object) {
				return createStormNimbusAdapter();
			}
			@Override
			public Adapter caseStormSupervisor(StormSupervisor object) {
				return createStormSupervisorAdapter();
			}
			@Override
			public Adapter caseNeo4JService(Neo4JService object) {
				return createNeo4JServiceAdapter();
			}
			@Override
			public Adapter caseMemSQLService(MemSQLService object) {
				return createMemSQLServiceAdapter();
			}
			@Override
			public Adapter caseCassandraService(CassandraService object) {
				return createCassandraServiceAdapter();
			}
			@Override
			public Adapter caseDataCenter(DataCenter object) {
				return createDataCenterAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter casePrometheusService(PrometheusService object) {
				return createPrometheusServiceAdapter();
			}
			@Override
			public Adapter caseExporterData(ExporterData object) {
				return createExporterDataAdapter();
			}
			@Override
			public Adapter caseStreamData(StreamData object) {
				return createStreamDataAdapter();
			}
			@Override
			public Adapter caseStreamDataPartition(StreamDataPartition object) {
				return createStreamDataPartitionAdapter();
			}
			@Override
			public Adapter caseWorkflowStreamData(WorkflowStreamData object) {
				return createWorkflowStreamDataAdapter();
			}
			@Override
			public Adapter caseFlowStreamData(FlowStreamData object) {
				return createFlowStreamDataAdapter();
			}
			@Override
			public Adapter caseKafkaFlowStreamData(KafkaFlowStreamData object) {
				return createKafkaFlowStreamDataAdapter();
			}
			@Override
			public Adapter caseDerivedStreamData(DerivedStreamData object) {
				return createDerivedStreamDataAdapter();
			}
			@Override
			public Adapter caseWorkloadStreamData(WorkloadStreamData object) {
				return createWorkloadStreamDataAdapter();
			}
			@Override
			public Adapter caseKafkaWorkloadStreamData(KafkaWorkloadStreamData object) {
				return createKafkaWorkloadStreamDataAdapter();
			}
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseSchedulableSet(SchedulableSet object) {
				return createSchedulableSetAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskExecutor(TaskExecutor object) {
				return createTaskExecutorAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseProcessingNodeUtilization(ProcessingNodeUtilization object) {
				return createProcessingNodeUtilizationAdapter();
			}
			@Override
			public Adapter caseProcessingNodeMemory(ProcessingNodeMemory object) {
				return createProcessingNodeMemoryAdapter();
			}
			@Override
			public Adapter caseNetworkUtilization(NetworkUtilization object) {
				return createNetworkUtilizationAdapter();
			}
			@Override
			public Adapter caseWorkflowLatency(WorkflowLatency object) {
				return createWorkflowLatencyAdapter();
			}
			@Override
			public Adapter caseTaskProcessingAmount(TaskProcessingAmount object) {
				return createTaskProcessingAmountAdapter();
			}
			@Override
			public Adapter caseStreamDataRate(StreamDataRate object) {
				return createStreamDataRateAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter casePrometheusMeter(PrometheusMeter object) {
				return createPrometheusMeterAdapter();
			}
			@Override
			public Adapter caseNodeHostedMeter(NodeHostedMeter object) {
				return createNodeHostedMeterAdapter();
			}
			@Override
			public Adapter caseNodeResourceMeter(NodeResourceMeter object) {
				return createNodeResourceMeterAdapter();
			}
			@Override
			public Adapter caseCommunicationMeter(CommunicationMeter object) {
				return createCommunicationMeterAdapter();
			}
			@Override
			public Adapter caseStreamRateMeter(StreamRateMeter object) {
				return createStreamRateMeterAdapter();
			}
			@Override
			public Adapter caseWorkflowLatencyMeter(WorkflowLatencyMeter object) {
				return createWorkflowLatencyMeterAdapter();
			}
			@Override
			public Adapter caseTaskProcessingAmountMeter(TaskProcessingAmountMeter object) {
				return createTaskProcessingAmountMeterAdapter();
			}
			@Override
			public Adapter caseDeployableComponent(DeployableComponent object) {
				return createDeployableComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentConfiguration(DeploymentConfiguration object) {
				return createDeploymentConfigurationAdapter();
			}
			@Override
			public Adapter casePlatformServiceDeploymentConf(PlatformServiceDeploymentConf object) {
				return createPlatformServiceDeploymentConfAdapter();
			}
			@Override
			public Adapter caseOrchestratorDeploymentConf(OrchestratorDeploymentConf object) {
				return createOrchestratorDeploymentConfAdapter();
			}
			@Override
			public Adapter caseNodeDeploymentConf(NodeDeploymentConf object) {
				return createNodeDeploymentConfAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseSwarmPort(SwarmPort object) {
				return createSwarmPortAdapter();
			}
			@Override
			public Adapter caseKubernetesPort(KubernetesPort object) {
				return createKubernetesPortAdapter();
			}
			@Override
			public Adapter caseDeploymentConstraints(DeploymentConstraints object) {
				return createDeploymentConstraintsAdapter();
			}
			@Override
			public Adapter caseException(Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseConfigurationException(ConfigurationException object) {
				return createConfigurationExceptionAdapter();
			}
			@Override
			public Adapter caseDeploymentException(DeploymentException object) {
				return createDeploymentExceptionAdapter();
			}
			@Override
			public Adapter caseLaunchException(LaunchException object) {
				return createLaunchExceptionAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter caseFileDescriptor(FileDescriptor object) {
				return createFileDescriptorAdapter();
			}
			@Override
			public Adapter caseDeploymentFileDescriptor(DeploymentFileDescriptor object) {
				return createDeploymentFileDescriptorAdapter();
			}
			@Override
			public Adapter caseArtifactDescriptor(ArtifactDescriptor object) {
				return createArtifactDescriptorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ComputationalSystem <em>Computational System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem
	 * @generated
	 */
	public Adapter createComputationalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SystemElement
	 * @generated
	 */
	public Adapter createSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SystemExternalElement <em>System External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SystemExternalElement
	 * @generated
	 */
	public Adapter createSystemExternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SystemAdapter <em>System Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SystemAdapter
	 * @generated
	 */
	public Adapter createSystemAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SystemElementAdapter <em>System Element Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SystemElementAdapter
	 * @generated
	 */
	public Adapter createSystemElementAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PlatformResource <em>Platform Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PlatformResource
	 * @generated
	 */
	public Adapter createPlatformResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ProcessingNode <em>Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ProcessingNode
	 * @generated
	 */
	public Adapter createProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PhysicalProcessingNode <em>Physical Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PhysicalProcessingNode
	 * @generated
	 */
	public Adapter createPhysicalProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.VirtualProcessingNode <em>Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.VirtualProcessingNode
	 * @generated
	 */
	public Adapter createVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode <em>AWS Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode
	 * @generated
	 */
	public Adapter createAWSVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ProcessingResourceCluster <em>Processing Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ProcessingResourceCluster
	 * @generated
	 */
	public Adapter createProcessingResourceClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ProcessingNodeCluster <em>Processing Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeCluster
	 * @generated
	 */
	public Adapter createProcessingNodeClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.OrchestrationCluster <em>Orchestration Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.OrchestrationCluster
	 * @generated
	 */
	public Adapter createOrchestrationClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KubernetesCluster <em>Kubernetes Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KubernetesCluster
	 * @generated
	 */
	public Adapter createKubernetesClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SwarmCluster
	 * @generated
	 */
	public Adapter createSwarmClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PlatformService
	 * @generated
	 */
	public Adapter createPlatformServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SerializationService <em>Serialization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SerializationService
	 * @generated
	 */
	public Adapter createSerializationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.AVROService <em>AVRO Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.AVROService
	 * @generated
	 */
	public Adapter createAVROServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DistributionService <em>Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DistributionService
	 * @generated
	 */
	public Adapter createDistributionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ZookeeperService <em>Zookeeper Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ZookeeperService
	 * @generated
	 */
	public Adapter createZookeeperServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.CommunicationService <em>Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.CommunicationService
	 * @generated
	 */
	public Adapter createCommunicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KafkaService <em>Kafka Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KafkaService
	 * @generated
	 */
	public Adapter createKafkaServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SchedulingService <em>Scheduling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SchedulingService
	 * @generated
	 */
	public Adapter createSchedulingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SecurityService
	 * @generated
	 */
	public Adapter createSecurityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NodeScheduler <em>Node Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NodeScheduler
	 * @generated
	 */
	public Adapter createNodeSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SparkService <em>Spark Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SparkService
	 * @generated
	 */
	public Adapter createSparkServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StormService <em>Storm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StormService
	 * @generated
	 */
	public Adapter createStormServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StormUI <em>Storm UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StormUI
	 * @generated
	 */
	public Adapter createStormUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StormNimbus <em>Storm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StormNimbus
	 * @generated
	 */
	public Adapter createStormNimbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StormSupervisor <em>Storm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StormSupervisor
	 * @generated
	 */
	public Adapter createStormSupervisorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PersistenceService
	 * @generated
	 */
	public Adapter createPersistenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.MemSQLService <em>Mem SQL Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.MemSQLService
	 * @generated
	 */
	public Adapter createMemSQLServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.CassandraService <em>Cassandra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.CassandraService
	 * @generated
	 */
	public Adapter createCassandraServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Neo4JService <em>Neo4 JService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Neo4JService
	 * @generated
	 */
	public Adapter createNeo4JServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.MonitoringService
	 * @generated
	 */
	public Adapter createMonitoringServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PrometheusService <em>Prometheus Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PrometheusService
	 * @generated
	 */
	public Adapter createPrometheusServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StreamData <em>Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StreamData
	 * @generated
	 */
	public Adapter createStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StreamDataPartition <em>Stream Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StreamDataPartition
	 * @generated
	 */
	public Adapter createStreamDataPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.WorkflowStreamData <em>Workflow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.WorkflowStreamData
	 * @generated
	 */
	public Adapter createWorkflowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.FlowStreamData <em>Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.FlowStreamData
	 * @generated
	 */
	public Adapter createFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KafkaFlowStreamData <em>Kafka Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KafkaFlowStreamData
	 * @generated
	 */
	public Adapter createKafkaFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DerivedStreamData <em>Derived Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DerivedStreamData
	 * @generated
	 */
	public Adapter createDerivedStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.WorkloadStreamData <em>Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.WorkloadStreamData
	 * @generated
	 */
	public Adapter createWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KafkaWorkloadStreamData <em>Kafka Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KafkaWorkloadStreamData
	 * @generated
	 */
	public Adapter createKafkaWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SchedulableSet <em>Schedulable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SchedulableSet
	 * @generated
	 */
	public Adapter createSchedulableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.TaskExecutor <em>Task Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.TaskExecutor
	 * @generated
	 */
	public Adapter createTaskExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ProcessingNodeUtilization <em>Processing Node Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeUtilization
	 * @generated
	 */
	public Adapter createProcessingNodeUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory <em>Processing Node Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeMemory
	 * @generated
	 */
	public Adapter createProcessingNodeMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NetworkUtilization <em>Network Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NetworkUtilization
	 * @generated
	 */
	public Adapter createNetworkUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.WorkflowLatency <em>Workflow Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.WorkflowLatency
	 * @generated
	 */
	public Adapter createWorkflowLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.TaskProcessingAmount <em>Task Processing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount
	 * @generated
	 */
	public Adapter createTaskProcessingAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StreamDataRate <em>Stream Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StreamDataRate
	 * @generated
	 */
	public Adapter createStreamDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NodeHostedMeter <em>Node Hosted Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NodeHostedMeter
	 * @generated
	 */
	public Adapter createNodeHostedMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NodeResourceMeter <em>Node Resource Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NodeResourceMeter
	 * @generated
	 */
	public Adapter createNodeResourceMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.CommunicationMeter <em>Communication Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.CommunicationMeter
	 * @generated
	 */
	public Adapter createCommunicationMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StreamRateMeter <em>Stream Rate Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StreamRateMeter
	 * @generated
	 */
	public Adapter createStreamRateMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter <em>Workflow Latency Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter
	 * @generated
	 */
	public Adapter createWorkflowLatencyMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.TaskProcessingAmountMeter <em>Task Processing Amount Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmountMeter
	 * @generated
	 */
	public Adapter createTaskProcessingAmountMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DeployableComponent <em>Deployable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DeployableComponent
	 * @generated
	 */
	public Adapter createDeployableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DeploymentConfiguration
	 * @generated
	 */
	public Adapter createDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PlatformServiceDeploymentConf <em>Platform Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PlatformServiceDeploymentConf
	 * @generated
	 */
	public Adapter createPlatformServiceDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.OrchestratorDeploymentConf <em>Orchestrator Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.OrchestratorDeploymentConf
	 * @generated
	 */
	public Adapter createOrchestratorDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NodeDeploymentConf <em>Node Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NodeDeploymentConf
	 * @generated
	 */
	public Adapter createNodeDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.FileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.FileDescriptor
	 * @generated
	 */
	public Adapter createFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ArtifactDescriptor <em>Artifact Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ArtifactDescriptor
	 * @generated
	 */
	public Adapter createArtifactDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor <em>Deployment File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DeploymentFileDescriptor
	 * @generated
	 */
	public Adapter createDeploymentFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ConfigurationException
	 * @generated
	 */
	public Adapter createConfigurationExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DeploymentException
	 * @generated
	 */
	public Adapter createDeploymentExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.LaunchException
	 * @generated
	 */
	public Adapter createLaunchExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ExporterData <em>Exporter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ExporterData
	 * @generated
	 */
	public Adapter createExporterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SwarmPort <em>Swarm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SwarmPort
	 * @generated
	 */
	public Adapter createSwarmPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KubernetesPort <em>Kubernetes Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KubernetesPort
	 * @generated
	 */
	public Adapter createKubernetesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DeploymentConstraints
	 * @generated
	 */
	public Adapter createDeploymentConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PrometheusMeter <em>Prometheus Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PrometheusMeter
	 * @generated
	 */
	public Adapter createPrometheusMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PasysAdapterFactory
