/**
 */
package PASYS_Metamodel.pasys;

import java.util.Properties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.DeploymentConstraints#getLabels <em>Labels</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.DeploymentConstraints#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentConstraints()
 * @model
 * @generated
 */
public interface DeploymentConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(Properties)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentConstraints_Labels()
	 * @model dataType="PASYS_Metamodel.pasys.Properties"
	 * @generated
	 */
	Properties getLabels();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeploymentConstraints#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Properties value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute.
	 * @see #setResources(Properties)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeploymentConstraints_Resources()
	 * @model dataType="PASYS_Metamodel.pasys.Properties"
	 * @generated
	 */
	Properties getResources();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.DeploymentConstraints#getResources <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' attribute.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Properties value);

} // DeploymentConstraints
