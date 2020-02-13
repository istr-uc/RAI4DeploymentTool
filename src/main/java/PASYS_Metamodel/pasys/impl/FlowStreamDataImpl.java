/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.CommunicationServer;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.FlowStreamDataImpl#isIsImplemented <em>Is Implemented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowStreamDataImpl extends WorkflowStreamDataImpl implements FlowStreamData {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StreamData source;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected StreamData predecessor;

	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected CommunicationServer holder;

	/**
	 * The default value of the '{@link #isIsImplemented() <em>Is Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplemented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLEMENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImplemented() <em>Is Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplemented()
	 * @generated
	 * @ordered
	 */
	protected boolean isImplemented = IS_IMPLEMENTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowStreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.FLOW_STREAM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamData getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (StreamData)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.FLOW_STREAM_DATA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamData basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(StreamData newSource) {
		StreamData oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.FLOW_STREAM_DATA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamData getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (StreamData)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.FLOW_STREAM_DATA__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamData basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecessor(StreamData newPredecessor) {
		StreamData oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.FLOW_STREAM_DATA__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServer getHolder() {
		if (holder != null && holder.eIsProxy()) {
			InternalEObject oldHolder = (InternalEObject)holder;
			holder = (CommunicationServer)eResolveProxy(oldHolder);
			if (holder != oldHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.FLOW_STREAM_DATA__HOLDER, oldHolder, holder));
			}
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationServer basicGetHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHolder(CommunicationServer newHolder) {
		CommunicationServer oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.FLOW_STREAM_DATA__HOLDER, oldHolder, holder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImplemented() {
		return isImplemented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImplemented(boolean newIsImplemented) {
		boolean oldIsImplemented = isImplemented;
		isImplemented = newIsImplemented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.FLOW_STREAM_DATA__IS_IMPLEMENTED, oldIsImplemented, isImplemented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.FLOW_STREAM_DATA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PasysPackage.FLOW_STREAM_DATA__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case PasysPackage.FLOW_STREAM_DATA__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
			case PasysPackage.FLOW_STREAM_DATA__IS_IMPLEMENTED:
				return isIsImplemented();
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
			case PasysPackage.FLOW_STREAM_DATA__SOURCE:
				setSource((StreamData)newValue);
				return;
			case PasysPackage.FLOW_STREAM_DATA__PREDECESSOR:
				setPredecessor((StreamData)newValue);
				return;
			case PasysPackage.FLOW_STREAM_DATA__HOLDER:
				setHolder((CommunicationServer)newValue);
				return;
			case PasysPackage.FLOW_STREAM_DATA__IS_IMPLEMENTED:
				setIsImplemented((Boolean)newValue);
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
			case PasysPackage.FLOW_STREAM_DATA__SOURCE:
				setSource((StreamData)null);
				return;
			case PasysPackage.FLOW_STREAM_DATA__PREDECESSOR:
				setPredecessor((StreamData)null);
				return;
			case PasysPackage.FLOW_STREAM_DATA__HOLDER:
				setHolder((CommunicationServer)null);
				return;
			case PasysPackage.FLOW_STREAM_DATA__IS_IMPLEMENTED:
				setIsImplemented(IS_IMPLEMENTED_EDEFAULT);
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
			case PasysPackage.FLOW_STREAM_DATA__SOURCE:
				return source != null;
			case PasysPackage.FLOW_STREAM_DATA__PREDECESSOR:
				return predecessor != null;
			case PasysPackage.FLOW_STREAM_DATA__HOLDER:
				return holder != null;
			case PasysPackage.FLOW_STREAM_DATA__IS_IMPLEMENTED:
				return isImplemented != IS_IMPLEMENTED_EDEFAULT;
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
		result.append(" (isImplemented: ");
		result.append(isImplemented);
		result.append(')');
		return result.toString();
	}

} //FlowStreamDataImpl
