/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.Neo4JService;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JService</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Neo4JServiceImpl extends PersistenceServiceImpl implements Neo4JService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Neo4JServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NEO4_JSERVICE;
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
} //Neo4JServiceImpl
