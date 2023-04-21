/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Task#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Task#getImplementingClassName <em>Implementing Class Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Task#getReturnedStreamData <em>Returned Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Task#getTriggerStreamData <em>Trigger Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Task#getInputStreamData <em>Input Stream Data</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Implementing Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Class Name</em>' attribute.
	 * @see #setImplementingClassName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTask_ImplementingClassName()
	 * @model
	 * @generated
	 */
	String getImplementingClassName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Task#getImplementingClassName <em>Implementing Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Class Name</em>' attribute.
	 * @see #getImplementingClassName()
	 * @generated
	 */
	void setImplementingClassName(String value);

	/**
	 * Returns the value of the '<em><b>Returned Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned Stream Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Stream Data</em>' reference.
	 * @see #setReturnedStreamData(StreamData)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTask_ReturnedStreamData()
	 * @model
	 * @generated
	 */
	StreamData getReturnedStreamData();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Task#getReturnedStreamData <em>Returned Stream Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Stream Data</em>' reference.
	 * @see #getReturnedStreamData()
	 * @generated
	 */
	void setReturnedStreamData(StreamData value);

	/**
	 * Returns the value of the '<em><b>Trigger Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Stream Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Stream Data</em>' reference.
	 * @see #setTriggerStreamData(StreamData)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTask_TriggerStreamData()
	 * @model required="true"
	 * @generated
	 */
	StreamData getTriggerStreamData();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Task#getTriggerStreamData <em>Trigger Stream Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Stream Data</em>' reference.
	 * @see #getTriggerStreamData()
	 * @generated
	 */
	void setTriggerStreamData(StreamData value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Workflow#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Workflow)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTask_Owner()
	 * @see PASYS_Metamodel.pasys.Workflow#getOwnedTasks
	 * @model opposite="ownedTasks" required="true" transient="false"
	 * @generated
	 */
	Workflow getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Task#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Workflow value);

	/**
	 * Returns the value of the '<em><b>Input Stream Data</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.StreamData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Stream Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Stream Data</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getTask_InputStreamData()
	 * @model
	 * @generated
	 */
	EList<StreamData> getInputStreamData();

} // Task
