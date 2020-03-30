/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getStack <em>Stack</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getEnvFile <em>Env File</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getEnv <em>Env</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getImage <em>Image</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getPorts <em>Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getNetworks <em>Networks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getDeploymentParam <em>Deployment Param</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.Service#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Stack</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PASYS_Metamodel.pasys.Stack#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' container reference.
	 * @see #setStack(Stack)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Stack()
	 * @see PASYS_Metamodel.pasys.Stack#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	Stack getStack();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Service#getStack <em>Stack</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' container reference.
	 * @see #getStack()
	 * @generated
	 */
	void setStack(Stack value);

	/**
	 * Returns the value of the '<em><b>Env File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env File</em>' attribute.
	 * @see #setEnvFile(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_EnvFile()
	 * @model
	 * @generated
	 */
	String getEnvFile();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Service#getEnvFile <em>Env File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env File</em>' attribute.
	 * @see #getEnvFile()
	 * @generated
	 */
	void setEnvFile(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' map.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Env()
	 * @model mapType="PASYS_Metamodel.pasys.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getEnv();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_DependsOn()
	 * @model
	 * @generated
	 */
	EList<Service> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Image)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Image()
	 * @model required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Service#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Volume}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.ServiceNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceNetwork> getNetworks();

	/**
	 * Returns the value of the '<em><b>Deployment Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Param</em>' containment reference.
	 * @see #setDeploymentParam(Deployment)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_DeploymentParam()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Deployment getDeploymentParam();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Service#getDeploymentParam <em>Deployment Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Param</em>' containment reference.
	 * @see #getDeploymentParam()
	 * @generated
	 */
	void setDeploymentParam(Deployment value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getService_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.Service#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

} // Service
