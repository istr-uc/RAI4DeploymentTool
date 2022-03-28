/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spark Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getLoad <em>Load</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getDriverCores <em>Driver Cores</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getDriverMaxResultSize <em>Driver Max Result Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getDriverMemory <em>Driver Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getMaster <em>Master</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getExecutorMemory <em>Executor Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getExtraListener <em>Extra Listener</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#isLogConf <em>Log Conf</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getSubmitDeployMode <em>Submit Deploy Mode</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#getLogCallerContext <em>Log Caller Context</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkService#isDriverSuperviser <em>Driver Superviser</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService()
 * @model
 * @generated
 */
public interface SparkService extends SchedulingService {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' reference.
	 * @see #setLoad(SchedulableSet)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_Load()
	 * @model required="true"
	 * @generated
	 */
	SchedulableSet getLoad();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getLoad <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' reference.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(SchedulableSet value);

	/**
	 * Returns the value of the '<em><b>Driver Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Cores</em>' attribute.
	 * @see #setDriverCores(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_DriverCores()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDriverCores();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getDriverCores <em>Driver Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Cores</em>' attribute.
	 * @see #getDriverCores()
	 * @generated
	 */
	void setDriverCores(int value);

	/**
	 * Returns the value of the '<em><b>Driver Max Result Size</b></em>' attribute.
	 * The default value is <code>"1g"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Max Result Size</em>' attribute.
	 * @see #setDriverMaxResultSize(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_DriverMaxResultSize()
	 * @model default="1g"
	 * @generated
	 */
	String getDriverMaxResultSize();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getDriverMaxResultSize <em>Driver Max Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Max Result Size</em>' attribute.
	 * @see #getDriverMaxResultSize()
	 * @generated
	 */
	void setDriverMaxResultSize(String value);

	/**
	 * Returns the value of the '<em><b>Driver Memory</b></em>' attribute.
	 * The default value is <code>"1000000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Memory</em>' attribute.
	 * @see #setDriverMemory(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_DriverMemory()
	 * @model default="1000000000" required="true"
	 * @generated
	 */
	long getDriverMemory();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getDriverMemory <em>Driver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Memory</em>' attribute.
	 * @see #getDriverMemory()
	 * @generated
	 */
	void setDriverMemory(long value);

	/**
	 * Returns the value of the '<em><b>Local Dir</b></em>' attribute.
	 * The default value is <code>"/home/apache/spark/localDir"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Dir</em>' attribute.
	 * @see #setLocalDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_LocalDir()
	 * @model default="/home/apache/spark/localDir"
	 * @generated
	 */
	String getLocalDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getLocalDir <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Dir</em>' attribute.
	 * @see #getLocalDir()
	 * @generated
	 */
	void setLocalDir(String value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' reference.
	 * @see #setMaster(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_Master()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getMaster();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getMaster <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(ResourceCluster value);

	/**
	 * Returns the value of the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_WindowSize()
	 * @model required="true"
	 * @generated
	 */
	int getWindowSize();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getWindowSize <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Size</em>' attribute.
	 * @see #getWindowSize()
	 * @generated
	 */
	void setWindowSize(int value);

	/**
	 * Returns the value of the '<em><b>Executor Memory</b></em>' attribute.
	 * The default value is <code>"1000000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor Memory</em>' attribute.
	 * @see #setExecutorMemory(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_ExecutorMemory()
	 * @model default="1000000000" required="true"
	 * @generated
	 */
	long getExecutorMemory();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getExecutorMemory <em>Executor Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor Memory</em>' attribute.
	 * @see #getExecutorMemory()
	 * @generated
	 */
	void setExecutorMemory(long value);

	/**
	 * Returns the value of the '<em><b>Extra Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Listener</em>' attribute.
	 * @see #setExtraListener(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_ExtraListener()
	 * @model
	 * @generated
	 */
	String getExtraListener();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getExtraListener <em>Extra Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Listener</em>' attribute.
	 * @see #getExtraListener()
	 * @generated
	 */
	void setExtraListener(String value);

	/**
	 * Returns the value of the '<em><b>Log Conf</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Conf</em>' attribute.
	 * @see #setLogConf(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_LogConf()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isLogConf();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#isLogConf <em>Log Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Conf</em>' attribute.
	 * @see #isLogConf()
	 * @generated
	 */
	void setLogConf(boolean value);

	/**
	 * Returns the value of the '<em><b>Submit Deploy Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Deploy Mode</em>' attribute.
	 * @see #setSubmitDeployMode(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_SubmitDeployMode()
	 * @model
	 * @generated
	 */
	String getSubmitDeployMode();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getSubmitDeployMode <em>Submit Deploy Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Deploy Mode</em>' attribute.
	 * @see #getSubmitDeployMode()
	 * @generated
	 */
	void setSubmitDeployMode(String value);

	/**
	 * Returns the value of the '<em><b>Log Caller Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Caller Context</em>' attribute.
	 * @see #setLogCallerContext(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_LogCallerContext()
	 * @model required="true"
	 * @generated
	 */
	String getLogCallerContext();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#getLogCallerContext <em>Log Caller Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Caller Context</em>' attribute.
	 * @see #getLogCallerContext()
	 * @generated
	 */
	void setLogCallerContext(String value);

	/**
	 * Returns the value of the '<em><b>Driver Superviser</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Superviser</em>' attribute.
	 * @see #setDriverSuperviser(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkService_DriverSuperviser()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDriverSuperviser();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkService#isDriverSuperviser <em>Driver Superviser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Superviser</em>' attribute.
	 * @see #isDriverSuperviser()
	 * @generated
	 */
	void setDriverSuperviser(boolean value);

} // SparkService
