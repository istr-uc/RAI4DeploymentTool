/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraService;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DataCenter;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.NodeCluster;
import PASYS_Metamodel.pasys.NodeClusterDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.Rack;
import PASYS_Metamodel.pasys.SystemComponentType;
import deploymentTool.DeploymentToolsUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Cassandra Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getNumTokens <em>Num Tokens</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getSeeds <em>Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getSeedProviderClass <em>Seed Provider Class</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getEndpointSnitch <em>Endpoint Snitch</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getNativeTransportPort <em>Native Transport Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getDataCenters <em>Data Centers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CassandraServiceImpl extends PersistenceServiceImpl implements CassandraService {
	/**
	 * The default value of the '{@link #getNumTokens() <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNumTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_TOKENS_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getNumTokens() <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNumTokens()
	 * @generated
	 * @ordered
	 */
	protected int numTokens = NUM_TOKENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeeds() <em>Seeds</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSeeds()
	 * @generated
	 * @ordered
	 */
	protected NodeCluster seeds;

	/**
	 * The default value of the '{@link #getSeedProviderClass() <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeedProviderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_PROVIDER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeedProviderClass() <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeedProviderClass()
	 * @generated
	 * @ordered
	 */
	protected String seedProviderClass = SEED_PROVIDER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointSnitch() <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndpointSnitch()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_SNITCH_EDEFAULT = "SimpleSnitch";

	/**
	 * The cached value of the '{@link #getEndpointSnitch() <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndpointSnitch()
	 * @generated
	 * @ordered
	 */
	protected String endpointSnitch = ENDPOINT_SNITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFileDir() <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFileDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FILE_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFileDir() <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFileDir()
	 * @generated
	 * @ordered
	 */
	protected String dataFileDir = DATA_FILE_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeTransportPort() <em>Native
	 * Transport Port</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getNativeTransportPort()
	 * @generated
	 * @ordered
	 */
	protected static final int NATIVE_TRANSPORT_PORT_EDEFAULT = 9042;

	/**
	 * The cached value of the '{@link #getNativeTransportPort() <em>Native
	 * Transport Port</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getNativeTransportPort()
	 * @generated
	 * @ordered
	 */
	protected int nativeTransportPort = NATIVE_TRANSPORT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoBootstrap() <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAutoBootstrap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_BOOTSTRAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoBootstrap() <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAutoBootstrap()
	 * @generated
	 * @ordered
	 */
	protected boolean autoBootstrap = AUTO_BOOTSTRAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCqlSchemas() <em>Cql Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCqlSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDescriptor> cqlSchemas;

	/**
	 * The cached value of the '{@link #getDataCenters() <em>Data Centers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataCenters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataCenter> dataCenters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CassandraServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.CASSANDRA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumTokens() {
		return numTokens;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumTokens(int newNumTokens) {
		int oldNumTokens = numTokens;
		numTokens = newNumTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS, oldNumTokens, numTokens));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeCluster getSeeds() {
		if (seeds != null && seeds.eIsProxy()) {
			InternalEObject oldSeeds = (InternalEObject)seeds;
			seeds = (NodeCluster)eResolveProxy(oldSeeds);
			if (seeds != oldSeeds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__SEEDS, oldSeeds, seeds));
			}
		}
		return seeds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCluster basicGetSeeds() {
		return seeds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeeds(NodeCluster newSeeds) {
		NodeCluster oldSeeds = seeds;
		seeds = newSeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__SEEDS, oldSeeds, seeds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeedProviderClass() {
		return seedProviderClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeedProviderClass(String newSeedProviderClass) {
		String oldSeedProviderClass = seedProviderClass;
		seedProviderClass = newSeedProviderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS, oldSeedProviderClass, seedProviderClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointSnitch() {
		return endpointSnitch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointSnitch(String newEndpointSnitch) {
		String oldEndpointSnitch = endpointSnitch;
		endpointSnitch = newEndpointSnitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH, oldEndpointSnitch, endpointSnitch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFileDir() {
		return dataFileDir;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFileDir(String newDataFileDir) {
		String oldDataFileDir = dataFileDir;
		dataFileDir = newDataFileDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR, oldDataFileDir, dataFileDir));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNativeTransportPort() {
		return nativeTransportPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNativeTransportPort(int newNativeTransportPort) {
		int oldNativeTransportPort = nativeTransportPort;
		nativeTransportPort = newNativeTransportPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT, oldNativeTransportPort, nativeTransportPort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoBootstrap() {
		return autoBootstrap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoBootstrap(boolean newAutoBootstrap) {
		boolean oldAutoBootstrap = autoBootstrap;
		autoBootstrap = newAutoBootstrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP, oldAutoBootstrap, autoBootstrap));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FileDescriptor> getCqlSchemas() {
		if (cqlSchemas == null) {
			cqlSchemas = new EObjectContainmentEList<FileDescriptor>(FileDescriptor.class, this, PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS);
		}
		return cqlSchemas;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataCenter> getDataCenters() {
		if (dataCenters == null) {
			dataCenters = new EObjectContainmentEList<DataCenter>(DataCenter.class, this, PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS);
		}
		return dataCenters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return ((InternalEList<?>)getCqlSchemas()).basicRemove(otherEnd, msgs);
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
				return ((InternalEList<?>)getDataCenters()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				return getNumTokens();
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				if (resolve) return getSeeds();
				return basicGetSeeds();
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				return getSeedProviderClass();
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				return getEndpointSnitch();
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				return getDataFileDir();
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				return getNativeTransportPort();
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				return isAutoBootstrap();
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return getCqlSchemas();
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
				return getDataCenters();
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				setNumTokens((Integer)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				setSeeds((NodeCluster)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				setSeedProviderClass((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				setEndpointSnitch((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				setDataFileDir((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				setNativeTransportPort((Integer)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				setAutoBootstrap((Boolean)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				getCqlSchemas().clear();
				getCqlSchemas().addAll((Collection<? extends FileDescriptor>)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
				getDataCenters().clear();
				getDataCenters().addAll((Collection<? extends DataCenter>)newValue);
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				setNumTokens(NUM_TOKENS_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				setSeeds((NodeCluster)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				setSeedProviderClass(SEED_PROVIDER_CLASS_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				setEndpointSnitch(ENDPOINT_SNITCH_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				setDataFileDir(DATA_FILE_DIR_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				setNativeTransportPort(NATIVE_TRANSPORT_PORT_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				setAutoBootstrap(AUTO_BOOTSTRAP_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				getCqlSchemas().clear();
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
				getDataCenters().clear();
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				return numTokens != NUM_TOKENS_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				return seeds != null;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				return SEED_PROVIDER_CLASS_EDEFAULT == null ? seedProviderClass != null : !SEED_PROVIDER_CLASS_EDEFAULT.equals(seedProviderClass);
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				return ENDPOINT_SNITCH_EDEFAULT == null ? endpointSnitch != null : !ENDPOINT_SNITCH_EDEFAULT.equals(endpointSnitch);
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				return DATA_FILE_DIR_EDEFAULT == null ? dataFileDir != null : !DATA_FILE_DIR_EDEFAULT.equals(dataFileDir);
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				return nativeTransportPort != NATIVE_TRANSPORT_PORT_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				return autoBootstrap != AUTO_BOOTSTRAP_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return cqlSchemas != null && !cqlSchemas.isEmpty();
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
				return dataCenters != null && !dataCenters.isEmpty();
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
		result.append(" (numTokens: ");
		result.append(numTokens);
		result.append(", seedProviderClass: ");
		result.append(seedProviderClass);
		result.append(", endpointSnitch: ");
		result.append(endpointSnitch);
		result.append(", dataFileDir: ");
		result.append(dataFileDir);
		result.append(", nativeTransportPort: ");
		result.append(nativeTransportPort);
		result.append(", autoBootstrap: ");
		result.append(autoBootstrap);
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
		if (getHost() != null)
			configureDeploymentOnHost();
		else
			configureDeploymentOnOrchestrator();
	}

	private void configureDeploymentOnOrchestrator() {
		
		/*} else if (container!=null) {
		String scriptContent="";
		for (FileDescriptor cqlSchema : getCqlSchemas()) {
			int i =0;
			scriptContent = "docker exec $(docker ps | grep cassandra | awk {print $1}) cqlsh " + (getListenAddress()).getIp() + " -f " + scriptFolderPath + "/"
					+ cqlSchema.getFileName();						
			script = new DeploymentFileDescriptorImpl(
					"cassandraSchema"+i + ".sh", this.getScriptFolderPath(), 
					scriptContent, SystemComponentType.CASSANDRA_SCHEMA);
			getHost().getLaunchingScripts().add(script);
			i++;
		}*/

	}

	private void configureDeploymentOnHost() throws ConfigurationException {
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();
		String seedsValue= getSeedsValue();
		Map<String, String> rackConf = rackConfiguration();
		if (!conf.isIsRunning()) {		
			try {
				//SystemComponentType type = SystemComponentType.CASSANDRA_SERVER;
				//if (isSeed)
					//type = SystemComponentType.CASSANDRA_SERVER_SEED;

				for (ProcessingNode node: getHost().getNodes()) {
					SystemComponentType type = null;
					if (getSeeds().getNodes().contains(node))
						type = SystemComponentType.CASSANDRA_SERVER_SEED;
					else
						type = SystemComponentType.CASSANDRA_SERVER;
					// Config file content generation
					String configFileContent = generateConfigFileContent(node, seedsValue);
					String configFileName = "cassandra" + id + ".yaml";
					DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl(configFileName, 
							conf.getConfigFolderPath(),configFileContent, type);
					node.addConfigFile(configFile);
				
					// Rack configuration file generation
					// String rackProps = "dc=" + getDataCenter().getName() + "\n";
					// rackProps += "rack=" + getRack().getName();
					DeploymentFileDescriptor rackConfFile = new DeploymentFileDescriptorImpl(
							"cassandra-rackcd.properties", conf.getConfigFolderPath(), rackConf.get(node.getIp()), type);
					node.addConfigFile(rackConfFile);
					
					// Artifacts to move to the corresponding nodes
					for (FileDescriptor cqlFile : getCqlSchemas()) {
						ArtifactDescriptor artifact = new ArtifactDescriptorImpl(cqlFile.getFileName(),
								conf.getScriptFolderPath() + "/" + cqlFile.getFileName(), cqlFile.getFilePath());
						node.getCodeFiles().add(artifact);
					}
				
                    // Script generation
				    DeploymentFileDescriptor script= new DeploymentFileDescriptorImpl(
							"cassandraServer" + getId() + ".sh", conf.getScriptFolderPath(), 
							generateScriptContent(configFileName, node.getIp()), type);
				    node.addLaunchingScript(script);
				}

			} catch (IOException e) {
				throw new ConfigurationException("No se encuentra el fichero de propiedades de Cassandra");
			}

		}
	}

	private String generateScriptContent(String configFileName, String ip) {
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();
		String scriptContent = "rm -rf " + getDataFileDir() + "/system/*\n";
		scriptContent += "rm -f " + conf.getConfigFolderPath() + "/cassandra-topology.properties\n";
		scriptContent += conf.getArtifactLocator() + "/" + conf.getArtifactName() + " -Dcassandra.config=file:///"
				+ conf.getConfigFolderPath() + "/" + configFileName + "\n";
		scriptContent = DeploymentToolsUtils.scriptHeaders(conf.getScriptFolderPath()) + scriptContent;
		// String hostIp = ((PhysicalProcessingNode)
		// getListenAddress()).getIp();
		//String hostIp = node.getIp();

		scriptContent += "sleep 60 \n"; // Espera para que cassandra termine de
										// arrancar antes de crear el schema.

		for (FileDescriptor cqlSchema : getCqlSchemas())
			scriptContent += conf.getArtifactLocator() + "/cqlsh " + ip + " -f " + conf.getScriptFolderPath() + "/"
					+ cqlSchema.getFileName();

		return scriptContent;
	}

	private String generateConfigFileContent(ProcessingNode node, String seedsValue)
			throws YamlException, ConfigurationException {
		// reader = new YamlReader(new FileReader(new
		// File(this.getClass().getClassLoader().getResourceAsStream("cassandra.yaml"))));
		YamlReader reader = new YamlReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("cassandra.yaml")));
		Object object = reader.read();

		// Modify simple properties
		HashMap map = (HashMap) object;
		map.put("cluster_name", getHost().getName());
		map.put("num_tokens", getNumTokens());

		// map.put("listen_address", ((PhysicalProcessingNode)
		// getListenAddress()).getIp());
		map.put("listen_address", node.getIp());
		map.put("native_transport_port", getNativeTransportPort());
		// map.put("rpc_address", ((PhysicalProcessingNode)
		// getRpcAddress()).getIp());
		map.put("rpc_address", node.getIp());
		map.put("endpoint_snitch", getEndpointSnitch());
		map.put("auto_bootstrap", isAutoBootstrap());

		// Modify complex properties
		String dataFileDir = getDataFileDir();
		if (getDataFileDir() != null) {
			ArrayList<String> listaDirs = new ArrayList<String>();
			listaDirs.add(dataFileDir);
			map.put("data_file_directories", listaDirs);
		}

		ArrayList<HashMap> listSeedProvider = (ArrayList<HashMap>) map.get("seed_provider");
		ArrayList<HashMap> listSeeds = (ArrayList<HashMap>) listSeedProvider.get(0).get("parameters");
		listSeeds.get(0).put("seeds", seedsValue);

		StringWriter output = new StringWriter();
		YamlWriter writer = new YamlWriter(output);
		writer.getConfig().writeConfig.setWriteRootTags(false);
		writer.getConfig().writeConfig.setWriteClassname(YamlConfig.WriteClassName.NEVER);

		writer.write(object);
		writer.close();
		String configFileContent = output.toString();
		return configFileContent;
	}

	private String getSeedsValue() throws ConfigurationException {
		boolean first = true;
		String seeds = "";
		for (ProcessingNode node : getSeeds().getNodes()) {
			if (!first)
				seeds += ",";
			seeds += node.getIp(); // No necesito cambiar a container porque el getHost ya me lo da bien
			first = false;
		}
		return seeds;
	}

	private Map<String, String> rackConfiguration() {
		// Rack configuration file generation
		// String rackProps = "dc=" + getDataCenter().getName() + "\n";
		// rackProps += "rack=" + getRack().getName();
		Map<String, String> map = new HashMap<String, String>();
		List<DataCenter> dcList = getDataCenters();

		for (DataCenter dc : dcList) {
			List<Rack> rackList = dc.getRacks();
			for (Rack rack : rackList) {
				for (ProcessingNode node : rack.getNodes().getNodes()) {
					map.put(node.getIp(), "dc=" + dc.getName() + "\n" + "rack=" + rack.getName());
				}
			}
		}
		return map;
	}
} // CassandraServiceImpl
