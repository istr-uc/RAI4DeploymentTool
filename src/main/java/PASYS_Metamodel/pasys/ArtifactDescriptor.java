/**
 */
package PASYS_Metamodel.pasys;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ArtifactDescriptor#getFileLocator <em>File Locator</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getArtifactDescriptor()
 * @model
 * @generated
 */
public interface ArtifactDescriptor extends FileDescriptor {
	/**
	 * Returns the value of the '<em><b>File Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Locator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Locator</em>' attribute.
	 * @see #setFileLocator(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getArtifactDescriptor_FileLocator()
	 * @model required="true"
	 * @generated
	 */
	String getFileLocator();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ArtifactDescriptor#getFileLocator <em>File Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Locator</em>' attribute.
	 * @see #getFileLocator()
	 * @generated
	 */
	void setFileLocator(String value);

} // ArtifactDescriptor
