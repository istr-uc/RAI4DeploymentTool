/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.NamedElement;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingResourceCluster;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.StormSupervisor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storm Supervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl#getName <em>Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl#getId <em>Id</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StormSupervisorImpl#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormSupervisorImpl extends DeployableComponentImpl implements StormSupervisor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupervisorSlotPorts() <em>Supervisor Slot Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorSlotPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supervisorSlotPorts;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceCluster host;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormSupervisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STORM_SUPERVISOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SUPERVISOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SUPERVISOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupervisorSlotPorts() {
		if (supervisorSlotPorts == null) {
			supervisorSlotPorts = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS);
		}
		return supervisorSlotPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormService getOwner() {
		if (eContainerFeatureID() != PasysPackage.STORM_SUPERVISOR__OWNER) return null;
		return (StormService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(StormService newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.STORM_SUPERVISOR__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(StormService newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.STORM_SUPERVISOR__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.STORM_SERVICE__SUPERVISOR, StormService.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SUPERVISOR__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingResourceCluster getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (ProcessingResourceCluster)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STORM_SUPERVISOR__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceCluster basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(ProcessingResourceCluster newHost) {
		ProcessingResourceCluster oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STORM_SUPERVISOR__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((StormService)otherEnd, msgs);
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
			case PasysPackage.STORM_SUPERVISOR__OWNER:
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
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.STORM_SERVICE__SUPERVISOR, StormService.class, msgs);
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
			case PasysPackage.STORM_SUPERVISOR__NAME:
				return getName();
			case PasysPackage.STORM_SUPERVISOR__ID:
				return getId();
			case PasysPackage.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS:
				return getSupervisorSlotPorts();
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				return getOwner();
			case PasysPackage.STORM_SUPERVISOR__HOST:
				if (resolve) return getHost();
				return basicGetHost();
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
			case PasysPackage.STORM_SUPERVISOR__NAME:
				setName((String)newValue);
				return;
			case PasysPackage.STORM_SUPERVISOR__ID:
				setId((String)newValue);
				return;
			case PasysPackage.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				getSupervisorSlotPorts().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				setOwner((StormService)newValue);
				return;
			case PasysPackage.STORM_SUPERVISOR__HOST:
				setHost((ProcessingResourceCluster)newValue);
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
			case PasysPackage.STORM_SUPERVISOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PasysPackage.STORM_SUPERVISOR__ID:
				setId(ID_EDEFAULT);
				return;
			case PasysPackage.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS:
				getSupervisorSlotPorts().clear();
				return;
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				setOwner((StormService)null);
				return;
			case PasysPackage.STORM_SUPERVISOR__HOST:
				setHost((ProcessingResourceCluster)null);
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
			case PasysPackage.STORM_SUPERVISOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PasysPackage.STORM_SUPERVISOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PasysPackage.STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS:
				return supervisorSlotPorts != null && !supervisorSlotPorts.isEmpty();
			case PasysPackage.STORM_SUPERVISOR__OWNER:
				return getOwner() != null;
			case PasysPackage.STORM_SUPERVISOR__HOST:
				return host != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case PasysPackage.STORM_SUPERVISOR__NAME: return PasysPackage.NAMED_ELEMENT__NAME;
				case PasysPackage.STORM_SUPERVISOR__ID: return PasysPackage.NAMED_ELEMENT__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case PasysPackage.NAMED_ELEMENT__NAME: return PasysPackage.STORM_SUPERVISOR__NAME;
				case PasysPackage.NAMED_ELEMENT__ID: return PasysPackage.STORM_SUPERVISOR__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", supervisorSlotPorts: ");
		result.append(supervisorSlotPorts);
		result.append(')');
		return result.toString();
	}

} //StormSupervisorImpl
