/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NomadDeploymentConf;
import PASYS_Metamodel.pasys.NomadDriver;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nomad Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NomadDeploymentConfImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NomadDeploymentConfImpl#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NomadDeploymentConfImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NomadDeploymentConfImpl#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NomadDeploymentConfImpl extends OrchestratorDeploymentConfImpl implements NomadDeploymentConf {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataCenter() <em>Data Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCenter()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataCenter() <em>Data Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCenter()
	 * @generated
	 * @ordered
	 */
	protected String dataCenter = DATA_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final NomadDriver DRIVER_EDEFAULT = NomadDriver.JAVA;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected NomadDriver driver = DRIVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NomadDeploymentConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NOMAD_DEPLOYMENT_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NOMAD_DEPLOYMENT_CONF__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataCenter() {
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCenter(String newDataCenter) {
		String oldDataCenter = dataCenter;
		dataCenter = newDataCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NOMAD_DEPLOYMENT_CONF__DATA_CENTER, oldDataCenter, dataCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NOMAD_DEPLOYMENT_CONF__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NomadDriver getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver(NomadDriver newDriver) {
		NomadDriver oldDriver = driver;
		driver = newDriver == null ? DRIVER_EDEFAULT : newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NOMAD_DEPLOYMENT_CONF__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__REGION:
				return getRegion();
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DATA_CENTER:
				return getDataCenter();
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__PRIORITY:
				return getPriority();
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DRIVER:
				return getDriver();
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
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__REGION:
				setRegion((String)newValue);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DATA_CENTER:
				setDataCenter((String)newValue);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DRIVER:
				setDriver((NomadDriver)newValue);
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
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DATA_CENTER:
				setDataCenter(DATA_CENTER_EDEFAULT);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DRIVER:
				setDriver(DRIVER_EDEFAULT);
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
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DATA_CENTER:
				return DATA_CENTER_EDEFAULT == null ? dataCenter != null : !DATA_CENTER_EDEFAULT.equals(dataCenter);
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PasysPackage.NOMAD_DEPLOYMENT_CONF__DRIVER:
				return driver != DRIVER_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (region: ");
		result.append(region);
		result.append(", dataCenter: ");
		result.append(dataCenter);
		result.append(", priority: ");
		result.append(priority);
		result.append(", driver: ");
		result.append(driver);
		result.append(')');
		return result.toString();
	}

} //NomadDeploymentConfImpl
