/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Element Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SystemElementAdapter#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemElementAdapter#getSourceElemId <em>Source Elem Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemElementAdapter#getTargetElemId <em>Target Elem Id</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElementAdapter()
 * @model
 * @generated
 */
public interface SystemElementAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Elem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem Name</em>' attribute.
	 * @see #setElemName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElementAdapter_ElemName()
	 * @model required="true"
	 * @generated
	 */
	String getElemName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getElemName <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Name</em>' attribute.
	 * @see #getElemName()
	 * @generated
	 */
	void setElemName(String value);

	/**
	 * Returns the value of the '<em><b>Source Elem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elem Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elem Id</em>' attribute.
	 * @see #setSourceElemId(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElementAdapter_SourceElemId()
	 * @model required="true"
	 * @generated
	 */
	String getSourceElemId();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getSourceElemId <em>Source Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Elem Id</em>' attribute.
	 * @see #getSourceElemId()
	 * @generated
	 */
	void setSourceElemId(String value);

	/**
	 * Returns the value of the '<em><b>Target Elem Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elem Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elem Id</em>' attribute.
	 * @see #setTargetElemId(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemElementAdapter_TargetElemId()
	 * @model required="true"
	 * @generated
	 */
	String getTargetElemId();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemElementAdapter#getTargetElemId <em>Target Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Elem Id</em>' attribute.
	 * @see #getTargetElemId()
	 * @generated
	 */
	void setTargetElemId(String value);

} // SystemElementAdapter
