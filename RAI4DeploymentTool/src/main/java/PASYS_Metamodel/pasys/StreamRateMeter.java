/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Rate Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.StreamRateMeter#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StreamRateMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamRateMeter()
 * @model
 * @generated
 */
public interface StreamRateMeter extends PrometheusMeter {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.StreamData#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(StreamData)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamRateMeter_Owner()
	 * @see PASYS_Metamodel.pasys.StreamData#getOwnedMeters
	 * @model opposite="ownedMeters" required="true" transient="false"
	 * @generated
	 */
	StreamData getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StreamRateMeter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StreamData value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.StreamDataRate#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(StreamDataRate)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStreamRateMeter_Metric()
	 * @see PASYS_Metamodel.pasys.StreamDataRate#getMeter
	 * @model opposite="meter" required="true"
	 * @generated
	 */
	StreamDataRate getMetric();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StreamRateMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(StreamDataRate value);

} // StreamRateMeter
