/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Latency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.WorkflowLatency#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.WorkflowLatency#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowLatency()
 * @model
 * @generated
 */
public interface WorkflowLatency extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Workflow)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowLatency_Target()
	 * @model required="true"
	 * @generated
	 */
	Workflow getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.WorkflowLatency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Workflow value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(WorkflowLatencyMeter)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflowLatency_Meter()
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter#getMetric
	 * @model opposite="metric" required="true"
	 * @generated
	 */
	WorkflowLatencyMeter getMeter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.WorkflowLatency#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(WorkflowLatencyMeter value);

} // WorkflowLatency
