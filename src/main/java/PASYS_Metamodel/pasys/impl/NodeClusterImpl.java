/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.ProcessingNode;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NodeClusterImpl extends ResourceClusterImpl implements NodeCluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NODE_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ProcessingNode> getNodes() {
		EList<ProcessingNode> nodes = new BasicEList<ProcessingNode>();
		for (PlatformResource rsrc:getResources()) {
			ProcessingNode node = (ProcessingNode) rsrc;
			nodes.add(node);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.NODE_CLUSTER___GET_NODES:
				return getNodes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NodeClusterImpl
