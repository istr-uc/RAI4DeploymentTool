/**
 */
package PASYS_Metamodel.pasys;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Deployment#getPlacement <em>Placement</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Deployment#getRestartPolicy <em>Restart Policy</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployment_Replicas()
	 * @model
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Deployment#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' map.
	 * @see #setPlacement(Map.Entry)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployment_Placement()
	 * @model mapType="PASYS_Metamodel.pasys.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getPlacement();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Deployment#getPlacement <em>Placement</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' map.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' map.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployment_RestartPolicy()
	 * @model mapType="PASYS_Metamodel.pasys.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getRestartPolicy();

} // Deployment
