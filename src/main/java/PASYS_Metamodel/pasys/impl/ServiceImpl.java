/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.Deployment;
import PASYS_Metamodel.pasys.Image;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.Service;
import PASYS_Metamodel.pasys.ServiceNetwork;
import PASYS_Metamodel.pasys.Stack;
import PASYS_Metamodel.pasys.Volume;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getStack <em>Stack</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getEnvFile <em>Env File</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getDeploymentParam <em>Deployment Param</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.ServiceImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The default value of the '{@link #getEnvFile() <em>Env File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvFile() <em>Env File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvFile()
	 * @generated
	 * @ordered
	 */
	protected String envFile = ENV_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> env;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> dependsOn;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceNetwork> networks;

	/**
	 * The cached value of the '{@link #getDeploymentParam() <em>Deployment Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentParam()
	 * @generated
	 * @ordered
	 */
	protected Deployment deploymentParam;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack getStack() {
		if (eContainerFeatureID() != PasysPackage.SERVICE__STACK) return null;
		return (Stack)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStack(Stack newStack, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStack, PasysPackage.SERVICE__STACK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStack(Stack newStack) {
		if (newStack != eInternalContainer() || (eContainerFeatureID() != PasysPackage.SERVICE__STACK && newStack != null)) {
			if (EcoreUtil.isAncestor(this, newStack))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStack != null)
				msgs = ((InternalEObject)newStack).eInverseAdd(this, PasysPackage.STACK__SERVICES, Stack.class, msgs);
			msgs = basicSetStack(newStack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__STACK, newStack, newStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvFile() {
		return envFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvFile(String newEnvFile) {
		String oldEnvFile = envFile;
		envFile = newEnvFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__ENV_FILE, oldEnvFile, envFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getEnv() {
		if (env == null) {
			env = new EcoreEMap<String,String>(PasysPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, PasysPackage.SERVICE__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<Service>(Service.class, this, PasysPackage.SERVICE__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (Image)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.SERVICE__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, PasysPackage.SERVICE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, PasysPackage.SERVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<ServiceNetwork>(ServiceNetwork.class, this, PasysPackage.SERVICE__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeploymentParam() {
		return deploymentParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentParam(Deployment newDeploymentParam, NotificationChain msgs) {
		Deployment oldDeploymentParam = deploymentParam;
		deploymentParam = newDeploymentParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__DEPLOYMENT_PARAM, oldDeploymentParam, newDeploymentParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentParam(Deployment newDeploymentParam) {
		if (newDeploymentParam != deploymentParam) {
			NotificationChain msgs = null;
			if (deploymentParam != null)
				msgs = ((InternalEObject)deploymentParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.SERVICE__DEPLOYMENT_PARAM, null, msgs);
			if (newDeploymentParam != null)
				msgs = ((InternalEObject)newDeploymentParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.SERVICE__DEPLOYMENT_PARAM, null, msgs);
			msgs = basicSetDeploymentParam(newDeploymentParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__DEPLOYMENT_PARAM, newDeploymentParam, newDeploymentParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.SERVICE__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.SERVICE__STACK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStack((Stack)otherEnd, msgs);
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
			case PasysPackage.SERVICE__STACK:
				return basicSetStack(null, msgs);
			case PasysPackage.SERVICE__ENV:
				return ((InternalEList<?>)getEnv()).basicRemove(otherEnd, msgs);
			case PasysPackage.SERVICE__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
			case PasysPackage.SERVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case PasysPackage.SERVICE__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case PasysPackage.SERVICE__DEPLOYMENT_PARAM:
				return basicSetDeploymentParam(null, msgs);
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
			case PasysPackage.SERVICE__STACK:
				return eInternalContainer().eInverseRemove(this, PasysPackage.STACK__SERVICES, Stack.class, msgs);
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
			case PasysPackage.SERVICE__STACK:
				return getStack();
			case PasysPackage.SERVICE__ENV_FILE:
				return getEnvFile();
			case PasysPackage.SERVICE__ENV:
				if (coreType) return getEnv();
				else return getEnv().map();
			case PasysPackage.SERVICE__DEPENDS_ON:
				return getDependsOn();
			case PasysPackage.SERVICE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case PasysPackage.SERVICE__VOLUMES:
				return getVolumes();
			case PasysPackage.SERVICE__PORTS:
				return getPorts();
			case PasysPackage.SERVICE__NETWORKS:
				return getNetworks();
			case PasysPackage.SERVICE__DEPLOYMENT_PARAM:
				return getDeploymentParam();
			case PasysPackage.SERVICE__COMMAND:
				return getCommand();
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
			case PasysPackage.SERVICE__STACK:
				setStack((Stack)newValue);
				return;
			case PasysPackage.SERVICE__ENV_FILE:
				setEnvFile((String)newValue);
				return;
			case PasysPackage.SERVICE__ENV:
				((EStructuralFeature.Setting)getEnv()).set(newValue);
				return;
			case PasysPackage.SERVICE__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends Service>)newValue);
				return;
			case PasysPackage.SERVICE__IMAGE:
				setImage((Image)newValue);
				return;
			case PasysPackage.SERVICE__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case PasysPackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case PasysPackage.SERVICE__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends ServiceNetwork>)newValue);
				return;
			case PasysPackage.SERVICE__DEPLOYMENT_PARAM:
				setDeploymentParam((Deployment)newValue);
				return;
			case PasysPackage.SERVICE__COMMAND:
				setCommand((String)newValue);
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
			case PasysPackage.SERVICE__STACK:
				setStack((Stack)null);
				return;
			case PasysPackage.SERVICE__ENV_FILE:
				setEnvFile(ENV_FILE_EDEFAULT);
				return;
			case PasysPackage.SERVICE__ENV:
				getEnv().clear();
				return;
			case PasysPackage.SERVICE__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case PasysPackage.SERVICE__IMAGE:
				setImage((Image)null);
				return;
			case PasysPackage.SERVICE__VOLUMES:
				getVolumes().clear();
				return;
			case PasysPackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case PasysPackage.SERVICE__NETWORKS:
				getNetworks().clear();
				return;
			case PasysPackage.SERVICE__DEPLOYMENT_PARAM:
				setDeploymentParam((Deployment)null);
				return;
			case PasysPackage.SERVICE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
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
			case PasysPackage.SERVICE__STACK:
				return getStack() != null;
			case PasysPackage.SERVICE__ENV_FILE:
				return ENV_FILE_EDEFAULT == null ? envFile != null : !ENV_FILE_EDEFAULT.equals(envFile);
			case PasysPackage.SERVICE__ENV:
				return env != null && !env.isEmpty();
			case PasysPackage.SERVICE__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case PasysPackage.SERVICE__IMAGE:
				return image != null;
			case PasysPackage.SERVICE__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case PasysPackage.SERVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case PasysPackage.SERVICE__NETWORKS:
				return networks != null && !networks.isEmpty();
			case PasysPackage.SERVICE__DEPLOYMENT_PARAM:
				return deploymentParam != null;
			case PasysPackage.SERVICE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
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
		result.append(" (envFile: ");
		result.append(envFile);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
