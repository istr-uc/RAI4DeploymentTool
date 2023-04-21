/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kafka Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getCommId <em>Comm Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnectionTimeout <em>Zookeeper Connection Timeout</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getListeners <em>Listeners</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getAdvertisedListeners <em>Advertised Listeners</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#isAutoCreateTopicEnable <em>Auto Create Topic Enable</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#isDeleteTopicEnable <em>Delete Topic Enable</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getNumPartitions <em>Num Partitions</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getNumRecoveryThreadsPerDataDir <em>Num Recovery Threads Per Data Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushIntervalMessages <em>Log Flush Interval Messages</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushInterval <em>Log Flush Interval</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getNumNetworkThreads <em>Num Network Threads</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getNumIOThreads <em>Num IO Threads</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getSocketSendBufferBytes <em>Socket Send Buffer Bytes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getSocketReceiveBufferBytes <em>Socket Receive Buffer Bytes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.KafkaService#getSocketRequestMaxBytes <em>Socket Request Max Bytes</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService()
 * @model
 * @generated
 */
public interface KafkaService extends CommunicationService {
	/**
	 * Returns the value of the '<em><b>Comm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Id</em>' attribute.
	 * @see #setCommId(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_CommId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getCommId();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getCommId <em>Comm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Id</em>' attribute.
	 * @see #getCommId()
	 * @generated
	 */
	void setCommId(int value);

	/**
	 * Returns the value of the '<em><b>Auto Create Topic Enable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Create Topic Enable</em>' attribute.
	 * @see #setAutoCreateTopicEnable(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_AutoCreateTopicEnable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutoCreateTopicEnable();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#isAutoCreateTopicEnable <em>Auto Create Topic Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Create Topic Enable</em>' attribute.
	 * @see #isAutoCreateTopicEnable()
	 * @generated
	 */
	void setAutoCreateTopicEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete Topic Enable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Topic Enable</em>' attribute.
	 * @see #setDeleteTopicEnable(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_DeleteTopicEnable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDeleteTopicEnable();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#isDeleteTopicEnable <em>Delete Topic Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Topic Enable</em>' attribute.
	 * @see #isDeleteTopicEnable()
	 * @generated
	 */
	void setDeleteTopicEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #setZookeeperConnect(ZookeeperService)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_ZookeeperConnect()
	 * @model required="true"
	 * @generated
	 */
	ZookeeperService getZookeeperConnect();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnect <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #getZookeeperConnect()
	 * @generated
	 */
	void setZookeeperConnect(ZookeeperService value);

	/**
	 * Returns the value of the '<em><b>Zookeeper Connection Timeout</b></em>' attribute.
	 * The default value is <code>"6000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zookeeper Connection Timeout</em>' attribute.
	 * @see #setZookeeperConnectionTimeout(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_ZookeeperConnectionTimeout()
	 * @model default="6000" required="true"
	 * @generated
	 */
	int getZookeeperConnectionTimeout();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getZookeeperConnectionTimeout <em>Zookeeper Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Connection Timeout</em>' attribute.
	 * @see #getZookeeperConnectionTimeout()
	 * @generated
	 */
	void setZookeeperConnectionTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Num Partitions</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Partitions</em>' attribute.
	 * @see #setNumPartitions(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_NumPartitions()
	 * @model default="4" required="true"
	 * @generated
	 */
	int getNumPartitions();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getNumPartitions <em>Num Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Partitions</em>' attribute.
	 * @see #getNumPartitions()
	 * @generated
	 */
	void setNumPartitions(int value);

	/**
	 * Returns the value of the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Recovery Threads Per Data Dir</em>' attribute.
	 * @see #setNumRecoveryThreadsPerDataDir(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_NumRecoveryThreadsPerDataDir()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNumRecoveryThreadsPerDataDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getNumRecoveryThreadsPerDataDir <em>Num Recovery Threads Per Data Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Recovery Threads Per Data Dir</em>' attribute.
	 * @see #getNumRecoveryThreadsPerDataDir()
	 * @generated
	 */
	void setNumRecoveryThreadsPerDataDir(int value);

	/**
	 * Returns the value of the '<em><b>Log Flush Interval Messages</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Flush Interval Messages</em>' attribute.
	 * @see #setLogFlushIntervalMessages(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_LogFlushIntervalMessages()
	 * @model default="10000" required="true"
	 * @generated
	 */
	int getLogFlushIntervalMessages();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushIntervalMessages <em>Log Flush Interval Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Flush Interval Messages</em>' attribute.
	 * @see #getLogFlushIntervalMessages()
	 * @generated
	 */
	void setLogFlushIntervalMessages(int value);

	/**
	 * Returns the value of the '<em><b>Log Flush Interval</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Flush Interval</em>' attribute.
	 * @see #setLogFlushInterval(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_LogFlushInterval()
	 * @model default="1000" required="true"
	 * @generated
	 */
	int getLogFlushInterval();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getLogFlushInterval <em>Log Flush Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Flush Interval</em>' attribute.
	 * @see #getLogFlushInterval()
	 * @generated
	 */
	void setLogFlushInterval(int value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' attribute.
	 * The default value is <code>"\u201dPLAINTEXT\u201d"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' attribute.
	 * @see #setListeners(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_Listeners()
	 * @model default="\u201dPLAINTEXT\u201d"
	 * @generated
	 */
	String getListeners();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getListeners <em>Listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listeners</em>' attribute.
	 * @see #getListeners()
	 * @generated
	 */
	void setListeners(String value);

	/**
	 * Returns the value of the '<em><b>Advertised Listeners</b></em>' attribute.
	 * The default value is <code>"PLAINTEXT"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertised Listeners</em>' attribute.
	 * @see #setAdvertisedListeners(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_AdvertisedListeners()
	 * @model default="PLAINTEXT"
	 * @generated
	 */
	String getAdvertisedListeners();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getAdvertisedListeners <em>Advertised Listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advertised Listeners</em>' attribute.
	 * @see #getAdvertisedListeners()
	 * @generated
	 */
	void setAdvertisedListeners(String value);

	/**
	 * Returns the value of the '<em><b>Num Network Threads</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Network Threads</em>' attribute.
	 * @see #setNumNetworkThreads(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_NumNetworkThreads()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getNumNetworkThreads();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getNumNetworkThreads <em>Num Network Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Network Threads</em>' attribute.
	 * @see #getNumNetworkThreads()
	 * @generated
	 */
	void setNumNetworkThreads(int value);

	/**
	 * Returns the value of the '<em><b>Num IO Threads</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num IO Threads</em>' attribute.
	 * @see #setNumIOThreads(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_NumIOThreads()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getNumIOThreads();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getNumIOThreads <em>Num IO Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num IO Threads</em>' attribute.
	 * @see #getNumIOThreads()
	 * @generated
	 */
	void setNumIOThreads(int value);

	/**
	 * Returns the value of the '<em><b>Socket Send Buffer Bytes</b></em>' attribute.
	 * The default value is <code>"102400"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket Send Buffer Bytes</em>' attribute.
	 * @see #setSocketSendBufferBytes(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_SocketSendBufferBytes()
	 * @model default="102400" required="true"
	 * @generated
	 */
	int getSocketSendBufferBytes();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getSocketSendBufferBytes <em>Socket Send Buffer Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket Send Buffer Bytes</em>' attribute.
	 * @see #getSocketSendBufferBytes()
	 * @generated
	 */
	void setSocketSendBufferBytes(int value);

	/**
	 * Returns the value of the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute.
	 * The default value is <code>"102400"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket Receive Buffer Bytes</em>' attribute.
	 * @see #setSocketReceiveBufferBytes(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_SocketReceiveBufferBytes()
	 * @model default="102400" required="true"
	 * @generated
	 */
	int getSocketReceiveBufferBytes();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getSocketReceiveBufferBytes <em>Socket Receive Buffer Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket Receive Buffer Bytes</em>' attribute.
	 * @see #getSocketReceiveBufferBytes()
	 * @generated
	 */
	void setSocketReceiveBufferBytes(int value);

	/**
	 * Returns the value of the '<em><b>Socket Request Max Bytes</b></em>' attribute.
	 * The default value is <code>"104857600"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket Request Max Bytes</em>' attribute.
	 * @see #setSocketRequestMaxBytes(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_SocketRequestMaxBytes()
	 * @model default="104857600" required="true"
	 * @generated
	 */
	int getSocketRequestMaxBytes();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getSocketRequestMaxBytes <em>Socket Request Max Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket Request Max Bytes</em>' attribute.
	 * @see #getSocketRequestMaxBytes()
	 * @generated
	 */
	void setSocketRequestMaxBytes(int value);

	/**
	 * Returns the value of the '<em><b>Client Port</b></em>' attribute.
	 * The default value is <code>"9092"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Port</em>' attribute.
	 * @see #setClientPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getKafkaService_ClientPort()
	 * @model default="9092" required="true"
	 * @generated
	 */
	int getClientPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.KafkaService#getClientPort <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Port</em>' attribute.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(int value);

} // KafkaService
