/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.DataCenter#getRacks <em>Racks</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getDataCenter()
 * @model
 * @generated
 */
public interface DataCenter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Racks</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Rack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Racks</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getDataCenter_Racks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rack> getRacks();

} // DataCenter
