/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Repository#getImages <em>Images</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Repository#isIsPrivate <em>Is Private</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getRepository_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Private</em>' attribute.
	 * @see #setIsPrivate(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getRepository_IsPrivate()
	 * @model
	 * @generated
	 */
	boolean isIsPrivate();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Repository#isIsPrivate <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Private</em>' attribute.
	 * @see #isIsPrivate()
	 * @generated
	 */
	void setIsPrivate(boolean value);

} // Repository
