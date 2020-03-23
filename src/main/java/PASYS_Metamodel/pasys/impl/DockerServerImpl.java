/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.DockerServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.Service;
import PASYS_Metamodel.pasys.Stack;
import PASYS_Metamodel.pasys.SwarmCluster;
import PASYS_Metamodel.pasys.SystemComponentType;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.esotericsoftware.yamlbeans.YamlConfig;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Docker
 * Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DockerServerImpl#getStacks <em>Stacks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.DockerServerImpl#getSwarmCluster <em>Swarm Cluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerServerImpl extends ContainerizationServerImpl implements DockerServer {
	/**
	 * The cached value of the '{@link #getStacks() <em>Stacks</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Stack> stacks;

	/**
	 * The cached value of the '{@link #getSwarmCluster() <em>Swarm Cluster</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSwarmCluster()
	 * @generated
	 * @ordered
	 */
	protected SwarmCluster swarmCluster;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.DOCKER_SERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stack> getStacks() {
		if (stacks == null) {
			stacks = new EObjectContainmentEList<Stack>(Stack.class, this, PasysPackage.DOCKER_SERVER__STACKS);
		}
		return stacks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmCluster getSwarmCluster() {
		if (swarmCluster != null && swarmCluster.eIsProxy()) {
			InternalEObject oldSwarmCluster = (InternalEObject)swarmCluster;
			swarmCluster = (SwarmCluster)eResolveProxy(oldSwarmCluster);
			if (swarmCluster != oldSwarmCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.DOCKER_SERVER__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
			}
		}
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmCluster basicGetSwarmCluster() {
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarmCluster(SwarmCluster newSwarmCluster) {
		SwarmCluster oldSwarmCluster = swarmCluster;
		swarmCluster = newSwarmCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.DOCKER_SERVER__SWARM_CLUSTER, oldSwarmCluster, swarmCluster));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				return ((InternalEList<?>)getStacks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				return getStacks();
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				if (resolve) return getSwarmCluster();
				return basicGetSwarmCluster();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				getStacks().clear();
				getStacks().addAll((Collection<? extends Stack>)newValue);
				return;
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				getStacks().clear();
				return;
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				setSwarmCluster((SwarmCluster)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.DOCKER_SERVER__STACKS:
				return stacks != null && !stacks.isEmpty();
			case PasysPackage.DOCKER_SERVER__SWARM_CLUSTER:
				return swarmCluster != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void deploy() throws ConfigurationException {
		if (stacks != null) {
			try {
				for (Stack stack : stacks) {
					// Stack File generation
					DeploymentFileDescriptor stackFile = new DeploymentFileDescriptorImpl(stack.getName() + ".yaml", configFolderPath,
							generateStackFileContent(stack), SystemComponentType.DOCKER_STACK);
					getHost().getConfigFiles().add(stackFile);

					// TODO launching script
					
					String scriptContent="docker stack deploy -c "+configFolderPath+"/"+stack.getName()+".yaml"+stack.getName();
				    DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl("deploy"+stack.getName() + ".sh", scriptFolderPath,
							scriptContent, SystemComponentType.DOCKER_STACK);
					getHost().getLaunchingScripts().add(script);
				}

			} catch (YamlException e) {
				throw new ConfigurationException("Error parsing yaml file");
			}
		}

	}

	private String generateStackFileContent(Stack stack) throws YamlException, ConfigurationException {
		YamlReader reader = new YamlReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("stack.yaml")));
		Object object = reader.read();

		// Modify simple properties
		HashMap map = (HashMap) object;
		map.put("version", stack.getVersion());
		
		// TODO Esto así no es
		ArrayList<String> services = new ArrayList<String>();
		for (Service serv:stack.getServices()) {
			services.add(serv.getName());
		}
		map.put("services", services);

		StringWriter output = new StringWriter();
		YamlWriter writer = new YamlWriter(output);
		writer.getConfig().writeConfig.setWriteRootTags(false);
		writer.getConfig().writeConfig.setWriteClassname(YamlConfig.WriteClassName.NEVER);

		writer.write(object);
		writer.close();
		String configFileContent = output.toString();
		return configFileContent;
	}

} // DockerServerImpl
