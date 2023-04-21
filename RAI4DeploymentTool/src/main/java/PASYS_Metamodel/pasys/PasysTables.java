/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /RAI4DeploymentTool/metamodels/RAI4_metamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package PASYS_Metamodel.pasys;

// import PASYS_Metamodel.pasys.PasysPackage;
// import PASYS_Metamodel.pasys.PasysTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * PasysTables provides the dispatch tables for the pasys for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class PasysTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PasysPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys = IdManager.getNsURIPackageId("www.unican.es/ISTR/P3forI4/pasys", null, PasysPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_ArtifactDescriptor = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ArtifactDescriptor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CassandraService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("CassandraService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CommunicationMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("CommunicationMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CommunicationService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("CommunicationService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComputationalSystem = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ComputationalSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DataCenter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DataCenter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DeployableComponent = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DeployableComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DeploymentConfiguration = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DeploymentConfiguration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DeploymentConstraints = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DeploymentConstraints", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DeploymentFileDescriptor = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DeploymentFileDescriptor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DerivedStreamData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("DerivedStreamData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExporterData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ExporterData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FileDescriptor = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("FileDescriptor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FlowStreamData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("FlowStreamData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_KafkaService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("KafkaService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Meter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Meter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MonitoringService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("MonitoringService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Network = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Network", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NetworkUtilization = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("NetworkUtilization", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NodeHostedMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("NodeHostedMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NodeResourceMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("NodeResourceMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OrchestratorDeploymentConf = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("OrchestratorDeploymentConf", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PlatformService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("PlatformService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Port = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Port", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessingNode = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ProcessingNode", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessingNodeCluster = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ProcessingNodeCluster", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessingNodeMemory = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ProcessingNodeMemory", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessingNodeUtilization = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ProcessingNodeUtilization", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProcessingResourceCluster = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ProcessingResourceCluster", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrometheusService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("PrometheusService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Rack = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Rack", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SchedulableSet = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("SchedulableSet", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SchedulingService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("SchedulingService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SparkService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("SparkService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StormNimbus = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StormNimbus", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StormService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StormService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StormSupervisor = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StormSupervisor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StormUI = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StormUI", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StreamData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StreamData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StreamDataPartition = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StreamDataPartition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StreamDataRate = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StreamDataRate", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StreamRateMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("StreamRateMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SystemElement = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("SystemElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Task = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Task", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TaskExecutor = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("TaskExecutor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TaskProcessingAmount = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("TaskProcessingAmount", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TaskProcessingAmountMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("TaskProcessingAmountMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Volume = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Volume", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Workflow = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("Workflow", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkflowLatency = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("WorkflowLatency", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkflowLatencyMeter = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("WorkflowLatencyMeter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkflowStreamData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("WorkflowStreamData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkloadStreamData = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("WorkloadStreamData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ZookeeperService = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getClassId("ZookeeperService", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = PasysTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = PasysTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = PasysTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_Properties = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getDataTypeId("Properties", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DeployableComponentType = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getEnumerationId("DeployableComponentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PortMode = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getEnumerationId("PortMode");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Protocol = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getEnumerationId("Protocol");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VolumeAccessMode = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getEnumerationId("VolumeAccessMode");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_VolumeType = PasysTables.PACKid_www_unican_es_s_ISTR_s_P3forI4_s_pasys.getEnumerationId("VolumeType");
	public static final /*@NonInvalid*/ MapTypeId MAP_PRIMid_String_PRIMid_String = TypeId.MAP.getSpecializedId(TypeId.STRING, TypeId.STRING, true, true);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CassandraService = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_CassandraService, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DeploymentFileDescriptor = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_DeploymentFileDescriptor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DerivedStreamData = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_DerivedStreamData, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_FlowStreamData = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_FlowStreamData, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_KafkaService = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_KafkaService, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NetworkUtilization = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_NetworkUtilization, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PlatformService = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_PlatformService, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessingNode = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_ProcessingNode, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessingNodeCluster = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_ProcessingNodeCluster, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessingNodeMemory = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_ProcessingNodeMemory, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ProcessingNodeUtilization = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_ProcessingNodeUtilization, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Rack = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_Rack, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SchedulableSet = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_SchedulableSet, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SparkService = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_SparkService, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StormNimbus = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StormNimbus, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StormService = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StormService, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StormSupervisor = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StormSupervisor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StormUI = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StormUI, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StreamDataPartition = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StreamDataPartition, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StreamDataRate = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_StreamDataRate, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Task = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_Task, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TaskExecutor = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_TaskExecutor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_TaskProcessingAmount = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_TaskProcessingAmount, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Workflow = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_Workflow, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WorkflowLatency = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_WorkflowLatency, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WorkloadStreamData = TypeId.BAG.getSpecializedId(PasysTables.CLSSid_WorkloadStreamData, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ArtifactDescriptor = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_ArtifactDescriptor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DataCenter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_DataCenter, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DeploymentFileDescriptor = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_DeploymentFileDescriptor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ExporterData = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_ExporterData, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_FileDescriptor = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_FileDescriptor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Meter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Meter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Network = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Network, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NodeHostedMeter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_NodeHostedMeter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Port = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Port, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProcessingNode = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_ProcessingNode, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Rack = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Rack, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StreamData = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_StreamData, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StreamDataPartition = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_StreamDataPartition, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StreamData_0 = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_StreamData, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StreamRateMeter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_StreamRateMeter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Task = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Task, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TaskExecutor = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_TaskExecutor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TaskProcessingAmountMeter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_TaskProcessingAmountMeter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Task_0 = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Task, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Volume = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Volume, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Workflow = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Workflow, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkflowLatencyMeter = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_WorkflowLatencyMeter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkflowStreamData = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_WorkflowStreamData, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Workflow_0 = TypeId.ORDERED_SET.getSpecializedId(PasysTables.CLSSid_Workflow, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_SystemElement = TypeId.SET.getSpecializedId(PasysTables.CLSSid_SystemElement, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PasysTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AVROService = new EcoreExecutorType(PasysPackage.Literals.AVRO_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _AWSVirtualProcessingNode = new EcoreExecutorType(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE, PACKAGE, 0);
		public static final EcoreExecutorType _ArtifactDescriptor = new EcoreExecutorType(PasysPackage.Literals.ARTIFACT_DESCRIPTOR, PACKAGE, 0);
		public static final EcoreExecutorType _CassandraService = new EcoreExecutorType(PasysPackage.Literals.CASSANDRA_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _CommunicationMeter = new EcoreExecutorType(PasysPackage.Literals.COMMUNICATION_METER, PACKAGE, 0);
		public static final EcoreExecutorType _CommunicationService = new EcoreExecutorType(PasysPackage.Literals.COMMUNICATION_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ComputationalSystem = new EcoreExecutorType(PasysPackage.Literals.COMPUTATIONAL_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _ConfigurationException = new EcoreExecutorType(PasysPackage.Literals.CONFIGURATION_EXCEPTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DataCenter = new EcoreExecutorType(PasysPackage.Literals.DATA_CENTER, PACKAGE, 0);
		public static final EcoreExecutorType _DeployableComponent = new EcoreExecutorType(PasysPackage.Literals.DEPLOYABLE_COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _DeployableComponentType = new EcoreExecutorEnumeration(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _DeploymentConfiguration = new EcoreExecutorType(PasysPackage.Literals.DEPLOYMENT_CONFIGURATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DeploymentConstraints = new EcoreExecutorType(PasysPackage.Literals.DEPLOYMENT_CONSTRAINTS, PACKAGE, 0);
		public static final EcoreExecutorType _DeploymentException = new EcoreExecutorType(PasysPackage.Literals.DEPLOYMENT_EXCEPTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DeploymentFileDescriptor = new EcoreExecutorType(PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR, PACKAGE, 0);
		public static final EcoreExecutorType _DerivedStreamData = new EcoreExecutorType(PasysPackage.Literals.DERIVED_STREAM_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _DistributionService = new EcoreExecutorType(PasysPackage.Literals.DISTRIBUTION_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Exception = new EcoreExecutorType(PasysPackage.Literals.EXCEPTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ExporterData = new EcoreExecutorType(PasysPackage.Literals.EXPORTER_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _FileDescriptor = new EcoreExecutorType(PasysPackage.Literals.FILE_DESCRIPTOR, PACKAGE, 0);
		public static final EcoreExecutorType _FlowStreamData = new EcoreExecutorType(PasysPackage.Literals.FLOW_STREAM_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _KafkaFlowStreamData = new EcoreExecutorType(PasysPackage.Literals.KAFKA_FLOW_STREAM_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _KafkaService = new EcoreExecutorType(PasysPackage.Literals.KAFKA_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _KafkaWorkloadStreamData = new EcoreExecutorType(PasysPackage.Literals.KAFKA_WORKLOAD_STREAM_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _KubernetesCluster = new EcoreExecutorType(PasysPackage.Literals.KUBERNETES_CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _KubernetesPort = new EcoreExecutorType(PasysPackage.Literals.KUBERNETES_PORT, PACKAGE, 0);
		public static final EcoreExecutorType _LaunchException = new EcoreExecutorType(PasysPackage.Literals.LAUNCH_EXCEPTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _MemSQLService = new EcoreExecutorType(PasysPackage.Literals.MEM_SQL_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Meter = new EcoreExecutorType(PasysPackage.Literals.METER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Metric = new EcoreExecutorType(PasysPackage.Literals.METRIC, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _MonitoringService = new EcoreExecutorType(PasysPackage.Literals.MONITORING_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(PasysPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Neo4JService = new EcoreExecutorType(PasysPackage.Literals.NEO4_JSERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Network = new EcoreExecutorType(PasysPackage.Literals.NETWORK, PACKAGE, 0);
		public static final EcoreExecutorType _NetworkUtilization = new EcoreExecutorType(PasysPackage.Literals.NETWORK_UTILIZATION, PACKAGE, 0);
		public static final EcoreExecutorType _NodeDeploymentConf = new EcoreExecutorType(PasysPackage.Literals.NODE_DEPLOYMENT_CONF, PACKAGE, 0);
		public static final EcoreExecutorType _NodeHostedMeter = new EcoreExecutorType(PasysPackage.Literals.NODE_HOSTED_METER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NodeResourceMeter = new EcoreExecutorType(PasysPackage.Literals.NODE_RESOURCE_METER, PACKAGE, 0);
		public static final EcoreExecutorType _NodeScheduler = new EcoreExecutorType(PasysPackage.Literals.NODE_SCHEDULER, PACKAGE, 0);
		public static final EcoreExecutorType _OrchestrationCluster = new EcoreExecutorType(PasysPackage.Literals.ORCHESTRATION_CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _OrchestratorDeploymentConf = new EcoreExecutorType(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF, PACKAGE, 0);
		public static final EcoreExecutorType _PersistenceService = new EcoreExecutorType(PasysPackage.Literals.PERSISTENCE_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PhysicalProcessingNode = new EcoreExecutorType(PasysPackage.Literals.PHYSICAL_PROCESSING_NODE, PACKAGE, 0);
		public static final EcoreExecutorType _PlatformResource = new EcoreExecutorType(PasysPackage.Literals.PLATFORM_RESOURCE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PlatformService = new EcoreExecutorType(PasysPackage.Literals.PLATFORM_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PlatformServiceDeploymentConf = new EcoreExecutorType(PasysPackage.Literals.PLATFORM_SERVICE_DEPLOYMENT_CONF, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Port = new EcoreExecutorType(PasysPackage.Literals.PORT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PortMode = new EcoreExecutorEnumeration(PasysPackage.Literals.PORT_MODE, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessingNode = new EcoreExecutorType(PasysPackage.Literals.PROCESSING_NODE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ProcessingNodeCluster = new EcoreExecutorType(PasysPackage.Literals.PROCESSING_NODE_CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessingNodeMemory = new EcoreExecutorType(PasysPackage.Literals.PROCESSING_NODE_MEMORY, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessingNodeUtilization = new EcoreExecutorType(PasysPackage.Literals.PROCESSING_NODE_UTILIZATION, PACKAGE, 0);
		public static final EcoreExecutorType _ProcessingResourceCluster = new EcoreExecutorType(PasysPackage.Literals.PROCESSING_RESOURCE_CLUSTER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _PrometheusMeter = new EcoreExecutorType(PasysPackage.Literals.PROMETHEUS_METER, PACKAGE, 0);
		public static final EcoreExecutorType _PrometheusService = new EcoreExecutorType(PasysPackage.Literals.PROMETHEUS_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Properties = new EcoreExecutorType("Properties", PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Protocol = new EcoreExecutorEnumeration(PasysPackage.Literals.PROTOCOL, PACKAGE, 0);
		public static final EcoreExecutorType _Rack = new EcoreExecutorType(PasysPackage.Literals.RACK, PACKAGE, 0);
		public static final EcoreExecutorType _SchedulableSet = new EcoreExecutorType(PasysPackage.Literals.SCHEDULABLE_SET, PACKAGE, 0);
		public static final EcoreExecutorType _SchedulingService = new EcoreExecutorType(PasysPackage.Literals.SCHEDULING_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _SecurityService = new EcoreExecutorType(PasysPackage.Literals.SECURITY_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _SerializationService = new EcoreExecutorType(PasysPackage.Literals.SERIALIZATION_SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _SparkService = new EcoreExecutorType(PasysPackage.Literals.SPARK_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _StormNimbus = new EcoreExecutorType(PasysPackage.Literals.STORM_NIMBUS, PACKAGE, 0);
		public static final EcoreExecutorType _StormService = new EcoreExecutorType(PasysPackage.Literals.STORM_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _StormSupervisor = new EcoreExecutorType(PasysPackage.Literals.STORM_SUPERVISOR, PACKAGE, 0);
		public static final EcoreExecutorType _StormUI = new EcoreExecutorType(PasysPackage.Literals.STORM_UI, PACKAGE, 0);
		public static final EcoreExecutorType _StreamData = new EcoreExecutorType(PasysPackage.Literals.STREAM_DATA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _StreamDataPartition = new EcoreExecutorType(PasysPackage.Literals.STREAM_DATA_PARTITION, PACKAGE, 0);
		public static final EcoreExecutorType _StreamDataRate = new EcoreExecutorType(PasysPackage.Literals.STREAM_DATA_RATE, PACKAGE, 0);
		public static final EcoreExecutorType _StreamRateMeter = new EcoreExecutorType(PasysPackage.Literals.STREAM_RATE_METER, PACKAGE, 0);
		public static final EcoreExecutorType _StringToStringMap = new EcoreExecutorType(PasysPackage.Literals.STRING_TO_STRING_MAP, PACKAGE, 0);
		public static final EcoreExecutorType _SwarmCluster = new EcoreExecutorType(PasysPackage.Literals.SWARM_CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _SwarmPort = new EcoreExecutorType(PasysPackage.Literals.SWARM_PORT, PACKAGE, 0);
		public static final EcoreExecutorType _SystemElement = new EcoreExecutorType(PasysPackage.Literals.SYSTEM_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Task = new EcoreExecutorType(PasysPackage.Literals.TASK, PACKAGE, 0);
		public static final EcoreExecutorType _TaskExecutor = new EcoreExecutorType(PasysPackage.Literals.TASK_EXECUTOR, PACKAGE, 0);
		public static final EcoreExecutorType _TaskProcessingAmount = new EcoreExecutorType(PasysPackage.Literals.TASK_PROCESSING_AMOUNT, PACKAGE, 0);
		public static final EcoreExecutorType _TaskProcessingAmountMeter = new EcoreExecutorType(PasysPackage.Literals.TASK_PROCESSING_AMOUNT_METER, PACKAGE, 0);
		public static final EcoreExecutorType _VirtualProcessingNode = new EcoreExecutorType(PasysPackage.Literals.VIRTUAL_PROCESSING_NODE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Volume = new EcoreExecutorType(PasysPackage.Literals.VOLUME, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _VolumeAccessMode = new EcoreExecutorEnumeration(PasysPackage.Literals.VOLUME_ACCESS_MODE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _VolumeType = new EcoreExecutorEnumeration(PasysPackage.Literals.VOLUME_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Workflow = new EcoreExecutorType(PasysPackage.Literals.WORKFLOW, PACKAGE, 0);
		public static final EcoreExecutorType _WorkflowLatency = new EcoreExecutorType(PasysPackage.Literals.WORKFLOW_LATENCY, PACKAGE, 0);
		public static final EcoreExecutorType _WorkflowLatencyMeter = new EcoreExecutorType(PasysPackage.Literals.WORKFLOW_LATENCY_METER, PACKAGE, 0);
		public static final EcoreExecutorType _WorkflowStreamData = new EcoreExecutorType(PasysPackage.Literals.WORKFLOW_STREAM_DATA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _WorkloadStreamData = new EcoreExecutorType(PasysPackage.Literals.WORKLOAD_STREAM_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _ZookeeperService = new EcoreExecutorType(PasysPackage.Literals.ZOOKEEPER_SERVICE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AVROService,
			_AWSVirtualProcessingNode,
			_ArtifactDescriptor,
			_CassandraService,
			_CommunicationMeter,
			_CommunicationService,
			_ComputationalSystem,
			_ConfigurationException,
			_DataCenter,
			_DeployableComponent,
			_DeployableComponentType,
			_DeploymentConfiguration,
			_DeploymentConstraints,
			_DeploymentException,
			_DeploymentFileDescriptor,
			_DerivedStreamData,
			_DistributionService,
			_Exception,
			_ExporterData,
			_FileDescriptor,
			_FlowStreamData,
			_KafkaFlowStreamData,
			_KafkaService,
			_KafkaWorkloadStreamData,
			_KubernetesCluster,
			_KubernetesPort,
			_LaunchException,
			_MemSQLService,
			_Meter,
			_Metric,
			_MonitoringService,
			_NamedElement,
			_Neo4JService,
			_Network,
			_NetworkUtilization,
			_NodeDeploymentConf,
			_NodeHostedMeter,
			_NodeResourceMeter,
			_NodeScheduler,
			_OrchestrationCluster,
			_OrchestratorDeploymentConf,
			_PersistenceService,
			_PhysicalProcessingNode,
			_PlatformResource,
			_PlatformService,
			_PlatformServiceDeploymentConf,
			_Port,
			_PortMode,
			_ProcessingNode,
			_ProcessingNodeCluster,
			_ProcessingNodeMemory,
			_ProcessingNodeUtilization,
			_ProcessingResourceCluster,
			_PrometheusMeter,
			_PrometheusService,
			_Properties,
			_Protocol,
			_Rack,
			_SchedulableSet,
			_SchedulingService,
			_SecurityService,
			_SerializationService,
			_SparkService,
			_StormNimbus,
			_StormService,
			_StormSupervisor,
			_StormUI,
			_StreamData,
			_StreamDataPartition,
			_StreamDataRate,
			_StreamRateMeter,
			_StringToStringMap,
			_SwarmCluster,
			_SwarmPort,
			_SystemElement,
			_Task,
			_TaskExecutor,
			_TaskProcessingAmount,
			_TaskProcessingAmountMeter,
			_VirtualProcessingNode,
			_Volume,
			_VolumeAccessMode,
			_VolumeType,
			_Workflow,
			_WorkflowLatency,
			_WorkflowLatencyMeter,
			_WorkflowStreamData,
			_WorkloadStreamData,
			_ZookeeperService
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AVROService__AVROService = new ExecutorFragment(Types._AVROService, PasysTables.Types._AVROService);
		private static final ExecutorFragment _AVROService__DeployableComponent = new ExecutorFragment(Types._AVROService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _AVROService__NamedElement = new ExecutorFragment(Types._AVROService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _AVROService__OclAny = new ExecutorFragment(Types._AVROService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AVROService__OclElement = new ExecutorFragment(Types._AVROService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AVROService__PlatformResource = new ExecutorFragment(Types._AVROService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _AVROService__PlatformService = new ExecutorFragment(Types._AVROService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _AVROService__SerializationService = new ExecutorFragment(Types._AVROService, PasysTables.Types._SerializationService);
		private static final ExecutorFragment _AVROService__SystemElement = new ExecutorFragment(Types._AVROService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _AWSVirtualProcessingNode__AWSVirtualProcessingNode = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._AWSVirtualProcessingNode);
		private static final ExecutorFragment _AWSVirtualProcessingNode__NamedElement = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _AWSVirtualProcessingNode__OclAny = new ExecutorFragment(Types._AWSVirtualProcessingNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AWSVirtualProcessingNode__OclElement = new ExecutorFragment(Types._AWSVirtualProcessingNode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AWSVirtualProcessingNode__PlatformResource = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _AWSVirtualProcessingNode__ProcessingNode = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._ProcessingNode);
		private static final ExecutorFragment _AWSVirtualProcessingNode__SystemElement = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _AWSVirtualProcessingNode__VirtualProcessingNode = new ExecutorFragment(Types._AWSVirtualProcessingNode, PasysTables.Types._VirtualProcessingNode);

		private static final ExecutorFragment _ArtifactDescriptor__ArtifactDescriptor = new ExecutorFragment(Types._ArtifactDescriptor, PasysTables.Types._ArtifactDescriptor);
		private static final ExecutorFragment _ArtifactDescriptor__FileDescriptor = new ExecutorFragment(Types._ArtifactDescriptor, PasysTables.Types._FileDescriptor);
		private static final ExecutorFragment _ArtifactDescriptor__OclAny = new ExecutorFragment(Types._ArtifactDescriptor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArtifactDescriptor__OclElement = new ExecutorFragment(Types._ArtifactDescriptor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CassandraService__CassandraService = new ExecutorFragment(Types._CassandraService, PasysTables.Types._CassandraService);
		private static final ExecutorFragment _CassandraService__DeployableComponent = new ExecutorFragment(Types._CassandraService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _CassandraService__NamedElement = new ExecutorFragment(Types._CassandraService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _CassandraService__OclAny = new ExecutorFragment(Types._CassandraService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CassandraService__OclElement = new ExecutorFragment(Types._CassandraService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CassandraService__PersistenceService = new ExecutorFragment(Types._CassandraService, PasysTables.Types._PersistenceService);
		private static final ExecutorFragment _CassandraService__PlatformResource = new ExecutorFragment(Types._CassandraService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _CassandraService__PlatformService = new ExecutorFragment(Types._CassandraService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _CassandraService__SystemElement = new ExecutorFragment(Types._CassandraService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _CommunicationMeter__CommunicationMeter = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._CommunicationMeter);
		private static final ExecutorFragment _CommunicationMeter__DeployableComponent = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _CommunicationMeter__Meter = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _CommunicationMeter__NamedElement = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _CommunicationMeter__NodeHostedMeter = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._NodeHostedMeter);
		private static final ExecutorFragment _CommunicationMeter__OclAny = new ExecutorFragment(Types._CommunicationMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CommunicationMeter__OclElement = new ExecutorFragment(Types._CommunicationMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CommunicationMeter__PrometheusMeter = new ExecutorFragment(Types._CommunicationMeter, PasysTables.Types._PrometheusMeter);

		private static final ExecutorFragment _CommunicationService__CommunicationService = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._CommunicationService);
		private static final ExecutorFragment _CommunicationService__DeployableComponent = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _CommunicationService__NamedElement = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _CommunicationService__OclAny = new ExecutorFragment(Types._CommunicationService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CommunicationService__OclElement = new ExecutorFragment(Types._CommunicationService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CommunicationService__PlatformResource = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _CommunicationService__PlatformService = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _CommunicationService__SystemElement = new ExecutorFragment(Types._CommunicationService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _ComputationalSystem__ComputationalSystem = new ExecutorFragment(Types._ComputationalSystem, PasysTables.Types._ComputationalSystem);
		private static final ExecutorFragment _ComputationalSystem__OclAny = new ExecutorFragment(Types._ComputationalSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComputationalSystem__OclElement = new ExecutorFragment(Types._ComputationalSystem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConfigurationException__ConfigurationException = new ExecutorFragment(Types._ConfigurationException, PasysTables.Types._ConfigurationException);
		private static final ExecutorFragment _ConfigurationException__Exception = new ExecutorFragment(Types._ConfigurationException, PasysTables.Types._Exception);
		private static final ExecutorFragment _ConfigurationException__OclAny = new ExecutorFragment(Types._ConfigurationException, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConfigurationException__OclElement = new ExecutorFragment(Types._ConfigurationException, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataCenter__DataCenter = new ExecutorFragment(Types._DataCenter, PasysTables.Types._DataCenter);
		private static final ExecutorFragment _DataCenter__NamedElement = new ExecutorFragment(Types._DataCenter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _DataCenter__OclAny = new ExecutorFragment(Types._DataCenter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataCenter__OclElement = new ExecutorFragment(Types._DataCenter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DeployableComponent__DeployableComponent = new ExecutorFragment(Types._DeployableComponent, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _DeployableComponent__OclAny = new ExecutorFragment(Types._DeployableComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeployableComponent__OclElement = new ExecutorFragment(Types._DeployableComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DeployableComponentType__DeployableComponentType = new ExecutorFragment(Types._DeployableComponentType, PasysTables.Types._DeployableComponentType);
		private static final ExecutorFragment _DeployableComponentType__OclAny = new ExecutorFragment(Types._DeployableComponentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeployableComponentType__OclElement = new ExecutorFragment(Types._DeployableComponentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DeployableComponentType__OclEnumeration = new ExecutorFragment(Types._DeployableComponentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DeployableComponentType__OclType = new ExecutorFragment(Types._DeployableComponentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DeploymentConfiguration__DeploymentConfiguration = new ExecutorFragment(Types._DeploymentConfiguration, PasysTables.Types._DeploymentConfiguration);
		private static final ExecutorFragment _DeploymentConfiguration__OclAny = new ExecutorFragment(Types._DeploymentConfiguration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeploymentConfiguration__OclElement = new ExecutorFragment(Types._DeploymentConfiguration, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DeploymentConstraints__DeploymentConstraints = new ExecutorFragment(Types._DeploymentConstraints, PasysTables.Types._DeploymentConstraints);
		private static final ExecutorFragment _DeploymentConstraints__OclAny = new ExecutorFragment(Types._DeploymentConstraints, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeploymentConstraints__OclElement = new ExecutorFragment(Types._DeploymentConstraints, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DeploymentException__DeploymentException = new ExecutorFragment(Types._DeploymentException, PasysTables.Types._DeploymentException);
		private static final ExecutorFragment _DeploymentException__Exception = new ExecutorFragment(Types._DeploymentException, PasysTables.Types._Exception);
		private static final ExecutorFragment _DeploymentException__OclAny = new ExecutorFragment(Types._DeploymentException, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeploymentException__OclElement = new ExecutorFragment(Types._DeploymentException, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DeploymentFileDescriptor__DeploymentFileDescriptor = new ExecutorFragment(Types._DeploymentFileDescriptor, PasysTables.Types._DeploymentFileDescriptor);
		private static final ExecutorFragment _DeploymentFileDescriptor__FileDescriptor = new ExecutorFragment(Types._DeploymentFileDescriptor, PasysTables.Types._FileDescriptor);
		private static final ExecutorFragment _DeploymentFileDescriptor__OclAny = new ExecutorFragment(Types._DeploymentFileDescriptor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DeploymentFileDescriptor__OclElement = new ExecutorFragment(Types._DeploymentFileDescriptor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DerivedStreamData__DeployableComponent = new ExecutorFragment(Types._DerivedStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _DerivedStreamData__DerivedStreamData = new ExecutorFragment(Types._DerivedStreamData, PasysTables.Types._DerivedStreamData);
		private static final ExecutorFragment _DerivedStreamData__NamedElement = new ExecutorFragment(Types._DerivedStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _DerivedStreamData__OclAny = new ExecutorFragment(Types._DerivedStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DerivedStreamData__OclElement = new ExecutorFragment(Types._DerivedStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DerivedStreamData__StreamData = new ExecutorFragment(Types._DerivedStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _DerivedStreamData__WorkflowStreamData = new ExecutorFragment(Types._DerivedStreamData, PasysTables.Types._WorkflowStreamData);

		private static final ExecutorFragment _DistributionService__DeployableComponent = new ExecutorFragment(Types._DistributionService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _DistributionService__DistributionService = new ExecutorFragment(Types._DistributionService, PasysTables.Types._DistributionService);
		private static final ExecutorFragment _DistributionService__NamedElement = new ExecutorFragment(Types._DistributionService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _DistributionService__OclAny = new ExecutorFragment(Types._DistributionService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DistributionService__OclElement = new ExecutorFragment(Types._DistributionService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DistributionService__PlatformResource = new ExecutorFragment(Types._DistributionService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _DistributionService__PlatformService = new ExecutorFragment(Types._DistributionService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _DistributionService__SystemElement = new ExecutorFragment(Types._DistributionService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _Exception__Exception = new ExecutorFragment(Types._Exception, PasysTables.Types._Exception);
		private static final ExecutorFragment _Exception__OclAny = new ExecutorFragment(Types._Exception, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Exception__OclElement = new ExecutorFragment(Types._Exception, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExporterData__ExporterData = new ExecutorFragment(Types._ExporterData, PasysTables.Types._ExporterData);
		private static final ExecutorFragment _ExporterData__OclAny = new ExecutorFragment(Types._ExporterData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExporterData__OclElement = new ExecutorFragment(Types._ExporterData, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FileDescriptor__FileDescriptor = new ExecutorFragment(Types._FileDescriptor, PasysTables.Types._FileDescriptor);
		private static final ExecutorFragment _FileDescriptor__OclAny = new ExecutorFragment(Types._FileDescriptor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FileDescriptor__OclElement = new ExecutorFragment(Types._FileDescriptor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FlowStreamData__DeployableComponent = new ExecutorFragment(Types._FlowStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _FlowStreamData__FlowStreamData = new ExecutorFragment(Types._FlowStreamData, PasysTables.Types._FlowStreamData);
		private static final ExecutorFragment _FlowStreamData__NamedElement = new ExecutorFragment(Types._FlowStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _FlowStreamData__OclAny = new ExecutorFragment(Types._FlowStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FlowStreamData__OclElement = new ExecutorFragment(Types._FlowStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FlowStreamData__StreamData = new ExecutorFragment(Types._FlowStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _FlowStreamData__WorkflowStreamData = new ExecutorFragment(Types._FlowStreamData, PasysTables.Types._WorkflowStreamData);

		private static final ExecutorFragment _KafkaFlowStreamData__DeployableComponent = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _KafkaFlowStreamData__FlowStreamData = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._FlowStreamData);
		private static final ExecutorFragment _KafkaFlowStreamData__KafkaFlowStreamData = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._KafkaFlowStreamData);
		private static final ExecutorFragment _KafkaFlowStreamData__NamedElement = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _KafkaFlowStreamData__OclAny = new ExecutorFragment(Types._KafkaFlowStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KafkaFlowStreamData__OclElement = new ExecutorFragment(Types._KafkaFlowStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _KafkaFlowStreamData__StreamData = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _KafkaFlowStreamData__WorkflowStreamData = new ExecutorFragment(Types._KafkaFlowStreamData, PasysTables.Types._WorkflowStreamData);

		private static final ExecutorFragment _KafkaService__CommunicationService = new ExecutorFragment(Types._KafkaService, PasysTables.Types._CommunicationService);
		private static final ExecutorFragment _KafkaService__DeployableComponent = new ExecutorFragment(Types._KafkaService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _KafkaService__KafkaService = new ExecutorFragment(Types._KafkaService, PasysTables.Types._KafkaService);
		private static final ExecutorFragment _KafkaService__NamedElement = new ExecutorFragment(Types._KafkaService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _KafkaService__OclAny = new ExecutorFragment(Types._KafkaService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KafkaService__OclElement = new ExecutorFragment(Types._KafkaService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _KafkaService__PlatformResource = new ExecutorFragment(Types._KafkaService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _KafkaService__PlatformService = new ExecutorFragment(Types._KafkaService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _KafkaService__SystemElement = new ExecutorFragment(Types._KafkaService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _KafkaWorkloadStreamData__DeployableComponent = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _KafkaWorkloadStreamData__KafkaWorkloadStreamData = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._KafkaWorkloadStreamData);
		private static final ExecutorFragment _KafkaWorkloadStreamData__NamedElement = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _KafkaWorkloadStreamData__OclAny = new ExecutorFragment(Types._KafkaWorkloadStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KafkaWorkloadStreamData__OclElement = new ExecutorFragment(Types._KafkaWorkloadStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _KafkaWorkloadStreamData__StreamData = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _KafkaWorkloadStreamData__SystemElement = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _KafkaWorkloadStreamData__WorkloadStreamData = new ExecutorFragment(Types._KafkaWorkloadStreamData, PasysTables.Types._WorkloadStreamData);

		private static final ExecutorFragment _KubernetesCluster__KubernetesCluster = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._KubernetesCluster);
		private static final ExecutorFragment _KubernetesCluster__NamedElement = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _KubernetesCluster__OclAny = new ExecutorFragment(Types._KubernetesCluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KubernetesCluster__OclElement = new ExecutorFragment(Types._KubernetesCluster, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _KubernetesCluster__OrchestrationCluster = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._OrchestrationCluster);
		private static final ExecutorFragment _KubernetesCluster__PlatformResource = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _KubernetesCluster__ProcessingResourceCluster = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._ProcessingResourceCluster);
		private static final ExecutorFragment _KubernetesCluster__SystemElement = new ExecutorFragment(Types._KubernetesCluster, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _KubernetesPort__KubernetesPort = new ExecutorFragment(Types._KubernetesPort, PasysTables.Types._KubernetesPort);
		private static final ExecutorFragment _KubernetesPort__OclAny = new ExecutorFragment(Types._KubernetesPort, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KubernetesPort__OclElement = new ExecutorFragment(Types._KubernetesPort, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _KubernetesPort__Port = new ExecutorFragment(Types._KubernetesPort, PasysTables.Types._Port);

		private static final ExecutorFragment _LaunchException__Exception = new ExecutorFragment(Types._LaunchException, PasysTables.Types._Exception);
		private static final ExecutorFragment _LaunchException__LaunchException = new ExecutorFragment(Types._LaunchException, PasysTables.Types._LaunchException);
		private static final ExecutorFragment _LaunchException__OclAny = new ExecutorFragment(Types._LaunchException, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LaunchException__OclElement = new ExecutorFragment(Types._LaunchException, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MemSQLService__DeployableComponent = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _MemSQLService__MemSQLService = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._MemSQLService);
		private static final ExecutorFragment _MemSQLService__NamedElement = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _MemSQLService__OclAny = new ExecutorFragment(Types._MemSQLService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MemSQLService__OclElement = new ExecutorFragment(Types._MemSQLService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MemSQLService__PersistenceService = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._PersistenceService);
		private static final ExecutorFragment _MemSQLService__PlatformResource = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _MemSQLService__PlatformService = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _MemSQLService__SystemElement = new ExecutorFragment(Types._MemSQLService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _Meter__DeployableComponent = new ExecutorFragment(Types._Meter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _Meter__Meter = new ExecutorFragment(Types._Meter, PasysTables.Types._Meter);
		private static final ExecutorFragment _Meter__NamedElement = new ExecutorFragment(Types._Meter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Meter__OclAny = new ExecutorFragment(Types._Meter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Meter__OclElement = new ExecutorFragment(Types._Meter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Metric__Metric = new ExecutorFragment(Types._Metric, PasysTables.Types._Metric);
		private static final ExecutorFragment _Metric__NamedElement = new ExecutorFragment(Types._Metric, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Metric__OclAny = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Metric__OclElement = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Metric__SystemElement = new ExecutorFragment(Types._Metric, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _MonitoringService__DeployableComponent = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _MonitoringService__MonitoringService = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._MonitoringService);
		private static final ExecutorFragment _MonitoringService__NamedElement = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _MonitoringService__OclAny = new ExecutorFragment(Types._MonitoringService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MonitoringService__OclElement = new ExecutorFragment(Types._MonitoringService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MonitoringService__PlatformResource = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _MonitoringService__PlatformService = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _MonitoringService__SystemElement = new ExecutorFragment(Types._MonitoringService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Neo4JService__DeployableComponent = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _Neo4JService__NamedElement = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Neo4JService__Neo4JService = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._Neo4JService);
		private static final ExecutorFragment _Neo4JService__OclAny = new ExecutorFragment(Types._Neo4JService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Neo4JService__OclElement = new ExecutorFragment(Types._Neo4JService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Neo4JService__PersistenceService = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._PersistenceService);
		private static final ExecutorFragment _Neo4JService__PlatformResource = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _Neo4JService__PlatformService = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _Neo4JService__SystemElement = new ExecutorFragment(Types._Neo4JService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _Network__NamedElement = new ExecutorFragment(Types._Network, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, PasysTables.Types._Network);
		private static final ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Network__PlatformResource = new ExecutorFragment(Types._Network, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _Network__SystemElement = new ExecutorFragment(Types._Network, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _NetworkUtilization__Metric = new ExecutorFragment(Types._NetworkUtilization, PasysTables.Types._Metric);
		private static final ExecutorFragment _NetworkUtilization__NamedElement = new ExecutorFragment(Types._NetworkUtilization, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _NetworkUtilization__NetworkUtilization = new ExecutorFragment(Types._NetworkUtilization, PasysTables.Types._NetworkUtilization);
		private static final ExecutorFragment _NetworkUtilization__OclAny = new ExecutorFragment(Types._NetworkUtilization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NetworkUtilization__OclElement = new ExecutorFragment(Types._NetworkUtilization, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NetworkUtilization__SystemElement = new ExecutorFragment(Types._NetworkUtilization, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _NodeDeploymentConf__DeploymentConfiguration = new ExecutorFragment(Types._NodeDeploymentConf, PasysTables.Types._DeploymentConfiguration);
		private static final ExecutorFragment _NodeDeploymentConf__NodeDeploymentConf = new ExecutorFragment(Types._NodeDeploymentConf, PasysTables.Types._NodeDeploymentConf);
		private static final ExecutorFragment _NodeDeploymentConf__OclAny = new ExecutorFragment(Types._NodeDeploymentConf, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeDeploymentConf__OclElement = new ExecutorFragment(Types._NodeDeploymentConf, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NodeDeploymentConf__PlatformServiceDeploymentConf = new ExecutorFragment(Types._NodeDeploymentConf, PasysTables.Types._PlatformServiceDeploymentConf);

		private static final ExecutorFragment _NodeHostedMeter__DeployableComponent = new ExecutorFragment(Types._NodeHostedMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _NodeHostedMeter__Meter = new ExecutorFragment(Types._NodeHostedMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _NodeHostedMeter__NamedElement = new ExecutorFragment(Types._NodeHostedMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _NodeHostedMeter__NodeHostedMeter = new ExecutorFragment(Types._NodeHostedMeter, PasysTables.Types._NodeHostedMeter);
		private static final ExecutorFragment _NodeHostedMeter__OclAny = new ExecutorFragment(Types._NodeHostedMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeHostedMeter__OclElement = new ExecutorFragment(Types._NodeHostedMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NodeHostedMeter__PrometheusMeter = new ExecutorFragment(Types._NodeHostedMeter, PasysTables.Types._PrometheusMeter);

		private static final ExecutorFragment _NodeResourceMeter__DeployableComponent = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _NodeResourceMeter__Meter = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _NodeResourceMeter__NamedElement = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _NodeResourceMeter__NodeHostedMeter = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._NodeHostedMeter);
		private static final ExecutorFragment _NodeResourceMeter__NodeResourceMeter = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._NodeResourceMeter);
		private static final ExecutorFragment _NodeResourceMeter__OclAny = new ExecutorFragment(Types._NodeResourceMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeResourceMeter__OclElement = new ExecutorFragment(Types._NodeResourceMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NodeResourceMeter__PrometheusMeter = new ExecutorFragment(Types._NodeResourceMeter, PasysTables.Types._PrometheusMeter);

		private static final ExecutorFragment _NodeScheduler__DeployableComponent = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _NodeScheduler__NamedElement = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _NodeScheduler__NodeScheduler = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._NodeScheduler);
		private static final ExecutorFragment _NodeScheduler__OclAny = new ExecutorFragment(Types._NodeScheduler, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeScheduler__OclElement = new ExecutorFragment(Types._NodeScheduler, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NodeScheduler__PlatformResource = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _NodeScheduler__PlatformService = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _NodeScheduler__SchedulingService = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._SchedulingService);
		private static final ExecutorFragment _NodeScheduler__SystemElement = new ExecutorFragment(Types._NodeScheduler, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _OrchestrationCluster__NamedElement = new ExecutorFragment(Types._OrchestrationCluster, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _OrchestrationCluster__OclAny = new ExecutorFragment(Types._OrchestrationCluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrchestrationCluster__OclElement = new ExecutorFragment(Types._OrchestrationCluster, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrchestrationCluster__OrchestrationCluster = new ExecutorFragment(Types._OrchestrationCluster, PasysTables.Types._OrchestrationCluster);
		private static final ExecutorFragment _OrchestrationCluster__PlatformResource = new ExecutorFragment(Types._OrchestrationCluster, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _OrchestrationCluster__ProcessingResourceCluster = new ExecutorFragment(Types._OrchestrationCluster, PasysTables.Types._ProcessingResourceCluster);
		private static final ExecutorFragment _OrchestrationCluster__SystemElement = new ExecutorFragment(Types._OrchestrationCluster, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _OrchestratorDeploymentConf__DeploymentConfiguration = new ExecutorFragment(Types._OrchestratorDeploymentConf, PasysTables.Types._DeploymentConfiguration);
		private static final ExecutorFragment _OrchestratorDeploymentConf__OclAny = new ExecutorFragment(Types._OrchestratorDeploymentConf, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrchestratorDeploymentConf__OclElement = new ExecutorFragment(Types._OrchestratorDeploymentConf, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrchestratorDeploymentConf__OrchestratorDeploymentConf = new ExecutorFragment(Types._OrchestratorDeploymentConf, PasysTables.Types._OrchestratorDeploymentConf);
		private static final ExecutorFragment _OrchestratorDeploymentConf__PlatformServiceDeploymentConf = new ExecutorFragment(Types._OrchestratorDeploymentConf, PasysTables.Types._PlatformServiceDeploymentConf);

		private static final ExecutorFragment _PersistenceService__DeployableComponent = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _PersistenceService__NamedElement = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PersistenceService__OclAny = new ExecutorFragment(Types._PersistenceService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PersistenceService__OclElement = new ExecutorFragment(Types._PersistenceService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PersistenceService__PersistenceService = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._PersistenceService);
		private static final ExecutorFragment _PersistenceService__PlatformResource = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _PersistenceService__PlatformService = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _PersistenceService__SystemElement = new ExecutorFragment(Types._PersistenceService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _PhysicalProcessingNode__NamedElement = new ExecutorFragment(Types._PhysicalProcessingNode, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PhysicalProcessingNode__OclAny = new ExecutorFragment(Types._PhysicalProcessingNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PhysicalProcessingNode__OclElement = new ExecutorFragment(Types._PhysicalProcessingNode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PhysicalProcessingNode__PhysicalProcessingNode = new ExecutorFragment(Types._PhysicalProcessingNode, PasysTables.Types._PhysicalProcessingNode);
		private static final ExecutorFragment _PhysicalProcessingNode__PlatformResource = new ExecutorFragment(Types._PhysicalProcessingNode, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _PhysicalProcessingNode__ProcessingNode = new ExecutorFragment(Types._PhysicalProcessingNode, PasysTables.Types._ProcessingNode);
		private static final ExecutorFragment _PhysicalProcessingNode__SystemElement = new ExecutorFragment(Types._PhysicalProcessingNode, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _PlatformResource__NamedElement = new ExecutorFragment(Types._PlatformResource, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PlatformResource__OclAny = new ExecutorFragment(Types._PlatformResource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PlatformResource__OclElement = new ExecutorFragment(Types._PlatformResource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PlatformResource__PlatformResource = new ExecutorFragment(Types._PlatformResource, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _PlatformResource__SystemElement = new ExecutorFragment(Types._PlatformResource, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _PlatformService__DeployableComponent = new ExecutorFragment(Types._PlatformService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _PlatformService__NamedElement = new ExecutorFragment(Types._PlatformService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PlatformService__OclAny = new ExecutorFragment(Types._PlatformService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PlatformService__OclElement = new ExecutorFragment(Types._PlatformService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PlatformService__PlatformResource = new ExecutorFragment(Types._PlatformService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _PlatformService__PlatformService = new ExecutorFragment(Types._PlatformService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _PlatformService__SystemElement = new ExecutorFragment(Types._PlatformService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _PlatformServiceDeploymentConf__DeploymentConfiguration = new ExecutorFragment(Types._PlatformServiceDeploymentConf, PasysTables.Types._DeploymentConfiguration);
		private static final ExecutorFragment _PlatformServiceDeploymentConf__OclAny = new ExecutorFragment(Types._PlatformServiceDeploymentConf, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PlatformServiceDeploymentConf__OclElement = new ExecutorFragment(Types._PlatformServiceDeploymentConf, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PlatformServiceDeploymentConf__PlatformServiceDeploymentConf = new ExecutorFragment(Types._PlatformServiceDeploymentConf, PasysTables.Types._PlatformServiceDeploymentConf);

		private static final ExecutorFragment _Port__OclAny = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Port__OclElement = new ExecutorFragment(Types._Port, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Port__Port = new ExecutorFragment(Types._Port, PasysTables.Types._Port);

		private static final ExecutorFragment _PortMode__OclAny = new ExecutorFragment(Types._PortMode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PortMode__OclElement = new ExecutorFragment(Types._PortMode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PortMode__OclEnumeration = new ExecutorFragment(Types._PortMode, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PortMode__OclType = new ExecutorFragment(Types._PortMode, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PortMode__PortMode = new ExecutorFragment(Types._PortMode, PasysTables.Types._PortMode);

		private static final ExecutorFragment _ProcessingNode__NamedElement = new ExecutorFragment(Types._ProcessingNode, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ProcessingNode__OclAny = new ExecutorFragment(Types._ProcessingNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingNode__OclElement = new ExecutorFragment(Types._ProcessingNode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingNode__PlatformResource = new ExecutorFragment(Types._ProcessingNode, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _ProcessingNode__ProcessingNode = new ExecutorFragment(Types._ProcessingNode, PasysTables.Types._ProcessingNode);
		private static final ExecutorFragment _ProcessingNode__SystemElement = new ExecutorFragment(Types._ProcessingNode, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _ProcessingNodeCluster__NamedElement = new ExecutorFragment(Types._ProcessingNodeCluster, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ProcessingNodeCluster__OclAny = new ExecutorFragment(Types._ProcessingNodeCluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingNodeCluster__OclElement = new ExecutorFragment(Types._ProcessingNodeCluster, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingNodeCluster__PlatformResource = new ExecutorFragment(Types._ProcessingNodeCluster, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _ProcessingNodeCluster__ProcessingNodeCluster = new ExecutorFragment(Types._ProcessingNodeCluster, PasysTables.Types._ProcessingNodeCluster);
		private static final ExecutorFragment _ProcessingNodeCluster__ProcessingResourceCluster = new ExecutorFragment(Types._ProcessingNodeCluster, PasysTables.Types._ProcessingResourceCluster);
		private static final ExecutorFragment _ProcessingNodeCluster__SystemElement = new ExecutorFragment(Types._ProcessingNodeCluster, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _ProcessingNodeMemory__Metric = new ExecutorFragment(Types._ProcessingNodeMemory, PasysTables.Types._Metric);
		private static final ExecutorFragment _ProcessingNodeMemory__NamedElement = new ExecutorFragment(Types._ProcessingNodeMemory, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ProcessingNodeMemory__OclAny = new ExecutorFragment(Types._ProcessingNodeMemory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingNodeMemory__OclElement = new ExecutorFragment(Types._ProcessingNodeMemory, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingNodeMemory__ProcessingNodeMemory = new ExecutorFragment(Types._ProcessingNodeMemory, PasysTables.Types._ProcessingNodeMemory);
		private static final ExecutorFragment _ProcessingNodeMemory__SystemElement = new ExecutorFragment(Types._ProcessingNodeMemory, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _ProcessingNodeUtilization__Metric = new ExecutorFragment(Types._ProcessingNodeUtilization, PasysTables.Types._Metric);
		private static final ExecutorFragment _ProcessingNodeUtilization__NamedElement = new ExecutorFragment(Types._ProcessingNodeUtilization, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ProcessingNodeUtilization__OclAny = new ExecutorFragment(Types._ProcessingNodeUtilization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingNodeUtilization__OclElement = new ExecutorFragment(Types._ProcessingNodeUtilization, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingNodeUtilization__ProcessingNodeUtilization = new ExecutorFragment(Types._ProcessingNodeUtilization, PasysTables.Types._ProcessingNodeUtilization);
		private static final ExecutorFragment _ProcessingNodeUtilization__SystemElement = new ExecutorFragment(Types._ProcessingNodeUtilization, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _ProcessingResourceCluster__NamedElement = new ExecutorFragment(Types._ProcessingResourceCluster, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ProcessingResourceCluster__OclAny = new ExecutorFragment(Types._ProcessingResourceCluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingResourceCluster__OclElement = new ExecutorFragment(Types._ProcessingResourceCluster, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingResourceCluster__PlatformResource = new ExecutorFragment(Types._ProcessingResourceCluster, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _ProcessingResourceCluster__ProcessingResourceCluster = new ExecutorFragment(Types._ProcessingResourceCluster, PasysTables.Types._ProcessingResourceCluster);
		private static final ExecutorFragment _ProcessingResourceCluster__SystemElement = new ExecutorFragment(Types._ProcessingResourceCluster, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _PrometheusMeter__DeployableComponent = new ExecutorFragment(Types._PrometheusMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _PrometheusMeter__Meter = new ExecutorFragment(Types._PrometheusMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _PrometheusMeter__NamedElement = new ExecutorFragment(Types._PrometheusMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PrometheusMeter__OclAny = new ExecutorFragment(Types._PrometheusMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrometheusMeter__OclElement = new ExecutorFragment(Types._PrometheusMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrometheusMeter__PrometheusMeter = new ExecutorFragment(Types._PrometheusMeter, PasysTables.Types._PrometheusMeter);

		private static final ExecutorFragment _PrometheusService__DeployableComponent = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _PrometheusService__MonitoringService = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._MonitoringService);
		private static final ExecutorFragment _PrometheusService__NamedElement = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _PrometheusService__OclAny = new ExecutorFragment(Types._PrometheusService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrometheusService__OclElement = new ExecutorFragment(Types._PrometheusService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrometheusService__PlatformResource = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _PrometheusService__PlatformService = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _PrometheusService__PrometheusService = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._PrometheusService);
		private static final ExecutorFragment _PrometheusService__SystemElement = new ExecutorFragment(Types._PrometheusService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _Properties__OclAny = new ExecutorFragment(Types._Properties, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Properties__Properties = new ExecutorFragment(Types._Properties, PasysTables.Types._Properties);

		private static final ExecutorFragment _Protocol__OclAny = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Protocol__OclElement = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Protocol__OclEnumeration = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Protocol__OclType = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Protocol__Protocol = new ExecutorFragment(Types._Protocol, PasysTables.Types._Protocol);

		private static final ExecutorFragment _Rack__NamedElement = new ExecutorFragment(Types._Rack, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Rack__OclAny = new ExecutorFragment(Types._Rack, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Rack__OclElement = new ExecutorFragment(Types._Rack, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Rack__Rack = new ExecutorFragment(Types._Rack, PasysTables.Types._Rack);

		private static final ExecutorFragment _SchedulableSet__NamedElement = new ExecutorFragment(Types._SchedulableSet, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SchedulableSet__OclAny = new ExecutorFragment(Types._SchedulableSet, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SchedulableSet__OclElement = new ExecutorFragment(Types._SchedulableSet, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SchedulableSet__SchedulableSet = new ExecutorFragment(Types._SchedulableSet, PasysTables.Types._SchedulableSet);
		private static final ExecutorFragment _SchedulableSet__SystemElement = new ExecutorFragment(Types._SchedulableSet, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _SchedulingService__DeployableComponent = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _SchedulingService__NamedElement = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SchedulingService__OclAny = new ExecutorFragment(Types._SchedulingService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SchedulingService__OclElement = new ExecutorFragment(Types._SchedulingService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SchedulingService__PlatformResource = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _SchedulingService__PlatformService = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _SchedulingService__SchedulingService = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._SchedulingService);
		private static final ExecutorFragment _SchedulingService__SystemElement = new ExecutorFragment(Types._SchedulingService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _SecurityService__DeployableComponent = new ExecutorFragment(Types._SecurityService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _SecurityService__NamedElement = new ExecutorFragment(Types._SecurityService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SecurityService__OclAny = new ExecutorFragment(Types._SecurityService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SecurityService__OclElement = new ExecutorFragment(Types._SecurityService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SecurityService__PlatformResource = new ExecutorFragment(Types._SecurityService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _SecurityService__PlatformService = new ExecutorFragment(Types._SecurityService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _SecurityService__SecurityService = new ExecutorFragment(Types._SecurityService, PasysTables.Types._SecurityService);
		private static final ExecutorFragment _SecurityService__SystemElement = new ExecutorFragment(Types._SecurityService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _SerializationService__DeployableComponent = new ExecutorFragment(Types._SerializationService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _SerializationService__NamedElement = new ExecutorFragment(Types._SerializationService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SerializationService__OclAny = new ExecutorFragment(Types._SerializationService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SerializationService__OclElement = new ExecutorFragment(Types._SerializationService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SerializationService__PlatformResource = new ExecutorFragment(Types._SerializationService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _SerializationService__PlatformService = new ExecutorFragment(Types._SerializationService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _SerializationService__SerializationService = new ExecutorFragment(Types._SerializationService, PasysTables.Types._SerializationService);
		private static final ExecutorFragment _SerializationService__SystemElement = new ExecutorFragment(Types._SerializationService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _SparkService__DeployableComponent = new ExecutorFragment(Types._SparkService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _SparkService__NamedElement = new ExecutorFragment(Types._SparkService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SparkService__OclAny = new ExecutorFragment(Types._SparkService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SparkService__OclElement = new ExecutorFragment(Types._SparkService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SparkService__PlatformResource = new ExecutorFragment(Types._SparkService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _SparkService__PlatformService = new ExecutorFragment(Types._SparkService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _SparkService__SchedulingService = new ExecutorFragment(Types._SparkService, PasysTables.Types._SchedulingService);
		private static final ExecutorFragment _SparkService__SparkService = new ExecutorFragment(Types._SparkService, PasysTables.Types._SparkService);
		private static final ExecutorFragment _SparkService__SystemElement = new ExecutorFragment(Types._SparkService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _StormNimbus__DeployableComponent = new ExecutorFragment(Types._StormNimbus, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StormNimbus__NamedElement = new ExecutorFragment(Types._StormNimbus, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StormNimbus__OclAny = new ExecutorFragment(Types._StormNimbus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StormNimbus__OclElement = new ExecutorFragment(Types._StormNimbus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StormNimbus__StormNimbus = new ExecutorFragment(Types._StormNimbus, PasysTables.Types._StormNimbus);

		private static final ExecutorFragment _StormService__DeployableComponent = new ExecutorFragment(Types._StormService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StormService__NamedElement = new ExecutorFragment(Types._StormService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StormService__OclAny = new ExecutorFragment(Types._StormService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StormService__OclElement = new ExecutorFragment(Types._StormService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StormService__PlatformResource = new ExecutorFragment(Types._StormService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _StormService__PlatformService = new ExecutorFragment(Types._StormService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _StormService__SchedulingService = new ExecutorFragment(Types._StormService, PasysTables.Types._SchedulingService);
		private static final ExecutorFragment _StormService__StormService = new ExecutorFragment(Types._StormService, PasysTables.Types._StormService);
		private static final ExecutorFragment _StormService__SystemElement = new ExecutorFragment(Types._StormService, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _StormSupervisor__DeployableComponent = new ExecutorFragment(Types._StormSupervisor, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StormSupervisor__NamedElement = new ExecutorFragment(Types._StormSupervisor, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StormSupervisor__OclAny = new ExecutorFragment(Types._StormSupervisor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StormSupervisor__OclElement = new ExecutorFragment(Types._StormSupervisor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StormSupervisor__StormSupervisor = new ExecutorFragment(Types._StormSupervisor, PasysTables.Types._StormSupervisor);

		private static final ExecutorFragment _StormUI__DeployableComponent = new ExecutorFragment(Types._StormUI, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StormUI__NamedElement = new ExecutorFragment(Types._StormUI, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StormUI__OclAny = new ExecutorFragment(Types._StormUI, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StormUI__OclElement = new ExecutorFragment(Types._StormUI, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StormUI__StormUI = new ExecutorFragment(Types._StormUI, PasysTables.Types._StormUI);

		private static final ExecutorFragment _StreamData__DeployableComponent = new ExecutorFragment(Types._StreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StreamData__OclAny = new ExecutorFragment(Types._StreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StreamData__OclElement = new ExecutorFragment(Types._StreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StreamData__StreamData = new ExecutorFragment(Types._StreamData, PasysTables.Types._StreamData);

		private static final ExecutorFragment _StreamDataPartition__OclAny = new ExecutorFragment(Types._StreamDataPartition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StreamDataPartition__OclElement = new ExecutorFragment(Types._StreamDataPartition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StreamDataPartition__StreamDataPartition = new ExecutorFragment(Types._StreamDataPartition, PasysTables.Types._StreamDataPartition);

		private static final ExecutorFragment _StreamDataRate__Metric = new ExecutorFragment(Types._StreamDataRate, PasysTables.Types._Metric);
		private static final ExecutorFragment _StreamDataRate__NamedElement = new ExecutorFragment(Types._StreamDataRate, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StreamDataRate__OclAny = new ExecutorFragment(Types._StreamDataRate, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StreamDataRate__OclElement = new ExecutorFragment(Types._StreamDataRate, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StreamDataRate__StreamDataRate = new ExecutorFragment(Types._StreamDataRate, PasysTables.Types._StreamDataRate);
		private static final ExecutorFragment _StreamDataRate__SystemElement = new ExecutorFragment(Types._StreamDataRate, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _StreamRateMeter__DeployableComponent = new ExecutorFragment(Types._StreamRateMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _StreamRateMeter__Meter = new ExecutorFragment(Types._StreamRateMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _StreamRateMeter__NamedElement = new ExecutorFragment(Types._StreamRateMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _StreamRateMeter__OclAny = new ExecutorFragment(Types._StreamRateMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StreamRateMeter__OclElement = new ExecutorFragment(Types._StreamRateMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StreamRateMeter__PrometheusMeter = new ExecutorFragment(Types._StreamRateMeter, PasysTables.Types._PrometheusMeter);
		private static final ExecutorFragment _StreamRateMeter__StreamRateMeter = new ExecutorFragment(Types._StreamRateMeter, PasysTables.Types._StreamRateMeter);

		private static final ExecutorFragment _StringToStringMap__OclAny = new ExecutorFragment(Types._StringToStringMap, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringToStringMap__OclElement = new ExecutorFragment(Types._StringToStringMap, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringToStringMap__StringToStringMap = new ExecutorFragment(Types._StringToStringMap, PasysTables.Types._StringToStringMap);

		private static final ExecutorFragment _SwarmCluster__NamedElement = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SwarmCluster__OclAny = new ExecutorFragment(Types._SwarmCluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SwarmCluster__OclElement = new ExecutorFragment(Types._SwarmCluster, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SwarmCluster__OrchestrationCluster = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._OrchestrationCluster);
		private static final ExecutorFragment _SwarmCluster__PlatformResource = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _SwarmCluster__ProcessingResourceCluster = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._ProcessingResourceCluster);
		private static final ExecutorFragment _SwarmCluster__SwarmCluster = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._SwarmCluster);
		private static final ExecutorFragment _SwarmCluster__SystemElement = new ExecutorFragment(Types._SwarmCluster, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _SwarmPort__OclAny = new ExecutorFragment(Types._SwarmPort, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SwarmPort__OclElement = new ExecutorFragment(Types._SwarmPort, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SwarmPort__Port = new ExecutorFragment(Types._SwarmPort, PasysTables.Types._Port);
		private static final ExecutorFragment _SwarmPort__SwarmPort = new ExecutorFragment(Types._SwarmPort, PasysTables.Types._SwarmPort);

		private static final ExecutorFragment _SystemElement__NamedElement = new ExecutorFragment(Types._SystemElement, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _SystemElement__OclAny = new ExecutorFragment(Types._SystemElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SystemElement__OclElement = new ExecutorFragment(Types._SystemElement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SystemElement__SystemElement = new ExecutorFragment(Types._SystemElement, PasysTables.Types._SystemElement);

		private static final ExecutorFragment _Task__NamedElement = new ExecutorFragment(Types._Task, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Task__OclAny = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Task__OclElement = new ExecutorFragment(Types._Task, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Task__Task = new ExecutorFragment(Types._Task, PasysTables.Types._Task);

		private static final ExecutorFragment _TaskExecutor__DeployableComponent = new ExecutorFragment(Types._TaskExecutor, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _TaskExecutor__NamedElement = new ExecutorFragment(Types._TaskExecutor, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _TaskExecutor__OclAny = new ExecutorFragment(Types._TaskExecutor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TaskExecutor__OclElement = new ExecutorFragment(Types._TaskExecutor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TaskExecutor__TaskExecutor = new ExecutorFragment(Types._TaskExecutor, PasysTables.Types._TaskExecutor);

		private static final ExecutorFragment _TaskProcessingAmount__Metric = new ExecutorFragment(Types._TaskProcessingAmount, PasysTables.Types._Metric);
		private static final ExecutorFragment _TaskProcessingAmount__NamedElement = new ExecutorFragment(Types._TaskProcessingAmount, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _TaskProcessingAmount__OclAny = new ExecutorFragment(Types._TaskProcessingAmount, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TaskProcessingAmount__OclElement = new ExecutorFragment(Types._TaskProcessingAmount, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TaskProcessingAmount__SystemElement = new ExecutorFragment(Types._TaskProcessingAmount, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _TaskProcessingAmount__TaskProcessingAmount = new ExecutorFragment(Types._TaskProcessingAmount, PasysTables.Types._TaskProcessingAmount);

		private static final ExecutorFragment _TaskProcessingAmountMeter__DeployableComponent = new ExecutorFragment(Types._TaskProcessingAmountMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _TaskProcessingAmountMeter__Meter = new ExecutorFragment(Types._TaskProcessingAmountMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _TaskProcessingAmountMeter__NamedElement = new ExecutorFragment(Types._TaskProcessingAmountMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _TaskProcessingAmountMeter__OclAny = new ExecutorFragment(Types._TaskProcessingAmountMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TaskProcessingAmountMeter__OclElement = new ExecutorFragment(Types._TaskProcessingAmountMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TaskProcessingAmountMeter__PrometheusMeter = new ExecutorFragment(Types._TaskProcessingAmountMeter, PasysTables.Types._PrometheusMeter);
		private static final ExecutorFragment _TaskProcessingAmountMeter__TaskProcessingAmountMeter = new ExecutorFragment(Types._TaskProcessingAmountMeter, PasysTables.Types._TaskProcessingAmountMeter);

		private static final ExecutorFragment _VirtualProcessingNode__NamedElement = new ExecutorFragment(Types._VirtualProcessingNode, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _VirtualProcessingNode__OclAny = new ExecutorFragment(Types._VirtualProcessingNode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VirtualProcessingNode__OclElement = new ExecutorFragment(Types._VirtualProcessingNode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VirtualProcessingNode__PlatformResource = new ExecutorFragment(Types._VirtualProcessingNode, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _VirtualProcessingNode__ProcessingNode = new ExecutorFragment(Types._VirtualProcessingNode, PasysTables.Types._ProcessingNode);
		private static final ExecutorFragment _VirtualProcessingNode__SystemElement = new ExecutorFragment(Types._VirtualProcessingNode, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _VirtualProcessingNode__VirtualProcessingNode = new ExecutorFragment(Types._VirtualProcessingNode, PasysTables.Types._VirtualProcessingNode);

		private static final ExecutorFragment _Volume__OclAny = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Volume__OclElement = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Volume__Volume = new ExecutorFragment(Types._Volume, PasysTables.Types._Volume);

		private static final ExecutorFragment _VolumeAccessMode__OclAny = new ExecutorFragment(Types._VolumeAccessMode, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VolumeAccessMode__OclElement = new ExecutorFragment(Types._VolumeAccessMode, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VolumeAccessMode__OclEnumeration = new ExecutorFragment(Types._VolumeAccessMode, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VolumeAccessMode__OclType = new ExecutorFragment(Types._VolumeAccessMode, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VolumeAccessMode__VolumeAccessMode = new ExecutorFragment(Types._VolumeAccessMode, PasysTables.Types._VolumeAccessMode);

		private static final ExecutorFragment _VolumeType__OclAny = new ExecutorFragment(Types._VolumeType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VolumeType__OclElement = new ExecutorFragment(Types._VolumeType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VolumeType__OclEnumeration = new ExecutorFragment(Types._VolumeType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _VolumeType__OclType = new ExecutorFragment(Types._VolumeType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _VolumeType__VolumeType = new ExecutorFragment(Types._VolumeType, PasysTables.Types._VolumeType);

		private static final ExecutorFragment _Workflow__DeployableComponent = new ExecutorFragment(Types._Workflow, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _Workflow__NamedElement = new ExecutorFragment(Types._Workflow, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _Workflow__OclAny = new ExecutorFragment(Types._Workflow, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Workflow__OclElement = new ExecutorFragment(Types._Workflow, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Workflow__SystemElement = new ExecutorFragment(Types._Workflow, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _Workflow__Workflow = new ExecutorFragment(Types._Workflow, PasysTables.Types._Workflow);

		private static final ExecutorFragment _WorkflowLatency__Metric = new ExecutorFragment(Types._WorkflowLatency, PasysTables.Types._Metric);
		private static final ExecutorFragment _WorkflowLatency__NamedElement = new ExecutorFragment(Types._WorkflowLatency, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _WorkflowLatency__OclAny = new ExecutorFragment(Types._WorkflowLatency, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkflowLatency__OclElement = new ExecutorFragment(Types._WorkflowLatency, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkflowLatency__SystemElement = new ExecutorFragment(Types._WorkflowLatency, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _WorkflowLatency__WorkflowLatency = new ExecutorFragment(Types._WorkflowLatency, PasysTables.Types._WorkflowLatency);

		private static final ExecutorFragment _WorkflowLatencyMeter__DeployableComponent = new ExecutorFragment(Types._WorkflowLatencyMeter, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _WorkflowLatencyMeter__Meter = new ExecutorFragment(Types._WorkflowLatencyMeter, PasysTables.Types._Meter);
		private static final ExecutorFragment _WorkflowLatencyMeter__NamedElement = new ExecutorFragment(Types._WorkflowLatencyMeter, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _WorkflowLatencyMeter__OclAny = new ExecutorFragment(Types._WorkflowLatencyMeter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkflowLatencyMeter__OclElement = new ExecutorFragment(Types._WorkflowLatencyMeter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkflowLatencyMeter__PrometheusMeter = new ExecutorFragment(Types._WorkflowLatencyMeter, PasysTables.Types._PrometheusMeter);
		private static final ExecutorFragment _WorkflowLatencyMeter__WorkflowLatencyMeter = new ExecutorFragment(Types._WorkflowLatencyMeter, PasysTables.Types._WorkflowLatencyMeter);

		private static final ExecutorFragment _WorkflowStreamData__DeployableComponent = new ExecutorFragment(Types._WorkflowStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _WorkflowStreamData__NamedElement = new ExecutorFragment(Types._WorkflowStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _WorkflowStreamData__OclAny = new ExecutorFragment(Types._WorkflowStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkflowStreamData__OclElement = new ExecutorFragment(Types._WorkflowStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkflowStreamData__StreamData = new ExecutorFragment(Types._WorkflowStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _WorkflowStreamData__WorkflowStreamData = new ExecutorFragment(Types._WorkflowStreamData, PasysTables.Types._WorkflowStreamData);

		private static final ExecutorFragment _WorkloadStreamData__DeployableComponent = new ExecutorFragment(Types._WorkloadStreamData, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _WorkloadStreamData__NamedElement = new ExecutorFragment(Types._WorkloadStreamData, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _WorkloadStreamData__OclAny = new ExecutorFragment(Types._WorkloadStreamData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkloadStreamData__OclElement = new ExecutorFragment(Types._WorkloadStreamData, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkloadStreamData__StreamData = new ExecutorFragment(Types._WorkloadStreamData, PasysTables.Types._StreamData);
		private static final ExecutorFragment _WorkloadStreamData__SystemElement = new ExecutorFragment(Types._WorkloadStreamData, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _WorkloadStreamData__WorkloadStreamData = new ExecutorFragment(Types._WorkloadStreamData, PasysTables.Types._WorkloadStreamData);

		private static final ExecutorFragment _ZookeeperService__DeployableComponent = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._DeployableComponent);
		private static final ExecutorFragment _ZookeeperService__DistributionService = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._DistributionService);
		private static final ExecutorFragment _ZookeeperService__NamedElement = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._NamedElement);
		private static final ExecutorFragment _ZookeeperService__OclAny = new ExecutorFragment(Types._ZookeeperService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ZookeeperService__OclElement = new ExecutorFragment(Types._ZookeeperService, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ZookeeperService__PlatformResource = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._PlatformResource);
		private static final ExecutorFragment _ZookeeperService__PlatformService = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._PlatformService);
		private static final ExecutorFragment _ZookeeperService__SystemElement = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._SystemElement);
		private static final ExecutorFragment _ZookeeperService__ZookeeperService = new ExecutorFragment(Types._ZookeeperService, PasysTables.Types._ZookeeperService);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _DeploymentFileDescriptor = TypeUtil.createParameterTypes(PasysTables.Types._DeploymentFileDescriptor);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _ComputationalSystem__cleanDeployment = new ExecutorOperation("cleanDeployment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ComputationalSystem,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ComputationalSystem__deployAndLaunch = new ExecutorOperation("deployAndLaunch", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ComputationalSystem,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _DeployableComponent__configureDeployment = new ExecutorOperation("configureDeployment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._DeployableComponent,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _ProcessingNode__abortLaunching = new ExecutorOperation("abortLaunching", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ProcessingNode,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__addConfigFile = new ExecutorOperation("addConfigFile", Parameters._DeploymentFileDescriptor, Types._ProcessingNode,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__addLaunchingScript = new ExecutorOperation("addLaunchingScript", Parameters._DeploymentFileDescriptor, Types._ProcessingNode,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__bringBackConfiguration = new ExecutorOperation("bringBackConfiguration", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ProcessingNode,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__bringBackDeployment = new ExecutorOperation("bringBackDeployment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ProcessingNode,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__deployAndLaunch = new ExecutorOperation("deployAndLaunch", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ProcessingNode,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _ProcessingNode__prepareForDeployment = new ExecutorOperation("prepareForDeployment", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ProcessingNode,
			6, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _PrometheusMeter__getPrometheusServerConfiguration = new ExecutorOperation("getPrometheusServerConfiguration", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PrometheusMeter,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _AWSVirtualProcessingNode__AMI = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__AMI, Types._AWSVirtualProcessingNode, 0);
		public static final ExecutorProperty _AWSVirtualProcessingNode__instanceType = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE, Types._AWSVirtualProcessingNode, 1);
		public static final ExecutorProperty _AWSVirtualProcessingNode__keyPair = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR, Types._AWSVirtualProcessingNode, 2);
		public static final ExecutorProperty _AWSVirtualProcessingNode__securityGroup = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP, Types._AWSVirtualProcessingNode, 3);
		public static final ExecutorProperty _AWSVirtualProcessingNode__subNet = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET, Types._AWSVirtualProcessingNode, 4);
		public static final ExecutorProperty _AWSVirtualProcessingNode__vpc = new EcoreExecutorProperty(PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__VPC, Types._AWSVirtualProcessingNode, 5);

		public static final ExecutorProperty _ArtifactDescriptor__localPath = new EcoreExecutorProperty(PasysPackage.Literals.ARTIFACT_DESCRIPTOR__LOCAL_PATH, Types._ArtifactDescriptor, 0);
		public static final ExecutorProperty _ArtifactDescriptor__ProcessingNode__codeFiles = new ExecutorPropertyWithImplementation("ProcessingNode", Types._ArtifactDescriptor, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE__CODE_FILES));

		public static final ExecutorProperty _CassandraService__autoBootstrap = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__AUTO_BOOTSTRAP, Types._CassandraService, 0);
		public static final ExecutorProperty _CassandraService__cqlSchemas = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS, Types._CassandraService, 1);
		public static final ExecutorProperty _CassandraService__dataCenters = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__DATA_CENTERS, Types._CassandraService, 2);
		public static final ExecutorProperty _CassandraService__dataFileDir = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__DATA_FILE_DIR, Types._CassandraService, 3);
		public static final ExecutorProperty _CassandraService__endpointSnitch = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__ENDPOINT_SNITCH, Types._CassandraService, 4);
		public static final ExecutorProperty _CassandraService__numTokens = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__NUM_TOKENS, Types._CassandraService, 5);
		public static final ExecutorProperty _CassandraService__rpcPort = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__RPC_PORT, Types._CassandraService, 6);
		public static final ExecutorProperty _CassandraService__seedProviderClass = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS, Types._CassandraService, 7);
		public static final ExecutorProperty _CassandraService__seeds = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__SEEDS, Types._CassandraService, 8);
		public static final ExecutorProperty _CassandraService__sslStoragePort = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__SSL_STORAGE_PORT, Types._CassandraService, 9);
		public static final ExecutorProperty _CassandraService__storagePort = new EcoreExecutorProperty(PasysPackage.Literals.CASSANDRA_SERVICE__STORAGE_PORT, Types._CassandraService, 10);

		public static final ExecutorProperty _CommunicationMeter__metric = new EcoreExecutorProperty(PasysPackage.Literals.COMMUNICATION_METER__METRIC, Types._CommunicationMeter, 0);

		public static final ExecutorProperty _CommunicationService__FlowStreamData__holder = new ExecutorPropertyWithImplementation("FlowStreamData", Types._CommunicationService, 0, new EcoreLibraryOppositeProperty(PasysPackage.Literals.FLOW_STREAM_DATA__HOLDER));
		public static final ExecutorProperty _CommunicationService__WorkloadStreamData__holder = new ExecutorPropertyWithImplementation("WorkloadStreamData", Types._CommunicationService, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.WORKLOAD_STREAM_DATA__HOLDER));

		public static final ExecutorProperty _ComputationalSystem__authenticationFiles = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES, Types._ComputationalSystem, 0);
		public static final ExecutorProperty _ComputationalSystem__authors = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__AUTHORS, Types._ComputationalSystem, 1);
		public static final ExecutorProperty _ComputationalSystem__date = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__DATE, Types._ComputationalSystem, 2);
		public static final ExecutorProperty _ComputationalSystem__doc = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__DOC, Types._ComputationalSystem, 3);
		public static final ExecutorProperty _ComputationalSystem__name = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__NAME, Types._ComputationalSystem, 4);
		public static final ExecutorProperty _ComputationalSystem__ownedElements = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS, Types._ComputationalSystem, 5);
		public static final ExecutorProperty _ComputationalSystem__targetPlatformName = new EcoreExecutorProperty(PasysPackage.Literals.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME, Types._ComputationalSystem, 6);

		public static final ExecutorProperty _DataCenter__racks = new EcoreExecutorProperty(PasysPackage.Literals.DATA_CENTER__RACKS, Types._DataCenter, 0);
		public static final ExecutorProperty _DataCenter__CassandraService__dataCenters = new ExecutorPropertyWithImplementation("CassandraService", Types._DataCenter, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.CASSANDRA_SERVICE__DATA_CENTERS));

		public static final ExecutorProperty _DeployableComponent__deploymentConfig = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG, Types._DeployableComponent, 0);

		public static final ExecutorProperty _DeploymentConfiguration__DeployableComponent__deploymentConfig = new ExecutorPropertyWithImplementation("DeployableComponent", Types._DeploymentConfiguration, 0, new EcoreLibraryOppositeProperty(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG));

		public static final ExecutorProperty _DeploymentConstraints__labels = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYMENT_CONSTRAINTS__LABELS, Types._DeploymentConstraints, 0);
		public static final ExecutorProperty _DeploymentConstraints__resources = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYMENT_CONSTRAINTS__RESOURCES, Types._DeploymentConstraints, 1);
		public static final ExecutorProperty _DeploymentConstraints__OrchestratorDeploymentConf__constraints = new ExecutorPropertyWithImplementation("OrchestratorDeploymentConf", Types._DeploymentConstraints, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS));

		public static final ExecutorProperty _DeploymentFileDescriptor__elementType = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE, Types._DeploymentFileDescriptor, 0);
		public static final ExecutorProperty _DeploymentFileDescriptor__fileContent = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT, Types._DeploymentFileDescriptor, 1);
		public static final ExecutorProperty _DeploymentFileDescriptor__owner = new EcoreExecutorProperty(PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR__OWNER, Types._DeploymentFileDescriptor, 2);
		public static final ExecutorProperty _DeploymentFileDescriptor__ProcessingNode__configFiles = new ExecutorPropertyWithImplementation("ProcessingNode", Types._DeploymentFileDescriptor, 3, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE__CONFIG_FILES));
		public static final ExecutorProperty _DeploymentFileDescriptor__ProcessingNode__launchingScripts = new ExecutorPropertyWithImplementation("ProcessingNode", Types._DeploymentFileDescriptor, 4, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE__LAUNCHING_SCRIPTS));

		public static final ExecutorProperty _DerivedStreamData__inputs = new EcoreExecutorProperty(PasysPackage.Literals.DERIVED_STREAM_DATA__INPUTS, Types._DerivedStreamData, 0);
		public static final ExecutorProperty _DerivedStreamData__pattern = new EcoreExecutorProperty(PasysPackage.Literals.DERIVED_STREAM_DATA__PATTERN, Types._DerivedStreamData, 1);

		public static final ExecutorProperty _ExporterData__artifact = new EcoreExecutorProperty(PasysPackage.Literals.EXPORTER_DATA__ARTIFACT, Types._ExporterData, 0);
		public static final ExecutorProperty _ExporterData__name = new EcoreExecutorProperty(PasysPackage.Literals.EXPORTER_DATA__NAME, Types._ExporterData, 1);
		public static final ExecutorProperty _ExporterData__PrometheusService__exportersData = new ExecutorPropertyWithImplementation("PrometheusService", Types._ExporterData, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROMETHEUS_SERVICE__EXPORTERS_DATA));

		public static final ExecutorProperty _FileDescriptor__fileName = new EcoreExecutorProperty(PasysPackage.Literals.FILE_DESCRIPTOR__FILE_NAME, Types._FileDescriptor, 0);
		public static final ExecutorProperty _FileDescriptor__filePath = new EcoreExecutorProperty(PasysPackage.Literals.FILE_DESCRIPTOR__FILE_PATH, Types._FileDescriptor, 1);
		public static final ExecutorProperty _FileDescriptor__CassandraService__cqlSchemas = new ExecutorPropertyWithImplementation("CassandraService", Types._FileDescriptor, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS));

		public static final ExecutorProperty _FlowStreamData__holder = new EcoreExecutorProperty(PasysPackage.Literals.FLOW_STREAM_DATA__HOLDER, Types._FlowStreamData, 0);
		public static final ExecutorProperty _FlowStreamData__isImplemented = new EcoreExecutorProperty(PasysPackage.Literals.FLOW_STREAM_DATA__IS_IMPLEMENTED, Types._FlowStreamData, 1);
		public static final ExecutorProperty _FlowStreamData__predecessor = new EcoreExecutorProperty(PasysPackage.Literals.FLOW_STREAM_DATA__PREDECESSOR, Types._FlowStreamData, 2);
		public static final ExecutorProperty _FlowStreamData__source = new EcoreExecutorProperty(PasysPackage.Literals.FLOW_STREAM_DATA__SOURCE, Types._FlowStreamData, 3);

		public static final ExecutorProperty _KafkaService__advertisedListeners = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__ADVERTISED_LISTENERS, Types._KafkaService, 0);
		public static final ExecutorProperty _KafkaService__autoCreateTopicEnable = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE, Types._KafkaService, 1);
		public static final ExecutorProperty _KafkaService__clientPort = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__CLIENT_PORT, Types._KafkaService, 2);
		public static final ExecutorProperty _KafkaService__commId = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__COMM_ID, Types._KafkaService, 3);
		public static final ExecutorProperty _KafkaService__deleteTopicEnable = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__DELETE_TOPIC_ENABLE, Types._KafkaService, 4);
		public static final ExecutorProperty _KafkaService__listeners = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__LISTENERS, Types._KafkaService, 5);
		public static final ExecutorProperty _KafkaService__logFlushInterval = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__LOG_FLUSH_INTERVAL, Types._KafkaService, 6);
		public static final ExecutorProperty _KafkaService__logFlushIntervalMessages = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES, Types._KafkaService, 7);
		public static final ExecutorProperty _KafkaService__numIOThreads = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__NUM_IO_THREADS, Types._KafkaService, 8);
		public static final ExecutorProperty _KafkaService__numNetworkThreads = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__NUM_NETWORK_THREADS, Types._KafkaService, 9);
		public static final ExecutorProperty _KafkaService__numPartitions = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__NUM_PARTITIONS, Types._KafkaService, 10);
		public static final ExecutorProperty _KafkaService__numRecoveryThreadsPerDataDir = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR, Types._KafkaService, 11);
		public static final ExecutorProperty _KafkaService__socketReceiveBufferBytes = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES, Types._KafkaService, 12);
		public static final ExecutorProperty _KafkaService__socketRequestMaxBytes = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES, Types._KafkaService, 13);
		public static final ExecutorProperty _KafkaService__socketSendBufferBytes = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES, Types._KafkaService, 14);
		public static final ExecutorProperty _KafkaService__zookeeperConnect = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__ZOOKEEPER_CONNECT, Types._KafkaService, 15);
		public static final ExecutorProperty _KafkaService__zookeeperConnectionTimeout = new EcoreExecutorProperty(PasysPackage.Literals.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT, Types._KafkaService, 16);

		public static final ExecutorProperty _KubernetesCluster__apiVersion = new EcoreExecutorProperty(PasysPackage.Literals.KUBERNETES_CLUSTER__API_VERSION, Types._KubernetesCluster, 0);

		public static final ExecutorProperty _KubernetesPort__internal = new EcoreExecutorProperty(PasysPackage.Literals.KUBERNETES_PORT__INTERNAL, Types._KubernetesPort, 0);
		public static final ExecutorProperty _KubernetesPort__name = new EcoreExecutorProperty(PasysPackage.Literals.KUBERNETES_PORT__NAME, Types._KubernetesPort, 1);

		public static final ExecutorProperty _Meter__monitoringServer = new EcoreExecutorProperty(PasysPackage.Literals.METER__MONITORING_SERVER, Types._Meter, 0);

		public static final ExecutorProperty _MonitoringService__monitorizedMeters = new EcoreExecutorProperty(PasysPackage.Literals.MONITORING_SERVICE__MONITORIZED_METERS, Types._MonitoringService, 0);

		public static final ExecutorProperty _NamedElement__id = new EcoreExecutorProperty(PasysPackage.Literals.NAMED_ELEMENT__ID, Types._NamedElement, 0);
		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(PasysPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 1);

		public static final ExecutorProperty _Network__bandwith = new EcoreExecutorProperty(PasysPackage.Literals.NETWORK__BANDWITH, Types._Network, 0);
		public static final ExecutorProperty _Network__NetworkUtilization__target = new ExecutorPropertyWithImplementation("NetworkUtilization", Types._Network, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.NETWORK_UTILIZATION__TARGET));
		public static final ExecutorProperty _Network__ProcessingNode__connectedTo = new ExecutorPropertyWithImplementation("ProcessingNode", Types._Network, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE__CONNECTED_TO));

		public static final ExecutorProperty _NetworkUtilization__meter = new EcoreExecutorProperty(PasysPackage.Literals.NETWORK_UTILIZATION__METER, Types._NetworkUtilization, 0);
		public static final ExecutorProperty _NetworkUtilization__target = new EcoreExecutorProperty(PasysPackage.Literals.NETWORK_UTILIZATION__TARGET, Types._NetworkUtilization, 1);

		public static final ExecutorProperty _NodeDeploymentConf__arguments = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARGUMENTS, Types._NodeDeploymentConf, 0);
		public static final ExecutorProperty _NodeDeploymentConf__artifactLocator = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR, Types._NodeDeploymentConf, 1);
		public static final ExecutorProperty _NodeDeploymentConf__artifactName = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARTIFACT_NAME, Types._NodeDeploymentConf, 2);
		public static final ExecutorProperty _NodeDeploymentConf__codeFolderPath = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH, Types._NodeDeploymentConf, 3);
		public static final ExecutorProperty _NodeDeploymentConf__configFolderPath = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH, Types._NodeDeploymentConf, 4);
		public static final ExecutorProperty _NodeDeploymentConf__dataFolderPath = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH, Types._NodeDeploymentConf, 5);
		public static final ExecutorProperty _NodeDeploymentConf__isRunning = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__IS_RUNNING, Types._NodeDeploymentConf, 6);
		public static final ExecutorProperty _NodeDeploymentConf__logFolderPath = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH, Types._NodeDeploymentConf, 7);
		public static final ExecutorProperty _NodeDeploymentConf__scriptFolderPath = new EcoreExecutorProperty(PasysPackage.Literals.NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH, Types._NodeDeploymentConf, 8);

		public static final ExecutorProperty _NodeHostedMeter__owner = new EcoreExecutorProperty(PasysPackage.Literals.NODE_HOSTED_METER__OWNER, Types._NodeHostedMeter, 0);

		public static final ExecutorProperty _NodeResourceMeter__mMetric = new EcoreExecutorProperty(PasysPackage.Literals.NODE_RESOURCE_METER__MMETRIC, Types._NodeResourceMeter, 0);
		public static final ExecutorProperty _NodeResourceMeter__uMetric = new EcoreExecutorProperty(PasysPackage.Literals.NODE_RESOURCE_METER__UMETRIC, Types._NodeResourceMeter, 1);

		public static final ExecutorProperty _OrchestratorDeploymentConf__args = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__ARGS, Types._OrchestratorDeploymentConf, 0);
		public static final ExecutorProperty _OrchestratorDeploymentConf__command = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND, Types._OrchestratorDeploymentConf, 1);
		public static final ExecutorProperty _OrchestratorDeploymentConf__constraints = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS, Types._OrchestratorDeploymentConf, 2);
		public static final ExecutorProperty _OrchestratorDeploymentConf__env = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__ENV, Types._OrchestratorDeploymentConf, 3);
		public static final ExecutorProperty _OrchestratorDeploymentConf__image = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE, Types._OrchestratorDeploymentConf, 4);
		public static final ExecutorProperty _OrchestratorDeploymentConf__imagePullPolicy = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY, Types._OrchestratorDeploymentConf, 5);
		public static final ExecutorProperty _OrchestratorDeploymentConf__imageTag = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG, Types._OrchestratorDeploymentConf, 6);
		public static final ExecutorProperty _OrchestratorDeploymentConf__ports = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__PORTS, Types._OrchestratorDeploymentConf, 7);
		public static final ExecutorProperty _OrchestratorDeploymentConf__replicas = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS, Types._OrchestratorDeploymentConf, 8);
		public static final ExecutorProperty _OrchestratorDeploymentConf__restartPolicy = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY, Types._OrchestratorDeploymentConf, 9);
		public static final ExecutorProperty _OrchestratorDeploymentConf__volumes = new EcoreExecutorProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES, Types._OrchestratorDeploymentConf, 10);

		public static final ExecutorProperty _PersistenceService__logging = new EcoreExecutorProperty(PasysPackage.Literals.PERSISTENCE_SERVICE__LOGGING, Types._PersistenceService, 0);
		public static final ExecutorProperty _PersistenceService__passwd = new EcoreExecutorProperty(PasysPackage.Literals.PERSISTENCE_SERVICE__PASSWD, Types._PersistenceService, 1);
		public static final ExecutorProperty _PersistenceService__port = new EcoreExecutorProperty(PasysPackage.Literals.PERSISTENCE_SERVICE__PORT, Types._PersistenceService, 2);

		public static final ExecutorProperty _PlatformService__host = new EcoreExecutorProperty(PasysPackage.Literals.PLATFORM_SERVICE__HOST, Types._PlatformService, 0);

		public static final ExecutorProperty _Port__published = new EcoreExecutorProperty(PasysPackage.Literals.PORT__PUBLISHED, Types._Port, 0);
		public static final ExecutorProperty _Port__target = new EcoreExecutorProperty(PasysPackage.Literals.PORT__TARGET, Types._Port, 1);
		public static final ExecutorProperty _Port__OrchestratorDeploymentConf__ports = new ExecutorPropertyWithImplementation("OrchestratorDeploymentConf", Types._Port, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__PORTS));

		public static final ExecutorProperty _ProcessingNode__codeFiles = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__CODE_FILES, Types._ProcessingNode, 0);
		public static final ExecutorProperty _ProcessingNode__concurrencyLevel = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__CONCURRENCY_LEVEL, Types._ProcessingNode, 1);
		public static final ExecutorProperty _ProcessingNode__configData = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__CONFIG_DATA, Types._ProcessingNode, 2);
		public static final ExecutorProperty _ProcessingNode__configFiles = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__CONFIG_FILES, Types._ProcessingNode, 3);
		public static final ExecutorProperty _ProcessingNode__connectedTo = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__CONNECTED_TO, Types._ProcessingNode, 4);
		public static final ExecutorProperty _ProcessingNode__ip = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__IP, Types._ProcessingNode, 5);
		public static final ExecutorProperty _ProcessingNode__launchingScripts = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__LAUNCHING_SCRIPTS, Types._ProcessingNode, 6);
		public static final ExecutorProperty _ProcessingNode__memorySize = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__MEMORY_SIZE, Types._ProcessingNode, 7);
		public static final ExecutorProperty _ProcessingNode__os = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__OS, Types._ProcessingNode, 8);
		public static final ExecutorProperty _ProcessingNode__ownedMeters = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__OWNED_METERS, Types._ProcessingNode, 9);
		public static final ExecutorProperty _ProcessingNode__speedFactor = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__SPEED_FACTOR, Types._ProcessingNode, 10);
		public static final ExecutorProperty _ProcessingNode__userName = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE__USER_NAME, Types._ProcessingNode, 11);
		public static final ExecutorProperty _ProcessingNode__DeploymentFileDescriptor__owner = new ExecutorPropertyWithImplementation("DeploymentFileDescriptor", Types._ProcessingNode, 12, new EcoreLibraryOppositeProperty(PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR__OWNER));
		public static final ExecutorProperty _ProcessingNode__ProcessingNodeCluster__nodes = new ExecutorPropertyWithImplementation("ProcessingNodeCluster", Types._ProcessingNode, 13, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE_CLUSTER__NODES));
		public static final ExecutorProperty _ProcessingNode__ProcessingNodeMemory__target = new ExecutorPropertyWithImplementation("ProcessingNodeMemory", Types._ProcessingNode, 14, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE_MEMORY__TARGET));
		public static final ExecutorProperty _ProcessingNode__ProcessingNodeUtilization__target = new ExecutorPropertyWithImplementation("ProcessingNodeUtilization", Types._ProcessingNode, 15, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PROCESSING_NODE_UTILIZATION__TARGET));
		public static final ExecutorProperty _ProcessingNode__StreamDataPartition__host = new ExecutorPropertyWithImplementation("StreamDataPartition", Types._ProcessingNode, 16, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STREAM_DATA_PARTITION__HOST));

		public static final ExecutorProperty _ProcessingNodeCluster__nodes = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE_CLUSTER__NODES, Types._ProcessingNodeCluster, 0);
		public static final ExecutorProperty _ProcessingNodeCluster__CassandraService__seeds = new ExecutorPropertyWithImplementation("CassandraService", Types._ProcessingNodeCluster, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.CASSANDRA_SERVICE__SEEDS));
		public static final ExecutorProperty _ProcessingNodeCluster__Rack__nodes = new ExecutorPropertyWithImplementation("Rack", Types._ProcessingNodeCluster, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.RACK__NODES));

		public static final ExecutorProperty _ProcessingNodeMemory__meter = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE_MEMORY__METER, Types._ProcessingNodeMemory, 0);
		public static final ExecutorProperty _ProcessingNodeMemory__target = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE_MEMORY__TARGET, Types._ProcessingNodeMemory, 1);

		public static final ExecutorProperty _ProcessingNodeUtilization__meter = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE_UTILIZATION__METER, Types._ProcessingNodeUtilization, 0);
		public static final ExecutorProperty _ProcessingNodeUtilization__target = new EcoreExecutorProperty(PasysPackage.Literals.PROCESSING_NODE_UTILIZATION__TARGET, Types._ProcessingNodeUtilization, 1);

		public static final ExecutorProperty _ProcessingResourceCluster__PlatformService__host = new ExecutorPropertyWithImplementation("PlatformService", Types._ProcessingResourceCluster, 0, new EcoreLibraryOppositeProperty(PasysPackage.Literals.PLATFORM_SERVICE__HOST));
		public static final ExecutorProperty _ProcessingResourceCluster__SparkService__master = new ExecutorPropertyWithImplementation("SparkService", Types._ProcessingResourceCluster, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.SPARK_SERVICE__MASTER));
		public static final ExecutorProperty _ProcessingResourceCluster__StormNimbus__host = new ExecutorPropertyWithImplementation("StormNimbus", Types._ProcessingResourceCluster, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STORM_NIMBUS__HOST));
		public static final ExecutorProperty _ProcessingResourceCluster__StormSupervisor__host = new ExecutorPropertyWithImplementation("StormSupervisor", Types._ProcessingResourceCluster, 3, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STORM_SUPERVISOR__HOST));
		public static final ExecutorProperty _ProcessingResourceCluster__StormUI__host = new ExecutorPropertyWithImplementation("StormUI", Types._ProcessingResourceCluster, 4, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STORM_UI__HOST));

		public static final ExecutorProperty _PrometheusMeter__monitoringPort = new EcoreExecutorProperty(PasysPackage.Literals.PROMETHEUS_METER__MONITORING_PORT, Types._PrometheusMeter, 0);
		public static final ExecutorProperty _PrometheusMeter__monitoringTime = new EcoreExecutorProperty(PasysPackage.Literals.PROMETHEUS_METER__MONITORING_TIME, Types._PrometheusMeter, 1);

		public static final ExecutorProperty _PrometheusService__exportersData = new EcoreExecutorProperty(PasysPackage.Literals.PROMETHEUS_SERVICE__EXPORTERS_DATA, Types._PrometheusService, 0);

		public static final ExecutorProperty _Rack__nodes = new EcoreExecutorProperty(PasysPackage.Literals.RACK__NODES, Types._Rack, 0);
		public static final ExecutorProperty _Rack__DataCenter__racks = new ExecutorPropertyWithImplementation("DataCenter", Types._Rack, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.DATA_CENTER__RACKS));

		public static final ExecutorProperty _SchedulableSet__workflows = new EcoreExecutorProperty(PasysPackage.Literals.SCHEDULABLE_SET__WORKFLOWS, Types._SchedulableSet, 0);
		public static final ExecutorProperty _SchedulableSet__SparkService__load = new ExecutorPropertyWithImplementation("SparkService", Types._SchedulableSet, 1, new EcoreLibraryOppositeProperty(PasysPackage.Literals.SPARK_SERVICE__LOAD));

		public static final ExecutorProperty _SchedulingService__workflows = new EcoreExecutorProperty(PasysPackage.Literals.SCHEDULING_SERVICE__WORKFLOWS, Types._SchedulingService, 0);

		public static final ExecutorProperty _SparkService__driverCores = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__DRIVER_CORES, Types._SparkService, 0);
		public static final ExecutorProperty _SparkService__driverMaxResultSize = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE, Types._SparkService, 1);
		public static final ExecutorProperty _SparkService__driverMemory = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__DRIVER_MEMORY, Types._SparkService, 2);
		public static final ExecutorProperty _SparkService__driverSuperviser = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__DRIVER_SUPERVISER, Types._SparkService, 3);
		public static final ExecutorProperty _SparkService__executorMemory = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__EXECUTOR_MEMORY, Types._SparkService, 4);
		public static final ExecutorProperty _SparkService__extraListener = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__EXTRA_LISTENER, Types._SparkService, 5);
		public static final ExecutorProperty _SparkService__load = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__LOAD, Types._SparkService, 6);
		public static final ExecutorProperty _SparkService__localDir = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__LOCAL_DIR, Types._SparkService, 7);
		public static final ExecutorProperty _SparkService__logCallerContext = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__LOG_CALLER_CONTEXT, Types._SparkService, 8);
		public static final ExecutorProperty _SparkService__logConf = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__LOG_CONF, Types._SparkService, 9);
		public static final ExecutorProperty _SparkService__master = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__MASTER, Types._SparkService, 10);
		public static final ExecutorProperty _SparkService__submitDeployMode = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__SUBMIT_DEPLOY_MODE, Types._SparkService, 11);
		public static final ExecutorProperty _SparkService__windowSize = new EcoreExecutorProperty(PasysPackage.Literals.SPARK_SERVICE__WINDOW_SIZE, Types._SparkService, 12);

		public static final ExecutorProperty _StormNimbus__host = new EcoreExecutorProperty(PasysPackage.Literals.STORM_NIMBUS__HOST, Types._StormNimbus, 0);
		public static final ExecutorProperty _StormNimbus__owner = new EcoreExecutorProperty(PasysPackage.Literals.STORM_NIMBUS__OWNER, Types._StormNimbus, 1);

		public static final ExecutorProperty _StormService__localDir = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SERVICE__LOCAL_DIR, Types._StormService, 0);
		public static final ExecutorProperty _StormService__nimbus = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SERVICE__NIMBUS, Types._StormService, 1);
		public static final ExecutorProperty _StormService__supervisor = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SERVICE__SUPERVISOR, Types._StormService, 2);
		public static final ExecutorProperty _StormService__ui = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SERVICE__UI, Types._StormService, 3);
		public static final ExecutorProperty _StormService__zookeeperConnect = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SERVICE__ZOOKEEPER_CONNECT, Types._StormService, 4);

		public static final ExecutorProperty _StormSupervisor__host = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SUPERVISOR__HOST, Types._StormSupervisor, 0);
		public static final ExecutorProperty _StormSupervisor__owner = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SUPERVISOR__OWNER, Types._StormSupervisor, 1);
		public static final ExecutorProperty _StormSupervisor__supervisorSlotPorts = new EcoreExecutorProperty(PasysPackage.Literals.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS, Types._StormSupervisor, 2);

		public static final ExecutorProperty _StormUI__host = new EcoreExecutorProperty(PasysPackage.Literals.STORM_UI__HOST, Types._StormUI, 0);
		public static final ExecutorProperty _StormUI__owner = new EcoreExecutorProperty(PasysPackage.Literals.STORM_UI__OWNER, Types._StormUI, 1);
		public static final ExecutorProperty _StormUI__uiPort = new EcoreExecutorProperty(PasysPackage.Literals.STORM_UI__UI_PORT, Types._StormUI, 2);

		public static final ExecutorProperty _StreamData__assignedPartition = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__ASSIGNED_PARTITION, Types._StreamData, 0);
		public static final ExecutorProperty _StreamData__cleanupPolicy = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__CLEANUP_POLICY, Types._StreamData, 1);
		public static final ExecutorProperty _StreamData__messageSize = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__MESSAGE_SIZE, Types._StreamData, 2);
		public static final ExecutorProperty _StreamData__numPartitions = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__NUM_PARTITIONS, Types._StreamData, 3);
		public static final ExecutorProperty _StreamData__numReplication = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__NUM_REPLICATION, Types._StreamData, 4);
		public static final ExecutorProperty _StreamData__ownedMeters = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__OWNED_METERS, Types._StreamData, 5);
		public static final ExecutorProperty _StreamData__retention_bytes = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__RETENTION_BYTES, Types._StreamData, 6);
		public static final ExecutorProperty _StreamData__retention_ms = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__RETENTION_MS, Types._StreamData, 7);
		public static final ExecutorProperty _StreamData__schemaFile = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA__SCHEMA_FILE, Types._StreamData, 8);
		public static final ExecutorProperty _StreamData__DerivedStreamData__inputs = new ExecutorPropertyWithImplementation("DerivedStreamData", Types._StreamData, 9, new EcoreLibraryOppositeProperty(PasysPackage.Literals.DERIVED_STREAM_DATA__INPUTS));
		public static final ExecutorProperty _StreamData__FlowStreamData__predecessor = new ExecutorPropertyWithImplementation("FlowStreamData", Types._StreamData, 10, new EcoreLibraryOppositeProperty(PasysPackage.Literals.FLOW_STREAM_DATA__PREDECESSOR));
		public static final ExecutorProperty _StreamData__FlowStreamData__source = new ExecutorPropertyWithImplementation("FlowStreamData", Types._StreamData, 11, new EcoreLibraryOppositeProperty(PasysPackage.Literals.FLOW_STREAM_DATA__SOURCE));
		public static final ExecutorProperty _StreamData__StreamDataRate__target = new ExecutorPropertyWithImplementation("StreamDataRate", Types._StreamData, 12, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STREAM_DATA_RATE__TARGET));
		public static final ExecutorProperty _StreamData__Task__inputStreamData = new ExecutorPropertyWithImplementation("Task", Types._StreamData, 13, new EcoreLibraryOppositeProperty(PasysPackage.Literals.TASK__INPUT_STREAM_DATA));
		public static final ExecutorProperty _StreamData__Task__returnedStreamData = new ExecutorPropertyWithImplementation("Task", Types._StreamData, 14, new EcoreLibraryOppositeProperty(PasysPackage.Literals.TASK__RETURNED_STREAM_DATA));
		public static final ExecutorProperty _StreamData__Task__triggerStreamData = new ExecutorPropertyWithImplementation("Task", Types._StreamData, 15, new EcoreLibraryOppositeProperty(PasysPackage.Literals.TASK__TRIGGER_STREAM_DATA));

		public static final ExecutorProperty _StreamDataPartition__host = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA_PARTITION__HOST, Types._StreamDataPartition, 0);
		public static final ExecutorProperty _StreamDataPartition__key = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA_PARTITION__KEY, Types._StreamDataPartition, 1);
		public static final ExecutorProperty _StreamDataPartition__StreamData__assignedPartition = new ExecutorPropertyWithImplementation("StreamData", Types._StreamDataPartition, 2, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STREAM_DATA__ASSIGNED_PARTITION));

		public static final ExecutorProperty _StreamDataRate__meter = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA_RATE__METER, Types._StreamDataRate, 0);
		public static final ExecutorProperty _StreamDataRate__target = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_DATA_RATE__TARGET, Types._StreamDataRate, 1);

		public static final ExecutorProperty _StreamRateMeter__metric = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_RATE_METER__METRIC, Types._StreamRateMeter, 0);
		public static final ExecutorProperty _StreamRateMeter__owner = new EcoreExecutorProperty(PasysPackage.Literals.STREAM_RATE_METER__OWNER, Types._StreamRateMeter, 1);

		public static final ExecutorProperty _StringToStringMap__key = new EcoreExecutorProperty(PasysPackage.Literals.STRING_TO_STRING_MAP__KEY, Types._StringToStringMap, 0);
		public static final ExecutorProperty _StringToStringMap__value = new EcoreExecutorProperty(PasysPackage.Literals.STRING_TO_STRING_MAP__VALUE, Types._StringToStringMap, 1);

		public static final ExecutorProperty _SwarmPort__mode = new EcoreExecutorProperty(PasysPackage.Literals.SWARM_PORT__MODE, Types._SwarmPort, 0);
		public static final ExecutorProperty _SwarmPort__protocol = new EcoreExecutorProperty(PasysPackage.Literals.SWARM_PORT__PROTOCOL, Types._SwarmPort, 1);

		public static final ExecutorProperty _SystemElement__owner = new EcoreExecutorProperty(PasysPackage.Literals.SYSTEM_ELEMENT__OWNER, Types._SystemElement, 0);

		public static final ExecutorProperty _Task__implementingClassName = new EcoreExecutorProperty(PasysPackage.Literals.TASK__IMPLEMENTING_CLASS_NAME, Types._Task, 0);
		public static final ExecutorProperty _Task__inputStreamData = new EcoreExecutorProperty(PasysPackage.Literals.TASK__INPUT_STREAM_DATA, Types._Task, 1);
		public static final ExecutorProperty _Task__owner = new EcoreExecutorProperty(PasysPackage.Literals.TASK__OWNER, Types._Task, 2);
		public static final ExecutorProperty _Task__returnedStreamData = new EcoreExecutorProperty(PasysPackage.Literals.TASK__RETURNED_STREAM_DATA, Types._Task, 3);
		public static final ExecutorProperty _Task__triggerStreamData = new EcoreExecutorProperty(PasysPackage.Literals.TASK__TRIGGER_STREAM_DATA, Types._Task, 4);
		public static final ExecutorProperty _Task__TaskExecutor__executedTasks = new ExecutorPropertyWithImplementation("TaskExecutor", Types._Task, 5, new EcoreLibraryOppositeProperty(PasysPackage.Literals.TASK_EXECUTOR__EXECUTED_TASKS));
		public static final ExecutorProperty _Task__TaskProcessingAmount__target = new ExecutorPropertyWithImplementation("TaskProcessingAmount", Types._Task, 6, new EcoreLibraryOppositeProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__TARGET));
		public static final ExecutorProperty _Task__Workflow__rootTask = new ExecutorPropertyWithImplementation("Workflow", Types._Task, 7, new EcoreLibraryOppositeProperty(PasysPackage.Literals.WORKFLOW__ROOT_TASK));

		public static final ExecutorProperty _TaskExecutor__executedTasks = new EcoreExecutorProperty(PasysPackage.Literals.TASK_EXECUTOR__EXECUTED_TASKS, Types._TaskExecutor, 0);
		public static final ExecutorProperty _TaskExecutor__ownedMeters = new EcoreExecutorProperty(PasysPackage.Literals.TASK_EXECUTOR__OWNED_METERS, Types._TaskExecutor, 1);
		public static final ExecutorProperty _TaskExecutor__owner = new EcoreExecutorProperty(PasysPackage.Literals.TASK_EXECUTOR__OWNER, Types._TaskExecutor, 2);

		public static final ExecutorProperty _TaskProcessingAmount__expectedMaxTPA = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA, Types._TaskProcessingAmount, 0);
		public static final ExecutorProperty _TaskProcessingAmount__expectedMinTPA = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA, Types._TaskProcessingAmount, 1);
		public static final ExecutorProperty _TaskProcessingAmount__histogramBuckectNum = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM, Types._TaskProcessingAmount, 2);
		public static final ExecutorProperty _TaskProcessingAmount__linearBucketDistribution = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION, Types._TaskProcessingAmount, 3);
		public static final ExecutorProperty _TaskProcessingAmount__meter = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__METER, Types._TaskProcessingAmount, 4);
		public static final ExecutorProperty _TaskProcessingAmount__target = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT__TARGET, Types._TaskProcessingAmount, 5);

		public static final ExecutorProperty _TaskProcessingAmountMeter__metric = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT_METER__METRIC, Types._TaskProcessingAmountMeter, 0);
		public static final ExecutorProperty _TaskProcessingAmountMeter__owner = new EcoreExecutorProperty(PasysPackage.Literals.TASK_PROCESSING_AMOUNT_METER__OWNER, Types._TaskProcessingAmountMeter, 1);

		public static final ExecutorProperty _VirtualProcessingNode__externalIP = new EcoreExecutorProperty(PasysPackage.Literals.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP, Types._VirtualProcessingNode, 0);

		public static final ExecutorProperty _Volume__accessMode = new EcoreExecutorProperty(PasysPackage.Literals.VOLUME__ACCESS_MODE, Types._Volume, 0);
		public static final ExecutorProperty _Volume__source = new EcoreExecutorProperty(PasysPackage.Literals.VOLUME__SOURCE, Types._Volume, 1);
		public static final ExecutorProperty _Volume__target = new EcoreExecutorProperty(PasysPackage.Literals.VOLUME__TARGET, Types._Volume, 2);
		public static final ExecutorProperty _Volume__type = new EcoreExecutorProperty(PasysPackage.Literals.VOLUME__TYPE, Types._Volume, 3);
		public static final ExecutorProperty _Volume__OrchestratorDeploymentConf__volumes = new ExecutorPropertyWithImplementation("OrchestratorDeploymentConf", Types._Volume, 4, new EcoreLibraryOppositeProperty(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES));

		public static final ExecutorProperty _Workflow__ownedMeters = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__OWNED_METERS, Types._Workflow, 0);
		public static final ExecutorProperty _Workflow__ownedStreamData = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__OWNED_STREAM_DATA, Types._Workflow, 1);
		public static final ExecutorProperty _Workflow__ownedTaskExecutors = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__OWNED_TASK_EXECUTORS, Types._Workflow, 2);
		public static final ExecutorProperty _Workflow__ownedTasks = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__OWNED_TASKS, Types._Workflow, 3);
		public static final ExecutorProperty _Workflow__rootTask = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__ROOT_TASK, Types._Workflow, 4);
		public static final ExecutorProperty _Workflow__scheduler = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW__SCHEDULER, Types._Workflow, 5);
		public static final ExecutorProperty _Workflow__SchedulableSet__workflows = new ExecutorPropertyWithImplementation("SchedulableSet", Types._Workflow, 6, new EcoreLibraryOppositeProperty(PasysPackage.Literals.SCHEDULABLE_SET__WORKFLOWS));
		public static final ExecutorProperty _Workflow__WorkflowLatency__target = new ExecutorPropertyWithImplementation("WorkflowLatency", Types._Workflow, 7, new EcoreLibraryOppositeProperty(PasysPackage.Literals.WORKFLOW_LATENCY__TARGET));

		public static final ExecutorProperty _WorkflowLatency__meter = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_LATENCY__METER, Types._WorkflowLatency, 0);
		public static final ExecutorProperty _WorkflowLatency__target = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_LATENCY__TARGET, Types._WorkflowLatency, 1);

		public static final ExecutorProperty _WorkflowLatencyMeter__metric = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_LATENCY_METER__METRIC, Types._WorkflowLatencyMeter, 0);
		public static final ExecutorProperty _WorkflowLatencyMeter__owner = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_LATENCY_METER__OWNER, Types._WorkflowLatencyMeter, 1);

		public static final ExecutorProperty _WorkflowStreamData__isSingleUse = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_STREAM_DATA__IS_SINGLE_USE, Types._WorkflowStreamData, 0);
		public static final ExecutorProperty _WorkflowStreamData__owner = new EcoreExecutorProperty(PasysPackage.Literals.WORKFLOW_STREAM_DATA__OWNER, Types._WorkflowStreamData, 1);

		public static final ExecutorProperty _WorkloadStreamData__holder = new EcoreExecutorProperty(PasysPackage.Literals.WORKLOAD_STREAM_DATA__HOLDER, Types._WorkloadStreamData, 0);

		public static final ExecutorProperty _ZookeeperService__clientPort = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__CLIENT_PORT, Types._ZookeeperService, 0);
		public static final ExecutorProperty _ZookeeperService__initLimit = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__INIT_LIMIT, Types._ZookeeperService, 1);
		public static final ExecutorProperty _ZookeeperService__leaderPort = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__LEADER_PORT, Types._ZookeeperService, 2);
		public static final ExecutorProperty _ZookeeperService__leaderServers = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__LEADER_SERVERS, Types._ZookeeperService, 3);
		public static final ExecutorProperty _ZookeeperService__peerPort = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__PEER_PORT, Types._ZookeeperService, 4);
		public static final ExecutorProperty _ZookeeperService__serverId = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__SERVER_ID, Types._ZookeeperService, 5);
		public static final ExecutorProperty _ZookeeperService__syncLimit = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__SYNC_LIMIT, Types._ZookeeperService, 6);
		public static final ExecutorProperty _ZookeeperService__tickTime = new EcoreExecutorProperty(PasysPackage.Literals.ZOOKEEPER_SERVICE__TICK_TIME, Types._ZookeeperService, 7);
		public static final ExecutorProperty _ZookeeperService__KafkaService__zookeeperConnect = new ExecutorPropertyWithImplementation("KafkaService", Types._ZookeeperService, 8, new EcoreLibraryOppositeProperty(PasysPackage.Literals.KAFKA_SERVICE__ZOOKEEPER_CONNECT));
		public static final ExecutorProperty _ZookeeperService__StormService__zookeeperConnect = new ExecutorPropertyWithImplementation("StormService", Types._ZookeeperService, 9, new EcoreLibraryOppositeProperty(PasysPackage.Literals.STORM_SERVICE__ZOOKEEPER_CONNECT));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AVROService =
			{
				Fragments._AVROService__OclAny /* 0 */,
				Fragments._AVROService__OclElement /* 1 */,
				Fragments._AVROService__DeployableComponent /* 2 */,
				Fragments._AVROService__NamedElement /* 2 */,
				Fragments._AVROService__SystemElement /* 3 */,
				Fragments._AVROService__PlatformResource /* 4 */,
				Fragments._AVROService__PlatformService /* 5 */,
				Fragments._AVROService__SerializationService /* 6 */,
				Fragments._AVROService__AVROService /* 7 */
			};
		private static final int /*@NonNull*/ [] __AVROService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AWSVirtualProcessingNode =
			{
				Fragments._AWSVirtualProcessingNode__OclAny /* 0 */,
				Fragments._AWSVirtualProcessingNode__OclElement /* 1 */,
				Fragments._AWSVirtualProcessingNode__NamedElement /* 2 */,
				Fragments._AWSVirtualProcessingNode__SystemElement /* 3 */,
				Fragments._AWSVirtualProcessingNode__PlatformResource /* 4 */,
				Fragments._AWSVirtualProcessingNode__ProcessingNode /* 5 */,
				Fragments._AWSVirtualProcessingNode__VirtualProcessingNode /* 6 */,
				Fragments._AWSVirtualProcessingNode__AWSVirtualProcessingNode /* 7 */
			};
		private static final int /*@NonNull*/ [] __AWSVirtualProcessingNode = { 1,1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArtifactDescriptor =
			{
				Fragments._ArtifactDescriptor__OclAny /* 0 */,
				Fragments._ArtifactDescriptor__OclElement /* 1 */,
				Fragments._ArtifactDescriptor__FileDescriptor /* 2 */,
				Fragments._ArtifactDescriptor__ArtifactDescriptor /* 3 */
			};
		private static final int /*@NonNull*/ [] __ArtifactDescriptor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CassandraService =
			{
				Fragments._CassandraService__OclAny /* 0 */,
				Fragments._CassandraService__OclElement /* 1 */,
				Fragments._CassandraService__DeployableComponent /* 2 */,
				Fragments._CassandraService__NamedElement /* 2 */,
				Fragments._CassandraService__SystemElement /* 3 */,
				Fragments._CassandraService__PlatformResource /* 4 */,
				Fragments._CassandraService__PlatformService /* 5 */,
				Fragments._CassandraService__PersistenceService /* 6 */,
				Fragments._CassandraService__CassandraService /* 7 */
			};
		private static final int /*@NonNull*/ [] __CassandraService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CommunicationMeter =
			{
				Fragments._CommunicationMeter__OclAny /* 0 */,
				Fragments._CommunicationMeter__OclElement /* 1 */,
				Fragments._CommunicationMeter__DeployableComponent /* 2 */,
				Fragments._CommunicationMeter__NamedElement /* 2 */,
				Fragments._CommunicationMeter__Meter /* 3 */,
				Fragments._CommunicationMeter__PrometheusMeter /* 4 */,
				Fragments._CommunicationMeter__NodeHostedMeter /* 5 */,
				Fragments._CommunicationMeter__CommunicationMeter /* 6 */
			};
		private static final int /*@NonNull*/ [] __CommunicationMeter = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CommunicationService =
			{
				Fragments._CommunicationService__OclAny /* 0 */,
				Fragments._CommunicationService__OclElement /* 1 */,
				Fragments._CommunicationService__DeployableComponent /* 2 */,
				Fragments._CommunicationService__NamedElement /* 2 */,
				Fragments._CommunicationService__SystemElement /* 3 */,
				Fragments._CommunicationService__PlatformResource /* 4 */,
				Fragments._CommunicationService__PlatformService /* 5 */,
				Fragments._CommunicationService__CommunicationService /* 6 */
			};
		private static final int /*@NonNull*/ [] __CommunicationService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComputationalSystem =
			{
				Fragments._ComputationalSystem__OclAny /* 0 */,
				Fragments._ComputationalSystem__OclElement /* 1 */,
				Fragments._ComputationalSystem__ComputationalSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __ComputationalSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConfigurationException =
			{
				Fragments._ConfigurationException__OclAny /* 0 */,
				Fragments._ConfigurationException__OclElement /* 1 */,
				Fragments._ConfigurationException__Exception /* 2 */,
				Fragments._ConfigurationException__ConfigurationException /* 3 */
			};
		private static final int /*@NonNull*/ [] __ConfigurationException = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataCenter =
			{
				Fragments._DataCenter__OclAny /* 0 */,
				Fragments._DataCenter__OclElement /* 1 */,
				Fragments._DataCenter__NamedElement /* 2 */,
				Fragments._DataCenter__DataCenter /* 3 */
			};
		private static final int /*@NonNull*/ [] __DataCenter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeployableComponent =
			{
				Fragments._DeployableComponent__OclAny /* 0 */,
				Fragments._DeployableComponent__OclElement /* 1 */,
				Fragments._DeployableComponent__DeployableComponent /* 2 */
			};
		private static final int /*@NonNull*/ [] __DeployableComponent = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeployableComponentType =
			{
				Fragments._DeployableComponentType__OclAny /* 0 */,
				Fragments._DeployableComponentType__OclElement /* 1 */,
				Fragments._DeployableComponentType__OclType /* 2 */,
				Fragments._DeployableComponentType__OclEnumeration /* 3 */,
				Fragments._DeployableComponentType__DeployableComponentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DeployableComponentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeploymentConfiguration =
			{
				Fragments._DeploymentConfiguration__OclAny /* 0 */,
				Fragments._DeploymentConfiguration__OclElement /* 1 */,
				Fragments._DeploymentConfiguration__DeploymentConfiguration /* 2 */
			};
		private static final int /*@NonNull*/ [] __DeploymentConfiguration = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeploymentConstraints =
			{
				Fragments._DeploymentConstraints__OclAny /* 0 */,
				Fragments._DeploymentConstraints__OclElement /* 1 */,
				Fragments._DeploymentConstraints__DeploymentConstraints /* 2 */
			};
		private static final int /*@NonNull*/ [] __DeploymentConstraints = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeploymentException =
			{
				Fragments._DeploymentException__OclAny /* 0 */,
				Fragments._DeploymentException__OclElement /* 1 */,
				Fragments._DeploymentException__Exception /* 2 */,
				Fragments._DeploymentException__DeploymentException /* 3 */
			};
		private static final int /*@NonNull*/ [] __DeploymentException = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DeploymentFileDescriptor =
			{
				Fragments._DeploymentFileDescriptor__OclAny /* 0 */,
				Fragments._DeploymentFileDescriptor__OclElement /* 1 */,
				Fragments._DeploymentFileDescriptor__FileDescriptor /* 2 */,
				Fragments._DeploymentFileDescriptor__DeploymentFileDescriptor /* 3 */
			};
		private static final int /*@NonNull*/ [] __DeploymentFileDescriptor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DerivedStreamData =
			{
				Fragments._DerivedStreamData__OclAny /* 0 */,
				Fragments._DerivedStreamData__OclElement /* 1 */,
				Fragments._DerivedStreamData__DeployableComponent /* 2 */,
				Fragments._DerivedStreamData__NamedElement /* 2 */,
				Fragments._DerivedStreamData__StreamData /* 3 */,
				Fragments._DerivedStreamData__WorkflowStreamData /* 4 */,
				Fragments._DerivedStreamData__DerivedStreamData /* 5 */
			};
		private static final int /*@NonNull*/ [] __DerivedStreamData = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DistributionService =
			{
				Fragments._DistributionService__OclAny /* 0 */,
				Fragments._DistributionService__OclElement /* 1 */,
				Fragments._DistributionService__DeployableComponent /* 2 */,
				Fragments._DistributionService__NamedElement /* 2 */,
				Fragments._DistributionService__SystemElement /* 3 */,
				Fragments._DistributionService__PlatformResource /* 4 */,
				Fragments._DistributionService__PlatformService /* 5 */,
				Fragments._DistributionService__DistributionService /* 6 */
			};
		private static final int /*@NonNull*/ [] __DistributionService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Exception =
			{
				Fragments._Exception__OclAny /* 0 */,
				Fragments._Exception__OclElement /* 1 */,
				Fragments._Exception__Exception /* 2 */
			};
		private static final int /*@NonNull*/ [] __Exception = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExporterData =
			{
				Fragments._ExporterData__OclAny /* 0 */,
				Fragments._ExporterData__OclElement /* 1 */,
				Fragments._ExporterData__ExporterData /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExporterData = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FileDescriptor =
			{
				Fragments._FileDescriptor__OclAny /* 0 */,
				Fragments._FileDescriptor__OclElement /* 1 */,
				Fragments._FileDescriptor__FileDescriptor /* 2 */
			};
		private static final int /*@NonNull*/ [] __FileDescriptor = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FlowStreamData =
			{
				Fragments._FlowStreamData__OclAny /* 0 */,
				Fragments._FlowStreamData__OclElement /* 1 */,
				Fragments._FlowStreamData__DeployableComponent /* 2 */,
				Fragments._FlowStreamData__NamedElement /* 2 */,
				Fragments._FlowStreamData__StreamData /* 3 */,
				Fragments._FlowStreamData__WorkflowStreamData /* 4 */,
				Fragments._FlowStreamData__FlowStreamData /* 5 */
			};
		private static final int /*@NonNull*/ [] __FlowStreamData = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KafkaFlowStreamData =
			{
				Fragments._KafkaFlowStreamData__OclAny /* 0 */,
				Fragments._KafkaFlowStreamData__OclElement /* 1 */,
				Fragments._KafkaFlowStreamData__DeployableComponent /* 2 */,
				Fragments._KafkaFlowStreamData__NamedElement /* 2 */,
				Fragments._KafkaFlowStreamData__StreamData /* 3 */,
				Fragments._KafkaFlowStreamData__WorkflowStreamData /* 4 */,
				Fragments._KafkaFlowStreamData__FlowStreamData /* 5 */,
				Fragments._KafkaFlowStreamData__KafkaFlowStreamData /* 6 */
			};
		private static final int /*@NonNull*/ [] __KafkaFlowStreamData = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KafkaService =
			{
				Fragments._KafkaService__OclAny /* 0 */,
				Fragments._KafkaService__OclElement /* 1 */,
				Fragments._KafkaService__DeployableComponent /* 2 */,
				Fragments._KafkaService__NamedElement /* 2 */,
				Fragments._KafkaService__SystemElement /* 3 */,
				Fragments._KafkaService__PlatformResource /* 4 */,
				Fragments._KafkaService__PlatformService /* 5 */,
				Fragments._KafkaService__CommunicationService /* 6 */,
				Fragments._KafkaService__KafkaService /* 7 */
			};
		private static final int /*@NonNull*/ [] __KafkaService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KafkaWorkloadStreamData =
			{
				Fragments._KafkaWorkloadStreamData__OclAny /* 0 */,
				Fragments._KafkaWorkloadStreamData__OclElement /* 1 */,
				Fragments._KafkaWorkloadStreamData__DeployableComponent /* 2 */,
				Fragments._KafkaWorkloadStreamData__NamedElement /* 2 */,
				Fragments._KafkaWorkloadStreamData__StreamData /* 3 */,
				Fragments._KafkaWorkloadStreamData__SystemElement /* 3 */,
				Fragments._KafkaWorkloadStreamData__WorkloadStreamData /* 4 */,
				Fragments._KafkaWorkloadStreamData__KafkaWorkloadStreamData /* 5 */
			};
		private static final int /*@NonNull*/ [] __KafkaWorkloadStreamData = { 1,1,2,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KubernetesCluster =
			{
				Fragments._KubernetesCluster__OclAny /* 0 */,
				Fragments._KubernetesCluster__OclElement /* 1 */,
				Fragments._KubernetesCluster__NamedElement /* 2 */,
				Fragments._KubernetesCluster__SystemElement /* 3 */,
				Fragments._KubernetesCluster__PlatformResource /* 4 */,
				Fragments._KubernetesCluster__ProcessingResourceCluster /* 5 */,
				Fragments._KubernetesCluster__OrchestrationCluster /* 6 */,
				Fragments._KubernetesCluster__KubernetesCluster /* 7 */
			};
		private static final int /*@NonNull*/ [] __KubernetesCluster = { 1,1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KubernetesPort =
			{
				Fragments._KubernetesPort__OclAny /* 0 */,
				Fragments._KubernetesPort__OclElement /* 1 */,
				Fragments._KubernetesPort__Port /* 2 */,
				Fragments._KubernetesPort__KubernetesPort /* 3 */
			};
		private static final int /*@NonNull*/ [] __KubernetesPort = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LaunchException =
			{
				Fragments._LaunchException__OclAny /* 0 */,
				Fragments._LaunchException__OclElement /* 1 */,
				Fragments._LaunchException__Exception /* 2 */,
				Fragments._LaunchException__LaunchException /* 3 */
			};
		private static final int /*@NonNull*/ [] __LaunchException = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MemSQLService =
			{
				Fragments._MemSQLService__OclAny /* 0 */,
				Fragments._MemSQLService__OclElement /* 1 */,
				Fragments._MemSQLService__DeployableComponent /* 2 */,
				Fragments._MemSQLService__NamedElement /* 2 */,
				Fragments._MemSQLService__SystemElement /* 3 */,
				Fragments._MemSQLService__PlatformResource /* 4 */,
				Fragments._MemSQLService__PlatformService /* 5 */,
				Fragments._MemSQLService__PersistenceService /* 6 */,
				Fragments._MemSQLService__MemSQLService /* 7 */
			};
		private static final int /*@NonNull*/ [] __MemSQLService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Meter =
			{
				Fragments._Meter__OclAny /* 0 */,
				Fragments._Meter__OclElement /* 1 */,
				Fragments._Meter__DeployableComponent /* 2 */,
				Fragments._Meter__NamedElement /* 2 */,
				Fragments._Meter__Meter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Meter = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Metric =
			{
				Fragments._Metric__OclAny /* 0 */,
				Fragments._Metric__OclElement /* 1 */,
				Fragments._Metric__NamedElement /* 2 */,
				Fragments._Metric__SystemElement /* 3 */,
				Fragments._Metric__Metric /* 4 */
			};
		private static final int /*@NonNull*/ [] __Metric = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MonitoringService =
			{
				Fragments._MonitoringService__OclAny /* 0 */,
				Fragments._MonitoringService__OclElement /* 1 */,
				Fragments._MonitoringService__DeployableComponent /* 2 */,
				Fragments._MonitoringService__NamedElement /* 2 */,
				Fragments._MonitoringService__SystemElement /* 3 */,
				Fragments._MonitoringService__PlatformResource /* 4 */,
				Fragments._MonitoringService__PlatformService /* 5 */,
				Fragments._MonitoringService__MonitoringService /* 6 */
			};
		private static final int /*@NonNull*/ [] __MonitoringService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Neo4JService =
			{
				Fragments._Neo4JService__OclAny /* 0 */,
				Fragments._Neo4JService__OclElement /* 1 */,
				Fragments._Neo4JService__DeployableComponent /* 2 */,
				Fragments._Neo4JService__NamedElement /* 2 */,
				Fragments._Neo4JService__SystemElement /* 3 */,
				Fragments._Neo4JService__PlatformResource /* 4 */,
				Fragments._Neo4JService__PlatformService /* 5 */,
				Fragments._Neo4JService__PersistenceService /* 6 */,
				Fragments._Neo4JService__Neo4JService /* 7 */
			};
		private static final int /*@NonNull*/ [] __Neo4JService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Network =
			{
				Fragments._Network__OclAny /* 0 */,
				Fragments._Network__OclElement /* 1 */,
				Fragments._Network__NamedElement /* 2 */,
				Fragments._Network__SystemElement /* 3 */,
				Fragments._Network__PlatformResource /* 4 */,
				Fragments._Network__Network /* 5 */
			};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NetworkUtilization =
			{
				Fragments._NetworkUtilization__OclAny /* 0 */,
				Fragments._NetworkUtilization__OclElement /* 1 */,
				Fragments._NetworkUtilization__NamedElement /* 2 */,
				Fragments._NetworkUtilization__SystemElement /* 3 */,
				Fragments._NetworkUtilization__Metric /* 4 */,
				Fragments._NetworkUtilization__NetworkUtilization /* 5 */
			};
		private static final int /*@NonNull*/ [] __NetworkUtilization = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeDeploymentConf =
			{
				Fragments._NodeDeploymentConf__OclAny /* 0 */,
				Fragments._NodeDeploymentConf__OclElement /* 1 */,
				Fragments._NodeDeploymentConf__DeploymentConfiguration /* 2 */,
				Fragments._NodeDeploymentConf__PlatformServiceDeploymentConf /* 3 */,
				Fragments._NodeDeploymentConf__NodeDeploymentConf /* 4 */
			};
		private static final int /*@NonNull*/ [] __NodeDeploymentConf = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeHostedMeter =
			{
				Fragments._NodeHostedMeter__OclAny /* 0 */,
				Fragments._NodeHostedMeter__OclElement /* 1 */,
				Fragments._NodeHostedMeter__DeployableComponent /* 2 */,
				Fragments._NodeHostedMeter__NamedElement /* 2 */,
				Fragments._NodeHostedMeter__Meter /* 3 */,
				Fragments._NodeHostedMeter__PrometheusMeter /* 4 */,
				Fragments._NodeHostedMeter__NodeHostedMeter /* 5 */
			};
		private static final int /*@NonNull*/ [] __NodeHostedMeter = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeResourceMeter =
			{
				Fragments._NodeResourceMeter__OclAny /* 0 */,
				Fragments._NodeResourceMeter__OclElement /* 1 */,
				Fragments._NodeResourceMeter__DeployableComponent /* 2 */,
				Fragments._NodeResourceMeter__NamedElement /* 2 */,
				Fragments._NodeResourceMeter__Meter /* 3 */,
				Fragments._NodeResourceMeter__PrometheusMeter /* 4 */,
				Fragments._NodeResourceMeter__NodeHostedMeter /* 5 */,
				Fragments._NodeResourceMeter__NodeResourceMeter /* 6 */
			};
		private static final int /*@NonNull*/ [] __NodeResourceMeter = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeScheduler =
			{
				Fragments._NodeScheduler__OclAny /* 0 */,
				Fragments._NodeScheduler__OclElement /* 1 */,
				Fragments._NodeScheduler__DeployableComponent /* 2 */,
				Fragments._NodeScheduler__NamedElement /* 2 */,
				Fragments._NodeScheduler__SystemElement /* 3 */,
				Fragments._NodeScheduler__PlatformResource /* 4 */,
				Fragments._NodeScheduler__PlatformService /* 5 */,
				Fragments._NodeScheduler__SchedulingService /* 6 */,
				Fragments._NodeScheduler__NodeScheduler /* 7 */
			};
		private static final int /*@NonNull*/ [] __NodeScheduler = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrchestrationCluster =
			{
				Fragments._OrchestrationCluster__OclAny /* 0 */,
				Fragments._OrchestrationCluster__OclElement /* 1 */,
				Fragments._OrchestrationCluster__NamedElement /* 2 */,
				Fragments._OrchestrationCluster__SystemElement /* 3 */,
				Fragments._OrchestrationCluster__PlatformResource /* 4 */,
				Fragments._OrchestrationCluster__ProcessingResourceCluster /* 5 */,
				Fragments._OrchestrationCluster__OrchestrationCluster /* 6 */
			};
		private static final int /*@NonNull*/ [] __OrchestrationCluster = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrchestratorDeploymentConf =
			{
				Fragments._OrchestratorDeploymentConf__OclAny /* 0 */,
				Fragments._OrchestratorDeploymentConf__OclElement /* 1 */,
				Fragments._OrchestratorDeploymentConf__DeploymentConfiguration /* 2 */,
				Fragments._OrchestratorDeploymentConf__PlatformServiceDeploymentConf /* 3 */,
				Fragments._OrchestratorDeploymentConf__OrchestratorDeploymentConf /* 4 */
			};
		private static final int /*@NonNull*/ [] __OrchestratorDeploymentConf = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PersistenceService =
			{
				Fragments._PersistenceService__OclAny /* 0 */,
				Fragments._PersistenceService__OclElement /* 1 */,
				Fragments._PersistenceService__DeployableComponent /* 2 */,
				Fragments._PersistenceService__NamedElement /* 2 */,
				Fragments._PersistenceService__SystemElement /* 3 */,
				Fragments._PersistenceService__PlatformResource /* 4 */,
				Fragments._PersistenceService__PlatformService /* 5 */,
				Fragments._PersistenceService__PersistenceService /* 6 */
			};
		private static final int /*@NonNull*/ [] __PersistenceService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PhysicalProcessingNode =
			{
				Fragments._PhysicalProcessingNode__OclAny /* 0 */,
				Fragments._PhysicalProcessingNode__OclElement /* 1 */,
				Fragments._PhysicalProcessingNode__NamedElement /* 2 */,
				Fragments._PhysicalProcessingNode__SystemElement /* 3 */,
				Fragments._PhysicalProcessingNode__PlatformResource /* 4 */,
				Fragments._PhysicalProcessingNode__ProcessingNode /* 5 */,
				Fragments._PhysicalProcessingNode__PhysicalProcessingNode /* 6 */
			};
		private static final int /*@NonNull*/ [] __PhysicalProcessingNode = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PlatformResource =
			{
				Fragments._PlatformResource__OclAny /* 0 */,
				Fragments._PlatformResource__OclElement /* 1 */,
				Fragments._PlatformResource__NamedElement /* 2 */,
				Fragments._PlatformResource__SystemElement /* 3 */,
				Fragments._PlatformResource__PlatformResource /* 4 */
			};
		private static final int /*@NonNull*/ [] __PlatformResource = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PlatformService =
			{
				Fragments._PlatformService__OclAny /* 0 */,
				Fragments._PlatformService__OclElement /* 1 */,
				Fragments._PlatformService__DeployableComponent /* 2 */,
				Fragments._PlatformService__NamedElement /* 2 */,
				Fragments._PlatformService__SystemElement /* 3 */,
				Fragments._PlatformService__PlatformResource /* 4 */,
				Fragments._PlatformService__PlatformService /* 5 */
			};
		private static final int /*@NonNull*/ [] __PlatformService = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PlatformServiceDeploymentConf =
			{
				Fragments._PlatformServiceDeploymentConf__OclAny /* 0 */,
				Fragments._PlatformServiceDeploymentConf__OclElement /* 1 */,
				Fragments._PlatformServiceDeploymentConf__DeploymentConfiguration /* 2 */,
				Fragments._PlatformServiceDeploymentConf__PlatformServiceDeploymentConf /* 3 */
			};
		private static final int /*@NonNull*/ [] __PlatformServiceDeploymentConf = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Port =
			{
				Fragments._Port__OclAny /* 0 */,
				Fragments._Port__OclElement /* 1 */,
				Fragments._Port__Port /* 2 */
			};
		private static final int /*@NonNull*/ [] __Port = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PortMode =
			{
				Fragments._PortMode__OclAny /* 0 */,
				Fragments._PortMode__OclElement /* 1 */,
				Fragments._PortMode__OclType /* 2 */,
				Fragments._PortMode__OclEnumeration /* 3 */,
				Fragments._PortMode__PortMode /* 4 */
			};
		private static final int /*@NonNull*/ [] __PortMode = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingNode =
			{
				Fragments._ProcessingNode__OclAny /* 0 */,
				Fragments._ProcessingNode__OclElement /* 1 */,
				Fragments._ProcessingNode__NamedElement /* 2 */,
				Fragments._ProcessingNode__SystemElement /* 3 */,
				Fragments._ProcessingNode__PlatformResource /* 4 */,
				Fragments._ProcessingNode__ProcessingNode /* 5 */
			};
		private static final int /*@NonNull*/ [] __ProcessingNode = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingNodeCluster =
			{
				Fragments._ProcessingNodeCluster__OclAny /* 0 */,
				Fragments._ProcessingNodeCluster__OclElement /* 1 */,
				Fragments._ProcessingNodeCluster__NamedElement /* 2 */,
				Fragments._ProcessingNodeCluster__SystemElement /* 3 */,
				Fragments._ProcessingNodeCluster__PlatformResource /* 4 */,
				Fragments._ProcessingNodeCluster__ProcessingResourceCluster /* 5 */,
				Fragments._ProcessingNodeCluster__ProcessingNodeCluster /* 6 */
			};
		private static final int /*@NonNull*/ [] __ProcessingNodeCluster = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingNodeMemory =
			{
				Fragments._ProcessingNodeMemory__OclAny /* 0 */,
				Fragments._ProcessingNodeMemory__OclElement /* 1 */,
				Fragments._ProcessingNodeMemory__NamedElement /* 2 */,
				Fragments._ProcessingNodeMemory__SystemElement /* 3 */,
				Fragments._ProcessingNodeMemory__Metric /* 4 */,
				Fragments._ProcessingNodeMemory__ProcessingNodeMemory /* 5 */
			};
		private static final int /*@NonNull*/ [] __ProcessingNodeMemory = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingNodeUtilization =
			{
				Fragments._ProcessingNodeUtilization__OclAny /* 0 */,
				Fragments._ProcessingNodeUtilization__OclElement /* 1 */,
				Fragments._ProcessingNodeUtilization__NamedElement /* 2 */,
				Fragments._ProcessingNodeUtilization__SystemElement /* 3 */,
				Fragments._ProcessingNodeUtilization__Metric /* 4 */,
				Fragments._ProcessingNodeUtilization__ProcessingNodeUtilization /* 5 */
			};
		private static final int /*@NonNull*/ [] __ProcessingNodeUtilization = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingResourceCluster =
			{
				Fragments._ProcessingResourceCluster__OclAny /* 0 */,
				Fragments._ProcessingResourceCluster__OclElement /* 1 */,
				Fragments._ProcessingResourceCluster__NamedElement /* 2 */,
				Fragments._ProcessingResourceCluster__SystemElement /* 3 */,
				Fragments._ProcessingResourceCluster__PlatformResource /* 4 */,
				Fragments._ProcessingResourceCluster__ProcessingResourceCluster /* 5 */
			};
		private static final int /*@NonNull*/ [] __ProcessingResourceCluster = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrometheusMeter =
			{
				Fragments._PrometheusMeter__OclAny /* 0 */,
				Fragments._PrometheusMeter__OclElement /* 1 */,
				Fragments._PrometheusMeter__DeployableComponent /* 2 */,
				Fragments._PrometheusMeter__NamedElement /* 2 */,
				Fragments._PrometheusMeter__Meter /* 3 */,
				Fragments._PrometheusMeter__PrometheusMeter /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrometheusMeter = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrometheusService =
			{
				Fragments._PrometheusService__OclAny /* 0 */,
				Fragments._PrometheusService__OclElement /* 1 */,
				Fragments._PrometheusService__DeployableComponent /* 2 */,
				Fragments._PrometheusService__NamedElement /* 2 */,
				Fragments._PrometheusService__SystemElement /* 3 */,
				Fragments._PrometheusService__PlatformResource /* 4 */,
				Fragments._PrometheusService__PlatformService /* 5 */,
				Fragments._PrometheusService__MonitoringService /* 6 */,
				Fragments._PrometheusService__PrometheusService /* 7 */
			};
		private static final int /*@NonNull*/ [] __PrometheusService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Properties =
			{
				Fragments._Properties__OclAny /* 0 */,
				Fragments._Properties__Properties /* 1 */
			};
		private static final int /*@NonNull*/ [] __Properties = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Protocol =
			{
				Fragments._Protocol__OclAny /* 0 */,
				Fragments._Protocol__OclElement /* 1 */,
				Fragments._Protocol__OclType /* 2 */,
				Fragments._Protocol__OclEnumeration /* 3 */,
				Fragments._Protocol__Protocol /* 4 */
			};
		private static final int /*@NonNull*/ [] __Protocol = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Rack =
			{
				Fragments._Rack__OclAny /* 0 */,
				Fragments._Rack__OclElement /* 1 */,
				Fragments._Rack__NamedElement /* 2 */,
				Fragments._Rack__Rack /* 3 */
			};
		private static final int /*@NonNull*/ [] __Rack = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SchedulableSet =
			{
				Fragments._SchedulableSet__OclAny /* 0 */,
				Fragments._SchedulableSet__OclElement /* 1 */,
				Fragments._SchedulableSet__NamedElement /* 2 */,
				Fragments._SchedulableSet__SystemElement /* 3 */,
				Fragments._SchedulableSet__SchedulableSet /* 4 */
			};
		private static final int /*@NonNull*/ [] __SchedulableSet = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SchedulingService =
			{
				Fragments._SchedulingService__OclAny /* 0 */,
				Fragments._SchedulingService__OclElement /* 1 */,
				Fragments._SchedulingService__DeployableComponent /* 2 */,
				Fragments._SchedulingService__NamedElement /* 2 */,
				Fragments._SchedulingService__SystemElement /* 3 */,
				Fragments._SchedulingService__PlatformResource /* 4 */,
				Fragments._SchedulingService__PlatformService /* 5 */,
				Fragments._SchedulingService__SchedulingService /* 6 */
			};
		private static final int /*@NonNull*/ [] __SchedulingService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SecurityService =
			{
				Fragments._SecurityService__OclAny /* 0 */,
				Fragments._SecurityService__OclElement /* 1 */,
				Fragments._SecurityService__DeployableComponent /* 2 */,
				Fragments._SecurityService__NamedElement /* 2 */,
				Fragments._SecurityService__SystemElement /* 3 */,
				Fragments._SecurityService__PlatformResource /* 4 */,
				Fragments._SecurityService__PlatformService /* 5 */,
				Fragments._SecurityService__SecurityService /* 6 */
			};
		private static final int /*@NonNull*/ [] __SecurityService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SerializationService =
			{
				Fragments._SerializationService__OclAny /* 0 */,
				Fragments._SerializationService__OclElement /* 1 */,
				Fragments._SerializationService__DeployableComponent /* 2 */,
				Fragments._SerializationService__NamedElement /* 2 */,
				Fragments._SerializationService__SystemElement /* 3 */,
				Fragments._SerializationService__PlatformResource /* 4 */,
				Fragments._SerializationService__PlatformService /* 5 */,
				Fragments._SerializationService__SerializationService /* 6 */
			};
		private static final int /*@NonNull*/ [] __SerializationService = { 1,1,2,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SparkService =
			{
				Fragments._SparkService__OclAny /* 0 */,
				Fragments._SparkService__OclElement /* 1 */,
				Fragments._SparkService__DeployableComponent /* 2 */,
				Fragments._SparkService__NamedElement /* 2 */,
				Fragments._SparkService__SystemElement /* 3 */,
				Fragments._SparkService__PlatformResource /* 4 */,
				Fragments._SparkService__PlatformService /* 5 */,
				Fragments._SparkService__SchedulingService /* 6 */,
				Fragments._SparkService__SparkService /* 7 */
			};
		private static final int /*@NonNull*/ [] __SparkService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StormNimbus =
			{
				Fragments._StormNimbus__OclAny /* 0 */,
				Fragments._StormNimbus__OclElement /* 1 */,
				Fragments._StormNimbus__DeployableComponent /* 2 */,
				Fragments._StormNimbus__NamedElement /* 2 */,
				Fragments._StormNimbus__StormNimbus /* 3 */
			};
		private static final int /*@NonNull*/ [] __StormNimbus = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StormService =
			{
				Fragments._StormService__OclAny /* 0 */,
				Fragments._StormService__OclElement /* 1 */,
				Fragments._StormService__DeployableComponent /* 2 */,
				Fragments._StormService__NamedElement /* 2 */,
				Fragments._StormService__SystemElement /* 3 */,
				Fragments._StormService__PlatformResource /* 4 */,
				Fragments._StormService__PlatformService /* 5 */,
				Fragments._StormService__SchedulingService /* 6 */,
				Fragments._StormService__StormService /* 7 */
			};
		private static final int /*@NonNull*/ [] __StormService = { 1,1,2,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StormSupervisor =
			{
				Fragments._StormSupervisor__OclAny /* 0 */,
				Fragments._StormSupervisor__OclElement /* 1 */,
				Fragments._StormSupervisor__DeployableComponent /* 2 */,
				Fragments._StormSupervisor__NamedElement /* 2 */,
				Fragments._StormSupervisor__StormSupervisor /* 3 */
			};
		private static final int /*@NonNull*/ [] __StormSupervisor = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StormUI =
			{
				Fragments._StormUI__OclAny /* 0 */,
				Fragments._StormUI__OclElement /* 1 */,
				Fragments._StormUI__DeployableComponent /* 2 */,
				Fragments._StormUI__NamedElement /* 2 */,
				Fragments._StormUI__StormUI /* 3 */
			};
		private static final int /*@NonNull*/ [] __StormUI = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StreamData =
			{
				Fragments._StreamData__OclAny /* 0 */,
				Fragments._StreamData__OclElement /* 1 */,
				Fragments._StreamData__DeployableComponent /* 2 */,
				Fragments._StreamData__StreamData /* 3 */
			};
		private static final int /*@NonNull*/ [] __StreamData = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StreamDataPartition =
			{
				Fragments._StreamDataPartition__OclAny /* 0 */,
				Fragments._StreamDataPartition__OclElement /* 1 */,
				Fragments._StreamDataPartition__StreamDataPartition /* 2 */
			};
		private static final int /*@NonNull*/ [] __StreamDataPartition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StreamDataRate =
			{
				Fragments._StreamDataRate__OclAny /* 0 */,
				Fragments._StreamDataRate__OclElement /* 1 */,
				Fragments._StreamDataRate__NamedElement /* 2 */,
				Fragments._StreamDataRate__SystemElement /* 3 */,
				Fragments._StreamDataRate__Metric /* 4 */,
				Fragments._StreamDataRate__StreamDataRate /* 5 */
			};
		private static final int /*@NonNull*/ [] __StreamDataRate = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StreamRateMeter =
			{
				Fragments._StreamRateMeter__OclAny /* 0 */,
				Fragments._StreamRateMeter__OclElement /* 1 */,
				Fragments._StreamRateMeter__DeployableComponent /* 2 */,
				Fragments._StreamRateMeter__NamedElement /* 2 */,
				Fragments._StreamRateMeter__Meter /* 3 */,
				Fragments._StreamRateMeter__PrometheusMeter /* 4 */,
				Fragments._StreamRateMeter__StreamRateMeter /* 5 */
			};
		private static final int /*@NonNull*/ [] __StreamRateMeter = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringToStringMap =
			{
				Fragments._StringToStringMap__OclAny /* 0 */,
				Fragments._StringToStringMap__OclElement /* 1 */,
				Fragments._StringToStringMap__StringToStringMap /* 2 */
			};
		private static final int /*@NonNull*/ [] __StringToStringMap = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SwarmCluster =
			{
				Fragments._SwarmCluster__OclAny /* 0 */,
				Fragments._SwarmCluster__OclElement /* 1 */,
				Fragments._SwarmCluster__NamedElement /* 2 */,
				Fragments._SwarmCluster__SystemElement /* 3 */,
				Fragments._SwarmCluster__PlatformResource /* 4 */,
				Fragments._SwarmCluster__ProcessingResourceCluster /* 5 */,
				Fragments._SwarmCluster__OrchestrationCluster /* 6 */,
				Fragments._SwarmCluster__SwarmCluster /* 7 */
			};
		private static final int /*@NonNull*/ [] __SwarmCluster = { 1,1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SwarmPort =
			{
				Fragments._SwarmPort__OclAny /* 0 */,
				Fragments._SwarmPort__OclElement /* 1 */,
				Fragments._SwarmPort__Port /* 2 */,
				Fragments._SwarmPort__SwarmPort /* 3 */
			};
		private static final int /*@NonNull*/ [] __SwarmPort = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SystemElement =
			{
				Fragments._SystemElement__OclAny /* 0 */,
				Fragments._SystemElement__OclElement /* 1 */,
				Fragments._SystemElement__NamedElement /* 2 */,
				Fragments._SystemElement__SystemElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __SystemElement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Task =
			{
				Fragments._Task__OclAny /* 0 */,
				Fragments._Task__OclElement /* 1 */,
				Fragments._Task__NamedElement /* 2 */,
				Fragments._Task__Task /* 3 */
			};
		private static final int /*@NonNull*/ [] __Task = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TaskExecutor =
			{
				Fragments._TaskExecutor__OclAny /* 0 */,
				Fragments._TaskExecutor__OclElement /* 1 */,
				Fragments._TaskExecutor__DeployableComponent /* 2 */,
				Fragments._TaskExecutor__NamedElement /* 2 */,
				Fragments._TaskExecutor__TaskExecutor /* 3 */
			};
		private static final int /*@NonNull*/ [] __TaskExecutor = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TaskProcessingAmount =
			{
				Fragments._TaskProcessingAmount__OclAny /* 0 */,
				Fragments._TaskProcessingAmount__OclElement /* 1 */,
				Fragments._TaskProcessingAmount__NamedElement /* 2 */,
				Fragments._TaskProcessingAmount__SystemElement /* 3 */,
				Fragments._TaskProcessingAmount__Metric /* 4 */,
				Fragments._TaskProcessingAmount__TaskProcessingAmount /* 5 */
			};
		private static final int /*@NonNull*/ [] __TaskProcessingAmount = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TaskProcessingAmountMeter =
			{
				Fragments._TaskProcessingAmountMeter__OclAny /* 0 */,
				Fragments._TaskProcessingAmountMeter__OclElement /* 1 */,
				Fragments._TaskProcessingAmountMeter__DeployableComponent /* 2 */,
				Fragments._TaskProcessingAmountMeter__NamedElement /* 2 */,
				Fragments._TaskProcessingAmountMeter__Meter /* 3 */,
				Fragments._TaskProcessingAmountMeter__PrometheusMeter /* 4 */,
				Fragments._TaskProcessingAmountMeter__TaskProcessingAmountMeter /* 5 */
			};
		private static final int /*@NonNull*/ [] __TaskProcessingAmountMeter = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VirtualProcessingNode =
			{
				Fragments._VirtualProcessingNode__OclAny /* 0 */,
				Fragments._VirtualProcessingNode__OclElement /* 1 */,
				Fragments._VirtualProcessingNode__NamedElement /* 2 */,
				Fragments._VirtualProcessingNode__SystemElement /* 3 */,
				Fragments._VirtualProcessingNode__PlatformResource /* 4 */,
				Fragments._VirtualProcessingNode__ProcessingNode /* 5 */,
				Fragments._VirtualProcessingNode__VirtualProcessingNode /* 6 */
			};
		private static final int /*@NonNull*/ [] __VirtualProcessingNode = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Volume =
			{
				Fragments._Volume__OclAny /* 0 */,
				Fragments._Volume__OclElement /* 1 */,
				Fragments._Volume__Volume /* 2 */
			};
		private static final int /*@NonNull*/ [] __Volume = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VolumeAccessMode =
			{
				Fragments._VolumeAccessMode__OclAny /* 0 */,
				Fragments._VolumeAccessMode__OclElement /* 1 */,
				Fragments._VolumeAccessMode__OclType /* 2 */,
				Fragments._VolumeAccessMode__OclEnumeration /* 3 */,
				Fragments._VolumeAccessMode__VolumeAccessMode /* 4 */
			};
		private static final int /*@NonNull*/ [] __VolumeAccessMode = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VolumeType =
			{
				Fragments._VolumeType__OclAny /* 0 */,
				Fragments._VolumeType__OclElement /* 1 */,
				Fragments._VolumeType__OclType /* 2 */,
				Fragments._VolumeType__OclEnumeration /* 3 */,
				Fragments._VolumeType__VolumeType /* 4 */
			};
		private static final int /*@NonNull*/ [] __VolumeType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Workflow =
			{
				Fragments._Workflow__OclAny /* 0 */,
				Fragments._Workflow__OclElement /* 1 */,
				Fragments._Workflow__DeployableComponent /* 2 */,
				Fragments._Workflow__NamedElement /* 2 */,
				Fragments._Workflow__SystemElement /* 3 */,
				Fragments._Workflow__Workflow /* 4 */
			};
		private static final int /*@NonNull*/ [] __Workflow = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkflowLatency =
			{
				Fragments._WorkflowLatency__OclAny /* 0 */,
				Fragments._WorkflowLatency__OclElement /* 1 */,
				Fragments._WorkflowLatency__NamedElement /* 2 */,
				Fragments._WorkflowLatency__SystemElement /* 3 */,
				Fragments._WorkflowLatency__Metric /* 4 */,
				Fragments._WorkflowLatency__WorkflowLatency /* 5 */
			};
		private static final int /*@NonNull*/ [] __WorkflowLatency = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkflowLatencyMeter =
			{
				Fragments._WorkflowLatencyMeter__OclAny /* 0 */,
				Fragments._WorkflowLatencyMeter__OclElement /* 1 */,
				Fragments._WorkflowLatencyMeter__DeployableComponent /* 2 */,
				Fragments._WorkflowLatencyMeter__NamedElement /* 2 */,
				Fragments._WorkflowLatencyMeter__Meter /* 3 */,
				Fragments._WorkflowLatencyMeter__PrometheusMeter /* 4 */,
				Fragments._WorkflowLatencyMeter__WorkflowLatencyMeter /* 5 */
			};
		private static final int /*@NonNull*/ [] __WorkflowLatencyMeter = { 1,1,2,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkflowStreamData =
			{
				Fragments._WorkflowStreamData__OclAny /* 0 */,
				Fragments._WorkflowStreamData__OclElement /* 1 */,
				Fragments._WorkflowStreamData__DeployableComponent /* 2 */,
				Fragments._WorkflowStreamData__NamedElement /* 2 */,
				Fragments._WorkflowStreamData__StreamData /* 3 */,
				Fragments._WorkflowStreamData__WorkflowStreamData /* 4 */
			};
		private static final int /*@NonNull*/ [] __WorkflowStreamData = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkloadStreamData =
			{
				Fragments._WorkloadStreamData__OclAny /* 0 */,
				Fragments._WorkloadStreamData__OclElement /* 1 */,
				Fragments._WorkloadStreamData__DeployableComponent /* 2 */,
				Fragments._WorkloadStreamData__NamedElement /* 2 */,
				Fragments._WorkloadStreamData__StreamData /* 3 */,
				Fragments._WorkloadStreamData__SystemElement /* 3 */,
				Fragments._WorkloadStreamData__WorkloadStreamData /* 4 */
			};
		private static final int /*@NonNull*/ [] __WorkloadStreamData = { 1,1,2,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ZookeeperService =
			{
				Fragments._ZookeeperService__OclAny /* 0 */,
				Fragments._ZookeeperService__OclElement /* 1 */,
				Fragments._ZookeeperService__DeployableComponent /* 2 */,
				Fragments._ZookeeperService__NamedElement /* 2 */,
				Fragments._ZookeeperService__SystemElement /* 3 */,
				Fragments._ZookeeperService__PlatformResource /* 4 */,
				Fragments._ZookeeperService__PlatformService /* 5 */,
				Fragments._ZookeeperService__DistributionService /* 6 */,
				Fragments._ZookeeperService__ZookeeperService /* 7 */
			};
		private static final int /*@NonNull*/ [] __ZookeeperService = { 1,1,2,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AVROService.initFragments(_AVROService, __AVROService);
			Types._AWSVirtualProcessingNode.initFragments(_AWSVirtualProcessingNode, __AWSVirtualProcessingNode);
			Types._ArtifactDescriptor.initFragments(_ArtifactDescriptor, __ArtifactDescriptor);
			Types._CassandraService.initFragments(_CassandraService, __CassandraService);
			Types._CommunicationMeter.initFragments(_CommunicationMeter, __CommunicationMeter);
			Types._CommunicationService.initFragments(_CommunicationService, __CommunicationService);
			Types._ComputationalSystem.initFragments(_ComputationalSystem, __ComputationalSystem);
			Types._ConfigurationException.initFragments(_ConfigurationException, __ConfigurationException);
			Types._DataCenter.initFragments(_DataCenter, __DataCenter);
			Types._DeployableComponent.initFragments(_DeployableComponent, __DeployableComponent);
			Types._DeployableComponentType.initFragments(_DeployableComponentType, __DeployableComponentType);
			Types._DeploymentConfiguration.initFragments(_DeploymentConfiguration, __DeploymentConfiguration);
			Types._DeploymentConstraints.initFragments(_DeploymentConstraints, __DeploymentConstraints);
			Types._DeploymentException.initFragments(_DeploymentException, __DeploymentException);
			Types._DeploymentFileDescriptor.initFragments(_DeploymentFileDescriptor, __DeploymentFileDescriptor);
			Types._DerivedStreamData.initFragments(_DerivedStreamData, __DerivedStreamData);
			Types._DistributionService.initFragments(_DistributionService, __DistributionService);
			Types._Exception.initFragments(_Exception, __Exception);
			Types._ExporterData.initFragments(_ExporterData, __ExporterData);
			Types._FileDescriptor.initFragments(_FileDescriptor, __FileDescriptor);
			Types._FlowStreamData.initFragments(_FlowStreamData, __FlowStreamData);
			Types._KafkaFlowStreamData.initFragments(_KafkaFlowStreamData, __KafkaFlowStreamData);
			Types._KafkaService.initFragments(_KafkaService, __KafkaService);
			Types._KafkaWorkloadStreamData.initFragments(_KafkaWorkloadStreamData, __KafkaWorkloadStreamData);
			Types._KubernetesCluster.initFragments(_KubernetesCluster, __KubernetesCluster);
			Types._KubernetesPort.initFragments(_KubernetesPort, __KubernetesPort);
			Types._LaunchException.initFragments(_LaunchException, __LaunchException);
			Types._MemSQLService.initFragments(_MemSQLService, __MemSQLService);
			Types._Meter.initFragments(_Meter, __Meter);
			Types._Metric.initFragments(_Metric, __Metric);
			Types._MonitoringService.initFragments(_MonitoringService, __MonitoringService);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Neo4JService.initFragments(_Neo4JService, __Neo4JService);
			Types._Network.initFragments(_Network, __Network);
			Types._NetworkUtilization.initFragments(_NetworkUtilization, __NetworkUtilization);
			Types._NodeDeploymentConf.initFragments(_NodeDeploymentConf, __NodeDeploymentConf);
			Types._NodeHostedMeter.initFragments(_NodeHostedMeter, __NodeHostedMeter);
			Types._NodeResourceMeter.initFragments(_NodeResourceMeter, __NodeResourceMeter);
			Types._NodeScheduler.initFragments(_NodeScheduler, __NodeScheduler);
			Types._OrchestrationCluster.initFragments(_OrchestrationCluster, __OrchestrationCluster);
			Types._OrchestratorDeploymentConf.initFragments(_OrchestratorDeploymentConf, __OrchestratorDeploymentConf);
			Types._PersistenceService.initFragments(_PersistenceService, __PersistenceService);
			Types._PhysicalProcessingNode.initFragments(_PhysicalProcessingNode, __PhysicalProcessingNode);
			Types._PlatformResource.initFragments(_PlatformResource, __PlatformResource);
			Types._PlatformService.initFragments(_PlatformService, __PlatformService);
			Types._PlatformServiceDeploymentConf.initFragments(_PlatformServiceDeploymentConf, __PlatformServiceDeploymentConf);
			Types._Port.initFragments(_Port, __Port);
			Types._PortMode.initFragments(_PortMode, __PortMode);
			Types._ProcessingNode.initFragments(_ProcessingNode, __ProcessingNode);
			Types._ProcessingNodeCluster.initFragments(_ProcessingNodeCluster, __ProcessingNodeCluster);
			Types._ProcessingNodeMemory.initFragments(_ProcessingNodeMemory, __ProcessingNodeMemory);
			Types._ProcessingNodeUtilization.initFragments(_ProcessingNodeUtilization, __ProcessingNodeUtilization);
			Types._ProcessingResourceCluster.initFragments(_ProcessingResourceCluster, __ProcessingResourceCluster);
			Types._PrometheusMeter.initFragments(_PrometheusMeter, __PrometheusMeter);
			Types._PrometheusService.initFragments(_PrometheusService, __PrometheusService);
			Types._Properties.initFragments(_Properties, __Properties);
			Types._Protocol.initFragments(_Protocol, __Protocol);
			Types._Rack.initFragments(_Rack, __Rack);
			Types._SchedulableSet.initFragments(_SchedulableSet, __SchedulableSet);
			Types._SchedulingService.initFragments(_SchedulingService, __SchedulingService);
			Types._SecurityService.initFragments(_SecurityService, __SecurityService);
			Types._SerializationService.initFragments(_SerializationService, __SerializationService);
			Types._SparkService.initFragments(_SparkService, __SparkService);
			Types._StormNimbus.initFragments(_StormNimbus, __StormNimbus);
			Types._StormService.initFragments(_StormService, __StormService);
			Types._StormSupervisor.initFragments(_StormSupervisor, __StormSupervisor);
			Types._StormUI.initFragments(_StormUI, __StormUI);
			Types._StreamData.initFragments(_StreamData, __StreamData);
			Types._StreamDataPartition.initFragments(_StreamDataPartition, __StreamDataPartition);
			Types._StreamDataRate.initFragments(_StreamDataRate, __StreamDataRate);
			Types._StreamRateMeter.initFragments(_StreamRateMeter, __StreamRateMeter);
			Types._StringToStringMap.initFragments(_StringToStringMap, __StringToStringMap);
			Types._SwarmCluster.initFragments(_SwarmCluster, __SwarmCluster);
			Types._SwarmPort.initFragments(_SwarmPort, __SwarmPort);
			Types._SystemElement.initFragments(_SystemElement, __SystemElement);
			Types._Task.initFragments(_Task, __Task);
			Types._TaskExecutor.initFragments(_TaskExecutor, __TaskExecutor);
			Types._TaskProcessingAmount.initFragments(_TaskProcessingAmount, __TaskProcessingAmount);
			Types._TaskProcessingAmountMeter.initFragments(_TaskProcessingAmountMeter, __TaskProcessingAmountMeter);
			Types._VirtualProcessingNode.initFragments(_VirtualProcessingNode, __VirtualProcessingNode);
			Types._Volume.initFragments(_Volume, __Volume);
			Types._VolumeAccessMode.initFragments(_VolumeAccessMode, __VolumeAccessMode);
			Types._VolumeType.initFragments(_VolumeType, __VolumeType);
			Types._Workflow.initFragments(_Workflow, __Workflow);
			Types._WorkflowLatency.initFragments(_WorkflowLatency, __WorkflowLatency);
			Types._WorkflowLatencyMeter.initFragments(_WorkflowLatencyMeter, __WorkflowLatencyMeter);
			Types._WorkflowStreamData.initFragments(_WorkflowStreamData, __WorkflowStreamData);
			Types._WorkloadStreamData.initFragments(_WorkloadStreamData, __WorkloadStreamData);
			Types._ZookeeperService.initFragments(_ZookeeperService, __ZookeeperService);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__AVROService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__SerializationService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AVROService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__AWSVirtualProcessingNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__ProcessingNode = {
			PasysTables.Operations._ProcessingNode__abortLaunching /* abortLaunching() */,
			PasysTables.Operations._ProcessingNode__addConfigFile /* addConfigFile(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__addLaunchingScript /* addLaunchingScript(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__bringBackConfiguration /* bringBackConfiguration() */,
			PasysTables.Operations._ProcessingNode__bringBackDeployment /* bringBackDeployment() */,
			PasysTables.Operations._ProcessingNode__deployAndLaunch /* deployAndLaunch() */,
			PasysTables.Operations._ProcessingNode__prepareForDeployment /* prepareForDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__SystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AWSVirtualProcessingNode__VirtualProcessingNode = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactDescriptor__ArtifactDescriptor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactDescriptor__FileDescriptor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactDescriptor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtifactDescriptor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__CassandraService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__PersistenceService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CassandraService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__CommunicationMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__NodeHostedMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__CommunicationService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ComputationalSystem__ComputationalSystem = {
			PasysTables.Operations._ComputationalSystem__cleanDeployment /* cleanDeployment() */,
			PasysTables.Operations._ComputationalSystem__deployAndLaunch /* deployAndLaunch() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComputationalSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComputationalSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationException__ConfigurationException = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationException__Exception = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationException__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationException__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataCenter__DataCenter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataCenter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataCenter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataCenter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponent__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponentType__DeployableComponentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeployableComponentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConfiguration__DeploymentConfiguration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConfiguration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConfiguration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConstraints__DeploymentConstraints = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConstraints__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentConstraints__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentException__DeploymentException = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentException__Exception = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentException__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentException__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentFileDescriptor__DeploymentFileDescriptor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentFileDescriptor__FileDescriptor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentFileDescriptor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DeploymentFileDescriptor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__DerivedStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DerivedStreamData__WorkflowStreamData = {};

		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__DistributionService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DistributionService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Exception__Exception = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Exception__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Exception__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExporterData__ExporterData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExporterData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExporterData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FileDescriptor__FileDescriptor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FileDescriptor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FileDescriptor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__FlowStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FlowStreamData__WorkflowStreamData = {};

		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__KafkaFlowStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__FlowStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaFlowStreamData__WorkflowStreamData = {};

		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__KafkaService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__CommunicationService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__KafkaWorkloadStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__SystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KafkaWorkloadStreamData__WorkloadStreamData = {};

		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__KubernetesCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__OrchestrationCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__ProcessingResourceCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesCluster__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesPort__KubernetesPort = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesPort__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesPort__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KubernetesPort__Port = {};

		private static final ExecutorOperation /*@NonNull*/ [] _LaunchException__LaunchException = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LaunchException__Exception = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LaunchException__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LaunchException__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__MemSQLService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__PersistenceService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MemSQLService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Meter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Meter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Meter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Meter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Meter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Metric__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__MonitoringService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__Neo4JService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__PersistenceService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Neo4JService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Network__Network = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Network__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__NetworkUtilization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NetworkUtilization__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeDeploymentConf__NodeDeploymentConf = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeDeploymentConf__DeploymentConfiguration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeDeploymentConf__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeDeploymentConf__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeDeploymentConf__PlatformServiceDeploymentConf = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__NodeHostedMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeHostedMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__NodeResourceMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__NodeHostedMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeResourceMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__NodeScheduler = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__SchedulingService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeScheduler__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__OrchestrationCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__ProcessingResourceCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestrationCluster__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _OrchestratorDeploymentConf__OrchestratorDeploymentConf = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestratorDeploymentConf__DeploymentConfiguration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestratorDeploymentConf__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestratorDeploymentConf__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrchestratorDeploymentConf__PlatformServiceDeploymentConf = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__PersistenceService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__PhysicalProcessingNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__ProcessingNode = {
			PasysTables.Operations._ProcessingNode__abortLaunching /* abortLaunching() */,
			PasysTables.Operations._ProcessingNode__addConfigFile /* addConfigFile(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__addLaunchingScript /* addLaunchingScript(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__bringBackConfiguration /* bringBackConfiguration() */,
			PasysTables.Operations._ProcessingNode__bringBackDeployment /* bringBackDeployment() */,
			PasysTables.Operations._ProcessingNode__deployAndLaunch /* deployAndLaunch() */,
			PasysTables.Operations._ProcessingNode__prepareForDeployment /* prepareForDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PhysicalProcessingNode__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PlatformResource__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformResource__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformResource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformResource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformResource__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PlatformServiceDeploymentConf__PlatformServiceDeploymentConf = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformServiceDeploymentConf__DeploymentConfiguration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformServiceDeploymentConf__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlatformServiceDeploymentConf__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Port__Port = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Port__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Port__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PortMode__PortMode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PortMode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortMode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortMode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PortMode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__ProcessingNode = {
			PasysTables.Operations._ProcessingNode__abortLaunching /* abortLaunching() */,
			PasysTables.Operations._ProcessingNode__addConfigFile /* addConfigFile(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__addLaunchingScript /* addLaunchingScript(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__bringBackConfiguration /* bringBackConfiguration() */,
			PasysTables.Operations._ProcessingNode__bringBackDeployment /* bringBackDeployment() */,
			PasysTables.Operations._ProcessingNode__deployAndLaunch /* deployAndLaunch() */,
			PasysTables.Operations._ProcessingNode__prepareForDeployment /* prepareForDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNode__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__ProcessingNodeCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__ProcessingResourceCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeCluster__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__ProcessingNodeMemory = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeMemory__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__ProcessingNodeUtilization = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingNodeUtilization__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__ProcessingResourceCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingResourceCluster__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__PrometheusService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__MonitoringService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrometheusService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Properties__Properties = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Properties__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__Protocol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Rack__Rack = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rack__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rack__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Rack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SchedulableSet__SchedulableSet = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulableSet__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulableSet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulableSet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulableSet__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__SchedulingService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SchedulingService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__SecurityService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SecurityService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__SerializationService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SerializationService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__SparkService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__SchedulingService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SparkService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StormNimbus__StormNimbus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormNimbus__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormNimbus__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormNimbus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormNimbus__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StormService__StormService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__SchedulingService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormService__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StormSupervisor__StormSupervisor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormSupervisor__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormSupervisor__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormSupervisor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormSupervisor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StormUI__StormUI = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormUI__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormUI__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StormUI__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StormUI__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataPartition__StreamDataPartition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataPartition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataPartition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__StreamDataRate = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamDataRate__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__StreamRateMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StreamRateMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMap__StringToStringMap = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMap__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringToStringMap__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__SwarmCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__OrchestrationCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__ProcessingResourceCluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmCluster__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SwarmPort__SwarmPort = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmPort__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmPort__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SwarmPort__Port = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SystemElement__SystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SystemElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Task__Task = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Task__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TaskExecutor__TaskExecutor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskExecutor__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskExecutor__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskExecutor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskExecutor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__TaskProcessingAmount = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmount__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__TaskProcessingAmountMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaskProcessingAmountMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__VirtualProcessingNode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__ProcessingNode = {
			PasysTables.Operations._ProcessingNode__abortLaunching /* abortLaunching() */,
			PasysTables.Operations._ProcessingNode__addConfigFile /* addConfigFile(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__addLaunchingScript /* addLaunchingScript(DeploymentFileDescriptor[1]) */,
			PasysTables.Operations._ProcessingNode__bringBackConfiguration /* bringBackConfiguration() */,
			PasysTables.Operations._ProcessingNode__bringBackDeployment /* bringBackDeployment() */,
			PasysTables.Operations._ProcessingNode__deployAndLaunch /* deployAndLaunch() */,
			PasysTables.Operations._ProcessingNode__prepareForDeployment /* prepareForDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VirtualProcessingNode__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Volume__Volume = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Volume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Volume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VolumeAccessMode__VolumeAccessMode = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeAccessMode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeAccessMode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeAccessMode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeAccessMode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VolumeType__VolumeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VolumeType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__Workflow = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Workflow__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__WorkflowLatency = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatency__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__WorkflowLatencyMeter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__Meter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowLatencyMeter__PrometheusMeter = {
			PasysTables.Operations._PrometheusMeter__getPrometheusServerConfiguration /* getPrometheusServerConfiguration() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__WorkflowStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkflowStreamData__StreamData = {};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__WorkloadStreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__StreamData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkloadStreamData__SystemElement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__ZookeeperService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__DeployableComponent = {
			PasysTables.Operations._DeployableComponent__configureDeployment /* configureDeployment() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__DistributionService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__PlatformResource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__PlatformService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ZookeeperService__SystemElement = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AVROService__AVROService.initOperations(_AVROService__AVROService);
			Fragments._AVROService__DeployableComponent.initOperations(_AVROService__DeployableComponent);
			Fragments._AVROService__NamedElement.initOperations(_AVROService__NamedElement);
			Fragments._AVROService__OclAny.initOperations(_AVROService__OclAny);
			Fragments._AVROService__OclElement.initOperations(_AVROService__OclElement);
			Fragments._AVROService__PlatformResource.initOperations(_AVROService__PlatformResource);
			Fragments._AVROService__PlatformService.initOperations(_AVROService__PlatformService);
			Fragments._AVROService__SerializationService.initOperations(_AVROService__SerializationService);
			Fragments._AVROService__SystemElement.initOperations(_AVROService__SystemElement);

			Fragments._AWSVirtualProcessingNode__AWSVirtualProcessingNode.initOperations(_AWSVirtualProcessingNode__AWSVirtualProcessingNode);
			Fragments._AWSVirtualProcessingNode__NamedElement.initOperations(_AWSVirtualProcessingNode__NamedElement);
			Fragments._AWSVirtualProcessingNode__OclAny.initOperations(_AWSVirtualProcessingNode__OclAny);
			Fragments._AWSVirtualProcessingNode__OclElement.initOperations(_AWSVirtualProcessingNode__OclElement);
			Fragments._AWSVirtualProcessingNode__PlatformResource.initOperations(_AWSVirtualProcessingNode__PlatformResource);
			Fragments._AWSVirtualProcessingNode__ProcessingNode.initOperations(_AWSVirtualProcessingNode__ProcessingNode);
			Fragments._AWSVirtualProcessingNode__SystemElement.initOperations(_AWSVirtualProcessingNode__SystemElement);
			Fragments._AWSVirtualProcessingNode__VirtualProcessingNode.initOperations(_AWSVirtualProcessingNode__VirtualProcessingNode);

			Fragments._ArtifactDescriptor__ArtifactDescriptor.initOperations(_ArtifactDescriptor__ArtifactDescriptor);
			Fragments._ArtifactDescriptor__FileDescriptor.initOperations(_ArtifactDescriptor__FileDescriptor);
			Fragments._ArtifactDescriptor__OclAny.initOperations(_ArtifactDescriptor__OclAny);
			Fragments._ArtifactDescriptor__OclElement.initOperations(_ArtifactDescriptor__OclElement);

			Fragments._CassandraService__CassandraService.initOperations(_CassandraService__CassandraService);
			Fragments._CassandraService__DeployableComponent.initOperations(_CassandraService__DeployableComponent);
			Fragments._CassandraService__NamedElement.initOperations(_CassandraService__NamedElement);
			Fragments._CassandraService__OclAny.initOperations(_CassandraService__OclAny);
			Fragments._CassandraService__OclElement.initOperations(_CassandraService__OclElement);
			Fragments._CassandraService__PersistenceService.initOperations(_CassandraService__PersistenceService);
			Fragments._CassandraService__PlatformResource.initOperations(_CassandraService__PlatformResource);
			Fragments._CassandraService__PlatformService.initOperations(_CassandraService__PlatformService);
			Fragments._CassandraService__SystemElement.initOperations(_CassandraService__SystemElement);

			Fragments._CommunicationMeter__CommunicationMeter.initOperations(_CommunicationMeter__CommunicationMeter);
			Fragments._CommunicationMeter__DeployableComponent.initOperations(_CommunicationMeter__DeployableComponent);
			Fragments._CommunicationMeter__Meter.initOperations(_CommunicationMeter__Meter);
			Fragments._CommunicationMeter__NamedElement.initOperations(_CommunicationMeter__NamedElement);
			Fragments._CommunicationMeter__NodeHostedMeter.initOperations(_CommunicationMeter__NodeHostedMeter);
			Fragments._CommunicationMeter__OclAny.initOperations(_CommunicationMeter__OclAny);
			Fragments._CommunicationMeter__OclElement.initOperations(_CommunicationMeter__OclElement);
			Fragments._CommunicationMeter__PrometheusMeter.initOperations(_CommunicationMeter__PrometheusMeter);

			Fragments._CommunicationService__CommunicationService.initOperations(_CommunicationService__CommunicationService);
			Fragments._CommunicationService__DeployableComponent.initOperations(_CommunicationService__DeployableComponent);
			Fragments._CommunicationService__NamedElement.initOperations(_CommunicationService__NamedElement);
			Fragments._CommunicationService__OclAny.initOperations(_CommunicationService__OclAny);
			Fragments._CommunicationService__OclElement.initOperations(_CommunicationService__OclElement);
			Fragments._CommunicationService__PlatformResource.initOperations(_CommunicationService__PlatformResource);
			Fragments._CommunicationService__PlatformService.initOperations(_CommunicationService__PlatformService);
			Fragments._CommunicationService__SystemElement.initOperations(_CommunicationService__SystemElement);

			Fragments._ComputationalSystem__ComputationalSystem.initOperations(_ComputationalSystem__ComputationalSystem);
			Fragments._ComputationalSystem__OclAny.initOperations(_ComputationalSystem__OclAny);
			Fragments._ComputationalSystem__OclElement.initOperations(_ComputationalSystem__OclElement);

			Fragments._ConfigurationException__ConfigurationException.initOperations(_ConfigurationException__ConfigurationException);
			Fragments._ConfigurationException__Exception.initOperations(_ConfigurationException__Exception);
			Fragments._ConfigurationException__OclAny.initOperations(_ConfigurationException__OclAny);
			Fragments._ConfigurationException__OclElement.initOperations(_ConfigurationException__OclElement);

			Fragments._DataCenter__DataCenter.initOperations(_DataCenter__DataCenter);
			Fragments._DataCenter__NamedElement.initOperations(_DataCenter__NamedElement);
			Fragments._DataCenter__OclAny.initOperations(_DataCenter__OclAny);
			Fragments._DataCenter__OclElement.initOperations(_DataCenter__OclElement);

			Fragments._DeployableComponent__DeployableComponent.initOperations(_DeployableComponent__DeployableComponent);
			Fragments._DeployableComponent__OclAny.initOperations(_DeployableComponent__OclAny);
			Fragments._DeployableComponent__OclElement.initOperations(_DeployableComponent__OclElement);

			Fragments._DeployableComponentType__DeployableComponentType.initOperations(_DeployableComponentType__DeployableComponentType);
			Fragments._DeployableComponentType__OclAny.initOperations(_DeployableComponentType__OclAny);
			Fragments._DeployableComponentType__OclElement.initOperations(_DeployableComponentType__OclElement);
			Fragments._DeployableComponentType__OclEnumeration.initOperations(_DeployableComponentType__OclEnumeration);
			Fragments._DeployableComponentType__OclType.initOperations(_DeployableComponentType__OclType);

			Fragments._DeploymentConfiguration__DeploymentConfiguration.initOperations(_DeploymentConfiguration__DeploymentConfiguration);
			Fragments._DeploymentConfiguration__OclAny.initOperations(_DeploymentConfiguration__OclAny);
			Fragments._DeploymentConfiguration__OclElement.initOperations(_DeploymentConfiguration__OclElement);

			Fragments._DeploymentConstraints__DeploymentConstraints.initOperations(_DeploymentConstraints__DeploymentConstraints);
			Fragments._DeploymentConstraints__OclAny.initOperations(_DeploymentConstraints__OclAny);
			Fragments._DeploymentConstraints__OclElement.initOperations(_DeploymentConstraints__OclElement);

			Fragments._DeploymentException__DeploymentException.initOperations(_DeploymentException__DeploymentException);
			Fragments._DeploymentException__Exception.initOperations(_DeploymentException__Exception);
			Fragments._DeploymentException__OclAny.initOperations(_DeploymentException__OclAny);
			Fragments._DeploymentException__OclElement.initOperations(_DeploymentException__OclElement);

			Fragments._DeploymentFileDescriptor__DeploymentFileDescriptor.initOperations(_DeploymentFileDescriptor__DeploymentFileDescriptor);
			Fragments._DeploymentFileDescriptor__FileDescriptor.initOperations(_DeploymentFileDescriptor__FileDescriptor);
			Fragments._DeploymentFileDescriptor__OclAny.initOperations(_DeploymentFileDescriptor__OclAny);
			Fragments._DeploymentFileDescriptor__OclElement.initOperations(_DeploymentFileDescriptor__OclElement);

			Fragments._DerivedStreamData__DeployableComponent.initOperations(_DerivedStreamData__DeployableComponent);
			Fragments._DerivedStreamData__DerivedStreamData.initOperations(_DerivedStreamData__DerivedStreamData);
			Fragments._DerivedStreamData__NamedElement.initOperations(_DerivedStreamData__NamedElement);
			Fragments._DerivedStreamData__OclAny.initOperations(_DerivedStreamData__OclAny);
			Fragments._DerivedStreamData__OclElement.initOperations(_DerivedStreamData__OclElement);
			Fragments._DerivedStreamData__StreamData.initOperations(_DerivedStreamData__StreamData);
			Fragments._DerivedStreamData__WorkflowStreamData.initOperations(_DerivedStreamData__WorkflowStreamData);

			Fragments._DistributionService__DeployableComponent.initOperations(_DistributionService__DeployableComponent);
			Fragments._DistributionService__DistributionService.initOperations(_DistributionService__DistributionService);
			Fragments._DistributionService__NamedElement.initOperations(_DistributionService__NamedElement);
			Fragments._DistributionService__OclAny.initOperations(_DistributionService__OclAny);
			Fragments._DistributionService__OclElement.initOperations(_DistributionService__OclElement);
			Fragments._DistributionService__PlatformResource.initOperations(_DistributionService__PlatformResource);
			Fragments._DistributionService__PlatformService.initOperations(_DistributionService__PlatformService);
			Fragments._DistributionService__SystemElement.initOperations(_DistributionService__SystemElement);

			Fragments._Exception__Exception.initOperations(_Exception__Exception);
			Fragments._Exception__OclAny.initOperations(_Exception__OclAny);
			Fragments._Exception__OclElement.initOperations(_Exception__OclElement);

			Fragments._ExporterData__ExporterData.initOperations(_ExporterData__ExporterData);
			Fragments._ExporterData__OclAny.initOperations(_ExporterData__OclAny);
			Fragments._ExporterData__OclElement.initOperations(_ExporterData__OclElement);

			Fragments._FileDescriptor__FileDescriptor.initOperations(_FileDescriptor__FileDescriptor);
			Fragments._FileDescriptor__OclAny.initOperations(_FileDescriptor__OclAny);
			Fragments._FileDescriptor__OclElement.initOperations(_FileDescriptor__OclElement);

			Fragments._FlowStreamData__DeployableComponent.initOperations(_FlowStreamData__DeployableComponent);
			Fragments._FlowStreamData__FlowStreamData.initOperations(_FlowStreamData__FlowStreamData);
			Fragments._FlowStreamData__NamedElement.initOperations(_FlowStreamData__NamedElement);
			Fragments._FlowStreamData__OclAny.initOperations(_FlowStreamData__OclAny);
			Fragments._FlowStreamData__OclElement.initOperations(_FlowStreamData__OclElement);
			Fragments._FlowStreamData__StreamData.initOperations(_FlowStreamData__StreamData);
			Fragments._FlowStreamData__WorkflowStreamData.initOperations(_FlowStreamData__WorkflowStreamData);

			Fragments._KafkaFlowStreamData__DeployableComponent.initOperations(_KafkaFlowStreamData__DeployableComponent);
			Fragments._KafkaFlowStreamData__FlowStreamData.initOperations(_KafkaFlowStreamData__FlowStreamData);
			Fragments._KafkaFlowStreamData__KafkaFlowStreamData.initOperations(_KafkaFlowStreamData__KafkaFlowStreamData);
			Fragments._KafkaFlowStreamData__NamedElement.initOperations(_KafkaFlowStreamData__NamedElement);
			Fragments._KafkaFlowStreamData__OclAny.initOperations(_KafkaFlowStreamData__OclAny);
			Fragments._KafkaFlowStreamData__OclElement.initOperations(_KafkaFlowStreamData__OclElement);
			Fragments._KafkaFlowStreamData__StreamData.initOperations(_KafkaFlowStreamData__StreamData);
			Fragments._KafkaFlowStreamData__WorkflowStreamData.initOperations(_KafkaFlowStreamData__WorkflowStreamData);

			Fragments._KafkaService__CommunicationService.initOperations(_KafkaService__CommunicationService);
			Fragments._KafkaService__DeployableComponent.initOperations(_KafkaService__DeployableComponent);
			Fragments._KafkaService__KafkaService.initOperations(_KafkaService__KafkaService);
			Fragments._KafkaService__NamedElement.initOperations(_KafkaService__NamedElement);
			Fragments._KafkaService__OclAny.initOperations(_KafkaService__OclAny);
			Fragments._KafkaService__OclElement.initOperations(_KafkaService__OclElement);
			Fragments._KafkaService__PlatformResource.initOperations(_KafkaService__PlatformResource);
			Fragments._KafkaService__PlatformService.initOperations(_KafkaService__PlatformService);
			Fragments._KafkaService__SystemElement.initOperations(_KafkaService__SystemElement);

			Fragments._KafkaWorkloadStreamData__DeployableComponent.initOperations(_KafkaWorkloadStreamData__DeployableComponent);
			Fragments._KafkaWorkloadStreamData__KafkaWorkloadStreamData.initOperations(_KafkaWorkloadStreamData__KafkaWorkloadStreamData);
			Fragments._KafkaWorkloadStreamData__NamedElement.initOperations(_KafkaWorkloadStreamData__NamedElement);
			Fragments._KafkaWorkloadStreamData__OclAny.initOperations(_KafkaWorkloadStreamData__OclAny);
			Fragments._KafkaWorkloadStreamData__OclElement.initOperations(_KafkaWorkloadStreamData__OclElement);
			Fragments._KafkaWorkloadStreamData__StreamData.initOperations(_KafkaWorkloadStreamData__StreamData);
			Fragments._KafkaWorkloadStreamData__SystemElement.initOperations(_KafkaWorkloadStreamData__SystemElement);
			Fragments._KafkaWorkloadStreamData__WorkloadStreamData.initOperations(_KafkaWorkloadStreamData__WorkloadStreamData);

			Fragments._KubernetesCluster__KubernetesCluster.initOperations(_KubernetesCluster__KubernetesCluster);
			Fragments._KubernetesCluster__NamedElement.initOperations(_KubernetesCluster__NamedElement);
			Fragments._KubernetesCluster__OclAny.initOperations(_KubernetesCluster__OclAny);
			Fragments._KubernetesCluster__OclElement.initOperations(_KubernetesCluster__OclElement);
			Fragments._KubernetesCluster__OrchestrationCluster.initOperations(_KubernetesCluster__OrchestrationCluster);
			Fragments._KubernetesCluster__PlatformResource.initOperations(_KubernetesCluster__PlatformResource);
			Fragments._KubernetesCluster__ProcessingResourceCluster.initOperations(_KubernetesCluster__ProcessingResourceCluster);
			Fragments._KubernetesCluster__SystemElement.initOperations(_KubernetesCluster__SystemElement);

			Fragments._KubernetesPort__KubernetesPort.initOperations(_KubernetesPort__KubernetesPort);
			Fragments._KubernetesPort__OclAny.initOperations(_KubernetesPort__OclAny);
			Fragments._KubernetesPort__OclElement.initOperations(_KubernetesPort__OclElement);
			Fragments._KubernetesPort__Port.initOperations(_KubernetesPort__Port);

			Fragments._LaunchException__Exception.initOperations(_LaunchException__Exception);
			Fragments._LaunchException__LaunchException.initOperations(_LaunchException__LaunchException);
			Fragments._LaunchException__OclAny.initOperations(_LaunchException__OclAny);
			Fragments._LaunchException__OclElement.initOperations(_LaunchException__OclElement);

			Fragments._MemSQLService__DeployableComponent.initOperations(_MemSQLService__DeployableComponent);
			Fragments._MemSQLService__MemSQLService.initOperations(_MemSQLService__MemSQLService);
			Fragments._MemSQLService__NamedElement.initOperations(_MemSQLService__NamedElement);
			Fragments._MemSQLService__OclAny.initOperations(_MemSQLService__OclAny);
			Fragments._MemSQLService__OclElement.initOperations(_MemSQLService__OclElement);
			Fragments._MemSQLService__PersistenceService.initOperations(_MemSQLService__PersistenceService);
			Fragments._MemSQLService__PlatformResource.initOperations(_MemSQLService__PlatformResource);
			Fragments._MemSQLService__PlatformService.initOperations(_MemSQLService__PlatformService);
			Fragments._MemSQLService__SystemElement.initOperations(_MemSQLService__SystemElement);

			Fragments._Meter__DeployableComponent.initOperations(_Meter__DeployableComponent);
			Fragments._Meter__Meter.initOperations(_Meter__Meter);
			Fragments._Meter__NamedElement.initOperations(_Meter__NamedElement);
			Fragments._Meter__OclAny.initOperations(_Meter__OclAny);
			Fragments._Meter__OclElement.initOperations(_Meter__OclElement);

			Fragments._Metric__Metric.initOperations(_Metric__Metric);
			Fragments._Metric__NamedElement.initOperations(_Metric__NamedElement);
			Fragments._Metric__OclAny.initOperations(_Metric__OclAny);
			Fragments._Metric__OclElement.initOperations(_Metric__OclElement);
			Fragments._Metric__SystemElement.initOperations(_Metric__SystemElement);

			Fragments._MonitoringService__DeployableComponent.initOperations(_MonitoringService__DeployableComponent);
			Fragments._MonitoringService__MonitoringService.initOperations(_MonitoringService__MonitoringService);
			Fragments._MonitoringService__NamedElement.initOperations(_MonitoringService__NamedElement);
			Fragments._MonitoringService__OclAny.initOperations(_MonitoringService__OclAny);
			Fragments._MonitoringService__OclElement.initOperations(_MonitoringService__OclElement);
			Fragments._MonitoringService__PlatformResource.initOperations(_MonitoringService__PlatformResource);
			Fragments._MonitoringService__PlatformService.initOperations(_MonitoringService__PlatformService);
			Fragments._MonitoringService__SystemElement.initOperations(_MonitoringService__SystemElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Neo4JService__DeployableComponent.initOperations(_Neo4JService__DeployableComponent);
			Fragments._Neo4JService__NamedElement.initOperations(_Neo4JService__NamedElement);
			Fragments._Neo4JService__Neo4JService.initOperations(_Neo4JService__Neo4JService);
			Fragments._Neo4JService__OclAny.initOperations(_Neo4JService__OclAny);
			Fragments._Neo4JService__OclElement.initOperations(_Neo4JService__OclElement);
			Fragments._Neo4JService__PersistenceService.initOperations(_Neo4JService__PersistenceService);
			Fragments._Neo4JService__PlatformResource.initOperations(_Neo4JService__PlatformResource);
			Fragments._Neo4JService__PlatformService.initOperations(_Neo4JService__PlatformService);
			Fragments._Neo4JService__SystemElement.initOperations(_Neo4JService__SystemElement);

			Fragments._Network__NamedElement.initOperations(_Network__NamedElement);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);
			Fragments._Network__PlatformResource.initOperations(_Network__PlatformResource);
			Fragments._Network__SystemElement.initOperations(_Network__SystemElement);

			Fragments._NetworkUtilization__Metric.initOperations(_NetworkUtilization__Metric);
			Fragments._NetworkUtilization__NamedElement.initOperations(_NetworkUtilization__NamedElement);
			Fragments._NetworkUtilization__NetworkUtilization.initOperations(_NetworkUtilization__NetworkUtilization);
			Fragments._NetworkUtilization__OclAny.initOperations(_NetworkUtilization__OclAny);
			Fragments._NetworkUtilization__OclElement.initOperations(_NetworkUtilization__OclElement);
			Fragments._NetworkUtilization__SystemElement.initOperations(_NetworkUtilization__SystemElement);

			Fragments._NodeDeploymentConf__DeploymentConfiguration.initOperations(_NodeDeploymentConf__DeploymentConfiguration);
			Fragments._NodeDeploymentConf__NodeDeploymentConf.initOperations(_NodeDeploymentConf__NodeDeploymentConf);
			Fragments._NodeDeploymentConf__OclAny.initOperations(_NodeDeploymentConf__OclAny);
			Fragments._NodeDeploymentConf__OclElement.initOperations(_NodeDeploymentConf__OclElement);
			Fragments._NodeDeploymentConf__PlatformServiceDeploymentConf.initOperations(_NodeDeploymentConf__PlatformServiceDeploymentConf);

			Fragments._NodeHostedMeter__DeployableComponent.initOperations(_NodeHostedMeter__DeployableComponent);
			Fragments._NodeHostedMeter__Meter.initOperations(_NodeHostedMeter__Meter);
			Fragments._NodeHostedMeter__NamedElement.initOperations(_NodeHostedMeter__NamedElement);
			Fragments._NodeHostedMeter__NodeHostedMeter.initOperations(_NodeHostedMeter__NodeHostedMeter);
			Fragments._NodeHostedMeter__OclAny.initOperations(_NodeHostedMeter__OclAny);
			Fragments._NodeHostedMeter__OclElement.initOperations(_NodeHostedMeter__OclElement);
			Fragments._NodeHostedMeter__PrometheusMeter.initOperations(_NodeHostedMeter__PrometheusMeter);

			Fragments._NodeResourceMeter__DeployableComponent.initOperations(_NodeResourceMeter__DeployableComponent);
			Fragments._NodeResourceMeter__Meter.initOperations(_NodeResourceMeter__Meter);
			Fragments._NodeResourceMeter__NamedElement.initOperations(_NodeResourceMeter__NamedElement);
			Fragments._NodeResourceMeter__NodeHostedMeter.initOperations(_NodeResourceMeter__NodeHostedMeter);
			Fragments._NodeResourceMeter__NodeResourceMeter.initOperations(_NodeResourceMeter__NodeResourceMeter);
			Fragments._NodeResourceMeter__OclAny.initOperations(_NodeResourceMeter__OclAny);
			Fragments._NodeResourceMeter__OclElement.initOperations(_NodeResourceMeter__OclElement);
			Fragments._NodeResourceMeter__PrometheusMeter.initOperations(_NodeResourceMeter__PrometheusMeter);

			Fragments._NodeScheduler__DeployableComponent.initOperations(_NodeScheduler__DeployableComponent);
			Fragments._NodeScheduler__NamedElement.initOperations(_NodeScheduler__NamedElement);
			Fragments._NodeScheduler__NodeScheduler.initOperations(_NodeScheduler__NodeScheduler);
			Fragments._NodeScheduler__OclAny.initOperations(_NodeScheduler__OclAny);
			Fragments._NodeScheduler__OclElement.initOperations(_NodeScheduler__OclElement);
			Fragments._NodeScheduler__PlatformResource.initOperations(_NodeScheduler__PlatformResource);
			Fragments._NodeScheduler__PlatformService.initOperations(_NodeScheduler__PlatformService);
			Fragments._NodeScheduler__SchedulingService.initOperations(_NodeScheduler__SchedulingService);
			Fragments._NodeScheduler__SystemElement.initOperations(_NodeScheduler__SystemElement);

			Fragments._OrchestrationCluster__NamedElement.initOperations(_OrchestrationCluster__NamedElement);
			Fragments._OrchestrationCluster__OclAny.initOperations(_OrchestrationCluster__OclAny);
			Fragments._OrchestrationCluster__OclElement.initOperations(_OrchestrationCluster__OclElement);
			Fragments._OrchestrationCluster__OrchestrationCluster.initOperations(_OrchestrationCluster__OrchestrationCluster);
			Fragments._OrchestrationCluster__PlatformResource.initOperations(_OrchestrationCluster__PlatformResource);
			Fragments._OrchestrationCluster__ProcessingResourceCluster.initOperations(_OrchestrationCluster__ProcessingResourceCluster);
			Fragments._OrchestrationCluster__SystemElement.initOperations(_OrchestrationCluster__SystemElement);

			Fragments._OrchestratorDeploymentConf__DeploymentConfiguration.initOperations(_OrchestratorDeploymentConf__DeploymentConfiguration);
			Fragments._OrchestratorDeploymentConf__OclAny.initOperations(_OrchestratorDeploymentConf__OclAny);
			Fragments._OrchestratorDeploymentConf__OclElement.initOperations(_OrchestratorDeploymentConf__OclElement);
			Fragments._OrchestratorDeploymentConf__OrchestratorDeploymentConf.initOperations(_OrchestratorDeploymentConf__OrchestratorDeploymentConf);
			Fragments._OrchestratorDeploymentConf__PlatformServiceDeploymentConf.initOperations(_OrchestratorDeploymentConf__PlatformServiceDeploymentConf);

			Fragments._PersistenceService__DeployableComponent.initOperations(_PersistenceService__DeployableComponent);
			Fragments._PersistenceService__NamedElement.initOperations(_PersistenceService__NamedElement);
			Fragments._PersistenceService__OclAny.initOperations(_PersistenceService__OclAny);
			Fragments._PersistenceService__OclElement.initOperations(_PersistenceService__OclElement);
			Fragments._PersistenceService__PersistenceService.initOperations(_PersistenceService__PersistenceService);
			Fragments._PersistenceService__PlatformResource.initOperations(_PersistenceService__PlatformResource);
			Fragments._PersistenceService__PlatformService.initOperations(_PersistenceService__PlatformService);
			Fragments._PersistenceService__SystemElement.initOperations(_PersistenceService__SystemElement);

			Fragments._PhysicalProcessingNode__NamedElement.initOperations(_PhysicalProcessingNode__NamedElement);
			Fragments._PhysicalProcessingNode__OclAny.initOperations(_PhysicalProcessingNode__OclAny);
			Fragments._PhysicalProcessingNode__OclElement.initOperations(_PhysicalProcessingNode__OclElement);
			Fragments._PhysicalProcessingNode__PhysicalProcessingNode.initOperations(_PhysicalProcessingNode__PhysicalProcessingNode);
			Fragments._PhysicalProcessingNode__PlatformResource.initOperations(_PhysicalProcessingNode__PlatformResource);
			Fragments._PhysicalProcessingNode__ProcessingNode.initOperations(_PhysicalProcessingNode__ProcessingNode);
			Fragments._PhysicalProcessingNode__SystemElement.initOperations(_PhysicalProcessingNode__SystemElement);

			Fragments._PlatformResource__NamedElement.initOperations(_PlatformResource__NamedElement);
			Fragments._PlatformResource__OclAny.initOperations(_PlatformResource__OclAny);
			Fragments._PlatformResource__OclElement.initOperations(_PlatformResource__OclElement);
			Fragments._PlatformResource__PlatformResource.initOperations(_PlatformResource__PlatformResource);
			Fragments._PlatformResource__SystemElement.initOperations(_PlatformResource__SystemElement);

			Fragments._PlatformService__DeployableComponent.initOperations(_PlatformService__DeployableComponent);
			Fragments._PlatformService__NamedElement.initOperations(_PlatformService__NamedElement);
			Fragments._PlatformService__OclAny.initOperations(_PlatformService__OclAny);
			Fragments._PlatformService__OclElement.initOperations(_PlatformService__OclElement);
			Fragments._PlatformService__PlatformResource.initOperations(_PlatformService__PlatformResource);
			Fragments._PlatformService__PlatformService.initOperations(_PlatformService__PlatformService);
			Fragments._PlatformService__SystemElement.initOperations(_PlatformService__SystemElement);

			Fragments._PlatformServiceDeploymentConf__DeploymentConfiguration.initOperations(_PlatformServiceDeploymentConf__DeploymentConfiguration);
			Fragments._PlatformServiceDeploymentConf__OclAny.initOperations(_PlatformServiceDeploymentConf__OclAny);
			Fragments._PlatformServiceDeploymentConf__OclElement.initOperations(_PlatformServiceDeploymentConf__OclElement);
			Fragments._PlatformServiceDeploymentConf__PlatformServiceDeploymentConf.initOperations(_PlatformServiceDeploymentConf__PlatformServiceDeploymentConf);

			Fragments._Port__OclAny.initOperations(_Port__OclAny);
			Fragments._Port__OclElement.initOperations(_Port__OclElement);
			Fragments._Port__Port.initOperations(_Port__Port);

			Fragments._PortMode__OclAny.initOperations(_PortMode__OclAny);
			Fragments._PortMode__OclElement.initOperations(_PortMode__OclElement);
			Fragments._PortMode__OclEnumeration.initOperations(_PortMode__OclEnumeration);
			Fragments._PortMode__OclType.initOperations(_PortMode__OclType);
			Fragments._PortMode__PortMode.initOperations(_PortMode__PortMode);

			Fragments._ProcessingNode__NamedElement.initOperations(_ProcessingNode__NamedElement);
			Fragments._ProcessingNode__OclAny.initOperations(_ProcessingNode__OclAny);
			Fragments._ProcessingNode__OclElement.initOperations(_ProcessingNode__OclElement);
			Fragments._ProcessingNode__PlatformResource.initOperations(_ProcessingNode__PlatformResource);
			Fragments._ProcessingNode__ProcessingNode.initOperations(_ProcessingNode__ProcessingNode);
			Fragments._ProcessingNode__SystemElement.initOperations(_ProcessingNode__SystemElement);

			Fragments._ProcessingNodeCluster__NamedElement.initOperations(_ProcessingNodeCluster__NamedElement);
			Fragments._ProcessingNodeCluster__OclAny.initOperations(_ProcessingNodeCluster__OclAny);
			Fragments._ProcessingNodeCluster__OclElement.initOperations(_ProcessingNodeCluster__OclElement);
			Fragments._ProcessingNodeCluster__PlatformResource.initOperations(_ProcessingNodeCluster__PlatformResource);
			Fragments._ProcessingNodeCluster__ProcessingNodeCluster.initOperations(_ProcessingNodeCluster__ProcessingNodeCluster);
			Fragments._ProcessingNodeCluster__ProcessingResourceCluster.initOperations(_ProcessingNodeCluster__ProcessingResourceCluster);
			Fragments._ProcessingNodeCluster__SystemElement.initOperations(_ProcessingNodeCluster__SystemElement);

			Fragments._ProcessingNodeMemory__Metric.initOperations(_ProcessingNodeMemory__Metric);
			Fragments._ProcessingNodeMemory__NamedElement.initOperations(_ProcessingNodeMemory__NamedElement);
			Fragments._ProcessingNodeMemory__OclAny.initOperations(_ProcessingNodeMemory__OclAny);
			Fragments._ProcessingNodeMemory__OclElement.initOperations(_ProcessingNodeMemory__OclElement);
			Fragments._ProcessingNodeMemory__ProcessingNodeMemory.initOperations(_ProcessingNodeMemory__ProcessingNodeMemory);
			Fragments._ProcessingNodeMemory__SystemElement.initOperations(_ProcessingNodeMemory__SystemElement);

			Fragments._ProcessingNodeUtilization__Metric.initOperations(_ProcessingNodeUtilization__Metric);
			Fragments._ProcessingNodeUtilization__NamedElement.initOperations(_ProcessingNodeUtilization__NamedElement);
			Fragments._ProcessingNodeUtilization__OclAny.initOperations(_ProcessingNodeUtilization__OclAny);
			Fragments._ProcessingNodeUtilization__OclElement.initOperations(_ProcessingNodeUtilization__OclElement);
			Fragments._ProcessingNodeUtilization__ProcessingNodeUtilization.initOperations(_ProcessingNodeUtilization__ProcessingNodeUtilization);
			Fragments._ProcessingNodeUtilization__SystemElement.initOperations(_ProcessingNodeUtilization__SystemElement);

			Fragments._ProcessingResourceCluster__NamedElement.initOperations(_ProcessingResourceCluster__NamedElement);
			Fragments._ProcessingResourceCluster__OclAny.initOperations(_ProcessingResourceCluster__OclAny);
			Fragments._ProcessingResourceCluster__OclElement.initOperations(_ProcessingResourceCluster__OclElement);
			Fragments._ProcessingResourceCluster__PlatformResource.initOperations(_ProcessingResourceCluster__PlatformResource);
			Fragments._ProcessingResourceCluster__ProcessingResourceCluster.initOperations(_ProcessingResourceCluster__ProcessingResourceCluster);
			Fragments._ProcessingResourceCluster__SystemElement.initOperations(_ProcessingResourceCluster__SystemElement);

			Fragments._PrometheusMeter__DeployableComponent.initOperations(_PrometheusMeter__DeployableComponent);
			Fragments._PrometheusMeter__Meter.initOperations(_PrometheusMeter__Meter);
			Fragments._PrometheusMeter__NamedElement.initOperations(_PrometheusMeter__NamedElement);
			Fragments._PrometheusMeter__OclAny.initOperations(_PrometheusMeter__OclAny);
			Fragments._PrometheusMeter__OclElement.initOperations(_PrometheusMeter__OclElement);
			Fragments._PrometheusMeter__PrometheusMeter.initOperations(_PrometheusMeter__PrometheusMeter);

			Fragments._PrometheusService__DeployableComponent.initOperations(_PrometheusService__DeployableComponent);
			Fragments._PrometheusService__MonitoringService.initOperations(_PrometheusService__MonitoringService);
			Fragments._PrometheusService__NamedElement.initOperations(_PrometheusService__NamedElement);
			Fragments._PrometheusService__OclAny.initOperations(_PrometheusService__OclAny);
			Fragments._PrometheusService__OclElement.initOperations(_PrometheusService__OclElement);
			Fragments._PrometheusService__PlatformResource.initOperations(_PrometheusService__PlatformResource);
			Fragments._PrometheusService__PlatformService.initOperations(_PrometheusService__PlatformService);
			Fragments._PrometheusService__PrometheusService.initOperations(_PrometheusService__PrometheusService);
			Fragments._PrometheusService__SystemElement.initOperations(_PrometheusService__SystemElement);

			Fragments._Properties__OclAny.initOperations(_Properties__OclAny);
			Fragments._Properties__Properties.initOperations(_Properties__Properties);

			Fragments._Protocol__OclAny.initOperations(_Protocol__OclAny);
			Fragments._Protocol__OclElement.initOperations(_Protocol__OclElement);
			Fragments._Protocol__OclEnumeration.initOperations(_Protocol__OclEnumeration);
			Fragments._Protocol__OclType.initOperations(_Protocol__OclType);
			Fragments._Protocol__Protocol.initOperations(_Protocol__Protocol);

			Fragments._Rack__NamedElement.initOperations(_Rack__NamedElement);
			Fragments._Rack__OclAny.initOperations(_Rack__OclAny);
			Fragments._Rack__OclElement.initOperations(_Rack__OclElement);
			Fragments._Rack__Rack.initOperations(_Rack__Rack);

			Fragments._SchedulableSet__NamedElement.initOperations(_SchedulableSet__NamedElement);
			Fragments._SchedulableSet__OclAny.initOperations(_SchedulableSet__OclAny);
			Fragments._SchedulableSet__OclElement.initOperations(_SchedulableSet__OclElement);
			Fragments._SchedulableSet__SchedulableSet.initOperations(_SchedulableSet__SchedulableSet);
			Fragments._SchedulableSet__SystemElement.initOperations(_SchedulableSet__SystemElement);

			Fragments._SchedulingService__DeployableComponent.initOperations(_SchedulingService__DeployableComponent);
			Fragments._SchedulingService__NamedElement.initOperations(_SchedulingService__NamedElement);
			Fragments._SchedulingService__OclAny.initOperations(_SchedulingService__OclAny);
			Fragments._SchedulingService__OclElement.initOperations(_SchedulingService__OclElement);
			Fragments._SchedulingService__PlatformResource.initOperations(_SchedulingService__PlatformResource);
			Fragments._SchedulingService__PlatformService.initOperations(_SchedulingService__PlatformService);
			Fragments._SchedulingService__SchedulingService.initOperations(_SchedulingService__SchedulingService);
			Fragments._SchedulingService__SystemElement.initOperations(_SchedulingService__SystemElement);

			Fragments._SecurityService__DeployableComponent.initOperations(_SecurityService__DeployableComponent);
			Fragments._SecurityService__NamedElement.initOperations(_SecurityService__NamedElement);
			Fragments._SecurityService__OclAny.initOperations(_SecurityService__OclAny);
			Fragments._SecurityService__OclElement.initOperations(_SecurityService__OclElement);
			Fragments._SecurityService__PlatformResource.initOperations(_SecurityService__PlatformResource);
			Fragments._SecurityService__PlatformService.initOperations(_SecurityService__PlatformService);
			Fragments._SecurityService__SecurityService.initOperations(_SecurityService__SecurityService);
			Fragments._SecurityService__SystemElement.initOperations(_SecurityService__SystemElement);

			Fragments._SerializationService__DeployableComponent.initOperations(_SerializationService__DeployableComponent);
			Fragments._SerializationService__NamedElement.initOperations(_SerializationService__NamedElement);
			Fragments._SerializationService__OclAny.initOperations(_SerializationService__OclAny);
			Fragments._SerializationService__OclElement.initOperations(_SerializationService__OclElement);
			Fragments._SerializationService__PlatformResource.initOperations(_SerializationService__PlatformResource);
			Fragments._SerializationService__PlatformService.initOperations(_SerializationService__PlatformService);
			Fragments._SerializationService__SerializationService.initOperations(_SerializationService__SerializationService);
			Fragments._SerializationService__SystemElement.initOperations(_SerializationService__SystemElement);

			Fragments._SparkService__DeployableComponent.initOperations(_SparkService__DeployableComponent);
			Fragments._SparkService__NamedElement.initOperations(_SparkService__NamedElement);
			Fragments._SparkService__OclAny.initOperations(_SparkService__OclAny);
			Fragments._SparkService__OclElement.initOperations(_SparkService__OclElement);
			Fragments._SparkService__PlatformResource.initOperations(_SparkService__PlatformResource);
			Fragments._SparkService__PlatformService.initOperations(_SparkService__PlatformService);
			Fragments._SparkService__SchedulingService.initOperations(_SparkService__SchedulingService);
			Fragments._SparkService__SparkService.initOperations(_SparkService__SparkService);
			Fragments._SparkService__SystemElement.initOperations(_SparkService__SystemElement);

			Fragments._StormNimbus__DeployableComponent.initOperations(_StormNimbus__DeployableComponent);
			Fragments._StormNimbus__NamedElement.initOperations(_StormNimbus__NamedElement);
			Fragments._StormNimbus__OclAny.initOperations(_StormNimbus__OclAny);
			Fragments._StormNimbus__OclElement.initOperations(_StormNimbus__OclElement);
			Fragments._StormNimbus__StormNimbus.initOperations(_StormNimbus__StormNimbus);

			Fragments._StormService__DeployableComponent.initOperations(_StormService__DeployableComponent);
			Fragments._StormService__NamedElement.initOperations(_StormService__NamedElement);
			Fragments._StormService__OclAny.initOperations(_StormService__OclAny);
			Fragments._StormService__OclElement.initOperations(_StormService__OclElement);
			Fragments._StormService__PlatformResource.initOperations(_StormService__PlatformResource);
			Fragments._StormService__PlatformService.initOperations(_StormService__PlatformService);
			Fragments._StormService__SchedulingService.initOperations(_StormService__SchedulingService);
			Fragments._StormService__StormService.initOperations(_StormService__StormService);
			Fragments._StormService__SystemElement.initOperations(_StormService__SystemElement);

			Fragments._StormSupervisor__DeployableComponent.initOperations(_StormSupervisor__DeployableComponent);
			Fragments._StormSupervisor__NamedElement.initOperations(_StormSupervisor__NamedElement);
			Fragments._StormSupervisor__OclAny.initOperations(_StormSupervisor__OclAny);
			Fragments._StormSupervisor__OclElement.initOperations(_StormSupervisor__OclElement);
			Fragments._StormSupervisor__StormSupervisor.initOperations(_StormSupervisor__StormSupervisor);

			Fragments._StormUI__DeployableComponent.initOperations(_StormUI__DeployableComponent);
			Fragments._StormUI__NamedElement.initOperations(_StormUI__NamedElement);
			Fragments._StormUI__OclAny.initOperations(_StormUI__OclAny);
			Fragments._StormUI__OclElement.initOperations(_StormUI__OclElement);
			Fragments._StormUI__StormUI.initOperations(_StormUI__StormUI);

			Fragments._StreamData__DeployableComponent.initOperations(_StreamData__DeployableComponent);
			Fragments._StreamData__OclAny.initOperations(_StreamData__OclAny);
			Fragments._StreamData__OclElement.initOperations(_StreamData__OclElement);
			Fragments._StreamData__StreamData.initOperations(_StreamData__StreamData);

			Fragments._StreamDataPartition__OclAny.initOperations(_StreamDataPartition__OclAny);
			Fragments._StreamDataPartition__OclElement.initOperations(_StreamDataPartition__OclElement);
			Fragments._StreamDataPartition__StreamDataPartition.initOperations(_StreamDataPartition__StreamDataPartition);

			Fragments._StreamDataRate__Metric.initOperations(_StreamDataRate__Metric);
			Fragments._StreamDataRate__NamedElement.initOperations(_StreamDataRate__NamedElement);
			Fragments._StreamDataRate__OclAny.initOperations(_StreamDataRate__OclAny);
			Fragments._StreamDataRate__OclElement.initOperations(_StreamDataRate__OclElement);
			Fragments._StreamDataRate__StreamDataRate.initOperations(_StreamDataRate__StreamDataRate);
			Fragments._StreamDataRate__SystemElement.initOperations(_StreamDataRate__SystemElement);

			Fragments._StreamRateMeter__DeployableComponent.initOperations(_StreamRateMeter__DeployableComponent);
			Fragments._StreamRateMeter__Meter.initOperations(_StreamRateMeter__Meter);
			Fragments._StreamRateMeter__NamedElement.initOperations(_StreamRateMeter__NamedElement);
			Fragments._StreamRateMeter__OclAny.initOperations(_StreamRateMeter__OclAny);
			Fragments._StreamRateMeter__OclElement.initOperations(_StreamRateMeter__OclElement);
			Fragments._StreamRateMeter__PrometheusMeter.initOperations(_StreamRateMeter__PrometheusMeter);
			Fragments._StreamRateMeter__StreamRateMeter.initOperations(_StreamRateMeter__StreamRateMeter);

			Fragments._StringToStringMap__OclAny.initOperations(_StringToStringMap__OclAny);
			Fragments._StringToStringMap__OclElement.initOperations(_StringToStringMap__OclElement);
			Fragments._StringToStringMap__StringToStringMap.initOperations(_StringToStringMap__StringToStringMap);

			Fragments._SwarmCluster__NamedElement.initOperations(_SwarmCluster__NamedElement);
			Fragments._SwarmCluster__OclAny.initOperations(_SwarmCluster__OclAny);
			Fragments._SwarmCluster__OclElement.initOperations(_SwarmCluster__OclElement);
			Fragments._SwarmCluster__OrchestrationCluster.initOperations(_SwarmCluster__OrchestrationCluster);
			Fragments._SwarmCluster__PlatformResource.initOperations(_SwarmCluster__PlatformResource);
			Fragments._SwarmCluster__ProcessingResourceCluster.initOperations(_SwarmCluster__ProcessingResourceCluster);
			Fragments._SwarmCluster__SwarmCluster.initOperations(_SwarmCluster__SwarmCluster);
			Fragments._SwarmCluster__SystemElement.initOperations(_SwarmCluster__SystemElement);

			Fragments._SwarmPort__OclAny.initOperations(_SwarmPort__OclAny);
			Fragments._SwarmPort__OclElement.initOperations(_SwarmPort__OclElement);
			Fragments._SwarmPort__Port.initOperations(_SwarmPort__Port);
			Fragments._SwarmPort__SwarmPort.initOperations(_SwarmPort__SwarmPort);

			Fragments._SystemElement__NamedElement.initOperations(_SystemElement__NamedElement);
			Fragments._SystemElement__OclAny.initOperations(_SystemElement__OclAny);
			Fragments._SystemElement__OclElement.initOperations(_SystemElement__OclElement);
			Fragments._SystemElement__SystemElement.initOperations(_SystemElement__SystemElement);

			Fragments._Task__NamedElement.initOperations(_Task__NamedElement);
			Fragments._Task__OclAny.initOperations(_Task__OclAny);
			Fragments._Task__OclElement.initOperations(_Task__OclElement);
			Fragments._Task__Task.initOperations(_Task__Task);

			Fragments._TaskExecutor__DeployableComponent.initOperations(_TaskExecutor__DeployableComponent);
			Fragments._TaskExecutor__NamedElement.initOperations(_TaskExecutor__NamedElement);
			Fragments._TaskExecutor__OclAny.initOperations(_TaskExecutor__OclAny);
			Fragments._TaskExecutor__OclElement.initOperations(_TaskExecutor__OclElement);
			Fragments._TaskExecutor__TaskExecutor.initOperations(_TaskExecutor__TaskExecutor);

			Fragments._TaskProcessingAmount__Metric.initOperations(_TaskProcessingAmount__Metric);
			Fragments._TaskProcessingAmount__NamedElement.initOperations(_TaskProcessingAmount__NamedElement);
			Fragments._TaskProcessingAmount__OclAny.initOperations(_TaskProcessingAmount__OclAny);
			Fragments._TaskProcessingAmount__OclElement.initOperations(_TaskProcessingAmount__OclElement);
			Fragments._TaskProcessingAmount__SystemElement.initOperations(_TaskProcessingAmount__SystemElement);
			Fragments._TaskProcessingAmount__TaskProcessingAmount.initOperations(_TaskProcessingAmount__TaskProcessingAmount);

			Fragments._TaskProcessingAmountMeter__DeployableComponent.initOperations(_TaskProcessingAmountMeter__DeployableComponent);
			Fragments._TaskProcessingAmountMeter__Meter.initOperations(_TaskProcessingAmountMeter__Meter);
			Fragments._TaskProcessingAmountMeter__NamedElement.initOperations(_TaskProcessingAmountMeter__NamedElement);
			Fragments._TaskProcessingAmountMeter__OclAny.initOperations(_TaskProcessingAmountMeter__OclAny);
			Fragments._TaskProcessingAmountMeter__OclElement.initOperations(_TaskProcessingAmountMeter__OclElement);
			Fragments._TaskProcessingAmountMeter__PrometheusMeter.initOperations(_TaskProcessingAmountMeter__PrometheusMeter);
			Fragments._TaskProcessingAmountMeter__TaskProcessingAmountMeter.initOperations(_TaskProcessingAmountMeter__TaskProcessingAmountMeter);

			Fragments._VirtualProcessingNode__NamedElement.initOperations(_VirtualProcessingNode__NamedElement);
			Fragments._VirtualProcessingNode__OclAny.initOperations(_VirtualProcessingNode__OclAny);
			Fragments._VirtualProcessingNode__OclElement.initOperations(_VirtualProcessingNode__OclElement);
			Fragments._VirtualProcessingNode__PlatformResource.initOperations(_VirtualProcessingNode__PlatformResource);
			Fragments._VirtualProcessingNode__ProcessingNode.initOperations(_VirtualProcessingNode__ProcessingNode);
			Fragments._VirtualProcessingNode__SystemElement.initOperations(_VirtualProcessingNode__SystemElement);
			Fragments._VirtualProcessingNode__VirtualProcessingNode.initOperations(_VirtualProcessingNode__VirtualProcessingNode);

			Fragments._Volume__OclAny.initOperations(_Volume__OclAny);
			Fragments._Volume__OclElement.initOperations(_Volume__OclElement);
			Fragments._Volume__Volume.initOperations(_Volume__Volume);

			Fragments._VolumeAccessMode__OclAny.initOperations(_VolumeAccessMode__OclAny);
			Fragments._VolumeAccessMode__OclElement.initOperations(_VolumeAccessMode__OclElement);
			Fragments._VolumeAccessMode__OclEnumeration.initOperations(_VolumeAccessMode__OclEnumeration);
			Fragments._VolumeAccessMode__OclType.initOperations(_VolumeAccessMode__OclType);
			Fragments._VolumeAccessMode__VolumeAccessMode.initOperations(_VolumeAccessMode__VolumeAccessMode);

			Fragments._VolumeType__OclAny.initOperations(_VolumeType__OclAny);
			Fragments._VolumeType__OclElement.initOperations(_VolumeType__OclElement);
			Fragments._VolumeType__OclEnumeration.initOperations(_VolumeType__OclEnumeration);
			Fragments._VolumeType__OclType.initOperations(_VolumeType__OclType);
			Fragments._VolumeType__VolumeType.initOperations(_VolumeType__VolumeType);

			Fragments._Workflow__DeployableComponent.initOperations(_Workflow__DeployableComponent);
			Fragments._Workflow__NamedElement.initOperations(_Workflow__NamedElement);
			Fragments._Workflow__OclAny.initOperations(_Workflow__OclAny);
			Fragments._Workflow__OclElement.initOperations(_Workflow__OclElement);
			Fragments._Workflow__SystemElement.initOperations(_Workflow__SystemElement);
			Fragments._Workflow__Workflow.initOperations(_Workflow__Workflow);

			Fragments._WorkflowLatency__Metric.initOperations(_WorkflowLatency__Metric);
			Fragments._WorkflowLatency__NamedElement.initOperations(_WorkflowLatency__NamedElement);
			Fragments._WorkflowLatency__OclAny.initOperations(_WorkflowLatency__OclAny);
			Fragments._WorkflowLatency__OclElement.initOperations(_WorkflowLatency__OclElement);
			Fragments._WorkflowLatency__SystemElement.initOperations(_WorkflowLatency__SystemElement);
			Fragments._WorkflowLatency__WorkflowLatency.initOperations(_WorkflowLatency__WorkflowLatency);

			Fragments._WorkflowLatencyMeter__DeployableComponent.initOperations(_WorkflowLatencyMeter__DeployableComponent);
			Fragments._WorkflowLatencyMeter__Meter.initOperations(_WorkflowLatencyMeter__Meter);
			Fragments._WorkflowLatencyMeter__NamedElement.initOperations(_WorkflowLatencyMeter__NamedElement);
			Fragments._WorkflowLatencyMeter__OclAny.initOperations(_WorkflowLatencyMeter__OclAny);
			Fragments._WorkflowLatencyMeter__OclElement.initOperations(_WorkflowLatencyMeter__OclElement);
			Fragments._WorkflowLatencyMeter__PrometheusMeter.initOperations(_WorkflowLatencyMeter__PrometheusMeter);
			Fragments._WorkflowLatencyMeter__WorkflowLatencyMeter.initOperations(_WorkflowLatencyMeter__WorkflowLatencyMeter);

			Fragments._WorkflowStreamData__DeployableComponent.initOperations(_WorkflowStreamData__DeployableComponent);
			Fragments._WorkflowStreamData__NamedElement.initOperations(_WorkflowStreamData__NamedElement);
			Fragments._WorkflowStreamData__OclAny.initOperations(_WorkflowStreamData__OclAny);
			Fragments._WorkflowStreamData__OclElement.initOperations(_WorkflowStreamData__OclElement);
			Fragments._WorkflowStreamData__StreamData.initOperations(_WorkflowStreamData__StreamData);
			Fragments._WorkflowStreamData__WorkflowStreamData.initOperations(_WorkflowStreamData__WorkflowStreamData);

			Fragments._WorkloadStreamData__DeployableComponent.initOperations(_WorkloadStreamData__DeployableComponent);
			Fragments._WorkloadStreamData__NamedElement.initOperations(_WorkloadStreamData__NamedElement);
			Fragments._WorkloadStreamData__OclAny.initOperations(_WorkloadStreamData__OclAny);
			Fragments._WorkloadStreamData__OclElement.initOperations(_WorkloadStreamData__OclElement);
			Fragments._WorkloadStreamData__StreamData.initOperations(_WorkloadStreamData__StreamData);
			Fragments._WorkloadStreamData__SystemElement.initOperations(_WorkloadStreamData__SystemElement);
			Fragments._WorkloadStreamData__WorkloadStreamData.initOperations(_WorkloadStreamData__WorkloadStreamData);

			Fragments._ZookeeperService__DeployableComponent.initOperations(_ZookeeperService__DeployableComponent);
			Fragments._ZookeeperService__DistributionService.initOperations(_ZookeeperService__DistributionService);
			Fragments._ZookeeperService__NamedElement.initOperations(_ZookeeperService__NamedElement);
			Fragments._ZookeeperService__OclAny.initOperations(_ZookeeperService__OclAny);
			Fragments._ZookeeperService__OclElement.initOperations(_ZookeeperService__OclElement);
			Fragments._ZookeeperService__PlatformResource.initOperations(_ZookeeperService__PlatformResource);
			Fragments._ZookeeperService__PlatformService.initOperations(_ZookeeperService__PlatformService);
			Fragments._ZookeeperService__SystemElement.initOperations(_ZookeeperService__SystemElement);
			Fragments._ZookeeperService__ZookeeperService.initOperations(_ZookeeperService__ZookeeperService);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AVROService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AWSVirtualProcessingNode = {
			PasysTables.Properties._AWSVirtualProcessingNode__AMI,
			PasysTables.Properties._ProcessingNode__codeFiles,
			PasysTables.Properties._ProcessingNode__concurrencyLevel,
			PasysTables.Properties._ProcessingNode__configData,
			PasysTables.Properties._ProcessingNode__configFiles,
			PasysTables.Properties._ProcessingNode__connectedTo,
			PasysTables.Properties._VirtualProcessingNode__externalIP,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._AWSVirtualProcessingNode__instanceType,
			PasysTables.Properties._ProcessingNode__ip,
			PasysTables.Properties._AWSVirtualProcessingNode__keyPair,
			PasysTables.Properties._ProcessingNode__launchingScripts,
			PasysTables.Properties._ProcessingNode__memorySize,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._ProcessingNode__os,
			PasysTables.Properties._ProcessingNode__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._AWSVirtualProcessingNode__securityGroup,
			PasysTables.Properties._ProcessingNode__speedFactor,
			PasysTables.Properties._AWSVirtualProcessingNode__subNet,
			PasysTables.Properties._ProcessingNode__userName,
			PasysTables.Properties._AWSVirtualProcessingNode__vpc
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArtifactDescriptor = {
			PasysTables.Properties._FileDescriptor__fileName,
			PasysTables.Properties._FileDescriptor__filePath,
			PasysTables.Properties._ArtifactDescriptor__localPath,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CassandraService = {
			PasysTables.Properties._CassandraService__autoBootstrap,
			PasysTables.Properties._CassandraService__cqlSchemas,
			PasysTables.Properties._CassandraService__dataCenters,
			PasysTables.Properties._CassandraService__dataFileDir,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._CassandraService__endpointSnitch,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PersistenceService__logging,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._CassandraService__numTokens,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._PersistenceService__passwd,
			PasysTables.Properties._PersistenceService__port,
			PasysTables.Properties._CassandraService__rpcPort,
			PasysTables.Properties._CassandraService__seedProviderClass,
			PasysTables.Properties._CassandraService__seeds,
			PasysTables.Properties._CassandraService__sslStoragePort,
			PasysTables.Properties._CassandraService__storagePort
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CommunicationMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._CommunicationMeter__metric,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._NodeHostedMeter__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CommunicationService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComputationalSystem = {
			PasysTables.Properties._ComputationalSystem__authenticationFiles,
			PasysTables.Properties._ComputationalSystem__authors,
			PasysTables.Properties._ComputationalSystem__date,
			PasysTables.Properties._ComputationalSystem__doc,
			PasysTables.Properties._ComputationalSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._ComputationalSystem__ownedElements,
			PasysTables.Properties._ComputationalSystem__targetPlatformName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConfigurationException = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataCenter = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._DataCenter__racks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeployableComponent = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeployableComponentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeploymentConfiguration = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeploymentConstraints = {
			PasysTables.Properties._DeploymentConstraints__labels,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._DeploymentConstraints__resources
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeploymentException = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DeploymentFileDescriptor = {
			PasysTables.Properties._DeploymentFileDescriptor__elementType,
			PasysTables.Properties._DeploymentFileDescriptor__fileContent,
			PasysTables.Properties._FileDescriptor__fileName,
			PasysTables.Properties._FileDescriptor__filePath,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._DeploymentFileDescriptor__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DerivedStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._DerivedStreamData__inputs,
			PasysTables.Properties._WorkflowStreamData__isSingleUse,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._WorkflowStreamData__owner,
			PasysTables.Properties._DerivedStreamData__pattern,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DistributionService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Exception = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExporterData = {
			PasysTables.Properties._ExporterData__artifact,
			PasysTables.Properties._ExporterData__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FileDescriptor = {
			PasysTables.Properties._FileDescriptor__fileName,
			PasysTables.Properties._FileDescriptor__filePath,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FlowStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._FlowStreamData__holder,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._FlowStreamData__isImplemented,
			PasysTables.Properties._WorkflowStreamData__isSingleUse,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._WorkflowStreamData__owner,
			PasysTables.Properties._FlowStreamData__predecessor,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile,
			PasysTables.Properties._FlowStreamData__source
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KafkaFlowStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._FlowStreamData__holder,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._FlowStreamData__isImplemented,
			PasysTables.Properties._WorkflowStreamData__isSingleUse,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._WorkflowStreamData__owner,
			PasysTables.Properties._FlowStreamData__predecessor,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile,
			PasysTables.Properties._FlowStreamData__source
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KafkaService = {
			PasysTables.Properties._KafkaService__advertisedListeners,
			PasysTables.Properties._KafkaService__autoCreateTopicEnable,
			PasysTables.Properties._KafkaService__clientPort,
			PasysTables.Properties._KafkaService__commId,
			PasysTables.Properties._KafkaService__deleteTopicEnable,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._KafkaService__listeners,
			PasysTables.Properties._KafkaService__logFlushInterval,
			PasysTables.Properties._KafkaService__logFlushIntervalMessages,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._KafkaService__numIOThreads,
			PasysTables.Properties._KafkaService__numNetworkThreads,
			PasysTables.Properties._KafkaService__numPartitions,
			PasysTables.Properties._KafkaService__numRecoveryThreadsPerDataDir,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._KafkaService__socketReceiveBufferBytes,
			PasysTables.Properties._KafkaService__socketRequestMaxBytes,
			PasysTables.Properties._KafkaService__socketSendBufferBytes,
			PasysTables.Properties._KafkaService__zookeeperConnect,
			PasysTables.Properties._KafkaService__zookeeperConnectionTimeout
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KafkaWorkloadStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._WorkloadStreamData__holder,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KubernetesCluster = {
			PasysTables.Properties._KubernetesCluster__apiVersion,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KubernetesPort = {
			PasysTables.Properties._KubernetesPort__internal,
			PasysTables.Properties._KubernetesPort__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._Port__published,
			PasysTables.Properties._Port__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LaunchException = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MemSQLService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PersistenceService__logging,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._PersistenceService__passwd,
			PasysTables.Properties._PersistenceService__port
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Meter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Metric = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MonitoringService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._MonitoringService__monitorizedMeters,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Neo4JService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PersistenceService__logging,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._PersistenceService__passwd,
			PasysTables.Properties._PersistenceService__port
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Network = {
			PasysTables.Properties._Network__bandwith,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NetworkUtilization = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NetworkUtilization__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._NetworkUtilization__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeDeploymentConf = {
			PasysTables.Properties._NodeDeploymentConf__arguments,
			PasysTables.Properties._NodeDeploymentConf__artifactLocator,
			PasysTables.Properties._NodeDeploymentConf__artifactName,
			PasysTables.Properties._NodeDeploymentConf__codeFolderPath,
			PasysTables.Properties._NodeDeploymentConf__configFolderPath,
			PasysTables.Properties._NodeDeploymentConf__dataFolderPath,
			PasysTables.Properties._NodeDeploymentConf__isRunning,
			PasysTables.Properties._NodeDeploymentConf__logFolderPath,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._NodeDeploymentConf__scriptFolderPath
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeHostedMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._NodeHostedMeter__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeResourceMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NodeResourceMeter__mMetric,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._NodeHostedMeter__owner,
			PasysTables.Properties._NodeResourceMeter__uMetric
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeScheduler = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._SchedulingService__workflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrchestrationCluster = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrchestratorDeploymentConf = {
			PasysTables.Properties._OrchestratorDeploymentConf__args,
			PasysTables.Properties._OrchestratorDeploymentConf__command,
			PasysTables.Properties._OrchestratorDeploymentConf__constraints,
			PasysTables.Properties._OrchestratorDeploymentConf__env,
			PasysTables.Properties._OrchestratorDeploymentConf__image,
			PasysTables.Properties._OrchestratorDeploymentConf__imagePullPolicy,
			PasysTables.Properties._OrchestratorDeploymentConf__imageTag,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._OrchestratorDeploymentConf__ports,
			PasysTables.Properties._OrchestratorDeploymentConf__replicas,
			PasysTables.Properties._OrchestratorDeploymentConf__restartPolicy,
			PasysTables.Properties._OrchestratorDeploymentConf__volumes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PersistenceService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PersistenceService__logging,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._PersistenceService__passwd,
			PasysTables.Properties._PersistenceService__port
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PhysicalProcessingNode = {
			PasysTables.Properties._ProcessingNode__codeFiles,
			PasysTables.Properties._ProcessingNode__concurrencyLevel,
			PasysTables.Properties._ProcessingNode__configData,
			PasysTables.Properties._ProcessingNode__configFiles,
			PasysTables.Properties._ProcessingNode__connectedTo,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ProcessingNode__ip,
			PasysTables.Properties._ProcessingNode__launchingScripts,
			PasysTables.Properties._ProcessingNode__memorySize,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._ProcessingNode__os,
			PasysTables.Properties._ProcessingNode__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ProcessingNode__speedFactor,
			PasysTables.Properties._ProcessingNode__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PlatformResource = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PlatformService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PlatformServiceDeploymentConf = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Port = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._Port__published,
			PasysTables.Properties._Port__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PortMode = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingNode = {
			PasysTables.Properties._ProcessingNode__codeFiles,
			PasysTables.Properties._ProcessingNode__concurrencyLevel,
			PasysTables.Properties._ProcessingNode__configData,
			PasysTables.Properties._ProcessingNode__configFiles,
			PasysTables.Properties._ProcessingNode__connectedTo,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ProcessingNode__ip,
			PasysTables.Properties._ProcessingNode__launchingScripts,
			PasysTables.Properties._ProcessingNode__memorySize,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._ProcessingNode__os,
			PasysTables.Properties._ProcessingNode__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ProcessingNode__speedFactor,
			PasysTables.Properties._ProcessingNode__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingNodeCluster = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._ProcessingNodeCluster__nodes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingNodeMemory = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ProcessingNodeMemory__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ProcessingNodeMemory__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingNodeUtilization = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ProcessingNodeUtilization__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ProcessingNodeUtilization__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingResourceCluster = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrometheusMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrometheusService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PrometheusService__exportersData,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._MonitoringService__monitorizedMeters,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Properties = {};

		private static final ExecutorProperty /*@NonNull*/ [] _Protocol = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Rack = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._Rack__nodes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SchedulableSet = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._SchedulableSet__workflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SchedulingService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._SchedulingService__workflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SecurityService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SerializationService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SparkService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._SparkService__driverCores,
			PasysTables.Properties._SparkService__driverMaxResultSize,
			PasysTables.Properties._SparkService__driverMemory,
			PasysTables.Properties._SparkService__driverSuperviser,
			PasysTables.Properties._SparkService__executorMemory,
			PasysTables.Properties._SparkService__extraListener,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._SparkService__load,
			PasysTables.Properties._SparkService__localDir,
			PasysTables.Properties._SparkService__logCallerContext,
			PasysTables.Properties._SparkService__logConf,
			PasysTables.Properties._SparkService__master,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._SparkService__submitDeployMode,
			PasysTables.Properties._SparkService__windowSize,
			PasysTables.Properties._SchedulingService__workflows
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StormNimbus = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._StormNimbus__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StormNimbus__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StormService = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._StormService__localDir,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StormService__nimbus,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._StormService__supervisor,
			PasysTables.Properties._StormService__ui,
			PasysTables.Properties._SchedulingService__workflows,
			PasysTables.Properties._StormService__zookeeperConnect
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StormSupervisor = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._StormSupervisor__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StormSupervisor__owner,
			PasysTables.Properties._StormSupervisor__supervisorSlotPorts
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StormUI = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._StormUI__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StormUI__owner,
			PasysTables.Properties._StormUI__uiPort
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StreamDataPartition = {
			PasysTables.Properties._StreamDataPartition__host,
			PasysTables.Properties._StreamDataPartition__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StreamDataRate = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._StreamDataRate__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._StreamDataRate__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StreamRateMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._StreamRateMeter__metric,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamRateMeter__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringToStringMap = {
			PasysTables.Properties._StringToStringMap__key,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StringToStringMap__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SwarmCluster = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SwarmPort = {
			PasysTables.Properties._SwarmPort__mode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SwarmPort__protocol,
			PasysTables.Properties._Port__published,
			PasysTables.Properties._Port__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SystemElement = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Task = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._Task__implementingClassName,
			PasysTables.Properties._Task__inputStreamData,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._Task__owner,
			PasysTables.Properties._Task__returnedStreamData,
			PasysTables.Properties._Task__triggerStreamData
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TaskExecutor = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._TaskExecutor__executedTasks,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._TaskExecutor__ownedMeters,
			PasysTables.Properties._TaskExecutor__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TaskProcessingAmount = {
			PasysTables.Properties._TaskProcessingAmount__expectedMaxTPA,
			PasysTables.Properties._TaskProcessingAmount__expectedMinTPA,
			PasysTables.Properties._TaskProcessingAmount__histogramBuckectNum,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._TaskProcessingAmount__linearBucketDistribution,
			PasysTables.Properties._TaskProcessingAmount__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._TaskProcessingAmount__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TaskProcessingAmountMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._TaskProcessingAmountMeter__metric,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._TaskProcessingAmountMeter__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VirtualProcessingNode = {
			PasysTables.Properties._ProcessingNode__codeFiles,
			PasysTables.Properties._ProcessingNode__concurrencyLevel,
			PasysTables.Properties._ProcessingNode__configData,
			PasysTables.Properties._ProcessingNode__configFiles,
			PasysTables.Properties._ProcessingNode__connectedTo,
			PasysTables.Properties._VirtualProcessingNode__externalIP,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ProcessingNode__ip,
			PasysTables.Properties._ProcessingNode__launchingScripts,
			PasysTables.Properties._ProcessingNode__memorySize,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._ProcessingNode__os,
			PasysTables.Properties._ProcessingNode__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ProcessingNode__speedFactor,
			PasysTables.Properties._ProcessingNode__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Volume = {
			PasysTables.Properties._Volume__accessMode,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._Volume__source,
			PasysTables.Properties._Volume__target,
			PasysTables.Properties._Volume__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VolumeAccessMode = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VolumeType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Workflow = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._Workflow__ownedMeters,
			PasysTables.Properties._Workflow__ownedStreamData,
			PasysTables.Properties._Workflow__ownedTaskExecutors,
			PasysTables.Properties._Workflow__ownedTasks,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._Workflow__rootTask,
			PasysTables.Properties._Workflow__scheduler
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkflowLatency = {
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._WorkflowLatency__meter,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._WorkflowLatency__target
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkflowLatencyMeter = {
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._WorkflowLatencyMeter__metric,
			PasysTables.Properties._PrometheusMeter__monitoringPort,
			PasysTables.Properties._Meter__monitoringServer,
			PasysTables.Properties._PrometheusMeter__monitoringTime,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._WorkflowLatencyMeter__owner
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkflowStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._WorkflowStreamData__isSingleUse,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._WorkflowStreamData__owner,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkloadStreamData = {
			PasysTables.Properties._StreamData__assignedPartition,
			PasysTables.Properties._StreamData__cleanupPolicy,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._WorkloadStreamData__holder,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._StreamData__messageSize,
			PasysTables.Properties._NamedElement__name,
			PasysTables.Properties._StreamData__numPartitions,
			PasysTables.Properties._StreamData__numReplication,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._StreamData__ownedMeters,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._StreamData__retention_bytes,
			PasysTables.Properties._StreamData__retention_ms,
			PasysTables.Properties._StreamData__schemaFile
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ZookeeperService = {
			PasysTables.Properties._ZookeeperService__clientPort,
			PasysTables.Properties._DeployableComponent__deploymentConfig,
			PasysTables.Properties._PlatformService__host,
			PasysTables.Properties._NamedElement__id,
			PasysTables.Properties._ZookeeperService__initLimit,
			PasysTables.Properties._ZookeeperService__leaderPort,
			PasysTables.Properties._ZookeeperService__leaderServers,
			PasysTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PasysTables.Properties._SystemElement__owner,
			PasysTables.Properties._ZookeeperService__peerPort,
			PasysTables.Properties._ZookeeperService__serverId,
			PasysTables.Properties._ZookeeperService__syncLimit,
			PasysTables.Properties._ZookeeperService__tickTime
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AVROService__AVROService.initProperties(_AVROService);
			Fragments._AWSVirtualProcessingNode__AWSVirtualProcessingNode.initProperties(_AWSVirtualProcessingNode);
			Fragments._ArtifactDescriptor__ArtifactDescriptor.initProperties(_ArtifactDescriptor);
			Fragments._CassandraService__CassandraService.initProperties(_CassandraService);
			Fragments._CommunicationMeter__CommunicationMeter.initProperties(_CommunicationMeter);
			Fragments._CommunicationService__CommunicationService.initProperties(_CommunicationService);
			Fragments._ComputationalSystem__ComputationalSystem.initProperties(_ComputationalSystem);
			Fragments._ConfigurationException__ConfigurationException.initProperties(_ConfigurationException);
			Fragments._DataCenter__DataCenter.initProperties(_DataCenter);
			Fragments._DeployableComponent__DeployableComponent.initProperties(_DeployableComponent);
			Fragments._DeployableComponentType__DeployableComponentType.initProperties(_DeployableComponentType);
			Fragments._DeploymentConfiguration__DeploymentConfiguration.initProperties(_DeploymentConfiguration);
			Fragments._DeploymentConstraints__DeploymentConstraints.initProperties(_DeploymentConstraints);
			Fragments._DeploymentException__DeploymentException.initProperties(_DeploymentException);
			Fragments._DeploymentFileDescriptor__DeploymentFileDescriptor.initProperties(_DeploymentFileDescriptor);
			Fragments._DerivedStreamData__DerivedStreamData.initProperties(_DerivedStreamData);
			Fragments._DistributionService__DistributionService.initProperties(_DistributionService);
			Fragments._Exception__Exception.initProperties(_Exception);
			Fragments._ExporterData__ExporterData.initProperties(_ExporterData);
			Fragments._FileDescriptor__FileDescriptor.initProperties(_FileDescriptor);
			Fragments._FlowStreamData__FlowStreamData.initProperties(_FlowStreamData);
			Fragments._KafkaFlowStreamData__KafkaFlowStreamData.initProperties(_KafkaFlowStreamData);
			Fragments._KafkaService__KafkaService.initProperties(_KafkaService);
			Fragments._KafkaWorkloadStreamData__KafkaWorkloadStreamData.initProperties(_KafkaWorkloadStreamData);
			Fragments._KubernetesCluster__KubernetesCluster.initProperties(_KubernetesCluster);
			Fragments._KubernetesPort__KubernetesPort.initProperties(_KubernetesPort);
			Fragments._LaunchException__LaunchException.initProperties(_LaunchException);
			Fragments._MemSQLService__MemSQLService.initProperties(_MemSQLService);
			Fragments._Meter__Meter.initProperties(_Meter);
			Fragments._Metric__Metric.initProperties(_Metric);
			Fragments._MonitoringService__MonitoringService.initProperties(_MonitoringService);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Neo4JService__Neo4JService.initProperties(_Neo4JService);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._NetworkUtilization__NetworkUtilization.initProperties(_NetworkUtilization);
			Fragments._NodeDeploymentConf__NodeDeploymentConf.initProperties(_NodeDeploymentConf);
			Fragments._NodeHostedMeter__NodeHostedMeter.initProperties(_NodeHostedMeter);
			Fragments._NodeResourceMeter__NodeResourceMeter.initProperties(_NodeResourceMeter);
			Fragments._NodeScheduler__NodeScheduler.initProperties(_NodeScheduler);
			Fragments._OrchestrationCluster__OrchestrationCluster.initProperties(_OrchestrationCluster);
			Fragments._OrchestratorDeploymentConf__OrchestratorDeploymentConf.initProperties(_OrchestratorDeploymentConf);
			Fragments._PersistenceService__PersistenceService.initProperties(_PersistenceService);
			Fragments._PhysicalProcessingNode__PhysicalProcessingNode.initProperties(_PhysicalProcessingNode);
			Fragments._PlatformResource__PlatformResource.initProperties(_PlatformResource);
			Fragments._PlatformService__PlatformService.initProperties(_PlatformService);
			Fragments._PlatformServiceDeploymentConf__PlatformServiceDeploymentConf.initProperties(_PlatformServiceDeploymentConf);
			Fragments._Port__Port.initProperties(_Port);
			Fragments._PortMode__PortMode.initProperties(_PortMode);
			Fragments._ProcessingNode__ProcessingNode.initProperties(_ProcessingNode);
			Fragments._ProcessingNodeCluster__ProcessingNodeCluster.initProperties(_ProcessingNodeCluster);
			Fragments._ProcessingNodeMemory__ProcessingNodeMemory.initProperties(_ProcessingNodeMemory);
			Fragments._ProcessingNodeUtilization__ProcessingNodeUtilization.initProperties(_ProcessingNodeUtilization);
			Fragments._ProcessingResourceCluster__ProcessingResourceCluster.initProperties(_ProcessingResourceCluster);
			Fragments._PrometheusMeter__PrometheusMeter.initProperties(_PrometheusMeter);
			Fragments._PrometheusService__PrometheusService.initProperties(_PrometheusService);
			Fragments._Properties__Properties.initProperties(_Properties);
			Fragments._Protocol__Protocol.initProperties(_Protocol);
			Fragments._Rack__Rack.initProperties(_Rack);
			Fragments._SchedulableSet__SchedulableSet.initProperties(_SchedulableSet);
			Fragments._SchedulingService__SchedulingService.initProperties(_SchedulingService);
			Fragments._SecurityService__SecurityService.initProperties(_SecurityService);
			Fragments._SerializationService__SerializationService.initProperties(_SerializationService);
			Fragments._SparkService__SparkService.initProperties(_SparkService);
			Fragments._StormNimbus__StormNimbus.initProperties(_StormNimbus);
			Fragments._StormService__StormService.initProperties(_StormService);
			Fragments._StormSupervisor__StormSupervisor.initProperties(_StormSupervisor);
			Fragments._StormUI__StormUI.initProperties(_StormUI);
			Fragments._StreamData__StreamData.initProperties(_StreamData);
			Fragments._StreamDataPartition__StreamDataPartition.initProperties(_StreamDataPartition);
			Fragments._StreamDataRate__StreamDataRate.initProperties(_StreamDataRate);
			Fragments._StreamRateMeter__StreamRateMeter.initProperties(_StreamRateMeter);
			Fragments._StringToStringMap__StringToStringMap.initProperties(_StringToStringMap);
			Fragments._SwarmCluster__SwarmCluster.initProperties(_SwarmCluster);
			Fragments._SwarmPort__SwarmPort.initProperties(_SwarmPort);
			Fragments._SystemElement__SystemElement.initProperties(_SystemElement);
			Fragments._Task__Task.initProperties(_Task);
			Fragments._TaskExecutor__TaskExecutor.initProperties(_TaskExecutor);
			Fragments._TaskProcessingAmount__TaskProcessingAmount.initProperties(_TaskProcessingAmount);
			Fragments._TaskProcessingAmountMeter__TaskProcessingAmountMeter.initProperties(_TaskProcessingAmountMeter);
			Fragments._VirtualProcessingNode__VirtualProcessingNode.initProperties(_VirtualProcessingNode);
			Fragments._Volume__Volume.initProperties(_Volume);
			Fragments._VolumeAccessMode__VolumeAccessMode.initProperties(_VolumeAccessMode);
			Fragments._VolumeType__VolumeType.initProperties(_VolumeType);
			Fragments._Workflow__Workflow.initProperties(_Workflow);
			Fragments._WorkflowLatency__WorkflowLatency.initProperties(_WorkflowLatency);
			Fragments._WorkflowLatencyMeter__WorkflowLatencyMeter.initProperties(_WorkflowLatencyMeter);
			Fragments._WorkflowStreamData__WorkflowStreamData.initProperties(_WorkflowStreamData);
			Fragments._WorkloadStreamData__WorkloadStreamData.initProperties(_WorkloadStreamData);
			Fragments._ZookeeperService__ZookeeperService.initProperties(_ZookeeperService);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__PROMETHEUS_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("PROMETHEUS_SERVICE"), Types._DeployableComponentType, 0);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__ZOOKEEPER_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("ZOOKEEPER_SERVICE"), Types._DeployableComponentType, 1);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__KAFKA_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("KAFKA_SERVICE"), Types._DeployableComponentType, 2);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__CASSANDRA_SERVICE_SEED = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("CASSANDRA_SERVICE_SEED"), Types._DeployableComponentType, 3);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__CASSANDRA_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("CASSANDRA_SERVICE"), Types._DeployableComponentType, 4);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__STORM_NIMBUS = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("STORM_NIMBUS"), Types._DeployableComponentType, 5);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__STORM_SUPERVISOR = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("STORM_SUPERVISOR"), Types._DeployableComponentType, 6);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__STORM_UI = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("STORM_UI"), Types._DeployableComponentType, 7);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__SPARK_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("SPARK_SERVICE"), Types._DeployableComponentType, 8);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__KAFKA_WORKLOAD_STREAM = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("KAFKA_WORKLOAD_STREAM"), Types._DeployableComponentType, 9);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__KAFKA_FLOW_STREAM = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("KAFKA_FLOW_STREAM"), Types._DeployableComponentType, 10);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__AVRO_SERVICE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("AVRO_SERVICE"), Types._DeployableComponentType, 11);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__NODE_RESOURCE_METER = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("NODE_RESOURCE_METER"), Types._DeployableComponentType, 12);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__TASK_EXECUTOR = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("TASK_EXECUTOR"), Types._DeployableComponentType, 13);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__TASK_AMOUNT_METER = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("TASK_AMOUNT_METER"), Types._DeployableComponentType, 14);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__DOCKER_STACK = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("DOCKER_STACK"), Types._DeployableComponentType, 15);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__CASSANDRA_SCHEMA = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("CASSANDRA_SCHEMA"), Types._DeployableComponentType, 16);
		public static final EcoreExecutorEnumerationLiteral _DeployableComponentType__WORKFLOW = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.DEPLOYABLE_COMPONENT_TYPE.getEEnumLiteral("WORKFLOW"), Types._DeployableComponentType, 17);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DeployableComponentType = {
			_DeployableComponentType__PROMETHEUS_SERVICE,
			_DeployableComponentType__ZOOKEEPER_SERVICE,
			_DeployableComponentType__KAFKA_SERVICE,
			_DeployableComponentType__CASSANDRA_SERVICE_SEED,
			_DeployableComponentType__CASSANDRA_SERVICE,
			_DeployableComponentType__STORM_NIMBUS,
			_DeployableComponentType__STORM_SUPERVISOR,
			_DeployableComponentType__STORM_UI,
			_DeployableComponentType__SPARK_SERVICE,
			_DeployableComponentType__KAFKA_WORKLOAD_STREAM,
			_DeployableComponentType__KAFKA_FLOW_STREAM,
			_DeployableComponentType__AVRO_SERVICE,
			_DeployableComponentType__NODE_RESOURCE_METER,
			_DeployableComponentType__TASK_EXECUTOR,
			_DeployableComponentType__TASK_AMOUNT_METER,
			_DeployableComponentType__DOCKER_STACK,
			_DeployableComponentType__CASSANDRA_SCHEMA,
			_DeployableComponentType__WORKFLOW
		};

		public static final EcoreExecutorEnumerationLiteral _PortMode__HOST = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.PORT_MODE.getEEnumLiteral("HOST"), Types._PortMode, 0);
		public static final EcoreExecutorEnumerationLiteral _PortMode__INGRESS = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.PORT_MODE.getEEnumLiteral("INGRESS"), Types._PortMode, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PortMode = {
			_PortMode__HOST,
			_PortMode__INGRESS
		};

		public static final EcoreExecutorEnumerationLiteral _Protocol__TCP = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.PROTOCOL.getEEnumLiteral("TCP"), Types._Protocol, 0);
		public static final EcoreExecutorEnumerationLiteral _Protocol__UDP = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.PROTOCOL.getEEnumLiteral("UDP"), Types._Protocol, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Protocol = {
			_Protocol__TCP,
			_Protocol__UDP
		};

		public static final EcoreExecutorEnumerationLiteral _VolumeAccessMode__READWRITEONCE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_ACCESS_MODE.getEEnumLiteral("READWRITEONCE"), Types._VolumeAccessMode, 0);
		public static final EcoreExecutorEnumerationLiteral _VolumeAccessMode__READONLYMANY = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_ACCESS_MODE.getEEnumLiteral("READONLYMANY"), Types._VolumeAccessMode, 1);
		public static final EcoreExecutorEnumerationLiteral _VolumeAccessMode__READWRITEMANY = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_ACCESS_MODE.getEEnumLiteral("READWRITEMANY"), Types._VolumeAccessMode, 2);
		public static final EcoreExecutorEnumerationLiteral _VolumeAccessMode__READWRITEONCEPOD = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_ACCESS_MODE.getEEnumLiteral("READWRITEONCEPOD"), Types._VolumeAccessMode, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VolumeAccessMode = {
			_VolumeAccessMode__READWRITEONCE,
			_VolumeAccessMode__READONLYMANY,
			_VolumeAccessMode__READWRITEMANY,
			_VolumeAccessMode__READWRITEONCEPOD
		};

		public static final EcoreExecutorEnumerationLiteral _VolumeType__VOLUME = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_TYPE.getEEnumLiteral("VOLUME"), Types._VolumeType, 0);
		public static final EcoreExecutorEnumerationLiteral _VolumeType__BIND = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_TYPE.getEEnumLiteral("BIND"), Types._VolumeType, 1);
		public static final EcoreExecutorEnumerationLiteral _VolumeType__TMPFS = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_TYPE.getEEnumLiteral("TMPFS"), Types._VolumeType, 2);
		public static final EcoreExecutorEnumerationLiteral _VolumeType__NPIPE = new EcoreExecutorEnumerationLiteral(PasysPackage.Literals.VOLUME_TYPE.getEEnumLiteral("NPIPE"), Types._VolumeType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VolumeType = {
			_VolumeType__VOLUME,
			_VolumeType__BIND,
			_VolumeType__TMPFS,
			_VolumeType__NPIPE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DeployableComponentType.initLiterals(_DeployableComponentType);
			Types._PortMode.initLiterals(_PortMode);
			Types._Protocol.initLiterals(_Protocol);
			Types._VolumeAccessMode.initLiterals(_VolumeAccessMode);
			Types._VolumeType.initLiterals(_VolumeType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PasysTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new PasysTables();
	}

	private PasysTables() {
		super(PasysPackage.eNS_URI);
	}
}
