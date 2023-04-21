/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SystemElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElement()
 * @model abstract="true"
 * @generated
 */
public interface SystemElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ComputationalSystem)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElement_Owner()
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getOwnedElements
	 * @model opposite="ownedElements" required="true" transient="false"
	 * @generated
	 */
	ComputationalSystem getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemElement#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComputationalSystem value);

} // SystemElement
