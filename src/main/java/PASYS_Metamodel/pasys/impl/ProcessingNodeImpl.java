/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.LaunchException;
import PASYS_Metamodel.pasys.Network;
import PASYS_Metamodel.pasys.NodeHostedMeter;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import deploymentTool.DeploymentToolsUtils;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Processing Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getConcurrencyLevel <em>Concurrency Level</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getPropertyConfigData <em>Property Config Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getLaunchingScripts <em>Launching Scripts</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getConfigFiles <em>Config Files</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getCodeFiles <em>Code Files</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ProcessingNodeImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessingNodeImpl extends PlatformResourceImpl implements ProcessingNode {
	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcurrencyLevel() <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConcurrencyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENCY_LEVEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getConcurrencyLevel() <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConcurrencyLevel()
	 * @generated
	 * @ordered
	 */
	protected int concurrencyLevel = CONCURRENCY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected int memorySize = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyConfigData() <em>Property
	 * Config Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPropertyConfigData()
	 * @generated
	 * @ordered
	 */
	protected static final Properties PROPERTY_CONFIG_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyConfigData() <em>Property
	 * Config Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPropertyConfigData()
	 * @generated
	 * @ordered
	 */
	protected Properties propertyConfigData = PROPERTY_CONFIG_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> connectedTo;

	/**
	 * The cached value of the '{@link #getLaunchingScripts() <em>Launching
	 * Scripts</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLaunchingScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentFileDescriptor> launchingScripts;

	/**
	 * The cached value of the '{@link #getConfigFiles() <em>Config Files</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConfigFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentFileDescriptor> configFiles;

	/**
	 * The cached value of the '{@link #getCodeFiles() <em>Code Files</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCodeFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactDescriptor> codeFiles;

	/**
	 * The cached value of the '{@link #getOwnedMeters() <em>Owned Meters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeHostedMeter> ownedMeters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROCESSING_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConcurrencyLevel() {
		return concurrencyLevel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcurrencyLevel(int newConcurrencyLevel) {
		int oldConcurrencyLevel = concurrencyLevel;
		concurrencyLevel = newConcurrencyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL, oldConcurrencyLevel, concurrencyLevel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Network> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList<Network>(Network.class, this, PasysPackage.PROCESSING_NODE__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeploymentFileDescriptor> getLaunchingScripts() {
		if (launchingScripts == null) {
			launchingScripts = new EObjectWithInverseResolvingEList<DeploymentFileDescriptor>(DeploymentFileDescriptor.class, this, PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS, PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER);
		}
		return launchingScripts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeploymentFileDescriptor> getConfigFiles() {
		if (configFiles == null) {
			configFiles = new EObjectResolvingEList<DeploymentFileDescriptor>(DeploymentFileDescriptor.class, this, PasysPackage.PROCESSING_NODE__CONFIG_FILES);
		}
		return configFiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties getPropertyConfigData() {
		return propertyConfigData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyConfigData(Properties newPropertyConfigData) {
		Properties oldPropertyConfigData = propertyConfigData;
		propertyConfigData = newPropertyConfigData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__PROPERTY_CONFIG_DATA, oldPropertyConfigData, propertyConfigData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeHostedMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<NodeHostedMeter>(NodeHostedMeter.class, this, PasysPackage.PROCESSING_NODE__OWNED_METERS, PasysPackage.NODE_HOSTED_METER__OWNER);
		}
		return ownedMeters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySize(int newMemorySize) {
		int oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__MEMORY_SIZE, oldMemorySize, memorySize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedFactor(double newSpeedFactor) {
		double oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE__SPEED_FACTOR, oldSpeedFactor, speedFactor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactDescriptor> getCodeFiles() {
		if (codeFiles == null) {
			codeFiles = new EObjectResolvingEList<ArtifactDescriptor>(ArtifactDescriptor.class, this, PasysPackage.PROCESSING_NODE__CODE_FILES);
		}
		return codeFiles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void prepareForDeployment() throws ConfigurationException {
		// Initialize properties
		propertyConfigData = new Properties();
		propertyConfigData.setProperty("hostID", getId());
		propertyConfigData.setProperty("IP", getIp());
		propertyConfigData.setProperty("speedFactor", Double.toString(getSpeedFactor()));

		// 0. Deploy the owned meters
		for (NodeHostedMeter meter : getOwnedMeters())
			meter.configureDeployment();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void deployAndLaunch() throws LaunchException, DeploymentException, ConfigurationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void bringBackConfiguration() {
		// Por el momento no hay que hacer nada.
		// Por asegurarnos podemos inicializar las estructuras.
		setPropertyConfigData(null);
		getLaunchingScripts().clear();
		getConfigFiles().clear();
		getCodeFiles().clear();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void bringBackDeployment() {

		System.out.println("BringBackDeployment in node " + getIp());

		for (NodeHostedMeter meter : getOwnedMeters()) {
			try {
				meter.configureDeployment();
			} catch (ConfigurationException e) {
			}
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void abortLaunching() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaunchingScripts()).basicAdd(otherEnd, msgs);
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMeters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				return ((InternalEList<?>)getLaunchingScripts()).basicRemove(otherEnd, msgs);
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__IP:
				return getIp();
			case PasysPackage.PROCESSING_NODE__OS:
				return getOs();
			case PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL:
				return getConcurrencyLevel();
			case PasysPackage.PROCESSING_NODE__MEMORY_SIZE:
				return getMemorySize();
			case PasysPackage.PROCESSING_NODE__SPEED_FACTOR:
				return getSpeedFactor();
			case PasysPackage.PROCESSING_NODE__PROPERTY_CONFIG_DATA:
				return getPropertyConfigData();
			case PasysPackage.PROCESSING_NODE__USER_NAME:
				return getUserName();
			case PasysPackage.PROCESSING_NODE__CONNECTED_TO:
				return getConnectedTo();
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				return getLaunchingScripts();
			case PasysPackage.PROCESSING_NODE__CONFIG_FILES:
				return getConfigFiles();
			case PasysPackage.PROCESSING_NODE__CODE_FILES:
				return getCodeFiles();
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				return getOwnedMeters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__IP:
				setIp((String)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__OS:
				setOs((String)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL:
				setConcurrencyLevel((Integer)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__MEMORY_SIZE:
				setMemorySize((Integer)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__SPEED_FACTOR:
				setSpeedFactor((Double)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__PROPERTY_CONFIG_DATA:
				setPropertyConfigData((Properties)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__USER_NAME:
				setUserName((String)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends Network>)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				getLaunchingScripts().clear();
				getLaunchingScripts().addAll((Collection<? extends DeploymentFileDescriptor>)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__CONFIG_FILES:
				getConfigFiles().clear();
				getConfigFiles().addAll((Collection<? extends DeploymentFileDescriptor>)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__CODE_FILES:
				getCodeFiles().clear();
				getCodeFiles().addAll((Collection<? extends ArtifactDescriptor>)newValue);
				return;
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends NodeHostedMeter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__IP:
				setIp(IP_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__OS:
				setOs(OS_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL:
				setConcurrencyLevel(CONCURRENCY_LEVEL_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__MEMORY_SIZE:
				setMemorySize(MEMORY_SIZE_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__SPEED_FACTOR:
				setSpeedFactor(SPEED_FACTOR_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__PROPERTY_CONFIG_DATA:
				setPropertyConfigData(PROPERTY_CONFIG_DATA_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case PasysPackage.PROCESSING_NODE__CONNECTED_TO:
				getConnectedTo().clear();
				return;
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				getLaunchingScripts().clear();
				return;
			case PasysPackage.PROCESSING_NODE__CONFIG_FILES:
				getConfigFiles().clear();
				return;
			case PasysPackage.PROCESSING_NODE__CODE_FILES:
				getCodeFiles().clear();
				return;
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				getOwnedMeters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case PasysPackage.PROCESSING_NODE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL:
				return concurrencyLevel != CONCURRENCY_LEVEL_EDEFAULT;
			case PasysPackage.PROCESSING_NODE__MEMORY_SIZE:
				return memorySize != MEMORY_SIZE_EDEFAULT;
			case PasysPackage.PROCESSING_NODE__SPEED_FACTOR:
				return speedFactor != SPEED_FACTOR_EDEFAULT;
			case PasysPackage.PROCESSING_NODE__PROPERTY_CONFIG_DATA:
				return PROPERTY_CONFIG_DATA_EDEFAULT == null ? propertyConfigData != null : !PROPERTY_CONFIG_DATA_EDEFAULT.equals(propertyConfigData);
			case PasysPackage.PROCESSING_NODE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case PasysPackage.PROCESSING_NODE__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
				return launchingScripts != null && !launchingScripts.isEmpty();
			case PasysPackage.PROCESSING_NODE__CONFIG_FILES:
				return configFiles != null && !configFiles.isEmpty();
			case PasysPackage.PROCESSING_NODE__CODE_FILES:
				return codeFiles != null && !codeFiles.isEmpty();
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT:
				try {
					prepareForDeployment();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PasysPackage.PROCESSING_NODE___DEPLOY_AND_LAUNCH:
				try {
					deployAndLaunch();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PasysPackage.PROCESSING_NODE___BRING_BACK_CONFIGURATION:
				bringBackConfiguration();
				return null;
			case PasysPackage.PROCESSING_NODE___BRING_BACK_DEPLOYMENT:
				bringBackDeployment();
				return null;
			case PasysPackage.PROCESSING_NODE___ABORT_LAUNCHING:
				abortLaunching();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ip: ");
		result.append(ip);
		result.append(", os: ");
		result.append(os);
		result.append(", concurrencyLevel: ");
		result.append(concurrencyLevel);
		result.append(", memorySize: ");
		result.append(memorySize);
		result.append(", speedFactor: ");
		result.append(speedFactor);
		result.append(", propertyConfigData: ");
		result.append(propertyConfigData);
		result.append(", userName: ");
		result.append(userName);
		result.append(')');
		return result.toString();
	}

	public void scpTransfer(EList<DeploymentFileDescriptor> fileDescriptors, String ip) throws DeploymentException {
		int exitValue = 0;
		System.out.println("Transfer files to node " + ip);
		for (DeploymentFileDescriptor fd : fileDescriptors) {
			String filePath = fd.createFileFromDescriptor(DeploymentToolsUtils.TEMP_DIR);
			String authFile = this.getOwner().getAuthenticationFiles().get(ip);

			String command = "scp";
			if (authFile != null) {
				command += " -i " + authFile;
			}

			command += " " + filePath + " " + getUserName() + "@" + ip + ":" + fd.getFilePath();
			// Para prueba
			System.out.println(command);

			/*Process process;
			try {

				process = Runtime.getRuntime().exec(command);
				exitValue = process.waitFor();
				// Send file
				if (exitValue != 0) {
					throw new DeploymentException("Error sending configuration file to node " + ip);
				}

			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				throw new DeploymentException("Error sending configuration file to node " + ip);
			}*/
		}
		System.out.println();
	}

	public void scpTransferArtifacts(EList<ArtifactDescriptor> fileDescriptors, String ip) throws DeploymentException {
		int exitValue = 0;
		System.out.println("Transfer artifacts to node " + ip);
		for (ArtifactDescriptor fd : fileDescriptors) {

			String authFile = this.getOwner().getAuthenticationFiles().get(ip);

			String command = "scp";
			if (authFile != null) {
				command += " -i " + authFile;
			}

			command += " " + fd.getLocalPath() + "/" + fd.getFileName() + " " + getUserName() + "@" + ip + ":"
					+ fd.getFilePath();
			// Para prueba
			System.out.println(command);

			/*Process process;
			try {

				process = Runtime.getRuntime().exec(command);
				exitValue = process.waitFor();
				// Send file
				if (exitValue != 0) {
					throw new DeploymentException("Error sending configuration file to node " + ip);
				}

			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				throw new DeploymentException("Error sending configuration file to node " + ip);
			}*/
		}
		System.out.println();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void remoteDelete(EList<DeploymentFileDescriptor> fileDescriptors, String ip) throws LaunchException {
		int exitValue = 0;
		for (DeploymentFileDescriptor fd : fileDescriptors) {

			String authFile = this.getOwner().getAuthenticationFiles().get(ip);

			String command = "ssh";
			if (authFile != null) {
				command += " -i" + authFile;
			}

			command += " " + getUserName() + "@" + this.getIp() + " " + "rm " + fd.getFilePath() + "/"
					+ fd.getFileName();
			System.out.println("SSH Command: " + command);

			/*Process process;
			try {
				process = Runtime.getRuntime().exec(command);

				exitValue = process.waitFor();

			} catch (IOException | InterruptedException e) {
				throw new LaunchException("Error deleting files in node " + id);
			}*/
		}
	}

} // ProcessingNodeImpl
