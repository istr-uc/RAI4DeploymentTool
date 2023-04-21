/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.StreamDataRate#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StreamDataRate#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamDataRate()
 * @model
 * @generated
 */
public interface StreamDataRate extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StreamData)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamDataRate_Target()
	 * @model required="true"
	 * @generated
	 */
	StreamData getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StreamDataRate#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StreamData value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.StreamRateMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(StreamRateMeter)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamDataRate_Meter()
	 * @see PASYS_Metamodel.pasys.StreamRateMeter#getMetric
	 * @model opposite="metric" required="true"
	 * @generated
	 */
	StreamRateMeter getMeter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StreamDataRate#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(StreamRateMeter value);

} // StreamDataRate
