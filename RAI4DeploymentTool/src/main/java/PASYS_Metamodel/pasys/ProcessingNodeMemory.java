/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Node Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getProcessingNodeMemory()
 * @model
 * @generated
 */
public interface ProcessingNodeMemory extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getProcessingNodeMemory_Target()
	 * @model required="true"
	 * @generated
	 */
	ProcessingNode getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessingNode value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(NodeResourceMeter)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getProcessingNodeMemory_Meter()
	 * @see PASYS_Metamodel.pasys.NodeResourceMeter#getMMetric
	 * @model opposite="mMetric" required="true"
	 * @generated
	 */
	NodeResourceMeter getMeter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ProcessingNodeMemory#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(NodeResourceMeter value);

} // ProcessingNodeMemory
