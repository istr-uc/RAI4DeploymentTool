/**
 */
package PASYS_Metamodel.pasys;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentFileDescriptor()
 * @model
 * @generated
 */
public interface DeploymentFileDescriptor extends FileDescriptor {
	/**
	 * Returns the value of the '<em><b>File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Content</em>' attribute.
	 * @see #setFileContent(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentFileDescriptor_FileContent()
	 * @model required="true"
	 * @generated
	 */
	String getFileContent();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Content</em>' attribute.
	 * @see #getFileContent()
	 * @generated
	 */
	void setFileContent(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.DeployableComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see PASYS_Metamodel.pasys.DeployableComponentType
	 * @see #setElementType(DeployableComponentType)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentFileDescriptor_ElementType()
	 * @model
	 * @generated
	 */
	DeployableComponentType getElementType();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see PASYS_Metamodel.pasys.DeployableComponentType
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(DeployableComponentType value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentFileDescriptor_Owner()
	 * @model
	 * @generated
	 */
	ProcessingNode getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessingNode value);

	String createFileFromDescriptor(String directory) throws DeploymentException;

} // DeploymentFileDescriptor
