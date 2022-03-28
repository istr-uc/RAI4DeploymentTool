/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Rack#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getRack()
 * @model
 * @generated
 */
public interface Rack extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference.
	 * @see #setNodes(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getRack_Nodes()
	 * @model required="true"
	 * @generated
	 */
	NodeCluster getNodes();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Rack#getNodes <em>Nodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(NodeCluster value);

} // Rack
