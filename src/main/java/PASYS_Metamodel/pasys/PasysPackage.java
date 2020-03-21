/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysFactory
 * @model kind="package"
 * @generated
 */
public interface PasysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pasys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.unican.es/ISTR/P3forI4/pasys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pasys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PasysPackage eINSTANCE = PASYS_Metamodel.pasys.impl.PasysPackageImpl.init();

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ComputationalSystemImpl <em>Computational System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ComputationalSystemImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getComputationalSystem()
	 * @generated
	 */
	int COMPUTATIONAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__DATE = 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__AUTHORS = 2;

	/**
	 * The feature id for the '<em><b>Target Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME = 3;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__DOC = 4;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Referenced Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__REFERENCED_SYSTEMS = 6;

	/**
	 * The feature id for the '<em><b>Authentication Files</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES = 7;

	/**
	 * The number of structural features of the '<em>Computational System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH = 0;

	/**
	 * The number of operations of the '<em>Computational System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NamedElementImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SystemElementImpl <em>System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SystemElementImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemElement()
	 * @generated
	 */
	int SYSTEM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SystemExternalElementImpl <em>System External Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SystemExternalElementImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemExternalElement()
	 * @generated
	 */
	int SYSTEM_EXTERNAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT__ELEMENT_TYPE = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTERNAL_ELEMENT_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl <em>System Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SystemAdapterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemAdapter()
	 * @generated
	 */
	int SYSTEM_ADAPTER = 4;

	/**
	 * The feature id for the '<em><b>Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER__ID_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Elem Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER__ELEM_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>System Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER__SYSTEM_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Target Sys Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER__TARGET_SYS_LOCATOR = 4;

	/**
	 * The number of structural features of the '<em>System Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl <em>System Element Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemElementAdapter()
	 * @generated
	 */
	int SYSTEM_ELEMENT_ADAPTER = 5;

	/**
	 * The feature id for the '<em><b>Elem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_ADAPTER__ELEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Elem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID = 1;

	/**
	 * The feature id for the '<em><b>Target Elem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID = 2;

	/**
	 * The number of structural features of the '<em>System Element Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_ADAPTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Element Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_ADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PlatformResourceImpl <em>Platform Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PlatformResourceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformResource()
	 * @generated
	 */
	int PLATFORM_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Platform Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl <em>Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNode()
	 * @generated
	 */
	int PROCESSING_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONCURRENCY_LEVEL = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__MEMORY_SIZE = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__SPEED_FACTOR = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONNECTED_TO = PLATFORM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__PROPERTY_CONFIG_DATA = PLATFORM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__LAUNCHING_SCRIPTS = PLATFORM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONFIG_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CODE_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OWNED_METERS = PLATFORM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__IP = PLATFORM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__USER_NAME = PLATFORM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___DEPLOY_AND_LAUNCH = PLATFORM_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___BRING_BACK_CONFIGURATION = PLATFORM_RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ABORT_LAUNCHING = PLATFORM_RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PhysicalProcessingNodeImpl <em>Physical Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PhysicalProcessingNodeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPhysicalProcessingNode()
	 * @generated
	 */
	int PHYSICAL_PROCESSING_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__NAME = PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__ID = PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OWNER = PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONCURRENCY_LEVEL = PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__MEMORY_SIZE = PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__SPEED_FACTOR = PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONFIG_FILES = PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CODE_FILES = PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OWNED_METERS = PROCESSING_NODE__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OS = PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE_FEATURE_COUNT = PROCESSING_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ABORT_LAUNCHING = PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The number of operations of the '<em>Physical Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE_OPERATION_COUNT = PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.VirtualProcessingNodeImpl <em>Virtual Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.VirtualProcessingNodeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVirtualProcessingNode()
	 * @generated
	 */
	int VIRTUAL_PROCESSING_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__NAME = PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__ID = PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OWNER = PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL = PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__MEMORY_SIZE = PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__SPEED_FACTOR = PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONFIG_FILES = PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CODE_FILES = PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OWNED_METERS = PROCESSING_NODE__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE_FEATURE_COUNT = PROCESSING_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING = PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The number of operations of the '<em>Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE_OPERATION_COUNT = PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl <em>AWS Virtual Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAWSVirtualProcessingNode()
	 * @generated
	 */
	int AWS_VIRTUAL_PROCESSING_NODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__NAME = VIRTUAL_PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__ID = VIRTUAL_PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OWNER = VIRTUAL_PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL = VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__MEMORY_SIZE = VIRTUAL_PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SPEED_FACTOR = VIRTUAL_PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONNECTED_TO = VIRTUAL_PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONFIG_FILES = VIRTUAL_PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CODE_FILES = VIRTUAL_PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OWNED_METERS = VIRTUAL_PROCESSING_NODE__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__IP = VIRTUAL_PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__USER_NAME = VIRTUAL_PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = VIRTUAL_PROCESSING_NODE__EXTERNAL_IP;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__VPC = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SUB_NET = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>AMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__AMI = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>AWS Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE_FEATURE_COUNT = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING = VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The number of operations of the '<em>AWS Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE_OPERATION_COUNT = VIRTUAL_PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ResourceClusterImpl <em>Resource Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ResourceClusterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getResourceCluster()
	 * @generated
	 */
	int RESOURCE_CLUSTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER__RESOURCES = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CLUSTER_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NetworkImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 13;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl <em>Platform Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PlatformServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformServer()
	 * @generated
	 */
	int PLATFORM_SERVER = 14;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SerializationServerImpl <em>Serialization Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SerializationServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSerializationServer()
	 * @generated
	 */
	int SERIALIZATION_SERVER = 15;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.AVROServerImpl <em>AVRO Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.AVROServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAVROServer()
	 * @generated
	 */
	int AVRO_SERVER = 16;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DistributionServerImpl <em>Distribution Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DistributionServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDistributionServer()
	 * @generated
	 */
	int DISTRIBUTION_SERVER = 17;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ZookeeperServerImpl <em>Zookeeper Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ZookeeperServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getZookeeperServer()
	 * @generated
	 */
	int ZOOKEEPER_SERVER = 18;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CommunicationServerImpl <em>Communication Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CommunicationServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationServer()
	 * @generated
	 */
	int COMMUNICATION_SERVER = 19;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaServerImpl <em>Kafka Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaServer()
	 * @generated
	 */
	int KAFKA_SERVER = 20;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SchedulingServerImpl <em>Scheduling Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SchedulingServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulingServer()
	 * @generated
	 */
	int SCHEDULING_SERVER = 21;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeSchedulerImpl <em>Node Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeSchedulerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeScheduler()
	 * @generated
	 */
	int NODE_SCHEDULER = 22;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SparkServerImpl <em>Spark Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SparkServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSparkServer()
	 * @generated
	 */
	int SPARK_SERVER = 23;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StormServerImpl <em>Storm Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StormServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormServer()
	 * @generated
	 */
	int STORM_SERVER = 24;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PersistenceServerImpl <em>Persistence Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PersistenceServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPersistenceServer()
	 * @generated
	 */
	int PERSISTENCE_SERVER = 25;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CassandraServerImpl <em>Cassandra Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CassandraServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCassandraServer()
	 * @generated
	 */
	int CASSANDRA_SERVER = 27;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MonitoringServerImpl <em>Monitoring Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MonitoringServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMonitoringServer()
	 * @generated
	 */
	int MONITORING_SERVER = 29;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PrometheusServerImpl <em>Prometheus Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PrometheusServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusServer()
	 * @generated
	 */
	int PROMETHEUS_SERVER = 30;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataImpl <em>Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamData()
	 * @generated
	 */
	int STREAM_DATA = 31;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl <em>Stream Data Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataPartition()
	 * @generated
	 */
	int STREAM_DATA_PARTITION = 32;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl <em>Workflow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowStreamData()
	 * @generated
	 */
	int WORKFLOW_STREAM_DATA = 33;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl <em>Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.FlowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFlowStreamData()
	 * @generated
	 */
	int FLOW_STREAM_DATA = 34;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl <em>Kafka Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaFlowStreamData()
	 * @generated
	 */
	int KAFKA_FLOW_STREAM_DATA = 35;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl <em>Derived Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDerivedStreamData()
	 * @generated
	 */
	int DERIVED_STREAM_DATA = 36;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl <em>Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkloadStreamData()
	 * @generated
	 */
	int WORKLOAD_STREAM_DATA = 37;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl <em>Kafka Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaWorkloadStreamData()
	 * @generated
	 */
	int KAFKA_WORKLOAD_STREAM_DATA = 38;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 39;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SchedulableSetImpl <em>Schedulable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SchedulableSetImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulableSet()
	 * @generated
	 */
	int SCHEDULABLE_SET = 40;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 41;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl <em>Task Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskExecutorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskExecutor()
	 * @generated
	 */
	int TASK_EXECUTOR = 42;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MetricImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 43;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl <em>Processing Node Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeUtilization()
	 * @generated
	 */
	int PROCESSING_NODE_UTILIZATION = 44;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl <em>Processing Node Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeMemory()
	 * @generated
	 */
	int PROCESSING_NODE_MEMORY = 45;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl <em>Network Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetworkUtilization()
	 * @generated
	 */
	int NETWORK_UTILIZATION = 46;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl <em>Workflow Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatency()
	 * @generated
	 */
	int WORKFLOW_LATENCY = 47;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl <em>Task Processing Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmount()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT = 48;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataRateImpl <em>Stream Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataRateImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataRate()
	 * @generated
	 */
	int STREAM_DATA_RATE = 49;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 50;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl <em>Node Hosted Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeHostedMeter()
	 * @generated
	 */
	int NODE_HOSTED_METER = 52;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl <em>Node Resource Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeResourceMeter()
	 * @generated
	 */
	int NODE_RESOURCE_METER = 53;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CommunicationMeterImpl <em>Communication Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CommunicationMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationMeter()
	 * @generated
	 */
	int COMMUNICATION_METER = 54;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamRateMeterImpl <em>Stream Rate Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamRateMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamRateMeter()
	 * @generated
	 */
	int STREAM_RATE_METER = 55;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl <em>Workflow Latency Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatencyMeter()
	 * @generated
	 */
	int WORKFLOW_LATENCY_METER = 56;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl <em>Task Processing Amount Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmountMeter()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT_METER = 57;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SystemComponentImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemComponent()
	 * @generated
	 */
	int SYSTEM_COMPONENT = 58;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl <em>Deployment File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentFileDescriptor()
	 * @generated
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR = 60;

	/**
	 * The meta object id for the '{@link java.lang.Exception <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 62;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.ConfigurationException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getConfigurationException()
	 * @generated
	 */
	int CONFIGURATION_EXCEPTION = 63;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.DeploymentException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentException()
	 * @generated
	 */
	int DEPLOYMENT_EXCEPTION = 64;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.LaunchException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getLaunchException()
	 * @generated
	 */
	int LAUNCH_EXCEPTION = 65;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeClusterImpl <em>Node Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeClusterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeCluster()
	 * @generated
	 */
	int NODE_CLUSTER = 12;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PrometheusMeterImpl <em>Prometheus Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PrometheusMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusMeter()
	 * @generated
	 */
	int PROMETHEUS_METER = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER__NAME = RESOURCE_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER__ID = RESOURCE_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER__OWNER = RESOURCE_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER__RESOURCES = RESOURCE_CLUSTER__RESOURCES;

	/**
	 * The number of structural features of the '<em>Node Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_FEATURE_COUNT = RESOURCE_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_OPERATION_COUNT = RESOURCE_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BANDWITH = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__ARTIFACT_NAME = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__ARTIFACT_LOCATOR = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__ARGUMENTS = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__CONFIG_FOLDER_PATH = PLATFORM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__DATA_FOLDER_PATH = PLATFORM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__LOG_FOLDER_PATH = PLATFORM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__IS_RUNNING = PLATFORM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__HOST = PLATFORM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__TARGET = PLATFORM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER__CONTAINER = PLATFORM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Platform Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER___DEPLOY = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVER_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Serialization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Serialization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__NAME = SERIALIZATION_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__ID = SERIALIZATION_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__OWNER = SERIALIZATION_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__ARTIFACT_NAME = SERIALIZATION_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__ARTIFACT_LOCATOR = SERIALIZATION_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__ARGUMENTS = SERIALIZATION_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__SCRIPT_FOLDER_PATH = SERIALIZATION_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__CONFIG_FOLDER_PATH = SERIALIZATION_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__DATA_FOLDER_PATH = SERIALIZATION_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__LOG_FOLDER_PATH = SERIALIZATION_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__IS_RUNNING = SERIALIZATION_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__HOST = SERIALIZATION_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__TARGET = SERIALIZATION_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER__CONTAINER = SERIALIZATION_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>AVRO Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER_FEATURE_COUNT = SERIALIZATION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER___DEPLOY = SERIALIZATION_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>AVRO Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVER_OPERATION_COUNT = SERIALIZATION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Distribution Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Distribution Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__NAME = DISTRIBUTION_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__ID = DISTRIBUTION_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__OWNER = DISTRIBUTION_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__ARTIFACT_NAME = DISTRIBUTION_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__ARTIFACT_LOCATOR = DISTRIBUTION_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__ARGUMENTS = DISTRIBUTION_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__SCRIPT_FOLDER_PATH = DISTRIBUTION_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__CONFIG_FOLDER_PATH = DISTRIBUTION_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__DATA_FOLDER_PATH = DISTRIBUTION_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__LOG_FOLDER_PATH = DISTRIBUTION_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__IS_RUNNING = DISTRIBUTION_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__HOST = DISTRIBUTION_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__TARGET = DISTRIBUTION_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__CONTAINER = DISTRIBUTION_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__SERVER_ID = DISTRIBUTION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__TICK_TIME = DISTRIBUTION_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leader Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__LEADER_SERVERS = DISTRIBUTION_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Init Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__INIT_LIMIT = DISTRIBUTION_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__SYNC_LIMIT = DISTRIBUTION_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__CLIENT_PORT = DISTRIBUTION_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Peer Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__PEER_PORT = DISTRIBUTION_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Leader Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER__LEADER_PORT = DISTRIBUTION_SERVER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Zookeeper Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER_FEATURE_COUNT = DISTRIBUTION_SERVER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER___DEPLOY = DISTRIBUTION_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Zookeeper Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVER_OPERATION_COUNT = DISTRIBUTION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Communication Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Communication Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__NAME = COMMUNICATION_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ID = COMMUNICATION_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__OWNER = COMMUNICATION_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ARTIFACT_NAME = COMMUNICATION_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ARTIFACT_LOCATOR = COMMUNICATION_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ARGUMENTS = COMMUNICATION_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__SCRIPT_FOLDER_PATH = COMMUNICATION_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__CONFIG_FOLDER_PATH = COMMUNICATION_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__DATA_FOLDER_PATH = COMMUNICATION_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__LOG_FOLDER_PATH = COMMUNICATION_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__IS_RUNNING = COMMUNICATION_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__HOST = COMMUNICATION_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__TARGET = COMMUNICATION_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__CONTAINER = COMMUNICATION_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Comm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__COMM_ID = COMMUNICATION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Create Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__AUTO_CREATE_TOPIC_ENABLE = COMMUNICATION_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delete Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__DELETE_TOPIC_ENABLE = COMMUNICATION_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ZOOKEEPER_CONNECT = COMMUNICATION_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ZOOKEEPER_CONNECTION_TIMEOUT = COMMUNICATION_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__NUM_PARTITIONS = COMMUNICATION_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__NUM_RECOVERY_THREADS_PER_DATA_DIR = COMMUNICATION_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Log Flush Interval Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__LOG_FLUSH_INTERVAL_MESSAGES = COMMUNICATION_SERVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Log Flush Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__LOG_FLUSH_INTERVAL = COMMUNICATION_SERVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__LISTENERS = COMMUNICATION_SERVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Advertised Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__ADVERTISED_LISTENERS = COMMUNICATION_SERVER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Num Network Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__NUM_NETWORK_THREADS = COMMUNICATION_SERVER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Num IO Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__NUM_IO_THREADS = COMMUNICATION_SERVER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__SOCKET_SEND_BUFFER_BYTES = COMMUNICATION_SERVER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__SOCKET_RECEIVE_BUFFER_BYTES = COMMUNICATION_SERVER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Socket Request Max Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__SOCKET_REQUEST_MAX_BYTES = COMMUNICATION_SERVER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER__CLIENT_PORT = COMMUNICATION_SERVER_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Kafka Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER_FEATURE_COUNT = COMMUNICATION_SERVER_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER___DEPLOY = COMMUNICATION_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Kafka Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVER_OPERATION_COUNT = COMMUNICATION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER__WORKFLOWS = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Scheduling Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__NAME = SCHEDULING_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ID = SCHEDULING_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__OWNER = SCHEDULING_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ARTIFACT_NAME = SCHEDULING_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ARTIFACT_LOCATOR = SCHEDULING_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ARGUMENTS = SCHEDULING_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__SCRIPT_FOLDER_PATH = SCHEDULING_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__CONFIG_FOLDER_PATH = SCHEDULING_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__DATA_FOLDER_PATH = SCHEDULING_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__LOG_FOLDER_PATH = SCHEDULING_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__IS_RUNNING = SCHEDULING_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__HOST = SCHEDULING_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__TARGET = SCHEDULING_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__CONTAINER = SCHEDULING_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__WORKFLOWS = SCHEDULING_SERVER__WORKFLOWS;

	/**
	 * The number of structural features of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_FEATURE_COUNT = SCHEDULING_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER___DEPLOY = SCHEDULING_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_OPERATION_COUNT = SCHEDULING_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__NAME = SCHEDULING_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__ID = SCHEDULING_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__OWNER = SCHEDULING_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__ARTIFACT_NAME = SCHEDULING_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__ARTIFACT_LOCATOR = SCHEDULING_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__ARGUMENTS = SCHEDULING_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__SCRIPT_FOLDER_PATH = SCHEDULING_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__CONFIG_FOLDER_PATH = SCHEDULING_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__DATA_FOLDER_PATH = SCHEDULING_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__LOG_FOLDER_PATH = SCHEDULING_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__IS_RUNNING = SCHEDULING_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__HOST = SCHEDULING_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__TARGET = SCHEDULING_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__CONTAINER = SCHEDULING_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__WORKFLOWS = SCHEDULING_SERVER__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__LOAD = SCHEDULING_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__DRIVER_CORES = SCHEDULING_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver Max Result Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__DRIVER_MAX_RESULT_SIZE = SCHEDULING_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__DRIVER_MEMORY = SCHEDULING_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__LOCAL_DIR = SCHEDULING_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__MASTER = SCHEDULING_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__WINDOW_SIZE = SCHEDULING_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executor Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__EXECUTOR_MEMORY = SCHEDULING_SERVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extra Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__EXTRA_LISTENER = SCHEDULING_SERVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Log Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__LOG_CONF = SCHEDULING_SERVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Submit Deploy Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__SUBMIT_DEPLOY_MODE = SCHEDULING_SERVER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Caller Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__LOG_CALLER_CONTEXT = SCHEDULING_SERVER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Driver Superviser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER__DRIVER_SUPERVISER = SCHEDULING_SERVER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Spark Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER_FEATURE_COUNT = SCHEDULING_SERVER_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER___DEPLOY = SCHEDULING_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Spark Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVER_OPERATION_COUNT = SCHEDULING_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__NAME = SCHEDULING_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__ID = SCHEDULING_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__OWNER = SCHEDULING_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__ARTIFACT_NAME = SCHEDULING_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__ARTIFACT_LOCATOR = SCHEDULING_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__ARGUMENTS = SCHEDULING_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__SCRIPT_FOLDER_PATH = SCHEDULING_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__CONFIG_FOLDER_PATH = SCHEDULING_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__DATA_FOLDER_PATH = SCHEDULING_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__LOG_FOLDER_PATH = SCHEDULING_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__IS_RUNNING = SCHEDULING_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__HOST = SCHEDULING_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__TARGET = SCHEDULING_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__CONTAINER = SCHEDULING_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__WORKFLOWS = SCHEDULING_SERVER__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__ZOOKEEPER_CONNECT = SCHEDULING_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__LOCAL_DIR = SCHEDULING_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nimbus Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__NIMBUS_SEEDS = SCHEDULING_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supervisor Slot Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__SUPERVISOR_SLOT_PORTS = SCHEDULING_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Drpc Servers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__DRPC_SERVERS = SCHEDULING_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supervisors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__SUPERVISORS = SCHEDULING_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__UI_PORT = SCHEDULING_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Nimbus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER__IS_NIMBUS = SCHEDULING_SERVER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Storm Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER_FEATURE_COUNT = SCHEDULING_SERVER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER___DEPLOY = SCHEDULING_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Storm Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVER_OPERATION_COUNT = SCHEDULING_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__LOGGING = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__PASSWD = PLATFORM_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER__PORT = PLATFORM_SERVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Persistence Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Persistence Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MemSQLServerImpl <em>Mem SQL Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MemSQLServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMemSQLServer()
	 * @generated
	 */
	int MEM_SQL_SERVER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__NAME = PERSISTENCE_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__ID = PERSISTENCE_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__OWNER = PERSISTENCE_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__ARTIFACT_NAME = PERSISTENCE_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__ARTIFACT_LOCATOR = PERSISTENCE_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__ARGUMENTS = PERSISTENCE_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__SCRIPT_FOLDER_PATH = PERSISTENCE_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__CONFIG_FOLDER_PATH = PERSISTENCE_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__DATA_FOLDER_PATH = PERSISTENCE_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__LOG_FOLDER_PATH = PERSISTENCE_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__IS_RUNNING = PERSISTENCE_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__HOST = PERSISTENCE_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__TARGET = PERSISTENCE_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__CONTAINER = PERSISTENCE_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__LOGGING = PERSISTENCE_SERVER__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__PASSWD = PERSISTENCE_SERVER__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER__PORT = PERSISTENCE_SERVER__PORT;

	/**
	 * The number of structural features of the '<em>Mem SQL Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER_FEATURE_COUNT = PERSISTENCE_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER___DEPLOY = PERSISTENCE_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Mem SQL Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVER_OPERATION_COUNT = PERSISTENCE_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__NAME = PERSISTENCE_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__ID = PERSISTENCE_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__OWNER = PERSISTENCE_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__ARTIFACT_NAME = PERSISTENCE_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__ARTIFACT_LOCATOR = PERSISTENCE_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__ARGUMENTS = PERSISTENCE_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__SCRIPT_FOLDER_PATH = PERSISTENCE_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__CONFIG_FOLDER_PATH = PERSISTENCE_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__DATA_FOLDER_PATH = PERSISTENCE_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__LOG_FOLDER_PATH = PERSISTENCE_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__IS_RUNNING = PERSISTENCE_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__HOST = PERSISTENCE_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__TARGET = PERSISTENCE_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__CONTAINER = PERSISTENCE_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__LOGGING = PERSISTENCE_SERVER__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__PASSWD = PERSISTENCE_SERVER__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__PORT = PERSISTENCE_SERVER__PORT;

	/**
	 * The feature id for the '<em><b>Num Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__NUM_TOKENS = PERSISTENCE_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__SEEDS = PERSISTENCE_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__SEED_PROVIDER_CLASS = PERSISTENCE_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Listen Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__LISTEN_ADDRESS = PERSISTENCE_SERVER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rpc Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__RPC_ADDRESS = PERSISTENCE_SERVER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__ENDPOINT_SNITCH = PERSISTENCE_SERVER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__DATA_CENTER = PERSISTENCE_SERVER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__DATA_FILE_DIR = PERSISTENCE_SERVER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Native Transport Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__NATIVE_TRANSPORT_PORT = PERSISTENCE_SERVER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__RACK = PERSISTENCE_SERVER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__AUTO_BOOTSTRAP = PERSISTENCE_SERVER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__CQL_SCHEMAS = PERSISTENCE_SERVER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER__IS_SEED = PERSISTENCE_SERVER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Cassandra Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER_FEATURE_COUNT = PERSISTENCE_SERVER_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER___DEPLOY = PERSISTENCE_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Cassandra Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVER_OPERATION_COUNT = PERSISTENCE_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.Neo4JServerImpl <em>Neo4 JServer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.Neo4JServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNeo4JServer()
	 * @generated
	 */
	int NEO4_JSERVER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__NAME = PERSISTENCE_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__ID = PERSISTENCE_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__OWNER = PERSISTENCE_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__ARTIFACT_NAME = PERSISTENCE_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__ARTIFACT_LOCATOR = PERSISTENCE_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__ARGUMENTS = PERSISTENCE_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__SCRIPT_FOLDER_PATH = PERSISTENCE_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__CONFIG_FOLDER_PATH = PERSISTENCE_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__DATA_FOLDER_PATH = PERSISTENCE_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__LOG_FOLDER_PATH = PERSISTENCE_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__IS_RUNNING = PERSISTENCE_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__HOST = PERSISTENCE_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__TARGET = PERSISTENCE_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__CONTAINER = PERSISTENCE_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__LOGGING = PERSISTENCE_SERVER__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__PASSWD = PERSISTENCE_SERVER__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER__PORT = PERSISTENCE_SERVER__PORT;

	/**
	 * The number of structural features of the '<em>Neo4 JServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER_FEATURE_COUNT = PERSISTENCE_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER___DEPLOY = PERSISTENCE_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Neo4 JServer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVER_OPERATION_COUNT = PERSISTENCE_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER__MONITORIZED_METERS = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitoring Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Monitoring Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__NAME = MONITORING_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__ID = MONITORING_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__OWNER = MONITORING_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__ARTIFACT_NAME = MONITORING_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__ARTIFACT_LOCATOR = MONITORING_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__ARGUMENTS = MONITORING_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__SCRIPT_FOLDER_PATH = MONITORING_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__CONFIG_FOLDER_PATH = MONITORING_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__DATA_FOLDER_PATH = MONITORING_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__LOG_FOLDER_PATH = MONITORING_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__IS_RUNNING = MONITORING_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__HOST = MONITORING_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__TARGET = MONITORING_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__CONTAINER = MONITORING_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__MONITORIZED_METERS = MONITORING_SERVER__MONITORIZED_METERS;

	/**
	 * The feature id for the '<em><b>Exporters Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER__EXPORTERS_DATA = MONITORING_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prometheus Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER_FEATURE_COUNT = MONITORING_SERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER___DEPLOY = MONITORING_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Prometheus Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVER_OPERATION_COUNT = MONITORING_SERVER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ARTIFACT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ARTIFACT_LOCATOR = 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH = 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__CONFIG_FOLDER_PATH = 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__DATA_FOLDER_PATH = 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__LOG_FOLDER_PATH = 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__IS_RUNNING = 7;

	/**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT___DEPLOY = 0;

	/**
	 * The number of operations of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ARTIFACT_NAME = SYSTEM_COMPONENT__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ARTIFACT_LOCATOR = SYSTEM_COMPONENT__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ARGUMENTS = SYSTEM_COMPONENT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__SCRIPT_FOLDER_PATH = SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__CONFIG_FOLDER_PATH = SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__DATA_FOLDER_PATH = SYSTEM_COMPONENT__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__LOG_FOLDER_PATH = SYSTEM_COMPONENT__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__IS_RUNNING = SYSTEM_COMPONENT__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_MS = SYSTEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_BYTES = SYSTEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__CLEANUP_POLICY = SYSTEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_PARTITIONS = SYSTEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_REPLICATION = SYSTEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__OWNED_METERS = SYSTEM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ASSIGNED_PARTITION = SYSTEM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__MESSAGE_SIZE = SYSTEM_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__SCHEMA_FILE = SYSTEM_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_FEATURE_COUNT = SYSTEM_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA___DEPLOY = SYSTEM_COMPONENT___DEPLOY;

	/**
	 * The number of operations of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_OPERATION_COUNT = SYSTEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION__HOST = 1;

	/**
	 * The number of structural features of the '<em>Stream Data Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stream Data Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ARTIFACT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ARTIFACT_LOCATOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ARGUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__SCRIPT_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__CONFIG_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__DATA_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__LOG_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__IS_RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_MS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_BYTES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__CLEANUP_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_PARTITIONS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_REPLICATION = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__MESSAGE_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__SCHEMA_FILE = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__IS_SINGLE_USE = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Workflow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA___DEPLOY = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NAME = WORKFLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ID = WORKFLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ARTIFACT_NAME = WORKFLOW_STREAM_DATA__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ARTIFACT_LOCATOR = WORKFLOW_STREAM_DATA__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ARGUMENTS = WORKFLOW_STREAM_DATA__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__SCRIPT_FOLDER_PATH = WORKFLOW_STREAM_DATA__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__CONFIG_FOLDER_PATH = WORKFLOW_STREAM_DATA__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__DATA_FOLDER_PATH = WORKFLOW_STREAM_DATA__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__LOG_FOLDER_PATH = WORKFLOW_STREAM_DATA__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__IS_RUNNING = WORKFLOW_STREAM_DATA__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__RETENTION_MS = WORKFLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__RETENTION_BYTES = WORKFLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__CLEANUP_POLICY = WORKFLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NUM_PARTITIONS = WORKFLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NUM_REPLICATION = WORKFLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__OWNED_METERS = WORKFLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ASSIGNED_PARTITION = WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__MESSAGE_SIZE = WORKFLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__SCHEMA_FILE = WORKFLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__IS_SINGLE_USE = WORKFLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__OWNER = WORKFLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__SOURCE = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__PREDECESSOR = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__HOLDER = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__IS_IMPLEMENTED = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA_FEATURE_COUNT = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA___DEPLOY = WORKFLOW_STREAM_DATA___DEPLOY;

	/**
	 * The number of operations of the '<em>Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA_OPERATION_COUNT = WORKFLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NAME = FLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ID = FLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ARTIFACT_NAME = FLOW_STREAM_DATA__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ARTIFACT_LOCATOR = FLOW_STREAM_DATA__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ARGUMENTS = FLOW_STREAM_DATA__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__SCRIPT_FOLDER_PATH = FLOW_STREAM_DATA__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__CONFIG_FOLDER_PATH = FLOW_STREAM_DATA__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__DATA_FOLDER_PATH = FLOW_STREAM_DATA__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__LOG_FOLDER_PATH = FLOW_STREAM_DATA__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__IS_RUNNING = FLOW_STREAM_DATA__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__RETENTION_MS = FLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__RETENTION_BYTES = FLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__CLEANUP_POLICY = FLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NUM_PARTITIONS = FLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NUM_REPLICATION = FLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__OWNED_METERS = FLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ASSIGNED_PARTITION = FLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__MESSAGE_SIZE = FLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__SCHEMA_FILE = FLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__IS_SINGLE_USE = FLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__OWNER = FLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__SOURCE = FLOW_STREAM_DATA__SOURCE;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__PREDECESSOR = FLOW_STREAM_DATA__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__HOLDER = FLOW_STREAM_DATA__HOLDER;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__IS_IMPLEMENTED = FLOW_STREAM_DATA__IS_IMPLEMENTED;

	/**
	 * The number of structural features of the '<em>Kafka Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA_FEATURE_COUNT = FLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA___DEPLOY = FLOW_STREAM_DATA___DEPLOY;

	/**
	 * The number of operations of the '<em>Kafka Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA_OPERATION_COUNT = FLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NAME = WORKFLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ID = WORKFLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ARTIFACT_NAME = WORKFLOW_STREAM_DATA__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ARTIFACT_LOCATOR = WORKFLOW_STREAM_DATA__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ARGUMENTS = WORKFLOW_STREAM_DATA__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__SCRIPT_FOLDER_PATH = WORKFLOW_STREAM_DATA__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__CONFIG_FOLDER_PATH = WORKFLOW_STREAM_DATA__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__DATA_FOLDER_PATH = WORKFLOW_STREAM_DATA__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__LOG_FOLDER_PATH = WORKFLOW_STREAM_DATA__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__IS_RUNNING = WORKFLOW_STREAM_DATA__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__RETENTION_MS = WORKFLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__RETENTION_BYTES = WORKFLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__CLEANUP_POLICY = WORKFLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NUM_PARTITIONS = WORKFLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NUM_REPLICATION = WORKFLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__OWNED_METERS = WORKFLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ASSIGNED_PARTITION = WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__MESSAGE_SIZE = WORKFLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__SCHEMA_FILE = WORKFLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__IS_SINGLE_USE = WORKFLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__OWNER = WORKFLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__PATTERN = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__INPUTS = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA_FEATURE_COUNT = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA___DEPLOY = WORKFLOW_STREAM_DATA___DEPLOY;

	/**
	 * The number of operations of the '<em>Derived Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA_OPERATION_COUNT = WORKFLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ARTIFACT_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ARGUMENTS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__IS_RUNNING = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_MS = SYSTEM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_BYTES = SYSTEM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__CLEANUP_POLICY = SYSTEM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_PARTITIONS = SYSTEM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_REPLICATION = SYSTEM_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION = SYSTEM_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__MESSAGE_SIZE = SYSTEM_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__SCHEMA_FILE = SYSTEM_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__HOLDER = SYSTEM_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA___DEPLOY = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NAME = WORKLOAD_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ID = WORKLOAD_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__OWNER = WORKLOAD_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ARTIFACT_NAME = WORKLOAD_STREAM_DATA__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR = WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ARGUMENTS = WORKLOAD_STREAM_DATA__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH = WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH = WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH = WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH = WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__IS_RUNNING = WORKLOAD_STREAM_DATA__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__RETENTION_MS = WORKLOAD_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__RETENTION_BYTES = WORKLOAD_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__CLEANUP_POLICY = WORKLOAD_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NUM_PARTITIONS = WORKLOAD_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NUM_REPLICATION = WORKLOAD_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__OWNED_METERS = WORKLOAD_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION = WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__MESSAGE_SIZE = WORKLOAD_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__SCHEMA_FILE = WORKLOAD_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__HOLDER = WORKLOAD_STREAM_DATA__HOLDER;

	/**
	 * The number of structural features of the '<em>Kafka Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA_FEATURE_COUNT = WORKLOAD_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA___DEPLOY = WORKLOAD_STREAM_DATA___DEPLOY;

	/**
	 * The number of operations of the '<em>Kafka Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA_OPERATION_COUNT = WORKLOAD_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ARTIFACT_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ARTIFACT_LOCATOR = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ARGUMENTS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SCRIPT_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONFIG_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DATA_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LOG_FOLDER_PATH = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__IS_RUNNING = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Stream Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_STREAM_DATA = SYSTEM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASKS = SYSTEM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ROOT_TASK = SYSTEM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Task Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASK_EXECUTORS = SYSTEM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SCHEDULER = SYSTEM_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___DEPLOY = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__WORKFLOWS = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedulable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedulable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementing Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTING_CLASS_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returned Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURNED_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRIGGER_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Stream Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__ARTIFACT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__ARTIFACT_LOCATOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__ARGUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__SCRIPT_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__CONFIG_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__DATA_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__LOG_FOLDER_PATH = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__IS_RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Executed Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__EXECUTED_TASKS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Task Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR___DEPLOY = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Node Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Processing Node Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Node Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Processing Node Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Histogram Buckect Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM = METRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expected Max TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA = METRIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expected Min TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA = METRIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Linear Bucket Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION = METRIC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task Processing Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_FEATURE_COUNT = METRIC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task Processing Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__METER = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stream Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stream Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MONITORING_SERVER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__NAME = METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__ID = METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_SERVER = METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_PORT = METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_TIME = METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prometheus Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER_FEATURE_COUNT = METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = METER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prometheus Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER_OPERATION_COUNT = METER_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ARTIFACT_NAME = SYSTEM_COMPONENT__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ARTIFACT_LOCATOR = SYSTEM_COMPONENT__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ARGUMENTS = SYSTEM_COMPONENT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__SCRIPT_FOLDER_PATH = SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__CONFIG_FOLDER_PATH = SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__DATA_FOLDER_PATH = SYSTEM_COMPONENT__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__LOG_FOLDER_PATH = SYSTEM_COMPONENT__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__IS_RUNNING = SYSTEM_COMPONENT__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__NAME = SYSTEM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ID = SYSTEM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_SERVER = SYSTEM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_PORT = SYSTEM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_TIME = SYSTEM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__OWNER = SYSTEM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_FEATURE_COUNT = SYSTEM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___DEPLOY = SYSTEM_COMPONENT___DEPLOY;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = SYSTEM_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_OPERATION_COUNT = SYSTEM_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__ARTIFACT_NAME = NODE_HOSTED_METER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__ARTIFACT_LOCATOR = NODE_HOSTED_METER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__ARGUMENTS = NODE_HOSTED_METER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__SCRIPT_FOLDER_PATH = NODE_HOSTED_METER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__CONFIG_FOLDER_PATH = NODE_HOSTED_METER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__DATA_FOLDER_PATH = NODE_HOSTED_METER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__LOG_FOLDER_PATH = NODE_HOSTED_METER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__IS_RUNNING = NODE_HOSTED_METER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__NAME = NODE_HOSTED_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__ID = NODE_HOSTED_METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_SERVER = NODE_HOSTED_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_PORT = NODE_HOSTED_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_TIME = NODE_HOSTED_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__OWNER = NODE_HOSTED_METER__OWNER;

	/**
	 * The feature id for the '<em><b>UMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__UMETRIC = NODE_HOSTED_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MMETRIC = NODE_HOSTED_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Resource Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER_FEATURE_COUNT = NODE_HOSTED_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER___DEPLOY = NODE_HOSTED_METER___DEPLOY;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Node Resource Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER_OPERATION_COUNT = NODE_HOSTED_METER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__ARTIFACT_NAME = NODE_HOSTED_METER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__ARTIFACT_LOCATOR = NODE_HOSTED_METER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__ARGUMENTS = NODE_HOSTED_METER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__SCRIPT_FOLDER_PATH = NODE_HOSTED_METER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__CONFIG_FOLDER_PATH = NODE_HOSTED_METER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__DATA_FOLDER_PATH = NODE_HOSTED_METER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__LOG_FOLDER_PATH = NODE_HOSTED_METER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__IS_RUNNING = NODE_HOSTED_METER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__NAME = NODE_HOSTED_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__ID = NODE_HOSTED_METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_SERVER = NODE_HOSTED_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_PORT = NODE_HOSTED_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_TIME = NODE_HOSTED_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__OWNER = NODE_HOSTED_METER__OWNER;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__METRIC = NODE_HOSTED_METER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER_FEATURE_COUNT = NODE_HOSTED_METER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER___DEPLOY = NODE_HOSTED_METER___DEPLOY;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Communication Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER_OPERATION_COUNT = NODE_HOSTED_METER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stream Rate Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Stream Rate Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Latency Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Workflow Latency Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Processing Amount Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Task Processing Amount Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.FileDescriptorImpl <em>File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.FileDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFileDescriptor()
	 * @generated
	 */
	int FILE_DESCRIPTOR = 59;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl <em>Artifact Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getArtifactDescriptor()
	 * @generated
	 */
	int ARTIFACT_DESCRIPTOR = 61;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_PATH = FILE_DESCRIPTOR__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_NAME = FILE_DESCRIPTOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT = FILE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE = FILE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__OWNER = FILE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR_FEATURE_COUNT = FILE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deployment File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR_OPERATION_COUNT = FILE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__FILE_PATH = FILE_DESCRIPTOR__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__FILE_NAME = FILE_DESCRIPTOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__FILE_LOCATOR = FILE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR_FEATURE_COUNT = FILE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR_OPERATION_COUNT = FILE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Configuration Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployment Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployment Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Launch Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Launch Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ExporterDataImpl <em>Exporter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ExporterDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getExporterData()
	 * @generated
	 */
	int EXPORTER_DATA = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA__ARTIFACT = 1;

	/**
	 * The number of structural features of the '<em>Exporter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exporter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StringToStringMapImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 67;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ContainerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HOST = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DockerContainerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__OWNER = CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__HOST = CONTAINER__HOST;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__SERVICE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ContainerizationServerImpl <em>Containerization Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ContainerizationServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getContainerizationServer()
	 * @generated
	 */
	int CONTAINERIZATION_SERVER = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Containerization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Containerization Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERIZATION_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DockerServerImpl <em>Docker Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DockerServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDockerServer()
	 * @generated
	 */
	int DOCKER_SERVER = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__NAME = CONTAINERIZATION_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__ID = CONTAINERIZATION_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__OWNER = CONTAINERIZATION_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__ARTIFACT_NAME = CONTAINERIZATION_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__ARTIFACT_LOCATOR = CONTAINERIZATION_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__ARGUMENTS = CONTAINERIZATION_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__SCRIPT_FOLDER_PATH = CONTAINERIZATION_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__CONFIG_FOLDER_PATH = CONTAINERIZATION_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__DATA_FOLDER_PATH = CONTAINERIZATION_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__LOG_FOLDER_PATH = CONTAINERIZATION_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__IS_RUNNING = CONTAINERIZATION_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__HOST = CONTAINERIZATION_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__TARGET = CONTAINERIZATION_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__CONTAINER = CONTAINERIZATION_SERVER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Stacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__STACKS = CONTAINERIZATION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Swarm Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER__SWARM_CLUSTER = CONTAINERIZATION_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Docker Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER_FEATURE_COUNT = CONTAINERIZATION_SERVER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER___DEPLOY = CONTAINERIZATION_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Docker Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVER_OPERATION_COUNT = CONTAINERIZATION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServerImpl <em>Orchestration Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.OrchestrationServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationServer()
	 * @generated
	 */
	int ORCHESTRATION_SERVER = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__NAME = PLATFORM_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__ID = PLATFORM_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__OWNER = PLATFORM_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__ARTIFACT_NAME = PLATFORM_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__ARTIFACT_LOCATOR = PLATFORM_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__ARGUMENTS = PLATFORM_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__SCRIPT_FOLDER_PATH = PLATFORM_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__CONFIG_FOLDER_PATH = PLATFORM_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__DATA_FOLDER_PATH = PLATFORM_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__LOG_FOLDER_PATH = PLATFORM_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__IS_RUNNING = PLATFORM_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__HOST = PLATFORM_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__TARGET = PLATFORM_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER__CONTAINER = PLATFORM_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Orchestration Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER_FEATURE_COUNT = PLATFORM_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER___DEPLOY = PLATFORM_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Orchestration Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVER_OPERATION_COUNT = PLATFORM_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SwarmServerImpl <em>Swarm Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SwarmServerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmServer()
	 * @generated
	 */
	int SWARM_SERVER = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__NAME = ORCHESTRATION_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__ID = ORCHESTRATION_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__OWNER = ORCHESTRATION_SERVER__OWNER;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__ARTIFACT_NAME = ORCHESTRATION_SERVER__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__ARTIFACT_LOCATOR = ORCHESTRATION_SERVER__ARTIFACT_LOCATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__ARGUMENTS = ORCHESTRATION_SERVER__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__SCRIPT_FOLDER_PATH = ORCHESTRATION_SERVER__SCRIPT_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__CONFIG_FOLDER_PATH = ORCHESTRATION_SERVER__CONFIG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__DATA_FOLDER_PATH = ORCHESTRATION_SERVER__DATA_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__LOG_FOLDER_PATH = ORCHESTRATION_SERVER__LOG_FOLDER_PATH;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__IS_RUNNING = ORCHESTRATION_SERVER__IS_RUNNING;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__HOST = ORCHESTRATION_SERVER__HOST;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__TARGET = ORCHESTRATION_SERVER__TARGET;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER__CONTAINER = ORCHESTRATION_SERVER__CONTAINER;

	/**
	 * The number of structural features of the '<em>Swarm Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER_FEATURE_COUNT = ORCHESTRATION_SERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER___DEPLOY = ORCHESTRATION_SERVER___DEPLOY;

	/**
	 * The number of operations of the '<em>Swarm Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVER_OPERATION_COUNT = ORCHESTRATION_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SwarmClusterImpl <em>Swarm Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SwarmClusterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmCluster()
	 * @generated
	 */
	int SWARM_CLUSTER = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__NAME = RESOURCE_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__ID = RESOURCE_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__OWNER = RESOURCE_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__RESOURCES = RESOURCE_CLUSTER__RESOURCES;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__WORKERS = RESOURCE_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__MANAGER = RESOURCE_CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swarm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER_FEATURE_COUNT = RESOURCE_CLUSTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swarm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER_OPERATION_COUNT = RESOURCE_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StackImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStack()
	 * @generated
	 */
	int STACK = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Swarm Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__SWARM_CLUSTER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK__NETWORKS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Stack</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STACK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Env File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENV_FILE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENV = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDS_ON = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMAGE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VOLUMES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NETWORKS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Deployment Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPLOYMENT_PARAM = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PortImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 77;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PUBLISHED = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MODE = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ServiceNetworkImpl <em>Service Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ServiceNetworkImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getServiceNetwork()
	 * @generated
	 */
	int SERVICE_NETWORK = 78;

	/**
	 * The feature id for the '<em><b>Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NETWORK__IPV4_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NETWORK__ALIASES = 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NETWORK__NETWORK = 2;

	/**
	 * The number of structural features of the '<em>Service Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SwarmNetworkImpl <em>Swarm Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SwarmNetworkImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmNetwork()
	 * @generated
	 */
	int SWARM_NETWORK = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK__SUBNETS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK__DRIVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swarm Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swarm Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_NETWORK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ImageImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__REPOSITORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAG = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Docker File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DOCKER_FILE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.VolumeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 81;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__READ_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeploymentImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 82;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICAS = 0;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PLACEMENT = 1;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__RESTART_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.RegistryImpl <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.RegistryImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRegistry()
	 * @generated
	 */
	int REGISTRY = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__URL = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__REPOSITORIES = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.RepositoryImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IMAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_PRIVATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.ExternalElementType <em>External Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.ExternalElementType
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getExternalElementType()
	 * @generated
	 */
	int EXTERNAL_ELEMENT_TYPE = 85;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.SystemComponentType <em>System Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.SystemComponentType
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemComponentType()
	 * @generated
	 */
	int SYSTEM_COMPONENT_TYPE = 86;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.PortMode <em>Port Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPortMode()
	 * @generated
	 */
	int PORT_MODE = 87;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 88;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.NetworkDriver <em>Network Driver</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.NetworkDriver
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetworkDriver()
	 * @generated
	 */
	int NETWORK_DRIVER = 89;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.VolumeType
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeType()
	 * @generated
	 */
	int VOLUME_TYPE = 90;

	/**
	 * The meta object id for the '<em>Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Properties
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 91;


	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ComputationalSystem <em>Computational System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational System</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem
	 * @generated
	 */
	EClass getComputationalSystem();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ComputationalSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getName()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ComputationalSystem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getDate()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Date();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ComputationalSystem#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authors</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getAuthors()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Authors();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Platform Name</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getTargetPlatformName()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_TargetPlatformName();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ComputationalSystem#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getDoc()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getOwnedElements()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EReference getComputationalSystem_OwnedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.ComputationalSystem#getReferencedSystems <em>Referenced Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Systems</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getReferencedSystems()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EReference getComputationalSystem_ReferencedSystems();

	/**
	 * Returns the meta object for the map '{@link PASYS_Metamodel.pasys.ComputationalSystem#getAuthenticationFiles <em>Authentication Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Authentication Files</em>'.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getAuthenticationFiles()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EReference getComputationalSystem_AuthenticationFiles();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ComputationalSystem#deployAndLaunch() <em>Deploy And Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy And Launch</em>' operation.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#deployAndLaunch()
	 * @generated
	 */
	EOperation getComputationalSystem__DeployAndLaunch();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see PASYS_Metamodel.pasys.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PASYS_Metamodel.pasys.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PASYS_Metamodel.pasys.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElement
	 * @generated
	 */
	EClass getSystemElement();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.SystemElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElement#getOwner()
	 * @see #getSystemElement()
	 * @generated
	 */
	EReference getSystemElement_Owner();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SystemExternalElement <em>System External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System External Element</em>'.
	 * @see PASYS_Metamodel.pasys.SystemExternalElement
	 * @generated
	 */
	EClass getSystemExternalElement();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemExternalElement#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see PASYS_Metamodel.pasys.SystemExternalElement#getElementType()
	 * @see #getSystemExternalElement()
	 * @generated
	 */
	EAttribute getSystemExternalElement_ElementType();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SystemAdapter <em>System Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Adapter</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter
	 * @generated
	 */
	EClass getSystemAdapter();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemAdapter#getIdPrefix <em>Id Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Prefix</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter#getIdPrefix()
	 * @see #getSystemAdapter()
	 * @generated
	 */
	EAttribute getSystemAdapter_IdPrefix();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemAdapter#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter#getPrefix()
	 * @see #getSystemAdapter()
	 * @generated
	 */
	EAttribute getSystemAdapter_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.SystemAdapter#getElemMapping <em>Elem Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elem Mapping</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter#getElemMapping()
	 * @see #getSystemAdapter()
	 * @generated
	 */
	EReference getSystemAdapter_ElemMapping();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.SystemAdapter#getSystemTarget <em>System Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System Target</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter#getSystemTarget()
	 * @see #getSystemAdapter()
	 * @generated
	 */
	EReference getSystemAdapter_SystemTarget();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemAdapter#getTargetSysLocator <em>Target Sys Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sys Locator</em>'.
	 * @see PASYS_Metamodel.pasys.SystemAdapter#getTargetSysLocator()
	 * @see #getSystemAdapter()
	 * @generated
	 */
	EAttribute getSystemAdapter_TargetSysLocator();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SystemElementAdapter <em>System Element Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element Adapter</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElementAdapter
	 * @generated
	 */
	EClass getSystemElementAdapter();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getElemName <em>Elem Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Name</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElementAdapter#getElemName()
	 * @see #getSystemElementAdapter()
	 * @generated
	 */
	EAttribute getSystemElementAdapter_ElemName();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getSourceElemId <em>Source Elem Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Elem Id</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElementAdapter#getSourceElemId()
	 * @see #getSystemElementAdapter()
	 * @generated
	 */
	EAttribute getSystemElementAdapter_SourceElemId();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getTargetElemId <em>Target Elem Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Elem Id</em>'.
	 * @see PASYS_Metamodel.pasys.SystemElementAdapter#getTargetElemId()
	 * @see #getSystemElementAdapter()
	 * @generated
	 */
	EAttribute getSystemElementAdapter_TargetElemId();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PlatformResource <em>Platform Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Resource</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformResource
	 * @generated
	 */
	EClass getPlatformResource();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ProcessingNode <em>Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode
	 * @generated
	 */
	EClass getProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getConcurrencyLevel <em>Concurrency Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency Level</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getConcurrencyLevel()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_ConcurrencyLevel();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.ProcessingNode#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getConnectedTo()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_ConnectedTo();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.ProcessingNode#getLaunchingScripts <em>Launching Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Launching Scripts</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getLaunchingScripts()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_LaunchingScripts();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.ProcessingNode#getConfigFiles <em>Config Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Files</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getConfigFiles()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_ConfigFiles();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getPropertyConfigData <em>Property Config Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Config Data</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getPropertyConfigData()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_PropertyConfigData();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.ProcessingNode#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getOwnedMeters()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_OwnedMeters();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getIp()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_Ip();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getUserName()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_UserName();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getMemorySize()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getSpeedFactor()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_SpeedFactor();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.ProcessingNode#getCodeFiles <em>Code Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code Files</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getCodeFiles()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_CodeFiles();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#prepareForDeployment() <em>Prepare For Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare For Deployment</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#prepareForDeployment()
	 * @generated
	 */
	EOperation getProcessingNode__PrepareForDeployment();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#deployAndLaunch() <em>Deploy And Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy And Launch</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#deployAndLaunch()
	 * @generated
	 */
	EOperation getProcessingNode__DeployAndLaunch();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#bringBackConfiguration() <em>Bring Back Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bring Back Configuration</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#bringBackConfiguration()
	 * @generated
	 */
	EOperation getProcessingNode__BringBackConfiguration();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#bringBackDeployment() <em>Bring Back Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bring Back Deployment</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#bringBackDeployment()
	 * @generated
	 */
	EOperation getProcessingNode__BringBackDeployment();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#abortLaunching() <em>Abort Launching</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abort Launching</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#abortLaunching()
	 * @generated
	 */
	EOperation getProcessingNode__AbortLaunching();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PhysicalProcessingNode <em>Physical Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Processing Node</em>'.
	 * @see PASYS_Metamodel.pasys.PhysicalProcessingNode
	 * @generated
	 */
	EClass getPhysicalProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PhysicalProcessingNode#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see PASYS_Metamodel.pasys.PhysicalProcessingNode#getOs()
	 * @see #getPhysicalProcessingNode()
	 * @generated
	 */
	EAttribute getPhysicalProcessingNode_Os();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.VirtualProcessingNode <em>Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Processing Node</em>'.
	 * @see PASYS_Metamodel.pasys.VirtualProcessingNode
	 * @generated
	 */
	EClass getVirtualProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External IP</em>'.
	 * @see PASYS_Metamodel.pasys.VirtualProcessingNode#getExternalIP()
	 * @see #getVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getVirtualProcessingNode_ExternalIP();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode <em>AWS Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS Virtual Processing Node</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode
	 * @generated
	 */
	EClass getAWSVirtualProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getVpc()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_Vpc();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSubNet <em>Sub Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Net</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSubNet()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_SubNet();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getKeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Pair</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getKeyPair()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_KeyPair();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSecurityGroup()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getAMI <em>AMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AMI</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getAMI()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_AMI();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getInstanceType()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_InstanceType();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ResourceCluster <em>Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Cluster</em>'.
	 * @see PASYS_Metamodel.pasys.ResourceCluster
	 * @generated
	 */
	EClass getResourceCluster();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.ResourceCluster#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see PASYS_Metamodel.pasys.ResourceCluster#getResources()
	 * @see #getResourceCluster()
	 * @generated
	 */
	EReference getResourceCluster_Resources();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see PASYS_Metamodel.pasys.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Network#getBandwith <em>Bandwith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwith</em>'.
	 * @see PASYS_Metamodel.pasys.Network#getBandwith()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Bandwith();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PlatformServer <em>Platform Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Server</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformServer
	 * @generated
	 */
	EClass getPlatformServer();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.PlatformServer#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformServer#getHost()
	 * @see #getPlatformServer()
	 * @generated
	 */
	EReference getPlatformServer_Host();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.PlatformServer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformServer#getTarget()
	 * @see #getPlatformServer()
	 * @generated
	 */
	EReference getPlatformServer_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.PlatformServer#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformServer#getContainer()
	 * @see #getPlatformServer()
	 * @generated
	 */
	EReference getPlatformServer_Container();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SerializationServer <em>Serialization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialization Server</em>'.
	 * @see PASYS_Metamodel.pasys.SerializationServer
	 * @generated
	 */
	EClass getSerializationServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.AVROServer <em>AVRO Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVRO Server</em>'.
	 * @see PASYS_Metamodel.pasys.AVROServer
	 * @generated
	 */
	EClass getAVROServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DistributionServer <em>Distribution Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Server</em>'.
	 * @see PASYS_Metamodel.pasys.DistributionServer
	 * @generated
	 */
	EClass getDistributionServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ZookeeperServer <em>Zookeeper Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zookeeper Server</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer
	 * @generated
	 */
	EClass getZookeeperServer();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getServerId <em>Server Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Id</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getServerId()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_ServerId();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getTickTime <em>Tick Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Time</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getTickTime()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_TickTime();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#isLeaderServers <em>Leader Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Servers</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#isLeaderServers()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_LeaderServers();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getInitLimit <em>Init Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Limit</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getInitLimit()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_InitLimit();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Limit</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getSyncLimit()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_SyncLimit();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getClientPort()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_ClientPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getPeerPort <em>Peer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peer Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getPeerPort()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_PeerPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperServer#getLeaderPort <em>Leader Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperServer#getLeaderPort()
	 * @see #getZookeeperServer()
	 * @generated
	 */
	EAttribute getZookeeperServer_LeaderPort();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.CommunicationServer <em>Communication Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Server</em>'.
	 * @see PASYS_Metamodel.pasys.CommunicationServer
	 * @generated
	 */
	EClass getCommunicationServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KafkaServer <em>Kafka Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Server</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer
	 * @generated
	 */
	EClass getKafkaServer();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getCommId <em>Comm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Id</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getCommId()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_CommId();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#isAutoCreateTopicEnable <em>Auto Create Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create Topic Enable</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#isAutoCreateTopicEnable()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_AutoCreateTopicEnable();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#isDeleteTopicEnable <em>Delete Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Topic Enable</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#isDeleteTopicEnable()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_DeleteTopicEnable();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.KafkaServer#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getZookeeperConnect()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EReference getKafkaServer_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getZookeeperConnectionTimeout <em>Zookeeper Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zookeeper Connection Timeout</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getZookeeperConnectionTimeout()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_ZookeeperConnectionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getNumPartitions <em>Num Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Partitions</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getNumPartitions()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_NumPartitions();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getNumRecoveryThreadsPerDataDir <em>Num Recovery Threads Per Data Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Recovery Threads Per Data Dir</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getNumRecoveryThreadsPerDataDir()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_NumRecoveryThreadsPerDataDir();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getLogFlushIntervalMessages <em>Log Flush Interval Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval Messages</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getLogFlushIntervalMessages()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_LogFlushIntervalMessages();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getLogFlushInterval <em>Log Flush Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getLogFlushInterval()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_LogFlushInterval();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listeners</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getListeners()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_Listeners();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getAdvertisedListeners <em>Advertised Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertised Listeners</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getAdvertisedListeners()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_AdvertisedListeners();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getNumNetworkThreads <em>Num Network Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Network Threads</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getNumNetworkThreads()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_NumNetworkThreads();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getNumIOThreads <em>Num IO Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num IO Threads</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getNumIOThreads()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_NumIOThreads();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getSocketSendBufferBytes <em>Socket Send Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Send Buffer Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getSocketSendBufferBytes()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_SocketSendBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getSocketReceiveBufferBytes <em>Socket Receive Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Receive Buffer Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getSocketReceiveBufferBytes()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_SocketReceiveBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getSocketRequestMaxBytes <em>Socket Request Max Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Request Max Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getSocketRequestMaxBytes()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_SocketRequestMaxBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaServer#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaServer#getClientPort()
	 * @see #getKafkaServer()
	 * @generated
	 */
	EAttribute getKafkaServer_ClientPort();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SchedulingServer <em>Scheduling Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Server</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulingServer
	 * @generated
	 */
	EClass getSchedulingServer();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.SchedulingServer#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulingServer#getWorkflows()
	 * @see #getSchedulingServer()
	 * @generated
	 */
	EReference getSchedulingServer_Workflows();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NodeScheduler <em>Node Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Scheduler</em>'.
	 * @see PASYS_Metamodel.pasys.NodeScheduler
	 * @generated
	 */
	EClass getNodeScheduler();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SparkServer <em>Spark Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spark Server</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer
	 * @generated
	 */
	EClass getSparkServer();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SparkServer#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getLoad()
	 * @see #getSparkServer()
	 * @generated
	 */
	EReference getSparkServer_Load();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getDriverCores <em>Driver Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Cores</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getDriverCores()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_DriverCores();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getDriverMaxResultSize <em>Driver Max Result Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Max Result Size</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getDriverMaxResultSize()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_DriverMaxResultSize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getDriverMemory <em>Driver Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Memory</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getDriverMemory()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_DriverMemory();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getLocalDir()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_LocalDir();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SparkServer#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getMaster()
	 * @see #getSparkServer()
	 * @generated
	 */
	EReference getSparkServer_Master();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getWindowSize()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_WindowSize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getExecutorMemory <em>Executor Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor Memory</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getExecutorMemory()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_ExecutorMemory();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getExtraListener <em>Extra Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Listener</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getExtraListener()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_ExtraListener();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#isLogConf <em>Log Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Conf</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#isLogConf()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_LogConf();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getSubmitDeployMode <em>Submit Deploy Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Deploy Mode</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getSubmitDeployMode()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_SubmitDeployMode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#getLogCallerContext <em>Log Caller Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Caller Context</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#getLogCallerContext()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_LogCallerContext();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkServer#isDriverSuperviser <em>Driver Superviser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Superviser</em>'.
	 * @see PASYS_Metamodel.pasys.SparkServer#isDriverSuperviser()
	 * @see #getSparkServer()
	 * @generated
	 */
	EAttribute getSparkServer_DriverSuperviser();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StormServer <em>Storm Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Server</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer
	 * @generated
	 */
	EClass getStormServer();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormServer#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getZookeeperConnect()
	 * @see #getStormServer()
	 * @generated
	 */
	EReference getStormServer_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StormServer#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getLocalDir()
	 * @see #getStormServer()
	 * @generated
	 */
	EAttribute getStormServer_LocalDir();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormServer#getNimbusSeeds <em>Nimbus Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nimbus Seeds</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getNimbusSeeds()
	 * @see #getStormServer()
	 * @generated
	 */
	EReference getStormServer_NimbusSeeds();

	/**
	 * Returns the meta object for the attribute list '{@link PASYS_Metamodel.pasys.StormServer#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supervisor Slot Ports</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getSupervisorSlotPorts()
	 * @see #getStormServer()
	 * @generated
	 */
	EAttribute getStormServer_SupervisorSlotPorts();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormServer#getDrpcServers <em>Drpc Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Drpc Servers</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getDrpcServers()
	 * @see #getStormServer()
	 * @generated
	 */
	EReference getStormServer_DrpcServers();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormServer#getSupervisors <em>Supervisors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisors</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getSupervisors()
	 * @see #getStormServer()
	 * @generated
	 */
	EReference getStormServer_Supervisors();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StormServer#getUiPort <em>Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Port</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#getUiPort()
	 * @see #getStormServer()
	 * @generated
	 */
	EAttribute getStormServer_UiPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StormServer#isIsNimbus <em>Is Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nimbus</em>'.
	 * @see PASYS_Metamodel.pasys.StormServer#isIsNimbus()
	 * @see #getStormServer()
	 * @generated
	 */
	EAttribute getStormServer_IsNimbus();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PersistenceServer <em>Persistence Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Server</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceServer
	 * @generated
	 */
	EClass getPersistenceServer();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceServer#getLogging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceServer#getLogging()
	 * @see #getPersistenceServer()
	 * @generated
	 */
	EAttribute getPersistenceServer_Logging();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceServer#getPasswd <em>Passwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwd</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceServer#getPasswd()
	 * @see #getPersistenceServer()
	 * @generated
	 */
	EAttribute getPersistenceServer_Passwd();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceServer#getPort()
	 * @see #getPersistenceServer()
	 * @generated
	 */
	EAttribute getPersistenceServer_Port();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.MemSQLServer <em>Mem SQL Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem SQL Server</em>'.
	 * @see PASYS_Metamodel.pasys.MemSQLServer
	 * @generated
	 */
	EClass getMemSQLServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.CassandraServer <em>Cassandra Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cassandra Server</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer
	 * @generated
	 */
	EClass getCassandraServer();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#getNumTokens <em>Num Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tokens</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getNumTokens()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_NumTokens();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraServer#getSeeds <em>Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seeds</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getSeeds()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_Seeds();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#getSeedProviderClass <em>Seed Provider Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Provider Class</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getSeedProviderClass()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_SeedProviderClass();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraServer#getListenAddress <em>Listen Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listen Address</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getListenAddress()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_ListenAddress();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraServer#getRpcAddress <em>Rpc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc Address</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getRpcAddress()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_RpcAddress();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#getEndpointSnitch <em>Endpoint Snitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Snitch</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getEndpointSnitch()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_EndpointSnitch();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraServer#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Center</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getDataCenter()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_DataCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.CassandraServer#getCqlSchemas <em>Cql Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cql Schemas</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getCqlSchemas()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_CqlSchemas();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#isIsSeed <em>Is Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Seed</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#isIsSeed()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_IsSeed();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#getDataFileDir <em>Data File Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File Dir</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getDataFileDir()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_DataFileDir();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#getNativeTransportPort <em>Native Transport Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Transport Port</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getNativeTransportPort()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_NativeTransportPort();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraServer#getRack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rack</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#getRack()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EReference getCassandraServer_Rack();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraServer#isAutoBootstrap <em>Auto Bootstrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Bootstrap</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraServer#isAutoBootstrap()
	 * @see #getCassandraServer()
	 * @generated
	 */
	EAttribute getCassandraServer_AutoBootstrap();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Neo4JServer <em>Neo4 JServer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo4 JServer</em>'.
	 * @see PASYS_Metamodel.pasys.Neo4JServer
	 * @generated
	 */
	EClass getNeo4JServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.MonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Server</em>'.
	 * @see PASYS_Metamodel.pasys.MonitoringServer
	 * @generated
	 */
	EClass getMonitoringServer();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.MonitoringServer#getMonitorizedMeters <em>Monitorized Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitorized Meters</em>'.
	 * @see PASYS_Metamodel.pasys.MonitoringServer#getMonitorizedMeters()
	 * @see #getMonitoringServer()
	 * @generated
	 */
	EReference getMonitoringServer_MonitorizedMeters();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PrometheusServer <em>Prometheus Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prometheus Server</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusServer
	 * @generated
	 */
	EClass getPrometheusServer();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.PrometheusServer#getExportersData <em>Exporters Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exporters Data</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusServer#getExportersData()
	 * @see #getPrometheusServer()
	 * @generated
	 */
	EReference getPrometheusServer_ExportersData();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StreamData <em>Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData
	 * @generated
	 */
	EClass getStreamData();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getRetention_ms <em>Retention ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention ms</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getRetention_ms()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_Retention_ms();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getRetention_bytes <em>Retention bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention bytes</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getRetention_bytes()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_Retention_bytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#isCleanupPolicy <em>Cleanup Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleanup Policy</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#isCleanupPolicy()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_CleanupPolicy();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getNumPartitions <em>Num Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Partitions</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getNumPartitions()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_NumPartitions();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getNumReplication <em>Num Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Replication</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getNumReplication()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_NumReplication();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.StreamData#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getOwnedMeters()
	 * @see #getStreamData()
	 * @generated
	 */
	EReference getStreamData_OwnedMeters();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.StreamData#getAssignedPartition <em>Assigned Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Partition</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getAssignedPartition()
	 * @see #getStreamData()
	 * @generated
	 */
	EReference getStreamData_AssignedPartition();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getMessageSize <em>Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Size</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getMessageSize()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_MessageSize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamData#getSchemaFile <em>Schema File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema File</em>'.
	 * @see PASYS_Metamodel.pasys.StreamData#getSchemaFile()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_SchemaFile();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StreamDataPartition <em>Stream Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data Partition</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataPartition
	 * @generated
	 */
	EClass getStreamDataPartition();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StreamDataPartition#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataPartition#getKey()
	 * @see #getStreamDataPartition()
	 * @generated
	 */
	EAttribute getStreamDataPartition_Key();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StreamDataPartition#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataPartition#getHost()
	 * @see #getStreamDataPartition()
	 * @generated
	 */
	EReference getStreamDataPartition_Host();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.WorkflowStreamData <em>Workflow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowStreamData
	 * @generated
	 */
	EClass getWorkflowStreamData();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.WorkflowStreamData#isIsSingleUse <em>Is Single Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Use</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowStreamData#isIsSingleUse()
	 * @see #getWorkflowStreamData()
	 * @generated
	 */
	EAttribute getWorkflowStreamData_IsSingleUse();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.WorkflowStreamData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowStreamData#getOwner()
	 * @see #getWorkflowStreamData()
	 * @generated
	 */
	EReference getWorkflowStreamData_Owner();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.FlowStreamData <em>Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.FlowStreamData
	 * @generated
	 */
	EClass getFlowStreamData();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.FlowStreamData#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see PASYS_Metamodel.pasys.FlowStreamData#getSource()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Source();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.FlowStreamData#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see PASYS_Metamodel.pasys.FlowStreamData#getPredecessor()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.FlowStreamData#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see PASYS_Metamodel.pasys.FlowStreamData#getHolder()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Holder();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.FlowStreamData#isIsImplemented <em>Is Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Implemented</em>'.
	 * @see PASYS_Metamodel.pasys.FlowStreamData#isIsImplemented()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EAttribute getFlowStreamData_IsImplemented();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KafkaFlowStreamData <em>Kafka Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Flow Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaFlowStreamData
	 * @generated
	 */
	EClass getKafkaFlowStreamData();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DerivedStreamData <em>Derived Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.DerivedStreamData
	 * @generated
	 */
	EClass getDerivedStreamData();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.DerivedStreamData#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see PASYS_Metamodel.pasys.DerivedStreamData#getPattern()
	 * @see #getDerivedStreamData()
	 * @generated
	 */
	EAttribute getDerivedStreamData_Pattern();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.DerivedStreamData#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see PASYS_Metamodel.pasys.DerivedStreamData#getInputs()
	 * @see #getDerivedStreamData()
	 * @generated
	 */
	EReference getDerivedStreamData_Inputs();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.WorkloadStreamData <em>Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.WorkloadStreamData
	 * @generated
	 */
	EClass getWorkloadStreamData();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.WorkloadStreamData#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see PASYS_Metamodel.pasys.WorkloadStreamData#getHolder()
	 * @see #getWorkloadStreamData()
	 * @generated
	 */
	EReference getWorkloadStreamData_Holder();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KafkaWorkloadStreamData <em>Kafka Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Workload Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaWorkloadStreamData
	 * @generated
	 */
	EClass getKafkaWorkloadStreamData();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Workflow#getOwnedStreamData <em>Owned Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedStreamData()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedStreamData();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Workflow#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedTasks();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Workflow#getRootTask <em>Root Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Task</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getRootTask()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_RootTask();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Workflow#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getScheduler()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Scheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Workflow#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedMeters()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedMeters();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Workflow#getOwnedTaskExecutors <em>Owned Task Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Task Executors</em>'.
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedTaskExecutors()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedTaskExecutors();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SchedulableSet <em>Schedulable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulable Set</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulableSet
	 * @generated
	 */
	EClass getSchedulableSet();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.SchedulableSet#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulableSet#getWorkflows()
	 * @see #getSchedulableSet()
	 * @generated
	 */
	EReference getSchedulableSet_Workflows();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see PASYS_Metamodel.pasys.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Task#getImplementingClassName <em>Implementing Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementing Class Name</em>'.
	 * @see PASYS_Metamodel.pasys.Task#getImplementingClassName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImplementingClassName();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Task#getReturnedStreamData <em>Returned Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returned Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.Task#getReturnedStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ReturnedStreamData();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Task#getTriggerStreamData <em>Trigger Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.Task#getTriggerStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TriggerStreamData();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.Task#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.Task#getOwner()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Owner();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.Task#getInputStreamData <em>Input Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Stream Data</em>'.
	 * @see PASYS_Metamodel.pasys.Task#getInputStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputStreamData();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.TaskExecutor <em>Task Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Executor</em>'.
	 * @see PASYS_Metamodel.pasys.TaskExecutor
	 * @generated
	 */
	EClass getTaskExecutor();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.TaskExecutor#getExecutedTasks <em>Executed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Tasks</em>'.
	 * @see PASYS_Metamodel.pasys.TaskExecutor#getExecutedTasks()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_ExecutedTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.TaskExecutor#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see PASYS_Metamodel.pasys.TaskExecutor#getOwnedMeters()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_OwnedMeters();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.TaskExecutor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.TaskExecutor#getOwner()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_Owner();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see PASYS_Metamodel.pasys.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ProcessingNodeUtilization <em>Processing Node Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Utilization</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeUtilization
	 * @generated
	 */
	EClass getProcessingNodeUtilization();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.ProcessingNodeUtilization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeUtilization#getTarget()
	 * @see #getProcessingNodeUtilization()
	 * @generated
	 */
	EReference getProcessingNodeUtilization_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.ProcessingNodeUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeUtilization#getMeter()
	 * @see #getProcessingNodeUtilization()
	 * @generated
	 */
	EReference getProcessingNodeUtilization_Meter();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory <em>Processing Node Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Memory</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeMemory
	 * @generated
	 */
	EClass getProcessingNodeMemory();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeMemory#getTarget()
	 * @see #getProcessingNodeMemory()
	 * @generated
	 */
	EReference getProcessingNodeMemory_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter()
	 * @see #getProcessingNodeMemory()
	 * @generated
	 */
	EReference getProcessingNodeMemory_Meter();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NetworkUtilization <em>Network Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Utilization</em>'.
	 * @see PASYS_Metamodel.pasys.NetworkUtilization
	 * @generated
	 */
	EClass getNetworkUtilization();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.NetworkUtilization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.NetworkUtilization#getTarget()
	 * @see #getNetworkUtilization()
	 * @generated
	 */
	EReference getNetworkUtilization_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.NetworkUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.NetworkUtilization#getMeter()
	 * @see #getNetworkUtilization()
	 * @generated
	 */
	EReference getNetworkUtilization_Meter();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.WorkflowLatency <em>Workflow Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Latency</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatency
	 * @generated
	 */
	EClass getWorkflowLatency();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.WorkflowLatency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatency#getTarget()
	 * @see #getWorkflowLatency()
	 * @generated
	 */
	EReference getWorkflowLatency_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.WorkflowLatency#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatency#getMeter()
	 * @see #getWorkflowLatency()
	 * @generated
	 */
	EReference getWorkflowLatency_Meter();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.TaskProcessingAmount <em>Task Processing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Processing Amount</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount
	 * @generated
	 */
	EClass getTaskProcessingAmount();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#getTarget()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EReference getTaskProcessingAmount_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#getMeter()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EReference getTaskProcessingAmount_Meter();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Histogram Buckect Num</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#getHistogramBuckectNum()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_HistogramBuckectNum();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Max TPA</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMaxTPA()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_ExpectedMaxTPA();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Min TPA</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMinTPA()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_ExpectedMinTPA();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Bucket Distribution</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmount#isLinearBucketDistribution()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_LinearBucketDistribution();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StreamDataRate <em>Stream Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data Rate</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataRate
	 * @generated
	 */
	EClass getStreamDataRate();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StreamDataRate#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataRate#getTarget()
	 * @see #getStreamDataRate()
	 * @generated
	 */
	EReference getStreamDataRate_Target();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StreamDataRate#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.StreamDataRate#getMeter()
	 * @see #getStreamDataRate()
	 * @generated
	 */
	EReference getStreamDataRate_Meter();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see PASYS_Metamodel.pasys.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitoring Server</em>'.
	 * @see PASYS_Metamodel.pasys.Meter#getMonitoringServer()
	 * @see #getMeter()
	 * @generated
	 */
	EReference getMeter_MonitoringServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NodeHostedMeter <em>Node Hosted Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Hosted Meter</em>'.
	 * @see PASYS_Metamodel.pasys.NodeHostedMeter
	 * @generated
	 */
	EClass getNodeHostedMeter();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.NodeHostedMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.NodeHostedMeter#getOwner()
	 * @see #getNodeHostedMeter()
	 * @generated
	 */
	EReference getNodeHostedMeter_Owner();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NodeResourceMeter <em>Node Resource Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Resource Meter</em>'.
	 * @see PASYS_Metamodel.pasys.NodeResourceMeter
	 * @generated
	 */
	EClass getNodeResourceMeter();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UMetric</em>'.
	 * @see PASYS_Metamodel.pasys.NodeResourceMeter#getUMetric()
	 * @see #getNodeResourceMeter()
	 * @generated
	 */
	EReference getNodeResourceMeter_UMetric();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMetric</em>'.
	 * @see PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric()
	 * @see #getNodeResourceMeter()
	 * @generated
	 */
	EReference getNodeResourceMeter_MMetric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.CommunicationMeter <em>Communication Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Meter</em>'.
	 * @see PASYS_Metamodel.pasys.CommunicationMeter
	 * @generated
	 */
	EClass getCommunicationMeter();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CommunicationMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see PASYS_Metamodel.pasys.CommunicationMeter#getMetric()
	 * @see #getCommunicationMeter()
	 * @generated
	 */
	EReference getCommunicationMeter_Metric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StreamRateMeter <em>Stream Rate Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Rate Meter</em>'.
	 * @see PASYS_Metamodel.pasys.StreamRateMeter
	 * @generated
	 */
	EClass getStreamRateMeter();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.StreamRateMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.StreamRateMeter#getOwner()
	 * @see #getStreamRateMeter()
	 * @generated
	 */
	EReference getStreamRateMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StreamRateMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see PASYS_Metamodel.pasys.StreamRateMeter#getMetric()
	 * @see #getStreamRateMeter()
	 * @generated
	 */
	EReference getStreamRateMeter_Metric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter <em>Workflow Latency Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Latency Meter</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter
	 * @generated
	 */
	EClass getWorkflowLatencyMeter();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter#getOwner()
	 * @see #getWorkflowLatencyMeter()
	 * @generated
	 */
	EReference getWorkflowLatencyMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter#getMetric()
	 * @see #getWorkflowLatencyMeter()
	 * @generated
	 */
	EReference getWorkflowLatencyMeter_Metric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.TaskProcessingAmountMeter <em>Task Processing Amount Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Processing Amount Meter</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmountMeter
	 * @generated
	 */
	EClass getTaskProcessingAmountMeter();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getOwner()
	 * @see #getTaskProcessingAmountMeter()
	 * @generated
	 */
	EReference getTaskProcessingAmountMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getMetric()
	 * @see #getTaskProcessingAmountMeter()
	 * @generated
	 */
	EReference getTaskProcessingAmountMeter_Metric();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent
	 * @generated
	 */
	EClass getSystemComponent();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getArtifactName()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactLocator <em>Artifact Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Locator</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getArtifactLocator()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_ArtifactLocator();

	/**
	 * Returns the meta object for the attribute list '{@link PASYS_Metamodel.pasys.SystemComponent#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getArguments()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getScriptFolderPath <em>Script Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getScriptFolderPath()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_ScriptFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getConfigFolderPath <em>Config Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getConfigFolderPath()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_ConfigFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getDataFolderPath <em>Data Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getDataFolderPath()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_DataFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#getLogFolderPath <em>Log Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#getLogFolderPath()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_LogFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SystemComponent#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponent#isIsRunning()
	 * @see #getSystemComponent()
	 * @generated
	 */
	EAttribute getSystemComponent_IsRunning();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.SystemComponent#deploy() <em>Deploy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy</em>' operation.
	 * @see PASYS_Metamodel.pasys.SystemComponent#deploy()
	 * @generated
	 */
	EOperation getSystemComponent__Deploy();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.FileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Descriptor</em>'.
	 * @see PASYS_Metamodel.pasys.FileDescriptor
	 * @generated
	 */
	EClass getFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.FileDescriptor#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see PASYS_Metamodel.pasys.FileDescriptor#getFilePath()
	 * @see #getFileDescriptor()
	 * @generated
	 */
	EAttribute getFileDescriptor_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.FileDescriptor#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see PASYS_Metamodel.pasys.FileDescriptor#getFileName()
	 * @see #getFileDescriptor()
	 * @generated
	 */
	EAttribute getFileDescriptor_FileName();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ArtifactDescriptor <em>Artifact Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Descriptor</em>'.
	 * @see PASYS_Metamodel.pasys.ArtifactDescriptor
	 * @generated
	 */
	EClass getArtifactDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ArtifactDescriptor#getFileLocator <em>File Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Locator</em>'.
	 * @see PASYS_Metamodel.pasys.ArtifactDescriptor#getFileLocator()
	 * @see #getArtifactDescriptor()
	 * @generated
	 */
	EAttribute getArtifactDescriptor_FileLocator();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor <em>Deployment File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment File Descriptor</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentFileDescriptor
	 * @generated
	 */
	EClass getDeploymentFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Content</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentFileDescriptor#getFileContent()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentFileDescriptor_FileContent();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentFileDescriptor#getElementType()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentFileDescriptor_ElementType();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentFileDescriptor#getOwner()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EReference getDeploymentFileDescriptor_Owner();

	/**
	 * Returns the meta object for class '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Exception</em>'.
	 * @see PASYS_Metamodel.pasys.ConfigurationException
	 * @generated
	 */
	EClass getConfigurationException();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Exception</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentException
	 * @generated
	 */
	EClass getDeploymentException();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Exception</em>'.
	 * @see PASYS_Metamodel.pasys.LaunchException
	 * @generated
	 */
	EClass getLaunchException();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ExporterData <em>Exporter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exporter Data</em>'.
	 * @see PASYS_Metamodel.pasys.ExporterData
	 * @generated
	 */
	EClass getExporterData();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ExporterData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PASYS_Metamodel.pasys.ExporterData#getName()
	 * @see #getExporterData()
	 * @generated
	 */
	EAttribute getExporterData_Name();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ExporterData#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see PASYS_Metamodel.pasys.ExporterData#getArtifact()
	 * @see #getExporterData()
	 * @generated
	 */
	EAttribute getExporterData_Artifact();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see PASYS_Metamodel.pasys.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Container#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.Container#getHost()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Host();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Container</em>'.
	 * @see PASYS_Metamodel.pasys.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.DockerContainer#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see PASYS_Metamodel.pasys.DockerContainer#getService()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Service();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ContainerizationServer <em>Containerization Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containerization Server</em>'.
	 * @see PASYS_Metamodel.pasys.ContainerizationServer
	 * @generated
	 */
	EClass getContainerizationServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DockerServer <em>Docker Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Server</em>'.
	 * @see PASYS_Metamodel.pasys.DockerServer
	 * @generated
	 */
	EClass getDockerServer();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.DockerServer#getStacks <em>Stacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stacks</em>'.
	 * @see PASYS_Metamodel.pasys.DockerServer#getStacks()
	 * @see #getDockerServer()
	 * @generated
	 */
	EReference getDockerServer_Stacks();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.DockerServer#getSwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swarm Cluster</em>'.
	 * @see PASYS_Metamodel.pasys.DockerServer#getSwarmCluster()
	 * @see #getDockerServer()
	 * @generated
	 */
	EReference getDockerServer_SwarmCluster();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.OrchestrationServer <em>Orchestration Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration Server</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServer
	 * @generated
	 */
	EClass getOrchestrationServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SwarmServer <em>Swarm Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Server</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmServer
	 * @generated
	 */
	EClass getSwarmServer();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Cluster</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmCluster
	 * @generated
	 */
	EClass getSwarmCluster();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.SwarmCluster#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workers</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmCluster#getWorkers()
	 * @see #getSwarmCluster()
	 * @generated
	 */
	EReference getSwarmCluster_Workers();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SwarmCluster#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmCluster#getManager()
	 * @see #getSwarmCluster()
	 * @generated
	 */
	EReference getSwarmCluster_Manager();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Stack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see PASYS_Metamodel.pasys.Stack
	 * @generated
	 */
	EClass getStack();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Stack#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see PASYS_Metamodel.pasys.Stack#getServices()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_Services();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Stack#getSwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swarm Cluster</em>'.
	 * @see PASYS_Metamodel.pasys.Stack#getSwarmCluster()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_SwarmCluster();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Stack#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see PASYS_Metamodel.pasys.Stack#getVersion()
	 * @see #getStack()
	 * @generated
	 */
	EAttribute getStack_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Stack#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see PASYS_Metamodel.pasys.Stack#getNetworks()
	 * @see #getStack()
	 * @generated
	 */
	EReference getStack_Networks();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see PASYS_Metamodel.pasys.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.Service#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stack</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getStack()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Stack();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Service#getEnvFile <em>Env File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env File</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getEnvFile()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_EnvFile();

	/**
	 * Returns the meta object for the map '{@link PASYS_Metamodel.pasys.Service#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Env</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getEnv()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Env();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.Service#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getDependsOn()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DependsOn();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Service#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getImage()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Image();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Service#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getVolumes()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Service#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getNetworks()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Networks();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.Service#getDeploymentParam <em>Deployment Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Param</em>'.
	 * @see PASYS_Metamodel.pasys.Service#getDeploymentParam()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DeploymentParam();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see PASYS_Metamodel.pasys.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Port#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.Port#getTarget()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Target();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Port#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see PASYS_Metamodel.pasys.Port#getPublished()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Published();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Port#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see PASYS_Metamodel.pasys.Port#getProtocol()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Port#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see PASYS_Metamodel.pasys.Port#getMode()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Mode();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ServiceNetwork <em>Service Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Network</em>'.
	 * @see PASYS_Metamodel.pasys.ServiceNetwork
	 * @generated
	 */
	EClass getServiceNetwork();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ServiceNetwork#getIpv4Address <em>Ipv4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipv4 Address</em>'.
	 * @see PASYS_Metamodel.pasys.ServiceNetwork#getIpv4Address()
	 * @see #getServiceNetwork()
	 * @generated
	 */
	EAttribute getServiceNetwork_Ipv4Address();

	/**
	 * Returns the meta object for the attribute list '{@link PASYS_Metamodel.pasys.ServiceNetwork#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see PASYS_Metamodel.pasys.ServiceNetwork#getAliases()
	 * @see #getServiceNetwork()
	 * @generated
	 */
	EAttribute getServiceNetwork_Aliases();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.ServiceNetwork#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see PASYS_Metamodel.pasys.ServiceNetwork#getNetwork()
	 * @see #getServiceNetwork()
	 * @generated
	 */
	EReference getServiceNetwork_Network();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SwarmNetwork <em>Swarm Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Network</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmNetwork
	 * @generated
	 */
	EClass getSwarmNetwork();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SwarmNetwork#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnets</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmNetwork#getSubnets()
	 * @see #getSwarmNetwork()
	 * @generated
	 */
	EReference getSwarmNetwork_Subnets();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SwarmNetwork#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmNetwork#getDriver()
	 * @see #getSwarmNetwork()
	 * @generated
	 */
	EAttribute getSwarmNetwork_Driver();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see PASYS_Metamodel.pasys.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Image#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see PASYS_Metamodel.pasys.Image#getRepository()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Repository();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Image#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see PASYS_Metamodel.pasys.Image#getTag()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Tag();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Image#getDockerFile <em>Docker File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker File</em>'.
	 * @see PASYS_Metamodel.pasys.Image#getDockerFile()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_DockerFile();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Image#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see PASYS_Metamodel.pasys.Image#getDescription()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Description();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Image#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see PASYS_Metamodel.pasys.Image#getSize()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Size();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see PASYS_Metamodel.pasys.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Volume#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see PASYS_Metamodel.pasys.Volume#getSource()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Source();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Volume#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see PASYS_Metamodel.pasys.Volume#getTarget()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Target();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Volume#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see PASYS_Metamodel.pasys.Volume#isReadOnly()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Volume#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PASYS_Metamodel.pasys.Volume#getType()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Type();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see PASYS_Metamodel.pasys.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Deployment#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see PASYS_Metamodel.pasys.Deployment#getReplicas()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Replicas();

	/**
	 * Returns the meta object for the map '{@link PASYS_Metamodel.pasys.Deployment#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Placement</em>'.
	 * @see PASYS_Metamodel.pasys.Deployment#getPlacement()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Placement();

	/**
	 * Returns the meta object for the map '{@link PASYS_Metamodel.pasys.Deployment#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Restart Policy</em>'.
	 * @see PASYS_Metamodel.pasys.Deployment#getRestartPolicy()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_RestartPolicy();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see PASYS_Metamodel.pasys.Registry
	 * @generated
	 */
	EClass getRegistry();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Registry#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PASYS_Metamodel.pasys.Registry#getUrl()
	 * @see #getRegistry()
	 * @generated
	 */
	EAttribute getRegistry_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Registry#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see PASYS_Metamodel.pasys.Registry#getRepositories()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_Repositories();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see PASYS_Metamodel.pasys.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.Repository#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see PASYS_Metamodel.pasys.Repository#getImages()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Images();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Repository#isIsPrivate <em>Is Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Private</em>'.
	 * @see PASYS_Metamodel.pasys.Repository#isIsPrivate()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_IsPrivate();

	/**
	 * Returns the meta object for class '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated NOT
	 */
	
	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Exception</em>'.
	 * @see PASYS_Metamodel.pasys.ConfigurationException
	 * @generated NOT
	 */
	
	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Exception</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentException
	 * @generated NOT
	 */
	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Exception</em>'.
	 * @see PASYS_Metamodel.pasys.LaunchException
	 * @generated NOT
	 */
	

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NodeCluster <em>Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Cluster</em>'.
	 * @see PASYS_Metamodel.pasys.NodeCluster
	 * @generated
	 */
	EClass getNodeCluster();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PrometheusMeter <em>Prometheus Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prometheus Meter</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusMeter
	 * @generated
	 */
	EClass getPrometheusMeter();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringPort <em>Monitoring Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Port</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringPort()
	 * @see #getPrometheusMeter()
	 * @generated
	 */
	EAttribute getPrometheusMeter_MonitoringPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringTime <em>Monitoring Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Time</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringTime()
	 * @see #getPrometheusMeter()
	 * @generated
	 */
	EAttribute getPrometheusMeter_MonitoringTime();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.PrometheusMeter#getPrometheusServerConfiguration() <em>Get Prometheus Server Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * @see PASYS_Metamodel.pasys.PrometheusMeter#getPrometheusServerConfiguration()
	 * @generated
	 */
	EOperation getPrometheusMeter__GetPrometheusServerConfiguration();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.ExternalElementType <em>External Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>External Element Type</em>'.
	 * @see PASYS_Metamodel.pasys.ExternalElementType
	 * @generated
	 */
	EEnum getExternalElementType();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.SystemComponentType <em>System Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Component Type</em>'.
	 * @see PASYS_Metamodel.pasys.SystemComponentType
	 * @generated
	 */
	EEnum getSystemComponentType();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.PortMode <em>Port Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Mode</em>'.
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @generated
	 */
	EEnum getPortMode();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.NetworkDriver <em>Network Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Driver</em>'.
	 * @see PASYS_Metamodel.pasys.NetworkDriver
	 * @generated
	 */
	EEnum getNetworkDriver();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Type</em>'.
	 * @see PASYS_Metamodel.pasys.VolumeType
	 * @generated
	 */
	EEnum getVolumeType();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PasysFactory getPasysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ComputationalSystemImpl <em>Computational System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ComputationalSystemImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getComputationalSystem()
		 * @generated
		 */
		EClass COMPUTATIONAL_SYSTEM = eINSTANCE.getComputationalSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__NAME = eINSTANCE.getComputationalSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__DATE = eINSTANCE.getComputationalSystem_Date();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__AUTHORS = eINSTANCE.getComputationalSystem_Authors();

		/**
		 * The meta object literal for the '<em><b>Target Platform Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME = eINSTANCE.getComputationalSystem_TargetPlatformName();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__DOC = eINSTANCE.getComputationalSystem_Doc();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS = eINSTANCE.getComputationalSystem_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Referenced Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_SYSTEM__REFERENCED_SYSTEMS = eINSTANCE.getComputationalSystem_ReferencedSystems();

		/**
		 * The meta object literal for the '<em><b>Authentication Files</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES = eINSTANCE.getComputationalSystem_AuthenticationFiles();

		/**
		 * The meta object literal for the '<em><b>Deploy And Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH = eINSTANCE.getComputationalSystem__DeployAndLaunch();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NamedElementImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SystemElementImpl <em>System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SystemElementImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemElement()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ELEMENT__OWNER = eINSTANCE.getSystemElement_Owner();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SystemExternalElementImpl <em>System External Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SystemExternalElementImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemExternalElement()
		 * @generated
		 */
		EClass SYSTEM_EXTERNAL_ELEMENT = eINSTANCE.getSystemExternalElement();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_EXTERNAL_ELEMENT__ELEMENT_TYPE = eINSTANCE.getSystemExternalElement_ElementType();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl <em>System Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SystemAdapterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemAdapter()
		 * @generated
		 */
		EClass SYSTEM_ADAPTER = eINSTANCE.getSystemAdapter();

		/**
		 * The meta object literal for the '<em><b>Id Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADAPTER__ID_PREFIX = eINSTANCE.getSystemAdapter_IdPrefix();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADAPTER__PREFIX = eINSTANCE.getSystemAdapter_Prefix();

		/**
		 * The meta object literal for the '<em><b>Elem Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ADAPTER__ELEM_MAPPING = eINSTANCE.getSystemAdapter_ElemMapping();

		/**
		 * The meta object literal for the '<em><b>System Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ADAPTER__SYSTEM_TARGET = eINSTANCE.getSystemAdapter_SystemTarget();

		/**
		 * The meta object literal for the '<em><b>Target Sys Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ADAPTER__TARGET_SYS_LOCATOR = eINSTANCE.getSystemAdapter_TargetSysLocator();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl <em>System Element Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemElementAdapter()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT_ADAPTER = eINSTANCE.getSystemElementAdapter();

		/**
		 * The meta object literal for the '<em><b>Elem Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ELEMENT_ADAPTER__ELEM_NAME = eINSTANCE.getSystemElementAdapter_ElemName();

		/**
		 * The meta object literal for the '<em><b>Source Elem Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID = eINSTANCE.getSystemElementAdapter_SourceElemId();

		/**
		 * The meta object literal for the '<em><b>Target Elem Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID = eINSTANCE.getSystemElementAdapter_TargetElemId();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PlatformResourceImpl <em>Platform Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PlatformResourceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformResource()
		 * @generated
		 */
		EClass PLATFORM_RESOURCE = eINSTANCE.getPlatformResource();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl <em>Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNode()
		 * @generated
		 */
		EClass PROCESSING_NODE = eINSTANCE.getProcessingNode();

		/**
		 * The meta object literal for the '<em><b>Concurrency Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__CONCURRENCY_LEVEL = eINSTANCE.getProcessingNode_ConcurrencyLevel();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CONNECTED_TO = eINSTANCE.getProcessingNode_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Launching Scripts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__LAUNCHING_SCRIPTS = eINSTANCE.getProcessingNode_LaunchingScripts();

		/**
		 * The meta object literal for the '<em><b>Config Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CONFIG_FILES = eINSTANCE.getProcessingNode_ConfigFiles();

		/**
		 * The meta object literal for the '<em><b>Property Config Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__PROPERTY_CONFIG_DATA = eINSTANCE.getProcessingNode_PropertyConfigData();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__OWNED_METERS = eINSTANCE.getProcessingNode_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__IP = eINSTANCE.getProcessingNode_Ip();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__USER_NAME = eINSTANCE.getProcessingNode_UserName();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__MEMORY_SIZE = eINSTANCE.getProcessingNode_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__SPEED_FACTOR = eINSTANCE.getProcessingNode_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Code Files</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CODE_FILES = eINSTANCE.getProcessingNode_CodeFiles();

		/**
		 * The meta object literal for the '<em><b>Prepare For Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = eINSTANCE.getProcessingNode__PrepareForDeployment();

		/**
		 * The meta object literal for the '<em><b>Deploy And Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___DEPLOY_AND_LAUNCH = eINSTANCE.getProcessingNode__DeployAndLaunch();

		/**
		 * The meta object literal for the '<em><b>Bring Back Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___BRING_BACK_CONFIGURATION = eINSTANCE.getProcessingNode__BringBackConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bring Back Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___BRING_BACK_DEPLOYMENT = eINSTANCE.getProcessingNode__BringBackDeployment();

		/**
		 * The meta object literal for the '<em><b>Abort Launching</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ABORT_LAUNCHING = eINSTANCE.getProcessingNode__AbortLaunching();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PhysicalProcessingNodeImpl <em>Physical Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PhysicalProcessingNodeImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPhysicalProcessingNode()
		 * @generated
		 */
		EClass PHYSICAL_PROCESSING_NODE = eINSTANCE.getPhysicalProcessingNode();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PROCESSING_NODE__OS = eINSTANCE.getPhysicalProcessingNode_Os();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.VirtualProcessingNodeImpl <em>Virtual Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.VirtualProcessingNodeImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVirtualProcessingNode()
		 * @generated
		 */
		EClass VIRTUAL_PROCESSING_NODE = eINSTANCE.getVirtualProcessingNode();

		/**
		 * The meta object literal for the '<em><b>External IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = eINSTANCE.getVirtualProcessingNode_ExternalIP();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl <em>AWS Virtual Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAWSVirtualProcessingNode()
		 * @generated
		 */
		EClass AWS_VIRTUAL_PROCESSING_NODE = eINSTANCE.getAWSVirtualProcessingNode();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__VPC = eINSTANCE.getAWSVirtualProcessingNode_Vpc();

		/**
		 * The meta object literal for the '<em><b>Sub Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__SUB_NET = eINSTANCE.getAWSVirtualProcessingNode_SubNet();

		/**
		 * The meta object literal for the '<em><b>Key Pair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR = eINSTANCE.getAWSVirtualProcessingNode_KeyPair();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP = eINSTANCE.getAWSVirtualProcessingNode_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>AMI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__AMI = eINSTANCE.getAWSVirtualProcessingNode_AMI();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE = eINSTANCE.getAWSVirtualProcessingNode_InstanceType();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ResourceClusterImpl <em>Resource Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ResourceClusterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getResourceCluster()
		 * @generated
		 */
		EClass RESOURCE_CLUSTER = eINSTANCE.getResourceCluster();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CLUSTER__RESOURCES = eINSTANCE.getResourceCluster_Resources();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NetworkImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Bandwith</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__BANDWITH = eINSTANCE.getNetwork_Bandwith();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl <em>Platform Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PlatformServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformServer()
		 * @generated
		 */
		EClass PLATFORM_SERVER = eINSTANCE.getPlatformServer();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVER__HOST = eINSTANCE.getPlatformServer_Host();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVER__TARGET = eINSTANCE.getPlatformServer_Target();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVER__CONTAINER = eINSTANCE.getPlatformServer_Container();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SerializationServerImpl <em>Serialization Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SerializationServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSerializationServer()
		 * @generated
		 */
		EClass SERIALIZATION_SERVER = eINSTANCE.getSerializationServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.AVROServerImpl <em>AVRO Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.AVROServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAVROServer()
		 * @generated
		 */
		EClass AVRO_SERVER = eINSTANCE.getAVROServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DistributionServerImpl <em>Distribution Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DistributionServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDistributionServer()
		 * @generated
		 */
		EClass DISTRIBUTION_SERVER = eINSTANCE.getDistributionServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ZookeeperServerImpl <em>Zookeeper Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ZookeeperServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getZookeeperServer()
		 * @generated
		 */
		EClass ZOOKEEPER_SERVER = eINSTANCE.getZookeeperServer();

		/**
		 * The meta object literal for the '<em><b>Server Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__SERVER_ID = eINSTANCE.getZookeeperServer_ServerId();

		/**
		 * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__TICK_TIME = eINSTANCE.getZookeeperServer_TickTime();

		/**
		 * The meta object literal for the '<em><b>Leader Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__LEADER_SERVERS = eINSTANCE.getZookeeperServer_LeaderServers();

		/**
		 * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__INIT_LIMIT = eINSTANCE.getZookeeperServer_InitLimit();

		/**
		 * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__SYNC_LIMIT = eINSTANCE.getZookeeperServer_SyncLimit();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__CLIENT_PORT = eINSTANCE.getZookeeperServer_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Peer Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__PEER_PORT = eINSTANCE.getZookeeperServer_PeerPort();

		/**
		 * The meta object literal for the '<em><b>Leader Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVER__LEADER_PORT = eINSTANCE.getZookeeperServer_LeaderPort();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.CommunicationServerImpl <em>Communication Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.CommunicationServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationServer()
		 * @generated
		 */
		EClass COMMUNICATION_SERVER = eINSTANCE.getCommunicationServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KafkaServerImpl <em>Kafka Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KafkaServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaServer()
		 * @generated
		 */
		EClass KAFKA_SERVER = eINSTANCE.getKafkaServer();

		/**
		 * The meta object literal for the '<em><b>Comm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__COMM_ID = eINSTANCE.getKafkaServer_CommId();

		/**
		 * The meta object literal for the '<em><b>Auto Create Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__AUTO_CREATE_TOPIC_ENABLE = eINSTANCE.getKafkaServer_AutoCreateTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Delete Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__DELETE_TOPIC_ENABLE = eINSTANCE.getKafkaServer_DeleteTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_SERVER__ZOOKEEPER_CONNECT = eINSTANCE.getKafkaServer_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__ZOOKEEPER_CONNECTION_TIMEOUT = eINSTANCE.getKafkaServer_ZookeeperConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Num Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__NUM_PARTITIONS = eINSTANCE.getKafkaServer_NumPartitions();

		/**
		 * The meta object literal for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__NUM_RECOVERY_THREADS_PER_DATA_DIR = eINSTANCE.getKafkaServer_NumRecoveryThreadsPerDataDir();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__LOG_FLUSH_INTERVAL_MESSAGES = eINSTANCE.getKafkaServer_LogFlushIntervalMessages();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__LOG_FLUSH_INTERVAL = eINSTANCE.getKafkaServer_LogFlushInterval();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__LISTENERS = eINSTANCE.getKafkaServer_Listeners();

		/**
		 * The meta object literal for the '<em><b>Advertised Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__ADVERTISED_LISTENERS = eINSTANCE.getKafkaServer_AdvertisedListeners();

		/**
		 * The meta object literal for the '<em><b>Num Network Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__NUM_NETWORK_THREADS = eINSTANCE.getKafkaServer_NumNetworkThreads();

		/**
		 * The meta object literal for the '<em><b>Num IO Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__NUM_IO_THREADS = eINSTANCE.getKafkaServer_NumIOThreads();

		/**
		 * The meta object literal for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__SOCKET_SEND_BUFFER_BYTES = eINSTANCE.getKafkaServer_SocketSendBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__SOCKET_RECEIVE_BUFFER_BYTES = eINSTANCE.getKafkaServer_SocketReceiveBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Request Max Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__SOCKET_REQUEST_MAX_BYTES = eINSTANCE.getKafkaServer_SocketRequestMaxBytes();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVER__CLIENT_PORT = eINSTANCE.getKafkaServer_ClientPort();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SchedulingServerImpl <em>Scheduling Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SchedulingServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulingServer()
		 * @generated
		 */
		EClass SCHEDULING_SERVER = eINSTANCE.getSchedulingServer();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVER__WORKFLOWS = eINSTANCE.getSchedulingServer_Workflows();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NodeSchedulerImpl <em>Node Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NodeSchedulerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeScheduler()
		 * @generated
		 */
		EClass NODE_SCHEDULER = eINSTANCE.getNodeScheduler();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SparkServerImpl <em>Spark Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SparkServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSparkServer()
		 * @generated
		 */
		EClass SPARK_SERVER = eINSTANCE.getSparkServer();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVER__LOAD = eINSTANCE.getSparkServer_Load();

		/**
		 * The meta object literal for the '<em><b>Driver Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__DRIVER_CORES = eINSTANCE.getSparkServer_DriverCores();

		/**
		 * The meta object literal for the '<em><b>Driver Max Result Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__DRIVER_MAX_RESULT_SIZE = eINSTANCE.getSparkServer_DriverMaxResultSize();

		/**
		 * The meta object literal for the '<em><b>Driver Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__DRIVER_MEMORY = eINSTANCE.getSparkServer_DriverMemory();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__LOCAL_DIR = eINSTANCE.getSparkServer_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVER__MASTER = eINSTANCE.getSparkServer_Master();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__WINDOW_SIZE = eINSTANCE.getSparkServer_WindowSize();

		/**
		 * The meta object literal for the '<em><b>Executor Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__EXECUTOR_MEMORY = eINSTANCE.getSparkServer_ExecutorMemory();

		/**
		 * The meta object literal for the '<em><b>Extra Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__EXTRA_LISTENER = eINSTANCE.getSparkServer_ExtraListener();

		/**
		 * The meta object literal for the '<em><b>Log Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__LOG_CONF = eINSTANCE.getSparkServer_LogConf();

		/**
		 * The meta object literal for the '<em><b>Submit Deploy Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__SUBMIT_DEPLOY_MODE = eINSTANCE.getSparkServer_SubmitDeployMode();

		/**
		 * The meta object literal for the '<em><b>Log Caller Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__LOG_CALLER_CONTEXT = eINSTANCE.getSparkServer_LogCallerContext();

		/**
		 * The meta object literal for the '<em><b>Driver Superviser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVER__DRIVER_SUPERVISER = eINSTANCE.getSparkServer_DriverSuperviser();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StormServerImpl <em>Storm Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StormServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormServer()
		 * @generated
		 */
		EClass STORM_SERVER = eINSTANCE.getStormServer();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVER__ZOOKEEPER_CONNECT = eINSTANCE.getStormServer_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVER__LOCAL_DIR = eINSTANCE.getStormServer_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Nimbus Seeds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVER__NIMBUS_SEEDS = eINSTANCE.getStormServer_NimbusSeeds();

		/**
		 * The meta object literal for the '<em><b>Supervisor Slot Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVER__SUPERVISOR_SLOT_PORTS = eINSTANCE.getStormServer_SupervisorSlotPorts();

		/**
		 * The meta object literal for the '<em><b>Drpc Servers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVER__DRPC_SERVERS = eINSTANCE.getStormServer_DrpcServers();

		/**
		 * The meta object literal for the '<em><b>Supervisors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVER__SUPERVISORS = eINSTANCE.getStormServer_Supervisors();

		/**
		 * The meta object literal for the '<em><b>Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVER__UI_PORT = eINSTANCE.getStormServer_UiPort();

		/**
		 * The meta object literal for the '<em><b>Is Nimbus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVER__IS_NIMBUS = eINSTANCE.getStormServer_IsNimbus();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PersistenceServerImpl <em>Persistence Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PersistenceServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPersistenceServer()
		 * @generated
		 */
		EClass PERSISTENCE_SERVER = eINSTANCE.getPersistenceServer();

		/**
		 * The meta object literal for the '<em><b>Logging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVER__LOGGING = eINSTANCE.getPersistenceServer_Logging();

		/**
		 * The meta object literal for the '<em><b>Passwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVER__PASSWD = eINSTANCE.getPersistenceServer_Passwd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVER__PORT = eINSTANCE.getPersistenceServer_Port();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MemSQLServerImpl <em>Mem SQL Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MemSQLServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMemSQLServer()
		 * @generated
		 */
		EClass MEM_SQL_SERVER = eINSTANCE.getMemSQLServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.CassandraServerImpl <em>Cassandra Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.CassandraServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCassandraServer()
		 * @generated
		 */
		EClass CASSANDRA_SERVER = eINSTANCE.getCassandraServer();

		/**
		 * The meta object literal for the '<em><b>Num Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__NUM_TOKENS = eINSTANCE.getCassandraServer_NumTokens();

		/**
		 * The meta object literal for the '<em><b>Seeds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__SEEDS = eINSTANCE.getCassandraServer_Seeds();

		/**
		 * The meta object literal for the '<em><b>Seed Provider Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__SEED_PROVIDER_CLASS = eINSTANCE.getCassandraServer_SeedProviderClass();

		/**
		 * The meta object literal for the '<em><b>Listen Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__LISTEN_ADDRESS = eINSTANCE.getCassandraServer_ListenAddress();

		/**
		 * The meta object literal for the '<em><b>Rpc Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__RPC_ADDRESS = eINSTANCE.getCassandraServer_RpcAddress();

		/**
		 * The meta object literal for the '<em><b>Endpoint Snitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__ENDPOINT_SNITCH = eINSTANCE.getCassandraServer_EndpointSnitch();

		/**
		 * The meta object literal for the '<em><b>Data Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__DATA_CENTER = eINSTANCE.getCassandraServer_DataCenter();

		/**
		 * The meta object literal for the '<em><b>Cql Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__CQL_SCHEMAS = eINSTANCE.getCassandraServer_CqlSchemas();

		/**
		 * The meta object literal for the '<em><b>Is Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__IS_SEED = eINSTANCE.getCassandraServer_IsSeed();

		/**
		 * The meta object literal for the '<em><b>Data File Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__DATA_FILE_DIR = eINSTANCE.getCassandraServer_DataFileDir();

		/**
		 * The meta object literal for the '<em><b>Native Transport Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__NATIVE_TRANSPORT_PORT = eINSTANCE.getCassandraServer_NativeTransportPort();

		/**
		 * The meta object literal for the '<em><b>Rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVER__RACK = eINSTANCE.getCassandraServer_Rack();

		/**
		 * The meta object literal for the '<em><b>Auto Bootstrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVER__AUTO_BOOTSTRAP = eINSTANCE.getCassandraServer_AutoBootstrap();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.Neo4JServerImpl <em>Neo4 JServer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.Neo4JServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNeo4JServer()
		 * @generated
		 */
		EClass NEO4_JSERVER = eINSTANCE.getNeo4JServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MonitoringServerImpl <em>Monitoring Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MonitoringServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMonitoringServer()
		 * @generated
		 */
		EClass MONITORING_SERVER = eINSTANCE.getMonitoringServer();

		/**
		 * The meta object literal for the '<em><b>Monitorized Meters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_SERVER__MONITORIZED_METERS = eINSTANCE.getMonitoringServer_MonitorizedMeters();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PrometheusServerImpl <em>Prometheus Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PrometheusServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusServer()
		 * @generated
		 */
		EClass PROMETHEUS_SERVER = eINSTANCE.getPrometheusServer();

		/**
		 * The meta object literal for the '<em><b>Exporters Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMETHEUS_SERVER__EXPORTERS_DATA = eINSTANCE.getPrometheusServer_ExportersData();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StreamDataImpl <em>Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamData()
		 * @generated
		 */
		EClass STREAM_DATA = eINSTANCE.getStreamData();

		/**
		 * The meta object literal for the '<em><b>Retention ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__RETENTION_MS = eINSTANCE.getStreamData_Retention_ms();

		/**
		 * The meta object literal for the '<em><b>Retention bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__RETENTION_BYTES = eINSTANCE.getStreamData_Retention_bytes();

		/**
		 * The meta object literal for the '<em><b>Cleanup Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__CLEANUP_POLICY = eINSTANCE.getStreamData_CleanupPolicy();

		/**
		 * The meta object literal for the '<em><b>Num Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__NUM_PARTITIONS = eINSTANCE.getStreamData_NumPartitions();

		/**
		 * The meta object literal for the '<em><b>Num Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__NUM_REPLICATION = eINSTANCE.getStreamData_NumReplication();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA__OWNED_METERS = eINSTANCE.getStreamData_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Assigned Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA__ASSIGNED_PARTITION = eINSTANCE.getStreamData_AssignedPartition();

		/**
		 * The meta object literal for the '<em><b>Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__MESSAGE_SIZE = eINSTANCE.getStreamData_MessageSize();

		/**
		 * The meta object literal for the '<em><b>Schema File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__SCHEMA_FILE = eINSTANCE.getStreamData_SchemaFile();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl <em>Stream Data Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataPartition()
		 * @generated
		 */
		EClass STREAM_DATA_PARTITION = eINSTANCE.getStreamDataPartition();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA_PARTITION__KEY = eINSTANCE.getStreamDataPartition_Key();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA_PARTITION__HOST = eINSTANCE.getStreamDataPartition_Host();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl <em>Workflow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowStreamData()
		 * @generated
		 */
		EClass WORKFLOW_STREAM_DATA = eINSTANCE.getWorkflowStreamData();

		/**
		 * The meta object literal for the '<em><b>Is Single Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STREAM_DATA__IS_SINGLE_USE = eINSTANCE.getWorkflowStreamData_IsSingleUse();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_STREAM_DATA__OWNER = eINSTANCE.getWorkflowStreamData_Owner();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl <em>Flow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.FlowStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFlowStreamData()
		 * @generated
		 */
		EClass FLOW_STREAM_DATA = eINSTANCE.getFlowStreamData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__SOURCE = eINSTANCE.getFlowStreamData_Source();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__PREDECESSOR = eINSTANCE.getFlowStreamData_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__HOLDER = eINSTANCE.getFlowStreamData_Holder();

		/**
		 * The meta object literal for the '<em><b>Is Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_STREAM_DATA__IS_IMPLEMENTED = eINSTANCE.getFlowStreamData_IsImplemented();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl <em>Kafka Flow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaFlowStreamData()
		 * @generated
		 */
		EClass KAFKA_FLOW_STREAM_DATA = eINSTANCE.getKafkaFlowStreamData();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl <em>Derived Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDerivedStreamData()
		 * @generated
		 */
		EClass DERIVED_STREAM_DATA = eINSTANCE.getDerivedStreamData();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_STREAM_DATA__PATTERN = eINSTANCE.getDerivedStreamData_Pattern();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_STREAM_DATA__INPUTS = eINSTANCE.getDerivedStreamData_Inputs();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl <em>Workload Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkloadStreamData()
		 * @generated
		 */
		EClass WORKLOAD_STREAM_DATA = eINSTANCE.getWorkloadStreamData();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_STREAM_DATA__HOLDER = eINSTANCE.getWorkloadStreamData_Holder();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl <em>Kafka Workload Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaWorkloadStreamData()
		 * @generated
		 */
		EClass KAFKA_WORKLOAD_STREAM_DATA = eINSTANCE.getKafkaWorkloadStreamData();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.WorkflowImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Owned Stream Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_STREAM_DATA = eINSTANCE.getWorkflow_OwnedStreamData();

		/**
		 * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_TASKS = eINSTANCE.getWorkflow_OwnedTasks();

		/**
		 * The meta object literal for the '<em><b>Root Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ROOT_TASK = eINSTANCE.getWorkflow_RootTask();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__SCHEDULER = eINSTANCE.getWorkflow_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_METERS = eINSTANCE.getWorkflow_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Owned Task Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_TASK_EXECUTORS = eINSTANCE.getWorkflow_OwnedTaskExecutors();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SchedulableSetImpl <em>Schedulable Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SchedulableSetImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulableSet()
		 * @generated
		 */
		EClass SCHEDULABLE_SET = eINSTANCE.getSchedulableSet();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_SET__WORKFLOWS = eINSTANCE.getSchedulableSet_Workflows();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.TaskImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Implementing Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPLEMENTING_CLASS_NAME = eINSTANCE.getTask_ImplementingClassName();

		/**
		 * The meta object literal for the '<em><b>Returned Stream Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RETURNED_STREAM_DATA = eINSTANCE.getTask_ReturnedStreamData();

		/**
		 * The meta object literal for the '<em><b>Trigger Stream Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRIGGER_STREAM_DATA = eINSTANCE.getTask_TriggerStreamData();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OWNER = eINSTANCE.getTask_Owner();

		/**
		 * The meta object literal for the '<em><b>Input Stream Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT_STREAM_DATA = eINSTANCE.getTask_InputStreamData();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl <em>Task Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.TaskExecutorImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskExecutor()
		 * @generated
		 */
		EClass TASK_EXECUTOR = eINSTANCE.getTaskExecutor();

		/**
		 * The meta object literal for the '<em><b>Executed Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__EXECUTED_TASKS = eINSTANCE.getTaskExecutor_ExecutedTasks();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__OWNED_METERS = eINSTANCE.getTaskExecutor_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__OWNER = eINSTANCE.getTaskExecutor_Owner();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MetricImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl <em>Processing Node Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeUtilization()
		 * @generated
		 */
		EClass PROCESSING_NODE_UTILIZATION = eINSTANCE.getProcessingNodeUtilization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_UTILIZATION__TARGET = eINSTANCE.getProcessingNodeUtilization_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_UTILIZATION__METER = eINSTANCE.getProcessingNodeUtilization_Meter();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl <em>Processing Node Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeMemory()
		 * @generated
		 */
		EClass PROCESSING_NODE_MEMORY = eINSTANCE.getProcessingNodeMemory();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_MEMORY__TARGET = eINSTANCE.getProcessingNodeMemory_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_MEMORY__METER = eINSTANCE.getProcessingNodeMemory_Meter();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl <em>Network Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetworkUtilization()
		 * @generated
		 */
		EClass NETWORK_UTILIZATION = eINSTANCE.getNetworkUtilization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_UTILIZATION__TARGET = eINSTANCE.getNetworkUtilization_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_UTILIZATION__METER = eINSTANCE.getNetworkUtilization_Meter();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl <em>Workflow Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatency()
		 * @generated
		 */
		EClass WORKFLOW_LATENCY = eINSTANCE.getWorkflowLatency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY__TARGET = eINSTANCE.getWorkflowLatency_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY__METER = eINSTANCE.getWorkflowLatency_Meter();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl <em>Task Processing Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmount()
		 * @generated
		 */
		EClass TASK_PROCESSING_AMOUNT = eINSTANCE.getTaskProcessingAmount();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT__TARGET = eINSTANCE.getTaskProcessingAmount_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT__METER = eINSTANCE.getTaskProcessingAmount_Meter();

		/**
		 * The meta object literal for the '<em><b>Histogram Buckect Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM = eINSTANCE.getTaskProcessingAmount_HistogramBuckectNum();

		/**
		 * The meta object literal for the '<em><b>Expected Max TPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA = eINSTANCE.getTaskProcessingAmount_ExpectedMaxTPA();

		/**
		 * The meta object literal for the '<em><b>Expected Min TPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA = eINSTANCE.getTaskProcessingAmount_ExpectedMinTPA();

		/**
		 * The meta object literal for the '<em><b>Linear Bucket Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION = eINSTANCE.getTaskProcessingAmount_LinearBucketDistribution();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StreamDataRateImpl <em>Stream Data Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StreamDataRateImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataRate()
		 * @generated
		 */
		EClass STREAM_DATA_RATE = eINSTANCE.getStreamDataRate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA_RATE__TARGET = eINSTANCE.getStreamDataRate_Target();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA_RATE__METER = eINSTANCE.getStreamDataRate_Meter();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Monitoring Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER__MONITORING_SERVER = eINSTANCE.getMeter_MonitoringServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl <em>Node Hosted Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeHostedMeter()
		 * @generated
		 */
		EClass NODE_HOSTED_METER = eINSTANCE.getNodeHostedMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_HOSTED_METER__OWNER = eINSTANCE.getNodeHostedMeter_Owner();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl <em>Node Resource Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeResourceMeter()
		 * @generated
		 */
		EClass NODE_RESOURCE_METER = eINSTANCE.getNodeResourceMeter();

		/**
		 * The meta object literal for the '<em><b>UMetric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESOURCE_METER__UMETRIC = eINSTANCE.getNodeResourceMeter_UMetric();

		/**
		 * The meta object literal for the '<em><b>MMetric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESOURCE_METER__MMETRIC = eINSTANCE.getNodeResourceMeter_MMetric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.CommunicationMeterImpl <em>Communication Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.CommunicationMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationMeter()
		 * @generated
		 */
		EClass COMMUNICATION_METER = eINSTANCE.getCommunicationMeter();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_METER__METRIC = eINSTANCE.getCommunicationMeter_Metric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StreamRateMeterImpl <em>Stream Rate Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StreamRateMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamRateMeter()
		 * @generated
		 */
		EClass STREAM_RATE_METER = eINSTANCE.getStreamRateMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_RATE_METER__OWNER = eINSTANCE.getStreamRateMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_RATE_METER__METRIC = eINSTANCE.getStreamRateMeter_Metric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl <em>Workflow Latency Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatencyMeter()
		 * @generated
		 */
		EClass WORKFLOW_LATENCY_METER = eINSTANCE.getWorkflowLatencyMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY_METER__OWNER = eINSTANCE.getWorkflowLatencyMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY_METER__METRIC = eINSTANCE.getWorkflowLatencyMeter_Metric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl <em>Task Processing Amount Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmountMeter()
		 * @generated
		 */
		EClass TASK_PROCESSING_AMOUNT_METER = eINSTANCE.getTaskProcessingAmountMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT_METER__OWNER = eINSTANCE.getTaskProcessingAmountMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT_METER__METRIC = eINSTANCE.getTaskProcessingAmountMeter_Metric();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SystemComponentImpl <em>System Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SystemComponentImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemComponent()
		 * @generated
		 */
		EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__ARTIFACT_NAME = eINSTANCE.getSystemComponent_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Artifact Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__ARTIFACT_LOCATOR = eINSTANCE.getSystemComponent_ArtifactLocator();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__ARGUMENTS = eINSTANCE.getSystemComponent_Arguments();

		/**
		 * The meta object literal for the '<em><b>Script Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH = eINSTANCE.getSystemComponent_ScriptFolderPath();

		/**
		 * The meta object literal for the '<em><b>Config Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__CONFIG_FOLDER_PATH = eINSTANCE.getSystemComponent_ConfigFolderPath();

		/**
		 * The meta object literal for the '<em><b>Data Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__DATA_FOLDER_PATH = eINSTANCE.getSystemComponent_DataFolderPath();

		/**
		 * The meta object literal for the '<em><b>Log Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__LOG_FOLDER_PATH = eINSTANCE.getSystemComponent_LogFolderPath();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT__IS_RUNNING = eINSTANCE.getSystemComponent_IsRunning();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM_COMPONENT___DEPLOY = eINSTANCE.getSystemComponent__Deploy();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.FileDescriptorImpl <em>File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.FileDescriptorImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFileDescriptor()
		 * @generated
		 */
		EClass FILE_DESCRIPTOR = eINSTANCE.getFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DESCRIPTOR__FILE_PATH = eINSTANCE.getFileDescriptor_FilePath();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DESCRIPTOR__FILE_NAME = eINSTANCE.getFileDescriptor_FileName();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl <em>Artifact Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getArtifactDescriptor()
		 * @generated
		 */
		EClass ARTIFACT_DESCRIPTOR = eINSTANCE.getArtifactDescriptor();

		/**
		 * The meta object literal for the '<em><b>File Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DESCRIPTOR__FILE_LOCATOR = eINSTANCE.getArtifactDescriptor_FileLocator();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl <em>Deployment File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentFileDescriptor()
		 * @generated
		 */
		EClass DEPLOYMENT_FILE_DESCRIPTOR = eINSTANCE.getDeploymentFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>File Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT = eINSTANCE.getDeploymentFileDescriptor_FileContent();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE = eINSTANCE.getDeploymentFileDescriptor_ElementType();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_FILE_DESCRIPTOR__OWNER = eINSTANCE.getDeploymentFileDescriptor_Owner();

		/**
		 * The meta object literal for the '{@link java.lang.Exception <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.ConfigurationException
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getConfigurationException()
		 * @generated
		 */
		EClass CONFIGURATION_EXCEPTION = eINSTANCE.getConfigurationException();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.DeploymentException
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentException()
		 * @generated
		 */
		EClass DEPLOYMENT_EXCEPTION = eINSTANCE.getDeploymentException();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.LaunchException
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getLaunchException()
		 * @generated
		 */
		EClass LAUNCH_EXCEPTION = eINSTANCE.getLaunchException();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ExporterDataImpl <em>Exporter Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ExporterDataImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getExporterData()
		 * @generated
		 */
		EClass EXPORTER_DATA = eINSTANCE.getExporterData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTER_DATA__NAME = eINSTANCE.getExporterData_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTER_DATA__ARTIFACT = eINSTANCE.getExporterData_Artifact();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StringToStringMapImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ContainerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__HOST = eINSTANCE.getContainer_Host();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DockerContainerImpl <em>Docker Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DockerContainerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__SERVICE = eINSTANCE.getDockerContainer_Service();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ContainerizationServerImpl <em>Containerization Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ContainerizationServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getContainerizationServer()
		 * @generated
		 */
		EClass CONTAINERIZATION_SERVER = eINSTANCE.getContainerizationServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DockerServerImpl <em>Docker Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DockerServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDockerServer()
		 * @generated
		 */
		EClass DOCKER_SERVER = eINSTANCE.getDockerServer();

		/**
		 * The meta object literal for the '<em><b>Stacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVER__STACKS = eINSTANCE.getDockerServer_Stacks();

		/**
		 * The meta object literal for the '<em><b>Swarm Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVER__SWARM_CLUSTER = eINSTANCE.getDockerServer_SwarmCluster();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServerImpl <em>Orchestration Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.OrchestrationServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationServer()
		 * @generated
		 */
		EClass ORCHESTRATION_SERVER = eINSTANCE.getOrchestrationServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SwarmServerImpl <em>Swarm Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SwarmServerImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmServer()
		 * @generated
		 */
		EClass SWARM_SERVER = eINSTANCE.getSwarmServer();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SwarmClusterImpl <em>Swarm Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SwarmClusterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmCluster()
		 * @generated
		 */
		EClass SWARM_CLUSTER = eINSTANCE.getSwarmCluster();

		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM_CLUSTER__WORKERS = eINSTANCE.getSwarmCluster_Workers();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM_CLUSTER__MANAGER = eINSTANCE.getSwarmCluster_Manager();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StackImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStack()
		 * @generated
		 */
		EClass STACK = eINSTANCE.getStack();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__SERVICES = eINSTANCE.getStack_Services();

		/**
		 * The meta object literal for the '<em><b>Swarm Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__SWARM_CLUSTER = eINSTANCE.getStack_SwarmCluster();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK__VERSION = eINSTANCE.getStack_Version();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK__NETWORKS = eINSTANCE.getStack_Networks();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Stack</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__STACK = eINSTANCE.getService_Stack();

		/**
		 * The meta object literal for the '<em><b>Env File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ENV_FILE = eINSTANCE.getService_EnvFile();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENV = eINSTANCE.getService_Env();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPENDS_ON = eINSTANCE.getService_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IMAGE = eINSTANCE.getService_Image();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__VOLUMES = eINSTANCE.getService_Volumes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__NETWORKS = eINSTANCE.getService_Networks();

		/**
		 * The meta object literal for the '<em><b>Deployment Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPLOYMENT_PARAM = eINSTANCE.getService_DeploymentParam();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PortImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TARGET = eINSTANCE.getPort_Target();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PUBLISHED = eINSTANCE.getPort_Published();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PROTOCOL = eINSTANCE.getPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__MODE = eINSTANCE.getPort_Mode();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ServiceNetworkImpl <em>Service Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ServiceNetworkImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getServiceNetwork()
		 * @generated
		 */
		EClass SERVICE_NETWORK = eINSTANCE.getServiceNetwork();

		/**
		 * The meta object literal for the '<em><b>Ipv4 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NETWORK__IPV4_ADDRESS = eINSTANCE.getServiceNetwork_Ipv4Address();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NETWORK__ALIASES = eINSTANCE.getServiceNetwork_Aliases();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NETWORK__NETWORK = eINSTANCE.getServiceNetwork_Network();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SwarmNetworkImpl <em>Swarm Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SwarmNetworkImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmNetwork()
		 * @generated
		 */
		EClass SWARM_NETWORK = eINSTANCE.getSwarmNetwork();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM_NETWORK__SUBNETS = eINSTANCE.getSwarmNetwork_Subnets();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_NETWORK__DRIVER = eINSTANCE.getSwarmNetwork_Driver();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ImageImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__REPOSITORY = eINSTANCE.getImage_Repository();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TAG = eINSTANCE.getImage_Tag();

		/**
		 * The meta object literal for the '<em><b>Docker File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DOCKER_FILE = eINSTANCE.getImage_DockerFile();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DESCRIPTION = eINSTANCE.getImage_Description();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SIZE = eINSTANCE.getImage_Size();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.VolumeImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE = eINSTANCE.getVolume_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TARGET = eINSTANCE.getVolume_Target();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__READ_ONLY = eINSTANCE.getVolume_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TYPE = eINSTANCE.getVolume_Type();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeploymentImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PLACEMENT = eINSTANCE.getDeployment_Placement();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__RESTART_POLICY = eINSTANCE.getDeployment_RestartPolicy();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.RegistryImpl <em>Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.RegistryImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRegistry()
		 * @generated
		 */
		EClass REGISTRY = eINSTANCE.getRegistry();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY__URL = eINSTANCE.getRegistry_Url();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__REPOSITORIES = eINSTANCE.getRegistry_Repositories();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.RepositoryImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__IMAGES = eINSTANCE.getRepository_Images();

		/**
		 * The meta object literal for the '<em><b>Is Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IS_PRIVATE = eINSTANCE.getRepository_IsPrivate();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ExceptionImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getException()
		 * @generated NOT
		 */

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ConfigurationExceptionImpl <em>Configuration Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ConfigurationExceptionImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getConfigurationException()
		 * @generated NOT
		 */

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeploymentExceptionImpl <em>Deployment Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeploymentExceptionImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentException()
		 * @generated NOT
		 */

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NodeClusterImpl <em>Node Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NodeClusterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeCluster()
		 * @generated
		 */
		EClass NODE_CLUSTER = eINSTANCE.getNodeCluster();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PrometheusMeterImpl <em>Prometheus Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PrometheusMeterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusMeter()
		 * @generated
		 */
		EClass PROMETHEUS_METER = eINSTANCE.getPrometheusMeter();

		/**
		 * The meta object literal for the '<em><b>Monitoring Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMETHEUS_METER__MONITORING_PORT = eINSTANCE.getPrometheusMeter_MonitoringPort();

		/**
		 * The meta object literal for the '<em><b>Monitoring Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMETHEUS_METER__MONITORING_TIME = eINSTANCE.getPrometheusMeter_MonitoringTime();

		/**
		 * The meta object literal for the '<em><b>Get Prometheus Server Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = eINSTANCE.getPrometheusMeter__GetPrometheusServerConfiguration();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.ExternalElementType <em>External Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.ExternalElementType
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getExternalElementType()
		 * @generated
		 */
		EEnum EXTERNAL_ELEMENT_TYPE = eINSTANCE.getExternalElementType();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.SystemComponentType <em>System Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.SystemComponentType
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSystemComponentType()
		 * @generated
		 */
		EEnum SYSTEM_COMPONENT_TYPE = eINSTANCE.getSystemComponentType();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.PortMode <em>Port Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.PortMode
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPortMode()
		 * @generated
		 */
		EEnum PORT_MODE = eINSTANCE.getPortMode();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.Protocol
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.NetworkDriver <em>Network Driver</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.NetworkDriver
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetworkDriver()
		 * @generated
		 */
		EEnum NETWORK_DRIVER = eINSTANCE.getNetworkDriver();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.VolumeType
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeType()
		 * @generated
		 */
		EEnum VOLUME_TYPE = eINSTANCE.getVolumeType();

		/**
		 * The meta object literal for the '<em>Properties</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProperties()
		 * @generated
		 */
		EDataType PROPERTIES = eINSTANCE.getProperties();

	}

} //PasysPackage
