/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmCluster#getWorkers <em>Workers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmCluster#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster()
 * @model
 * @generated
 */
public interface SwarmCluster extends ResourceCluster {
	/**
	 * Returns the value of the '<em><b>Workers</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.DockerServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster_Workers()
	 * @model required="true"
	 * @generated
	 */
	EList<DockerServer> getWorkers();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(DockerServer)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmCluster_Manager()
	 * @model required="true"
	 * @generated
	 */
	DockerServer getManager();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmCluster#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(DockerServer value);

} // SwarmCluster
