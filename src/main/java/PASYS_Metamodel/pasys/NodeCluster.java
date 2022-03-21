/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeCluster()
 * @model
 * @generated
 */
public interface NodeCluster extends ResourceCluster {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<ProcessingNode> getNodes();
	

} // NodeCluster
