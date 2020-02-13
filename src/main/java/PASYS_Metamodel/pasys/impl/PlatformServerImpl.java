/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformServer;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SystemComponent;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PlatformServerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformServerImpl extends PlatformResourceImpl implements PlatformServer {
	/**
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected String artifactLocator = ARTIFACT_LOCATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arguments;

	/**
	 * The default value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptFolderPath = SCRIPT_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String configFolderPath = CONFIG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String dataFolderPath = DATA_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String logFolderPath = LOG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUNNING_EDEFAULT = false; // TODO The default value literal "" is not valid.

	/**
	 * The cached value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean isRunning = IS_RUNNING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNode host;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ResourceCluster target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PLATFORM_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactLocator() {
		return artifactLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactLocator(String newArtifactLocator) {
		String oldArtifactLocator = artifactLocator;
		artifactLocator = newArtifactLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR, oldArtifactLocator, artifactLocator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArguments() {
		if (arguments == null) {
			arguments = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.PLATFORM_SERVER__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptFolderPath() {
		return scriptFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptFolderPath(String newScriptFolderPath) {
		String oldScriptFolderPath = scriptFolderPath;
		scriptFolderPath = newScriptFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH, oldScriptFolderPath, scriptFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigFolderPath() {
		return configFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigFolderPath(String newConfigFolderPath) {
		String oldConfigFolderPath = configFolderPath;
		configFolderPath = newConfigFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH, oldConfigFolderPath, configFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFolderPath() {
		return dataFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFolderPath(String newDataFolderPath) {
		String oldDataFolderPath = dataFolderPath;
		dataFolderPath = newDataFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH, oldDataFolderPath, dataFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFolderPath() {
		return logFolderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFolderPath(String newLogFolderPath) {
		String oldLogFolderPath = logFolderPath;
		logFolderPath = newLogFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH, oldLogFolderPath, logFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRunning() {
		return isRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRunning(boolean newIsRunning) {
		boolean oldIsRunning = isRunning;
		isRunning = newIsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__IS_RUNNING, oldIsRunning, isRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (ProcessingNode)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PLATFORM_SERVER__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNode basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(ProcessingNode newHost) {
		ProcessingNode oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ResourceCluster)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PLATFORM_SERVER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCluster basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ResourceCluster newTarget) {
		ResourceCluster oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PLATFORM_SERVER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deploy() throws ConfigurationException {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME:
				return getArtifactName();
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR:
				return getArtifactLocator();
			case PasysPackage.PLATFORM_SERVER__ARGUMENTS:
				return getArguments();
			case PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH:
				return getScriptFolderPath();
			case PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH:
				return getConfigFolderPath();
			case PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH:
				return getDataFolderPath();
			case PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH:
				return getLogFolderPath();
			case PasysPackage.PLATFORM_SERVER__IS_RUNNING:
				return isIsRunning();
			case PasysPackage.PLATFORM_SERVER__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case PasysPackage.PLATFORM_SERVER__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR:
				setArtifactLocator((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH:
				setScriptFolderPath((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH:
				setConfigFolderPath((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH:
				setDataFolderPath((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH:
				setLogFolderPath((String)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__IS_RUNNING:
				setIsRunning((Boolean)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__HOST:
				setHost((ProcessingNode)newValue);
				return;
			case PasysPackage.PLATFORM_SERVER__TARGET:
				setTarget((ResourceCluster)newValue);
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
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR:
				setArtifactLocator(ARTIFACT_LOCATOR_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__ARGUMENTS:
				getArguments().clear();
				return;
			case PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH:
				setScriptFolderPath(SCRIPT_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH:
				setConfigFolderPath(CONFIG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH:
				setDataFolderPath(DATA_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH:
				setLogFolderPath(LOG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__IS_RUNNING:
				setIsRunning(IS_RUNNING_EDEFAULT);
				return;
			case PasysPackage.PLATFORM_SERVER__HOST:
				setHost((ProcessingNode)null);
				return;
			case PasysPackage.PLATFORM_SERVER__TARGET:
				setTarget((ResourceCluster)null);
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
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR:
				return ARTIFACT_LOCATOR_EDEFAULT == null ? artifactLocator != null : !ARTIFACT_LOCATOR_EDEFAULT.equals(artifactLocator);
			case PasysPackage.PLATFORM_SERVER__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH:
				return SCRIPT_FOLDER_PATH_EDEFAULT == null ? scriptFolderPath != null : !SCRIPT_FOLDER_PATH_EDEFAULT.equals(scriptFolderPath);
			case PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH:
				return CONFIG_FOLDER_PATH_EDEFAULT == null ? configFolderPath != null : !CONFIG_FOLDER_PATH_EDEFAULT.equals(configFolderPath);
			case PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH:
				return DATA_FOLDER_PATH_EDEFAULT == null ? dataFolderPath != null : !DATA_FOLDER_PATH_EDEFAULT.equals(dataFolderPath);
			case PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH:
				return LOG_FOLDER_PATH_EDEFAULT == null ? logFolderPath != null : !LOG_FOLDER_PATH_EDEFAULT.equals(logFolderPath);
			case PasysPackage.PLATFORM_SERVER__IS_RUNNING:
				return isRunning != IS_RUNNING_EDEFAULT;
			case PasysPackage.PLATFORM_SERVER__HOST:
				return host != null;
			case PasysPackage.PLATFORM_SERVER__TARGET:
				return target != null;
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
		if (baseClass == SystemComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME;
				case PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR;
				case PasysPackage.PLATFORM_SERVER__ARGUMENTS: return PasysPackage.SYSTEM_COMPONENT__ARGUMENTS;
				case PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;
				case PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;
				case PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH;
				case PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH;
				case PasysPackage.PLATFORM_SERVER__IS_RUNNING: return PasysPackage.SYSTEM_COMPONENT__IS_RUNNING;
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
		if (baseClass == SystemComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME: return PasysPackage.PLATFORM_SERVER__ARTIFACT_NAME;
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR: return PasysPackage.PLATFORM_SERVER__ARTIFACT_LOCATOR;
				case PasysPackage.SYSTEM_COMPONENT__ARGUMENTS: return PasysPackage.PLATFORM_SERVER__ARGUMENTS;
				case PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH: return PasysPackage.PLATFORM_SERVER__SCRIPT_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH: return PasysPackage.PLATFORM_SERVER__CONFIG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH: return PasysPackage.PLATFORM_SERVER__DATA_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH: return PasysPackage.PLATFORM_SERVER__LOG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__IS_RUNNING: return PasysPackage.PLATFORM_SERVER__IS_RUNNING;
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
		if (baseClass == SystemComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.SYSTEM_COMPONENT___DEPLOY: return PasysPackage.PLATFORM_SERVER___DEPLOY;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.PLATFORM_SERVER___DEPLOY:
				try {
					deploy();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifactName: ");
		result.append(artifactName);
		result.append(", artifactLocator: ");
		result.append(artifactLocator);
		result.append(", arguments: ");
		result.append(arguments);
		result.append(", scriptFolderPath: ");
		result.append(scriptFolderPath);
		result.append(", configFolderPath: ");
		result.append(configFolderPath);
		result.append(", dataFolderPath: ");
		result.append(dataFolderPath);
		result.append(", logFolderPath: ");
		result.append(logFolderPath);
		result.append(", isRunning: ");
		result.append(isRunning);
		result.append(')');
		return result.toString();
	}

} //PlatformServerImpl
