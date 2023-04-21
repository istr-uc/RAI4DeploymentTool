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
import PASYS_Metamodel.pasys.SystemElement;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage
 * @generated
 */
public class PasysSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PasysPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysSwitch() {
		if (modelPackage == null) {
			modelPackage = PasysPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM: {
				ComputationalSystem computationalSystem = (ComputationalSystem)theEObject;
				T result = caseComputationalSystem(computationalSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SYSTEM_ELEMENT: {
				SystemElement systemElement = (SystemElement)theEObject;
				T result = caseSystemElement(systemElement);
				if (result == null) result = caseNamedElement(systemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PLATFORM_RESOURCE: {
				PlatformResource platformResource = (PlatformResource)theEObject;
				T result = casePlatformResource(platformResource);
				if (result == null) result = caseSystemElement(platformResource);
				if (result == null) result = caseNamedElement(platformResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROCESSING_NODE: {
				ProcessingNode processingNode = (ProcessingNode)theEObject;
				T result = caseProcessingNode(processingNode);
				if (result == null) result = casePlatformResource(processingNode);
				if (result == null) result = caseSystemElement(processingNode);
				if (result == null) result = caseNamedElement(processingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PHYSICAL_PROCESSING_NODE: {
				PhysicalProcessingNode physicalProcessingNode = (PhysicalProcessingNode)theEObject;
				T result = casePhysicalProcessingNode(physicalProcessingNode);
				if (result == null) result = caseProcessingNode(physicalProcessingNode);
				if (result == null) result = casePlatformResource(physicalProcessingNode);
				if (result == null) result = caseSystemElement(physicalProcessingNode);
				if (result == null) result = caseNamedElement(physicalProcessingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.VIRTUAL_PROCESSING_NODE: {
				VirtualProcessingNode virtualProcessingNode = (VirtualProcessingNode)theEObject;
				T result = caseVirtualProcessingNode(virtualProcessingNode);
				if (result == null) result = caseProcessingNode(virtualProcessingNode);
				if (result == null) result = casePlatformResource(virtualProcessingNode);
				if (result == null) result = caseSystemElement(virtualProcessingNode);
				if (result == null) result = caseNamedElement(virtualProcessingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE: {
				AWSVirtualProcessingNode awsVirtualProcessingNode = (AWSVirtualProcessingNode)theEObject;
				T result = caseAWSVirtualProcessingNode(awsVirtualProcessingNode);
				if (result == null) result = caseVirtualProcessingNode(awsVirtualProcessingNode);
				if (result == null) result = caseProcessingNode(awsVirtualProcessingNode);
				if (result == null) result = casePlatformResource(awsVirtualProcessingNode);
				if (result == null) result = caseSystemElement(awsVirtualProcessingNode);
				if (result == null) result = caseNamedElement(awsVirtualProcessingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROCESSING_RESOURCE_CLUSTER: {
				ProcessingResourceCluster processingResourceCluster = (ProcessingResourceCluster)theEObject;
				T result = caseProcessingResourceCluster(processingResourceCluster);
				if (result == null) result = casePlatformResource(processingResourceCluster);
				if (result == null) result = caseSystemElement(processingResourceCluster);
				if (result == null) result = caseNamedElement(processingResourceCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROCESSING_NODE_CLUSTER: {
				ProcessingNodeCluster processingNodeCluster = (ProcessingNodeCluster)theEObject;
				T result = caseProcessingNodeCluster(processingNodeCluster);
				if (result == null) result = caseProcessingResourceCluster(processingNodeCluster);
				if (result == null) result = casePlatformResource(processingNodeCluster);
				if (result == null) result = caseSystemElement(processingNodeCluster);
				if (result == null) result = caseNamedElement(processingNodeCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ORCHESTRATION_CLUSTER: {
				OrchestrationCluster orchestrationCluster = (OrchestrationCluster)theEObject;
				T result = caseOrchestrationCluster(orchestrationCluster);
				if (result == null) result = caseProcessingResourceCluster(orchestrationCluster);
				if (result == null) result = casePlatformResource(orchestrationCluster);
				if (result == null) result = caseSystemElement(orchestrationCluster);
				if (result == null) result = caseNamedElement(orchestrationCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KUBERNETES_CLUSTER: {
				KubernetesCluster kubernetesCluster = (KubernetesCluster)theEObject;
				T result = caseKubernetesCluster(kubernetesCluster);
				if (result == null) result = caseOrchestrationCluster(kubernetesCluster);
				if (result == null) result = caseProcessingResourceCluster(kubernetesCluster);
				if (result == null) result = casePlatformResource(kubernetesCluster);
				if (result == null) result = caseSystemElement(kubernetesCluster);
				if (result == null) result = caseNamedElement(kubernetesCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SWARM_CLUSTER: {
				SwarmCluster swarmCluster = (SwarmCluster)theEObject;
				T result = caseSwarmCluster(swarmCluster);
				if (result == null) result = caseOrchestrationCluster(swarmCluster);
				if (result == null) result = caseProcessingResourceCluster(swarmCluster);
				if (result == null) result = casePlatformResource(swarmCluster);
				if (result == null) result = caseSystemElement(swarmCluster);
				if (result == null) result = caseNamedElement(swarmCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = casePlatformResource(network);
				if (result == null) result = caseSystemElement(network);
				if (result == null) result = caseNamedElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PLATFORM_SERVICE: {
				PlatformService platformService = (PlatformService)theEObject;
				T result = casePlatformService(platformService);
				if (result == null) result = casePlatformResource(platformService);
				if (result == null) result = caseDeployableComponent(platformService);
				if (result == null) result = caseSystemElement(platformService);
				if (result == null) result = caseNamedElement(platformService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SERIALIZATION_SERVICE: {
				SerializationService serializationService = (SerializationService)theEObject;
				T result = caseSerializationService(serializationService);
				if (result == null) result = casePlatformService(serializationService);
				if (result == null) result = casePlatformResource(serializationService);
				if (result == null) result = caseDeployableComponent(serializationService);
				if (result == null) result = caseSystemElement(serializationService);
				if (result == null) result = caseNamedElement(serializationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DISTRIBUTION_SERVICE: {
				DistributionService distributionService = (DistributionService)theEObject;
				T result = caseDistributionService(distributionService);
				if (result == null) result = casePlatformService(distributionService);
				if (result == null) result = casePlatformResource(distributionService);
				if (result == null) result = caseDeployableComponent(distributionService);
				if (result == null) result = caseSystemElement(distributionService);
				if (result == null) result = caseNamedElement(distributionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.COMMUNICATION_SERVICE: {
				CommunicationService communicationService = (CommunicationService)theEObject;
				T result = caseCommunicationService(communicationService);
				if (result == null) result = casePlatformService(communicationService);
				if (result == null) result = casePlatformResource(communicationService);
				if (result == null) result = caseDeployableComponent(communicationService);
				if (result == null) result = caseSystemElement(communicationService);
				if (result == null) result = caseNamedElement(communicationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SCHEDULING_SERVICE: {
				SchedulingService schedulingService = (SchedulingService)theEObject;
				T result = caseSchedulingService(schedulingService);
				if (result == null) result = casePlatformService(schedulingService);
				if (result == null) result = casePlatformResource(schedulingService);
				if (result == null) result = caseDeployableComponent(schedulingService);
				if (result == null) result = caseSystemElement(schedulingService);
				if (result == null) result = caseNamedElement(schedulingService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SECURITY_SERVICE: {
				SecurityService securityService = (SecurityService)theEObject;
				T result = caseSecurityService(securityService);
				if (result == null) result = casePlatformService(securityService);
				if (result == null) result = casePlatformResource(securityService);
				if (result == null) result = caseDeployableComponent(securityService);
				if (result == null) result = caseSystemElement(securityService);
				if (result == null) result = caseNamedElement(securityService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PERSISTENCE_SERVICE: {
				PersistenceService persistenceService = (PersistenceService)theEObject;
				T result = casePersistenceService(persistenceService);
				if (result == null) result = casePlatformService(persistenceService);
				if (result == null) result = casePlatformResource(persistenceService);
				if (result == null) result = caseDeployableComponent(persistenceService);
				if (result == null) result = caseSystemElement(persistenceService);
				if (result == null) result = caseNamedElement(persistenceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.MONITORING_SERVICE: {
				MonitoringService monitoringService = (MonitoringService)theEObject;
				T result = caseMonitoringService(monitoringService);
				if (result == null) result = casePlatformService(monitoringService);
				if (result == null) result = casePlatformResource(monitoringService);
				if (result == null) result = caseDeployableComponent(monitoringService);
				if (result == null) result = caseSystemElement(monitoringService);
				if (result == null) result = caseNamedElement(monitoringService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.AVRO_SERVICE: {
				AVROService avroService = (AVROService)theEObject;
				T result = caseAVROService(avroService);
				if (result == null) result = caseSerializationService(avroService);
				if (result == null) result = casePlatformService(avroService);
				if (result == null) result = casePlatformResource(avroService);
				if (result == null) result = caseDeployableComponent(avroService);
				if (result == null) result = caseSystemElement(avroService);
				if (result == null) result = caseNamedElement(avroService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ZOOKEEPER_SERVICE: {
				ZookeeperService zookeeperService = (ZookeeperService)theEObject;
				T result = caseZookeeperService(zookeeperService);
				if (result == null) result = caseDistributionService(zookeeperService);
				if (result == null) result = casePlatformService(zookeeperService);
				if (result == null) result = casePlatformResource(zookeeperService);
				if (result == null) result = caseDeployableComponent(zookeeperService);
				if (result == null) result = caseSystemElement(zookeeperService);
				if (result == null) result = caseNamedElement(zookeeperService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KAFKA_SERVICE: {
				KafkaService kafkaService = (KafkaService)theEObject;
				T result = caseKafkaService(kafkaService);
				if (result == null) result = caseCommunicationService(kafkaService);
				if (result == null) result = casePlatformService(kafkaService);
				if (result == null) result = casePlatformResource(kafkaService);
				if (result == null) result = caseDeployableComponent(kafkaService);
				if (result == null) result = caseSystemElement(kafkaService);
				if (result == null) result = caseNamedElement(kafkaService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_SCHEDULER: {
				NodeScheduler nodeScheduler = (NodeScheduler)theEObject;
				T result = caseNodeScheduler(nodeScheduler);
				if (result == null) result = caseSchedulingService(nodeScheduler);
				if (result == null) result = casePlatformService(nodeScheduler);
				if (result == null) result = casePlatformResource(nodeScheduler);
				if (result == null) result = caseDeployableComponent(nodeScheduler);
				if (result == null) result = caseSystemElement(nodeScheduler);
				if (result == null) result = caseNamedElement(nodeScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SPARK_SERVICE: {
				SparkService sparkService = (SparkService)theEObject;
				T result = caseSparkService(sparkService);
				if (result == null) result = caseSchedulingService(sparkService);
				if (result == null) result = casePlatformService(sparkService);
				if (result == null) result = casePlatformResource(sparkService);
				if (result == null) result = caseDeployableComponent(sparkService);
				if (result == null) result = caseSystemElement(sparkService);
				if (result == null) result = caseNamedElement(sparkService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STORM_SERVICE: {
				StormService stormService = (StormService)theEObject;
				T result = caseStormService(stormService);
				if (result == null) result = caseSchedulingService(stormService);
				if (result == null) result = casePlatformService(stormService);
				if (result == null) result = casePlatformResource(stormService);
				if (result == null) result = caseDeployableComponent(stormService);
				if (result == null) result = caseSystemElement(stormService);
				if (result == null) result = caseNamedElement(stormService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STORM_UI: {
				StormUI stormUI = (StormUI)theEObject;
				T result = caseStormUI(stormUI);
				if (result == null) result = caseDeployableComponent(stormUI);
				if (result == null) result = caseNamedElement(stormUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STORM_NIMBUS: {
				StormNimbus stormNimbus = (StormNimbus)theEObject;
				T result = caseStormNimbus(stormNimbus);
				if (result == null) result = caseDeployableComponent(stormNimbus);
				if (result == null) result = caseNamedElement(stormNimbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STORM_SUPERVISOR: {
				StormSupervisor stormSupervisor = (StormSupervisor)theEObject;
				T result = caseStormSupervisor(stormSupervisor);
				if (result == null) result = caseDeployableComponent(stormSupervisor);
				if (result == null) result = caseNamedElement(stormSupervisor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NEO4_JSERVICE: {
				Neo4JService neo4JService = (Neo4JService)theEObject;
				T result = caseNeo4JService(neo4JService);
				if (result == null) result = casePersistenceService(neo4JService);
				if (result == null) result = casePlatformService(neo4JService);
				if (result == null) result = casePlatformResource(neo4JService);
				if (result == null) result = caseDeployableComponent(neo4JService);
				if (result == null) result = caseSystemElement(neo4JService);
				if (result == null) result = caseNamedElement(neo4JService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.MEM_SQL_SERVICE: {
				MemSQLService memSQLService = (MemSQLService)theEObject;
				T result = caseMemSQLService(memSQLService);
				if (result == null) result = casePersistenceService(memSQLService);
				if (result == null) result = casePlatformService(memSQLService);
				if (result == null) result = casePlatformResource(memSQLService);
				if (result == null) result = caseDeployableComponent(memSQLService);
				if (result == null) result = caseSystemElement(memSQLService);
				if (result == null) result = caseNamedElement(memSQLService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.CASSANDRA_SERVICE: {
				CassandraService cassandraService = (CassandraService)theEObject;
				T result = caseCassandraService(cassandraService);
				if (result == null) result = casePersistenceService(cassandraService);
				if (result == null) result = casePlatformService(cassandraService);
				if (result == null) result = casePlatformResource(cassandraService);
				if (result == null) result = caseDeployableComponent(cassandraService);
				if (result == null) result = caseSystemElement(cassandraService);
				if (result == null) result = caseNamedElement(cassandraService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DATA_CENTER: {
				DataCenter dataCenter = (DataCenter)theEObject;
				T result = caseDataCenter(dataCenter);
				if (result == null) result = caseNamedElement(dataCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.RACK: {
				Rack rack = (Rack)theEObject;
				T result = caseRack(rack);
				if (result == null) result = caseNamedElement(rack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROMETHEUS_SERVICE: {
				PrometheusService prometheusService = (PrometheusService)theEObject;
				T result = casePrometheusService(prometheusService);
				if (result == null) result = caseMonitoringService(prometheusService);
				if (result == null) result = casePlatformService(prometheusService);
				if (result == null) result = casePlatformResource(prometheusService);
				if (result == null) result = caseDeployableComponent(prometheusService);
				if (result == null) result = caseSystemElement(prometheusService);
				if (result == null) result = caseNamedElement(prometheusService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.EXPORTER_DATA: {
				ExporterData exporterData = (ExporterData)theEObject;
				T result = caseExporterData(exporterData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_DATA: {
				StreamData streamData = (StreamData)theEObject;
				T result = caseStreamData(streamData);
				if (result == null) result = caseDeployableComponent(streamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_DATA_PARTITION: {
				StreamDataPartition streamDataPartition = (StreamDataPartition)theEObject;
				T result = caseStreamDataPartition(streamDataPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW_STREAM_DATA: {
				WorkflowStreamData workflowStreamData = (WorkflowStreamData)theEObject;
				T result = caseWorkflowStreamData(workflowStreamData);
				if (result == null) result = caseNamedElement(workflowStreamData);
				if (result == null) result = caseStreamData(workflowStreamData);
				if (result == null) result = caseDeployableComponent(workflowStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.FLOW_STREAM_DATA: {
				FlowStreamData flowStreamData = (FlowStreamData)theEObject;
				T result = caseFlowStreamData(flowStreamData);
				if (result == null) result = caseWorkflowStreamData(flowStreamData);
				if (result == null) result = caseNamedElement(flowStreamData);
				if (result == null) result = caseStreamData(flowStreamData);
				if (result == null) result = caseDeployableComponent(flowStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KAFKA_FLOW_STREAM_DATA: {
				KafkaFlowStreamData kafkaFlowStreamData = (KafkaFlowStreamData)theEObject;
				T result = caseKafkaFlowStreamData(kafkaFlowStreamData);
				if (result == null) result = caseFlowStreamData(kafkaFlowStreamData);
				if (result == null) result = caseWorkflowStreamData(kafkaFlowStreamData);
				if (result == null) result = caseNamedElement(kafkaFlowStreamData);
				if (result == null) result = caseStreamData(kafkaFlowStreamData);
				if (result == null) result = caseDeployableComponent(kafkaFlowStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DERIVED_STREAM_DATA: {
				DerivedStreamData derivedStreamData = (DerivedStreamData)theEObject;
				T result = caseDerivedStreamData(derivedStreamData);
				if (result == null) result = caseWorkflowStreamData(derivedStreamData);
				if (result == null) result = caseNamedElement(derivedStreamData);
				if (result == null) result = caseStreamData(derivedStreamData);
				if (result == null) result = caseDeployableComponent(derivedStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKLOAD_STREAM_DATA: {
				WorkloadStreamData workloadStreamData = (WorkloadStreamData)theEObject;
				T result = caseWorkloadStreamData(workloadStreamData);
				if (result == null) result = caseSystemElement(workloadStreamData);
				if (result == null) result = caseStreamData(workloadStreamData);
				if (result == null) result = caseNamedElement(workloadStreamData);
				if (result == null) result = caseDeployableComponent(workloadStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KAFKA_WORKLOAD_STREAM_DATA: {
				KafkaWorkloadStreamData kafkaWorkloadStreamData = (KafkaWorkloadStreamData)theEObject;
				T result = caseKafkaWorkloadStreamData(kafkaWorkloadStreamData);
				if (result == null) result = caseWorkloadStreamData(kafkaWorkloadStreamData);
				if (result == null) result = caseSystemElement(kafkaWorkloadStreamData);
				if (result == null) result = caseStreamData(kafkaWorkloadStreamData);
				if (result == null) result = caseNamedElement(kafkaWorkloadStreamData);
				if (result == null) result = caseDeployableComponent(kafkaWorkloadStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = caseSystemElement(workflow);
				if (result == null) result = caseDeployableComponent(workflow);
				if (result == null) result = caseNamedElement(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SCHEDULABLE_SET: {
				SchedulableSet schedulableSet = (SchedulableSet)theEObject;
				T result = caseSchedulableSet(schedulableSet);
				if (result == null) result = caseSystemElement(schedulableSet);
				if (result == null) result = caseNamedElement(schedulableSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseNamedElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.TASK_EXECUTOR: {
				TaskExecutor taskExecutor = (TaskExecutor)theEObject;
				T result = caseTaskExecutor(taskExecutor);
				if (result == null) result = caseNamedElement(taskExecutor);
				if (result == null) result = caseDeployableComponent(taskExecutor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseSystemElement(metric);
				if (result == null) result = caseNamedElement(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROCESSING_NODE_UTILIZATION: {
				ProcessingNodeUtilization processingNodeUtilization = (ProcessingNodeUtilization)theEObject;
				T result = caseProcessingNodeUtilization(processingNodeUtilization);
				if (result == null) result = caseMetric(processingNodeUtilization);
				if (result == null) result = caseSystemElement(processingNodeUtilization);
				if (result == null) result = caseNamedElement(processingNodeUtilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROCESSING_NODE_MEMORY: {
				ProcessingNodeMemory processingNodeMemory = (ProcessingNodeMemory)theEObject;
				T result = caseProcessingNodeMemory(processingNodeMemory);
				if (result == null) result = caseMetric(processingNodeMemory);
				if (result == null) result = caseSystemElement(processingNodeMemory);
				if (result == null) result = caseNamedElement(processingNodeMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NETWORK_UTILIZATION: {
				NetworkUtilization networkUtilization = (NetworkUtilization)theEObject;
				T result = caseNetworkUtilization(networkUtilization);
				if (result == null) result = caseMetric(networkUtilization);
				if (result == null) result = caseSystemElement(networkUtilization);
				if (result == null) result = caseNamedElement(networkUtilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW_LATENCY: {
				WorkflowLatency workflowLatency = (WorkflowLatency)theEObject;
				T result = caseWorkflowLatency(workflowLatency);
				if (result == null) result = caseMetric(workflowLatency);
				if (result == null) result = caseSystemElement(workflowLatency);
				if (result == null) result = caseNamedElement(workflowLatency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.TASK_PROCESSING_AMOUNT: {
				TaskProcessingAmount taskProcessingAmount = (TaskProcessingAmount)theEObject;
				T result = caseTaskProcessingAmount(taskProcessingAmount);
				if (result == null) result = caseMetric(taskProcessingAmount);
				if (result == null) result = caseSystemElement(taskProcessingAmount);
				if (result == null) result = caseNamedElement(taskProcessingAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_DATA_RATE: {
				StreamDataRate streamDataRate = (StreamDataRate)theEObject;
				T result = caseStreamDataRate(streamDataRate);
				if (result == null) result = caseMetric(streamDataRate);
				if (result == null) result = caseSystemElement(streamDataRate);
				if (result == null) result = caseNamedElement(streamDataRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseNamedElement(meter);
				if (result == null) result = caseDeployableComponent(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROMETHEUS_METER: {
				PrometheusMeter prometheusMeter = (PrometheusMeter)theEObject;
				T result = casePrometheusMeter(prometheusMeter);
				if (result == null) result = caseMeter(prometheusMeter);
				if (result == null) result = caseNamedElement(prometheusMeter);
				if (result == null) result = caseDeployableComponent(prometheusMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_HOSTED_METER: {
				NodeHostedMeter nodeHostedMeter = (NodeHostedMeter)theEObject;
				T result = caseNodeHostedMeter(nodeHostedMeter);
				if (result == null) result = casePrometheusMeter(nodeHostedMeter);
				if (result == null) result = caseMeter(nodeHostedMeter);
				if (result == null) result = caseNamedElement(nodeHostedMeter);
				if (result == null) result = caseDeployableComponent(nodeHostedMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_RESOURCE_METER: {
				NodeResourceMeter nodeResourceMeter = (NodeResourceMeter)theEObject;
				T result = caseNodeResourceMeter(nodeResourceMeter);
				if (result == null) result = caseNodeHostedMeter(nodeResourceMeter);
				if (result == null) result = casePrometheusMeter(nodeResourceMeter);
				if (result == null) result = caseMeter(nodeResourceMeter);
				if (result == null) result = caseNamedElement(nodeResourceMeter);
				if (result == null) result = caseDeployableComponent(nodeResourceMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.COMMUNICATION_METER: {
				CommunicationMeter communicationMeter = (CommunicationMeter)theEObject;
				T result = caseCommunicationMeter(communicationMeter);
				if (result == null) result = caseNodeHostedMeter(communicationMeter);
				if (result == null) result = casePrometheusMeter(communicationMeter);
				if (result == null) result = caseMeter(communicationMeter);
				if (result == null) result = caseNamedElement(communicationMeter);
				if (result == null) result = caseDeployableComponent(communicationMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_RATE_METER: {
				StreamRateMeter streamRateMeter = (StreamRateMeter)theEObject;
				T result = caseStreamRateMeter(streamRateMeter);
				if (result == null) result = casePrometheusMeter(streamRateMeter);
				if (result == null) result = caseMeter(streamRateMeter);
				if (result == null) result = caseNamedElement(streamRateMeter);
				if (result == null) result = caseDeployableComponent(streamRateMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW_LATENCY_METER: {
				WorkflowLatencyMeter workflowLatencyMeter = (WorkflowLatencyMeter)theEObject;
				T result = caseWorkflowLatencyMeter(workflowLatencyMeter);
				if (result == null) result = casePrometheusMeter(workflowLatencyMeter);
				if (result == null) result = caseMeter(workflowLatencyMeter);
				if (result == null) result = caseNamedElement(workflowLatencyMeter);
				if (result == null) result = caseDeployableComponent(workflowLatencyMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER: {
				TaskProcessingAmountMeter taskProcessingAmountMeter = (TaskProcessingAmountMeter)theEObject;
				T result = caseTaskProcessingAmountMeter(taskProcessingAmountMeter);
				if (result == null) result = casePrometheusMeter(taskProcessingAmountMeter);
				if (result == null) result = caseMeter(taskProcessingAmountMeter);
				if (result == null) result = caseNamedElement(taskProcessingAmountMeter);
				if (result == null) result = caseDeployableComponent(taskProcessingAmountMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYABLE_COMPONENT: {
				DeployableComponent deployableComponent = (DeployableComponent)theEObject;
				T result = caseDeployableComponent(deployableComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYMENT_CONFIGURATION: {
				DeploymentConfiguration deploymentConfiguration = (DeploymentConfiguration)theEObject;
				T result = caseDeploymentConfiguration(deploymentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PLATFORM_SERVICE_DEPLOYMENT_CONF: {
				PlatformServiceDeploymentConf platformServiceDeploymentConf = (PlatformServiceDeploymentConf)theEObject;
				T result = casePlatformServiceDeploymentConf(platformServiceDeploymentConf);
				if (result == null) result = caseDeploymentConfiguration(platformServiceDeploymentConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF: {
				OrchestratorDeploymentConf orchestratorDeploymentConf = (OrchestratorDeploymentConf)theEObject;
				T result = caseOrchestratorDeploymentConf(orchestratorDeploymentConf);
				if (result == null) result = casePlatformServiceDeploymentConf(orchestratorDeploymentConf);
				if (result == null) result = caseDeploymentConfiguration(orchestratorDeploymentConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_DEPLOYMENT_CONF: {
				NodeDeploymentConf nodeDeploymentConf = (NodeDeploymentConf)theEObject;
				T result = caseNodeDeploymentConf(nodeDeploymentConf);
				if (result == null) result = casePlatformServiceDeploymentConf(nodeDeploymentConf);
				if (result == null) result = caseDeploymentConfiguration(nodeDeploymentConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SWARM_PORT: {
				SwarmPort swarmPort = (SwarmPort)theEObject;
				T result = caseSwarmPort(swarmPort);
				if (result == null) result = casePort(swarmPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KUBERNETES_PORT: {
				KubernetesPort kubernetesPort = (KubernetesPort)theEObject;
				T result = caseKubernetesPort(kubernetesPort);
				if (result == null) result = casePort(kubernetesPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYMENT_CONSTRAINTS: {
				DeploymentConstraints deploymentConstraints = (DeploymentConstraints)theEObject;
				T result = caseDeploymentConstraints(deploymentConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.EXCEPTION: {
				Exception exception = (Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.CONFIGURATION_EXCEPTION: {
				ConfigurationException configurationException = (ConfigurationException)theEObject;
				T result = caseConfigurationException(configurationException);
				if (result == null) result = caseException(configurationException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYMENT_EXCEPTION: {
				DeploymentException deploymentException = (DeploymentException)theEObject;
				T result = caseDeploymentException(deploymentException);
				if (result == null) result = caseException(deploymentException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.LAUNCH_EXCEPTION: {
				LaunchException launchException = (LaunchException)theEObject;
				T result = caseLaunchException(launchException);
				if (result == null) result = caseException(launchException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STRING_TO_STRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.FILE_DESCRIPTOR: {
				FileDescriptor fileDescriptor = (FileDescriptor)theEObject;
				T result = caseFileDescriptor(fileDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR: {
				DeploymentFileDescriptor deploymentFileDescriptor = (DeploymentFileDescriptor)theEObject;
				T result = caseDeploymentFileDescriptor(deploymentFileDescriptor);
				if (result == null) result = caseFileDescriptor(deploymentFileDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ARTIFACT_DESCRIPTOR: {
				ArtifactDescriptor artifactDescriptor = (ArtifactDescriptor)theEObject;
				T result = caseArtifactDescriptor(artifactDescriptor);
				if (result == null) result = caseFileDescriptor(artifactDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computational System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computational System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationalSystem(ComputationalSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemElement(SystemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformResource(PlatformResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingNode(ProcessingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Processing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalProcessingNode(PhysicalProcessingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Processing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualProcessingNode(VirtualProcessingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWS Virtual Processing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWS Virtual Processing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWSVirtualProcessingNode(AWSVirtualProcessingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceCluster(ProcessingResourceCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Node Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Node Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingNodeCluster(ProcessingNodeCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestration Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestration Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestrationCluster(OrchestrationCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kubernetes Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kubernetes Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKubernetesCluster(KubernetesCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarmCluster(SwarmCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformService(PlatformService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialization Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialization Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializationService(SerializationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVRO Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVRO Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVROService(AVROService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionService(DistributionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zookeeper Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zookeeper Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZookeeperService(ZookeeperService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationService(CommunicationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaService(KafkaService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingService(SchedulingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityService(SecurityService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeScheduler(NodeScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spark Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spark Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparkService(SparkService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storm Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storm Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormService(StormService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storm UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storm UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormUI(StormUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storm Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storm Nimbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormNimbus(StormNimbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storm Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storm Supervisor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormSupervisor(StormSupervisor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceService(PersistenceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem SQL Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem SQL Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemSQLService(MemSQLService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cassandra Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cassandra Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCassandraService(CassandraService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCenter(DataCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRack(Rack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo4 JService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo4 JService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeo4JService(Neo4JService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringService(MonitoringService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prometheus Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prometheus Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrometheusService(PrometheusService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamData(StreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Data Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Data Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamDataPartition(StreamDataPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowStreamData(WorkflowStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowStreamData(FlowStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Flow Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Flow Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaFlowStreamData(KafkaFlowStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedStreamData(DerivedStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadStreamData(WorkloadStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Workload Stream Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Workload Stream Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaWorkloadStreamData(KafkaWorkloadStreamData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulable Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulableSet(SchedulableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskExecutor(TaskExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Node Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Node Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingNodeUtilization(ProcessingNodeUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Node Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Node Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingNodeMemory(ProcessingNodeMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkUtilization(NetworkUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Latency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Latency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLatency(WorkflowLatency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Processing Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Processing Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskProcessingAmount(TaskProcessingAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Data Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamDataRate(StreamDataRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Hosted Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Hosted Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeHostedMeter(NodeHostedMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Resource Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Resource Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeResourceMeter(NodeResourceMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMeter(CommunicationMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Rate Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Rate Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamRateMeter(StreamRateMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Latency Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Latency Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLatencyMeter(WorkflowLatencyMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Processing Amount Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Processing Amount Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskProcessingAmountMeter(TaskProcessingAmountMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableComponent(DeployableComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConfiguration(DeploymentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Service Deployment Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Service Deployment Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformServiceDeploymentConf(PlatformServiceDeploymentConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestrator Deployment Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestrator Deployment Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestratorDeploymentConf(OrchestratorDeploymentConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Deployment Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Deployment Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDeploymentConf(NodeDeploymentConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDescriptor(FileDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactDescriptor(ArtifactDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment File Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentFileDescriptor(DeploymentFileDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationException(ConfigurationException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentException(DeploymentException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Launch Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Launch Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaunchException(LaunchException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exporter Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exporter Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExporterData(ExporterData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMap(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarmPort(SwarmPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kubernetes Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kubernetes Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKubernetesPort(KubernetesPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConstraints(DeploymentConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prometheus Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prometheus Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrometheusMeter(PrometheusMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PasysSwitch
