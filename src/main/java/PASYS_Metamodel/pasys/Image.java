/**
 */
package PASYS_Metamodel.pasys;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Image#getRepository <em>Repository</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Image#getTag <em>Tag</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Image#getDockerFile <em>Docker File</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Image#getDescription <em>Description</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Image#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getImage_Repository()
	 * @model required="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Image#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getImage_Tag()
	 * @model required="true"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Image#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Docker File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker File</em>' attribute.
	 * @see #setDockerFile(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getImage_DockerFile()
	 * @model required="true"
	 * @generated
	 */
	String getDockerFile();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Image#getDockerFile <em>Docker File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker File</em>' attribute.
	 * @see #getDockerFile()
	 * @generated
	 */
	void setDockerFile(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getImage_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Image#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getImage_Size()
	 * @model required="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Image#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

} // Image
