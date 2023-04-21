/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Resource Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeResourceMeter()
 * @model
 * @generated
 */
public interface NodeResourceMeter extends NodeHostedMeter {
	/**
	 * Returns the value of the '<em><b>UMetric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.ProcessingNodeUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UMetric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UMetric</em>' reference.
	 * @see #setUMetric(ProcessingNodeUtilization)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeResourceMeter_UMetric()
	 * @see PASYS_Metamodel.pasys.ProcessingNodeUtilization#getMeter
	 * @model opposite="meter"
	 * @generated
	 */
	ProcessingNodeUtilization getUMetric();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UMetric</em>' reference.
	 * @see #getUMetric()
	 * @generated
	 */
	void setUMetric(ProcessingNodeUtilization value);

	/**
	 * Returns the value of the '<em><b>MMetric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MMetric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMetric</em>' reference.
	 * @see #setMMetric(ProcessingNodeMemory)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeResourceMeter_MMetric()
	 * @see PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter
	 * @model opposite="meter"
	 * @generated
	 */
	ProcessingNodeMemory getMMetric();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMetric</em>' reference.
	 * @see #getMMetric()
	 * @generated
	 */
	void setMMetric(ProcessingNodeMemory value);


} // NodeResourceMeter
