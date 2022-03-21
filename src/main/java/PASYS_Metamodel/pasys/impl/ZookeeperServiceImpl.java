/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.NodeClusterDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.ZookeeperService;
import deploymentTool.DeploymentToolsUtils;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zookeeper Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getServerId <em>Server Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#isLeaderServers <em>Leader Servers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getInitLimit <em>Init Limit</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getSyncLimit <em>Sync Limit</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getPeerPort <em>Peer Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ZookeeperServiceImpl#getLeaderPort <em>Leader Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZookeeperServiceImpl extends DistributionServiceImpl implements ZookeeperService {
	/**
	 * The default value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected int serverId = SERVER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TICK_TIME_EDEFAULT = 2000L;

	/**
	 * The cached value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickTime()
	 * @generated
	 * @ordered
	 */
	protected long tickTime = TICK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeaderServers() <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaderServers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEADER_SERVERS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLeaderServers() <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaderServers()
	 * @generated
	 * @ordered
	 */
	protected boolean leaderServers = LEADER_SERVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_LIMIT_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitLimit()
	 * @generated
	 * @ordered
	 */
	protected int initLimit = INIT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int SYNC_LIMIT_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLimit()
	 * @generated
	 * @ordered
	 */
	protected int syncLimit = SYNC_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientPort() <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_PORT_EDEFAULT = 2181;

	/**
	 * The cached value of the '{@link #getClientPort() <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected int clientPort = CLIENT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerPort() <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PEER_PORT_EDEFAULT = 2888;

	/**
	 * The cached value of the '{@link #getPeerPort() <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerPort()
	 * @generated
	 * @ordered
	 */
	protected int peerPort = PEER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderPort() <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderPort()
	 * @generated
	 * @ordered
	 */
	protected static final int LEADER_PORT_EDEFAULT = 3888;

	/**
	 * The cached value of the '{@link #getLeaderPort() <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderPort()
	 * @generated
	 * @ordered
	 */
	protected int leaderPort = LEADER_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZookeeperServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.ZOOKEEPER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServerId() {
		return serverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerId(int newServerId) {
		int oldServerId = serverId;
		serverId = newServerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID, oldServerId, serverId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTickTime() {
		return tickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTickTime(long newTickTime) {
		long oldTickTime = tickTime;
		tickTime = newTickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME, oldTickTime, tickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeaderServers() {
		return leaderServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaderServers(boolean newLeaderServers) {
		boolean oldLeaderServers = leaderServers;
		leaderServers = newLeaderServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS, oldLeaderServers, leaderServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInitLimit() {
		return initLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitLimit(int newInitLimit) {
		int oldInitLimit = initLimit;
		initLimit = newInitLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT, oldInitLimit, initLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSyncLimit() {
		return syncLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncLimit(int newSyncLimit) {
		int oldSyncLimit = syncLimit;
		syncLimit = newSyncLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT, oldSyncLimit, syncLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClientPort() {
		return clientPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientPort(int newClientPort) {
		int oldClientPort = clientPort;
		clientPort = newClientPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeerPort() {
		return peerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerPort(int newPeerPort) {
		int oldPeerPort = peerPort;
		peerPort = newPeerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT, oldPeerPort, peerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLeaderPort() {
		return leaderPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaderPort(int newLeaderPort) {
		int oldLeaderPort = leaderPort;
		leaderPort = newLeaderPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT, oldLeaderPort, leaderPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID:
				return getServerId();
			case PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME:
				return getTickTime();
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				return isLeaderServers();
			case PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT:
				return getInitLimit();
			case PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				return getSyncLimit();
			case PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT:
				return getClientPort();
			case PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT:
				return getPeerPort();
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT:
				return getLeaderPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID:
				setServerId((Integer)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME:
				setTickTime((Long)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				setLeaderServers((Boolean)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT:
				setInitLimit((Integer)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				setSyncLimit((Integer)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT:
				setClientPort((Integer)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT:
				setPeerPort((Integer)newValue);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT:
				setLeaderPort((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID:
				setServerId(SERVER_ID_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME:
				setTickTime(TICK_TIME_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				setLeaderServers(LEADER_SERVERS_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT:
				setInitLimit(INIT_LIMIT_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				setSyncLimit(SYNC_LIMIT_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT:
				setClientPort(CLIENT_PORT_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT:
				setPeerPort(PEER_PORT_EDEFAULT);
				return;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT:
				setLeaderPort(LEADER_PORT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID:
				return serverId != SERVER_ID_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME:
				return tickTime != TICK_TIME_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				return leaderServers != LEADER_SERVERS_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT:
				return initLimit != INIT_LIMIT_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				return syncLimit != SYNC_LIMIT_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT:
				return clientPort != CLIENT_PORT_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT:
				return peerPort != PEER_PORT_EDEFAULT;
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT:
				return leaderPort != LEADER_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serverId: ");
		result.append(serverId);
		result.append(", tickTime: ");
		result.append(tickTime);
		result.append(", leaderServers: ");
		result.append(leaderServers);
		result.append(", initLimit: ");
		result.append(initLimit);
		result.append(", syncLimit: ");
		result.append(syncLimit);
		result.append(", clientPort: ");
		result.append(clientPort);
		result.append(", peerPort: ");
		result.append(peerPort);
		result.append(", leaderPort: ");
		result.append(leaderPort);
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
		if (getHost()!=null)
			configureDeploymentOnHost();
		else
			configureDeploymentOnOrchestrator();
	}
	
	private void configureDeploymentOnHost() throws ConfigurationException {
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();
		if (!conf.isIsRunning()) {		
			try {
				// Config File generation
				DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl("zoo" + serverId + ".cfg",
						conf.getConfigFolderPath(), generateConfigFileContent(conf), SystemComponentType.ZOOKEEPER_SERVER);
				
				
				//myid file generation
				DeploymentFileDescriptor idFile = new DeploymentFileDescriptorImpl("myid",
						conf.getDataFolderPath(), Integer.toString(serverId), SystemComponentType.ZOOKEEPER_SERVER);
				
				
				// Script generation
				String scriptContent = conf.getArtifactLocator()+ "/"+conf.getArtifactName()+ " start "+conf.getConfigFolderPath()+"/zoo"+serverId+".cfg";
				scriptContent=DeploymentToolsUtils.scriptHeaders(conf.getScriptFolderPath())+scriptContent;
				scriptContent+="\nsleep 30";
				DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl("zkServer"+getServerId()+".sh",
					conf.getScriptFolderPath(), scriptContent, SystemComponentType.ZOOKEEPER_SERVER);
				
				List<ProcessingNode> nodes = getHost().getNodes();
				for (ProcessingNode node: nodes) {
					node.getLaunchingScripts().add(script);
					node.getConfigFiles().add(configFile);
					node.getConfigFiles().add(idFile);
				}
				
				
			} catch (IOException e) {
				throw new ConfigurationException("No se encuentra el fichero de propiedades de Zookeeper");
			}

		}
	}
	
	private void configureDeploymentOnOrchestrator() {
		//TODO
	}

	private String generateConfigFileContent(NodeClusterDeploymentConf conf) throws IOException, ConfigurationException {
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("zookeeper-server-properties.cfg"));
		
		props.put("clientPort", Integer.toString(clientPort));
		props.put("tickTime", Long.toString(tickTime));
		props.put("initLimit", Integer.toString(initLimit));
		props.put("syncLimit", Integer.toString(syncLimit));
		props.put("dataDir", conf.getDataFolderPath());
		
		if (leaderServers)
			props.put("leaderServers", "yes");
		else
			props.put("leaderServers", "no");
			
		// serverX= host:leaderPort:peerPort
		int i=1;
		for (ProcessingNode node:getHost().getNodes()) {
			//ZookeeperService zk = (ZookeeperService)res;
			props.put("server."+i, node.getIp()+":"+getPeerPort()+":"+getLeaderPort());
			i++;
			
		}

		String configFileContent = DeploymentToolsUtils.propertiesToString(props);
		return configFileContent;
	}
		

} //ZookeeperServiceImpl
