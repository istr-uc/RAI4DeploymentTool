/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.DeploymentConstraints;
import PASYS_Metamodel.pasys.OrchestrationServiceDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Port;
import PASYS_Metamodel.pasys.Volume;

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
 * An implementation of the model object '<em><b>Orchestration Service Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getImage <em>Image</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getImagePullPolicy <em>Image Pull Policy</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.OrchestrationServiceDeploymentConfImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrchestrationServiceDeploymentConfImpl extends PlatformServiceDeploymentConfImpl implements OrchestrationServiceDeploymentConf {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

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
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected String restartPolicy = RESTART_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImagePullPolicy() <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePullPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PULL_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePullPolicy() <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePullPolicy()
	 * @generated
	 * @ordered
	 */
	protected String imagePullPolicy = IMAGE_PULL_POLICY_EDEFAULT;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConstraints constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrationServiceDeploymentConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestartPolicy() {
		return restartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestartPolicy(String newRestartPolicy) {
		String oldRestartPolicy = restartPolicy;
		restartPolicy = newRestartPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY, oldRestartPolicy, restartPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImagePullPolicy() {
		return imagePullPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePullPolicy(String newImagePullPolicy) {
		String oldImagePullPolicy = imagePullPolicy;
		imagePullPolicy = newImagePullPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY, oldImagePullPolicy, imagePullPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConstraints getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(DeploymentConstraints newConstraints, NotificationChain msgs) {
		DeploymentConstraints oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS, oldConstraints, newConstraints);
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
	public void setConstraints(DeploymentConstraints newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
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
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE:
				return getImage();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS:
				return getReplicas();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND:
				return getCommand();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__ARGS:
				return getArgs();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY:
				return getRestartPolicy();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY:
				return getImagePullPolicy();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES:
				return getVolumes();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS:
				return getPorts();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS:
				return getConstraints();
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
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE:
				setImage((String)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND:
				setCommand((String)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__ARGS:
				setArgs((String)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY:
				setRestartPolicy((String)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY:
				setImagePullPolicy((String)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS:
				setConstraints((DeploymentConstraints)newValue);
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
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__ARGS:
				setArgs(ARGS_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY:
				setRestartPolicy(RESTART_POLICY_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY:
				setImagePullPolicy(IMAGE_PULL_POLICY_EDEFAULT);
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES:
				getVolumes().clear();
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS:
				getPorts().clear();
				return;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS:
				setConstraints((DeploymentConstraints)null);
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
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__ARGS:
				return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__RESTART_POLICY:
				return RESTART_POLICY_EDEFAULT == null ? restartPolicy != null : !RESTART_POLICY_EDEFAULT.equals(restartPolicy);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__IMAGE_PULL_POLICY:
				return IMAGE_PULL_POLICY_EDEFAULT == null ? imagePullPolicy != null : !IMAGE_PULL_POLICY_EDEFAULT.equals(imagePullPolicy);
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__PORTS:
				return ports != null && !ports.isEmpty();
			case PasysPackage.ORCHESTRATION_SERVICE_DEPLOYMENT_CONF__CONSTRAINTS:
				return constraints != null;
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
		result.append(" (image: ");
		result.append(image);
		result.append(", replicas: ");
		result.append(replicas);
		result.append(", command: ");
		result.append(command);
		result.append(", args: ");
		result.append(args);
		result.append(", restartPolicy: ");
		result.append(restartPolicy);
		result.append(", imagePullPolicy: ");
		result.append(imagePullPolicy);
		result.append(')');
		return result.toString();
	}

} //OrchestrationServiceDeploymentConfImpl
