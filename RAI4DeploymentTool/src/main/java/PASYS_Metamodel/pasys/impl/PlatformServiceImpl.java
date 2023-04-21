/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeployableComponent;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformService;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Platform Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#getDeploymentConfig
 * <em>Deployment Config</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#getHost
 * <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlatformServiceImpl extends PlatformResourceImpl implements PlatformService {
	/**
	 * The cached value of the '{@link #getDeploymentConfig() <em>Deployment
	 * Config</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDeploymentConfig()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConfiguration deploymentConfig;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceCluster host;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PlatformServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PLATFORM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DeploymentConfiguration getDeploymentConfig() {
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConfig(DeploymentConfiguration newDeploymentConfig,
			NotificationChain msgs) {
		DeploymentConfiguration oldDeploymentConfig = deploymentConfig;
		deploymentConfig = newDeploymentConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, oldDeploymentConfig, newDeploymentConfig);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDeploymentConfig(DeploymentConfiguration newDeploymentConfig) {
		if (newDeploymentConfig != deploymentConfig) {
			NotificationChain msgs = null;
			if (deploymentConfig != null)
				msgs = ((InternalEObject) deploymentConfig).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, null, msgs);
			if (newDeploymentConfig != null)
				msgs = ((InternalEObject) newDeploymentConfig).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, null, msgs);
			msgs = basicSetDeploymentConfig(newDeploymentConfig, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG,
					newDeploymentConfig, newDeploymentConfig));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ProcessingResourceCluster getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject) host;
			host = (ProcessingResourceCluster) eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PLATFORM_SERVICE__HOST,
							oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProcessingResourceCluster basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHost(ProcessingResourceCluster newHost) {
		ProcessingResourceCluster oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
			return basicSetDeploymentConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
			return getDeploymentConfig();
		case PasysPackage.PLATFORM_SERVICE__HOST:
			if (resolve)
				return getHost();
			return basicGetHost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
			setDeploymentConfig((DeploymentConfiguration) newValue);
			return;
		case PasysPackage.PLATFORM_SERVICE__HOST:
			setHost((ProcessingResourceCluster) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
			setDeploymentConfig((DeploymentConfiguration) null);
			return;
		case PasysPackage.PLATFORM_SERVICE__HOST:
			setHost((ProcessingResourceCluster) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
			return deploymentConfig != null;
		case PasysPackage.PLATFORM_SERVICE__HOST:
			return host != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (derivedFeatureID) {
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				return PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseFeatureID) {
			case PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG:
				return PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseOperationID) {
			case PasysPackage.DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT:
				return PasysPackage.PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PasysPackage.PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT:
			try {
				configureDeployment();
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void configureDeployment() throws ConfigurationException {
		if (getHost() instanceof ProcessingNodeCluster)
			configureDeploymentOnNode();
		else
			configureDeploymentOnOrchestrator();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract void configureDeploymentOnOrchestrator() throws ConfigurationException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract void configureDeploymentOnNode() throws ConfigurationException;

} // PlatformServiceImpl
