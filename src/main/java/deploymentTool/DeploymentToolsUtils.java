package deploymentTool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;

public class DeploymentToolsUtils {
	// Windows
	// public static final String TEMP_DIR = System.getProperty("user.dir")+"\\temp";
	
	// Linux
	public static final String TEMP_DIR = System.getProperty("user.dir")+"/tempPRECON";

	public static void createFile(String fileContent, String fileName) {
		File file = new File(fileName);
		BufferedWriter output =null;
		try {
			output = new BufferedWriter(new FileWriter(file));
			output.write(fileContent);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String propertiesToString(Properties prop) throws IOException {
		StringWriter writer = new StringWriter();
		  prop.store(writer, null);
		  String result = writer.getBuffer().toString();
		 return result.replace("\\:", ":");
	}
	
	
	public static void deleteFile(File element) {
	    if (element.isDirectory()) {
	        for (File sub : element.listFiles()) {
	            deleteFile(sub);
	        }
	    }
	    element.delete();
	}
	
	public static String scriptHeaders(String path) {
		return "#!/bin/bash\n" + "cd "+path+"\n";
	}
	
	public static String argumentsToString(EList<String> arguments) {
		String result = "";
		for (String s : arguments) {
			result += " " + s;
		}
		return result;
	}
	
	

}

