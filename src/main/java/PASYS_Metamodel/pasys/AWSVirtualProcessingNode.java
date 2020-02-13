/**
 */
package PASYS_Metamodel.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AWS Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getVpc <em>Vpc</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSubNet <em>Sub Net</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getKeyPair <em>Key Pair</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getAMI <em>AMI</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode()
 * @model
 * @generated
 */
public interface AWSVirtualProcessingNode extends VirtualProcessingNode {
	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' attribute.
	 * @see #setVpc(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_Vpc()
	 * @model required="true"
	 * @generated
	 */
	String getVpc();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getVpc <em>Vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' attribute.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(String value);

	/**
	 * Returns the value of the '<em><b>Sub Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Net</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Net</em>' attribute.
	 * @see #setSubNet(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_SubNet()
	 * @model required="true"
	 * @generated
	 */
	String getSubNet();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSubNet <em>Sub Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Net</em>' attribute.
	 * @see #getSubNet()
	 * @generated
	 */
	void setSubNet(String value);

	/**
	 * Returns the value of the '<em><b>Key Pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Pair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Pair</em>' attribute.
	 * @see #setKeyPair(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_KeyPair()
	 * @model required="true"
	 * @generated
	 */
	String getKeyPair();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getKeyPair <em>Key Pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Pair</em>' attribute.
	 * @see #getKeyPair()
	 * @generated
	 */
	void setKeyPair(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_SecurityGroup()
	 * @model required="true"
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>AMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AMI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AMI</em>' attribute.
	 * @see #setAMI(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_AMI()
	 * @model required="true"
	 * @generated
	 */
	String getAMI();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getAMI <em>AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AMI</em>' attribute.
	 * @see #getAMI()
	 * @generated
	 */
	void setAMI(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see PASYS_Metamodel.pasys.PasysPackage#getAWSVirtualProcessingNode_InstanceType()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link PASYS_Metamodel.pasys.AWSVirtualProcessingNode#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

} // AWSVirtualProcessingNode
