/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ServiceNetwork#getIpv4Address <em>Ipv4 Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ServiceNetwork#getAliases <em>Aliases</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.ServiceNetwork#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getServiceNetwork()
 * @model
 * @generated
 */
public interface ServiceNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipv4 Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipv4 Address</em>' attribute.
	 * @see #setIpv4Address(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getServiceNetwork_Ipv4Address()
	 * @model required="true"
	 * @generated
	 */
	String getIpv4Address();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ServiceNetwork#getIpv4Address <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv4 Address</em>' attribute.
	 * @see #getIpv4Address()
	 * @generated
	 */
	void setIpv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getServiceNetwork_Aliases()
	 * @model
	 * @generated
	 */
	EList<String> getAliases();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(SwarmNetwork)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getServiceNetwork_Network()
	 * @model
	 * @generated
	 */
	SwarmNetwork getNetwork();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.ServiceNetwork#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(SwarmNetwork value);

} // ServiceNetwork
