/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration Service Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImage <em>Image</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getCommand <em>Command</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getPorts <em>Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf()
 * @model
 * @generated
 */
public interface OrchestrationServiceDeploymentConf extends PlatformServiceDeploymentConf {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Replicas()
	 * @model
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #setImagePullPolicy(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_ImagePullPolicy()
	 * @model
	 * @generated
	 */
	String getImagePullPolicy();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #getImagePullPolicy()
	 * @generated
	 */
	void setImagePullPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Volumes()
	 * @model
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Ports()
	 * @model
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference.
	 * @see #setConstraints(DeploymentConstraints)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getOrchestrationServiceDeploymentConf_Constraints()
	 * @model required="true"
	 * @generated
	 */
	DeploymentConstraints getConstraints();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf#getConstraints <em>Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(DeploymentConstraints value);

} // OrchestrationServiceDeploymentConf
