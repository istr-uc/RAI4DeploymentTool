/**
 */
package PASYS_Metamodel.pasys.util;

import PASYS_Metamodel.pasys.AVROServer;
import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraServer;
import PASYS_Metamodel.pasys.CommunicationMeter;
import PASYS_Metamodel.pasys.CommunicationServer;
import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.Container;
import PASYS_Metamodel.pasys.ContainerizationServer;
import PASYS_Metamodel.pasys.Deployment;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DerivedStreamData;
import PASYS_Metamodel.pasys.DistributionServer;
import PASYS_Metamodel.pasys.DockerContainer;
import PASYS_Metamodel.pasys.DockerServer;
import PASYS_Metamodel.pasys.ExporterData;
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
import PASYS_Metamodel.pasys.NetworkUtilization;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.OrchestrationServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceServer;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.PlatformServer;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusServer;
import PASYS_Metamodel.pasys.Registry;
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
import PASYS_Metamodel.pasys.ZookeeperServer;

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
			public Adapter caseResourceCluster(ResourceCluster object) {
				return createResourceClusterAdapter();
			}
			@Override
			public Adapter caseNodeCluster(NodeCluster object) {
				return createNodeClusterAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter casePlatformServer(PlatformServer object) {
				return createPlatformServerAdapter();
			}
			@Override
			public Adapter caseSerializationServer(SerializationServer object) {
				return createSerializationServerAdapter();
			}
			@Override
			public Adapter caseAVROServer(AVROServer object) {
				return createAVROServerAdapter();
			}
			@Override
			public Adapter caseDistributionServer(DistributionServer object) {
				return createDistributionServerAdapter();
			}
			@Override
			public Adapter caseZookeeperServer(ZookeeperServer object) {
				return createZookeeperServerAdapter();
			}
			@Override
			public Adapter caseCommunicationServer(CommunicationServer object) {
				return createCommunicationServerAdapter();
			}
			@Override
			public Adapter caseKafkaServer(KafkaServer object) {
				return createKafkaServerAdapter();
			}
			@Override
			public Adapter caseSchedulingServer(SchedulingServer object) {
				return createSchedulingServerAdapter();
			}
			@Override
			public Adapter caseNodeScheduler(NodeScheduler object) {
				return createNodeSchedulerAdapter();
			}
			@Override
			public Adapter caseSparkServer(SparkServer object) {
				return createSparkServerAdapter();
			}
			@Override
			public Adapter caseStormServer(StormServer object) {
				return createStormServerAdapter();
			}
			@Override
			public Adapter casePersistenceServer(PersistenceServer object) {
				return createPersistenceServerAdapter();
			}
			@Override
			public Adapter caseMemSQLServer(MemSQLServer object) {
				return createMemSQLServerAdapter();
			}
			@Override
			public Adapter caseCassandraServer(CassandraServer object) {
				return createCassandraServerAdapter();
			}
			@Override
			public Adapter caseNeo4JServer(Neo4JServer object) {
				return createNeo4JServerAdapter();
			}
			@Override
			public Adapter caseMonitoringServer(MonitoringServer object) {
				return createMonitoringServerAdapter();
			}
			@Override
			public Adapter casePrometheusServer(PrometheusServer object) {
				return createPrometheusServerAdapter();
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
			public Adapter caseSystemComponent(SystemComponent object) {
				return createSystemComponentAdapter();
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
			public Adapter caseExporterData(ExporterData object) {
				return createExporterDataAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseDockerContainer(DockerContainer object) {
				return createDockerContainerAdapter();
			}
			@Override
			public Adapter caseContainerizationServer(ContainerizationServer object) {
				return createContainerizationServerAdapter();
			}
			@Override
			public Adapter caseDockerServer(DockerServer object) {
				return createDockerServerAdapter();
			}
			@Override
			public Adapter caseOrchestrationServer(OrchestrationServer object) {
				return createOrchestrationServerAdapter();
			}
			@Override
			public Adapter caseSwarmServer(SwarmServer object) {
				return createSwarmServerAdapter();
			}
			@Override
			public Adapter caseSwarmCluster(SwarmCluster object) {
				return createSwarmClusterAdapter();
			}
			@Override
			public Adapter caseStack(Stack object) {
				return createStackAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseServiceNetwork(ServiceNetwork object) {
				return createServiceNetworkAdapter();
			}
			@Override
			public Adapter caseSwarmNetwork(SwarmNetwork object) {
				return createSwarmNetworkAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseRegistry(Registry object) {
				return createRegistryAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ResourceCluster <em>Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ResourceCluster
	 * @generated
	 */
	public Adapter createResourceClusterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PlatformServer <em>Platform Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PlatformServer
	 * @generated
	 */
	public Adapter createPlatformServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SerializationServer <em>Serialization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SerializationServer
	 * @generated
	 */
	public Adapter createSerializationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.AVROServer <em>AVRO Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.AVROServer
	 * @generated
	 */
	public Adapter createAVROServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DistributionServer <em>Distribution Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DistributionServer
	 * @generated
	 */
	public Adapter createDistributionServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ZookeeperServer <em>Zookeeper Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer
	 * @generated
	 */
	public Adapter createZookeeperServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.CommunicationServer <em>Communication Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.CommunicationServer
	 * @generated
	 */
	public Adapter createCommunicationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.KafkaServer <em>Kafka Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.KafkaServer
	 * @generated
	 */
	public Adapter createKafkaServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SchedulingServer <em>Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SchedulingServer
	 * @generated
	 */
	public Adapter createSchedulingServerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SparkServer <em>Spark Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SparkServer
	 * @generated
	 */
	public Adapter createSparkServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.StormServer <em>Storm Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.StormServer
	 * @generated
	 */
	public Adapter createStormServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PersistenceServer <em>Persistence Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PersistenceServer
	 * @generated
	 */
	public Adapter createPersistenceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.MemSQLServer <em>Mem SQL Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.MemSQLServer
	 * @generated
	 */
	public Adapter createMemSQLServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.CassandraServer <em>Cassandra Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.CassandraServer
	 * @generated
	 */
	public Adapter createCassandraServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Neo4JServer <em>Neo4 JServer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Neo4JServer
	 * @generated
	 */
	public Adapter createNeo4JServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.MonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.MonitoringServer
	 * @generated
	 */
	public Adapter createMonitoringServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.PrometheusServer <em>Prometheus Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.PrometheusServer
	 * @generated
	 */
	public Adapter createPrometheusServerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SystemComponent
	 * @generated
	 */
	public Adapter createSystemComponentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DockerContainer
	 * @generated
	 */
	public Adapter createDockerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ContainerizationServer <em>Containerization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ContainerizationServer
	 * @generated
	 */
	public Adapter createContainerizationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.DockerServer <em>Docker Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.DockerServer
	 * @generated
	 */
	public Adapter createDockerServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.OrchestrationServer <em>Orchestration Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.OrchestrationServer
	 * @generated
	 */
	public Adapter createOrchestrationServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SwarmServer <em>Swarm Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SwarmServer
	 * @generated
	 */
	public Adapter createSwarmServerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Stack
	 * @generated
	 */
	public Adapter createStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.ServiceNetwork <em>Service Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.ServiceNetwork
	 * @generated
	 */
	public Adapter createServiceNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.SwarmNetwork <em>Swarm Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.SwarmNetwork
	 * @generated
	 */
	public Adapter createSwarmNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Registry
	 * @generated
	 */
	public Adapter createRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PASYS_Metamodel.pasys.NodeCluster <em>Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PASYS_Metamodel.pasys.NodeCluster
	 * @generated
	 */
	public Adapter createNodeClusterAdapter() {
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
