/**
 */
package PASYS_Metamodel.pasys;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmNetwork#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SwarmNetwork#getDriver <em>Driver</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmNetwork()
 * @model
 * @generated
 */
public interface SwarmNetwork extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' reference.
	 * @see #setSubnets(Map.Entry)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmNetwork_Subnets()
	 * @model mapType="PASYS_Metamodel.pasys.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getSubnets();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmNetwork#getSubnets <em>Subnets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnets</em>' reference.
	 * @see #getSubnets()
	 * @generated
	 */
	void setSubnets(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * The literals are from the enumeration {@link PASYS_Metamodel.pasys.NetworkDriver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see PASYS_Metamodel.pasys.NetworkDriver
	 * @see #setDriver(NetworkDriver)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSwarmNetwork_Driver()
	 * @model required="true"
	 * @generated
	 */
	NetworkDriver getDriver();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SwarmNetwork#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see PASYS_Metamodel.pasys.NetworkDriver
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(NetworkDriver value);

} // SwarmNetwork
