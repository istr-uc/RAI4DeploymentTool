/**
 */

package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.MonitoringServer;
import PASYS_Metamodel.pasys.NamedElement;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.PrometheusMeter;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Hosted Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getName <em>Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getId <em>Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getMonitoringServer <em>Monitoring Server</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getMonitoringPort <em>Monitoring Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getMonitoringTime <em>Monitoring Time</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeHostedMeterImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeHostedMeterImpl extends SystemComponentImpl implements NodeHostedMeter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoringServer() <em>Monitoring Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringServer()
	 * @generated
	 * @ordered
	 */
	protected MonitoringServer monitoringServer;

	/**
	 * The default value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringPort()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITORING_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringPort()
	 * @generated
	 * @ordered
	 */
	protected int monitoringPort = MONITORING_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringTime() <em>Monitoring Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoringTime() <em>Monitoring Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringTime()
	 * @generated
	 * @ordered
	 */
	protected long monitoringTime = MONITORING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeHostedMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NODE_HOSTED_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringServer getMonitoringServer() {
		if (monitoringServer != null && monitoringServer.eIsProxy()) {
			InternalEObject oldMonitoringServer = (InternalEObject)monitoringServer;
			monitoringServer = (MonitoringServer)eResolveProxy(oldMonitoringServer);
			if (monitoringServer != oldMonitoringServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER, oldMonitoringServer, monitoringServer));
			}
		}
		return monitoringServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringServer basicGetMonitoringServer() {
		return monitoringServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoringServer(MonitoringServer newMonitoringServer, NotificationChain msgs) {
		MonitoringServer oldMonitoringServer = monitoringServer;
		monitoringServer = newMonitoringServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER, oldMonitoringServer, newMonitoringServer);
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
	public void setMonitoringServer(MonitoringServer newMonitoringServer) {
		if (newMonitoringServer != monitoringServer) {
			NotificationChain msgs = null;
			if (monitoringServer != null)
				msgs = ((InternalEObject)monitoringServer).eInverseRemove(this, PasysPackage.MONITORING_SERVER__MONITORIZED_METERS, MonitoringServer.class, msgs);
			if (newMonitoringServer != null)
				msgs = ((InternalEObject)newMonitoringServer).eInverseAdd(this, PasysPackage.MONITORING_SERVER__MONITORIZED_METERS, MonitoringServer.class, msgs);
			msgs = basicSetMonitoringServer(newMonitoringServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER, newMonitoringServer, newMonitoringServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMonitoringPort() {
		return monitoringPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringPort(int newMonitoringPort) {
		int oldMonitoringPort = monitoringPort;
		monitoringPort = newMonitoringPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__MONITORING_PORT, oldMonitoringPort, monitoringPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonitoringTime() {
		return monitoringTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringTime(long newMonitoringTime) {
		long oldMonitoringTime = monitoringTime;
		monitoringTime = newMonitoringTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__MONITORING_TIME, oldMonitoringTime, monitoringTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getOwner() {
		if (eContainerFeatureID() != PasysPackage.NODE_HOSTED_METER__OWNER) return null;
		return (ProcessingNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(ProcessingNode newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.NODE_HOSTED_METER__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(ProcessingNode newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.NODE_HOSTED_METER__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.PROCESSING_NODE__OWNED_METERS, ProcessingNode.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_HOSTED_METER__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrometheusServerConfiguration() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				if (monitoringServer != null)
					msgs = ((InternalEObject)monitoringServer).eInverseRemove(this, PasysPackage.MONITORING_SERVER__MONITORIZED_METERS, MonitoringServer.class, msgs);
				return basicSetMonitoringServer((MonitoringServer)otherEnd, msgs);
			case PasysPackage.NODE_HOSTED_METER__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((ProcessingNode)otherEnd, msgs);
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
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				return basicSetMonitoringServer(null, msgs);
			case PasysPackage.NODE_HOSTED_METER__OWNER:
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
			case PasysPackage.NODE_HOSTED_METER__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.PROCESSING_NODE__OWNED_METERS, ProcessingNode.class, msgs);
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
			case PasysPackage.NODE_HOSTED_METER__NAME:
				return getName();
			case PasysPackage.NODE_HOSTED_METER__ID:
				return getId();
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				if (resolve) return getMonitoringServer();
				return basicGetMonitoringServer();
			case PasysPackage.NODE_HOSTED_METER__MONITORING_PORT:
				return getMonitoringPort();
			case PasysPackage.NODE_HOSTED_METER__MONITORING_TIME:
				return getMonitoringTime();
			case PasysPackage.NODE_HOSTED_METER__OWNER:
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
			case PasysPackage.NODE_HOSTED_METER__NAME:
				setName((String)newValue);
				return;
			case PasysPackage.NODE_HOSTED_METER__ID:
				setId((String)newValue);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				setMonitoringServer((MonitoringServer)newValue);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_PORT:
				setMonitoringPort((Integer)newValue);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_TIME:
				setMonitoringTime((Long)newValue);
				return;
			case PasysPackage.NODE_HOSTED_METER__OWNER:
				setOwner((ProcessingNode)newValue);
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
			case PasysPackage.NODE_HOSTED_METER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PasysPackage.NODE_HOSTED_METER__ID:
				setId(ID_EDEFAULT);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				setMonitoringServer((MonitoringServer)null);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_PORT:
				setMonitoringPort(MONITORING_PORT_EDEFAULT);
				return;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_TIME:
				setMonitoringTime(MONITORING_TIME_EDEFAULT);
				return;
			case PasysPackage.NODE_HOSTED_METER__OWNER:
				setOwner((ProcessingNode)null);
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
			case PasysPackage.NODE_HOSTED_METER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PasysPackage.NODE_HOSTED_METER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER:
				return monitoringServer != null;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_PORT:
				return monitoringPort != MONITORING_PORT_EDEFAULT;
			case PasysPackage.NODE_HOSTED_METER__MONITORING_TIME:
				return monitoringTime != MONITORING_TIME_EDEFAULT;
			case PasysPackage.NODE_HOSTED_METER__OWNER:
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case PasysPackage.NODE_HOSTED_METER__NAME: return PasysPackage.NAMED_ELEMENT__NAME;
				case PasysPackage.NODE_HOSTED_METER__ID: return PasysPackage.NAMED_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == Meter.class) {
			switch (derivedFeatureID) {
				case PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER: return PasysPackage.METER__MONITORING_SERVER;
				default: return -1;
			}
		}
		if (baseClass == PrometheusMeter.class) {
			switch (derivedFeatureID) {
				case PasysPackage.NODE_HOSTED_METER__MONITORING_PORT: return PasysPackage.PROMETHEUS_METER__MONITORING_PORT;
				case PasysPackage.NODE_HOSTED_METER__MONITORING_TIME: return PasysPackage.PROMETHEUS_METER__MONITORING_TIME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case PasysPackage.NAMED_ELEMENT__NAME: return PasysPackage.NODE_HOSTED_METER__NAME;
				case PasysPackage.NAMED_ELEMENT__ID: return PasysPackage.NODE_HOSTED_METER__ID;
				default: return -1;
			}
		}
		if (baseClass == Meter.class) {
			switch (baseFeatureID) {
				case PasysPackage.METER__MONITORING_SERVER: return PasysPackage.NODE_HOSTED_METER__MONITORING_SERVER;
				default: return -1;
			}
		}
		if (baseClass == PrometheusMeter.class) {
			switch (baseFeatureID) {
				case PasysPackage.PROMETHEUS_METER__MONITORING_PORT: return PasysPackage.NODE_HOSTED_METER__MONITORING_PORT;
				case PasysPackage.PROMETHEUS_METER__MONITORING_TIME: return PasysPackage.NODE_HOSTED_METER__MONITORING_TIME;
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
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Meter.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PrometheusMeter.class) {
			switch (baseOperationID) {
				case PasysPackage.PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION: return PasysPackage.NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;
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
			case PasysPackage.NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION:
				return getPrometheusServerConfiguration();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", monitoringPort: ");
		result.append(monitoringPort);
		result.append(", monitoringTime: ");
		result.append(monitoringTime);
		result.append(')');
		return result.toString();
	}

} //NodeHostedMeterImpl
