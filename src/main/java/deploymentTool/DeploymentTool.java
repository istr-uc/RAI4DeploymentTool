package deploymentTool;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.PasysPackage;

/**
 * MDE tool for the configuration, deployment and launching of applications in
 * P3forI4Apache platforms
 * 
 * @author ISTR
 *
 */
public class DeploymentTool {

	public static void main(String[] args) {

		String pabmPath = args[0];

		ResourceSet resourceSet = new ResourceSetImpl();

		Map packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(PasysPackage.eNS_URI, PasysPackage.eINSTANCE);

		Map<String, Object> extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());

		URI pabmUri = URI.createFileURI(pabmPath);
		Resource pabmResource = (Resource) resourceSet.createResource(pabmUri);
		try {
			pabmResource.load(null);
			EcoreUtil.resolveAll(pabmResource);

			PASYS_Metamodel.pasys.ComputationalSystem system = (PASYS_Metamodel.pasys.ComputationalSystem) pabmResource
					.getContents().get(0);

			// Testing purposes
			/*
			 * for (PASYS_Metamodel.pasys.SystemElement elem :
			 * system.getOwnedElements()) { System.out.println(elem.getId() +
			 * "  " + elem.getName()); }
			 */

			// Create temp Directory
			// Creamos el fichero
			File tempDir= new File(DeploymentToolsUtils.TEMP_DIR);
			tempDir.mkdir();
			
			// Triggers the deployment and launching process
			system.deployAndLaunch();
			
			// Borra todos los ficheros del directorio
			//File temp = new File(DeploymentToolsUtils.TEMP_DIR);
			//DeploymentToolsUtils.deleteFile(tempDir);
			
			System.out.println("System deployed");
			

			// Testing purposes 

			for (PASYS_Metamodel.pasys.SystemElement elem : system.getOwnedElements()) {
				if (elem instanceof PASYS_Metamodel.pasys.impl.ProcessingNodeImpl) {
					PASYS_Metamodel.pasys.impl.ProcessingNodeImpl node = (PASYS_Metamodel.pasys.impl.ProcessingNodeImpl) elem;
					muestraNodo(node);
				}
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void muestraNodo(PASYS_Metamodel.pasys.impl.ProcessingNodeImpl node) {
		System.out.println("%%%%%    " + node.getName() + "    %%%%%%");
		/*
		 * System.out.println(node.getPropertyConfigData().get("hostID"));
		 * System.out.println(node.getPropertyConfigData().get("IP"));
		 * System.out.println(node.getPropertyConfigData().get("speedFactor"));
		 * System.out.println();
		 */

		System.out.println("% Config files %");
		for (PASYS_Metamodel.pasys.DeploymentFileDescriptor f : node.getConfigFiles()) {
			System.out.println();
			System.out.println("File: " + f.getFilePath() + "/" + f.getFileName());
			// System.out.println("File Content:");
			System.out.println(f.getFileContent());
		}

		
		System.out.println();
		System.out.println("% Launching scripts %");
		for (DeploymentFileDescriptor f : node.getLaunchingScripts()) {
			System.out.println();
			System.out.println("File: " + f.getFilePath() + "/" + f.getFileName());
			// System.out.println("File Content:");
			System.out.println(f.getFileContent());
		}

		System.out.println();
		System.out.println("% Code Files %");
		for (ArtifactDescriptor f : node.getCodeFiles()) {
			System.out.println();
			System.out.println("File: " + f.getFilePath() + "/" + f.getFileName());
			System.out.println("File local path: " + f.getFileLocator());
		}

	}

}
