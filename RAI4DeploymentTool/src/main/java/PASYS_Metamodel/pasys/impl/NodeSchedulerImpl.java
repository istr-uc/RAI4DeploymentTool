/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.NodeScheduler;
import PASYS_Metamodel.pasys.PasysPackage;


import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NodeSchedulerImpl extends SchedulingServiceImpl implements NodeScheduler {
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

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnOrchestrator() throws ConfigurationException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnNode() throws ConfigurationException {
		// TODO Auto-generated method stub
		
	}
	
} //NodeSchedulerImpl
