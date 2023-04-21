/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmPort#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmPort()
 * @model
 * @generated
 */
public interface SwarmPort extends Port {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see PASYS_Metamodel.pasys.Protocol
	 * @see #setProtocol(Protocol)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmPort_Protocol()
	 * @model required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmPort#getProtocol <em>Protocol</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see #setMode(PortMode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmPort_Mode()
	 * @model required="true"
	 * @generated
	 */
	PortMode getMode();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmPort#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see PASYS_Metamodel.pasys.PortMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PortMode value);

} // SwarmPort
