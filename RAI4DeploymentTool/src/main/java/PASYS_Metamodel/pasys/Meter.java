/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getMeter()
 * @model abstract="true"
 * @generated
 */
public interface Meter extends NamedElement, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Monitoring Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Server</em>' reference.
	 * @see #setMonitoringServer(MonitoringService)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getMeter_MonitoringServer()
	 * @see PASYS_Metamodel.pasys.MonitoringService#getMonitorizedMeters
	 * @model opposite="monitorizedMeters"
	 * @generated
	 */
	MonitoringService getMonitoringServer();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Server</em>' reference.
	 * @see #getMonitoringServer()
	 * @generated
	 */
	void setMonitoringServer(MonitoringService value);

} // Meter
