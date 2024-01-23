/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.KubernetesDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ServiceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.KubernetesDeploymentConfImpl#getExternalIP <em>External IP</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.KubernetesDeploymentConfImpl#getServiceType <em>Service Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KubernetesDeploymentConfImpl extends OrchestratorDeploymentConfImpl implements KubernetesDeploymentConf {
	/**
	 * The default value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected String externalIP = EXTERNAL_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceType SERVICE_TYPE_EDEFAULT = ServiceType.LOAD_BALANCER;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected ServiceType serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesDeploymentConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.KUBERNETES_DEPLOYMENT_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalIP() {
		return externalIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalIP(String newExternalIP) {
		String oldExternalIP = externalIP;
		externalIP = newExternalIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP, oldExternalIP, externalIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceType getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceType(ServiceType newServiceType) {
		ServiceType oldServiceType = serviceType;
		serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP:
				return getExternalIP();
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE:
				return getServiceType();
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
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP:
				setExternalIP((String)newValue);
				return;
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE:
				setServiceType((ServiceType)newValue);
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
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP:
				setExternalIP(EXTERNAL_IP_EDEFAULT);
				return;
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
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
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP:
				return EXTERNAL_IP_EDEFAULT == null ? externalIP != null : !EXTERNAL_IP_EDEFAULT.equals(externalIP);
			case PasysPackage.KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE:
				return serviceType != SERVICE_TYPE_EDEFAULT;
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
		result.append(" (externalIP: ");
		result.append(externalIP);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(')');
		return result.toString();
	}

} //KubernetesDeploymentConfImpl
