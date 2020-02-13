/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.Workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskImpl#getImplementingClassName <em>Implementing Class Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskImpl#getReturnedStreamData <em>Returned Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskImpl#getTriggerStreamData <em>Trigger Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskImpl#getInputStreamData <em>Input Stream Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
	/**
	 * The default value of the '{@link #getImplementingClassName() <em>Implementing Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTING_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementingClassName() <em>Implementing Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClassName()
	 * @generated
	 * @ordered
	 */
	protected String implementingClassName = IMPLEMENTING_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnedStreamData() <em>Returned Stream Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedStreamData()
	 * @generated
	 * @ordered
	 */
	protected StreamData returnedStreamData;

	/**
	 * The cached value of the '{@link #getTriggerStreamData() <em>Trigger Stream Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerStreamData()
	 * @generated
	 * @ordered
	 */
	protected StreamData triggerStreamData;

	/**
	 * The cached value of the '{@link #getInputStreamData() <em>Input Stream Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStreamData()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamData> inputStreamData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementingClassName() {
		return implementingClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementingClassName(String newImplementingClassName) {
		String oldImplementingClassName = implementingClassName;
		implementingClassName = newImplementingClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK__IMPLEMENTING_CLASS_NAME, oldImplementingClassName, implementingClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamData getReturnedStreamData() {
		if (returnedStreamData != null && returnedStreamData.eIsProxy()) {
			InternalEObject oldReturnedStreamData = (InternalEObject)returnedStreamData;
			returnedStreamData = (StreamData)eResolveProxy(oldReturnedStreamData);
			if (returnedStreamData != oldReturnedStreamData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.TASK__RETURNED_STREAM_DATA, oldReturnedStreamData, returnedStreamData));
			}
		}
		return returnedStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamData basicGetReturnedStreamData() {
		return returnedStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnedStreamData(StreamData newReturnedStreamData) {
		StreamData oldReturnedStreamData = returnedStreamData;
		returnedStreamData = newReturnedStreamData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK__RETURNED_STREAM_DATA, oldReturnedStreamData, returnedStreamData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamData getTriggerStreamData() {
		if (triggerStreamData != null && triggerStreamData.eIsProxy()) {
			InternalEObject oldTriggerStreamData = (InternalEObject)triggerStreamData;
			triggerStreamData = (StreamData)eResolveProxy(oldTriggerStreamData);
			if (triggerStreamData != oldTriggerStreamData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.TASK__TRIGGER_STREAM_DATA, oldTriggerStreamData, triggerStreamData));
			}
		}
		return triggerStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamData basicGetTriggerStreamData() {
		return triggerStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerStreamData(StreamData newTriggerStreamData) {
		StreamData oldTriggerStreamData = triggerStreamData;
		triggerStreamData = newTriggerStreamData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK__TRIGGER_STREAM_DATA, oldTriggerStreamData, triggerStreamData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getOwner() {
		if (eContainerFeatureID() != PasysPackage.TASK__OWNER) return null;
		return (Workflow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Workflow newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.TASK__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Workflow newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.TASK__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.WORKFLOW__OWNED_TASKS, Workflow.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StreamData> getInputStreamData() {
		if (inputStreamData == null) {
			inputStreamData = new EObjectResolvingEList<StreamData>(StreamData.class, this, PasysPackage.TASK__INPUT_STREAM_DATA);
		}
		return inputStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.TASK__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Workflow)otherEnd, msgs);
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
			case PasysPackage.TASK__OWNER:
				return basicSetOwner(null, msgs);
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
			case PasysPackage.TASK__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.WORKFLOW__OWNED_TASKS, Workflow.class, msgs);
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
			case PasysPackage.TASK__OWNER:
				return getOwner();
			case PasysPackage.TASK__IMPLEMENTING_CLASS_NAME:
				return getImplementingClassName();
			case PasysPackage.TASK__RETURNED_STREAM_DATA:
				if (resolve) return getReturnedStreamData();
				return basicGetReturnedStreamData();
			case PasysPackage.TASK__TRIGGER_STREAM_DATA:
				if (resolve) return getTriggerStreamData();
				return basicGetTriggerStreamData();
			case PasysPackage.TASK__INPUT_STREAM_DATA:
				return getInputStreamData();
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
			case PasysPackage.TASK__OWNER:
				setOwner((Workflow)newValue);
				return;
			case PasysPackage.TASK__IMPLEMENTING_CLASS_NAME:
				setImplementingClassName((String)newValue);
				return;
			case PasysPackage.TASK__RETURNED_STREAM_DATA:
				setReturnedStreamData((StreamData)newValue);
				return;
			case PasysPackage.TASK__TRIGGER_STREAM_DATA:
				setTriggerStreamData((StreamData)newValue);
				return;
			case PasysPackage.TASK__INPUT_STREAM_DATA:
				getInputStreamData().clear();
				getInputStreamData().addAll((Collection<? extends StreamData>)newValue);
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
			case PasysPackage.TASK__OWNER:
				setOwner((Workflow)null);
				return;
			case PasysPackage.TASK__IMPLEMENTING_CLASS_NAME:
				setImplementingClassName(IMPLEMENTING_CLASS_NAME_EDEFAULT);
				return;
			case PasysPackage.TASK__RETURNED_STREAM_DATA:
				setReturnedStreamData((StreamData)null);
				return;
			case PasysPackage.TASK__TRIGGER_STREAM_DATA:
				setTriggerStreamData((StreamData)null);
				return;
			case PasysPackage.TASK__INPUT_STREAM_DATA:
				getInputStreamData().clear();
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
			case PasysPackage.TASK__OWNER:
				return getOwner() != null;
			case PasysPackage.TASK__IMPLEMENTING_CLASS_NAME:
				return IMPLEMENTING_CLASS_NAME_EDEFAULT == null ? implementingClassName != null : !IMPLEMENTING_CLASS_NAME_EDEFAULT.equals(implementingClassName);
			case PasysPackage.TASK__RETURNED_STREAM_DATA:
				return returnedStreamData != null;
			case PasysPackage.TASK__TRIGGER_STREAM_DATA:
				return triggerStreamData != null;
			case PasysPackage.TASK__INPUT_STREAM_DATA:
				return inputStreamData != null && !inputStreamData.isEmpty();
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
		result.append(" (implementingClassName: ");
		result.append(implementingClassName);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
