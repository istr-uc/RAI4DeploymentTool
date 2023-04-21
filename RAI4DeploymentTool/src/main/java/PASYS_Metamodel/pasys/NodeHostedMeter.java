/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Hosted Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.NodeHostedMeter#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeHostedMeter()
 * @model abstract="true"
 * @generated
 */
public interface NodeHostedMeter extends PrometheusMeter {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.ProcessingNode#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeHostedMeter_Owner()
	 * @see PASYS_Metamodel.pasys.ProcessingNode#getOwnedMeters
	 * @model opposite="ownedMeters" required="true" transient="false"
	 * @generated
	 */
	ProcessingNode getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NodeHostedMeter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessingNode value);

} // NodeHostedMeter
