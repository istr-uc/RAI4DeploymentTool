/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationService#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationService()
 * @model abstract="true"
 * @generated
 */
public interface OrchestrationService extends PlatformService {

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.PlatformService}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.PlatformService#getOrchestrator <em>Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationService_Services()
	 * @see PASYS_Metamodel.pasys.PlatformService#getOrchestrator
	 * @model opposite="orchestrator"
	 * @generated
	 */
	EList<PlatformService> getServices();
} // OrchestrationService
