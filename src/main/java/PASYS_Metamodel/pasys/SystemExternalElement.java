/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System External Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SystemExternalElement#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemExternalElement()
 * @model
 * @generated
 */
public interface SystemExternalElement extends SystemElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.ExternalElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see PASYS_Metamodel.pasys.ExternalElementType
	 * @see #setElementType(ExternalElementType)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemExternalElement_ElementType()
	 * @model
	 * @generated
	 */
	ExternalElementType getElementType();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemExternalElement#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see PASYS_Metamodel.pasys.ExternalElementType
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ExternalElementType value);

} // SystemExternalElement
