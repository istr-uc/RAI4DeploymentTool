/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.DockerServer#getStacks <em>Stacks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.DockerServer#getSwarmCluster <em>Swarm Cluster</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDockerServer()
 * @model
 * @generated
 */
public interface DockerServer extends ContainerizationServer {
	/**
	 * Returns the value of the '<em><b>Stacks</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Stack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stacks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stacks</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDockerServer_Stacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stack> getStacks();

	/**
	 * Returns the value of the '<em><b>Swarm Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm Cluster</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm Cluster</em>' reference.
	 * @see #setSwarmCluster(SwarmCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDockerServer_SwarmCluster()
	 * @model
	 * @generated
	 */
	SwarmCluster getSwarmCluster();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DockerServer#getSwarmCluster <em>Swarm Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Cluster</em>' reference.
	 * @see #getSwarmCluster()
	 * @generated
	 */
	void setSwarmCluster(SwarmCluster value);

} // DockerServer
