/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployableComponent()
 * @model abstract="true"
 * @generated
 */
public interface DeployableComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Config</em>' containment reference.
	 * @see #setDeploymentConfig(DeploymentConfiguration)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployableComponent_DeploymentConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeploymentConfiguration getDeploymentConfig();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Config</em>' containment reference.
	 * @see #getDeploymentConfig()
	 * @generated
	 */
	void setDeploymentConfig(DeploymentConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="PASYS_Metamodel.pasys.ConfigurationException"
	 * @generated
	 */
	void configureDeployment() throws ConfigurationException;

} // DeployableComponent
