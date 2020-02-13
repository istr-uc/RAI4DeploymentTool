/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.CommunicationServer;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.SystemComponent;
import PASYS_Metamodel.pasys.WorkloadStreamData;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getRetention_ms <em>Retention ms</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getRetention_bytes <em>Retention bytes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#isCleanupPolicy <em>Cleanup Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getNumPartitions <em>Num Partitions</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getNumReplication <em>Num Replication</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getAssignedPartition <em>Assigned Partition</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getSchemaFile <em>Schema File</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkloadStreamDataImpl#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkloadStreamDataImpl extends SystemElementImpl implements WorkloadStreamData {
	/**
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected String artifactLocator = ARTIFACT_LOCATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arguments;

	/**
	 * The default value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptFolderPath = SCRIPT_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String configFolderPath = CONFIG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String dataFolderPath = DATA_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String logFolderPath = LOG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUNNING_EDEFAULT = false; // TODO The default value literal "" is not valid.

	/**
	 * The cached value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean isRunning = IS_RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetention_ms() <em>Retention ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_ms()
	 * @generated
	 * @ordered
	 */
	protected static final long RETENTION_MS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRetention_ms() <em>Retention ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_ms()
	 * @generated
	 * @ordered
	 */
	protected long retention_ms = RETENTION_MS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetention_bytes() <em>Retention bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int RETENTION_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetention_bytes() <em>Retention bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetention_bytes()
	 * @generated
	 * @ordered
	 */
	protected int retention_bytes = RETENTION_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCleanupPolicy() <em>Cleanup Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanupPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEANUP_POLICY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleanupPolicy() <em>Cleanup Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanupPolicy()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanupPolicy = CLEANUP_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPartitions() <em>Num Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PARTITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumPartitions() <em>Num Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPartitions()
	 * @generated
	 * @ordered
	 */
	protected int numPartitions = NUM_PARTITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumReplication() <em>Num Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumReplication()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_REPLICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumReplication() <em>Num Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumReplication()
	 * @generated
	 * @ordered
	 */
	protected int numReplication = NUM_REPLICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMeters() <em>Owned Meters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamRateMeter> ownedMeters;

	/**
	 * The cached value of the '{@link #getAssignedPartition() <em>Assigned Partition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamDataPartition> assignedPartition;

	/**
	 * The default value of the '{@link #getMessageSize() <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MESSAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMessageSize() <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSize()
	 * @generated
	 * @ordered
	 */
	protected int messageSize = MESSAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaFile() <em>Schema File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaFile()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaFile() <em>Schema File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaFile()
	 * @generated
	 * @ordered
	 */
	protected String schemaFile = SCHEMA_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected CommunicationServer holder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadStreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.WORKLOAD_STREAM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRetention_ms() {
		return retention_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetention_ms(long newRetention_ms) {
		long oldRetention_ms = retention_ms;
		retention_ms = newRetention_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS, oldRetention_ms, retention_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetention_bytes() {
		return retention_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetention_bytes(int newRetention_bytes) {
		int oldRetention_bytes = retention_bytes;
		retention_bytes = newRetention_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES, oldRetention_bytes, retention_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCleanupPolicy() {
		return cleanupPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleanupPolicy(boolean newCleanupPolicy) {
		boolean oldCleanupPolicy = cleanupPolicy;
		cleanupPolicy = newCleanupPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY, oldCleanupPolicy, cleanupPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumPartitions() {
		return numPartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPartitions(int newNumPartitions) {
		int oldNumPartitions = numPartitions;
		numPartitions = newNumPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS, oldNumPartitions, numPartitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumReplication() {
		return numReplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumReplication(int newNumReplication) {
		int oldNumReplication = numReplication;
		numReplication = newNumReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION, oldNumReplication, numReplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StreamRateMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<StreamRateMeter>(StreamRateMeter.class, this, PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS, PasysPackage.STREAM_RATE_METER__OWNER);
		}
		return ownedMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StreamDataPartition> getAssignedPartition() {
		if (assignedPartition == null) {
			assignedPartition = new EObjectContainmentEList<StreamDataPartition>(StreamDataPartition.class, this, PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION);
		}
		return assignedPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMessageSize() {
		return messageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageSize(int newMessageSize) {
		int oldMessageSize = messageSize;
		messageSize = newMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE, oldMessageSize, messageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaFile() {
		return schemaFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaFile(String newSchemaFile) {
		String oldSchemaFile = schemaFile;
		schemaFile = newSchemaFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE, oldSchemaFile, schemaFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactLocator() {
		return artifactLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactLocator(String newArtifactLocator) {
		String oldArtifactLocator = artifactLocator;
		artifactLocator = newArtifactLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR, oldArtifactLocator, artifactLocator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArguments() {
		if (arguments == null) {
			arguments = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptFolderPath() {
		return scriptFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptFolderPath(String newScriptFolderPath) {
		String oldScriptFolderPath = scriptFolderPath;
		scriptFolderPath = newScriptFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH, oldScriptFolderPath, scriptFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigFolderPath() {
		return configFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigFolderPath(String newConfigFolderPath) {
		String oldConfigFolderPath = configFolderPath;
		configFolderPath = newConfigFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH, oldConfigFolderPath, configFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFolderPath() {
		return dataFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFolderPath(String newDataFolderPath) {
		String oldDataFolderPath = dataFolderPath;
		dataFolderPath = newDataFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH, oldDataFolderPath, dataFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFolderPath() {
		return logFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFolderPath(String newLogFolderPath) {
		String oldLogFolderPath = logFolderPath;
		logFolderPath = newLogFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH, oldLogFolderPath, logFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRunning() {
		return isRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRunning(boolean newIsRunning) {
		boolean oldIsRunning = isRunning;
		isRunning = newIsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING, oldIsRunning, isRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServer getHolder() {
		if (holder != null && holder.eIsProxy()) {
			InternalEObject oldHolder = (InternalEObject)holder;
			holder = (CommunicationServer)eResolveProxy(oldHolder);
			if (holder != oldHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.WORKLOAD_STREAM_DATA__HOLDER, oldHolder, holder));
			}
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationServer basicGetHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHolder(CommunicationServer newHolder) {
		CommunicationServer oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKLOAD_STREAM_DATA__HOLDER, oldHolder, holder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deploy() throws ConfigurationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMeters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION:
				return ((InternalEList<?>)getAssignedPartition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME:
				return getArtifactName();
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR:
				return getArtifactLocator();
			case PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS:
				return getArguments();
			case PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH:
				return getScriptFolderPath();
			case PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH:
				return getConfigFolderPath();
			case PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH:
				return getDataFolderPath();
			case PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH:
				return getLogFolderPath();
			case PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING:
				return isIsRunning();
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS:
				return getRetention_ms();
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES:
				return getRetention_bytes();
			case PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY:
				return isCleanupPolicy();
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS:
				return getNumPartitions();
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION:
				return getNumReplication();
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				return getOwnedMeters();
			case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION:
				return getAssignedPartition();
			case PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE:
				return getMessageSize();
			case PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE:
				return getSchemaFile();
			case PasysPackage.WORKLOAD_STREAM_DATA__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR:
				setArtifactLocator((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH:
				setScriptFolderPath((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH:
				setConfigFolderPath((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH:
				setDataFolderPath((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH:
				setLogFolderPath((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING:
				setIsRunning((Boolean)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS:
				setRetention_ms((Long)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes((Integer)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy((Boolean)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions((Integer)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION:
				setNumReplication((Integer)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends StreamRateMeter>)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				getAssignedPartition().addAll((Collection<? extends StreamDataPartition>)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE:
				setMessageSize((Integer)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE:
				setSchemaFile((String)newValue);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__HOLDER:
				setHolder((CommunicationServer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR:
				setArtifactLocator(ARTIFACT_LOCATOR_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS:
				getArguments().clear();
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH:
				setScriptFolderPath(SCRIPT_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH:
				setConfigFolderPath(CONFIG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH:
				setDataFolderPath(DATA_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH:
				setLogFolderPath(LOG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING:
				setIsRunning(IS_RUNNING_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS:
				setRetention_ms(RETENTION_MS_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes(RETENTION_BYTES_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy(CLEANUP_POLICY_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions(NUM_PARTITIONS_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION:
				setNumReplication(NUM_REPLICATION_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE:
				setMessageSize(MESSAGE_SIZE_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE:
				setSchemaFile(SCHEMA_FILE_EDEFAULT);
				return;
			case PasysPackage.WORKLOAD_STREAM_DATA__HOLDER:
				setHolder((CommunicationServer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR:
				return ARTIFACT_LOCATOR_EDEFAULT == null ? artifactLocator != null : !ARTIFACT_LOCATOR_EDEFAULT.equals(artifactLocator);
			case PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH:
				return SCRIPT_FOLDER_PATH_EDEFAULT == null ? scriptFolderPath != null : !SCRIPT_FOLDER_PATH_EDEFAULT.equals(scriptFolderPath);
			case PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH:
				return CONFIG_FOLDER_PATH_EDEFAULT == null ? configFolderPath != null : !CONFIG_FOLDER_PATH_EDEFAULT.equals(configFolderPath);
			case PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH:
				return DATA_FOLDER_PATH_EDEFAULT == null ? dataFolderPath != null : !DATA_FOLDER_PATH_EDEFAULT.equals(dataFolderPath);
			case PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH:
				return LOG_FOLDER_PATH_EDEFAULT == null ? logFolderPath != null : !LOG_FOLDER_PATH_EDEFAULT.equals(logFolderPath);
			case PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING:
				return isRunning != IS_RUNNING_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS:
				return retention_ms != RETENTION_MS_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES:
				return retention_bytes != RETENTION_BYTES_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY:
				return cleanupPolicy != CLEANUP_POLICY_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS:
				return numPartitions != NUM_PARTITIONS_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION:
				return numReplication != NUM_REPLICATION_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
			case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION:
				return assignedPartition != null && !assignedPartition.isEmpty();
			case PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE:
				return messageSize != MESSAGE_SIZE_EDEFAULT;
			case PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE:
				return SCHEMA_FILE_EDEFAULT == null ? schemaFile != null : !SCHEMA_FILE_EDEFAULT.equals(schemaFile);
			case PasysPackage.WORKLOAD_STREAM_DATA__HOLDER:
				return holder != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SystemComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME;
				case PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR;
				case PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS: return PasysPackage.SYSTEM_COMPONENT__ARGUMENTS;
				case PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;
				case PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;
				case PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH;
				case PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH;
				case PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING: return PasysPackage.SYSTEM_COMPONENT__IS_RUNNING;
				default: return -1;
			}
		}
		if (baseClass == StreamData.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS: return PasysPackage.STREAM_DATA__RETENTION_MS;
				case PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES: return PasysPackage.STREAM_DATA__RETENTION_BYTES;
				case PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY: return PasysPackage.STREAM_DATA__CLEANUP_POLICY;
				case PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS: return PasysPackage.STREAM_DATA__NUM_PARTITIONS;
				case PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION: return PasysPackage.STREAM_DATA__NUM_REPLICATION;
				case PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS: return PasysPackage.STREAM_DATA__OWNED_METERS;
				case PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION: return PasysPackage.STREAM_DATA__ASSIGNED_PARTITION;
				case PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE: return PasysPackage.STREAM_DATA__MESSAGE_SIZE;
				case PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE: return PasysPackage.STREAM_DATA__SCHEMA_FILE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SystemComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME: return PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_NAME;
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR: return PasysPackage.WORKLOAD_STREAM_DATA__ARTIFACT_LOCATOR;
				case PasysPackage.SYSTEM_COMPONENT__ARGUMENTS: return PasysPackage.WORKLOAD_STREAM_DATA__ARGUMENTS;
				case PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH: return PasysPackage.WORKLOAD_STREAM_DATA__SCRIPT_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH: return PasysPackage.WORKLOAD_STREAM_DATA__CONFIG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH: return PasysPackage.WORKLOAD_STREAM_DATA__DATA_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH: return PasysPackage.WORKLOAD_STREAM_DATA__LOG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__IS_RUNNING: return PasysPackage.WORKLOAD_STREAM_DATA__IS_RUNNING;
				default: return -1;
			}
		}
		if (baseClass == StreamData.class) {
			switch (baseFeatureID) {
				case PasysPackage.STREAM_DATA__RETENTION_MS: return PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_MS;
				case PasysPackage.STREAM_DATA__RETENTION_BYTES: return PasysPackage.WORKLOAD_STREAM_DATA__RETENTION_BYTES;
				case PasysPackage.STREAM_DATA__CLEANUP_POLICY: return PasysPackage.WORKLOAD_STREAM_DATA__CLEANUP_POLICY;
				case PasysPackage.STREAM_DATA__NUM_PARTITIONS: return PasysPackage.WORKLOAD_STREAM_DATA__NUM_PARTITIONS;
				case PasysPackage.STREAM_DATA__NUM_REPLICATION: return PasysPackage.WORKLOAD_STREAM_DATA__NUM_REPLICATION;
				case PasysPackage.STREAM_DATA__OWNED_METERS: return PasysPackage.WORKLOAD_STREAM_DATA__OWNED_METERS;
				case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION: return PasysPackage.WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION;
				case PasysPackage.STREAM_DATA__MESSAGE_SIZE: return PasysPackage.WORKLOAD_STREAM_DATA__MESSAGE_SIZE;
				case PasysPackage.STREAM_DATA__SCHEMA_FILE: return PasysPackage.WORKLOAD_STREAM_DATA__SCHEMA_FILE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SystemComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.SYSTEM_COMPONENT___DEPLOY: return PasysPackage.WORKLOAD_STREAM_DATA___DEPLOY;
				default: return -1;
			}
		}
		if (baseClass == StreamData.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.WORKLOAD_STREAM_DATA___DEPLOY:
				try {
					deploy();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifactName: ");
		result.append(artifactName);
		result.append(", artifactLocator: ");
		result.append(artifactLocator);
		result.append(", arguments: ");
		result.append(arguments);
		result.append(", scriptFolderPath: ");
		result.append(scriptFolderPath);
		result.append(", configFolderPath: ");
		result.append(configFolderPath);
		result.append(", dataFolderPath: ");
		result.append(dataFolderPath);
		result.append(", logFolderPath: ");
		result.append(logFolderPath);
		result.append(", isRunning: ");
		result.append(isRunning);
		result.append(", retention_ms: ");
		result.append(retention_ms);
		result.append(", retention_bytes: ");
		result.append(retention_bytes);
		result.append(", cleanupPolicy: ");
		result.append(cleanupPolicy);
		result.append(", numPartitions: ");
		result.append(numPartitions);
		result.append(", numReplication: ");
		result.append(numReplication);
		result.append(", messageSize: ");
		result.append(messageSize);
		result.append(", schemaFile: ");
		result.append(schemaFile);
		result.append(')');
		return result.toString();
	}

} //WorkloadStreamDataImpl
