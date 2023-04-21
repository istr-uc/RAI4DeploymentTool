/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.NetworkUtilization#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NetworkUtilization#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNetworkUtilization()
 * @model
 * @generated
 */
public interface NetworkUtilization extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Network)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNetworkUtilization_Target()
	 * @model required="true"
	 * @generated
	 */
	Network getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NetworkUtilization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Network value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.CommunicationMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(CommunicationMeter)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNetworkUtilization_Meter()
	 * @see PASYS_Metamodel.pasys.CommunicationMeter#getMetric
	 * @model opposite="metric" required="true"
	 * @generated
	 */
	CommunicationMeter getMeter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NetworkUtilization#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(CommunicationMeter value);

} // NetworkUtilization
