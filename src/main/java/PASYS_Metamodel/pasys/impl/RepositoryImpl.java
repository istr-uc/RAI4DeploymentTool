/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.Image;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.RepositoryImpl#getImages <em>Images</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.RepositoryImpl#isIsPrivate <em>Is Private</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The default value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivate = IS_PRIVATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, PasysPackage.REPOSITORY__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrivate() {
		return isPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrivate(boolean newIsPrivate) {
		boolean oldIsPrivate = isPrivate;
		isPrivate = newIsPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.REPOSITORY__IS_PRIVATE, oldIsPrivate, isPrivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.REPOSITORY__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.REPOSITORY__IMAGES:
				return getImages();
			case PasysPackage.REPOSITORY__IS_PRIVATE:
				return isIsPrivate();
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
			case PasysPackage.REPOSITORY__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case PasysPackage.REPOSITORY__IS_PRIVATE:
				setIsPrivate((Boolean)newValue);
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
			case PasysPackage.REPOSITORY__IMAGES:
				getImages().clear();
				return;
			case PasysPackage.REPOSITORY__IS_PRIVATE:
				setIsPrivate(IS_PRIVATE_EDEFAULT);
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
			case PasysPackage.REPOSITORY__IMAGES:
				return images != null && !images.isEmpty();
			case PasysPackage.REPOSITORY__IS_PRIVATE:
				return isPrivate != IS_PRIVATE_EDEFAULT;
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
		result.append(" (isPrivate: ");
		result.append(isPrivate);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
