/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getArguments <em>Arguments</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.SystemComponent#isIsRunning <em>Is Running</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent()
 * @model abstract="true"
 * @generated
 */
public interface SystemComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_ArtifactName()
	 * @model
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Locator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Locator</em>' attribute.
	 * @see #setArtifactLocator(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_ArtifactLocator()
	 * @model
	 * @generated
	 */
	String getArtifactLocator();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getArtifactLocator <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Locator</em>' attribute.
	 * @see #getArtifactLocator()
	 * @generated
	 */
	void setArtifactLocator(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

	/**
	 * Returns the value of the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Folder Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Folder Path</em>' attribute.
	 * @see #setScriptFolderPath(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_ScriptFolderPath()
	 * @model
	 * @generated
	 */
	String getScriptFolderPath();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getScriptFolderPath <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Folder Path</em>' attribute.
	 * @see #getScriptFolderPath()
	 * @generated
	 */
	void setScriptFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Folder Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Folder Path</em>' attribute.
	 * @see #setConfigFolderPath(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_ConfigFolderPath()
	 * @model
	 * @generated
	 */
	String getConfigFolderPath();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getConfigFolderPath <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Folder Path</em>' attribute.
	 * @see #getConfigFolderPath()
	 * @generated
	 */
	void setConfigFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Folder Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Folder Path</em>' attribute.
	 * @see #setDataFolderPath(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_DataFolderPath()
	 * @model
	 * @generated
	 */
	String getDataFolderPath();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getDataFolderPath <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Folder Path</em>' attribute.
	 * @see #getDataFolderPath()
	 * @generated
	 */
	void setDataFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Folder Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Folder Path</em>' attribute.
	 * @see #setLogFolderPath(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_LogFolderPath()
	 * @model
	 * @generated
	 */
	String getLogFolderPath();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#getLogFolderPath <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Folder Path</em>' attribute.
	 * @see #getLogFolderPath()
	 * @generated
	 */
	void setLogFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running</em>' attribute.
	 * @see #setIsRunning(boolean)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getSystemComponent_IsRunning()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsRunning();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.SystemComponent#isIsRunning <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Running</em>' attribute.
	 * @see #isIsRunning()
	 * @generated
	 */
	void setIsRunning(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="PASYS_Metamodel.pasys.ConfigurationException"
	 * @generated
	 */
	void deploy() throws ConfigurationException;

} // SystemComponent
