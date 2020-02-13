/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ResourceCluster#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getResourceCluster()
 * @model
 * @generated
 */
public interface ResourceCluster extends PlatformResource {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.PlatformResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getResourceCluster_Resources()
	 * @model required="true"
	 * @generated
	 */
	EList<PlatformResource> getResources();

} // ResourceCluster
