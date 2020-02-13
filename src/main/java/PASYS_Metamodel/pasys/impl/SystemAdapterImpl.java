/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ComputationalSystem;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SystemAdapter;
import PASYS_Metamodel.pasys.SystemElementAdapter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl#getIdPrefix <em>Id Prefix</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl#getElemMapping <em>Elem Mapping</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl#getSystemTarget <em>System Target</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.SystemAdapterImpl#getTargetSysLocator <em>Target Sys Locator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAdapterImpl extends MinimalEObjectImpl.Container implements SystemAdapter {
	/**
	 * The default value of the '{@link #getIdPrefix() <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdPrefix() <em>Id Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPrefix()
	 * @generated
	 * @ordered
	 */
	protected String idPrefix = ID_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElemMapping() <em>Elem Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElementAdapter> elemMapping;

	/**
	 * The default value of the '{@link #getTargetSysLocator() <em>Target Sys Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSysLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SYS_LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSysLocator() <em>Target Sys Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSysLocator()
	 * @generated
	 * @ordered
	 */
	protected String targetSysLocator = TARGET_SYS_LOCATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SYSTEM_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdPrefix() {
		return idPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdPrefix(String newIdPrefix) {
		String oldIdPrefix = idPrefix;
		idPrefix = newIdPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ADAPTER__ID_PREFIX, oldIdPrefix, idPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ADAPTER__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemElementAdapter> getElemMapping() {
		if (elemMapping == null) {
			elemMapping = new EObjectContainmentEList<SystemElementAdapter>(SystemElementAdapter.class, this, PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING);
		}
		return elemMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputationalSystem getSystemTarget() {
		if (eContainerFeatureID() != PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET) return null;
		return (ComputationalSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemTarget(ComputationalSystem newSystemTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystemTarget, PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemTarget(ComputationalSystem newSystemTarget) {
		if (newSystemTarget != eInternalContainer() || (eContainerFeatureID() != PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET && newSystemTarget != null)) {
			if (EcoreUtil.isAncestor(this, newSystemTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystemTarget != null)
				msgs = ((InternalEObject)newSystemTarget).eInverseAdd(this, PasysPackage.COMPUTATIONAL_SYSTEM__REFERENCED_SYSTEMS, ComputationalSystem.class, msgs);
			msgs = basicSetSystemTarget(newSystemTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET, newSystemTarget, newSystemTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetSysLocator() {
		return targetSysLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetSysLocator(String newTargetSysLocator) {
		String oldTargetSysLocator = targetSysLocator;
		targetSysLocator = newTargetSysLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SYSTEM_ADAPTER__TARGET_SYS_LOCATOR, oldTargetSysLocator, targetSysLocator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystemTarget((ComputationalSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING:
				return ((InternalEList<?>)getElemMapping()).basicRemove(otherEnd, msgs);
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				return basicSetSystemTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				return eInternalContainer().eInverseRemove(this, PasysPackage.COMPUTATIONAL_SYSTEM__REFERENCED_SYSTEMS, ComputationalSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.SYSTEM_ADAPTER__ID_PREFIX:
				return getIdPrefix();
			case PasysPackage.SYSTEM_ADAPTER__PREFIX:
				return getPrefix();
			case PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING:
				return getElemMapping();
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				return getSystemTarget();
			case PasysPackage.SYSTEM_ADAPTER__TARGET_SYS_LOCATOR:
				return getTargetSysLocator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.SYSTEM_ADAPTER__ID_PREFIX:
				setIdPrefix((String)newValue);
				return;
			case PasysPackage.SYSTEM_ADAPTER__PREFIX:
				setPrefix((String)newValue);
				return;
			case PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING:
				getElemMapping().clear();
				getElemMapping().addAll((Collection<? extends SystemElementAdapter>)newValue);
				return;
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				setSystemTarget((ComputationalSystem)newValue);
				return;
			case PasysPackage.SYSTEM_ADAPTER__TARGET_SYS_LOCATOR:
				setTargetSysLocator((String)newValue);
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
			case PasysPackage.SYSTEM_ADAPTER__ID_PREFIX:
				setIdPrefix(ID_PREFIX_EDEFAULT);
				return;
			case PasysPackage.SYSTEM_ADAPTER__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING:
				getElemMapping().clear();
				return;
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				setSystemTarget((ComputationalSystem)null);
				return;
			case PasysPackage.SYSTEM_ADAPTER__TARGET_SYS_LOCATOR:
				setTargetSysLocator(TARGET_SYS_LOCATOR_EDEFAULT);
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
			case PasysPackage.SYSTEM_ADAPTER__ID_PREFIX:
				return ID_PREFIX_EDEFAULT == null ? idPrefix != null : !ID_PREFIX_EDEFAULT.equals(idPrefix);
			case PasysPackage.SYSTEM_ADAPTER__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case PasysPackage.SYSTEM_ADAPTER__ELEM_MAPPING:
				return elemMapping != null && !elemMapping.isEmpty();
			case PasysPackage.SYSTEM_ADAPTER__SYSTEM_TARGET:
				return getSystemTarget() != null;
			case PasysPackage.SYSTEM_ADAPTER__TARGET_SYS_LOCATOR:
				return TARGET_SYS_LOCATOR_EDEFAULT == null ? targetSysLocator != null : !TARGET_SYS_LOCATOR_EDEFAULT.equals(targetSysLocator);
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
		result.append(" (idPrefix: ");
		result.append(idPrefix);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", targetSysLocator: ");
		result.append(targetSysLocator);
		result.append(')');
		return result.toString();
	}

} //SystemAdapterImpl
