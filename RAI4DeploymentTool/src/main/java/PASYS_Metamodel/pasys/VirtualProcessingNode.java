/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getVirtualProcessingNode()
 * @model abstract="true"
 * @generated
 */
public interface VirtualProcessingNode extends ProcessingNode {
	/**
	 * Returns the value of the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External IP</em>' attribute.
	 * @see #setExternalIP(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getVirtualProcessingNode_ExternalIP()
	 * @model required="true"
	 * @generated
	 */
	String getExternalIP();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External IP</em>' attribute.
	 * @see #getExternalIP()
	 * @generated
	 */
	void setExternalIP(String value);

} // VirtualProcessingNode
