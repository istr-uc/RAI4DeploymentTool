/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeployableComponent;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.OrchestrationService;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformService;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#getDeploymentConfig <em>Deployment Config</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#getOrchestrator <em>Orchestrator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServiceImpl#isManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlatformServiceImpl extends PlatformResourceImpl implements PlatformService {
	/**
	 * The cached value of the '{@link #getDeploymentConfig() <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConfig()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConfiguration deploymentConfig;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected NodeCluster host;

	/**
	 * The cached value of the '{@link #getOrchestrator() <em>Orchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestrator()
	 * @generated
	 * @ordered
	 */
	protected OrchestrationService orchestrator;

	/**
	 * The default value of the '{@link #isManaged() <em>Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManaged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANAGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManaged() <em>Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManaged()
	 * @generated
	 * @ordered
	 */
	protected boolean managed = MANAGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PLATFORM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConfiguration getDeploymentConfig() {
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConfig(DeploymentConfiguration newDeploymentConfig, NotificationChain msgs) {
		DeploymentConfiguration oldDeploymentConfig = deploymentConfig;
		deploymentConfig = newDeploymentConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, oldDeploymentConfig, newDeploymentConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentConfig(DeploymentConfiguration newDeploymentConfig) {
		if (newDeploymentConfig != deploymentConfig) {
			NotificationChain msgs = null;
			if (deploymentConfig != null)
				msgs = ((InternalEObject)deploymentConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, null, msgs);
			if (newDeploymentConfig != null)
				msgs = ((InternalEObject)newDeploymentConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, null, msgs);
			msgs = basicSetDeploymentConfig(newDeploymentConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG, newDeploymentConfig, newDeploymentConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (NodeCluster)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PLATFORM_SERVICE__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCluster basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(NodeCluster newHost) {
		NodeCluster oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrchestrationService getOrchestrator() {
		if (orchestrator != null && orchestrator.eIsProxy()) {
			InternalEObject oldOrchestrator = (InternalEObject)orchestrator;
			orchestrator = (OrchestrationService)eResolveProxy(oldOrchestrator);
			if (orchestrator != oldOrchestrator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR, oldOrchestrator, orchestrator));
			}
		}
		return orchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationService basicGetOrchestrator() {
		return orchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrchestrator(OrchestrationService newOrchestrator, NotificationChain msgs) {
		OrchestrationService oldOrchestrator = orchestrator;
		orchestrator = newOrchestrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR, oldOrchestrator, newOrchestrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrchestrator(OrchestrationService newOrchestrator) {
		if (newOrchestrator != orchestrator) {
			NotificationChain msgs = null;
			if (orchestrator != null)
				msgs = ((InternalEObject)orchestrator).eInverseRemove(this, PasysPackage.ORCHESTRATION_SERVICE__SERVICES, OrchestrationService.class, msgs);
			if (newOrchestrator != null)
				msgs = ((InternalEObject)newOrchestrator).eInverseAdd(this, PasysPackage.ORCHESTRATION_SERVICE__SERVICES, OrchestrationService.class, msgs);
			msgs = basicSetOrchestrator(newOrchestrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR, newOrchestrator, newOrchestrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManaged() {
		return managed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManaged(boolean newManaged) {
		boolean oldManaged = managed;
		managed = newManaged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVICE__MANAGED, oldManaged, managed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				return basicSetDeploymentConfig(null, msgs);
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				return basicSetOrchestrator(null, msgs);
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
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				return getDeploymentConfig();
			case PasysPackage.PLATFORM_SERVICE__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				if (resolve) return getOrchestrator();
				return basicGetOrchestrator();
			case PasysPackage.PLATFORM_SERVICE__MANAGED:
				return isManaged();
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
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)newValue);
				return;
			case PasysPackage.PLATFORM_SERVICE__HOST:
				setHost((NodeCluster)newValue);
				return;
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				setOrchestrator((OrchestrationService)newValue);
				return;
			case PasysPackage.PLATFORM_SERVICE__MANAGED:
				setManaged((Boolean)newValue);
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
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)null);
				return;
			case PasysPackage.PLATFORM_SERVICE__HOST:
				setHost((NodeCluster)null);
				return;
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				setOrchestrator((OrchestrationService)null);
				return;
			case PasysPackage.PLATFORM_SERVICE__MANAGED:
				setManaged(MANAGED_EDEFAULT);
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
			case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG:
				return deploymentConfig != null;
			case PasysPackage.PLATFORM_SERVICE__HOST:
				return host != null;
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				return orchestrator != null;
			case PasysPackage.PLATFORM_SERVICE__MANAGED:
				return managed != MANAGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG: return PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG: return PasysPackage.PLATFORM_SERVICE__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT: return PasysPackage.PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (managed: ");
		result.append(managed);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override 
	public void configureDeployment() throws ConfigurationException {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PLATFORM_SERVICE__ORCHESTRATOR:
				if (orchestrator != null)
					msgs = ((InternalEObject)orchestrator).eInverseRemove(this, PasysPackage.ORCHESTRATION_SERVICE__SERVICES, OrchestrationService.class, msgs);
				return basicSetOrchestrator((OrchestrationService)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
} //PlatformServiceImpl
