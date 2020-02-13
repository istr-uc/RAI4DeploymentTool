/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.MonitoringServer;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.MeterImpl#getMonitoringServer <em>Monitoring Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeterImpl extends NamedElementImpl implements Meter {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.METER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.METER__MONITORING_SERVER, oldMonitoringServer, monitoringServer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.METER__MONITORING_SERVER, oldMonitoringServer, newMonitoringServer);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.METER__MONITORING_SERVER, newMonitoringServer, newMonitoringServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.METER__MONITORING_SERVER:
				if (monitoringServer != null)
					msgs = ((InternalEObject)monitoringServer).eInverseRemove(this, PasysPackage.MONITORING_SERVER__MONITORIZED_METERS, MonitoringServer.class, msgs);
				return basicSetMonitoringServer((MonitoringServer)otherEnd, msgs);
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
			case PasysPackage.METER__MONITORING_SERVER:
				return basicSetMonitoringServer(null, msgs);
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
			case PasysPackage.METER__MONITORING_SERVER:
				if (resolve) return getMonitoringServer();
				return basicGetMonitoringServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.METER__MONITORING_SERVER:
				setMonitoringServer((MonitoringServer)newValue);
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
			case PasysPackage.METER__MONITORING_SERVER:
				setMonitoringServer((MonitoringServer)null);
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
			case PasysPackage.METER__MONITORING_SERVER:
				return monitoringServer != null;
		}
		return super.eIsSet(featureID);
	}

} //MeterImpl
