/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getMonitoringService()
 * @model abstract="true"
 * @generated
 */
public interface MonitoringService extends PlatformService {
	/**
	 * Returns the value of the '<em><b>Monitorized Meters</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Meter}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitorized Meters</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getMonitoringService_MonitorizedMeters()
	 * @see PASYS_Metamodel.pasys.Meter#getMonitoringServer
	 * @model opposite="monitoringServer"
	 * @generated
	 */
	EList<Meter> getMonitorizedMeters();

} // MonitoringService
