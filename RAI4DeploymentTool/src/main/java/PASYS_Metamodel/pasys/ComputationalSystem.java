/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computational System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getName <em>Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getDate <em>Date</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getAuthors <em>Authors</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getDoc <em>Doc</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ComputationalSystem#getAuthenticationFiles <em>Authentication Files</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem()
 * @model
 * @generated
 */
public interface ComputationalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ComputationalSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ComputationalSystem#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' attribute.
	 * @see #setAuthors(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_Authors()
	 * @model
	 * @generated
	 */
	String getAuthors();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ComputationalSystem#getAuthors <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' attribute.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(String value);

	/**
	 * Returns the value of the '<em><b>Target Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Platform Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Platform Name</em>' attribute.
	 * @see #setTargetPlatformName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_TargetPlatformName()
	 * @model
	 * @generated
	 */
	String getTargetPlatformName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Platform Name</em>' attribute.
	 * @see #getTargetPlatformName()
	 * @generated
	 */
	void setTargetPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ComputationalSystem#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.SystemElement}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.SystemElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_OwnedElements()
	 * @see PASYS_Metamodel.pasys.SystemElement#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<SystemElement> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Authentication Files</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Files</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Files</em>' map.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getComputationalSystem_AuthenticationFiles()
	 * @model mapType="PASYS_Metamodel.pasys.StringToStringMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getAuthenticationFiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deployAndLaunch();

	void cleanDeployment();
	
} // ComputationalSystem
