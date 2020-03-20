/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.StormServer;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.ZookeeperServer;

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
 * Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getNimbusSeeds <em>Nimbus Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getDrpcServers <em>Drpc Servers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#getUiPort <em>Ui Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServerImpl#isIsNimbus <em>Is Nimbus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormServerImpl extends SchedulingServerImpl implements StormServer {
	/**
	 * The cached value of the '{@link #getZookeeperConnect() <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZookeeperConnect()
	 * @generated
	 * @ordered
	 */
	protected ResourceCluster zookeeperConnect;
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSupervisorSlotPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supervisorSlotPorts;
	/**
	 * The cached value of the '{@link #getDrpcServers() <em>Drpc Servers</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDrpcServers()
	 * @generated
	 * @ordered
	 */
	protected NodeCluster drpcServers;

	/**
	 * The cached value of the '{@link #getSupervisors() <em>Supervisors</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSupervisors()
	 * @generated
	 * @ordered
	 */
	protected NodeCluster supervisors;

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
	 * The default value of the '{@link #isIsNimbus() <em>Is Nimbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNimbus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NIMBUS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsNimbus() <em>Is Nimbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNimbus()
	 * @generated
	 * @ordered
	 */
	protected boolean isNimbus = IS_NIMBUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StormServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STORM_SERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster getZookeeperConnect() {
		if (zookeeperConnect != null && zookeeperConnect.eIsProxy()) {
			InternalEObject oldZookeeperConnect = (InternalEObject)zookeeperConnect;
			zookeeperConnect = (ResourceCluster)eResolveProxy(oldZookeeperConnect);
			if (zookeeperConnect != oldZookeeperConnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT, oldZookeeperConnect, zookeeperConnect));
			}
		}
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCluster basicGetZookeeperConnect() {
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZookeeperConnect(ResourceCluster newZookeeperConnect) {
		ResourceCluster oldZookeeperConnect = zookeeperConnect;
		zookeeperConnect = newZookeeperConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT, oldZookeeperConnect, zookeeperConnect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__LOCAL_DIR, oldLocalDir, localDir));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVER__NIMBUS_SEEDS, oldNimbusSeeds, nimbusSeeds));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNimbusSeeds(NodeCluster newNimbusSeeds) {
		NodeCluster oldNimbusSeeds = nimbusSeeds;
		nimbusSeeds = newNimbusSeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__NIMBUS_SEEDS, oldNimbusSeeds, nimbusSeeds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupervisorSlotPorts() {
		if (supervisorSlotPorts == null) {
			supervisorSlotPorts = new EDataTypeUniqueEList<Integer>(Integer.class, this, PasysPackage.STORM_SERVER__SUPERVISOR_SLOT_PORTS);
		}
		return supervisorSlotPorts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster getDrpcServers() {
		if (drpcServers != null && drpcServers.eIsProxy()) {
			InternalEObject oldDrpcServers = (InternalEObject)drpcServers;
			drpcServers = (NodeCluster)eResolveProxy(oldDrpcServers);
			if (drpcServers != oldDrpcServers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVER__DRPC_SERVERS, oldDrpcServers, drpcServers));
			}
		}
		return drpcServers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCluster basicGetDrpcServers() {
		return drpcServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrpcServers(NodeCluster newDrpcServers) {
		NodeCluster oldDrpcServers = drpcServers;
		drpcServers = newDrpcServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__DRPC_SERVERS, oldDrpcServers, drpcServers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster getSupervisors() {
		if (supervisors != null && supervisors.eIsProxy()) {
			InternalEObject oldSupervisors = (InternalEObject)supervisors;
			supervisors = (NodeCluster)eResolveProxy(oldSupervisors);
			if (supervisors != oldSupervisors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SERVER__SUPERVISORS, oldSupervisors, supervisors));
			}
		}
		return supervisors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCluster basicGetSupervisors() {
		return supervisors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisors(NodeCluster newSupervisors) {
		NodeCluster oldSupervisors = supervisors;
		supervisors = newSupervisors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__SUPERVISORS, oldSupervisors, supervisors));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__UI_PORT, oldUiPort, uiPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNimbus() {
		return isNimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNimbus(boolean newIsNimbus) {
		boolean oldIsNimbus = isNimbus;
		isNimbus = newIsNimbus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVER__IS_NIMBUS, oldIsNimbus, isNimbus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT:
				if (resolve) return getZookeeperConnect();
				return basicGetZookeeperConnect();
			case PasysPackage.STORM_SERVER__LOCAL_DIR:
				return getLocalDir();
			case PasysPackage.STORM_SERVER__NIMBUS_SEEDS:
				if (resolve) return getNimbusSeeds();
				return basicGetNimbusSeeds();
			case PasysPackage.STORM_SERVER__SUPERVISOR_SLOT_PORTS:
				return getSupervisorSlotPorts();
			case PasysPackage.STORM_SERVER__DRPC_SERVERS:
				if (resolve) return getDrpcServers();
				return basicGetDrpcServers();
			case PasysPackage.STORM_SERVER__SUPERVISORS:
				if (resolve) return getSupervisors();
				return basicGetSupervisors();
			case PasysPackage.STORM_SERVER__UI_PORT:
				return getUiPort();
			case PasysPackage.STORM_SERVER__IS_NIMBUS:
				return isIsNimbus();
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
			case PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT:
				setZookeeperConnect((ResourceCluster)newValue);
				return;
			case PasysPackage.STORM_SERVER__LOCAL_DIR:
				setLocalDir((String)newValue);
				return;
			case PasysPackage.STORM_SERVER__NIMBUS_SEEDS:
				setNimbusSeeds((NodeCluster)newValue);
				return;
			case PasysPackage.STORM_SERVER__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				getSupervisorSlotPorts().addAll((Collection<? extends Integer>)newValue);
				return;
			case PasysPackage.STORM_SERVER__DRPC_SERVERS:
				setDrpcServers((NodeCluster)newValue);
				return;
			case PasysPackage.STORM_SERVER__SUPERVISORS:
				setSupervisors((NodeCluster)newValue);
				return;
			case PasysPackage.STORM_SERVER__UI_PORT:
				setUiPort((Integer)newValue);
				return;
			case PasysPackage.STORM_SERVER__IS_NIMBUS:
				setIsNimbus((Boolean)newValue);
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
			case PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT:
				setZookeeperConnect((ResourceCluster)null);
				return;
			case PasysPackage.STORM_SERVER__LOCAL_DIR:
				setLocalDir(LOCAL_DIR_EDEFAULT);
				return;
			case PasysPackage.STORM_SERVER__NIMBUS_SEEDS:
				setNimbusSeeds((NodeCluster)null);
				return;
			case PasysPackage.STORM_SERVER__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				return;
			case PasysPackage.STORM_SERVER__DRPC_SERVERS:
				setDrpcServers((NodeCluster)null);
				return;
			case PasysPackage.STORM_SERVER__SUPERVISORS:
				setSupervisors((NodeCluster)null);
				return;
			case PasysPackage.STORM_SERVER__UI_PORT:
				setUiPort(UI_PORT_EDEFAULT);
				return;
			case PasysPackage.STORM_SERVER__IS_NIMBUS:
				setIsNimbus(IS_NIMBUS_EDEFAULT);
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
			case PasysPackage.STORM_SERVER__ZOOKEEPER_CONNECT:
				return zookeeperConnect != null;
			case PasysPackage.STORM_SERVER__LOCAL_DIR:
				return LOCAL_DIR_EDEFAULT == null ? localDir != null : !LOCAL_DIR_EDEFAULT.equals(localDir);
			case PasysPackage.STORM_SERVER__NIMBUS_SEEDS:
				return nimbusSeeds != null;
			case PasysPackage.STORM_SERVER__SUPERVISOR_SLOT_PORTS:
				return supervisorSlotPorts != null && !supervisorSlotPorts.isEmpty();
			case PasysPackage.STORM_SERVER__DRPC_SERVERS:
				return drpcServers != null;
			case PasysPackage.STORM_SERVER__SUPERVISORS:
				return supervisors != null;
			case PasysPackage.STORM_SERVER__UI_PORT:
				return uiPort != UI_PORT_EDEFAULT;
			case PasysPackage.STORM_SERVER__IS_NIMBUS:
				return isNimbus != IS_NIMBUS_EDEFAULT;
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
		result.append(" (localDir: ");
		result.append(localDir);
		result.append(", supervisorSlotPorts: ");
		result.append(supervisorSlotPorts);
		result.append(", uiPort: ");
		result.append(uiPort);
		result.append(", isNimbus: ");
		result.append(isNimbus);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<ProcessingNode> getHosts() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void deploy() throws ConfigurationException {
		System.out.println();

		try {
			// Config file generation
			DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl("storm.yaml", configFolderPath,
					generateConfigFileContent(), SystemComponentType.STORM_NIMBUS);
			getHost().getConfigFiles().add(configFile);
			
			// Script generation
			if (host!=null) {
				DeploymentFileDescriptor script = generateScript(this.isNimbus);
				getHost().getLaunchingScripts().add(script);
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
		HashMap map = (HashMap) object;

		// storm.local.dir
		map.put("storm.local.dir", getLocalDir());

		// ui.port
		map.put("ui.port", getUiPort());

		// storm.zookeeper.servers
		List<String> zkServers = new LinkedList<String>();
		ZookeeperServer zk = null;
		for (PlatformResource rsrc : getZookeeperConnect().getResources()) {
			if (!(rsrc instanceof ZookeeperServer))
				throw new ConfigurationException(
						"ZookeeperConnect atribute of StormServer " + getName() + " is not correct");
			zk = (ZookeeperServer) rsrc;
			zkServers.add(zk.getHost().getIp());
		}

		map.put("storm.zookeeper.servers", zkServers);
		map.put("storm.zookeeper.port", zk.getClientPort());

		// nimbus.seeds		
		List<ProcessingNode> seeds = new LinkedList<ProcessingNode>();

		for (PlatformResource rsrc : getNimbusSeeds().getResources()) {
			ProcessingNode node = (ProcessingNode)rsrc;
			seeds.add(node);
		}
		List<String> nimbusSeeds = new LinkedList<String>();
		for (ProcessingNode seed:seeds) {
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
		for (int i=0; i<seeds.size() ;i++){
			nseeds += "\"" +seeds.get(i).getIp() + "\"";
			if(i<(seeds.size()-1)) {
				nseeds += ",";
			}
		}
		nseeds += "]";
		configFileContent += nseeds;
		return configFileContent;
	}
	
	private DeploymentFileDescriptor generateScript(boolean isNimbus) {
		String scriptContent = "launch "+ this.artifactLocator + "/" + this.artifactName+" ";
		if (isNimbus)
			scriptContent +="nimbus";
	    else
			scriptContent += "supervisor";
		scriptContent = "cd " + getScriptFolderPath() + "\n" + scriptContent;
		DeploymentFileDescriptor script = null;
		if (isNimbus) {
			script = new DeploymentFileDescriptorImpl("stormNimbus" + getId() + ".sh",
				this.getScriptFolderPath(), scriptContent, SystemComponentType.STORM_NIMBUS);
		} else {
			script = new DeploymentFileDescriptorImpl("stormSupervisor" + getId() + ".sh", this.getScriptFolderPath(),
					scriptContent, SystemComponentType.STORM_SUPERVISOR);
		}
		return script;
	}

} // StormServerImpl
