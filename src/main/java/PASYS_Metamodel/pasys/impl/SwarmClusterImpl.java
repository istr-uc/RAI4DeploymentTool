/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.DockerServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SwarmCluster;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swarm Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SwarmClusterImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SwarmClusterImpl#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwarmClusterImpl extends ResourceClusterImpl implements SwarmCluster {
	/**
	 * The cached value of the '{@link #getWorkers() <em>Workers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkers()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerServer> workers;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected DockerServer manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwarmClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SWARM_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerServer> getWorkers() {
		if (workers == null) {
			workers = new EObjectResolvingEList<DockerServer>(DockerServer.class, this, PasysPackage.SWARM_CLUSTER__WORKERS);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerServer getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (DockerServer)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SWARM_CLUSTER__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerServer basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(DockerServer newManager) {
		DockerServer oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SWARM_CLUSTER__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SWARM_CLUSTER__WORKERS:
				return getWorkers();
			case PasysPackage.SWARM_CLUSTER__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
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
			case PasysPackage.SWARM_CLUSTER__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends DockerServer>)newValue);
				return;
			case PasysPackage.SWARM_CLUSTER__MANAGER:
				setManager((DockerServer)newValue);
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
			case PasysPackage.SWARM_CLUSTER__WORKERS:
				getWorkers().clear();
				return;
			case PasysPackage.SWARM_CLUSTER__MANAGER:
				setManager((DockerServer)null);
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
			case PasysPackage.SWARM_CLUSTER__WORKERS:
				return workers != null && !workers.isEmpty();
			case PasysPackage.SWARM_CLUSTER__MANAGER:
				return manager != null;
		}
		return super.eIsSet(featureID);
	}

} //SwarmClusterImpl
