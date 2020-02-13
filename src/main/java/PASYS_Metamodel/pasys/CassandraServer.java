/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cassandra Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getNumTokens <em>Num Tokens</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getSeeds <em>Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getSeedProviderClass <em>Seed Provider Class</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getListenAddress <em>Listen Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getRpcAddress <em>Rpc Address</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getEndpointSnitch <em>Endpoint Snitch</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getNativeTransportPort <em>Native Transport Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getRack <em>Rack</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraServer#isIsSeed <em>Is Seed</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer()
 * @model
 * @generated
 */
public interface CassandraServer extends PersistenceServer, SystemComponent {

	/**
	 * Returns the value of the '<em><b>Num Tokens</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tokens</em>' attribute.
	 * @see #setNumTokens(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_NumTokens()
	 * @model default="256"
	 * @generated
	 */
	int getNumTokens();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getNumTokens <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tokens</em>' attribute.
	 * @see #getNumTokens()
	 * @generated
	 */
	void setNumTokens(int value);

	/**
	 * Returns the value of the '<em><b>Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seeds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seeds</em>' reference.
	 * @see #setSeeds(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_Seeds()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getSeeds();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getSeeds <em>Seeds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seeds</em>' reference.
	 * @see #getSeeds()
	 * @generated
	 */
	void setSeeds(ResourceCluster value);

	/**
	 * Returns the value of the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed Provider Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #setSeedProviderClass(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_SeedProviderClass()
	 * @model
	 * @generated
	 */
	String getSeedProviderClass();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getSeedProviderClass <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #getSeedProviderClass()
	 * @generated
	 */
	void setSeedProviderClass(String value);

	/**
	 * Returns the value of the '<em><b>Listen Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listen Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listen Address</em>' reference.
	 * @see #setListenAddress(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_ListenAddress()
	 * @model
	 * @generated
	 */
	ProcessingNode getListenAddress();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getListenAddress <em>Listen Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listen Address</em>' reference.
	 * @see #getListenAddress()
	 * @generated
	 */
	void setListenAddress(ProcessingNode value);

	/**
	 * Returns the value of the '<em><b>Rpc Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc Address</em>' reference.
	 * @see #setRpcAddress(ProcessingNode)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_RpcAddress()
	 * @model
	 * @generated
	 */
	ProcessingNode getRpcAddress();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getRpcAddress <em>Rpc Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc Address</em>' reference.
	 * @see #getRpcAddress()
	 * @generated
	 */
	void setRpcAddress(ProcessingNode value);

	/**
	 * Returns the value of the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * The default value is <code>"SimpleSnitch"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Snitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #setEndpointSnitch(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_EndpointSnitch()
	 * @model default="SimpleSnitch"
	 * @generated
	 */
	String getEndpointSnitch();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getEndpointSnitch <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #getEndpointSnitch()
	 * @generated
	 */
	void setEndpointSnitch(String value);

	/**
	 * Returns the value of the '<em><b>Data Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' reference.
	 * @see #setDataCenter(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_DataCenter()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getDataCenter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getDataCenter <em>Data Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' reference.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(ResourceCluster value);

	/**
	 * Returns the value of the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.FileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cql Schemas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cql Schemas</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_CqlSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileDescriptor> getCqlSchemas();

	/**
	 * Returns the value of the '<em><b>Is Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Seed</em>' attribute.
	 * @see #setIsSeed(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_IsSeed()
	 * @model
	 * @generated
	 */
	boolean isIsSeed();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#isIsSeed <em>Is Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Seed</em>' attribute.
	 * @see #isIsSeed()
	 * @generated
	 */
	void setIsSeed(boolean value);

	/**
	 * Returns the value of the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Dir</em>' attribute.
	 * @see #setDataFileDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_DataFileDir()
	 * @model required="true"
	 * @generated
	 */
	String getDataFileDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getDataFileDir <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data File Dir</em>' attribute.
	 * @see #getDataFileDir()
	 * @generated
	 */
	void setDataFileDir(String value);

	/**
	 * Returns the value of the '<em><b>Native Transport Port</b></em>' attribute.
	 * The default value is <code>"9042"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Transport Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Transport Port</em>' attribute.
	 * @see #setNativeTransportPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_NativeTransportPort()
	 * @model default="9042"
	 * @generated
	 */
	int getNativeTransportPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getNativeTransportPort <em>Native Transport Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Transport Port</em>' attribute.
	 * @see #getNativeTransportPort()
	 * @generated
	 */
	void setNativeTransportPort(int value);

	/**
	 * Returns the value of the '<em><b>Rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack</em>' reference.
	 * @see #setRack(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_Rack()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getRack();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#getRack <em>Rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack</em>' reference.
	 * @see #getRack()
	 * @generated
	 */
	void setRack(ResourceCluster value);

	/**
	 * Returns the value of the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Bootstrap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #setAutoBootstrap(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraServer_AutoBootstrap()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutoBootstrap();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraServer#isAutoBootstrap <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #isAutoBootstrap()
	 * @generated
	 */
	void setAutoBootstrap(boolean value);
} // CassandraServer
