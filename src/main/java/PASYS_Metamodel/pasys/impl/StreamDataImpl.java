/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataPartition;
import PASYS_Metamodel.pasys.StreamRateMeter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getRetention_ms <em>Retention ms</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getRetention_bytes <em>Retention bytes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#isCleanupPolicy <em>Cleanup Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getNumPartitions <em>Num Partitions</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getNumReplication <em>Num Replication</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getAssignedPartition <em>Assigned Partition</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamDataImpl#getSchemaFile <em>Schema File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StreamDataImpl extends SystemComponentImpl implements StreamData {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STREAM_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__RETENTION_MS, oldRetention_ms, retention_ms));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__RETENTION_BYTES, oldRetention_bytes, retention_bytes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__CLEANUP_POLICY, oldCleanupPolicy, cleanupPolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__NUM_PARTITIONS, oldNumPartitions, numPartitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__NUM_REPLICATION, oldNumReplication, numReplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StreamRateMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<StreamRateMeter>(StreamRateMeter.class, this, PasysPackage.STREAM_DATA__OWNED_METERS, PasysPackage.STREAM_RATE_METER__OWNER);
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
			assignedPartition = new EObjectContainmentEList<StreamDataPartition>(StreamDataPartition.class, this, PasysPackage.STREAM_DATA__ASSIGNED_PARTITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__MESSAGE_SIZE, oldMessageSize, messageSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_DATA__SCHEMA_FILE, oldSchemaFile, schemaFile));
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
			case PasysPackage.STREAM_DATA__OWNED_METERS:
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
			case PasysPackage.STREAM_DATA__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
			case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION:
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
			case PasysPackage.STREAM_DATA__RETENTION_MS:
				return getRetention_ms();
			case PasysPackage.STREAM_DATA__RETENTION_BYTES:
				return getRetention_bytes();
			case PasysPackage.STREAM_DATA__CLEANUP_POLICY:
				return isCleanupPolicy();
			case PasysPackage.STREAM_DATA__NUM_PARTITIONS:
				return getNumPartitions();
			case PasysPackage.STREAM_DATA__NUM_REPLICATION:
				return getNumReplication();
			case PasysPackage.STREAM_DATA__OWNED_METERS:
				return getOwnedMeters();
			case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION:
				return getAssignedPartition();
			case PasysPackage.STREAM_DATA__MESSAGE_SIZE:
				return getMessageSize();
			case PasysPackage.STREAM_DATA__SCHEMA_FILE:
				return getSchemaFile();
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
			case PasysPackage.STREAM_DATA__RETENTION_MS:
				setRetention_ms((Long)newValue);
				return;
			case PasysPackage.STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes((Integer)newValue);
				return;
			case PasysPackage.STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy((Boolean)newValue);
				return;
			case PasysPackage.STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions((Integer)newValue);
				return;
			case PasysPackage.STREAM_DATA__NUM_REPLICATION:
				setNumReplication((Integer)newValue);
				return;
			case PasysPackage.STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends StreamRateMeter>)newValue);
				return;
			case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				getAssignedPartition().addAll((Collection<? extends StreamDataPartition>)newValue);
				return;
			case PasysPackage.STREAM_DATA__MESSAGE_SIZE:
				setMessageSize((Integer)newValue);
				return;
			case PasysPackage.STREAM_DATA__SCHEMA_FILE:
				setSchemaFile((String)newValue);
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
			case PasysPackage.STREAM_DATA__RETENTION_MS:
				setRetention_ms(RETENTION_MS_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__RETENTION_BYTES:
				setRetention_bytes(RETENTION_BYTES_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__CLEANUP_POLICY:
				setCleanupPolicy(CLEANUP_POLICY_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__NUM_PARTITIONS:
				setNumPartitions(NUM_PARTITIONS_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__NUM_REPLICATION:
				setNumReplication(NUM_REPLICATION_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__OWNED_METERS:
				getOwnedMeters().clear();
				return;
			case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION:
				getAssignedPartition().clear();
				return;
			case PasysPackage.STREAM_DATA__MESSAGE_SIZE:
				setMessageSize(MESSAGE_SIZE_EDEFAULT);
				return;
			case PasysPackage.STREAM_DATA__SCHEMA_FILE:
				setSchemaFile(SCHEMA_FILE_EDEFAULT);
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
			case PasysPackage.STREAM_DATA__RETENTION_MS:
				return retention_ms != RETENTION_MS_EDEFAULT;
			case PasysPackage.STREAM_DATA__RETENTION_BYTES:
				return retention_bytes != RETENTION_BYTES_EDEFAULT;
			case PasysPackage.STREAM_DATA__CLEANUP_POLICY:
				return cleanupPolicy != CLEANUP_POLICY_EDEFAULT;
			case PasysPackage.STREAM_DATA__NUM_PARTITIONS:
				return numPartitions != NUM_PARTITIONS_EDEFAULT;
			case PasysPackage.STREAM_DATA__NUM_REPLICATION:
				return numReplication != NUM_REPLICATION_EDEFAULT;
			case PasysPackage.STREAM_DATA__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
			case PasysPackage.STREAM_DATA__ASSIGNED_PARTITION:
				return assignedPartition != null && !assignedPartition.isEmpty();
			case PasysPackage.STREAM_DATA__MESSAGE_SIZE:
				return messageSize != MESSAGE_SIZE_EDEFAULT;
			case PasysPackage.STREAM_DATA__SCHEMA_FILE:
				return SCHEMA_FILE_EDEFAULT == null ? schemaFile != null : !SCHEMA_FILE_EDEFAULT.equals(schemaFile);
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //StreamDataImpl
