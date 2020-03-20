/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.DockerServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Stack;
import PASYS_Metamodel.pasys.SwarmCluster;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DockerServerImpl#getStacks <em>Stacks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DockerServerImpl#getSwarmCluster <em>Swarm Cluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerServerImpl extends ContainerizationServerImpl implements DockerServer {
	/**
	 * The cached value of the '{@link #getStacks() <em>Stacks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Stack> stacks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.DOCKER_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stack> getStacks() {
		if (stacks == null) {
			stacks = new EObjectContainmentEList<Stack>(Stack.class, this, PasysPackage.DOCKER_SERVER__STACKS);
		}
		return stacks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.DOCKER_SERVER__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DOCKER_SERVER__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				return ((InternalEList<?>)getStacks()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.DOCKER_SERVER__STACKS:
				return getStacks();
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				if (resolve) return getSwarmCluster();
				return basicGetSwarmCluster();
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
			case PasysPackage.DOCKER_SERVER__STACKS:
				getStacks().clear();
				getStacks().addAll((Collection<? extends Stack>)newValue);
				return;
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)newValue);
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
			case PasysPackage.DOCKER_SERVER__STACKS:
				getStacks().clear();
				return;
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)null);
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
			case PasysPackage.DOCKER_SERVER__STACKS:
				return stacks != null && !stacks.isEmpty();
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				return swarmCluster != null;
		}
		return super.eIsSet(featureID);
	}

} //DockerServerImpl
