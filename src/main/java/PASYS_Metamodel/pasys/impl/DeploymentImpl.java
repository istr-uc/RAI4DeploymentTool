/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.Deployment;
import PASYS_Metamodel.pasys.PasysPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> placement;

	/**
	 * The cached value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, String> restartPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getPlacement() {
		if (placement != null && ((EObject)placement).eIsProxy()) {
			InternalEObject oldPlacement = (InternalEObject)placement;
			placement = (Map.Entry<String, String>)eResolveProxy(oldPlacement);
			if (placement != oldPlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.DEPLOYMENT__PLACEMENT, oldPlacement, placement));
			}
		}
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(Map.Entry<String, String> newPlacement) {
		Map.Entry<String, String> oldPlacement = placement;
		placement = newPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT__PLACEMENT, oldPlacement, placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<String, String> getRestartPolicy() {
		if (restartPolicy != null && ((EObject)restartPolicy).eIsProxy()) {
			InternalEObject oldRestartPolicy = (InternalEObject)restartPolicy;
			restartPolicy = (Map.Entry<String, String>)eResolveProxy(oldRestartPolicy);
			if (restartPolicy != oldRestartPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.DEPLOYMENT__RESTART_POLICY, oldRestartPolicy, restartPolicy));
			}
		}
		return restartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> basicGetRestartPolicy() {
		return restartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPolicy(Map.Entry<String, String> newRestartPolicy) {
		Map.Entry<String, String> oldRestartPolicy = restartPolicy;
		restartPolicy = newRestartPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT__RESTART_POLICY, oldRestartPolicy, restartPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.DEPLOYMENT__REPLICAS:
				return getReplicas();
			case PasysPackage.DEPLOYMENT__PLACEMENT:
				if (resolve) return getPlacement();
				return basicGetPlacement();
			case PasysPackage.DEPLOYMENT__RESTART_POLICY:
				if (resolve) return getRestartPolicy();
				return basicGetRestartPolicy();
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
			case PasysPackage.DEPLOYMENT__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case PasysPackage.DEPLOYMENT__PLACEMENT:
				setPlacement((Map.Entry<String, String>)newValue);
				return;
			case PasysPackage.DEPLOYMENT__RESTART_POLICY:
				setRestartPolicy((Map.Entry<String, String>)newValue);
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
			case PasysPackage.DEPLOYMENT__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case PasysPackage.DEPLOYMENT__PLACEMENT:
				setPlacement((Map.Entry<String, String>)null);
				return;
			case PasysPackage.DEPLOYMENT__RESTART_POLICY:
				setRestartPolicy((Map.Entry<String, String>)null);
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
			case PasysPackage.DEPLOYMENT__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
			case PasysPackage.DEPLOYMENT__PLACEMENT:
				return placement != null;
			case PasysPackage.DEPLOYMENT__RESTART_POLICY:
				return restartPolicy != null;
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
		result.append(" (replicas: ");
		result.append(replicas);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
