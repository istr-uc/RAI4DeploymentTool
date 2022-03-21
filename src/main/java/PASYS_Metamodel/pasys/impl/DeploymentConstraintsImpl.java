/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.DeploymentConstraints;
import PASYS_Metamodel.pasys.PasysPackage;

import java.util.Properties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentConstraintsImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentConstraintsImpl extends MinimalEObjectImpl.Container implements DeploymentConstraints {
	/**
	 * The default value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected static final Properties LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected Properties labels = LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected static final Properties RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected Properties resources = RESOURCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.DEPLOYMENT_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties getLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabels(Properties newLabels) {
		Properties oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT_CONSTRAINTS__LABELS, oldLabels, labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(Properties newResources) {
		Properties oldResources = resources;
		resources = newResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT_CONSTRAINTS__RESOURCES, oldResources, resources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__LABELS:
				return getLabels();
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__RESOURCES:
				return getResources();
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
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__LABELS:
				setLabels((Properties)newValue);
				return;
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__RESOURCES:
				setResources((Properties)newValue);
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
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__LABELS:
				setLabels(LABELS_EDEFAULT);
				return;
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__RESOURCES:
				setResources(RESOURCES_EDEFAULT);
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
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__LABELS:
				return LABELS_EDEFAULT == null ? labels != null : !LABELS_EDEFAULT.equals(labels);
			case PasysPackage.DEPLOYMENT_CONSTRAINTS__RESOURCES:
				return RESOURCES_EDEFAULT == null ? resources != null : !RESOURCES_EDEFAULT.equals(resources);
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
		result.append(" (labels: ");
		result.append(labels);
		result.append(", resources: ");
		result.append(resources);
		result.append(')');
		return result.toString();
	}

} //DeploymentConstraintsImpl
