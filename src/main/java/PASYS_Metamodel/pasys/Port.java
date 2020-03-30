/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Port#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Port#getPublished <em>Published</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Port#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Port#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPort_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Port#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPort_Published()
	 * @model required="true"
	 * @generated
	 */
	String getPublished();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Port#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @see #setProtocol(Protocol)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPort_Protocol()
	 * @model required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Port#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.PortMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see #setMode(PortMode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPort_Mode()
	 * @model required="true"
	 * @generated
	 */
	PortMode getMode();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Port#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PortMode value);

} // Port
