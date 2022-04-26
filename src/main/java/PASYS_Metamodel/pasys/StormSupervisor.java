/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.StormSupervisor#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormSupervisor#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormSupervisor#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStormSupervisor()
 * @model
 * @generated
 */
public interface StormSupervisor extends DeployableComponent, NamedElement {
	/**
	 * Returns the value of the '<em><b>Supervisor Slot Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Slot Ports</em>' attribute list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormSupervisor_SupervisorSlotPorts()
	 * @model
	 * @generated
	 */
	EList<Integer> getSupervisorSlotPorts();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.StormService#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(StormService)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormSupervisor_Owner()
	 * @see PASYS_Metamodel.pasys.StormService#getSupervisor
	 * @model opposite="supervisor" transient="false"
	 * @generated
	 */
	StormService getOwner();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormSupervisor#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StormService value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormSupervisor_Host()
	 * @model
	 * @generated
	 */
	NodeCluster getHost();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormSupervisor#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(NodeCluster value);

} // StormSupervisor
