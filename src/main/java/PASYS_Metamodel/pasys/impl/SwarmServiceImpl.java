/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SwarmService;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swarm Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SwarmServiceImpl extends OrchestrationServiceImpl implements SwarmService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwarmServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SWARM_SERVICE;
	}

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		// TODO
		
			// Access deployConfig => Add service to stack file
		
		
		/*try {
		 * 
		 * DeploymentFileDescriptor stackFile = new DeploymentFileDescriptorImpl(stack.getName() + ".yaml", configFolderPath,
		 * generateStackFileContent(stack), SystemComponentType.DOCKER_STACK);
		 * getHost().getConfigFiles().add(stackFile);
		 *
		 * 
		 * String 
		 * scriptContent="docker stack deploy -c "+configFolderPath+"/"+stack.getName()+".yaml"+stack.getName(); 
		 * DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl("deploy"+stack.getName() + ".sh",
		 * scriptFolderPath, scriptContent, SystemComponentType.DOCKER_STACK);
		 * getHost().getLaunchingScripts().add(script); }
		 * 
		 * } catch (YamlException e) { throw new
		 * ConfigurationException("Error parsing yaml file"); } }
		 */
		
	}
	
	
	//private String generateStackFileContent() throws YamlException, ConfigurationException {
		/*
		 * YamlReader reader = new YamlReader( new
		 * InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(
		 * "stack.yaml"))); Object object = reader.read();
		 * 
		 * // Modify simple properties HashMap map = (HashMap) object;
		 * map.put("version", stack.getVersion());
		 * 
		 * // TODO Esto así no es ArrayList<String> services = new ArrayList<String>();
		 * for (Service serv:stack.getServices()) { services.add(serv.getName()); }
		 * map.put("services", services);
		 * 
		 * StringWriter output = new StringWriter(); YamlWriter writer = new
		 * YamlWriter(output); writer.getConfig().writeConfig.setWriteRootTags(false);
		 * writer.getConfig().writeConfig.setWriteClassname(YamlConfig.WriteClassName.
		 * NEVER);
		 * 
		 * writer.write(object); writer.close(); String configFileContent =
		 * output.toString(); return configFileContent;
		 */
	//}
} //SwarmServiceImpl
