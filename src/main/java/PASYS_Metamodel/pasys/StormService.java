/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#getNimbusSeeds <em>Nimbus Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#getUiPort <em>Ui Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.StormService#isIsNimbus <em>Is Nimbus</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService()
 * @model
 * @generated
 */
public interface StormService extends SchedulingService {
	/**
	 * Returns the value of the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #setZookeeperConnect(ZookeeperService)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_ZookeeperConnect()
	 * @model required="true"
	 * @generated
	 */
	ZookeeperService getZookeeperConnect();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #getZookeeperConnect()
	 * @generated
	 */
	void setZookeeperConnect(ZookeeperService value);

	/**
	 * Returns the value of the '<em><b>Local Dir</b></em>' attribute.
	 * The default value is <code>"storm-local"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Dir</em>' attribute.
	 * @see #setLocalDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_LocalDir()
	 * @model default="storm-local"
	 * @generated
	 */
	String getLocalDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormService#getLocalDir <em>Local Dir</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nimbus Seeds</em>' reference.
	 * @see #setNimbusSeeds(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_NimbusSeeds()
	 * @model required="true"
	 * @generated
	 */
	NodeCluster getNimbusSeeds();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormService#getNimbusSeeds <em>Nimbus Seeds</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Slot Ports</em>' attribute list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_SupervisorSlotPorts()
	 * @model
	 * @generated
	 */
	EList<Integer> getSupervisorSlotPorts();

	/**
	 * Returns the value of the '<em><b>Ui Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Port</em>' attribute.
	 * @see #setUiPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_UiPort()
	 * @model default="8080"
	 * @generated
	 */
	int getUiPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormService#getUiPort <em>Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Port</em>' attribute.
	 * @see #getUiPort()
	 * @generated
	 */
	void setUiPort(int value);

	/**
	 * Returns the value of the '<em><b>Is Nimbus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nimbus</em>' attribute.
	 * @see #setIsNimbus(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStormService_IsNimbus()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNimbus();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.StormService#isIsNimbus <em>Is Nimbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nimbus</em>' attribute.
	 * @see #isIsNimbus()
	 * @generated
	 */
	void setIsNimbus(boolean value);

} // StormService
