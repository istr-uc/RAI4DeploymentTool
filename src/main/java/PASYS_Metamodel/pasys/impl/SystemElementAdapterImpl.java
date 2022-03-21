/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SystemElementAdapter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Element Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl#getElemName <em>Elem Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl#getSourceElemId <em>Source Elem Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemElementAdapterImpl#getTargetElemId <em>Target Elem Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemElementAdapterImpl extends MinimalEObjectImpl.Container implements SystemElementAdapter {
	/**
	 * The default value of the '{@link #getElemName() <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElemName() <em>Elem Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemName()
	 * @generated
	 * @ordered
	 */
	protected String elemName = ELEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceElemId() <em>Source Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElemId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ELEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceElemId() <em>Source Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElemId()
	 * @generated
	 * @ordered
	 */
	protected String sourceElemId = SOURCE_ELEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElemId() <em>Target Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElemId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ELEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetElemId() <em>Target Elem Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElemId()
	 * @generated
	 * @ordered
	 */
	protected String targetElemId = TARGET_ELEM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemElementAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SYSTEM_ELEMENT_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElemName() {
		return elemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElemName(String newElemName) {
		String oldElemName = elemName;
		elemName = newElemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ELEMENT_ADAPTER__ELEM_NAME, oldElemName, elemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceElemId() {
		return sourceElemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceElemId(String newSourceElemId) {
		String oldSourceElemId = sourceElemId;
		sourceElemId = newSourceElemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID, oldSourceElemId, sourceElemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetElemId() {
		return targetElemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElemId(String newTargetElemId) {
		String oldTargetElemId = targetElemId;
		targetElemId = newTargetElemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID, oldTargetElemId, targetElemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__ELEM_NAME:
				return getElemName();
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID:
				return getSourceElemId();
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID:
				return getTargetElemId();
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
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__ELEM_NAME:
				setElemName((String)newValue);
				return;
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID:
				setSourceElemId((String)newValue);
				return;
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID:
				setTargetElemId((String)newValue);
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
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__ELEM_NAME:
				setElemName(ELEM_NAME_EDEFAULT);
				return;
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID:
				setSourceElemId(SOURCE_ELEM_ID_EDEFAULT);
				return;
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID:
				setTargetElemId(TARGET_ELEM_ID_EDEFAULT);
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
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__ELEM_NAME:
				return ELEM_NAME_EDEFAULT == null ? elemName != null : !ELEM_NAME_EDEFAULT.equals(elemName);
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__SOURCE_ELEM_ID:
				return SOURCE_ELEM_ID_EDEFAULT == null ? sourceElemId != null : !SOURCE_ELEM_ID_EDEFAULT.equals(sourceElemId);
			case PasysPackage.SYSTEM_ELEMENT_ADAPTER__TARGET_ELEM_ID:
				return TARGET_ELEM_ID_EDEFAULT == null ? targetElemId != null : !TARGET_ELEM_ID_EDEFAULT.equals(targetElemId);
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
		result.append(" (elemName: ");
		result.append(elemName);
		result.append(", sourceElemId: ");
		result.append(sourceElemId);
		result.append(", targetElemId: ");
		result.append(targetElemId);
		result.append(')');
		return result.toString();
	}

} //SystemElementAdapterImpl
