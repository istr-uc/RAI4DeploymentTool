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
 *   <li>{@link PASYS_Metamodel.pasys.PlatformService#getOrchestrator <em>Orchestrator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.PlatformService#isManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hostOrOrchestrator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hostOrOrchestrator='if managed then \n\t\t\t\thost=null and orchestrator = null\n\t\t\telse\n\t\t\t\thost&lt;&gt;null xor orchestrator&lt;&gt;null\n\t\t\tendif'"
 * @generated
 */
public interface PlatformService extends PlatformResource, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService_Host()
	 * @model
	 * @generated
	 */
	NodeCluster getHost();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformService#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(NodeCluster value);

	/**
	 * Returns the value of the '<em><b>Orchestrator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.OrchestrationService#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrator</em>' reference.
	 * @see #setOrchestrator(OrchestrationService)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService_Orchestrator()
	 * @see PASYS_Metamodel.pasys.OrchestrationService#getServices
	 * @model opposite="services"
	 * @generated
	 */
	OrchestrationService getOrchestrator();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformService#getOrchestrator <em>Orchestrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orchestrator</em>' reference.
	 * @see #getOrchestrator()
	 * @generated
	 */
	void setOrchestrator(OrchestrationService value);

	/**
	 * Returns the value of the '<em><b>Managed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed</em>' attribute.
	 * @see #setManaged(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPlatformService_Managed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isManaged();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PlatformService#isManaged <em>Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed</em>' attribute.
	 * @see #isManaged()
	 * @generated
	 */
	void setManaged(boolean value);

} // PlatformService
