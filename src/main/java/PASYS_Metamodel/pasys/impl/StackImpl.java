/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Service;
import PASYS_Metamodel.pasys.Stack;
import PASYS_Metamodel.pasys.SwarmCluster;

import PASYS_Metamodel.pasys.SwarmNetwork;
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
 * An implementation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StackImpl#getServices <em>Services</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StackImpl#getSwarmCluster <em>Swarm Cluster</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StackImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StackImpl#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StackImpl extends NamedElementImpl implements Stack {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getSwarmCluster() <em>Swarm Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarmCluster()
	 * @generated
	 * @ordered
	 */
	protected SwarmCluster swarmCluster;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "3.7";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<SwarmNetwork> networks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, PasysPackage.STACK__SERVICES, PasysPackage.SERVICE__STACK);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmCluster getSwarmCluster() {
		if (swarmCluster != null && swarmCluster.eIsProxy()) {
			InternalEObject oldSwarmCluster = (InternalEObject)swarmCluster;
			swarmCluster = (SwarmCluster)eResolveProxy(oldSwarmCluster);
			if (swarmCluster != oldSwarmCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STACK__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
			}
		}
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmCluster basicGetSwarmCluster() {
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmCluster(SwarmCluster newSwarmCluster) {
		SwarmCluster oldSwarmCluster = swarmCluster;
		swarmCluster = newSwarmCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STACK__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STACK__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwarmNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<SwarmNetwork>(SwarmNetwork.class, this, PasysPackage.STACK__NETWORKS);
		}
		return networks;
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
			case PasysPackage.STACK__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
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
			case PasysPackage.STACK__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case PasysPackage.STACK__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.STACK__SERVICES:
				return getServices();
			case PasysPackage.STACK__SWARM_CLUSTER:
				if (resolve) return getSwarmCluster();
				return basicGetSwarmCluster();
			case PasysPackage.STACK__VERSION:
				return getVersion();
			case PasysPackage.STACK__NETWORKS:
				return getNetworks();
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
			case PasysPackage.STACK__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case PasysPackage.STACK__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)newValue);
				return;
			case PasysPackage.STACK__VERSION:
				setVersion((String)newValue);
				return;
			case PasysPackage.STACK__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends SwarmNetwork>)newValue);
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
			case PasysPackage.STACK__SERVICES:
				getServices().clear();
				return;
			case PasysPackage.STACK__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)null);
				return;
			case PasysPackage.STACK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PasysPackage.STACK__NETWORKS:
				getNetworks().clear();
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
			case PasysPackage.STACK__SERVICES:
				return services != null && !services.isEmpty();
			case PasysPackage.STACK__SWARM_CLUSTER:
				return swarmCluster != null;
			case PasysPackage.STACK__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PasysPackage.STACK__NETWORKS:
				return networks != null && !networks.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //StackImpl
