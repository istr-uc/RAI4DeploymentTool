/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmCluster#getIp <em>Ip</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmCluster#getPort <em>Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmCluster#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster()
 * @model
 * @generated
 */
public interface SwarmCluster extends OrchestrationCluster {

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster_Ip()
	 * @model required="true"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmCluster#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster_Port()
	 * @model required="true"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmCluster#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster_User()
	 * @model required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmCluster#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);
} // SwarmCluster
