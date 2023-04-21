/**
 */
package PASYS_Metamodel.pasys;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PlatformService#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService()
 * @model abstract="true"
 * @generated
 */
public interface PlatformService extends PlatformResource, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService_Host()
	 * @model
	 * @generated
	 */
	ProcessingResourceCluster getHost();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformService#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResourceCluster value);

} // PlatformService
