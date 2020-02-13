/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.AWSVirtualProcessingNode;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AWS Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getSubNet <em>Sub Net</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getKeyPair <em>Key Pair</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getAMI <em>AMI</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.AWSVirtualProcessingNodeImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AWSVirtualProcessingNodeImpl extends VirtualProcessingNodeImpl implements AWSVirtualProcessingNode {
	/**
	 * The default value of the '{@link #getVpc() <em>Vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected String vpc = VPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubNet() <em>Sub Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_NET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubNet() <em>Sub Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNet()
	 * @generated
	 * @ordered
	 */
	protected String subNet = SUB_NET_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPair() <em>Key Pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPair()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PAIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPair() <em>Key Pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPair()
	 * @generated
	 * @ordered
	 */
	protected String keyPair = KEY_PAIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected String securityGroup = SECURITY_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAMI() <em>AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMI()
	 * @generated
	 * @ordered
	 */
	protected static final String AMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAMI() <em>AMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMI()
	 * @generated
	 * @ordered
	 */
	protected String ami = AMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWSVirtualProcessingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpc() {
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpc(String newVpc) {
		String oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC, oldVpc, vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubNet() {
		return subNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubNet(String newSubNet) {
		String oldSubNet = subNet;
		subNet = newSubNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET, oldSubNet, subNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyPair() {
		return keyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPair(String newKeyPair) {
		String oldKeyPair = keyPair;
		keyPair = newKeyPair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR, oldKeyPair, keyPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroup(String newSecurityGroup) {
		String oldSecurityGroup = securityGroup;
		securityGroup = newSecurityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP, oldSecurityGroup, securityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAMI() {
		return ami;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAMI(String newAMI) {
		String oldAMI = ami;
		ami = newAMI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI, oldAMI, ami));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(String newInstanceType) {
		String oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE, oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC:
				return getVpc();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET:
				return getSubNet();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR:
				return getKeyPair();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP:
				return getSecurityGroup();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI:
				return getAMI();
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE:
				return getInstanceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC:
				setVpc((String)newValue);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET:
				setSubNet((String)newValue);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR:
				setKeyPair((String)newValue);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP:
				setSecurityGroup((String)newValue);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI:
				setAMI((String)newValue);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE:
				setInstanceType((String)newValue);
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
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC:
				setVpc(VPC_EDEFAULT);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET:
				setSubNet(SUB_NET_EDEFAULT);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR:
				setKeyPair(KEY_PAIR_EDEFAULT);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP:
				setSecurityGroup(SECURITY_GROUP_EDEFAULT);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI:
				setAMI(AMI_EDEFAULT);
				return;
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
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
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC:
				return VPC_EDEFAULT == null ? vpc != null : !VPC_EDEFAULT.equals(vpc);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET:
				return SUB_NET_EDEFAULT == null ? subNet != null : !SUB_NET_EDEFAULT.equals(subNet);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR:
				return KEY_PAIR_EDEFAULT == null ? keyPair != null : !KEY_PAIR_EDEFAULT.equals(keyPair);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI:
				return AMI_EDEFAULT == null ? ami != null : !AMI_EDEFAULT.equals(ami);
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vpc: ");
		result.append(vpc);
		result.append(", subNet: ");
		result.append(subNet);
		result.append(", keyPair: ");
		result.append(keyPair);
		result.append(", securityGroup: ");
		result.append(securityGroup);
		result.append(", AMI: ");
		result.append(ami);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(')');
		return result.toString();
	}

} //AWSVirtualProcessingNodeImpl
