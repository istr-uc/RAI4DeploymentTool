/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prometheus Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringPort <em>Monitoring Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringTime <em>Monitoring Time</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusMeter()
 * @model
 * @generated
 */
public interface PrometheusMeter extends Meter {
	/**
	 * Returns the value of the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Port</em>' attribute.
	 * @see #setMonitoringPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusMeter_MonitoringPort()
	 * @model required="true"
	 * @generated
	 */
	int getMonitoringPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringPort <em>Monitoring Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Port</em>' attribute.
	 * @see #getMonitoringPort()
	 * @generated
	 */
	void setMonitoringPort(int value);

	/**
	 * Returns the value of the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Time</em>' attribute.
	 * @see #setMonitoringTime(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusMeter_MonitoringTime()
	 * @model required="true"
	 * @generated
	 */
	long getMonitoringTime();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.PrometheusMeter#getMonitoringTime <em>Monitoring Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Time</em>' attribute.
	 * @see #getMonitoringTime()
	 * @generated
	 */
	void setMonitoringTime(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPrometheusServerConfiguration();

} // PrometheusMeter
