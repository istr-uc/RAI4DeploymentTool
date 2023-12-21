/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.KubernetesCluster;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.KubernetesClusterImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.KubernetesClusterImpl#getKubeConfigPath <em>Kube Config Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KubernetesClusterImpl extends OrchestrationClusterImpl implements KubernetesCluster {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKubeConfigPath() <em>Kube Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubeConfigPath()
	 * @generated
	 * @ordered
	 */
	protected static final String KUBE_CONFIG_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKubeConfigPath() <em>Kube Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubeConfigPath()
	 * @generated
	 * @ordered
	 */
	protected String kubeConfigPath = KUBE_CONFIG_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.KUBERNETES_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		String oldApiVersion = apiVersion;
		apiVersion = newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KUBERNETES_CLUSTER__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKubeConfigPath() {
		return kubeConfigPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKubeConfigPath(String newKubeConfigPath) {
		String oldKubeConfigPath = kubeConfigPath;
		kubeConfigPath = newKubeConfigPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KUBERNETES_CLUSTER__KUBE_CONFIG_PATH, oldKubeConfigPath, kubeConfigPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.KUBERNETES_CLUSTER__API_VERSION:
				return getApiVersion();
			case PasysPackage.KUBERNETES_CLUSTER__KUBE_CONFIG_PATH:
				return getKubeConfigPath();
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
			case PasysPackage.KUBERNETES_CLUSTER__API_VERSION:
				setApiVersion((String)newValue);
				return;
			case PasysPackage.KUBERNETES_CLUSTER__KUBE_CONFIG_PATH:
				setKubeConfigPath((String)newValue);
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
			case PasysPackage.KUBERNETES_CLUSTER__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case PasysPackage.KUBERNETES_CLUSTER__KUBE_CONFIG_PATH:
				setKubeConfigPath(KUBE_CONFIG_PATH_EDEFAULT);
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
			case PasysPackage.KUBERNETES_CLUSTER__API_VERSION:
				return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
			case PasysPackage.KUBERNETES_CLUSTER__KUBE_CONFIG_PATH:
				return KUBE_CONFIG_PATH_EDEFAULT == null ? kubeConfigPath != null : !KUBE_CONFIG_PATH_EDEFAULT.equals(kubeConfigPath);
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", kubeConfigPath: ");
		result.append(kubeConfigPath);
		result.append(')');
		return result.toString();
	}

} //KubernetesClusterImpl
