/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Stack#getServices <em>Services</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Stack#getSwarmCluster <em>Swarm Cluster</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Stack#getVersion <em>Version</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Stack#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getStack()
 * @model
 * @generated
 */
public interface Stack extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Service}.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Service#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStack_Services()
	 * @see PASYS_Metamodel.pasys.Service#getStack
	 * @model opposite="stack" containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

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
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStack_SwarmCluster()
	 * @model
	 * @generated
	 */
	SwarmCluster getSwarmCluster();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Stack#getSwarmCluster <em>Swarm Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm Cluster</em>' reference.
	 * @see #getSwarmCluster()
	 * @generated
	 */
	void setSwarmCluster(SwarmCluster value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"3.7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStack_Version()
	 * @model default="3.7"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Stack#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.SwarmNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getStack_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwarmNetwork> getNetworks();

} // Stack
