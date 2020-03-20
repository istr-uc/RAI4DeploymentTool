/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.LaunchException;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Physical Processing Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PhysicalProcessingNodeImpl#getOs <em>Os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalProcessingNodeImpl extends ProcessingNodeImpl implements PhysicalProcessingNode {
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalProcessingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PHYSICAL_PROCESSING_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PHYSICAL_PROCESSING_NODE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PHYSICAL_PROCESSING_NODE__OS:
				return getOs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.PHYSICAL_PROCESSING_NODE__OS:
				setOs((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.PHYSICAL_PROCESSING_NODE__OS:
				setOs(OS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.PHYSICAL_PROCESSING_NODE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (os: ");
		result.append(os);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void deployAndLaunch() throws LaunchException, DeploymentException, ConfigurationException {
		int exitValue = 0;
		//System.out.println("deployAndLaunch() in "+this.id);
		
			// 1. Create <processorID>.cfg (seg�n la informaci�n almacenada en
		// this.propertyConfigData)
		// 2. Copy Properties to the file
		// Si es en forma de file o de Stream, etc. lo dejamos para cuando
		// sepamos como
		// lo vamos a enviar remotamente.
		// 3.Transfer <processorID>.cfg a this.IP
		
		 /* FileOutputStream f = null; try { f = new
		 * FileOutputStream("temp/"+"Node"+getId()+".cfg"); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { getPropertyConfigData().store(f,
		 * "Node configuration properties"); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 

		// Prepara las carpetas backup del nodo
		// 4 Create the backup folder in scriptFolder
		// 5 Copy all the files in scriptFolder to scriptFolder.backup

		// 6 Create the backup folder in configFolderPath
		// 7 Copy all the files in configFolderPath to configFolderPath.backup */

		// 8 para cada file en legatedConfigFile
		// 8.1 Transfer (via SCP) the file to this.IP
		scpTransfer(getConfigFiles(), getIp());

		// 9 para cada file en launchingScriptFiles
		// 9.1 Transfer (via SCP) the file to this.IP
		scpTransfer(getLaunchingScripts(), getIp());

		// 10 para cada file en launchingScriptFiles
		// 10.1 Transfer (via SCP) the file to this.IP
		scpTransferArtifacts(getCodeFiles(), getIp());
		// 11. para cada file en launchingScriptFiles
		// // 11.1 Invokes remotely (via SSH) the script
		//sshExecution(getLaunchingScripts()); Comentado para despliegue global
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void bringBackDeployment() {
		
		super.bringBackDeployment();
		try {
			remoteDelete(getConfigFiles(), getIp());
			remoteDelete(getLaunchingScripts(), getIp());
			
		} catch (LaunchException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void abortLaunching() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println("Abort Launching in node "+ip);
		// De alguna manera necesitar�a saber en cual se ha parado (bien, porque los lanzo en orden) y 
		// luego volver atr�s para cada uno (complicado). Quiz� har�a falta tener una lista de scripts
		// para parar la ejecuci�n (que se creen al tiempo que los otros pero en otra listas unlaunchingScripts).
	}

} // PhysicalProcessingNodeImpl
