/**
 */
package PASYS_Metamodel.pasys;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getNodeCluster()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allNodes'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='resources-&gt;forAll(r|r.oclIsKindOf(ProcessingNode))'"
	 * @generated
	 */
	boolean allNodes(DiagnosticChain diagnostics, Map<Object, Object> context);
	

} // NodeCluster
