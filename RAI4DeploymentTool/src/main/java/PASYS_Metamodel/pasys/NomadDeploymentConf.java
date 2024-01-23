/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nomad Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getRegion <em>Region</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getPriority <em>Priority</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDeploymentConf()
 * @model
 * @generated
 */
public interface NomadDeploymentConf extends OrchestratorDeploymentConf {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDeploymentConf_Region()
	 * @model required="true"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Data Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' attribute.
	 * @see #setDataCenter(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDeploymentConf_DataCenter()
	 * @model required="true"
	 * @generated
	 */
	String getDataCenter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getDataCenter <em>Data Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' attribute.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDeploymentConf_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.NomadDriver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see PASYS_Metamodel.pasys.NomadDriver
	 * @see #setDriver(NomadDriver)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDeploymentConf_Driver()
	 * @model
	 * @generated
	 */
	NomadDriver getDriver();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NomadDeploymentConf#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see PASYS_Metamodel.pasys.NomadDriver
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(NomadDriver value);

} // NomadDeploymentConf
