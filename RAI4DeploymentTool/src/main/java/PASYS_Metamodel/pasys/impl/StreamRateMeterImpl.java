/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.StreamData;
import PASYS_Metamodel.pasys.StreamDataRate;
import PASYS_Metamodel.pasys.StreamRateMeter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Rate Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamRateMeterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.StreamRateMeterImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamRateMeterImpl extends PrometheusMeterImpl implements StreamRateMeter {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected StreamDataRate metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamRateMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.STREAM_RATE_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamData getOwner() {
		if (eContainerFeatureID() != PasysPackage.STREAM_RATE_METER__OWNER) return null;
		return (StreamData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(StreamData newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.STREAM_RATE_METER__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(StreamData newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.STREAM_RATE_METER__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.STREAM_DATA__OWNED_METERS, StreamData.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_RATE_METER__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamDataRate getMetric() {
		if (metric != null && metric.eIsProxy()) {
			InternalEObject oldMetric = (InternalEObject)metric;
			metric = (StreamDataRate)eResolveProxy(oldMetric);
			if (metric != oldMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.STREAM_RATE_METER__METRIC, oldMetric, metric));
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamDataRate basicGetMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(StreamDataRate newMetric, NotificationChain msgs) {
		StreamDataRate oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_RATE_METER__METRIC, oldMetric, newMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(StreamDataRate newMetric) {
		if (newMetric != metric) {
			NotificationChain msgs = null;
			if (metric != null)
				msgs = ((InternalEObject)metric).eInverseRemove(this, PasysPackage.STREAM_DATA_RATE__METER, StreamDataRate.class, msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, PasysPackage.STREAM_DATA_RATE__METER, StreamDataRate.class, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.STREAM_RATE_METER__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.STREAM_RATE_METER__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((StreamData)otherEnd, msgs);
			case PasysPackage.STREAM_RATE_METER__METRIC:
				if (metric != null)
					msgs = ((InternalEObject)metric).eInverseRemove(this, PasysPackage.STREAM_DATA_RATE__METER, StreamDataRate.class, msgs);
				return basicSetMetric((StreamDataRate)otherEnd, msgs);
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				return basicSetOwner(null, msgs);
			case PasysPackage.STREAM_RATE_METER__METRIC:
				return basicSetMetric(null, msgs);
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.STREAM_DATA__OWNED_METERS, StreamData.class, msgs);
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				return getOwner();
			case PasysPackage.STREAM_RATE_METER__METRIC:
				if (resolve) return getMetric();
				return basicGetMetric();
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				setOwner((StreamData)newValue);
				return;
			case PasysPackage.STREAM_RATE_METER__METRIC:
				setMetric((StreamDataRate)newValue);
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				setOwner((StreamData)null);
				return;
			case PasysPackage.STREAM_RATE_METER__METRIC:
				setMetric((StreamDataRate)null);
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
			case PasysPackage.STREAM_RATE_METER__OWNER:
				return getOwner() != null;
			case PasysPackage.STREAM_RATE_METER__METRIC:
				return metric != null;
		}
		return super.eIsSet(featureID);
	}

} //StreamRateMeterImpl
