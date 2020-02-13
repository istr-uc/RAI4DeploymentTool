/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.PasysPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ArtifactDescriptorImpl#getFileLocator <em>File Locator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactDescriptorImpl extends FileDescriptorImpl implements ArtifactDescriptor {
	/**
	 * The default value of the '{@link #getFileLocator() <em>File Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileLocator() <em>File Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLocator()
	 * @generated
	 * @ordered
	 */
	protected String fileLocator = FILE_LOCATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactDescriptorImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	protected ArtifactDescriptorImpl(String fileName, String filePath, String fileLocator) {
		super(fileName, filePath);
		this.fileLocator=fileLocator;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.ARTIFACT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileLocator() {
		return fileLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileLocator(String newFileLocator) {
		String oldFileLocator = fileLocator;
		fileLocator = newFileLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ARTIFACT_DESCRIPTOR__FILE_LOCATOR, oldFileLocator, fileLocator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.ARTIFACT_DESCRIPTOR__FILE_LOCATOR:
				return getFileLocator();
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
			case PasysPackage.ARTIFACT_DESCRIPTOR__FILE_LOCATOR:
				setFileLocator((String)newValue);
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
			case PasysPackage.ARTIFACT_DESCRIPTOR__FILE_LOCATOR:
				setFileLocator(FILE_LOCATOR_EDEFAULT);
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
			case PasysPackage.ARTIFACT_DESCRIPTOR__FILE_LOCATOR:
				return FILE_LOCATOR_EDEFAULT == null ? fileLocator != null : !FILE_LOCATOR_EDEFAULT.equals(fileLocator);
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
		result.append(" (fileLocator: ");
		result.append(fileLocator);
		result.append(')');
		return result.toString();
	}

} //ArtifactDescriptorImpl
