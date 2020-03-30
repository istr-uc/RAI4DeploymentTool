/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ServiceNetwork;
import PASYS_Metamodel.pasys.SwarmNetwork;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceNetworkImpl#getIpv4Address <em>Ipv4 Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceNetworkImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceNetworkImpl#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceNetworkImpl extends MinimalEObjectImpl.Container implements ServiceNetwork {
	/**
	 * The default value of the '{@link #getIpv4Address() <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpv4Address() <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected String ipv4Address = IPV4_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliases;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected SwarmNetwork network;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SERVICE_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpv4Address() {
		return ipv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpv4Address(String newIpv4Address) {
		String oldIpv4Address = ipv4Address;
		ipv4Address = newIpv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE_NETWORK__IPV4_ADDRESS, oldIpv4Address, ipv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAliases() {
		if (aliases == null) {
			aliases = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.SERVICE_NETWORK__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmNetwork getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (SwarmNetwork)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SERVICE_NETWORK__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmNetwork basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(SwarmNetwork newNetwork) {
		SwarmNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE_NETWORK__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SERVICE_NETWORK__IPV4_ADDRESS:
				return getIpv4Address();
			case PasysPackage.SERVICE_NETWORK__ALIASES:
				return getAliases();
			case PasysPackage.SERVICE_NETWORK__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
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
			case PasysPackage.SERVICE_NETWORK__IPV4_ADDRESS:
				setIpv4Address((String)newValue);
				return;
			case PasysPackage.SERVICE_NETWORK__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.SERVICE_NETWORK__NETWORK:
				setNetwork((SwarmNetwork)newValue);
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
			case PasysPackage.SERVICE_NETWORK__IPV4_ADDRESS:
				setIpv4Address(IPV4_ADDRESS_EDEFAULT);
				return;
			case PasysPackage.SERVICE_NETWORK__ALIASES:
				getAliases().clear();
				return;
			case PasysPackage.SERVICE_NETWORK__NETWORK:
				setNetwork((SwarmNetwork)null);
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
			case PasysPackage.SERVICE_NETWORK__IPV4_ADDRESS:
				return IPV4_ADDRESS_EDEFAULT == null ? ipv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(ipv4Address);
			case PasysPackage.SERVICE_NETWORK__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case PasysPackage.SERVICE_NETWORK__NETWORK:
				return network != null;
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
		result.append(" (ipv4Address: ");
		result.append(ipv4Address);
		result.append(", aliases: ");
		result.append(aliases);
		result.append(')');
		return result.toString();
	}

} //ServiceNetworkImpl
