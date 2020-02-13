/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zookeeper Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getServerId <em>Server Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#isLeaderServers <em>Leader Servers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getInitLimit <em>Init Limit</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getPeerPort <em>Peer Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ZookeeperServer#getLeaderPort <em>Leader Port</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer()
 * @model
 * @generated
 */
public interface ZookeeperServer extends DistributionServer, SystemComponent {
	/**
	 * Returns the value of the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Id</em>' attribute.
	 * @see #setServerId(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_ServerId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getServerId();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getServerId <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Id</em>' attribute.
	 * @see #getServerId()
	 * @generated
	 */
	void setServerId(int value);

	/**
	 * Returns the value of the '<em><b>Tick Time</b></em>' attribute.
	 * The default value is <code>"2000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Time</em>' attribute.
	 * @see #setTickTime(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_TickTime()
	 * @model default="2000"
	 * @generated
	 */
	long getTickTime();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getTickTime <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Time</em>' attribute.
	 * @see #getTickTime()
	 * @generated
	 */
	void setTickTime(long value);

	/**
	 * Returns the value of the '<em><b>Leader Servers</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Servers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Servers</em>' attribute.
	 * @see #setLeaderServers(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_LeaderServers()
	 * @model default="true"
	 * @generated
	 */
	boolean isLeaderServers();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#isLeaderServers <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Servers</em>' attribute.
	 * @see #isLeaderServers()
	 * @generated
	 */
	void setLeaderServers(boolean value);

	/**
	 * Returns the value of the '<em><b>Init Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Limit</em>' attribute.
	 * @see #setInitLimit(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_InitLimit()
	 * @model default="5"
	 * @generated
	 */
	int getInitLimit();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getInitLimit <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Limit</em>' attribute.
	 * @see #getInitLimit()
	 * @generated
	 */
	void setInitLimit(int value);

	/**
	 * Returns the value of the '<em><b>Sync Limit</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Limit</em>' attribute.
	 * @see #setSyncLimit(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_SyncLimit()
	 * @model default="3"
	 * @generated
	 */
	int getSyncLimit();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getSyncLimit <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Limit</em>' attribute.
	 * @see #getSyncLimit()
	 * @generated
	 */
	void setSyncLimit(int value);

	/**
	 * Returns the value of the '<em><b>Client Port</b></em>' attribute.
	 * The default value is <code>"2181"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Port</em>' attribute.
	 * @see #setClientPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_ClientPort()
	 * @model default="2181"
	 * @generated
	 */
	int getClientPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getClientPort <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Port</em>' attribute.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(int value);

	/**
	 * Returns the value of the '<em><b>Peer Port</b></em>' attribute.
	 * The default value is <code>"2888"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peer Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peer Port</em>' attribute.
	 * @see #setPeerPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_PeerPort()
	 * @model default="2888"
	 * @generated
	 */
	int getPeerPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getPeerPort <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Port</em>' attribute.
	 * @see #getPeerPort()
	 * @generated
	 */
	void setPeerPort(int value);

	/**
	 * Returns the value of the '<em><b>Leader Port</b></em>' attribute.
	 * The default value is <code>"3888"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Port</em>' attribute.
	 * @see #setLeaderPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getZookeeperServer_LeaderPort()
	 * @model default="3888"
	 * @generated
	 */
	int getLeaderPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ZookeeperServer#getLeaderPort <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Port</em>' attribute.
	 * @see #getLeaderPort()
	 * @generated
	 */
	void setLeaderPort(int value);

} // ZookeeperServer
