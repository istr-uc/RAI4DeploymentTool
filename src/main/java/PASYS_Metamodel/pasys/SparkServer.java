/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spark Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getLoad <em>Load</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getDriverCores <em>Driver Cores</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getDriverMaxResultSize <em>Driver Max Result Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getDriverMemory <em>Driver Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getMaster <em>Master</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getWindowSize <em>Window Size</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getExecutorMemory <em>Executor Memory</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getExtraListener <em>Extra Listener</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#isLogConf <em>Log Conf</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getSubmitDeployMode <em>Submit Deploy Mode</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#getLogCallerContext <em>Log Caller Context</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SparkServer#isDriverSuperviser <em>Driver Superviser</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer()
 * @model
 * @generated
 */
public interface SparkServer extends SchedulingServer, SystemComponent {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' reference.
	 * @see #setLoad(SchedulableSet)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_Load()
	 * @model required="true"
	 * @generated
	 */
	SchedulableSet getLoad();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getLoad <em>Load</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Driver Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Cores</em>' attribute.
	 * @see #setDriverCores(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_DriverCores()
	 * @model default="1"
	 * @generated
	 */
	int getDriverCores();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getDriverCores <em>Driver Cores</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Driver Max Result Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Max Result Size</em>' attribute.
	 * @see #setDriverMaxResultSize(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_DriverMaxResultSize()
	 * @model default="1g"
	 * @generated
	 */
	String getDriverMaxResultSize();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getDriverMaxResultSize <em>Driver Max Result Size</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Driver Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Memory</em>' attribute.
	 * @see #setDriverMemory(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_DriverMemory()
	 * @model default="1000000000"
	 * @generated
	 */
	long getDriverMemory();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getDriverMemory <em>Driver Memory</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Local Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Dir</em>' attribute.
	 * @see #setLocalDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_LocalDir()
	 * @model default="/home/apache/spark/localDir"
	 * @generated
	 */
	String getLocalDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getLocalDir <em>Local Dir</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' reference.
	 * @see #setMaster(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_Master()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getMaster();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getMaster <em>Master</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_WindowSize()
	 * @model required="true"
	 * @generated
	 */
	int getWindowSize();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getWindowSize <em>Window Size</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Executor Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor Memory</em>' attribute.
	 * @see #setExecutorMemory(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_ExecutorMemory()
	 * @model default="1000000000"
	 * @generated
	 */
	long getExecutorMemory();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getExecutorMemory <em>Executor Memory</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Extra Listener</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Listener</em>' attribute.
	 * @see #setExtraListener(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_ExtraListener()
	 * @model
	 * @generated
	 */
	String getExtraListener();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getExtraListener <em>Extra Listener</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Log Conf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Conf</em>' attribute.
	 * @see #setLogConf(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_LogConf()
	 * @model default="false"
	 * @generated
	 */
	boolean isLogConf();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#isLogConf <em>Log Conf</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Submit Deploy Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Deploy Mode</em>' attribute.
	 * @see #setSubmitDeployMode(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_SubmitDeployMode()
	 * @model
	 * @generated
	 */
	String getSubmitDeployMode();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getSubmitDeployMode <em>Submit Deploy Mode</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Log Caller Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Caller Context</em>' attribute.
	 * @see #setLogCallerContext(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_LogCallerContext()
	 * @model required="true"
	 * @generated
	 */
	String getLogCallerContext();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#getLogCallerContext <em>Log Caller Context</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Driver Superviser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Superviser</em>' attribute.
	 * @see #setDriverSuperviser(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSparkServer_DriverSuperviser()
	 * @model default="false"
	 * @generated
	 */
	boolean isDriverSuperviser();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SparkServer#isDriverSuperviser <em>Driver Superviser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Superviser</em>' attribute.
	 * @see #isDriverSuperviser()
	 * @generated
	 */
	void setDriverSuperviser(boolean value);

} // SparkServer
