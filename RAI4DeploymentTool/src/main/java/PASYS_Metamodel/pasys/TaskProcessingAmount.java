/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Processing Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getTarget <em>Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getMeter <em>Meter</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount()
 * @model
 * @generated
 */
public interface TaskProcessingAmount extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Task)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_Target()
	 * @model required="true"
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(TaskProcessingAmountMeter)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_Meter()
	 * @see PASYS_Metamodel.pasys.TaskProcessingAmountMeter#getMetric
	 * @model opposite="metric" required="true"
	 * @generated
	 */
	TaskProcessingAmountMeter getMeter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(TaskProcessingAmountMeter value);

	/**
	 * Returns the value of the '<em><b>Histogram Buckect Num</b></em>' attribute.
	 * The default value is <code>"11"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Histogram Buckect Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Histogram Buckect Num</em>' attribute.
	 * @see #setHistogramBuckectNum(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_HistogramBuckectNum()
	 * @model default="11" required="true"
	 * @generated
	 */
	int getHistogramBuckectNum();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Histogram Buckect Num</em>' attribute.
	 * @see #getHistogramBuckectNum()
	 * @generated
	 */
	void setHistogramBuckectNum(int value);

	/**
	 * Returns the value of the '<em><b>Expected Max TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Max TPA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Max TPA</em>' attribute.
	 * @see #setExpectedMaxTPA(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_ExpectedMaxTPA()
	 * @model required="true"
	 * @generated
	 */
	long getExpectedMaxTPA();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Max TPA</em>' attribute.
	 * @see #getExpectedMaxTPA()
	 * @generated
	 */
	void setExpectedMaxTPA(long value);

	/**
	 * Returns the value of the '<em><b>Expected Min TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Min TPA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Min TPA</em>' attribute.
	 * @see #setExpectedMinTPA(long)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_ExpectedMinTPA()
	 * @model required="true"
	 * @generated
	 */
	long getExpectedMinTPA();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Min TPA</em>' attribute.
	 * @see #getExpectedMinTPA()
	 * @generated
	 */
	void setExpectedMinTPA(long value);

	/**
	 * Returns the value of the '<em><b>Linear Bucket Distribution</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Bucket Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Bucket Distribution</em>' attribute.
	 * @see #setLinearBucketDistribution(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTaskProcessingAmount_LinearBucketDistribution()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLinearBucketDistribution();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Bucket Distribution</em>' attribute.
	 * @see #isLinearBucketDistribution()
	 * @generated
	 */
	void setLinearBucketDistribution(boolean value);


} // TaskProcessingAmount
