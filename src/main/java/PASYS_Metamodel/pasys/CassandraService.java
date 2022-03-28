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
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getDataCenter <em>Data Center</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getNativeTransportPort <em>Native Transport Port</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getRack <em>Rack</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#isIsSeed <em>Is Seed</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.CassandraService#getDataCenters <em>Data Centers</em>}</li>
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
	 * @see #setSeeds(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_Seeds()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getSeeds();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getSeeds <em>Seeds</em>}' reference.
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
	 * Returns the value of the '<em><b>Data Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' reference.
	 * @see #setDataCenter(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_DataCenter()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getDataCenter();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getDataCenter <em>Data Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' reference.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(ResourceCluster value);

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
	 * Returns the value of the '<em><b>Native Transport Port</b></em>' attribute.
	 * The default value is <code>"9042"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Transport Port</em>' attribute.
	 * @see #setNativeTransportPort(int)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_NativeTransportPort()
	 * @model default="9042" required="true"
	 * @generated
	 */
	int getNativeTransportPort();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getNativeTransportPort <em>Native Transport Port</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack</em>' reference.
	 * @see #setRack(ResourceCluster)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_Rack()
	 * @model required="true"
	 * @generated
	 */
	ResourceCluster getRack();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#getRack <em>Rack</em>}' reference.
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
	 * Returns the value of the '<em><b>Is Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Seed</em>' attribute.
	 * @see #setIsSeed(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_IsSeed()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSeed();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.CassandraService#isIsSeed <em>Is Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Seed</em>' attribute.
	 * @see #isIsSeed()
	 * @generated
	 */
	void setIsSeed(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Centers</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.DataCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Centers</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getCassandraService_DataCenters()
	 * @model required="true"
	 * @generated
	 */
	EList<DataCenter> getDataCenters();

} // CassandraService
