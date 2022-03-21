/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PrometheusMeter;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Prometheus Meter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PrometheusMeterImpl#getMonitoringPort <em>Monitoring Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PrometheusMeterImpl#getMonitoringTime <em>Monitoring Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrometheusMeterImpl extends MeterImpl implements PrometheusMeter {
	/**
	 * The default value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonitoringPort()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITORING_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonitoringPort() <em>Monitoring Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonitoringPort()
	 * @generated
	 * @ordered
	 */
	protected int monitoringPort = MONITORING_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoringTime() <em>Monitoring Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonitoringTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MONITORING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonitoringTime() <em>Monitoring Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMonitoringTime()
	 * @generated
	 * @ordered
	 */
	protected long monitoringTime = MONITORING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrometheusMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROMETHEUS_METER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMonitoringPort() {
		return monitoringPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringPort(int newMonitoringPort) {
		int oldMonitoringPort = monitoringPort;
		monitoringPort = newMonitoringPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROMETHEUS_METER__MONITORING_PORT, oldMonitoringPort, monitoringPort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonitoringTime() {
		return monitoringTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringTime(long newMonitoringTime) {
		long oldMonitoringTime = monitoringTime;
		monitoringTime = newMonitoringTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROMETHEUS_METER__MONITORING_TIME, oldMonitoringTime, monitoringTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrometheusServerConfiguration() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_METER__MONITORING_PORT:
				return getMonitoringPort();
			case PasysPackage.PROMETHEUS_METER__MONITORING_TIME:
				return getMonitoringTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_METER__MONITORING_PORT:
				setMonitoringPort((Integer)newValue);
				return;
			case PasysPackage.PROMETHEUS_METER__MONITORING_TIME:
				setMonitoringTime((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_METER__MONITORING_PORT:
				setMonitoringPort(MONITORING_PORT_EDEFAULT);
				return;
			case PasysPackage.PROMETHEUS_METER__MONITORING_TIME:
				setMonitoringTime(MONITORING_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_METER__MONITORING_PORT:
				return monitoringPort != MONITORING_PORT_EDEFAULT;
			case PasysPackage.PROMETHEUS_METER__MONITORING_TIME:
				return monitoringTime != MONITORING_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION:
				return getPrometheusServerConfiguration();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (monitoringPort: ");
		result.append(monitoringPort);
		result.append(", monitoringTime: ");
		result.append(monitoringTime);
		result.append(')');
		return result.toString();
	}

} // PrometheusMeterImpl
