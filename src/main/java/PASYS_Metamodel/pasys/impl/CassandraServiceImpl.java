/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraServer;
import PASYS_Metamodel.pasys.CassandraService;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.FileDescriptor;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SystemComponentType;
import deploymentTool.DeploymentToolsUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cassandra Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getNumTokens <em>Num Tokens</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getSeeds <em>Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getSeedProviderClass <em>Seed Provider Class</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getListenAddress <em>Listen Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getRpcAddress <em>Rpc Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getEndpointSnitch <em>Endpoint Snitch</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getNativeTransportPort <em>Native Transport Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getRack <em>Rack</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.CassandraServiceImpl#isIsSeed <em>Is Seed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CassandraServiceImpl extends PersistenceServiceImpl implements CassandraService {
	/**
	 * The default value of the '{@link #getNumTokens() <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_TOKENS_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getNumTokens() <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTokens()
	 * @generated
	 * @ordered
	 */
	protected int numTokens = NUM_TOKENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeeds() <em>Seeds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeds()
	 * @generated
	 * @ordered
	 */
	protected ResourceCluster seeds;

	/**
	 * The default value of the '{@link #getSeedProviderClass() <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedProviderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SEED_PROVIDER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeedProviderClass() <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedProviderClass()
	 * @generated
	 * @ordered
	 */
	protected String seedProviderClass = SEED_PROVIDER_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListenAddress() <em>Listen Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenAddress()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNode listenAddress;

	/**
	 * The cached value of the '{@link #getRpcAddress() <em>Rpc Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpcAddress()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNode rpcAddress;

	/**
	 * The default value of the '{@link #getEndpointSnitch() <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointSnitch()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_SNITCH_EDEFAULT = "SimpleSnitch";

	/**
	 * The cached value of the '{@link #getEndpointSnitch() <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointSnitch()
	 * @generated
	 * @ordered
	 */
	protected String endpointSnitch = ENDPOINT_SNITCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataCenter() <em>Data Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCenter()
	 * @generated
	 * @ordered
	 */
	protected ResourceCluster dataCenter;

	/**
	 * The default value of the '{@link #getDataFileDir() <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FILE_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFileDir() <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFileDir()
	 * @generated
	 * @ordered
	 */
	protected String dataFileDir = DATA_FILE_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeTransportPort() <em>Native Transport Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeTransportPort()
	 * @generated
	 * @ordered
	 */
	protected static final int NATIVE_TRANSPORT_PORT_EDEFAULT = 9042;

	/**
	 * The cached value of the '{@link #getNativeTransportPort() <em>Native Transport Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeTransportPort()
	 * @generated
	 * @ordered
	 */
	protected int nativeTransportPort = NATIVE_TRANSPORT_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRack() <em>Rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRack()
	 * @generated
	 * @ordered
	 */
	protected ResourceCluster rack;

	/**
	 * The default value of the '{@link #isAutoBootstrap() <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoBootstrap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_BOOTSTRAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoBootstrap() <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoBootstrap()
	 * @generated
	 * @ordered
	 */
	protected boolean autoBootstrap = AUTO_BOOTSTRAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCqlSchemas() <em>Cql Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCqlSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDescriptor> cqlSchemas;

	/**
	 * The default value of the '{@link #isIsSeed() <em>Is Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSeed() <em>Is Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeed()
	 * @generated
	 * @ordered
	 */
	protected boolean isSeed = IS_SEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CassandraServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.CASSANDRA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumTokens() {
		return numTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster getSeeds() {
		if (seeds != null && seeds.eIsProxy()) {
			InternalEObject oldSeeds = (InternalEObject)seeds;
			seeds = (ResourceCluster)eResolveProxy(oldSeeds);
			if (seeds != oldSeeds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__SEEDS, oldSeeds, seeds));
			}
		}
		return seeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCluster basicGetSeeds() {
		return seeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeeds(ResourceCluster newSeeds) {
		ResourceCluster oldSeeds = seeds;
		seeds = newSeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__SEEDS, oldSeeds, seeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeedProviderClass() {
		return seedProviderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getListenAddress() {
		if (listenAddress != null && listenAddress.eIsProxy()) {
			InternalEObject oldListenAddress = (InternalEObject)listenAddress;
			listenAddress = (ProcessingNode)eResolveProxy(oldListenAddress);
			if (listenAddress != oldListenAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS, oldListenAddress, listenAddress));
			}
		}
		return listenAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNode basicGetListenAddress() {
		return listenAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListenAddress(ProcessingNode newListenAddress) {
		ProcessingNode oldListenAddress = listenAddress;
		listenAddress = newListenAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS, oldListenAddress, listenAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getRpcAddress() {
		if (rpcAddress != null && rpcAddress.eIsProxy()) {
			InternalEObject oldRpcAddress = (InternalEObject)rpcAddress;
			rpcAddress = (ProcessingNode)eResolveProxy(oldRpcAddress);
			if (rpcAddress != oldRpcAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS, oldRpcAddress, rpcAddress));
			}
		}
		return rpcAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNode basicGetRpcAddress() {
		return rpcAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpcAddress(ProcessingNode newRpcAddress) {
		ProcessingNode oldRpcAddress = rpcAddress;
		rpcAddress = newRpcAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS, oldRpcAddress, rpcAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointSnitch() {
		return endpointSnitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster getDataCenter() {
		if (dataCenter != null && dataCenter.eIsProxy()) {
			InternalEObject oldDataCenter = (InternalEObject)dataCenter;
			dataCenter = (ResourceCluster)eResolveProxy(oldDataCenter);
			if (dataCenter != oldDataCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__DATA_CENTER, oldDataCenter, dataCenter));
			}
		}
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCluster basicGetDataCenter() {
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCenter(ResourceCluster newDataCenter) {
		ResourceCluster oldDataCenter = dataCenter;
		dataCenter = newDataCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__DATA_CENTER, oldDataCenter, dataCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFileDir() {
		return dataFileDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNativeTransportPort() {
		return nativeTransportPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCluster getRack() {
		if (rack != null && rack.eIsProxy()) {
			InternalEObject oldRack = (InternalEObject)rack;
			rack = (ResourceCluster)eResolveProxy(oldRack);
			if (rack != oldRack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.CASSANDRA_SERVICE__RACK, oldRack, rack));
			}
		}
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCluster basicGetRack() {
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRack(ResourceCluster newRack) {
		ResourceCluster oldRack = rack;
		rack = newRack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__RACK, oldRack, rack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoBootstrap() {
		return autoBootstrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSeed() {
		return isSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSeed(boolean newIsSeed) {
		boolean oldIsSeed = isSeed;
		isSeed = newIsSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.CASSANDRA_SERVICE__IS_SEED, oldIsSeed, isSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return ((InternalEList<?>)getCqlSchemas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS:
				if (resolve) return getListenAddress();
				return basicGetListenAddress();
			case PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS:
				if (resolve) return getRpcAddress();
				return basicGetRpcAddress();
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				return getEndpointSnitch();
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTER:
				if (resolve) return getDataCenter();
				return basicGetDataCenter();
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				return getDataFileDir();
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				return getNativeTransportPort();
			case PasysPackage.CASSANDRA_SERVICE__RACK:
				if (resolve) return getRack();
				return basicGetRack();
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				return isAutoBootstrap();
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return getCqlSchemas();
			case PasysPackage.CASSANDRA_SERVICE__IS_SEED:
				return isIsSeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				setSeeds((ResourceCluster)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				setSeedProviderClass((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS:
				setListenAddress((ProcessingNode)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS:
				setRpcAddress((ProcessingNode)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				setEndpointSnitch((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTER:
				setDataCenter((ResourceCluster)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				setDataFileDir((String)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				setNativeTransportPort((Integer)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__RACK:
				setRack((ResourceCluster)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				setAutoBootstrap((Boolean)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				getCqlSchemas().clear();
				getCqlSchemas().addAll((Collection<? extends FileDescriptor>)newValue);
				return;
			case PasysPackage.CASSANDRA_SERVICE__IS_SEED:
				setIsSeed((Boolean)newValue);
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				setNumTokens(NUM_TOKENS_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				setSeeds((ResourceCluster)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				setSeedProviderClass(SEED_PROVIDER_CLASS_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS:
				setListenAddress((ProcessingNode)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS:
				setRpcAddress((ProcessingNode)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				setEndpointSnitch(ENDPOINT_SNITCH_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTER:
				setDataCenter((ResourceCluster)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				setDataFileDir(DATA_FILE_DIR_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				setNativeTransportPort(NATIVE_TRANSPORT_PORT_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__RACK:
				setRack((ResourceCluster)null);
				return;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				setAutoBootstrap(AUTO_BOOTSTRAP_EDEFAULT);
				return;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				getCqlSchemas().clear();
				return;
			case PasysPackage.CASSANDRA_SERVICE__IS_SEED:
				setIsSeed(IS_SEED_EDEFAULT);
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
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
				return numTokens != NUM_TOKENS_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__SEEDS:
				return seeds != null;
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
				return SEED_PROVIDER_CLASS_EDEFAULT == null ? seedProviderClass != null : !SEED_PROVIDER_CLASS_EDEFAULT.equals(seedProviderClass);
			case PasysPackage.CASSANDRA_SERVICE__LISTEN_ADDRESS:
				return listenAddress != null;
			case PasysPackage.CASSANDRA_SERVICE__RPC_ADDRESS:
				return rpcAddress != null;
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
				return ENDPOINT_SNITCH_EDEFAULT == null ? endpointSnitch != null : !ENDPOINT_SNITCH_EDEFAULT.equals(endpointSnitch);
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTER:
				return dataCenter != null;
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
				return DATA_FILE_DIR_EDEFAULT == null ? dataFileDir != null : !DATA_FILE_DIR_EDEFAULT.equals(dataFileDir);
			case PasysPackage.CASSANDRA_SERVICE__NATIVE_TRANSPORT_PORT:
				return nativeTransportPort != NATIVE_TRANSPORT_PORT_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__RACK:
				return rack != null;
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
				return autoBootstrap != AUTO_BOOTSTRAP_EDEFAULT;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
				return cqlSchemas != null && !cqlSchemas.isEmpty();
			case PasysPackage.CASSANDRA_SERVICE__IS_SEED:
				return isSeed != IS_SEED_EDEFAULT;
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
		result.append(", isSeed: ");
		result.append(isSeed);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void deploy() throws ConfigurationException {
		if (!isRunning) {
			try {
				SystemComponentType type = SystemComponentType.CASSANDRA_SERVER;
				if (isSeed)
					type = SystemComponentType.CASSANDRA_SERVER_SEED;

				// Config file generation
				String configFileContent = generateConfigFileContent();
				String configFileName = "cassandra" + id + ".yaml";
				DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl(configFileName, configFolderPath,
						configFileContent, type);
				getHost().getConfigFiles().add(configFile);

				// Rack configuration file generation
				String rackProps = "dc=" + getDataCenter().getName() + "\n";
				rackProps += "rack=" + getRack().getName();
				DeploymentFileDescriptor rackConfFile = new DeploymentFileDescriptorImpl("cassandra-rackcd.properties",
						configFolderPath, rackProps, type);
				getHost().getConfigFiles().add(rackConfFile);

				// Artifacts to move to the corresponding nodes
				for (FileDescriptor cqlFile : getCqlSchemas()) {
					ArtifactDescriptor artifact = new ArtifactDescriptorImpl(cqlFile.getFileName(),
							scriptFolderPath + "/" + cqlFile.getFileName(), cqlFile.getFilePath());
					getHost().getCodeFiles().add(artifact);
				}

				// Script generation
				DeploymentFileDescriptor script=null;
				if (host != null) {
					script = new DeploymentFileDescriptorImpl(
							"cassandraServer" + getId() + ".sh", this.getScriptFolderPath(), 
							generateScriptContent(configFileName), type);
					getHost().getLaunchingScripts().add(script);
				} else if (container!=null) {
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
					}
					
				}

			} catch (IOException e) {
				throw new ConfigurationException("No se encuentra el fichero de propiedades de Cassandra");
			}

		}
	}

	private String generateScriptContent(String configFileName) {
		String scriptContent = "rm -rf " + getDataFileDir() + "/system/*\n";
		scriptContent += "rm -f " + getConfigFolderPath() + "/cassandra-topology.properties\n";
		scriptContent += getArtifactLocator() + "/" + getArtifactName() + " -Dcassandra.config=file:///"
				+ configFolderPath + "/" + configFileName + "\n";
		scriptContent = DeploymentToolsUtils.scriptHeaders(getScriptFolderPath()) + scriptContent;
		// String hostIp = ((PhysicalProcessingNode)
		// getListenAddress()).getIp();
		String hostIp = (getListenAddress()).getIp();

		scriptContent += "sleep 60 \n"; // Espera para que cassandra termine de
										// arrancar antes de crear el schema.

		for (FileDescriptor cqlSchema : getCqlSchemas())
			scriptContent += getArtifactLocator() + "/cqlsh " + hostIp + " -f " + scriptFolderPath + "/"
					+ cqlSchema.getFileName();

		return scriptContent;
	}

	private String generateConfigFileContent() throws YamlException, ConfigurationException {
		// reader = new YamlReader(new FileReader(new
		// File(this.getClass().getClassLoader().getResourceAsStream("cassandra.yaml"))));
		YamlReader reader = new YamlReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("cassandra.yaml")));
		Object object = reader.read();

		// Modify simple properties
		HashMap map = (HashMap) object;
		map.put("cluster_name", getTarget().getName());
		map.put("num_tokens", getNumTokens());

		// map.put("listen_address", ((PhysicalProcessingNode)
		// getListenAddress()).getIp());
		map.put("listen_address", (getListenAddress()).getIp());
		map.put("native_transport_port", getNativeTransportPort());
		// map.put("rpc_address", ((PhysicalProcessingNode)
		// getRpcAddress()).getIp());
		map.put("rpc_address", (getRpcAddress()).getIp());
		map.put("endpoint_snitch", getEndpointSnitch());
		map.put("auto_bootstrap", isAutoBootstrap());

		// Modify complex properties
		String dataFileDir = getDataFileDir();
		if (getDataFileDir() != null) {
			ArrayList<String> listaDirs = new ArrayList<String>();
			listaDirs.add(dataFileDir);
			map.put("data_file_directories", listaDirs);
		}

		String seeds = getSeedsValue();
		ArrayList<HashMap> listSeedProvider = (ArrayList<HashMap>) map.get("seed_provider");
		ArrayList<HashMap> listSeeds = (ArrayList<HashMap>) listSeedProvider.get(0).get("parameters");
		listSeeds.get(0).put("seeds", seeds);

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
		for (PlatformResource resource : getSeeds().getResources()) {
			if (!first)
				seeds += ",";
			if (resource instanceof CassandraServer) { 
				CassandraServer csdr = (CassandraServer) resource;			
				seeds += csdr.getHost().getIp(); // No necesito cambiar a container porque el getHost ya me lo da bien
				first = false;
			} else {
				throw new ConfigurationException("One of the seed nodes of a Cassandra Server is not valid");
			}
		}
		return seeds;
	}
	
} //CassandraServiceImpl
