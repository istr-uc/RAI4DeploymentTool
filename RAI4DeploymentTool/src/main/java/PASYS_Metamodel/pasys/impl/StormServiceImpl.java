/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.NodeDeploymentConf;
import PASYS_Metamodel.pasys.OrchestrationCluster;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.StormNimbus;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.StormSupervisor;
import PASYS_Metamodel.pasys.StormUI;
import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.ZookeeperService;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getNimbus <em>Nimbus</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormServiceImpl#getUi <em>Ui</em>}</li>
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
	 * The cached value of the '{@link #getNimbus() <em>Nimbus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNimbus()
	 * @generated
	 * @ordered
	 */
	protected StormNimbus nimbus;

	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected StormSupervisor supervisor;

	/**
	 * The cached value of the '{@link #getUi() <em>Ui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUi()
	 * @generated
	 * @ordered
	 */
	protected StormUI ui;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormNimbus getNimbus() {
		return nimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNimbus(StormNimbus newNimbus, NotificationChain msgs) {
		StormNimbus oldNimbus = nimbus;
		nimbus = newNimbus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__NIMBUS, oldNimbus, newNimbus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNimbus(StormNimbus newNimbus) {
		if (newNimbus != nimbus) {
			NotificationChain msgs = null;
			if (nimbus != null)
				msgs = ((InternalEObject)nimbus).eInverseRemove(this, PasysPackage.STORM_NIMBUS__OWNER, StormNimbus.class, msgs);
			if (newNimbus != null)
				msgs = ((InternalEObject)newNimbus).eInverseAdd(this, PasysPackage.STORM_NIMBUS__OWNER, StormNimbus.class, msgs);
			msgs = basicSetNimbus(newNimbus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__NIMBUS, newNimbus, newNimbus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormSupervisor getSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisor(StormSupervisor newSupervisor, NotificationChain msgs) {
		StormSupervisor oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__SUPERVISOR, oldSupervisor, newSupervisor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupervisor(StormSupervisor newSupervisor) {
		if (newSupervisor != supervisor) {
			NotificationChain msgs = null;
			if (supervisor != null)
				msgs = ((InternalEObject)supervisor).eInverseRemove(this, PasysPackage.STORM_SUPERVISOR__OWNER, StormSupervisor.class, msgs);
			if (newSupervisor != null)
				msgs = ((InternalEObject)newSupervisor).eInverseAdd(this, PasysPackage.STORM_SUPERVISOR__OWNER, StormSupervisor.class, msgs);
			msgs = basicSetSupervisor(newSupervisor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__SUPERVISOR, newSupervisor, newSupervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormUI getUi() {
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUi(StormUI newUi, NotificationChain msgs) {
		StormUI oldUi = ui;
		ui = newUi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__UI, oldUi, newUi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUi(StormUI newUi) {
		if (newUi != ui) {
			NotificationChain msgs = null;
			if (ui != null)
				msgs = ((InternalEObject)ui).eInverseRemove(this, PasysPackage.STORM_UI__OWNER, StormUI.class, msgs);
			if (newUi != null)
				msgs = ((InternalEObject)newUi).eInverseAdd(this, PasysPackage.STORM_UI__OWNER, StormUI.class, msgs);
			msgs = basicSetUi(newUi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SERVICE__UI, newUi, newUi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.STORM_SERVICE__NIMBUS:
				if (nimbus != null)
					msgs = ((InternalEObject)nimbus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.STORM_SERVICE__NIMBUS, null, msgs);
				return basicSetNimbus((StormNimbus)otherEnd, msgs);
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				if (supervisor != null)
					msgs = ((InternalEObject)supervisor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.STORM_SERVICE__SUPERVISOR, null, msgs);
				return basicSetSupervisor((StormSupervisor)otherEnd, msgs);
			case PasysPackage.STORM_SERVICE__UI:
				if (ui != null)
					msgs = ((InternalEObject)ui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.STORM_SERVICE__UI, null, msgs);
				return basicSetUi((StormUI)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.STORM_SERVICE__NIMBUS:
				return basicSetNimbus(null, msgs);
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				return basicSetSupervisor(null, msgs);
			case PasysPackage.STORM_SERVICE__UI:
				return basicSetUi(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case PasysPackage.STORM_SERVICE__NIMBUS:
				return getNimbus();
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				return getSupervisor();
			case PasysPackage.STORM_SERVICE__UI:
				return getUi();
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
			case PasysPackage.STORM_SERVICE__NIMBUS:
				setNimbus((StormNimbus)newValue);
				return;
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				setSupervisor((StormSupervisor)newValue);
				return;
			case PasysPackage.STORM_SERVICE__UI:
				setUi((StormUI)newValue);
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
			case PasysPackage.STORM_SERVICE__NIMBUS:
				setNimbus((StormNimbus)null);
				return;
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				setSupervisor((StormSupervisor)null);
				return;
			case PasysPackage.STORM_SERVICE__UI:
				setUi((StormUI)null);
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
			case PasysPackage.STORM_SERVICE__NIMBUS:
				return nimbus != null;
			case PasysPackage.STORM_SERVICE__SUPERVISOR:
				return supervisor != null;
			case PasysPackage.STORM_SERVICE__UI:
				return ui != null;
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
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnOrchestrator() throws ConfigurationException {
		// TODO Auto-generated method stub

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnNode() throws ConfigurationException {
		NodeDeploymentConf conf = (NodeDeploymentConf) getDeploymentConfig();

		try {
			// Config file generation
			DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl("storm.yaml",
					conf.getConfigFolderPath(), generateConfigFileContent(), DeployableComponentType.STORM_NIMBUS);
			
			DeploymentFileDescriptor script = null;
			ProcessingNodeCluster cluster = (ProcessingNodeCluster) nimbus.getHost();
			for (ProcessingNode node:cluster.getNodes()) {
				script = generateScript(DeployableComponentType.STORM_NIMBUS);
				node.addLaunchingScript(script);
				node.addConfigFile(configFile);		
			}
			
			cluster = (ProcessingNodeCluster) supervisor.getHost();
			for (ProcessingNode node:cluster.getNodes()) {
				script = generateScript(DeployableComponentType.STORM_SUPERVISOR);
				node.addLaunchingScript(script);
				node.addConfigFile(configFile);		
			}
			
			cluster = (ProcessingNodeCluster) ui.getHost();
			for (ProcessingNode node:cluster.getNodes()) {
				script = generateScript(DeployableComponentType.STORM_UI);
				node.addLaunchingScript(script);			
				//node.getConfigFiles().add(configFile);		
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
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("storm/storm.yaml")));
		Object object = reader.read();

		// Modify simple properties
		HashMap<String, Object> map = (HashMap) object;   // PAT Antes ponía "HashMap map" solo

		// storm.local.dir
		map.put("storm.local.dir", getLocalDir());

		// ui.port
		map.put("ui.port", getUi().getUiPort());

		// storm.zookeeper.servers
		List<String> zkServers = new LinkedList<String>();
		ZookeeperService zk = getZookeeperConnect();
		ProcessingResourceCluster zkprCluster = zk.getHost();
		if (zkprCluster instanceof ProcessingNodeCluster) {
			ProcessingNodeCluster cluster = (ProcessingNodeCluster) zkprCluster;
			for (ProcessingNode node:cluster.getNodes()) {
				zkServers.add(node.getIp());
			}
			
		} else if (zkprCluster instanceof OrchestrationCluster) {
			//TODO Calcular zkServers
		}	
		map.put("storm.zookeeper.servers", zkServers);
		
		map.put("storm.zookeeper.port",zk.getClientPort());

		

		// Prueba para ver si me lo escribe sin comilla
		if (!(getSupervisor().getSupervisorSlotPorts() == null)) {
			List<String> supervisorSlotPorts = new LinkedList<String>();
			for (String port : getSupervisor().getSupervisorSlotPorts())
				supervisorSlotPorts.add(port);
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
		
		// nimbus.seeds		// TODO Mirar a ver si cuando no es en Nodo sirve
		List<String> nimbusSeeds = new LinkedList<String>();
		ProcessingNodeCluster cluster = (ProcessingNodeCluster) getNimbus().getHost();
		for (ProcessingNode seed : cluster.getNodes()) {
			nimbusSeeds.add(seed.getIp());
		}
				
				
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

	private DeploymentFileDescriptor generateScript(DeployableComponentType type) {
		
		NodeDeploymentConf conf = (NodeDeploymentConf) getDeploymentConfig();
		String scriptContent = "launch " + conf.getArtifactLocator() + "/" + conf.getArtifactName() + " ";
		scriptContent = "cd " + conf.getScriptFolderPath() + "\n"+ scriptContent;
		DeploymentFileDescriptor script = null;
		
		switch (type) {
		case STORM_NIMBUS:
			scriptContent += "nimbus";
			script = new DeploymentFileDescriptorImpl("stormNimbus" + getId() + ".sh", conf.getScriptFolderPath(),
					scriptContent, DeployableComponentType.STORM_NIMBUS);
			break;
		case STORM_SUPERVISOR:
			scriptContent += "supervisor";
			script = new DeploymentFileDescriptorImpl("stormSupervisor" + getId() + ".sh", conf.getScriptFolderPath(),
					scriptContent, DeployableComponentType.STORM_SUPERVISOR);
			break;
		case STORM_UI:
			scriptContent += "ui";
			script = new DeploymentFileDescriptorImpl("stormUI" + getId() + ".sh", conf.getScriptFolderPath(),
					scriptContent, DeployableComponentType.STORM_UI);
			break;
		}
		
		return script;
	}

} // StormServiceImpl
