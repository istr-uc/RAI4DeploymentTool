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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The operation id for the '<em>Clean Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT = 1;

	/**
	 * The number of operations of the '<em>Computational System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM_OPERATION_COUNT = 2;

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
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__IP = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OS = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONCURRENCY_LEVEL = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__MEMORY_SIZE = PLATFORM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__SPEED_FACTOR = PLATFORM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__PROPERTY_CONFIG_DATA = PLATFORM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__USER_NAME = PLATFORM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONNECTED_TO = PLATFORM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__LAUNCHING_SCRIPTS = PLATFORM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONFIG_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CODE_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OWNED_METERS = PLATFORM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 12;

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
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PLATFORM_RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PLATFORM_RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 7;

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
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OS = PROCESSING_NODE__OS;

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
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

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
	 * The number of structural features of the '<em>Physical Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE_FEATURE_COUNT = PROCESSING_NODE_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

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
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OS = PROCESSING_NODE__OS;

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
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

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
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

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
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__IP = VIRTUAL_PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OS = VIRTUAL_PROCESSING_NODE__OS;

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
	 * The feature id for the '<em><b>Property Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA = VIRTUAL_PROCESSING_NODE__PROPERTY_CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__USER_NAME = VIRTUAL_PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONNECTED_TO = VIRTUAL_PROCESSING_NODE__CONNECTED_TO;

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
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

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
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeSchedulerImpl <em>Node Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeSchedulerImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeScheduler()
	 * @generated
	 */
	int NODE_SCHEDULER = 25;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataImpl <em>Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamData()
	 * @generated
	 */
	int STREAM_DATA = 40;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl <em>Stream Data Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataPartitionImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataPartition()
	 * @generated
	 */
	int STREAM_DATA_PARTITION = 41;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl <em>Workflow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowStreamData()
	 * @generated
	 */
	int WORKFLOW_STREAM_DATA = 42;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl <em>Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.FlowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFlowStreamData()
	 * @generated
	 */
	int FLOW_STREAM_DATA = 43;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl <em>Kafka Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaFlowStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaFlowStreamData()
	 * @generated
	 */
	int KAFKA_FLOW_STREAM_DATA = 44;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl <em>Derived Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DerivedStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDerivedStreamData()
	 * @generated
	 */
	int DERIVED_STREAM_DATA = 45;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl <em>Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkloadStreamData()
	 * @generated
	 */
	int WORKLOAD_STREAM_DATA = 46;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl <em>Kafka Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaWorkloadStreamDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaWorkloadStreamData()
	 * @generated
	 */
	int KAFKA_WORKLOAD_STREAM_DATA = 47;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 48;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SchedulableSetImpl <em>Schedulable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SchedulableSetImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulableSet()
	 * @generated
	 */
	int SCHEDULABLE_SET = 49;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 50;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl <em>Task Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskExecutorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskExecutor()
	 * @generated
	 */
	int TASK_EXECUTOR = 51;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MetricImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 52;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl <em>Processing Node Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeUtilizationImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeUtilization()
	 * @generated
	 */
	int PROCESSING_NODE_UTILIZATION = 53;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl <em>Processing Node Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ProcessingNodeMemoryImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProcessingNodeMemory()
	 * @generated
	 */
	int PROCESSING_NODE_MEMORY = 54;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl <em>Network Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NetworkUtilizationImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNetworkUtilization()
	 * @generated
	 */
	int NETWORK_UTILIZATION = 55;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl <em>Workflow Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatency()
	 * @generated
	 */
	int WORKFLOW_LATENCY = 56;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl <em>Task Processing Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmount()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT = 57;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamDataRateImpl <em>Stream Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamDataRateImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamDataRate()
	 * @generated
	 */
	int STREAM_DATA_RATE = 58;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 59;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl <em>Node Hosted Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeHostedMeter()
	 * @generated
	 */
	int NODE_HOSTED_METER = 61;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl <em>Node Resource Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeResourceMeter()
	 * @generated
	 */
	int NODE_RESOURCE_METER = 62;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CommunicationMeterImpl <em>Communication Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CommunicationMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationMeter()
	 * @generated
	 */
	int COMMUNICATION_METER = 63;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StreamRateMeterImpl <em>Stream Rate Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StreamRateMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStreamRateMeter()
	 * @generated
	 */
	int STREAM_RATE_METER = 64;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl <em>Workflow Latency Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.WorkflowLatencyMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getWorkflowLatencyMeter()
	 * @generated
	 */
	int WORKFLOW_LATENCY_METER = 65;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl <em>Task Processing Amount Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getTaskProcessingAmountMeter()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT_METER = 66;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl <em>Deployment File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentFileDescriptor()
	 * @generated
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR = 83;

	/**
	 * The meta object id for the '{@link java.lang.Exception <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 77;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.ConfigurationException <em>Configuration Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.ConfigurationException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getConfigurationException()
	 * @generated
	 */
	int CONFIGURATION_EXCEPTION = 78;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.DeploymentException <em>Deployment Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.DeploymentException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentException()
	 * @generated
	 */
	int DEPLOYMENT_EXCEPTION = 79;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.LaunchException <em>Launch Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.LaunchException
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getLaunchException()
	 * @generated
	 */
	int LAUNCH_EXCEPTION = 80;

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
	int PROMETHEUS_METER = 60;

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
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER___GET_NODES = RESOURCE_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_OPERATION_COUNT = RESOURCE_CLUSTER_OPERATION_COUNT + 1;

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
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PlatformServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformService()
	 * @generated
	 */
	int PLATFORM_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__HOST = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__ORCHESTRATOR = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Platform Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceImpl <em>Orchestration Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.OrchestrationServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationService()
	 * @generated
	 */
	int ORCHESTRATION_SERVICE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE__SERVICES = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orchestration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Orchestration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KubernetesServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKubernetesService()
	 * @generated
	 */
	int KUBERNETES_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__NAME = ORCHESTRATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ID = ORCHESTRATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__OWNER = ORCHESTRATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__DEPLOYMENT_CONFIG = ORCHESTRATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__HOST = ORCHESTRATION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__ORCHESTRATOR = ORCHESTRATION_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__SERVICES = ORCHESTRATION_SERVICE__SERVICES;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__API_VERSION = ORCHESTRATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_FEATURE_COUNT = ORCHESTRATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE___CONFIGURE_DEPLOYMENT = ORCHESTRATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_OPERATION_COUNT = ORCHESTRATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SwarmServiceImpl <em>Swarm Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SwarmServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmService()
	 * @generated
	 */
	int SWARM_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__NAME = ORCHESTRATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__ID = ORCHESTRATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__OWNER = ORCHESTRATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__DEPLOYMENT_CONFIG = ORCHESTRATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__HOST = ORCHESTRATION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__ORCHESTRATOR = ORCHESTRATION_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE__SERVICES = ORCHESTRATION_SERVICE__SERVICES;

	/**
	 * The number of structural features of the '<em>Swarm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE_FEATURE_COUNT = ORCHESTRATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE___CONFIGURE_DEPLOYMENT = ORCHESTRATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Swarm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_SERVICE_OPERATION_COUNT = ORCHESTRATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SerializationServiceImpl <em>Serialization Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SerializationServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSerializationService()
	 * @generated
	 */
	int SERIALIZATION_SERVICE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The number of structural features of the '<em>Serialization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Serialization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.AVROServiceImpl <em>AVRO Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.AVROServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAVROService()
	 * @generated
	 */
	int AVRO_SERVICE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__NAME = SERIALIZATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__ID = SERIALIZATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__OWNER = SERIALIZATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__DEPLOYMENT_CONFIG = SERIALIZATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__HOST = SERIALIZATION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__ORCHESTRATOR = SERIALIZATION_SERVICE__ORCHESTRATOR;

	/**
	 * The number of structural features of the '<em>AVRO Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE_FEATURE_COUNT = SERIALIZATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE___CONFIGURE_DEPLOYMENT = SERIALIZATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>AVRO Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE_OPERATION_COUNT = SERIALIZATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DistributionServiceImpl <em>Distribution Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DistributionServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDistributionService()
	 * @generated
	 */
	int DISTRIBUTION_SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The number of structural features of the '<em>Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl <em>Zookeeper Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getZookeeperService()
	 * @generated
	 */
	int ZOOKEEPER_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__NAME = DISTRIBUTION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__ID = DISTRIBUTION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__OWNER = DISTRIBUTION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__DEPLOYMENT_CONFIG = DISTRIBUTION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__HOST = DISTRIBUTION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__ORCHESTRATOR = DISTRIBUTION_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__SERVER_ID = DISTRIBUTION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__CLIENT_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__TICK_TIME = DISTRIBUTION_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leader Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__LEADER_SERVERS = DISTRIBUTION_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Peer Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__PEER_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leader Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__LEADER_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Init Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__INIT_LIMIT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__SYNC_LIMIT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Zookeeper Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE_FEATURE_COUNT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE___CONFIGURE_DEPLOYMENT = DISTRIBUTION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Zookeeper Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE_OPERATION_COUNT = DISTRIBUTION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CommunicationServiceImpl <em>Communication Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CommunicationServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationService()
	 * @generated
	 */
	int COMMUNICATION_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The number of structural features of the '<em>Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl <em>Kafka Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KafkaServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaService()
	 * @generated
	 */
	int KAFKA_SERVICE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NAME = COMMUNICATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ID = COMMUNICATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__OWNER = COMMUNICATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__DEPLOYMENT_CONFIG = COMMUNICATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__HOST = COMMUNICATION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ORCHESTRATOR = COMMUNICATION_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Comm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__COMM_ID = COMMUNICATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__CLIENT_PORT = COMMUNICATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ZOOKEEPER_CONNECT = COMMUNICATION_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT = COMMUNICATION_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LISTENERS = COMMUNICATION_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Advertised Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ADVERTISED_LISTENERS = COMMUNICATION_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Create Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE = COMMUNICATION_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delete Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__DELETE_TOPIC_ENABLE = COMMUNICATION_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_PARTITIONS = COMMUNICATION_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR = COMMUNICATION_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Log Flush Interval Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES = COMMUNICATION_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Flush Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LOG_FLUSH_INTERVAL = COMMUNICATION_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Num Network Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_NETWORK_THREADS = COMMUNICATION_SERVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Num IO Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_IO_THREADS = COMMUNICATION_SERVICE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Socket Request Max Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Kafka Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE_FEATURE_COUNT = COMMUNICATION_SERVICE_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE___CONFIGURE_DEPLOYMENT = COMMUNICATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Kafka Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE_OPERATION_COUNT = COMMUNICATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SchedulingServiceImpl <em>Scheduling Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SchedulingServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulingService()
	 * @generated
	 */
	int SCHEDULING_SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__WORKFLOWS = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Scheduling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ORCHESTRATOR = SCHEDULING_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The number of structural features of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl <em>Spark Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SparkServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSparkService()
	 * @generated
	 */
	int SPARK_SERVICE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__ORCHESTRATOR = SCHEDULING_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOAD = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_CORES = SCHEDULING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver Max Result Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE = SCHEDULING_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_MEMORY = SCHEDULING_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOCAL_DIR = SCHEDULING_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__MASTER = SCHEDULING_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__WINDOW_SIZE = SCHEDULING_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executor Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__EXECUTOR_MEMORY = SCHEDULING_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extra Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__EXTRA_LISTENER = SCHEDULING_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Log Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOG_CONF = SCHEDULING_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Submit Deploy Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__SUBMIT_DEPLOY_MODE = SCHEDULING_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Caller Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOG_CALLER_CONTEXT = SCHEDULING_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Driver Superviser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_SUPERVISER = SCHEDULING_SERVICE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Spark Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Spark Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StormServiceImpl <em>Storm Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StormServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormService()
	 * @generated
	 */
	int STORM_SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__ORCHESTRATOR = SCHEDULING_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__ZOOKEEPER_CONNECT = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__LOCAL_DIR = SCHEDULING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nimbus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__NIMBUS = SCHEDULING_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__SUPERVISOR = SCHEDULING_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__UI = SCHEDULING_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PersistenceServiceImpl <em>Persistence Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PersistenceServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPersistenceService()
	 * @generated
	 */
	int PERSISTENCE_SERVICE = 31;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MemSQLServiceImpl <em>Mem SQL Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MemSQLServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMemSQLService()
	 * @generated
	 */
	int MEM_SQL_SERVICE = 32;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl <em>Cassandra Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.CassandraServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCassandraService()
	 * @generated
	 */
	int CASSANDRA_SERVICE = 33;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DataCenterImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 34;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.RackImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 35;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.Neo4JServiceImpl <em>Neo4 JService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.Neo4JServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNeo4JService()
	 * @generated
	 */
	int NEO4_JSERVICE = 36;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.MonitoringServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMonitoringService()
	 * @generated
	 */
	int MONITORING_SERVICE = 37;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PrometheusServiceImpl <em>Prometheus Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PrometheusServiceImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusService()
	 * @generated
	 */
	int PROMETHEUS_SERVICE = 38;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeploymentConfigurationImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentConfiguration()
	 * @generated
	 */
	int DEPLOYMENT_CONFIGURATION = 68;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PlatformServiceDeploymentConfImpl <em>Platform Service Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PlatformServiceDeploymentConfImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformServiceDeploymentConf()
	 * @generated
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF = 69;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl <em>Orchestration Service Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF = 70;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.NodeClusterDeploymentConfImpl <em>Node Cluster Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.NodeClusterDeploymentConfImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeClusterDeploymentConf()
	 * @generated
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF = 71;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.FileDescriptorImpl <em>File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.FileDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getFileDescriptor()
	 * @generated
	 */
	int FILE_DESCRIPTOR = 82;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl <em>Artifact Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getArtifactDescriptor()
	 * @generated
	 */
	int ARTIFACT_DESCRIPTOR = 84;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.ExporterDataImpl <em>Exporter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.ExporterDataImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getExporterData()
	 * @generated
	 */
	int EXPORTER_DATA = 39;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeployableComponentImpl <em>Deployable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeployableComponentImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeployableComponent()
	 * @generated
	 */
	int DEPLOYABLE_COMPONENT = 67;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Deployable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT = 0;

	/**
	 * The number of operations of the '<em>Deployable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StormUIImpl <em>Storm UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StormUIImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormUI()
	 * @generated
	 */
	int STORM_UI = 28;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__UI_PORT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StormNimbusImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormNimbus()
	 * @generated
	 */
	int STORM_NIMBUS = 29;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storm Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StormSupervisorImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormSupervisor()
	 * @generated
	 */
	int STORM_SUPERVISOR = 30;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supervisor Slot Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__LOGGING = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__PASSWD = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__PORT = PLATFORM_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__ORCHESTRATOR = PERSISTENCE_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Mem SQL Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Mem SQL Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__ORCHESTRATOR = PERSISTENCE_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Num Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__NUM_TOKENS = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SEEDS = PERSISTENCE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SEED_PROVIDER_CLASS = PERSISTENCE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__ENDPOINT_SNITCH = PERSISTENCE_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DATA_FILE_DIR = PERSISTENCE_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Storage Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__STORAGE_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__AUTO_BOOTSTRAP = PERSISTENCE_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__CQL_SCHEMAS = PERSISTENCE_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DATA_CENTERS = PERSISTENCE_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ssl Storage Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SSL_STORAGE_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rpc Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__RPC_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Cassandra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Cassandra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Racks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__RACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__ORCHESTRATOR = PERSISTENCE_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Neo4 JService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Neo4 JService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__ORCHESTRATOR = PLATFORM_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__MONITORIZED_METERS = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__NAME = MONITORING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__ID = MONITORING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__OWNER = MONITORING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__DEPLOYMENT_CONFIG = MONITORING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__HOST = MONITORING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Orchestrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__ORCHESTRATOR = MONITORING_SERVICE__ORCHESTRATOR;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__MONITORIZED_METERS = MONITORING_SERVICE__MONITORIZED_METERS;

	/**
	 * The feature id for the '<em><b>Exporters Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__EXPORTERS_DATA = MONITORING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prometheus Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE_FEATURE_COUNT = MONITORING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE___CONFIGURE_DEPLOYMENT = MONITORING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Prometheus Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE_OPERATION_COUNT = MONITORING_SERVICE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_MS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_BYTES = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__CLEANUP_POLICY = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_PARTITIONS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_REPLICATION = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__OWNED_METERS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ASSIGNED_PARTITION = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__MESSAGE_SIZE = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__SCHEMA_FILE = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_MS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_BYTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__CLEANUP_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_PARTITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_REPLICATION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__MESSAGE_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__SCHEMA_FILE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__IS_SINGLE_USE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Workflow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__DEPLOYMENT_CONFIG = WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__DEPLOYMENT_CONFIG = FLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__DEPLOYMENT_CONFIG = WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_MS = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_BYTES = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__CLEANUP_POLICY = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_PARTITIONS = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_REPLICATION = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__MESSAGE_SIZE = SYSTEM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__SCHEMA_FILE = SYSTEM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__HOLDER = SYSTEM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG = WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DEPLOYMENT_CONFIG = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Stream Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_STREAM_DATA = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASKS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ROOT_TASK = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Task Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASK_EXECUTORS = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SCHEDULER = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___CONFIGURE_DEPLOYMENT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executed Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__EXECUTED_TASKS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MONITORING_SERVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__DEPLOYMENT_CONFIG = METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER___CONFIGURE_DEPLOYMENT = METER___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__DEPLOYMENT_CONFIG = NODE_HOSTED_METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER___CONFIGURE_DEPLOYMENT = NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__DEPLOYMENT_CONFIG = NODE_HOSTED_METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER___CONFIGURE_DEPLOYMENT = NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

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
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

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
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

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
	 * The number of structural features of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Platform Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT = DEPLOYMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT = DEPLOYMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Orchestration Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Orchestration Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__ARTIFACT_LOCATOR = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__ARTIFACT_NAME = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__DATA_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__LOG_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__ARGUMENTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF__IS_RUNNING = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Node Cluster Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF_FEATURE_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Node Cluster Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CLUSTER_DEPLOYMENT_CONF_OPERATION_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.StringToStringMapImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 81;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.PortImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 73;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.SwarmPortImpl <em>Swarm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.SwarmPortImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmPort()
	 * @generated
	 */
	int SWARM_PORT = 74;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.KubernetesPortImpl <em>Kubernetes Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.KubernetesPortImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKubernetesPort()
	 * @generated
	 */
	int KUBERNETES_PORT = 75;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentConstraints()
	 * @generated
	 */
	int DEPLOYMENT_CONSTRAINTS = 76;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.impl.VolumeImpl
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 72;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ACCESS_MODE = 3;

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
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT__TARGET = PORT__TARGET;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT__PUBLISHED = PORT__PUBLISHED;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT__PROTOCOL = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT__MODE = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swarm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Swarm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_PORT__TARGET = PORT__TARGET;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_PORT__PUBLISHED = PORT__PUBLISHED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_PORT__NAME = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kubernetes Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kubernetes Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Local Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__LOCAL_PATH = FILE_DESCRIPTOR_FEATURE_COUNT + 0;

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
	int SYSTEM_COMPONENT_TYPE = 90;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.PortMode <em>Port Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPortMode()
	 * @generated
	 */
	int PORT_MODE = 88;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 89;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.VolumeType
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeType()
	 * @generated
	 */
	int VOLUME_TYPE = 86;

	/**
	 * The meta object id for the '{@link PASYS_Metamodel.pasys.VolumeAccessMode <em>Volume Access Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PASYS_Metamodel.pasys.VolumeAccessMode
	 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeAccessMode()
	 * @generated
	 */
	int VOLUME_ACCESS_MODE = 87;

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
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ComputationalSystem#cleanDeployment() <em>Clean Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clean Deployment</em>' operation.
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#cleanDeployment()
	 * @generated
	 */
	EOperation getComputationalSystem__CleanDeployment();

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
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ProcessingNode#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getOs()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_Os();

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
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#addLaunchingScript(PASYS_Metamodel.pasys.DeploymentFileDescriptor) <em>Add Launching Script</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Launching Script</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#addLaunchingScript(PASYS_Metamodel.pasys.DeploymentFileDescriptor)
	 * @generated
	 */
	EOperation getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.ProcessingNode#addConfigFile(PASYS_Metamodel.pasys.DeploymentFileDescriptor) <em>Add Config File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Config File</em>' operation.
	 * @see PASYS_Metamodel.pasys.ProcessingNode#addConfigFile(PASYS_Metamodel.pasys.DeploymentFileDescriptor)
	 * @generated
	 */
	EOperation getProcessingNode__AddConfigFile__DeploymentFileDescriptor();

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
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Service</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformService
	 * @generated
	 */
	EClass getPlatformService();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.PlatformService#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformService#getHost()
	 * @see #getPlatformService()
	 * @generated
	 */
	EReference getPlatformService_Host();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.PlatformService#getOrchestrator <em>Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orchestrator</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformService#getOrchestrator()
	 * @see #getPlatformService()
	 * @generated
	 */
	EReference getPlatformService_Orchestrator();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.OrchestrationService <em>Orchestration Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration Service</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationService
	 * @generated
	 */
	EClass getOrchestrationService();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.OrchestrationService#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationService#getServices()
	 * @see #getOrchestrationService()
	 * @generated
	 */
	EReference getOrchestrationService_Services();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KubernetesService <em>Kubernetes Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Service</em>'.
	 * @see PASYS_Metamodel.pasys.KubernetesService
	 * @generated
	 */
	EClass getKubernetesService();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KubernetesService#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see PASYS_Metamodel.pasys.KubernetesService#getApiVersion()
	 * @see #getKubernetesService()
	 * @generated
	 */
	EAttribute getKubernetesService_ApiVersion();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SwarmService <em>Swarm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Service</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmService
	 * @generated
	 */
	EClass getSwarmService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SerializationService <em>Serialization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialization Service</em>'.
	 * @see PASYS_Metamodel.pasys.SerializationService
	 * @generated
	 */
	EClass getSerializationService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.AVROService <em>AVRO Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVRO Service</em>'.
	 * @see PASYS_Metamodel.pasys.AVROService
	 * @generated
	 */
	EClass getAVROService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DistributionService <em>Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Service</em>'.
	 * @see PASYS_Metamodel.pasys.DistributionService
	 * @generated
	 */
	EClass getDistributionService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.ZookeeperService <em>Zookeeper Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zookeeper Service</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService
	 * @generated
	 */
	EClass getZookeeperService();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getServerId <em>Server Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Id</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getServerId()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_ServerId();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getTickTime <em>Tick Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Time</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getTickTime()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_TickTime();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#isLeaderServers <em>Leader Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Servers</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#isLeaderServers()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_LeaderServers();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getInitLimit <em>Init Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Limit</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getInitLimit()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_InitLimit();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getSyncLimit <em>Sync Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Limit</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getSyncLimit()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_SyncLimit();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getClientPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_ClientPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getPeerPort <em>Peer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peer Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getPeerPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_PeerPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ZookeeperService#getLeaderPort <em>Leader Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Port</em>'.
	 * @see PASYS_Metamodel.pasys.ZookeeperService#getLeaderPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_LeaderPort();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.CommunicationService <em>Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Service</em>'.
	 * @see PASYS_Metamodel.pasys.CommunicationService
	 * @generated
	 */
	EClass getCommunicationService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KafkaService <em>Kafka Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Service</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService
	 * @generated
	 */
	EClass getKafkaService();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getCommId <em>Comm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Id</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getCommId()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_CommId();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#isAutoCreateTopicEnable <em>Auto Create Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create Topic Enable</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#isAutoCreateTopicEnable()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_AutoCreateTopicEnable();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#isDeleteTopicEnable <em>Delete Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Topic Enable</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#isDeleteTopicEnable()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_DeleteTopicEnable();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getZookeeperConnect()
	 * @see #getKafkaService()
	 * @generated
	 */
	EReference getKafkaService_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnectionTimeout <em>Zookeeper Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zookeeper Connection Timeout</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getZookeeperConnectionTimeout()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_ZookeeperConnectionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getNumPartitions <em>Num Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Partitions</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getNumPartitions()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumPartitions();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getNumRecoveryThreadsPerDataDir <em>Num Recovery Threads Per Data Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Recovery Threads Per Data Dir</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getNumRecoveryThreadsPerDataDir()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumRecoveryThreadsPerDataDir();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushIntervalMessages <em>Log Flush Interval Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval Messages</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getLogFlushIntervalMessages()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_LogFlushIntervalMessages();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushInterval <em>Log Flush Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getLogFlushInterval()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_LogFlushInterval();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listeners</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getListeners()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_Listeners();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getAdvertisedListeners <em>Advertised Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertised Listeners</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getAdvertisedListeners()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_AdvertisedListeners();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getNumNetworkThreads <em>Num Network Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Network Threads</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getNumNetworkThreads()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumNetworkThreads();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getNumIOThreads <em>Num IO Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num IO Threads</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getNumIOThreads()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumIOThreads();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getSocketSendBufferBytes <em>Socket Send Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Send Buffer Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getSocketSendBufferBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketSendBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getSocketReceiveBufferBytes <em>Socket Receive Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Receive Buffer Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getSocketReceiveBufferBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketReceiveBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getSocketRequestMaxBytes <em>Socket Request Max Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Request Max Bytes</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getSocketRequestMaxBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketRequestMaxBytes();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KafkaService#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see PASYS_Metamodel.pasys.KafkaService#getClientPort()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_ClientPort();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SchedulingService <em>Scheduling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Service</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulingService
	 * @generated
	 */
	EClass getSchedulingService();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.SchedulingService#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see PASYS_Metamodel.pasys.SchedulingService#getWorkflows()
	 * @see #getSchedulingService()
	 * @generated
	 */
	EReference getSchedulingService_Workflows();

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
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SparkService <em>Spark Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spark Service</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService
	 * @generated
	 */
	EClass getSparkService();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SparkService#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getLoad()
	 * @see #getSparkService()
	 * @generated
	 */
	EReference getSparkService_Load();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getDriverCores <em>Driver Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Cores</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getDriverCores()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverCores();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getDriverMaxResultSize <em>Driver Max Result Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Max Result Size</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getDriverMaxResultSize()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverMaxResultSize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getDriverMemory <em>Driver Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Memory</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getDriverMemory()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverMemory();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getLocalDir()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LocalDir();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.SparkService#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getMaster()
	 * @see #getSparkService()
	 * @generated
	 */
	EReference getSparkService_Master();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getWindowSize()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_WindowSize();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getExecutorMemory <em>Executor Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor Memory</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getExecutorMemory()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_ExecutorMemory();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getExtraListener <em>Extra Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Listener</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getExtraListener()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_ExtraListener();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#isLogConf <em>Log Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Conf</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#isLogConf()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LogConf();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getSubmitDeployMode <em>Submit Deploy Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Deploy Mode</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getSubmitDeployMode()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_SubmitDeployMode();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#getLogCallerContext <em>Log Caller Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Caller Context</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#getLogCallerContext()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LogCallerContext();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SparkService#isDriverSuperviser <em>Driver Superviser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Superviser</em>'.
	 * @see PASYS_Metamodel.pasys.SparkService#isDriverSuperviser()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverSuperviser();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StormService <em>Storm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Service</em>'.
	 * @see PASYS_Metamodel.pasys.StormService
	 * @generated
	 */
	EClass getStormService();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see PASYS_Metamodel.pasys.StormService#getZookeeperConnect()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StormService#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see PASYS_Metamodel.pasys.StormService#getLocalDir()
	 * @see #getStormService()
	 * @generated
	 */
	EAttribute getStormService_LocalDir();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.StormService#getNimbus <em>Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nimbus</em>'.
	 * @see PASYS_Metamodel.pasys.StormService#getNimbus()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Nimbus();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.StormService#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supervisor</em>'.
	 * @see PASYS_Metamodel.pasys.StormService#getSupervisor()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Supervisor();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.StormService#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ui</em>'.
	 * @see PASYS_Metamodel.pasys.StormService#getUi()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Ui();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StormUI <em>Storm UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm UI</em>'.
	 * @see PASYS_Metamodel.pasys.StormUI
	 * @generated
	 */
	EClass getStormUI();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.StormUI#getUiPort <em>Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Port</em>'.
	 * @see PASYS_Metamodel.pasys.StormUI#getUiPort()
	 * @see #getStormUI()
	 * @generated
	 */
	EAttribute getStormUI_UiPort();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.StormUI#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.StormUI#getOwner()
	 * @see #getStormUI()
	 * @generated
	 */
	EReference getStormUI_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormUI#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.StormUI#getHost()
	 * @see #getStormUI()
	 * @generated
	 */
	EReference getStormUI_Host();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StormNimbus <em>Storm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Nimbus</em>'.
	 * @see PASYS_Metamodel.pasys.StormNimbus
	 * @generated
	 */
	EClass getStormNimbus();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.StormNimbus#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.StormNimbus#getOwner()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EReference getStormNimbus_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormNimbus#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.StormNimbus#getHost()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EReference getStormNimbus_Host();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.StormSupervisor <em>Storm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Supervisor</em>'.
	 * @see PASYS_Metamodel.pasys.StormSupervisor
	 * @generated
	 */
	EClass getStormSupervisor();

	/**
	 * Returns the meta object for the attribute list '{@link PASYS_Metamodel.pasys.StormSupervisor#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supervisor Slot Ports</em>'.
	 * @see PASYS_Metamodel.pasys.StormSupervisor#getSupervisorSlotPorts()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_SupervisorSlotPorts();

	/**
	 * Returns the meta object for the container reference '{@link PASYS_Metamodel.pasys.StormSupervisor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see PASYS_Metamodel.pasys.StormSupervisor#getOwner()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EReference getStormSupervisor_Owner();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.StormSupervisor#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see PASYS_Metamodel.pasys.StormSupervisor#getHost()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EReference getStormSupervisor_Host();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Service</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceService
	 * @generated
	 */
	EClass getPersistenceService();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceService#getLogging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceService#getLogging()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Logging();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceService#getPasswd <em>Passwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwd</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceService#getPasswd()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Passwd();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.PersistenceService#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see PASYS_Metamodel.pasys.PersistenceService#getPort()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Port();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.MemSQLService <em>Mem SQL Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem SQL Service</em>'.
	 * @see PASYS_Metamodel.pasys.MemSQLService
	 * @generated
	 */
	EClass getMemSQLService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.CassandraService <em>Cassandra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cassandra Service</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService
	 * @generated
	 */
	EClass getCassandraService();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tokens</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getNumTokens()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_NumTokens();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.CassandraService#getSeeds <em>Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seeds</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getSeeds()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_Seeds();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Provider Class</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getSeedProviderClass()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_SeedProviderClass();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Snitch</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getEndpointSnitch()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_EndpointSnitch();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File Dir</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getDataFileDir()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_DataFileDir();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getStoragePort <em>Storage Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Port</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getStoragePort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_StoragePort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Bootstrap</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#isAutoBootstrap()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_AutoBootstrap();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.CassandraService#getCqlSchemas <em>Cql Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cql Schemas</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getCqlSchemas()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_CqlSchemas();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.CassandraService#getDataCenters <em>Data Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Centers</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getDataCenters()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_DataCenters();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Storage Port</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getSslStoragePort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_SslStoragePort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpc Port</em>'.
	 * @see PASYS_Metamodel.pasys.CassandraService#getRpcPort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_RpcPort();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see PASYS_Metamodel.pasys.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.DataCenter#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Racks</em>'.
	 * @see PASYS_Metamodel.pasys.DataCenter#getRacks()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Racks();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see PASYS_Metamodel.pasys.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link PASYS_Metamodel.pasys.Rack#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nodes</em>'.
	 * @see PASYS_Metamodel.pasys.Rack#getNodes()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Nodes();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.Neo4JService <em>Neo4 JService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo4 JService</em>'.
	 * @see PASYS_Metamodel.pasys.Neo4JService
	 * @generated
	 */
	EClass getNeo4JService();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Service</em>'.
	 * @see PASYS_Metamodel.pasys.MonitoringService
	 * @generated
	 */
	EClass getMonitoringService();

	/**
	 * Returns the meta object for the reference list '{@link PASYS_Metamodel.pasys.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitorized Meters</em>'.
	 * @see PASYS_Metamodel.pasys.MonitoringService#getMonitorizedMeters()
	 * @see #getMonitoringService()
	 * @generated
	 */
	EReference getMonitoringService_MonitorizedMeters();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PrometheusService <em>Prometheus Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prometheus Service</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusService
	 * @generated
	 */
	EClass getPrometheusService();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.PrometheusService#getExportersData <em>Exporters Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exporters Data</em>'.
	 * @see PASYS_Metamodel.pasys.PrometheusService#getExportersData()
	 * @see #getPrometheusService()
	 * @generated
	 */
	EReference getPrometheusService_ExportersData();

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
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeployableComponent <em>Deployable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Component</em>'.
	 * @see PASYS_Metamodel.pasys.DeployableComponent
	 * @generated
	 */
	EClass getDeployableComponent();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Config</em>'.
	 * @see PASYS_Metamodel.pasys.DeployableComponent#getDeploymentConfig()
	 * @see #getDeployableComponent()
	 * @generated
	 */
	EReference getDeployableComponent_DeploymentConfig();

	/**
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.DeployableComponent#configureDeployment() <em>Configure Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure Deployment</em>' operation.
	 * @see PASYS_Metamodel.pasys.DeployableComponent#configureDeployment()
	 * @generated
	 */
	EOperation getDeployableComponent__ConfigureDeployment();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Configuration</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentConfiguration
	 * @generated
	 */
	EClass getDeploymentConfiguration();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.PlatformServiceDeploymentConf <em>Platform Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Service Deployment Conf</em>'.
	 * @see PASYS_Metamodel.pasys.PlatformServiceDeploymentConf
	 * @generated
	 */
	EClass getPlatformServiceDeploymentConf();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf <em>Orchestration Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration Service Deployment Conf</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf
	 * @generated
	 */
	EClass getOrchestrationServiceDeploymentConf();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImage()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestrationServiceDeploymentConf_Image();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getReplicas()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestrationServiceDeploymentConf_Replicas();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getCommand()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestrationServiceDeploymentConf_Command();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getRestartPolicy()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestrationServiceDeploymentConf_RestartPolicy();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Pull Policy</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImagePullPolicy()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestrationServiceDeploymentConf_ImagePullPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getVolumes()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EReference getOrchestrationServiceDeploymentConf_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getPorts()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EReference getOrchestrationServiceDeploymentConf_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getConstraints()
	 * @see #getOrchestrationServiceDeploymentConf()
	 * @generated
	 */
	EReference getOrchestrationServiceDeploymentConf_Constraints();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf <em>Node Cluster Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Cluster Deployment Conf</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf
	 * @generated
	 */
	EClass getNodeClusterDeploymentConf();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArtifactLocator <em>Artifact Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Locator</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArtifactLocator()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_ArtifactLocator();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArtifactName()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getConfigFolderPath <em>Config Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getConfigFolderPath()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_ConfigFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getScriptFolderPath <em>Script Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getScriptFolderPath()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_ScriptFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getDataFolderPath <em>Data Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getDataFolderPath()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_DataFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getLogFolderPath <em>Log Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Folder Path</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getLogFolderPath()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_LogFolderPath();

	/**
	 * Returns the meta object for the attribute list '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#getArguments()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.NodeClusterDeploymentConf#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see PASYS_Metamodel.pasys.NodeClusterDeploymentConf#isIsRunning()
	 * @see #getNodeClusterDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeClusterDeploymentConf_IsRunning();

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
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.ArtifactDescriptor#getLocalPath <em>Local Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Path</em>'.
	 * @see PASYS_Metamodel.pasys.ArtifactDescriptor#getLocalPath()
	 * @see #getArtifactDescriptor()
	 * @generated
	 */
	EAttribute getArtifactDescriptor_LocalPath();

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
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.SwarmPort <em>Swarm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Port</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmPort
	 * @generated
	 */
	EClass getSwarmPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SwarmPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmPort#getProtocol()
	 * @see #getSwarmPort()
	 * @generated
	 */
	EAttribute getSwarmPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.SwarmPort#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see PASYS_Metamodel.pasys.SwarmPort#getMode()
	 * @see #getSwarmPort()
	 * @generated
	 */
	EAttribute getSwarmPort_Mode();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.KubernetesPort <em>Kubernetes Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Port</em>'.
	 * @see PASYS_Metamodel.pasys.KubernetesPort
	 * @generated
	 */
	EClass getKubernetesPort();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.KubernetesPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PASYS_Metamodel.pasys.KubernetesPort#getName()
	 * @see #getKubernetesPort()
	 * @generated
	 */
	EAttribute getKubernetesPort_Name();

	/**
	 * Returns the meta object for class '{@link PASYS_Metamodel.pasys.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Constraints</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentConstraints
	 * @generated
	 */
	EClass getDeploymentConstraints();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.DeploymentConstraints#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentConstraints#getLabels()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_Labels();

	/**
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.DeploymentConstraints#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources</em>'.
	 * @see PASYS_Metamodel.pasys.DeploymentConstraints#getResources()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_Resources();

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
	 * Returns the meta object for the attribute '{@link PASYS_Metamodel.pasys.Volume#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see PASYS_Metamodel.pasys.Volume#getAccessMode()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_AccessMode();

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
	 * Returns the meta object for the '{@link PASYS_Metamodel.pasys.NodeCluster#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see PASYS_Metamodel.pasys.NodeCluster#getNodes()
	 * @generated
	 */
	EOperation getNodeCluster__GetNodes();

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
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Type</em>'.
	 * @see PASYS_Metamodel.pasys.VolumeType
	 * @generated
	 */
	EEnum getVolumeType();

	/**
	 * Returns the meta object for enum '{@link PASYS_Metamodel.pasys.VolumeAccessMode <em>Volume Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Access Mode</em>'.
	 * @see PASYS_Metamodel.pasys.VolumeAccessMode
	 * @generated
	 */
	EEnum getVolumeAccessMode();

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
		 * The meta object literal for the '<em><b>Clean Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT = eINSTANCE.getComputationalSystem__CleanDeployment();

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
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__OS = eINSTANCE.getProcessingNode_Os();

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
		 * The meta object literal for the '<em><b>Add Launching Script</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = eINSTANCE.getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Add Config File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = eINSTANCE.getProcessingNode__AddConfigFile__DeploymentFileDescriptor();

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
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PlatformServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformService()
		 * @generated
		 */
		EClass PLATFORM_SERVICE = eINSTANCE.getPlatformService();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVICE__HOST = eINSTANCE.getPlatformService_Host();

		/**
		 * The meta object literal for the '<em><b>Orchestrator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVICE__ORCHESTRATOR = eINSTANCE.getPlatformService_Orchestrator();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceImpl <em>Orchestration Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.OrchestrationServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationService()
		 * @generated
		 */
		EClass ORCHESTRATION_SERVICE = eINSTANCE.getOrchestrationService();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION_SERVICE__SERVICES = eINSTANCE.getOrchestrationService_Services();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KubernetesServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKubernetesService()
		 * @generated
		 */
		EClass KUBERNETES_SERVICE = eINSTANCE.getKubernetesService();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_SERVICE__API_VERSION = eINSTANCE.getKubernetesService_ApiVersion();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SwarmServiceImpl <em>Swarm Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SwarmServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmService()
		 * @generated
		 */
		EClass SWARM_SERVICE = eINSTANCE.getSwarmService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SerializationServiceImpl <em>Serialization Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SerializationServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSerializationService()
		 * @generated
		 */
		EClass SERIALIZATION_SERVICE = eINSTANCE.getSerializationService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.AVROServiceImpl <em>AVRO Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.AVROServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getAVROService()
		 * @generated
		 */
		EClass AVRO_SERVICE = eINSTANCE.getAVROService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DistributionServiceImpl <em>Distribution Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DistributionServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDistributionService()
		 * @generated
		 */
		EClass DISTRIBUTION_SERVICE = eINSTANCE.getDistributionService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl <em>Zookeeper Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getZookeeperService()
		 * @generated
		 */
		EClass ZOOKEEPER_SERVICE = eINSTANCE.getZookeeperService();

		/**
		 * The meta object literal for the '<em><b>Server Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__SERVER_ID = eINSTANCE.getZookeeperService_ServerId();

		/**
		 * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__TICK_TIME = eINSTANCE.getZookeeperService_TickTime();

		/**
		 * The meta object literal for the '<em><b>Leader Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__LEADER_SERVERS = eINSTANCE.getZookeeperService_LeaderServers();

		/**
		 * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__INIT_LIMIT = eINSTANCE.getZookeeperService_InitLimit();

		/**
		 * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__SYNC_LIMIT = eINSTANCE.getZookeeperService_SyncLimit();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__CLIENT_PORT = eINSTANCE.getZookeeperService_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Peer Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__PEER_PORT = eINSTANCE.getZookeeperService_PeerPort();

		/**
		 * The meta object literal for the '<em><b>Leader Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__LEADER_PORT = eINSTANCE.getZookeeperService_LeaderPort();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.CommunicationServiceImpl <em>Communication Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.CommunicationServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCommunicationService()
		 * @generated
		 */
		EClass COMMUNICATION_SERVICE = eINSTANCE.getCommunicationService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl <em>Kafka Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KafkaServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKafkaService()
		 * @generated
		 */
		EClass KAFKA_SERVICE = eINSTANCE.getKafkaService();

		/**
		 * The meta object literal for the '<em><b>Comm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__COMM_ID = eINSTANCE.getKafkaService_CommId();

		/**
		 * The meta object literal for the '<em><b>Auto Create Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE = eINSTANCE.getKafkaService_AutoCreateTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Delete Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__DELETE_TOPIC_ENABLE = eINSTANCE.getKafkaService_DeleteTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_SERVICE__ZOOKEEPER_CONNECT = eINSTANCE.getKafkaService_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT = eINSTANCE.getKafkaService_ZookeeperConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Num Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_PARTITIONS = eINSTANCE.getKafkaService_NumPartitions();

		/**
		 * The meta object literal for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR = eINSTANCE.getKafkaService_NumRecoveryThreadsPerDataDir();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES = eINSTANCE.getKafkaService_LogFlushIntervalMessages();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LOG_FLUSH_INTERVAL = eINSTANCE.getKafkaService_LogFlushInterval();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LISTENERS = eINSTANCE.getKafkaService_Listeners();

		/**
		 * The meta object literal for the '<em><b>Advertised Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__ADVERTISED_LISTENERS = eINSTANCE.getKafkaService_AdvertisedListeners();

		/**
		 * The meta object literal for the '<em><b>Num Network Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_NETWORK_THREADS = eINSTANCE.getKafkaService_NumNetworkThreads();

		/**
		 * The meta object literal for the '<em><b>Num IO Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_IO_THREADS = eINSTANCE.getKafkaService_NumIOThreads();

		/**
		 * The meta object literal for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES = eINSTANCE.getKafkaService_SocketSendBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES = eINSTANCE.getKafkaService_SocketReceiveBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Request Max Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES = eINSTANCE.getKafkaService_SocketRequestMaxBytes();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__CLIENT_PORT = eINSTANCE.getKafkaService_ClientPort();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SchedulingServiceImpl <em>Scheduling Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SchedulingServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSchedulingService()
		 * @generated
		 */
		EClass SCHEDULING_SERVICE = eINSTANCE.getSchedulingService();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVICE__WORKFLOWS = eINSTANCE.getSchedulingService_Workflows();

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
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl <em>Spark Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SparkServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSparkService()
		 * @generated
		 */
		EClass SPARK_SERVICE = eINSTANCE.getSparkService();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVICE__LOAD = eINSTANCE.getSparkService_Load();

		/**
		 * The meta object literal for the '<em><b>Driver Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_CORES = eINSTANCE.getSparkService_DriverCores();

		/**
		 * The meta object literal for the '<em><b>Driver Max Result Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE = eINSTANCE.getSparkService_DriverMaxResultSize();

		/**
		 * The meta object literal for the '<em><b>Driver Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_MEMORY = eINSTANCE.getSparkService_DriverMemory();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOCAL_DIR = eINSTANCE.getSparkService_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVICE__MASTER = eINSTANCE.getSparkService_Master();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__WINDOW_SIZE = eINSTANCE.getSparkService_WindowSize();

		/**
		 * The meta object literal for the '<em><b>Executor Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__EXECUTOR_MEMORY = eINSTANCE.getSparkService_ExecutorMemory();

		/**
		 * The meta object literal for the '<em><b>Extra Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__EXTRA_LISTENER = eINSTANCE.getSparkService_ExtraListener();

		/**
		 * The meta object literal for the '<em><b>Log Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOG_CONF = eINSTANCE.getSparkService_LogConf();

		/**
		 * The meta object literal for the '<em><b>Submit Deploy Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__SUBMIT_DEPLOY_MODE = eINSTANCE.getSparkService_SubmitDeployMode();

		/**
		 * The meta object literal for the '<em><b>Log Caller Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOG_CALLER_CONTEXT = eINSTANCE.getSparkService_LogCallerContext();

		/**
		 * The meta object literal for the '<em><b>Driver Superviser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_SUPERVISER = eINSTANCE.getSparkService_DriverSuperviser();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StormServiceImpl <em>Storm Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StormServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormService()
		 * @generated
		 */
		EClass STORM_SERVICE = eINSTANCE.getStormService();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__ZOOKEEPER_CONNECT = eINSTANCE.getStormService_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVICE__LOCAL_DIR = eINSTANCE.getStormService_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Nimbus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__NIMBUS = eINSTANCE.getStormService_Nimbus();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__SUPERVISOR = eINSTANCE.getStormService_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Ui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__UI = eINSTANCE.getStormService_Ui();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StormUIImpl <em>Storm UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StormUIImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormUI()
		 * @generated
		 */
		EClass STORM_UI = eINSTANCE.getStormUI();

		/**
		 * The meta object literal for the '<em><b>Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_UI__UI_PORT = eINSTANCE.getStormUI_UiPort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_UI__OWNER = eINSTANCE.getStormUI_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_UI__HOST = eINSTANCE.getStormUI_Host();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StormNimbusImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormNimbus()
		 * @generated
		 */
		EClass STORM_NIMBUS = eINSTANCE.getStormNimbus();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_NIMBUS__OWNER = eINSTANCE.getStormNimbus_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_NIMBUS__HOST = eINSTANCE.getStormNimbus_Host();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.StormSupervisorImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getStormSupervisor()
		 * @generated
		 */
		EClass STORM_SUPERVISOR = eINSTANCE.getStormSupervisor();

		/**
		 * The meta object literal for the '<em><b>Supervisor Slot Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS = eINSTANCE.getStormSupervisor_SupervisorSlotPorts();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SUPERVISOR__OWNER = eINSTANCE.getStormSupervisor_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SUPERVISOR__HOST = eINSTANCE.getStormSupervisor_Host();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PersistenceServiceImpl <em>Persistence Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PersistenceServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPersistenceService()
		 * @generated
		 */
		EClass PERSISTENCE_SERVICE = eINSTANCE.getPersistenceService();

		/**
		 * The meta object literal for the '<em><b>Logging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__LOGGING = eINSTANCE.getPersistenceService_Logging();

		/**
		 * The meta object literal for the '<em><b>Passwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__PASSWD = eINSTANCE.getPersistenceService_Passwd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__PORT = eINSTANCE.getPersistenceService_Port();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MemSQLServiceImpl <em>Mem SQL Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MemSQLServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMemSQLService()
		 * @generated
		 */
		EClass MEM_SQL_SERVICE = eINSTANCE.getMemSQLService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl <em>Cassandra Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.CassandraServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getCassandraService()
		 * @generated
		 */
		EClass CASSANDRA_SERVICE = eINSTANCE.getCassandraService();

		/**
		 * The meta object literal for the '<em><b>Num Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__NUM_TOKENS = eINSTANCE.getCassandraService_NumTokens();

		/**
		 * The meta object literal for the '<em><b>Seeds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__SEEDS = eINSTANCE.getCassandraService_Seeds();

		/**
		 * The meta object literal for the '<em><b>Seed Provider Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__SEED_PROVIDER_CLASS = eINSTANCE.getCassandraService_SeedProviderClass();

		/**
		 * The meta object literal for the '<em><b>Endpoint Snitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__ENDPOINT_SNITCH = eINSTANCE.getCassandraService_EndpointSnitch();

		/**
		 * The meta object literal for the '<em><b>Data File Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__DATA_FILE_DIR = eINSTANCE.getCassandraService_DataFileDir();

		/**
		 * The meta object literal for the '<em><b>Storage Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__STORAGE_PORT = eINSTANCE.getCassandraService_StoragePort();

		/**
		 * The meta object literal for the '<em><b>Auto Bootstrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__AUTO_BOOTSTRAP = eINSTANCE.getCassandraService_AutoBootstrap();

		/**
		 * The meta object literal for the '<em><b>Cql Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__CQL_SCHEMAS = eINSTANCE.getCassandraService_CqlSchemas();

		/**
		 * The meta object literal for the '<em><b>Data Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__DATA_CENTERS = eINSTANCE.getCassandraService_DataCenters();

		/**
		 * The meta object literal for the '<em><b>Ssl Storage Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__SSL_STORAGE_PORT = eINSTANCE.getCassandraService_SslStoragePort();

		/**
		 * The meta object literal for the '<em><b>Rpc Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__RPC_PORT = eINSTANCE.getCassandraService_RpcPort();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DataCenterImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Racks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__RACKS = eINSTANCE.getDataCenter_Racks();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.RackImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__NODES = eINSTANCE.getRack_Nodes();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.Neo4JServiceImpl <em>Neo4 JService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.Neo4JServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNeo4JService()
		 * @generated
		 */
		EClass NEO4_JSERVICE = eINSTANCE.getNeo4JService();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.MonitoringServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getMonitoringService()
		 * @generated
		 */
		EClass MONITORING_SERVICE = eINSTANCE.getMonitoringService();

		/**
		 * The meta object literal for the '<em><b>Monitorized Meters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_SERVICE__MONITORIZED_METERS = eINSTANCE.getMonitoringService_MonitorizedMeters();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PrometheusServiceImpl <em>Prometheus Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PrometheusServiceImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPrometheusService()
		 * @generated
		 */
		EClass PROMETHEUS_SERVICE = eINSTANCE.getPrometheusService();

		/**
		 * The meta object literal for the '<em><b>Exporters Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMETHEUS_SERVICE__EXPORTERS_DATA = eINSTANCE.getPrometheusService_ExportersData();

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
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeployableComponentImpl <em>Deployable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeployableComponentImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeployableComponent()
		 * @generated
		 */
		EClass DEPLOYABLE_COMPONENT = eINSTANCE.getDeployableComponent();

		/**
		 * The meta object literal for the '<em><b>Deployment Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG = eINSTANCE.getDeployableComponent_DeploymentConfig();

		/**
		 * The meta object literal for the '<em><b>Configure Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT = eINSTANCE.getDeployableComponent__ConfigureDeployment();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeploymentConfigurationImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentConfiguration()
		 * @generated
		 */
		EClass DEPLOYMENT_CONFIGURATION = eINSTANCE.getDeploymentConfiguration();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.PlatformServiceDeploymentConfImpl <em>Platform Service Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.PlatformServiceDeploymentConfImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getPlatformServiceDeploymentConf()
		 * @generated
		 */
		EClass PLATFORM_SERVICE_DEPLOYMENT_CONF = eINSTANCE.getPlatformServiceDeploymentConf();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl <em>Orchestration Service Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getOrchestrationServiceDeploymentConf()
		 * @generated
		 */
		EClass ORCHESTRATION_SERVICE_DEPLOYMENT_CONF = eINSTANCE.getOrchestrationServiceDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE = eINSTANCE.getOrchestrationServiceDeploymentConf_Image();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS = eINSTANCE.getOrchestrationServiceDeploymentConf_Replicas();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND = eINSTANCE.getOrchestrationServiceDeploymentConf_Command();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY = eINSTANCE.getOrchestrationServiceDeploymentConf_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Image Pull Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = eINSTANCE.getOrchestrationServiceDeploymentConf_ImagePullPolicy();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES = eINSTANCE.getOrchestrationServiceDeploymentConf_Volumes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS = eINSTANCE.getOrchestrationServiceDeploymentConf_Ports();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS = eINSTANCE.getOrchestrationServiceDeploymentConf_Constraints();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.NodeClusterDeploymentConfImpl <em>Node Cluster Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.NodeClusterDeploymentConfImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getNodeClusterDeploymentConf()
		 * @generated
		 */
		EClass NODE_CLUSTER_DEPLOYMENT_CONF = eINSTANCE.getNodeClusterDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Artifact Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__ARTIFACT_LOCATOR = eINSTANCE.getNodeClusterDeploymentConf_ArtifactLocator();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__ARTIFACT_NAME = eINSTANCE.getNodeClusterDeploymentConf_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Config Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH = eINSTANCE.getNodeClusterDeploymentConf_ConfigFolderPath();

		/**
		 * The meta object literal for the '<em><b>Script Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH = eINSTANCE.getNodeClusterDeploymentConf_ScriptFolderPath();

		/**
		 * The meta object literal for the '<em><b>Data Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__DATA_FOLDER_PATH = eINSTANCE.getNodeClusterDeploymentConf_DataFolderPath();

		/**
		 * The meta object literal for the '<em><b>Log Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__LOG_FOLDER_PATH = eINSTANCE.getNodeClusterDeploymentConf_LogFolderPath();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__ARGUMENTS = eINSTANCE.getNodeClusterDeploymentConf_Arguments();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CLUSTER_DEPLOYMENT_CONF__IS_RUNNING = eINSTANCE.getNodeClusterDeploymentConf_IsRunning();

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
		 * The meta object literal for the '<em><b>Local Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DESCRIPTOR__LOCAL_PATH = eINSTANCE.getArtifactDescriptor_LocalPath();

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
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.SwarmPortImpl <em>Swarm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.SwarmPortImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getSwarmPort()
		 * @generated
		 */
		EClass SWARM_PORT = eINSTANCE.getSwarmPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_PORT__PROTOCOL = eINSTANCE.getSwarmPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_PORT__MODE = eINSTANCE.getSwarmPort_Mode();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.KubernetesPortImpl <em>Kubernetes Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.KubernetesPortImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getKubernetesPort()
		 * @generated
		 */
		EClass KUBERNETES_PORT = eINSTANCE.getKubernetesPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_PORT__NAME = eINSTANCE.getKubernetesPort_Name();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getDeploymentConstraints()
		 * @generated
		 */
		EClass DEPLOYMENT_CONSTRAINTS = eINSTANCE.getDeploymentConstraints();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__LABELS = eINSTANCE.getDeploymentConstraints_Labels();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__RESOURCES = eINSTANCE.getDeploymentConstraints_Resources();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TYPE = eINSTANCE.getVolume_Type();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__ACCESS_MODE = eINSTANCE.getVolume_AccessMode();

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
		 * The meta object literal for the '<em><b>Get Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE_CLUSTER___GET_NODES = eINSTANCE.getNodeCluster__GetNodes();

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
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.VolumeType <em>Volume Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.VolumeType
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeType()
		 * @generated
		 */
		EEnum VOLUME_TYPE = eINSTANCE.getVolumeType();

		/**
		 * The meta object literal for the '{@link PASYS_Metamodel.pasys.VolumeAccessMode <em>Volume Access Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PASYS_Metamodel.pasys.VolumeAccessMode
		 * @see PASYS_Metamodel.pasys.impl.PasysPackageImpl#getVolumeAccessMode()
		 * @generated
		 */
		EEnum VOLUME_ACCESS_MODE = eINSTANCE.getVolumeAccessMode();

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
