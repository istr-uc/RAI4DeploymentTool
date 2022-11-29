/**
 */
package PASYS_Metamodel.pasys;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.KubernetesPort#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getKubernetesPort()
 * @model
 * @generated
 */
public interface KubernetesPort extends Port {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKubernetesPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KubernetesPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // KubernetesPort
