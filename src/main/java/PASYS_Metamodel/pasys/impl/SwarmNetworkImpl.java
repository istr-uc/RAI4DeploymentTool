/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NetworkDriver;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SwarmNetwork;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swarm Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SwarmNetworkImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SwarmNetworkImpl#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwarmNetworkImpl extends NamedElementImpl implements SwarmNetwork {
	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> subnets;

	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkDriver DRIVER_EDEFAULT = NetworkDriver.BRIDGE;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected NetworkDriver driver = DRIVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwarmNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SWARM_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getSubnets() {
		if (subnets != null && ((EObject)subnets).eIsProxy()) {
			InternalEObject oldSubnets = (InternalEObject)subnets;
			subnets = (Map.Entry<String, String>)eResolveProxy(oldSubnets);
			if (subnets != oldSubnets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SWARM_NETWORK__SUBNETS, oldSubnets, subnets));
			}
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetSubnets() {
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnets(Map.Entry<String, String> newSubnets) {
		Map.Entry<String, String> oldSubnets = subnets;
		subnets = newSubnets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SWARM_NETWORK__SUBNETS, oldSubnets, subnets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDriver getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(NetworkDriver newDriver) {
		NetworkDriver oldDriver = driver;
		driver = newDriver == null ? DRIVER_EDEFAULT : newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SWARM_NETWORK__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SWARM_NETWORK__SUBNETS:
				if (resolve) return getSubnets();
				return basicGetSubnets();
			case PasysPackage.SWARM_NETWORK__DRIVER:
				return getDriver();
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
			case PasysPackage.SWARM_NETWORK__SUBNETS:
				setSubnets((Map.Entry<String, String>)newValue);
				return;
			case PasysPackage.SWARM_NETWORK__DRIVER:
				setDriver((NetworkDriver)newValue);
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
			case PasysPackage.SWARM_NETWORK__SUBNETS:
				setSubnets((Map.Entry<String, String>)null);
				return;
			case PasysPackage.SWARM_NETWORK__DRIVER:
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
			case PasysPackage.SWARM_NETWORK__SUBNETS:
				return subnets != null;
			case PasysPackage.SWARM_NETWORK__DRIVER:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (driver: ");
		result.append(driver);
		result.append(')');
		return result.toString();
	}

} //SwarmNetworkImpl
