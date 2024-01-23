/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.DeploymentException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl#getFileContent <em>File Content</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DeploymentFileDescriptorImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentFileDescriptorImpl extends FileDescriptorImpl implements DeploymentFileDescriptor {
	/**
	 * The default value of the '{@link #getFileContent() <em>File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileContent()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileContent() <em>File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileContent()
	 * @generated
	 * @ordered
	 */
	protected String fileContent = FILE_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final DeployableComponentType ELEMENT_TYPE_EDEFAULT = DeployableComponentType.PROMETHEUS_SERVICE;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected DeployableComponentType elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNode owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentFileDescriptorImpl() {
		super();
	}
	
	/**
	 * @generated NOT
	 */
	protected DeploymentFileDescriptorImpl(String fileName, String filePath, String fileContent, DeployableComponentType componentType) {
		super(fileName, filePath);
		this.fileContent = fileContent;
		this.elementType= componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.DEPLOYMENT_FILE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileContent() {
		return fileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileContent(String newFileContent) {
		String oldFileContent = fileContent;
		fileContent = newFileContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT, oldFileContent, fileContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployableComponentType getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(DeployableComponentType newElementType) {
		DeployableComponentType oldElementType = elementType;
		elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (ProcessingNode)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNode basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(ProcessingNode newOwner) {
		ProcessingNode oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT:
				return getFileContent();
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE:
				return getElementType();
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT:
				setFileContent((String)newValue);
				return;
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE:
				setElementType((DeployableComponentType)newValue);
				return;
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER:
				setOwner((ProcessingNode)newValue);
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
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT:
				setFileContent(FILE_CONTENT_EDEFAULT);
				return;
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER:
				setOwner((ProcessingNode)null);
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
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT:
				return FILE_CONTENT_EDEFAULT == null ? fileContent != null : !FILE_CONTENT_EDEFAULT.equals(fileContent);
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE:
				return elementType != ELEMENT_TYPE_EDEFAULT;
			case PasysPackage.DEPLOYMENT_FILE_DESCRIPTOR__OWNER:
				return owner != null;
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
		result.append(" (fileContent: ");
		result.append(fileContent);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws DeploymentException 
	 * @generated NOT
	 */
	@Override
	public String createFileFromDescriptor(String directory) throws DeploymentException {
		// Windows 
		String filePath= directory+"\\"+getFileName();
		// Linux
		//String filePath=directory+"/"+getFileName();
		try (PrintWriter out = new PrintWriter(filePath)) {
		    out.println(getFileContent());
		
		
		/*try (PrintWriter out = new PrintWriter(filePath)) {
		    out.println(getFileContent());	
		Path path = Paths.get(filePath);
		//System.out.println(path);
        if (!Files.exists(path)) Files.createFile(path);
        Set<PosixFilePermission> perms = Files.readAttributes(path,PosixFileAttributes.class).permissions();		
        //   System.out.format("Permissions before: %s%n",  PosixFilePermissions.toString(perms));

        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        Files.setPosixFilePermissions(path, perms);*/
      //  System.out.format("Permissions after:  %s%n",  PosixFilePermissions.toString(perms));
		return filePath;
		
		} catch (IOException e) {
			e.printStackTrace();
			throw new DeploymentException("Error creando fichero en "+filePath);
		}
	}
	
	public static class LaunchingFileComparator implements Comparator<DeploymentFileDescriptor> {

		@Override
		public int compare(DeploymentFileDescriptor arg0, DeploymentFileDescriptor arg1) {
			return arg0.getElementType().compareTo(arg1.getElementType());
		}

		
	}
} //DeploymentFileDescriptorImpl
