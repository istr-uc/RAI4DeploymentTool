/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.KafkaService;
import PASYS_Metamodel.pasys.OrchestrationCluster;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.ZookeeperService;
import deploymentTool.DeploymentToolsUtils;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Kafka
 * Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getCommId <em>Comm
 * Id</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getClientPort
 * <em>Client Port</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getZookeeperConnect
 * <em>Zookeeper Connect</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getZookeeperConnectionTimeout
 * <em>Zookeeper Connection Timeout</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getListeners
 * <em>Listeners</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getAdvertisedListeners
 * <em>Advertised Listeners</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#isAutoCreateTopicEnable
 * <em>Auto Create Topic Enable</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#isDeleteTopicEnable
 * <em>Delete Topic Enable</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getNumPartitions
 * <em>Num Partitions</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getNumRecoveryThreadsPerDataDir
 * <em>Num Recovery Threads Per Data Dir</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getLogFlushIntervalMessages
 * <em>Log Flush Interval Messages</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getLogFlushInterval
 * <em>Log Flush Interval</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getNumNetworkThreads
 * <em>Num Network Threads</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getNumIOThreads
 * <em>Num IO Threads</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getSocketSendBufferBytes
 * <em>Socket Send Buffer Bytes</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getSocketReceiveBufferBytes
 * <em>Socket Receive Buffer Bytes</em>}</li>
 * <li>{@link PASYS_Metamodel.pasys.impl.KafkaServiceImpl#getSocketRequestMaxBytes
 * <em>Socket Request Max Bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafkaServiceImpl extends CommunicationServiceImpl implements KafkaService {
	/**
	 * The default value of the '{@link #getCommId() <em>Comm Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCommId()
	 * @generated
	 * @ordered
	 */
	protected static final int COMM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommId() <em>Comm Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCommId()
	 * @generated
	 * @ordered
	 */
	protected int commId = COMM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientPort() <em>Client Port</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_PORT_EDEFAULT = 9092;

	/**
	 * The cached value of the '{@link #getClientPort() <em>Client Port</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected int clientPort = CLIENT_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZookeeperConnect() <em>Zookeeper
	 * Connect</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getZookeeperConnect()
	 * @generated
	 * @ordered
	 */
	protected ZookeeperService zookeeperConnect;

	/**
	 * The default value of the '{@link #getZookeeperConnectionTimeout()
	 * <em>Zookeeper Connection Timeout</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getZookeeperConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int ZOOKEEPER_CONNECTION_TIMEOUT_EDEFAULT = 6000;

	/**
	 * The cached value of the '{@link #getZookeeperConnectionTimeout()
	 * <em>Zookeeper Connection Timeout</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getZookeeperConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int zookeeperConnectionTimeout = ZOOKEEPER_CONNECTION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getListeners() <em>Listeners</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENERS_EDEFAULT = "\u201dPLAINTEXT\u201d";

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected String listeners = LISTENERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdvertisedListeners() <em>Advertised
	 * Listeners</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdvertisedListeners()
	 * @generated
	 * @ordered
	 */
	protected static final String ADVERTISED_LISTENERS_EDEFAULT = "PLAINTEXT";

	/**
	 * The cached value of the '{@link #getAdvertisedListeners() <em>Advertised
	 * Listeners</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdvertisedListeners()
	 * @generated
	 * @ordered
	 */
	protected String advertisedListeners = ADVERTISED_LISTENERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoCreateTopicEnable() <em>Auto Create
	 * Topic Enable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAutoCreateTopicEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_CREATE_TOPIC_ENABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoCreateTopicEnable() <em>Auto Create
	 * Topic Enable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAutoCreateTopicEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean autoCreateTopicEnable = AUTO_CREATE_TOPIC_ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeleteTopicEnable() <em>Delete Topic
	 * Enable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDeleteTopicEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_TOPIC_ENABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteTopicEnable() <em>Delete Topic
	 * Enable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDeleteTopicEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteTopicEnable = DELETE_TOPIC_ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPartitions() <em>Num
	 * Partitions</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PARTITIONS_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getNumPartitions() <em>Num Partitions</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumPartitions()
	 * @generated
	 * @ordered
	 */
	protected int numPartitions = NUM_PARTITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumRecoveryThreadsPerDataDir() <em>Num
	 * Recovery Threads Per Data Dir</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNumRecoveryThreadsPerDataDir()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumRecoveryThreadsPerDataDir() <em>Num
	 * Recovery Threads Per Data Dir</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNumRecoveryThreadsPerDataDir()
	 * @generated
	 * @ordered
	 */
	protected int numRecoveryThreadsPerDataDir = NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFlushIntervalMessages() <em>Log Flush
	 * Interval Messages</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLogFlushIntervalMessages()
	 * @generated
	 * @ordered
	 */
	protected static final int LOG_FLUSH_INTERVAL_MESSAGES_EDEFAULT = 10000;

	/**
	 * The cached value of the '{@link #getLogFlushIntervalMessages() <em>Log Flush
	 * Interval Messages</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getLogFlushIntervalMessages()
	 * @generated
	 * @ordered
	 */
	protected int logFlushIntervalMessages = LOG_FLUSH_INTERVAL_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFlushInterval() <em>Log Flush
	 * Interval</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogFlushInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int LOG_FLUSH_INTERVAL_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getLogFlushInterval() <em>Log Flush
	 * Interval</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogFlushInterval()
	 * @generated
	 * @ordered
	 */
	protected int logFlushInterval = LOG_FLUSH_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumNetworkThreads() <em>Num Network
	 * Threads</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumNetworkThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NETWORK_THREADS_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getNumNetworkThreads() <em>Num Network
	 * Threads</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumNetworkThreads()
	 * @generated
	 * @ordered
	 */
	protected int numNetworkThreads = NUM_NETWORK_THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumIOThreads() <em>Num IO Threads</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumIOThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_IO_THREADS_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getNumIOThreads() <em>Num IO Threads</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumIOThreads()
	 * @generated
	 * @ordered
	 */
	protected int numIOThreads = NUM_IO_THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocketSendBufferBytes() <em>Socket Send
	 * Buffer Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocketSendBufferBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int SOCKET_SEND_BUFFER_BYTES_EDEFAULT = 102400;

	/**
	 * The cached value of the '{@link #getSocketSendBufferBytes() <em>Socket Send
	 * Buffer Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocketSendBufferBytes()
	 * @generated
	 * @ordered
	 */
	protected int socketSendBufferBytes = SOCKET_SEND_BUFFER_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocketReceiveBufferBytes() <em>Socket
	 * Receive Buffer Bytes</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSocketReceiveBufferBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int SOCKET_RECEIVE_BUFFER_BYTES_EDEFAULT = 102400;

	/**
	 * The cached value of the '{@link #getSocketReceiveBufferBytes() <em>Socket
	 * Receive Buffer Bytes</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSocketReceiveBufferBytes()
	 * @generated
	 * @ordered
	 */
	protected int socketReceiveBufferBytes = SOCKET_RECEIVE_BUFFER_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocketRequestMaxBytes() <em>Socket
	 * Request Max Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSocketRequestMaxBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int SOCKET_REQUEST_MAX_BYTES_EDEFAULT = 104857600;

	/**
	 * The cached value of the '{@link #getSocketRequestMaxBytes() <em>Socket
	 * Request Max Bytes</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSocketRequestMaxBytes()
	 * @generated
	 * @ordered
	 */
	protected int socketRequestMaxBytes = SOCKET_REQUEST_MAX_BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected KafkaServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.KAFKA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getCommId() {
		return commId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCommId(int newCommId) {
		int oldCommId = commId;
		commId = newCommId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__COMM_ID, oldCommId,
					commId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isAutoCreateTopicEnable() {
		return autoCreateTopicEnable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAutoCreateTopicEnable(boolean newAutoCreateTopicEnable) {
		boolean oldAutoCreateTopicEnable = autoCreateTopicEnable;
		autoCreateTopicEnable = newAutoCreateTopicEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE,
					oldAutoCreateTopicEnable, autoCreateTopicEnable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isDeleteTopicEnable() {
		return deleteTopicEnable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDeleteTopicEnable(boolean newDeleteTopicEnable) {
		boolean oldDeleteTopicEnable = deleteTopicEnable;
		deleteTopicEnable = newDeleteTopicEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE,
					oldDeleteTopicEnable, deleteTopicEnable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ZookeeperService getZookeeperConnect() {
		if (zookeeperConnect != null && zookeeperConnect.eIsProxy()) {
			InternalEObject oldZookeeperConnect = (InternalEObject) zookeeperConnect;
			zookeeperConnect = (ZookeeperService) eResolveProxy(oldZookeeperConnect);
			if (zookeeperConnect != oldZookeeperConnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT, oldZookeeperConnect, zookeeperConnect));
			}
		}
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ZookeeperService basicGetZookeeperConnect() {
		return zookeeperConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setZookeeperConnect(ZookeeperService newZookeeperConnect) {
		ZookeeperService oldZookeeperConnect = zookeeperConnect;
		zookeeperConnect = newZookeeperConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT,
					oldZookeeperConnect, zookeeperConnect));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getZookeeperConnectionTimeout() {
		return zookeeperConnectionTimeout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setZookeeperConnectionTimeout(int newZookeeperConnectionTimeout) {
		int oldZookeeperConnectionTimeout = zookeeperConnectionTimeout;
		zookeeperConnectionTimeout = newZookeeperConnectionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT, oldZookeeperConnectionTimeout,
					zookeeperConnectionTimeout));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumPartitions() {
		return numPartitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumPartitions(int newNumPartitions) {
		int oldNumPartitions = numPartitions;
		numPartitions = newNumPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS,
					oldNumPartitions, numPartitions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumRecoveryThreadsPerDataDir() {
		return numRecoveryThreadsPerDataDir;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumRecoveryThreadsPerDataDir(int newNumRecoveryThreadsPerDataDir) {
		int oldNumRecoveryThreadsPerDataDir = numRecoveryThreadsPerDataDir;
		numRecoveryThreadsPerDataDir = newNumRecoveryThreadsPerDataDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR, oldNumRecoveryThreadsPerDataDir,
					numRecoveryThreadsPerDataDir));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getLogFlushIntervalMessages() {
		return logFlushIntervalMessages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLogFlushIntervalMessages(int newLogFlushIntervalMessages) {
		int oldLogFlushIntervalMessages = logFlushIntervalMessages;
		logFlushIntervalMessages = newLogFlushIntervalMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES, oldLogFlushIntervalMessages,
					logFlushIntervalMessages));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getLogFlushInterval() {
		return logFlushInterval;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLogFlushInterval(int newLogFlushInterval) {
		int oldLogFlushInterval = logFlushInterval;
		logFlushInterval = newLogFlushInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL,
					oldLogFlushInterval, logFlushInterval));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getListeners() {
		return listeners;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setListeners(String newListeners) {
		String oldListeners = listeners;
		listeners = newListeners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__LISTENERS, oldListeners,
					listeners));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getAdvertisedListeners() {
		return advertisedListeners;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAdvertisedListeners(String newAdvertisedListeners) {
		String oldAdvertisedListeners = advertisedListeners;
		advertisedListeners = newAdvertisedListeners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS,
					oldAdvertisedListeners, advertisedListeners));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumNetworkThreads() {
		return numNetworkThreads;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumNetworkThreads(int newNumNetworkThreads) {
		int oldNumNetworkThreads = numNetworkThreads;
		numNetworkThreads = newNumNetworkThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS,
					oldNumNetworkThreads, numNetworkThreads));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getNumIOThreads() {
		return numIOThreads;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNumIOThreads(int newNumIOThreads) {
		int oldNumIOThreads = numIOThreads;
		numIOThreads = newNumIOThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS,
					oldNumIOThreads, numIOThreads));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getSocketSendBufferBytes() {
		return socketSendBufferBytes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSocketSendBufferBytes(int newSocketSendBufferBytes) {
		int oldSocketSendBufferBytes = socketSendBufferBytes;
		socketSendBufferBytes = newSocketSendBufferBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES,
					oldSocketSendBufferBytes, socketSendBufferBytes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getSocketReceiveBufferBytes() {
		return socketReceiveBufferBytes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSocketReceiveBufferBytes(int newSocketReceiveBufferBytes) {
		int oldSocketReceiveBufferBytes = socketReceiveBufferBytes;
		socketReceiveBufferBytes = newSocketReceiveBufferBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES, oldSocketReceiveBufferBytes,
					socketReceiveBufferBytes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getSocketRequestMaxBytes() {
		return socketRequestMaxBytes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSocketRequestMaxBytes(int newSocketRequestMaxBytes) {
		int oldSocketRequestMaxBytes = socketRequestMaxBytes;
		socketRequestMaxBytes = newSocketRequestMaxBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES,
					oldSocketRequestMaxBytes, socketRequestMaxBytes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getClientPort() {
		return clientPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setClientPort(int newClientPort) {
		int oldClientPort = clientPort;
		clientPort = newClientPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.KAFKA_SERVICE__CLIENT_PORT,
					oldClientPort, clientPort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PasysPackage.KAFKA_SERVICE__COMM_ID:
			return getCommId();
		case PasysPackage.KAFKA_SERVICE__CLIENT_PORT:
			return getClientPort();
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT:
			if (resolve)
				return getZookeeperConnect();
			return basicGetZookeeperConnect();
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT:
			return getZookeeperConnectionTimeout();
		case PasysPackage.KAFKA_SERVICE__LISTENERS:
			return getListeners();
		case PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS:
			return getAdvertisedListeners();
		case PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE:
			return isAutoCreateTopicEnable();
		case PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE:
			return isDeleteTopicEnable();
		case PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS:
			return getNumPartitions();
		case PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR:
			return getNumRecoveryThreadsPerDataDir();
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES:
			return getLogFlushIntervalMessages();
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL:
			return getLogFlushInterval();
		case PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS:
			return getNumNetworkThreads();
		case PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS:
			return getNumIOThreads();
		case PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES:
			return getSocketSendBufferBytes();
		case PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES:
			return getSocketReceiveBufferBytes();
		case PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES:
			return getSocketRequestMaxBytes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PasysPackage.KAFKA_SERVICE__COMM_ID:
			setCommId((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__CLIENT_PORT:
			setClientPort((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT:
			setZookeeperConnect((ZookeeperService) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT:
			setZookeeperConnectionTimeout((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__LISTENERS:
			setListeners((String) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS:
			setAdvertisedListeners((String) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE:
			setAutoCreateTopicEnable((Boolean) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE:
			setDeleteTopicEnable((Boolean) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS:
			setNumPartitions((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR:
			setNumRecoveryThreadsPerDataDir((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES:
			setLogFlushIntervalMessages((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL:
			setLogFlushInterval((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS:
			setNumNetworkThreads((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS:
			setNumIOThreads((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES:
			setSocketSendBufferBytes((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES:
			setSocketReceiveBufferBytes((Integer) newValue);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES:
			setSocketRequestMaxBytes((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PasysPackage.KAFKA_SERVICE__COMM_ID:
			setCommId(COMM_ID_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__CLIENT_PORT:
			setClientPort(CLIENT_PORT_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT:
			setZookeeperConnect((ZookeeperService) null);
			return;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT:
			setZookeeperConnectionTimeout(ZOOKEEPER_CONNECTION_TIMEOUT_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__LISTENERS:
			setListeners(LISTENERS_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS:
			setAdvertisedListeners(ADVERTISED_LISTENERS_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE:
			setAutoCreateTopicEnable(AUTO_CREATE_TOPIC_ENABLE_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE:
			setDeleteTopicEnable(DELETE_TOPIC_ENABLE_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS:
			setNumPartitions(NUM_PARTITIONS_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR:
			setNumRecoveryThreadsPerDataDir(NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES:
			setLogFlushIntervalMessages(LOG_FLUSH_INTERVAL_MESSAGES_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL:
			setLogFlushInterval(LOG_FLUSH_INTERVAL_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS:
			setNumNetworkThreads(NUM_NETWORK_THREADS_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS:
			setNumIOThreads(NUM_IO_THREADS_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES:
			setSocketSendBufferBytes(SOCKET_SEND_BUFFER_BYTES_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES:
			setSocketReceiveBufferBytes(SOCKET_RECEIVE_BUFFER_BYTES_EDEFAULT);
			return;
		case PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES:
			setSocketRequestMaxBytes(SOCKET_REQUEST_MAX_BYTES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PasysPackage.KAFKA_SERVICE__COMM_ID:
			return commId != COMM_ID_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__CLIENT_PORT:
			return clientPort != CLIENT_PORT_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECT:
			return zookeeperConnect != null;
		case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT:
			return zookeeperConnectionTimeout != ZOOKEEPER_CONNECTION_TIMEOUT_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__LISTENERS:
			return LISTENERS_EDEFAULT == null ? listeners != null : !LISTENERS_EDEFAULT.equals(listeners);
		case PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS:
			return ADVERTISED_LISTENERS_EDEFAULT == null ? advertisedListeners != null
					: !ADVERTISED_LISTENERS_EDEFAULT.equals(advertisedListeners);
		case PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE:
			return autoCreateTopicEnable != AUTO_CREATE_TOPIC_ENABLE_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE:
			return deleteTopicEnable != DELETE_TOPIC_ENABLE_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS:
			return numPartitions != NUM_PARTITIONS_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR:
			return numRecoveryThreadsPerDataDir != NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES:
			return logFlushIntervalMessages != LOG_FLUSH_INTERVAL_MESSAGES_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL:
			return logFlushInterval != LOG_FLUSH_INTERVAL_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS:
			return numNetworkThreads != NUM_NETWORK_THREADS_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS:
			return numIOThreads != NUM_IO_THREADS_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES:
			return socketSendBufferBytes != SOCKET_SEND_BUFFER_BYTES_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES:
			return socketReceiveBufferBytes != SOCKET_RECEIVE_BUFFER_BYTES_EDEFAULT;
		case PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES:
			return socketRequestMaxBytes != SOCKET_REQUEST_MAX_BYTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (commId: ");
		result.append(commId);
		result.append(", clientPort: ");
		result.append(clientPort);
		result.append(", zookeeperConnectionTimeout: ");
		result.append(zookeeperConnectionTimeout);
		result.append(", listeners: ");
		result.append(listeners);
		result.append(", advertisedListeners: ");
		result.append(advertisedListeners);
		result.append(", autoCreateTopicEnable: ");
		result.append(autoCreateTopicEnable);
		result.append(", deleteTopicEnable: ");
		result.append(deleteTopicEnable);
		result.append(", numPartitions: ");
		result.append(numPartitions);
		result.append(", numRecoveryThreadsPerDataDir: ");
		result.append(numRecoveryThreadsPerDataDir);
		result.append(", logFlushIntervalMessages: ");
		result.append(logFlushIntervalMessages);
		result.append(", logFlushInterval: ");
		result.append(logFlushInterval);
		result.append(", numNetworkThreads: ");
		result.append(numNetworkThreads);
		result.append(", numIOThreads: ");
		result.append(numIOThreads);
		result.append(", socketSendBufferBytes: ");
		result.append(socketSendBufferBytes);
		result.append(", socketReceiveBufferBytes: ");
		result.append(socketReceiveBufferBytes);
		result.append(", socketRequestMaxBytes: ");
		result.append(socketRequestMaxBytes);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnNode() throws ConfigurationException {
		NodeDeploymentConfImpl conf = (NodeDeploymentConfImpl) getDeploymentConfig();
		if (!conf.isIsRunning()) {
			// Config File generation
			DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl(
					"kafka" + getCommId() + ".properties", conf.getConfigFolderPath(), generateConfigFileContent(),
					DeployableComponentType.KAFKA_SERVICE);
			// Script generation
			String scriptContent = "rm -f " + conf.getLogFolderPath() + "/meta.properties\n";
			scriptContent += conf.getArtifactLocator() + "/" + conf.getArtifactName() + " -daemon "
					+ conf.getConfigFolderPath() + "/" + "kafka" + getCommId() + ".properties";
			scriptContent = "cd " + conf.getScriptFolderPath() + "\n" + scriptContent;
			DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl("kafka" + getCommId() + ".sh",
					conf.getScriptFolderPath(), scriptContent, DeployableComponentType.KAFKA_SERVICE);

			ProcessingNodeCluster nodeCluster = (ProcessingNodeCluster) getHost();
			for (ProcessingNode node : nodeCluster.getNodes()) {
				node.addLaunchingScript(script);
				node.addConfigFile(configFile);
			}
		}
	}

	private String generateConfigFileContent() throws ConfigurationException {
		NodeDeploymentConfImpl conf = (NodeDeploymentConfImpl) getDeploymentConfig();
		Properties props = new Properties();
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("kafka-server.properties"));

			props.put("broker.id", id);

			// Suponiendo que ponen solo el estilo
			// listeners = this.listeners://host.getId:this.clientPort
			// PhysicalProcessingNode host =
			// (PhysicalProcessingNode)getHost();
			// fileContent+="listeners="+listeners+"://"+host.getIp()+":"+clientPort,;

			// Suponiendo que lo dan completo
			props.put("listeners", listeners);

			// advertised.listeners=this.listeners://host.getId:this.clientPort
			// fileContent+="advertised.listeners"+"="+advertisedListeners+"://"+host.getIp()+":"+clientPort+"\n";

			props.put("advertised.listeners", advertisedListeners);

			// num.network.threads = numNetworkThreads
			props.put("num.network.threads", Integer.toString(numNetworkThreads));

			// num.io.threads = numIOThreads
			props.put("num.io.threads", Integer.toString(numIOThreads));

			// socket.send.buffer.bytes = socketSendBufferBytes
			props.put("socket.send.buffer.bytes", Integer.toString(socketSendBufferBytes));

			// socket.receive.buffer.bytes = socketReceiveBufferBytes
			props.put("socket.receive.buffer.bytes", Integer.toString(socketReceiveBufferBytes));

			// socket.request.max.bytes = socketRequestMaxBytes
			props.put("socket.request.max.bytes", Integer.toString(socketRequestMaxBytes));

			// log.dirs = logFolderPath o anhadir uno al Kafka?
			props.put("log.dirs", conf.getLogFolderPath());

			// num.Partitions = numPartitions
			props.put("num.Partitions", Integer.toString(numPartitions));

			// num.recovery.threads.per.data.dir
			props.put("num.recovery.threads.per.data.dir", Integer.toString(numRecoveryThreadsPerDataDir));

			// log.flush.interval.messages
			props.put("log.flush.interval.messages", Integer.toString(logFlushIntervalMessages));

			// log.flush.interval.ms =1000
			props.put("log.flush.interval.ms", Integer.toString(logFlushInterval));

			// zookeeper.connect =
			// zookeeperConnect.host.ip:zookeeperConnect.clientPort

			boolean first = true;
			String zookeeperConnect = "";
			ProcessingResourceCluster zkprCluster = getZookeeperConnect().getHost();
			if (zkprCluster instanceof ProcessingNodeCluster) {
				ProcessingNodeCluster nodeCluster = (ProcessingNodeCluster) zkprCluster;	
				for (ProcessingNode node : nodeCluster.getNodes()) {
					if (!first)
						zookeeperConnect += ",";
					zookeeperConnect += node.getIp() + ":" + getZookeeperConnect().getClientPort();
					first = false;
				}
			} else if (zkprCluster instanceof OrchestrationCluster) {
				//TODO
			}
			props.put("zookeeper.connect", zookeeperConnect);

			// zookeeper.connection.timeout.ms
			props.put("zookeeper.connection.timeout.ms", Integer.toString(zookeeperConnectionTimeout));

			return DeploymentToolsUtils.propertiesToString(props);

		} catch (IOException e) {
			throw new ConfigurationException("No se encuentra el fichero de propiedades de Kafka");
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void configureDeploymentOnOrchestrator() throws ConfigurationException {
		// TODO
	}

} // KafkaServiceImpl
