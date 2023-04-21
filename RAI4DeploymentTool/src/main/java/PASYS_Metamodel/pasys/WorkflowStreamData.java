/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.WorkflowStreamData#isIsSingleUse <em>Is Single Use</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.WorkflowStreamData#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowStreamData()
 * @model abstract="true"
 * @generated
 */
public interface WorkflowStreamData extends NamedElement, StreamData {
	/**
	 * Returns the value of the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Use</em>' attribute.
	 * @see #setIsSingleUse(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowStreamData_IsSingleUse()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSingleUse();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.WorkflowStreamData#isIsSingleUse <em>Is Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Use</em>' attribute.
	 * @see #isIsSingleUse()
	 * @generated
	 */
	void setIsSingleUse(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Workflow#getOwnedStreamData <em>Owned Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Workflow)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowStreamData_Owner()
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedStreamData
	 * @model opposite="ownedStreamData" required="true" transient="false"
	 * @generated
	 */
	Workflow getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.WorkflowStreamData#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Workflow value);

} // WorkflowStreamData
