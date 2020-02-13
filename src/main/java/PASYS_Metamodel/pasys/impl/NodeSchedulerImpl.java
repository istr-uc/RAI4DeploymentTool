/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformResource;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;

import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ResourceCluster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NodeSchedulerImpl extends SchedulingServerImpl implements NodeScheduler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NODE_SCHEDULER;
	}

	@Override
	public List<ProcessingNode> getHosts() {
		List<ProcessingNode> list = new LinkedList<ProcessingNode>();
		
 		ResourceCluster target = getTarget();
		for (PlatformResource pr : target.getResources()) {
			ResourceCluster rc= (ResourceCluster) pr;
			for (PlatformResource pr2 : rc.getResources()) {
				if (pr2 instanceof ProcessingNode) 
					list.add((ProcessingNode) pr2);
			}
		}
		return list;
		
		
	}
	
} //NodeSchedulerImpl
