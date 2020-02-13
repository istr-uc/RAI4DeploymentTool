/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getNimbusSeeds <em>Nimbus Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getDrpcServers <em>Drpc Servers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormServer#getUiPort <em>Ui Port</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer()
 * @model
 * @generated
 */
public interface StormServer extends SchedulingServer, SystemComponent {

	/**
	 * Returns the value of the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zookeeper Connect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #setZookeeperConnect(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_ZookeeperConnect()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getZookeeperConnect();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getZookeeperConnect <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #getZookeeperConnect()
	 * @generated
	 */
	void setZookeeperConnect(ResourceCluster value);

	/**
	 * Returns the value of the '<em><b>Local Dir</b></em>' attribute.
	 * The default value is <code>"storm-local"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Dir</em>' attribute.
	 * @see #setLocalDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_LocalDir()
	 * @model default="storm-local"
	 * @generated
	 */
	String getLocalDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getLocalDir <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Dir</em>' attribute.
	 * @see #getLocalDir()
	 * @generated
	 */
	void setLocalDir(String value);

	/**
	 * Returns the value of the '<em><b>Nimbus Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nimbus Seeds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nimbus Seeds</em>' reference.
	 * @see #setNimbusSeeds(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_NimbusSeeds()
	 * @model required="true"
	 * @generated
	 */
	NodeCluster getNimbusSeeds();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getNimbusSeeds <em>Nimbus Seeds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nimbus Seeds</em>' reference.
	 * @see #getNimbusSeeds()
	 * @generated
	 */
	void setNimbusSeeds(NodeCluster value);

	/**
	 * Returns the value of the '<em><b>Supervisor Slot Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Slot Ports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Slot Ports</em>' attribute list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_SupervisorSlotPorts()
	 * @model
	 * @generated
	 */
	EList<Integer> getSupervisorSlotPorts();

	/**
	 * Returns the value of the '<em><b>Drpc Servers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drpc Servers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drpc Servers</em>' reference.
	 * @see #setDrpcServers(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_DrpcServers()
	 * @model
	 * @generated
	 */
	NodeCluster getDrpcServers();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getDrpcServers <em>Drpc Servers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drpc Servers</em>' reference.
	 * @see #getDrpcServers()
	 * @generated
	 */
	void setDrpcServers(NodeCluster value);

	/**
	 * Returns the value of the '<em><b>Supervisors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisors</em>' reference.
	 * @see #setSupervisors(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_Supervisors()
	 * @model required="true"
	 * @generated
	 */
	NodeCluster getSupervisors();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getSupervisors <em>Supervisors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisors</em>' reference.
	 * @see #getSupervisors()
	 * @generated
	 */
	void setSupervisors(NodeCluster value);

	/**
	 * Returns the value of the '<em><b>Ui Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Port</em>' attribute.
	 * @see #setUiPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormServer_UiPort()
	 * @model default="8080"
	 * @generated
	 */
	int getUiPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormServer#getUiPort <em>Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Port</em>' attribute.
	 * @see #getUiPort()
	 * @generated
	 */
	void setUiPort(int value);

} // StormServer
