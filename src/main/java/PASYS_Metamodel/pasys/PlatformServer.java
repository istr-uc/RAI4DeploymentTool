/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PlatformServer#getHost <em>Host</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.PlatformServer#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformServer()
 * @model
 * @generated
 */
public interface PlatformServer extends PlatformResource, SystemComponent {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformServer_Host()
	 * @model required="true"
	 * @generated
	 */
	ProcessingNode getHost();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformServer#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformServer_Target()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformServer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ResourceCluster value);

} // PlatformServer
