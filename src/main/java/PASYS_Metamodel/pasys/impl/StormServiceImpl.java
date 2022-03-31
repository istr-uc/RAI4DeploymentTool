/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeClusterDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.ZookeeperService;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Storm
 * Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getNimbusSeeds <em>Nimbus Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getUiPort <em>Ui Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormServiceImpl extends SchedulingServiceImpl implements StormService {
	/**
	 * The cached value of the '{@link #getZookeeperConnect() <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZookeeperConnect()
	 * @generated
	 * @ordered
	 */
	protected ZookeeperService zookeeperConnect;

	/**
	 * The default value of the '{@link #getLocalDir() <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocalDir()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DIR_EDEFAULT = "storm-local";

	/**
	 * The cached value of the '{@link #getLocalDir() <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLocalDir()
	 * @generated
	 * @ordered
	 */
	protected String localDir = LOCAL_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNimbusSeeds() <em>Nimbus Seeds</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNimbusSeeds()
	 * @generated
	 * @ordered
	 */
	protected NodeCluster nimbusSeeds;

	/**
	 * The cached value of the '{@link #getSupervisorSlotPorts() <em>Supervisor Slot Ports</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSupervisorSlotPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supervisorSlotPorts;

	/**
	 * The default value of the '{@link #getUiPort() <em>Ui Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUiPort()
	 * @generated
	 * @ordered
	 */
	protected static final int UI_PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getUiPort() <em>Ui Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUiPort()
	 * @generated
	 * @ordered
	 */
	protected int uiPort = UI_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StormServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STORM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZookeeperService getZookeeperConnect() {
		if (zookeeperConnect != null && zookeeperConnect.eIsProxy()) {
			InternalEObject oldZookeeperConnect = (InternalEObject)zookeeperConnect;
			zookeeperConnect = (ZookeeperService)eResolveProxy(oldZookeeperConnect);
			if (zookeeperConnect != oldZookeeperConnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT, oldZookeeperConnect, zookeeperConnect));
			}
		}
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ZookeeperService basicGetZookeeperConnect() {
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZookeeperConnect(ZookeeperService newZookeeperConnect) {
		ZookeeperService oldZookeeperConnect = zookeeperConnect;
		zookeeperConnect = newZookeeperConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT, oldZookeeperConnect, zookeeperConnect));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalDir() {
		return localDir;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDir(String newLocalDir) {
		String oldLocalDir = localDir;
		localDir = newLocalDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__LOCAL_DIR, oldLocalDir, localDir));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster getNimbusSeeds() {
		if (nimbusSeeds != null && nimbusSeeds.eIsProxy()) {
			InternalEObject oldNimbusSeeds = (InternalEObject)nimbusSeeds;
			nimbusSeeds = (NodeCluster)eResolveProxy(oldNimbusSeeds);
			if (nimbusSeeds != oldNimbusSeeds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVICE__NIMBUS_SEEDS, oldNimbusSeeds, nimbusSeeds));
			}
		}
		return nimbusSeeds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCluster basicGetNimbusSeeds() {
		return nimbusSeeds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNimbusSeeds(NodeCluster newNimbusSeeds) {
		NodeCluster oldNimbusSeeds = nimbusSeeds;
		nimbusSeeds = newNimbusSeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__NIMBUS_SEEDS, oldNimbusSeeds, nimbusSeeds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupervisorSlotPorts() {
		if (supervisorSlotPorts == null) {
			supervisorSlotPorts = new EDataTypeUniqueEList<Integer>(Integer.class, this, PasysPackage.STORM_SERVICE__SUPERVISOR_SLOT_PORTS);
		}
		return supervisorSlotPorts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUiPort() {
		return uiPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUiPort(int newUiPort) {
		int oldUiPort = uiPort;
		uiPort = newUiPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__UI_PORT, oldUiPort, uiPort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT:
				if (resolve) return getZookeeperConnect();
				return basicGetZookeeperConnect();
			case PasysPackage.STORM_SERVICE__LOCAL_DIR:
				return getLocalDir();
			case PasysPackage.STORM_SERVICE__NIMBUS_SEEDS:
				if (resolve) return getNimbusSeeds();
				return basicGetNimbusSeeds();
			case PasysPackage.STORM_SERVICE__SUPERVISOR_SLOT_PORTS:
				return getSupervisorSlotPorts();
			case PasysPackage.STORM_SERVICE__UI_PORT:
				return getUiPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT:
				setZookeeperConnect((ZookeeperService)newValue);
				return;
			case PasysPackage.STORM_SERVICE__LOCAL_DIR:
				setLocalDir((String)newValue);
				return;
			case PasysPackage.STORM_SERVICE__NIMBUS_SEEDS:
				setNimbusSeeds((NodeCluster)newValue);
				return;
			case PasysPackage.STORM_SERVICE__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				getSupervisorSlotPorts().addAll((Collection<? extends Integer>)newValue);
				return;
			case PasysPackage.STORM_SERVICE__UI_PORT:
				setUiPort((Integer)newValue);
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
			case PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT:
				setZookeeperConnect((ZookeeperService)null);
				return;
			case PasysPackage.STORM_SERVICE__LOCAL_DIR:
				setLocalDir(LOCAL_DIR_EDEFAULT);
				return;
			case PasysPackage.STORM_SERVICE__NIMBUS_SEEDS:
				setNimbusSeeds((NodeCluster)null);
				return;
			case PasysPackage.STORM_SERVICE__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				return;
			case PasysPackage.STORM_SERVICE__UI_PORT:
				setUiPort(UI_PORT_EDEFAULT);
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
			case PasysPackage.STORM_SERVICE__ZOOKEEPER_CONNECT:
				return zookeeperConnect != null;
			case PasysPackage.STORM_SERVICE__LOCAL_DIR:
				return LOCAL_DIR_EDEFAULT == null ? localDir != null : !LOCAL_DIR_EDEFAULT.equals(localDir);
			case PasysPackage.STORM_SERVICE__NIMBUS_SEEDS:
				return nimbusSeeds != null;
			case PasysPackage.STORM_SERVICE__SUPERVISOR_SLOT_PORTS:
				return supervisorSlotPorts != null && !supervisorSlotPorts.isEmpty();
			case PasysPackage.STORM_SERVICE__UI_PORT:
				return uiPort != UI_PORT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (localDir: ");
		result.append(localDir);
		result.append(", supervisorSlotPorts: ");
		result.append(supervisorSlotPorts);
		result.append(", uiPort: ");
		result.append(uiPort);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		super.configureDeployment();
		if (getHost() != null)
			configureDeploymentOnHost();
		else
			configureDeploymentOnOrchestrator();
	}

	private void configureDeploymentOnOrchestrator() {
		// TODO Auto-generated method stub

	}

	private void configureDeploymentOnHost() throws ConfigurationException {
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();

		try {
			// Config file generation
			DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl("storm.yaml",
					conf.getConfigFolderPath(), generateConfigFileContent(), SystemComponentType.STORM_NIMBUS);
			for (ProcessingNode node: getHost().getNodes()) {
				
				DeploymentFileDescriptor script = null;
				if (getNimbusSeeds().getNodes().contains(node))
					script = generateScript(true);
				else 
					script = generateScript(false);
				node.getLaunchingScripts().add(script);
				node.getConfigFiles().add(configFile);				
			}

		} catch (YamlException e) {
			throw new ConfigurationException("No se ha podido crear el fichero de propiedades Storm");
			
		} catch (ClassCastException e) {
			throw new ConfigurationException("La configuracion del Storm Server no es correcta");
		}
	}

	private String generateConfigFileContent() throws YamlException, ConfigurationException {
		// reader = new YamlReader(new FileReader(new
		// File(this.getClass().getClassLoader().getResourceAsStream("cassandra.yaml"))));
		YamlReader reader = new YamlReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("storm.yaml")));
		Object object = reader.read();

		// Modify simple properties
		HashMap<String, Object> map = (HashMap) object;   // PAT Antes ponía "HashMap map" solo

		// storm.local.dir
		map.put("storm.local.dir", getLocalDir());

		// ui.port
		map.put("ui.port", getUiPort());

		// storm.zookeeper.servers
		List<String> zkServers = new LinkedList<String>();
		ZookeeperService zk = getZookeeperConnect();
		for (ProcessingNode node : zk.getHost().getNodes()) {
			zkServers.add(node.getIp());
		}

		map.put("storm.zookeeper.servers", zkServers);
		map.put("storm.zookeeper.port",zk.getClientPort());

		// nimbus.seeds		
		List<String> nimbusSeeds = new LinkedList<String>();
		for (ProcessingNode seed : getNimbusSeeds().getNodes()) {
			nimbusSeeds.add(seed.getIp());
		}

		// Prueba para ver si me lo escribe sin comilla
		if (!(getSupervisorSlotPorts() == null)) {
			List<String> supervisorSlotPorts = new LinkedList<String>();
			for (Integer port : getSupervisorSlotPorts())
				supervisorSlotPorts.add(Integer.toString(port));

			map.put("supervisor.slots.ports", supervisorSlotPorts);
		}

		StringWriter output = new StringWriter();
		YamlWriter writer = new YamlWriter(output);
		writer.getConfig().writeConfig.setWriteRootTags(false);
		writer.getConfig().writeConfig.setWriteClassname(YamlConfig.WriteClassName.NEVER);

		writer.write(object);
		writer.close();
		String configFileContent = output.toString();

		// Creando nimbus.seed manualmente
		String nseeds = "nimbus.seeds: [";
		for (int i = 0; i < nimbusSeeds.size(); i++) {
			nseeds += "\"" + nimbusSeeds.get(i) + "\"";
			if (i < (nimbusSeeds.size() - 1)) {
				nseeds += ",";
			}
		}
		nseeds += "]";
		configFileContent += nseeds;
		return configFileContent;
	}

	private DeploymentFileDescriptor generateScript(boolean isNimbus) {
		
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();
		String scriptContent = "launch " + conf.getArtifactLocator() + "/" + conf.getArtifactName() + " ";
		if (isNimbus)
			scriptContent += "nimbus";
		else
			scriptContent += "supervisor";
		scriptContent = "cd " + conf.getScriptFolderPath() + "\n" + scriptContent;
		DeploymentFileDescriptor script = null;
		if (isNimbus) {
			script = new DeploymentFileDescriptorImpl("stormNimbus" + getId() + ".sh", conf.getScriptFolderPath(),
					scriptContent, SystemComponentType.STORM_NIMBUS);
		} else {
			script = new DeploymentFileDescriptorImpl("stormSupervisor" + getId() + ".sh", conf.getScriptFolderPath(),
					scriptContent, SystemComponentType.STORM_SUPERVISOR);
		}
		return script;
	}

} // StormServiceImpl
