/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.ProcessingNodeCluster#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getProcessingNodeCluster()
 * @model
 * @generated
 */
public interface ProcessingNodeCluster extends ProcessingResourceCluster {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.ProcessingNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getProcessingNodeCluster_Nodes()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessingNode> getNodes();

} // ProcessingNodeCluster
