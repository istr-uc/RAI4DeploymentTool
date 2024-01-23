/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nomad Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.NomadCluster#getIp <em>Ip</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NomadCluster#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadCluster()
 * @model
 * @generated
 */
public interface NomadCluster extends OrchestrationCluster {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadCluster_Ip()
	 * @model required="true"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadCluster#getIp <em>Ip</em>}' attribute.
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
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadCluster_Port()
	 * @model required="true"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadCluster#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

} // NomadCluster
