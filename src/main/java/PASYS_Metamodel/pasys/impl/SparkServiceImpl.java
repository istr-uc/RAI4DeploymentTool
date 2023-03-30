/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.SchedulableSet;
import PASYS_Metamodel.pasys.SparkService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spark Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getDriverCores <em>Driver Cores</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getDriverMaxResultSize <em>Driver Max Result Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getDriverMemory <em>Driver Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getExecutorMemory <em>Executor Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getExtraListener <em>Extra Listener</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#isLogConf <em>Log Conf</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getSubmitDeployMode <em>Submit Deploy Mode</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#getLogCallerContext <em>Log Caller Context</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SparkServiceImpl#isDriverSuperviser <em>Driver Superviser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkServiceImpl extends SchedulingServiceImpl implements SparkService {
	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected SchedulableSet load;

	/**
	 * The default value of the '{@link #getDriverCores() <em>Driver Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverCores()
	 * @generated
	 * @ordered
	 */
	protected static final int DRIVER_CORES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDriverCores() <em>Driver Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverCores()
	 * @generated
	 * @ordered
	 */
	protected int driverCores = DRIVER_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverMaxResultSize() <em>Driver Max Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverMaxResultSize()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_MAX_RESULT_SIZE_EDEFAULT = "1g";

	/**
	 * The cached value of the '{@link #getDriverMaxResultSize() <em>Driver Max Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverMaxResultSize()
	 * @generated
	 * @ordered
	 */
	protected String driverMaxResultSize = DRIVER_MAX_RESULT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverMemory() <em>Driver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverMemory()
	 * @generated
	 * @ordered
	 */
	protected static final long DRIVER_MEMORY_EDEFAULT = 1000000000L;

	/**
	 * The cached value of the '{@link #getDriverMemory() <em>Driver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverMemory()
	 * @generated
	 * @ordered
	 */
	protected long driverMemory = DRIVER_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalDir() <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDir()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DIR_EDEFAULT = "/home/apache/spark/localDir";

	/**
	 * The cached value of the '{@link #getLocalDir() <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDir()
	 * @generated
	 * @ordered
	 */
	protected String localDir = LOCAL_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceCluster master;

	/**
	 * The default value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final int WINDOW_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWindowSize() <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowSize()
	 * @generated
	 * @ordered
	 */
	protected int windowSize = WINDOW_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutorMemory() <em>Executor Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorMemory()
	 * @generated
	 * @ordered
	 */
	protected static final long EXECUTOR_MEMORY_EDEFAULT = 1000000000L;

	/**
	 * The cached value of the '{@link #getExecutorMemory() <em>Executor Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorMemory()
	 * @generated
	 * @ordered
	 */
	protected long executorMemory = EXECUTOR_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraListener() <em>Extra Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraListener()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_LISTENER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraListener() <em>Extra Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraListener()
	 * @generated
	 * @ordered
	 */
	protected String extraListener = EXTRA_LISTENER_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogConf() <em>Log Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogConf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_CONF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogConf() <em>Log Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogConf()
	 * @generated
	 * @ordered
	 */
	protected boolean logConf = LOG_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitDeployMode() <em>Submit Deploy Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitDeployMode()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMIT_DEPLOY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitDeployMode() <em>Submit Deploy Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitDeployMode()
	 * @generated
	 * @ordered
	 */
	protected String submitDeployMode = SUBMIT_DEPLOY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogCallerContext() <em>Log Caller Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogCallerContext()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_CALLER_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogCallerContext() <em>Log Caller Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogCallerContext()
	 * @generated
	 * @ordered
	 */
	protected String logCallerContext = LOG_CALLER_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDriverSuperviser() <em>Driver Superviser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDriverSuperviser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRIVER_SUPERVISER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDriverSuperviser() <em>Driver Superviser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDriverSuperviser()
	 * @generated
	 * @ordered
	 */
	protected boolean driverSuperviser = DRIVER_SUPERVISER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SPARK_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulableSet getLoad() {
		if (load != null && load.eIsProxy()) {
			InternalEObject oldLoad = (InternalEObject)load;
			load = (SchedulableSet)eResolveProxy(oldLoad);
			if (load != oldLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SPARK_SERVICE__LOAD, oldLoad, load));
			}
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableSet basicGetLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoad(SchedulableSet newLoad) {
		SchedulableSet oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDriverCores() {
		return driverCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverCores(int newDriverCores) {
		int oldDriverCores = driverCores;
		driverCores = newDriverCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__DRIVER_CORES, oldDriverCores, driverCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriverMaxResultSize() {
		return driverMaxResultSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverMaxResultSize(String newDriverMaxResultSize) {
		String oldDriverMaxResultSize = driverMaxResultSize;
		driverMaxResultSize = newDriverMaxResultSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE, oldDriverMaxResultSize, driverMaxResultSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDriverMemory() {
		return driverMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverMemory(long newDriverMemory) {
		long oldDriverMemory = driverMemory;
		driverMemory = newDriverMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__DRIVER_MEMORY, oldDriverMemory, driverMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalDir() {
		return localDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDir(String newLocalDir) {
		String oldLocalDir = localDir;
		localDir = newLocalDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__LOCAL_DIR, oldLocalDir, localDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingResourceCluster getMaster() {
		if (master != null && master.eIsProxy()) {
			InternalEObject oldMaster = (InternalEObject)master;
			master = (ProcessingResourceCluster)eResolveProxy(oldMaster);
			if (master != oldMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SPARK_SERVICE__MASTER, oldMaster, master));
			}
		}
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceCluster basicGetMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaster(ProcessingResourceCluster newMaster) {
		ProcessingResourceCluster oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWindowSize() {
		return windowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindowSize(int newWindowSize) {
		int oldWindowSize = windowSize;
		windowSize = newWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__WINDOW_SIZE, oldWindowSize, windowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExecutorMemory() {
		return executorMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutorMemory(long newExecutorMemory) {
		long oldExecutorMemory = executorMemory;
		executorMemory = newExecutorMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY, oldExecutorMemory, executorMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtraListener() {
		return extraListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraListener(String newExtraListener) {
		String oldExtraListener = extraListener;
		extraListener = newExtraListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__EXTRA_LISTENER, oldExtraListener, extraListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLogConf() {
		return logConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogConf(boolean newLogConf) {
		boolean oldLogConf = logConf;
		logConf = newLogConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__LOG_CONF, oldLogConf, logConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmitDeployMode() {
		return submitDeployMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitDeployMode(String newSubmitDeployMode) {
		String oldSubmitDeployMode = submitDeployMode;
		submitDeployMode = newSubmitDeployMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE, oldSubmitDeployMode, submitDeployMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogCallerContext() {
		return logCallerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogCallerContext(String newLogCallerContext) {
		String oldLogCallerContext = logCallerContext;
		logCallerContext = newLogCallerContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT, oldLogCallerContext, logCallerContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDriverSuperviser() {
		return driverSuperviser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverSuperviser(boolean newDriverSuperviser) {
		boolean oldDriverSuperviser = driverSuperviser;
		driverSuperviser = newDriverSuperviser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER, oldDriverSuperviser, driverSuperviser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SPARK_SERVICE__LOAD:
				if (resolve) return getLoad();
				return basicGetLoad();
			case PasysPackage.SPARK_SERVICE__DRIVER_CORES:
				return getDriverCores();
			case PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE:
				return getDriverMaxResultSize();
			case PasysPackage.SPARK_SERVICE__DRIVER_MEMORY:
				return getDriverMemory();
			case PasysPackage.SPARK_SERVICE__LOCAL_DIR:
				return getLocalDir();
			case PasysPackage.SPARK_SERVICE__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case PasysPackage.SPARK_SERVICE__WINDOW_SIZE:
				return getWindowSize();
			case PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY:
				return getExecutorMemory();
			case PasysPackage.SPARK_SERVICE__EXTRA_LISTENER:
				return getExtraListener();
			case PasysPackage.SPARK_SERVICE__LOG_CONF:
				return isLogConf();
			case PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE:
				return getSubmitDeployMode();
			case PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT:
				return getLogCallerContext();
			case PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER:
				return isDriverSuperviser();
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
			case PasysPackage.SPARK_SERVICE__LOAD:
				setLoad((SchedulableSet)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_CORES:
				setDriverCores((Integer)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE:
				setDriverMaxResultSize((String)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_MEMORY:
				setDriverMemory((Long)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__LOCAL_DIR:
				setLocalDir((String)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__MASTER:
				setMaster((ProcessingResourceCluster)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__WINDOW_SIZE:
				setWindowSize((Integer)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY:
				setExecutorMemory((Long)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__EXTRA_LISTENER:
				setExtraListener((String)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__LOG_CONF:
				setLogConf((Boolean)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE:
				setSubmitDeployMode((String)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT:
				setLogCallerContext((String)newValue);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER:
				setDriverSuperviser((Boolean)newValue);
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
			case PasysPackage.SPARK_SERVICE__LOAD:
				setLoad((SchedulableSet)null);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_CORES:
				setDriverCores(DRIVER_CORES_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE:
				setDriverMaxResultSize(DRIVER_MAX_RESULT_SIZE_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_MEMORY:
				setDriverMemory(DRIVER_MEMORY_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__LOCAL_DIR:
				setLocalDir(LOCAL_DIR_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__MASTER:
				setMaster((ProcessingResourceCluster)null);
				return;
			case PasysPackage.SPARK_SERVICE__WINDOW_SIZE:
				setWindowSize(WINDOW_SIZE_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY:
				setExecutorMemory(EXECUTOR_MEMORY_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__EXTRA_LISTENER:
				setExtraListener(EXTRA_LISTENER_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__LOG_CONF:
				setLogConf(LOG_CONF_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE:
				setSubmitDeployMode(SUBMIT_DEPLOY_MODE_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT:
				setLogCallerContext(LOG_CALLER_CONTEXT_EDEFAULT);
				return;
			case PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER:
				setDriverSuperviser(DRIVER_SUPERVISER_EDEFAULT);
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
			case PasysPackage.SPARK_SERVICE__LOAD:
				return load != null;
			case PasysPackage.SPARK_SERVICE__DRIVER_CORES:
				return driverCores != DRIVER_CORES_EDEFAULT;
			case PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE:
				return DRIVER_MAX_RESULT_SIZE_EDEFAULT == null ? driverMaxResultSize != null : !DRIVER_MAX_RESULT_SIZE_EDEFAULT.equals(driverMaxResultSize);
			case PasysPackage.SPARK_SERVICE__DRIVER_MEMORY:
				return driverMemory != DRIVER_MEMORY_EDEFAULT;
			case PasysPackage.SPARK_SERVICE__LOCAL_DIR:
				return LOCAL_DIR_EDEFAULT == null ? localDir != null : !LOCAL_DIR_EDEFAULT.equals(localDir);
			case PasysPackage.SPARK_SERVICE__MASTER:
				return master != null;
			case PasysPackage.SPARK_SERVICE__WINDOW_SIZE:
				return windowSize != WINDOW_SIZE_EDEFAULT;
			case PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY:
				return executorMemory != EXECUTOR_MEMORY_EDEFAULT;
			case PasysPackage.SPARK_SERVICE__EXTRA_LISTENER:
				return EXTRA_LISTENER_EDEFAULT == null ? extraListener != null : !EXTRA_LISTENER_EDEFAULT.equals(extraListener);
			case PasysPackage.SPARK_SERVICE__LOG_CONF:
				return logConf != LOG_CONF_EDEFAULT;
			case PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE:
				return SUBMIT_DEPLOY_MODE_EDEFAULT == null ? submitDeployMode != null : !SUBMIT_DEPLOY_MODE_EDEFAULT.equals(submitDeployMode);
			case PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT:
				return LOG_CALLER_CONTEXT_EDEFAULT == null ? logCallerContext != null : !LOG_CALLER_CONTEXT_EDEFAULT.equals(logCallerContext);
			case PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER:
				return driverSuperviser != DRIVER_SUPERVISER_EDEFAULT;
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
		result.append(" (driverCores: ");
		result.append(driverCores);
		result.append(", driverMaxResultSize: ");
		result.append(driverMaxResultSize);
		result.append(", driverMemory: ");
		result.append(driverMemory);
		result.append(", localDir: ");
		result.append(localDir);
		result.append(", windowSize: ");
		result.append(windowSize);
		result.append(", executorMemory: ");
		result.append(executorMemory);
		result.append(", extraListener: ");
		result.append(extraListener);
		result.append(", logConf: ");
		result.append(logConf);
		result.append(", submitDeployMode: ");
		result.append(submitDeployMode);
		result.append(", logCallerContext: ");
		result.append(logCallerContext);
		result.append(", driverSuperviser: ");
		result.append(driverSuperviser);
		result.append(')');
		return result.toString();
	}

} //SparkServiceImpl
