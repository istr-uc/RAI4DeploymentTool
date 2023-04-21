/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeployableComponent;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamRateMeter;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowStreamData;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getDeploymentConfig <em>Deployment Config</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getRetention_ms <em>Retention ms</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getRetention_bytes <em>Retention bytes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#isCleanupPolicy <em>Cleanup Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getNumPartitions <em>Num Partitions</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getNumReplication <em>Num Replication</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getAssignedPartition <em>Assigned Partition</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getSchemaFile <em>Schema File</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#isIsSingleUse <em>Is Single Use</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowStreamDataImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WorkflowStreamDataImpl extends NamedElementImpl implements WorkflowStreamData {
	/**
	 * The cached value of the '{@link #getDeploymentConfig() <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConfig()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConfiguration deploymentConfig;

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
	 * The default value of the '{@link #isIsSingleUse() <em>Is Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleUse() <em>Is Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleUse()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleUse = IS_SINGLE_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowStreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.WORKFLOW_STREAM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConfiguration getDeploymentConfig() {
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConfig(DeploymentConfiguration newDeploymentConfig, NotificationChain msgs) {
		DeploymentConfiguration oldDeploymentConfig = deploymentConfig;
		deploymentConfig = newDeploymentConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG, oldDeploymentConfig, newDeploymentConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentConfig(DeploymentConfiguration newDeploymentConfig) {
		if (newDeploymentConfig != deploymentConfig) {
			NotificationChain msgs = null;
			if (deploymentConfig != null)
				msgs = ((InternalEObject)deploymentConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG, null, msgs);
			if (newDeploymentConfig != null)
				msgs = ((InternalEObject)newDeploymentConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG, null, msgs);
			msgs = basicSetDeploymentConfig(newDeploymentConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG, newDeploymentConfig, newDeploymentConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS, oldRetention_ms, retention_ms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES, oldRetention_bytes, retention_bytes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY, oldCleanupPolicy, cleanupPolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS, oldNumPartitions, numPartitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION, oldNumReplication, numReplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StreamRateMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<StreamRateMeter>(StreamRateMeter.class, this, PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS, PasysPackage.STREAM_RATE_METER__OWNER);
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
			assignedPartition = new EObjectContainmentEList<StreamDataPartition>(StreamDataPartition.class, this, PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE, oldMessageSize, messageSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE, oldSchemaFile, schemaFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSingleUse() {
		return isSingleUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSingleUse(boolean newIsSingleUse) {
		boolean oldIsSingleUse = isSingleUse;
		isSingleUse = newIsSingleUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE, oldIsSingleUse, isSingleUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getOwner() {
		if (eContainerFeatureID() != PasysPackage.WORKFLOW_STREAM_DATA__OWNER) return null;
		return (Workflow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Workflow newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.WORKFLOW_STREAM_DATA__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Workflow newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.WORKFLOW_STREAM_DATA__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.WORKFLOW__OWNED_STREAM_DATA, Workflow.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW_STREAM_DATA__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
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
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMeters()).basicAdd(otherEnd, msgs);
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Workflow)otherEnd, msgs);
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
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
				return basicSetDeploymentConfig(null, msgs);
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
				return ((InternalEList<?>)getAssignedPartition()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.WORKFLOW__OWNED_STREAM_DATA, Workflow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
				return getDeploymentConfig();
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS:
				return getRetention_ms();
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES:
				return getRetention_bytes();
			case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY:
				return isCleanupPolicy();
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS:
				return getNumPartitions();
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION:
				return getNumReplication();
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				return getOwnedMeters();
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
				return getAssignedPartition();
			case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE:
				return getMessageSize();
			case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE:
				return getSchemaFile();
			case PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE:
				return isIsSingleUse();
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				return getOwner();
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
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS:
				setRetention_ms((Long)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes((Integer)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy((Boolean)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions((Integer)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION:
				setNumReplication((Integer)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends StreamRateMeter>)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				getAssignedPartition().addAll((Collection<? extends StreamDataPartition>)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE:
				setMessageSize((Integer)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE:
				setSchemaFile((String)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE:
				setIsSingleUse((Boolean)newValue);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				setOwner((Workflow)newValue);
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
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)null);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS:
				setRetention_ms(RETENTION_MS_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes(RETENTION_BYTES_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy(CLEANUP_POLICY_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions(NUM_PARTITIONS_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION:
				setNumReplication(NUM_REPLICATION_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE:
				setMessageSize(MESSAGE_SIZE_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE:
				setSchemaFile(SCHEMA_FILE_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE:
				setIsSingleUse(IS_SINGLE_USE_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				setOwner((Workflow)null);
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
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
				return deploymentConfig != null;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS:
				return retention_ms != RETENTION_MS_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES:
				return retention_bytes != RETENTION_BYTES_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY:
				return cleanupPolicy != CLEANUP_POLICY_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS:
				return numPartitions != NUM_PARTITIONS_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION:
				return numReplication != NUM_REPLICATION_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
				return assignedPartition != null && !assignedPartition.isEmpty();
			case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE:
				return messageSize != MESSAGE_SIZE_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE:
				return SCHEMA_FILE_EDEFAULT == null ? schemaFile != null : !SCHEMA_FILE_EDEFAULT.equals(schemaFile);
			case PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE:
				return isSingleUse != IS_SINGLE_USE_EDEFAULT;
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNER:
				return getOwner() != null;
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
		if (baseClass == DeployableComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG: return PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		if (baseClass == StreamData.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS: return PasysPackage.STREAM_DATA__RETENTION_MS;
				case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES: return PasysPackage.STREAM_DATA__RETENTION_BYTES;
				case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY: return PasysPackage.STREAM_DATA__CLEANUP_POLICY;
				case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS: return PasysPackage.STREAM_DATA__NUM_PARTITIONS;
				case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION: return PasysPackage.STREAM_DATA__NUM_REPLICATION;
				case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS: return PasysPackage.STREAM_DATA__OWNED_METERS;
				case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION: return PasysPackage.STREAM_DATA__ASSIGNED_PARTITION;
				case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE: return PasysPackage.STREAM_DATA__MESSAGE_SIZE;
				case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE: return PasysPackage.STREAM_DATA__SCHEMA_FILE;
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
		if (baseClass == DeployableComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG: return PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		if (baseClass == StreamData.class) {
			switch (baseFeatureID) {
				case PasysPackage.STREAM_DATA__RETENTION_MS: return PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS;
				case PasysPackage.STREAM_DATA__RETENTION_BYTES: return PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES;
				case PasysPackage.STREAM_DATA__CLEANUP_POLICY: return PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY;
				case PasysPackage.STREAM_DATA__NUM_PARTITIONS: return PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS;
				case PasysPackage.STREAM_DATA__NUM_REPLICATION: return PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION;
				case PasysPackage.STREAM_DATA__OWNED_METERS: return PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS;
				case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION: return PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION;
				case PasysPackage.STREAM_DATA__MESSAGE_SIZE: return PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE;
				case PasysPackage.STREAM_DATA__SCHEMA_FILE: return PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE;
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
		if (baseClass == DeployableComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT: return PasysPackage.WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;
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
			case PasysPackage.WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT:
				try {
					configureDeployment();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (retention_ms: ");
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
		result.append(", isSingleUse: ");
		result.append(isSingleUse);
		result.append(')');
		return result.toString();
	}

} //WorkflowStreamDataImpl
