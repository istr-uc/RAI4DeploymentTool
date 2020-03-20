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
			case PasysPackage.SYSTEM_EXTERNAL_ELEMENT: {
				SystemExternalElement systemExternalElement = (SystemExternalElement)theEObject;
				T result = caseSystemExternalElement(systemExternalElement);
				if (result == null) result = caseSystemElement(systemExternalElement);
				if (result == null) result = caseNamedElement(systemExternalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SYSTEM_ADAPTER: {
				SystemAdapter systemAdapter = (SystemAdapter)theEObject;
				T result = caseSystemAdapter(systemAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER: {
				SystemElementAdapter systemElementAdapter = (SystemElementAdapter)theEObject;
				T result = caseSystemElementAdapter(systemElementAdapter);
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
			case PasysPackage.RESOURCE_CLUSTER: {
				ResourceCluster resourceCluster = (ResourceCluster)theEObject;
				T result = caseResourceCluster(resourceCluster);
				if (result == null) result = casePlatformResource(resourceCluster);
				if (result == null) result = caseSystemElement(resourceCluster);
				if (result == null) result = caseNamedElement(resourceCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_CLUSTER: {
				NodeCluster nodeCluster = (NodeCluster)theEObject;
				T result = caseNodeCluster(nodeCluster);
				if (result == null) result = caseResourceCluster(nodeCluster);
				if (result == null) result = casePlatformResource(nodeCluster);
				if (result == null) result = caseSystemElement(nodeCluster);
				if (result == null) result = caseNamedElement(nodeCluster);
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
			case PasysPackage.PLATFORM_SERVER: {
				PlatformServer platformServer = (PlatformServer)theEObject;
				T result = casePlatformServer(platformServer);
				if (result == null) result = casePlatformResource(platformServer);
				if (result == null) result = caseSystemComponent(platformServer);
				if (result == null) result = caseSystemElement(platformServer);
				if (result == null) result = caseNamedElement(platformServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SERIALIZATION_SERVER: {
				SerializationServer serializationServer = (SerializationServer)theEObject;
				T result = caseSerializationServer(serializationServer);
				if (result == null) result = casePlatformServer(serializationServer);
				if (result == null) result = casePlatformResource(serializationServer);
				if (result == null) result = caseSystemComponent(serializationServer);
				if (result == null) result = caseSystemElement(serializationServer);
				if (result == null) result = caseNamedElement(serializationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.AVRO_SERVER: {
				AVROServer avroServer = (AVROServer)theEObject;
				T result = caseAVROServer(avroServer);
				if (result == null) result = caseSerializationServer(avroServer);
				if (result == null) result = casePlatformServer(avroServer);
				if (result == null) result = casePlatformResource(avroServer);
				if (result == null) result = caseSystemComponent(avroServer);
				if (result == null) result = caseSystemElement(avroServer);
				if (result == null) result = caseNamedElement(avroServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DISTRIBUTION_SERVER: {
				DistributionServer distributionServer = (DistributionServer)theEObject;
				T result = caseDistributionServer(distributionServer);
				if (result == null) result = casePlatformServer(distributionServer);
				if (result == null) result = casePlatformResource(distributionServer);
				if (result == null) result = caseSystemComponent(distributionServer);
				if (result == null) result = caseSystemElement(distributionServer);
				if (result == null) result = caseNamedElement(distributionServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ZOOKEEPER_SERVER: {
				ZookeeperServer zookeeperServer = (ZookeeperServer)theEObject;
				T result = caseZookeeperServer(zookeeperServer);
				if (result == null) result = caseDistributionServer(zookeeperServer);
				if (result == null) result = casePlatformServer(zookeeperServer);
				if (result == null) result = casePlatformResource(zookeeperServer);
				if (result == null) result = caseSystemComponent(zookeeperServer);
				if (result == null) result = caseSystemElement(zookeeperServer);
				if (result == null) result = caseNamedElement(zookeeperServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.COMMUNICATION_SERVER: {
				CommunicationServer communicationServer = (CommunicationServer)theEObject;
				T result = caseCommunicationServer(communicationServer);
				if (result == null) result = casePlatformServer(communicationServer);
				if (result == null) result = casePlatformResource(communicationServer);
				if (result == null) result = caseSystemComponent(communicationServer);
				if (result == null) result = caseSystemElement(communicationServer);
				if (result == null) result = caseNamedElement(communicationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.KAFKA_SERVER: {
				KafkaServer kafkaServer = (KafkaServer)theEObject;
				T result = caseKafkaServer(kafkaServer);
				if (result == null) result = caseCommunicationServer(kafkaServer);
				if (result == null) result = casePlatformServer(kafkaServer);
				if (result == null) result = casePlatformResource(kafkaServer);
				if (result == null) result = caseSystemComponent(kafkaServer);
				if (result == null) result = caseSystemElement(kafkaServer);
				if (result == null) result = caseNamedElement(kafkaServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SCHEDULING_SERVER: {
				SchedulingServer schedulingServer = (SchedulingServer)theEObject;
				T result = caseSchedulingServer(schedulingServer);
				if (result == null) result = casePlatformServer(schedulingServer);
				if (result == null) result = casePlatformResource(schedulingServer);
				if (result == null) result = caseSystemComponent(schedulingServer);
				if (result == null) result = caseSystemElement(schedulingServer);
				if (result == null) result = caseNamedElement(schedulingServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_SCHEDULER: {
				NodeScheduler nodeScheduler = (NodeScheduler)theEObject;
				T result = caseNodeScheduler(nodeScheduler);
				if (result == null) result = caseSchedulingServer(nodeScheduler);
				if (result == null) result = casePlatformServer(nodeScheduler);
				if (result == null) result = casePlatformResource(nodeScheduler);
				if (result == null) result = caseSystemComponent(nodeScheduler);
				if (result == null) result = caseSystemElement(nodeScheduler);
				if (result == null) result = caseNamedElement(nodeScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SPARK_SERVER: {
				SparkServer sparkServer = (SparkServer)theEObject;
				T result = caseSparkServer(sparkServer);
				if (result == null) result = caseSchedulingServer(sparkServer);
				if (result == null) result = casePlatformServer(sparkServer);
				if (result == null) result = casePlatformResource(sparkServer);
				if (result == null) result = caseSystemComponent(sparkServer);
				if (result == null) result = caseSystemElement(sparkServer);
				if (result == null) result = caseNamedElement(sparkServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STORM_SERVER: {
				StormServer stormServer = (StormServer)theEObject;
				T result = caseStormServer(stormServer);
				if (result == null) result = caseSchedulingServer(stormServer);
				if (result == null) result = casePlatformServer(stormServer);
				if (result == null) result = casePlatformResource(stormServer);
				if (result == null) result = caseSystemComponent(stormServer);
				if (result == null) result = caseSystemElement(stormServer);
				if (result == null) result = caseNamedElement(stormServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PERSISTENCE_SERVER: {
				PersistenceServer persistenceServer = (PersistenceServer)theEObject;
				T result = casePersistenceServer(persistenceServer);
				if (result == null) result = casePlatformServer(persistenceServer);
				if (result == null) result = casePlatformResource(persistenceServer);
				if (result == null) result = caseSystemComponent(persistenceServer);
				if (result == null) result = caseSystemElement(persistenceServer);
				if (result == null) result = caseNamedElement(persistenceServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.MEM_SQL_SERVER: {
				MemSQLServer memSQLServer = (MemSQLServer)theEObject;
				T result = caseMemSQLServer(memSQLServer);
				if (result == null) result = casePersistenceServer(memSQLServer);
				if (result == null) result = casePlatformServer(memSQLServer);
				if (result == null) result = casePlatformResource(memSQLServer);
				if (result == null) result = caseSystemComponent(memSQLServer);
				if (result == null) result = caseSystemElement(memSQLServer);
				if (result == null) result = caseNamedElement(memSQLServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.CASSANDRA_SERVER: {
				CassandraServer cassandraServer = (CassandraServer)theEObject;
				T result = caseCassandraServer(cassandraServer);
				if (result == null) result = casePersistenceServer(cassandraServer);
				if (result == null) result = casePlatformServer(cassandraServer);
				if (result == null) result = casePlatformResource(cassandraServer);
				if (result == null) result = caseSystemComponent(cassandraServer);
				if (result == null) result = caseSystemElement(cassandraServer);
				if (result == null) result = caseNamedElement(cassandraServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NEO4_JSERVER: {
				Neo4JServer neo4JServer = (Neo4JServer)theEObject;
				T result = caseNeo4JServer(neo4JServer);
				if (result == null) result = casePersistenceServer(neo4JServer);
				if (result == null) result = casePlatformServer(neo4JServer);
				if (result == null) result = casePlatformResource(neo4JServer);
				if (result == null) result = caseSystemComponent(neo4JServer);
				if (result == null) result = caseSystemElement(neo4JServer);
				if (result == null) result = caseNamedElement(neo4JServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.MONITORING_SERVER: {
				MonitoringServer monitoringServer = (MonitoringServer)theEObject;
				T result = caseMonitoringServer(monitoringServer);
				if (result == null) result = casePlatformServer(monitoringServer);
				if (result == null) result = casePlatformResource(monitoringServer);
				if (result == null) result = caseSystemComponent(monitoringServer);
				if (result == null) result = caseSystemElement(monitoringServer);
				if (result == null) result = caseNamedElement(monitoringServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROMETHEUS_SERVER: {
				PrometheusServer prometheusServer = (PrometheusServer)theEObject;
				T result = casePrometheusServer(prometheusServer);
				if (result == null) result = caseMonitoringServer(prometheusServer);
				if (result == null) result = casePlatformServer(prometheusServer);
				if (result == null) result = casePlatformResource(prometheusServer);
				if (result == null) result = caseSystemComponent(prometheusServer);
				if (result == null) result = caseSystemElement(prometheusServer);
				if (result == null) result = caseNamedElement(prometheusServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_DATA: {
				StreamData streamData = (StreamData)theEObject;
				T result = caseStreamData(streamData);
				if (result == null) result = caseSystemComponent(streamData);
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
				if (result == null) result = caseSystemComponent(workflowStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.FLOW_STREAM_DATA: {
				FlowStreamData flowStreamData = (FlowStreamData)theEObject;
				T result = caseFlowStreamData(flowStreamData);
				if (result == null) result = caseWorkflowStreamData(flowStreamData);
				if (result == null) result = caseNamedElement(flowStreamData);
				if (result == null) result = caseStreamData(flowStreamData);
				if (result == null) result = caseSystemComponent(flowStreamData);
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
				if (result == null) result = caseSystemComponent(kafkaFlowStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DERIVED_STREAM_DATA: {
				DerivedStreamData derivedStreamData = (DerivedStreamData)theEObject;
				T result = caseDerivedStreamData(derivedStreamData);
				if (result == null) result = caseWorkflowStreamData(derivedStreamData);
				if (result == null) result = caseNamedElement(derivedStreamData);
				if (result == null) result = caseStreamData(derivedStreamData);
				if (result == null) result = caseSystemComponent(derivedStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKLOAD_STREAM_DATA: {
				WorkloadStreamData workloadStreamData = (WorkloadStreamData)theEObject;
				T result = caseWorkloadStreamData(workloadStreamData);
				if (result == null) result = caseSystemElement(workloadStreamData);
				if (result == null) result = caseStreamData(workloadStreamData);
				if (result == null) result = caseNamedElement(workloadStreamData);
				if (result == null) result = caseSystemComponent(workloadStreamData);
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
				if (result == null) result = caseSystemComponent(kafkaWorkloadStreamData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = caseSystemElement(workflow);
				if (result == null) result = caseSystemComponent(workflow);
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
				if (result == null) result = caseSystemComponent(taskExecutor);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PROMETHEUS_METER: {
				PrometheusMeter prometheusMeter = (PrometheusMeter)theEObject;
				T result = casePrometheusMeter(prometheusMeter);
				if (result == null) result = caseMeter(prometheusMeter);
				if (result == null) result = caseNamedElement(prometheusMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_HOSTED_METER: {
				NodeHostedMeter nodeHostedMeter = (NodeHostedMeter)theEObject;
				T result = caseNodeHostedMeter(nodeHostedMeter);
				if (result == null) result = caseSystemComponent(nodeHostedMeter);
				if (result == null) result = casePrometheusMeter(nodeHostedMeter);
				if (result == null) result = caseMeter(nodeHostedMeter);
				if (result == null) result = caseNamedElement(nodeHostedMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.NODE_RESOURCE_METER: {
				NodeResourceMeter nodeResourceMeter = (NodeResourceMeter)theEObject;
				T result = caseNodeResourceMeter(nodeResourceMeter);
				if (result == null) result = caseNodeHostedMeter(nodeResourceMeter);
				if (result == null) result = caseSystemComponent(nodeResourceMeter);
				if (result == null) result = casePrometheusMeter(nodeResourceMeter);
				if (result == null) result = caseMeter(nodeResourceMeter);
				if (result == null) result = caseNamedElement(nodeResourceMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.COMMUNICATION_METER: {
				CommunicationMeter communicationMeter = (CommunicationMeter)theEObject;
				T result = caseCommunicationMeter(communicationMeter);
				if (result == null) result = caseNodeHostedMeter(communicationMeter);
				if (result == null) result = caseSystemComponent(communicationMeter);
				if (result == null) result = casePrometheusMeter(communicationMeter);
				if (result == null) result = caseMeter(communicationMeter);
				if (result == null) result = caseNamedElement(communicationMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STREAM_RATE_METER: {
				StreamRateMeter streamRateMeter = (StreamRateMeter)theEObject;
				T result = caseStreamRateMeter(streamRateMeter);
				if (result == null) result = casePrometheusMeter(streamRateMeter);
				if (result == null) result = caseMeter(streamRateMeter);
				if (result == null) result = caseNamedElement(streamRateMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.WORKFLOW_LATENCY_METER: {
				WorkflowLatencyMeter workflowLatencyMeter = (WorkflowLatencyMeter)theEObject;
				T result = caseWorkflowLatencyMeter(workflowLatencyMeter);
				if (result == null) result = casePrometheusMeter(workflowLatencyMeter);
				if (result == null) result = caseMeter(workflowLatencyMeter);
				if (result == null) result = caseNamedElement(workflowLatencyMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER: {
				TaskProcessingAmountMeter taskProcessingAmountMeter = (TaskProcessingAmountMeter)theEObject;
				T result = caseTaskProcessingAmountMeter(taskProcessingAmountMeter);
				if (result == null) result = casePrometheusMeter(taskProcessingAmountMeter);
				if (result == null) result = caseMeter(taskProcessingAmountMeter);
				if (result == null) result = caseNamedElement(taskProcessingAmountMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SYSTEM_COMPONENT: {
				SystemComponent systemComponent = (SystemComponent)theEObject;
				T result = caseSystemComponent(systemComponent);
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
			case PasysPackage.EXPORTER_DATA: {
				ExporterData exporterData = (ExporterData)theEObject;
				T result = caseExporterData(exporterData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STRING_TO_STRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMap(stringToStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = casePlatformResource(container);
				if (result == null) result = caseSystemElement(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DOCKER_CONTAINER: {
				DockerContainer dockerContainer = (DockerContainer)theEObject;
				T result = caseDockerContainer(dockerContainer);
				if (result == null) result = caseContainer(dockerContainer);
				if (result == null) result = casePlatformResource(dockerContainer);
				if (result == null) result = caseSystemElement(dockerContainer);
				if (result == null) result = caseNamedElement(dockerContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.CONTAINERIZATION_SERVER: {
				ContainerizationServer containerizationServer = (ContainerizationServer)theEObject;
				T result = caseContainerizationServer(containerizationServer);
				if (result == null) result = casePlatformServer(containerizationServer);
				if (result == null) result = casePlatformResource(containerizationServer);
				if (result == null) result = caseSystemComponent(containerizationServer);
				if (result == null) result = caseSystemElement(containerizationServer);
				if (result == null) result = caseNamedElement(containerizationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DOCKER_SERVER: {
				DockerServer dockerServer = (DockerServer)theEObject;
				T result = caseDockerServer(dockerServer);
				if (result == null) result = caseContainerizationServer(dockerServer);
				if (result == null) result = casePlatformServer(dockerServer);
				if (result == null) result = casePlatformResource(dockerServer);
				if (result == null) result = caseSystemComponent(dockerServer);
				if (result == null) result = caseSystemElement(dockerServer);
				if (result == null) result = caseNamedElement(dockerServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.ORCHESTRATION_SERVER: {
				OrchestrationServer orchestrationServer = (OrchestrationServer)theEObject;
				T result = caseOrchestrationServer(orchestrationServer);
				if (result == null) result = casePlatformServer(orchestrationServer);
				if (result == null) result = casePlatformResource(orchestrationServer);
				if (result == null) result = caseSystemComponent(orchestrationServer);
				if (result == null) result = caseSystemElement(orchestrationServer);
				if (result == null) result = caseNamedElement(orchestrationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SWARM_SERVER: {
				SwarmServer swarmServer = (SwarmServer)theEObject;
				T result = caseSwarmServer(swarmServer);
				if (result == null) result = caseOrchestrationServer(swarmServer);
				if (result == null) result = casePlatformServer(swarmServer);
				if (result == null) result = casePlatformResource(swarmServer);
				if (result == null) result = caseSystemComponent(swarmServer);
				if (result == null) result = caseSystemElement(swarmServer);
				if (result == null) result = caseNamedElement(swarmServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SWARM_CLUSTER: {
				SwarmCluster swarmCluster = (SwarmCluster)theEObject;
				T result = caseSwarmCluster(swarmCluster);
				if (result == null) result = caseResourceCluster(swarmCluster);
				if (result == null) result = casePlatformResource(swarmCluster);
				if (result == null) result = caseSystemElement(swarmCluster);
				if (result == null) result = caseNamedElement(swarmCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.STACK: {
				Stack stack = (Stack)theEObject;
				T result = caseStack(stack);
				if (result == null) result = caseNamedElement(stack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SERVICE_NETWORK: {
				ServiceNetwork serviceNetwork = (ServiceNetwork)theEObject;
				T result = caseServiceNetwork(serviceNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.SWARM_NETWORK: {
				SwarmNetwork swarmNetwork = (SwarmNetwork)theEObject;
				T result = caseSwarmNetwork(swarmNetwork);
				if (result == null) result = caseNamedElement(swarmNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.REGISTRY: {
				Registry registry = (Registry)theEObject;
				T result = caseRegistry(registry);
				if (result == null) result = caseNamedElement(registry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PasysPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedElement(repository);
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
	 * Returns the result of interpreting the object as an instance of '<em>System External Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System External Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemExternalElement(SystemExternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemAdapter(SystemAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Element Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Element Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemElementAdapter(SystemElementAdapter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCluster(ResourceCluster object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Platform Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformServer(PlatformServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialization Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialization Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializationServer(SerializationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVRO Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVRO Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVROServer(AVROServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionServer(DistributionServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zookeeper Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zookeeper Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZookeeperServer(ZookeeperServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationServer(CommunicationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kafka Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kafka Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKafkaServer(KafkaServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingServer(SchedulingServer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Spark Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spark Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparkServer(SparkServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storm Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storm Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormServer(StormServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceServer(PersistenceServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem SQL Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem SQL Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemSQLServer(MemSQLServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cassandra Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cassandra Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCassandraServer(CassandraServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo4 JServer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo4 JServer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeo4JServer(Neo4JServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringServer(MonitoringServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prometheus Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prometheus Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrometheusServer(PrometheusServer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponent(SystemComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerContainer(DockerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerization Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerization Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerizationServer(ContainerizationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerServer(DockerServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestration Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestration Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestrationServer(OrchestrationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarmServer(SwarmServer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStack(Stack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNetwork(ServiceNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarmNetwork(SwarmNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistry(Registry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeCluster(NodeCluster object) {
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
