/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.CommunicationMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getCommunicationMeter()
 * @model
 * @generated
 */
public interface CommunicationMeter extends NodeHostedMeter {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.NetworkUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(NetworkUtilization)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCommunicationMeter_Metric()
	 * @see PASYS_Metamodel.pasys.NetworkUtilization#getMeter
	 * @model opposite="meter" required="true"
	 * @generated
	 */
	NetworkUtilization getMetric();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CommunicationMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(NetworkUtilization value);

} // CommunicationMeter
