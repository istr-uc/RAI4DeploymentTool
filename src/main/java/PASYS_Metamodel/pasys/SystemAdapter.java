/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SystemAdapter#getIdPrefix <em>Id Prefix</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemAdapter#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemAdapter#getElemMapping <em>Elem Mapping</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemAdapter#getSystemTarget <em>System Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemAdapter#getTargetSysLocator <em>Target Sys Locator</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter()
 * @model
 * @generated
 */
public interface SystemAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Prefix</em>' attribute.
	 * @see #setIdPrefix(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter_IdPrefix()
	 * @model required="true"
	 * @generated
	 */
	String getIdPrefix();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemAdapter#getIdPrefix <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Prefix</em>' attribute.
	 * @see #getIdPrefix()
	 * @generated
	 */
	void setIdPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemAdapter#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Elem Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.SystemElementAdapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem Mapping</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter_ElemMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemElementAdapter> getElemMapping();

	/**
	 * Returns the value of the '<em><b>System Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.ComputationalSystem#getReferencedSystems <em>Referenced Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Target</em>' container reference.
	 * @see #setSystemTarget(ComputationalSystem)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter_SystemTarget()
	 * @see PASYS_Metamodel.pasys.ComputationalSystem#getReferencedSystems
	 * @model opposite="referencedSystems" required="true" transient="false"
	 * @generated
	 */
	ComputationalSystem getSystemTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemAdapter#getSystemTarget <em>System Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Target</em>' container reference.
	 * @see #getSystemTarget()
	 * @generated
	 */
	void setSystemTarget(ComputationalSystem value);

	/**
	 * Returns the value of the '<em><b>Target Sys Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sys Locator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sys Locator</em>' attribute.
	 * @see #setTargetSysLocator(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemAdapter_TargetSysLocator()
	 * @model
	 * @generated
	 */
	String getTargetSysLocator();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemAdapter#getTargetSysLocator <em>Target Sys Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sys Locator</em>' attribute.
	 * @see #getTargetSysLocator()
	 * @generated
	 */
	void setTargetSysLocator(String value);

} // SystemAdapter
