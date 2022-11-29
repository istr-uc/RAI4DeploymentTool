/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cassandra Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getSeeds <em>Seeds</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getStoragePort <em>Storage Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getDataCenters <em>Data Centers</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService()
 * @model
 * @generated
 */
public interface CassandraService extends PersistenceService {
	/**
	 * Returns the value of the '<em><b>Num Tokens</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tokens</em>' attribute.
	 * @see #setNumTokens(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_NumTokens()
	 * @model default="256" required="true"
	 * @generated
	 */
	int getNumTokens();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seeds</em>' reference.
	 * @see #setSeeds(NodeCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_Seeds()
	 * @model
	 * @generated
	 */
	NodeCluster getSeeds();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getSeeds <em>Seeds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seeds</em>' reference.
	 * @see #getSeeds()
	 * @generated
	 */
	void setSeeds(NodeCluster value);

	/**
	 * Returns the value of the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #setSeedProviderClass(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_SeedProviderClass()
	 * @model
	 * @generated
	 */
	String getSeedProviderClass();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #getSeedProviderClass()
	 * @generated
	 */
	void setSeedProviderClass(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * The default value is <code>"SimpleSnitch"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #setEndpointSnitch(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_EndpointSnitch()
	 * @model default="SimpleSnitch"
	 * @generated
	 */
	String getEndpointSnitch();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #getEndpointSnitch()
	 * @generated
	 */
	void setEndpointSnitch(String value);

	/**
	 * Returns the value of the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Dir</em>' attribute.
	 * @see #setDataFileDir(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_DataFileDir()
	 * @model required="true"
	 * @generated
	 */
	String getDataFileDir();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data File Dir</em>' attribute.
	 * @see #getDataFileDir()
	 * @generated
	 */
	void setDataFileDir(String value);

	/**
	 * Returns the value of the '<em><b>Storage Port</b></em>' attribute.
	 * The default value is <code>"7000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Port</em>' attribute.
	 * @see #setStoragePort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_StoragePort()
	 * @model default="7000" required="true"
	 * @generated
	 */
	int getStoragePort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getStoragePort <em>Storage Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Port</em>' attribute.
	 * @see #getStoragePort()
	 * @generated
	 */
	void setStoragePort(int value);

	/**
	 * Returns the value of the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #setAutoBootstrap(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_AutoBootstrap()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutoBootstrap();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #isAutoBootstrap()
	 * @generated
	 */
	void setAutoBootstrap(boolean value);

	/**
	 * Returns the value of the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.FileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cql Schemas</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_CqlSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileDescriptor> getCqlSchemas();

	/**
	 * Returns the value of the '<em><b>Data Centers</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.DataCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Centers</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_DataCenters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataCenter> getDataCenters();

	/**
	 * Returns the value of the '<em><b>Ssl Storage Port</b></em>' attribute.
	 * The default value is <code>"7001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Storage Port</em>' attribute.
	 * @see #setSslStoragePort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_SslStoragePort()
	 * @model default="7001" required="true"
	 * @generated
	 */
	int getSslStoragePort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Storage Port</em>' attribute.
	 * @see #getSslStoragePort()
	 * @generated
	 */
	void setSslStoragePort(int value);

	/**
	 * Returns the value of the '<em><b>Rpc Port</b></em>' attribute.
	 * The default value is <code>"9160"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc Port</em>' attribute.
	 * @see #setRpcPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_RpcPort()
	 * @model default="9160" required="true"
	 * @generated
	 */
	int getRpcPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc Port</em>' attribute.
	 * @see #getRpcPort()
	 * @generated
	 */
	void setRpcPort(int value);

} // CassandraService
