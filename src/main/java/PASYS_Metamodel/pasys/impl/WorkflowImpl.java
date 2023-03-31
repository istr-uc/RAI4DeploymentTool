/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeployableComponent;
import PASYS_Metamodel.pasys.DeployableComponentType;
import PASYS_Metamodel.pasys.DeploymentConfiguration;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.NodeDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.SchedulingService;
import PASYS_Metamodel.pasys.StormService;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.Workflow;
import PASYS_Metamodel.pasys.WorkflowLatencyMeter;
import PASYS_Metamodel.pasys.WorkflowStreamData;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import deploymentTool.DeploymentToolsUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Workflow</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getDeploymentConfig <em>Deployment Config</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getOwnedStreamData <em>Owned Stream Data</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getRootTask <em>Root Task</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getOwnedTaskExecutors <em>Owned Task Executors</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends SystemElementImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getDeploymentConfig() <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConfig()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConfiguration deploymentConfig;

	
																// default value
																// literal "" is
																// not valid.

	/**
	 * The cached value of the '{@link #getOwnedStreamData() <em>Owned Stream Data</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOwnedStreamData()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowStreamData> ownedStreamData;

	/**
	 * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> ownedTasks;

	/**
	 * The cached value of the '{@link #getRootTask() <em>Root Task</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRootTask()
	 * @generated
	 * @ordered
	 */
	protected Task rootTask;

	/**
	 * The cached value of the '{@link #getOwnedTaskExecutors() <em>Owned Task Executors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOwnedTaskExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskExecutor> ownedTaskExecutors;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected SchedulingService scheduler;

	/**
	 * The cached value of the '{@link #getOwnedMeters() <em>Owned Meters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowLatencyMeter> ownedMeters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConfiguration getDeploymentConfig() {
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConfig(DeploymentConfiguration newDeploymentConfig, NotificationChain msgs) {
		DeploymentConfiguration oldDeploymentConfig = deploymentConfig;
		deploymentConfig = newDeploymentConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG, oldDeploymentConfig, newDeploymentConfig);
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
	public void setDeploymentConfig(DeploymentConfiguration newDeploymentConfig) {
		if (newDeploymentConfig != deploymentConfig) {
			NotificationChain msgs = null;
			if (deploymentConfig != null)
				msgs = ((InternalEObject)deploymentConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG, null, msgs);
			if (newDeploymentConfig != null)
				msgs = ((InternalEObject)newDeploymentConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG, null, msgs);
			msgs = basicSetDeploymentConfig(newDeploymentConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG, newDeploymentConfig, newDeploymentConfig));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkflowStreamData> getOwnedStreamData() {
		if (ownedStreamData == null) {
			ownedStreamData = new EObjectContainmentWithInverseEList<WorkflowStreamData>(WorkflowStreamData.class, this, PasysPackage.WORKFLOW__OWNED_STREAM_DATA, PasysPackage.WORKFLOW_STREAM_DATA__OWNER);
		}
		return ownedStreamData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getOwnedTasks() {
		if (ownedTasks == null) {
			ownedTasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, PasysPackage.WORKFLOW__OWNED_TASKS, PasysPackage.TASK__OWNER);
		}
		return ownedTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getRootTask() {
		if (rootTask != null && rootTask.eIsProxy()) {
			InternalEObject oldRootTask = (InternalEObject)rootTask;
			rootTask = (Task)eResolveProxy(oldRootTask);
			if (rootTask != oldRootTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.WORKFLOW__ROOT_TASK, oldRootTask, rootTask));
			}
		}
		return rootTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetRootTask() {
		return rootTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootTask(Task newRootTask) {
		Task oldRootTask = rootTask;
		rootTask = newRootTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__ROOT_TASK, oldRootTask, rootTask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingService getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (SchedulingService)eResolveProxy(oldScheduler);
			if (scheduler != oldScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.WORKFLOW__SCHEDULER, oldScheduler, scheduler));
			}
		}
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingService basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(SchedulingService newScheduler, NotificationChain msgs) {
		SchedulingService oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__SCHEDULER, oldScheduler, newScheduler);
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
	public void setScheduler(SchedulingService newScheduler) {
		if (newScheduler != scheduler) {
			NotificationChain msgs = null;
			if (scheduler != null)
				msgs = ((InternalEObject)scheduler).eInverseRemove(this, PasysPackage.SCHEDULING_SERVICE__WORKFLOWS, SchedulingService.class, msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, PasysPackage.SCHEDULING_SERVICE__WORKFLOWS, SchedulingService.class, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__SCHEDULER, newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkflowLatencyMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<WorkflowLatencyMeter>(WorkflowLatencyMeter.class, this, PasysPackage.WORKFLOW__OWNED_METERS, PasysPackage.WORKFLOW_LATENCY_METER__OWNER);
		}
		return ownedMeters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskExecutor> getOwnedTaskExecutors() {
		if (ownedTaskExecutors == null) {
			ownedTaskExecutors = new EObjectContainmentWithInverseEList<TaskExecutor>(TaskExecutor.class, this, PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS, PasysPackage.TASK_EXECUTOR__OWNER);
		}
		return ownedTaskExecutors;
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStreamData()).basicAdd(otherEnd, msgs);
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTasks()).basicAdd(otherEnd, msgs);
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTaskExecutors()).basicAdd(otherEnd, msgs);
			case PasysPackage.WORKFLOW__SCHEDULER:
				if (scheduler != null)
					msgs = ((InternalEObject)scheduler).eInverseRemove(this, PasysPackage.SCHEDULING_SERVICE__WORKFLOWS, SchedulingService.class, msgs);
				return basicSetScheduler((SchedulingService)otherEnd, msgs);
			case PasysPackage.WORKFLOW__OWNED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMeters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG:
				return basicSetDeploymentConfig(null, msgs);
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				return ((InternalEList<?>)getOwnedStreamData()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				return ((InternalEList<?>)getOwnedTaskExecutors()).basicRemove(otherEnd, msgs);
			case PasysPackage.WORKFLOW__SCHEDULER:
				return basicSetScheduler(null, msgs);
			case PasysPackage.WORKFLOW__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG:
				return getDeploymentConfig();
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				return getOwnedStreamData();
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				return getOwnedTasks();
			case PasysPackage.WORKFLOW__ROOT_TASK:
				if (resolve) return getRootTask();
				return basicGetRootTask();
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				return getOwnedTaskExecutors();
			case PasysPackage.WORKFLOW__SCHEDULER:
				if (resolve) return getScheduler();
				return basicGetScheduler();
			case PasysPackage.WORKFLOW__OWNED_METERS:
				return getOwnedMeters();
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
			case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)newValue);
				return;
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				getOwnedStreamData().clear();
				getOwnedStreamData().addAll((Collection<? extends WorkflowStreamData>)newValue);
				return;
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				getOwnedTasks().clear();
				getOwnedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PasysPackage.WORKFLOW__ROOT_TASK:
				setRootTask((Task)newValue);
				return;
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				getOwnedTaskExecutors().clear();
				getOwnedTaskExecutors().addAll((Collection<? extends TaskExecutor>)newValue);
				return;
			case PasysPackage.WORKFLOW__SCHEDULER:
				setScheduler((SchedulingService)newValue);
				return;
			case PasysPackage.WORKFLOW__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends WorkflowLatencyMeter>)newValue);
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
			case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)null);
				return;
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				getOwnedStreamData().clear();
				return;
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				getOwnedTasks().clear();
				return;
			case PasysPackage.WORKFLOW__ROOT_TASK:
				setRootTask((Task)null);
				return;
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				getOwnedTaskExecutors().clear();
				return;
			case PasysPackage.WORKFLOW__SCHEDULER:
				setScheduler((SchedulingService)null);
				return;
			case PasysPackage.WORKFLOW__OWNED_METERS:
				getOwnedMeters().clear();
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
			case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG:
				return deploymentConfig != null;
			case PasysPackage.WORKFLOW__OWNED_STREAM_DATA:
				return ownedStreamData != null && !ownedStreamData.isEmpty();
			case PasysPackage.WORKFLOW__OWNED_TASKS:
				return ownedTasks != null && !ownedTasks.isEmpty();
			case PasysPackage.WORKFLOW__ROOT_TASK:
				return rootTask != null;
			case PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS:
				return ownedTaskExecutors != null && !ownedTaskExecutors.isEmpty();
			case PasysPackage.WORKFLOW__SCHEDULER:
				return scheduler != null;
			case PasysPackage.WORKFLOW__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG: return PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG: return PasysPackage.WORKFLOW__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT: return PasysPackage.WORKFLOW___CONFIGURE_DEPLOYMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.WORKFLOW___CONFIGURE_DEPLOYMENT:
				try {
					configureDeployment();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void configureDeployment() throws ConfigurationException {

		// Configuration and instantiation of StreamDatas and StreamDataMeters
		for (WorkflowStreamData sd : getOwnedStreamData()) {
			if (sd instanceof FlowStreamData)
				((FlowStreamData) sd).configureDeployment();
		}
		// OwnedTaskExecutors configuration
		for (TaskExecutor te : getOwnedTaskExecutors()) {
			te.configureDeployment();
		} // end for TaskExecutor

		
		if (getScheduler().getHost()!=null) 
			configureDeploymentOnHost();
		else 
			configureDeploymentOnOrchestrator();
		// ownedMeters configuration
		// for lm:LatencyMeter in this.ownedMeters (Este no se si es as�)
		// for node:ProcessingNode in lm.getHosts()
		// node.propertyConfigData.add(<lm.id>.scrapingPort = lm.monitoringPort)
		// node.propertyConfigData.add(<lm.id>.triggerEv,this.rootTask.triggerMessage)
		// node.propertyConfigData.add(<lm.id>.allEvent, this.ownedStreamData)
		// node.propertyConfigData.add(<lm.id>.endEvent, de todos los eventos
		// del workflow los que no est�n referenciados como predecessor de
		// nadie)
		//
		
		// // Instanciaci�n del workflow y del latencyMeter
				// scriptFile.add(java +
				// for lm: ownedMeter
				// +
				// "-javaagent:/home/apache/prometheus/latencyAgent/latencyAgent.jar="+
				// lm.id + ";" + this.configFolder+"/"+<node.id>+"config.cfg"+
				// -jar artifactID + this.arguments)
				// }

				// Configuraci�n del propio Workflow �Hace falta? o de los
				// StreamData

	}
	
	private void configureDeploymentOnHost() {
		// Script generation
		SchedulingService server = getScheduler();
		NodeDeploymentConf conf = (NodeDeploymentConf) getDeploymentConfig();
		NodeDeploymentConf serverConf = (NodeDeploymentConf) server.getDeploymentConfig();
		
		if (server instanceof StormService) {
			String scriptName = "Workflow" + this.getId() + ".sh";	
			String scriptContent = serverConf.getArtifactLocator()+ "/"+serverConf.getArtifactName();
			scriptContent+=" jar " + conf.getScriptFolderPath()
					+ "/" + conf.getArtifactName() + " " + rootTask.getImplementingClassName();
			 if (conf.getArguments().size() > 0)
				scriptContent += " " + DeploymentToolsUtils.argumentsToString(conf.getArguments());
			
			DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, conf.getScriptFolderPath(),
					scriptContent, DeployableComponentType.WORKFLOW);
			
			// It is enough with deploying the workflow in only one of the nodes but it must be Nimbus
			
			ProcessingNodeCluster nodeHost = (ProcessingNodeCluster)((StormService) server).getNimbus().getHost();
			
			ProcessingNode node = nodeHost.getNodes().get(0);
			node.addLaunchingScript(script);

			// Artifact to move to the corresponding nodes
			ArtifactDescriptor artifact = new ArtifactDescriptorImpl(conf.getArtifactName(), conf.getScriptFolderPath(),
					conf.getArtifactLocator());
			node.getCodeFiles().add(artifact); 
		}		

	}
	
	private void configureDeploymentOnOrchestrator() {
		
	}
	
	//private String generateScriptContent() {
		//String scriptContent;
		//SchedulingService server = getScheduler();
		//if (server.getOrchestrator()!=null) {
			//DockerContainer container = (DockerContainer)server.getContainer();
			//String serviceName= container.getService().getName();
			//scriptContent= "docker exec $(docker ps | grep "+serviceName+ " | awk {print $1}) storm";
	//	} else {
			//scriptContent = server.getArtifactLocator() + "/" + server.getArtifactName(); 
		//}
		//scriptContent+=" jar " + scriptFolderPath
			//	+ "/" + getArtifactName() + " " + rootTask.getImplementingClassName();
		 //if (getArguments().size() > 0)
			//scriptContent += " " + DeploymentToolsUtils.argumentsToString(arguments);
		//return scriptContent;
	//}
} // WorkflowImpl
