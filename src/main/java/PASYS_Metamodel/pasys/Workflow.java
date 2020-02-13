/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getOwnedStreamData <em>Owned Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getRootTask <em>Root Task</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getOwnedTaskExecutors <em>Owned Task Executors</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Workflow#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends SystemElement, SystemComponent {
	/**
	 * Returns the value of the '<em><b>Owned Stream Data</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.WorkflowStreamData}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.WorkflowStreamData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stream Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stream Data</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_OwnedStreamData()
	 * @see PASYS_Metamodel.pasys.WorkflowStreamData#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<WorkflowStreamData> getOwnedStreamData();

	/**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Task}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Task#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_OwnedTasks()
	 * @see PASYS_Metamodel.pasys.Task#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Task> getOwnedTasks();

	/**
	 * Returns the value of the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Task</em>' reference.
	 * @see #setRootTask(Task)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_RootTask()
	 * @model required="true"
	 * @generated
	 */
	Task getRootTask();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Workflow#getRootTask <em>Root Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Task</em>' reference.
	 * @see #getRootTask()
	 * @generated
	 */
	void setRootTask(Task value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.SchedulingServer#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(SchedulingServer)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_Scheduler()
	 * @see PASYS_Metamodel.pasys.SchedulingServer#getWorkflows
	 * @model opposite="workflows" required="true"
	 * @generated
	 */
	SchedulingServer getScheduler();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Workflow#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(SchedulingServer value);

	/**
	 * Returns the value of the '<em><b>Owned Meters</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.WorkflowLatencyMeter}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.WorkflowLatencyMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Meters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Meters</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_OwnedMeters()
	 * @see PASYS_Metamodel.pasys.WorkflowLatencyMeter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<WorkflowLatencyMeter> getOwnedMeters();

	/**
	 * Returns the value of the '<em><b>Owned Task Executors</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.TaskExecutor}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.TaskExecutor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Task Executors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Task Executors</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getWorkflow_OwnedTaskExecutors()
	 * @see PASYS_Metamodel.pasys.TaskExecutor#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<TaskExecutor> getOwnedTaskExecutors();

} // Workflow
