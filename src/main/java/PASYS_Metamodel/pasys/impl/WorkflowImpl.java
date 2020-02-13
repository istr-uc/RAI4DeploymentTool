/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.FlowStreamData;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.SchedulingServer;
import PASYS_Metamodel.pasys.StormServer;
import PASYS_Metamodel.pasys.SystemComponent;
import PASYS_Metamodel.pasys.SystemComponentType;
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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.WorkflowImpl#isIsRunning <em>Is Running</em>}</li>
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
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactLocator() <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArtifactLocator()
	 * @generated
	 * @ordered
	 */
	protected String artifactLocator = ARTIFACT_LOCATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arguments;

	/**
	 * The default value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptFolderPath() <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScriptFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptFolderPath = SCRIPT_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigFolderPath() <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConfigFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String configFolderPath = CONFIG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFolderPath() <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String dataFolderPath = DATA_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogFolderPath() <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String logFolderPath = LOG_FOLDER_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUNNING_EDEFAULT = false; // TODO The default value literal "" is not valid.

	/**
	 * The cached value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean isRunning = IS_RUNNING_EDEFAULT;

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
	protected SchedulingServer scheduler;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactLocator() {
		return artifactLocator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactLocator(String newArtifactLocator) {
		String oldArtifactLocator = artifactLocator;
		artifactLocator = newArtifactLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__ARTIFACT_LOCATOR, oldArtifactLocator, artifactLocator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArguments() {
		if (arguments == null) {
			arguments = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.WORKFLOW__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptFolderPath() {
		return scriptFolderPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptFolderPath(String newScriptFolderPath) {
		String oldScriptFolderPath = scriptFolderPath;
		scriptFolderPath = newScriptFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH, oldScriptFolderPath, scriptFolderPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigFolderPath() {
		return configFolderPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigFolderPath(String newConfigFolderPath) {
		String oldConfigFolderPath = configFolderPath;
		configFolderPath = newConfigFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH, oldConfigFolderPath, configFolderPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFolderPath() {
		return dataFolderPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFolderPath(String newDataFolderPath) {
		String oldDataFolderPath = dataFolderPath;
		dataFolderPath = newDataFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__DATA_FOLDER_PATH, oldDataFolderPath, dataFolderPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFolderPath() {
		return logFolderPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFolderPath(String newLogFolderPath) {
		String oldLogFolderPath = logFolderPath;
		logFolderPath = newLogFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__LOG_FOLDER_PATH, oldLogFolderPath, logFolderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRunning() {
		return isRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRunning(boolean newIsRunning) {
		boolean oldIsRunning = isRunning;
		isRunning = newIsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__IS_RUNNING, oldIsRunning, isRunning));
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
	public SchedulingServer getScheduler() {
		if (scheduler != null && scheduler.eIsProxy()) {
			InternalEObject oldScheduler = (InternalEObject)scheduler;
			scheduler = (SchedulingServer)eResolveProxy(oldScheduler);
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
	public SchedulingServer basicGetScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(SchedulingServer newScheduler, NotificationChain msgs) {
		SchedulingServer oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.WORKFLOW__SCHEDULER, oldScheduler, newScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduler(SchedulingServer newScheduler) {
		if (newScheduler != scheduler) {
			NotificationChain msgs = null;
			if (scheduler != null)
				msgs = ((InternalEObject)scheduler).eInverseRemove(this, PasysPackage.SCHEDULING_SERVER__WORKFLOWS, SchedulingServer.class, msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject)newScheduler).eInverseAdd(this, PasysPackage.SCHEDULING_SERVER__WORKFLOWS, SchedulingServer.class, msgs);
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
	 * 
	 * @generated NOT
	 */
	public void deploy() throws ConfigurationException {
		
		// Configuraci�n e instanciaci�n de los StreamData y StreamDataMeter
		for (WorkflowStreamData sd : getOwnedStreamData()) {
			if (sd instanceof FlowStreamData)
				((FlowStreamData)sd).deploy();
		}
		// Configuraci�n de los ownedTaskExecutors
		for (TaskExecutor te : getOwnedTaskExecutors()) {
			te.deploy();
		} // end for TaskExecutor

		// Configuraci�n de los ownedMeters
		// for lm:LatencyMeter in this.ownedMeters (Este no se si es as�)
		// for node:ProcessingNode in lm.getHosts()
		// node.propertyConfigData.add(<lm.id>.scrapingPort = lm.monitoringPort)
		// node.propertyConfigData.add(<lm.id>.triggerEv,this.rootTask.triggerMessage)
		// node.propertyConfigData.add(<lm.id>.allEvent, this.ownedStreamData)
		// node.propertyConfigData.add(<lm.id>.endEvent, de todos los eventos
		// del workflow los que no est�n referenciados como predecessor de
		// nadie)
		//
		
		
		
		//Script generation
				
							
		
		SchedulingServer server = getScheduler();
		
		if (server instanceof StormServer) {	
			
			String scriptName = "Workflow"+this.getId() + ".sh";	
			String scriptContent ="";
			scriptContent = server.getArtifactLocator()+"/"+server.getArtifactName()+" jar "
			+scriptFolderPath+"/"+getArtifactName()+" "+rootTask.getImplementingClassName();
			if (getArguments().size()>0) 
				scriptContent+=" "+DeploymentToolsUtils.argumentsToString(arguments);
		
		
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, scriptFolderPath, 
				scriptContent, SystemComponentType.WORKFLOW);
		server.getHost().getLaunchingScripts().add(script);
		
		// Artifact to move to the corresponding nodes
		ArtifactDescriptor artifact = new ArtifactDescriptorImpl(this.artifactName, scriptFolderPath, this.artifactLocator);
		server.getHost().getCodeFiles().add(artifact);
		}
		
		// // Instanciaci�n del workflow y del latencyMeter
		// scriptFile.add(java +
		// for lm: ownedMeter
		// +
		// "-javaagent:/home/apache/prometheus/latencyAgent/latencyAgent.jar="+
		// lm.id + ";" + this.configFolder+"/"+<node.id>+"config.cfg"+
		// -jar artifactID + this.arguments)
		// }

		// Configuraci�n del propio Workflow �Hace falta? o de los StreamData

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
					msgs = ((InternalEObject)scheduler).eInverseRemove(this, PasysPackage.SCHEDULING_SERVER__WORKFLOWS, SchedulingServer.class, msgs);
				return basicSetScheduler((SchedulingServer)otherEnd, msgs);
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
			case PasysPackage.WORKFLOW__ARTIFACT_NAME:
				return getArtifactName();
			case PasysPackage.WORKFLOW__ARTIFACT_LOCATOR:
				return getArtifactLocator();
			case PasysPackage.WORKFLOW__ARGUMENTS:
				return getArguments();
			case PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH:
				return getScriptFolderPath();
			case PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH:
				return getConfigFolderPath();
			case PasysPackage.WORKFLOW__DATA_FOLDER_PATH:
				return getDataFolderPath();
			case PasysPackage.WORKFLOW__LOG_FOLDER_PATH:
				return getLogFolderPath();
			case PasysPackage.WORKFLOW__IS_RUNNING:
				return isIsRunning();
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
			case PasysPackage.WORKFLOW__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case PasysPackage.WORKFLOW__ARTIFACT_LOCATOR:
				setArtifactLocator((String)newValue);
				return;
			case PasysPackage.WORKFLOW__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH:
				setScriptFolderPath((String)newValue);
				return;
			case PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH:
				setConfigFolderPath((String)newValue);
				return;
			case PasysPackage.WORKFLOW__DATA_FOLDER_PATH:
				setDataFolderPath((String)newValue);
				return;
			case PasysPackage.WORKFLOW__LOG_FOLDER_PATH:
				setLogFolderPath((String)newValue);
				return;
			case PasysPackage.WORKFLOW__IS_RUNNING:
				setIsRunning((Boolean)newValue);
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
				setScheduler((SchedulingServer)newValue);
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
			case PasysPackage.WORKFLOW__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__ARTIFACT_LOCATOR:
				setArtifactLocator(ARTIFACT_LOCATOR_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__ARGUMENTS:
				getArguments().clear();
				return;
			case PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH:
				setScriptFolderPath(SCRIPT_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH:
				setConfigFolderPath(CONFIG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__DATA_FOLDER_PATH:
				setDataFolderPath(DATA_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__LOG_FOLDER_PATH:
				setLogFolderPath(LOG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.WORKFLOW__IS_RUNNING:
				setIsRunning(IS_RUNNING_EDEFAULT);
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
				setScheduler((SchedulingServer)null);
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
			case PasysPackage.WORKFLOW__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case PasysPackage.WORKFLOW__ARTIFACT_LOCATOR:
				return ARTIFACT_LOCATOR_EDEFAULT == null ? artifactLocator != null : !ARTIFACT_LOCATOR_EDEFAULT.equals(artifactLocator);
			case PasysPackage.WORKFLOW__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH:
				return SCRIPT_FOLDER_PATH_EDEFAULT == null ? scriptFolderPath != null : !SCRIPT_FOLDER_PATH_EDEFAULT.equals(scriptFolderPath);
			case PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH:
				return CONFIG_FOLDER_PATH_EDEFAULT == null ? configFolderPath != null : !CONFIG_FOLDER_PATH_EDEFAULT.equals(configFolderPath);
			case PasysPackage.WORKFLOW__DATA_FOLDER_PATH:
				return DATA_FOLDER_PATH_EDEFAULT == null ? dataFolderPath != null : !DATA_FOLDER_PATH_EDEFAULT.equals(dataFolderPath);
			case PasysPackage.WORKFLOW__LOG_FOLDER_PATH:
				return LOG_FOLDER_PATH_EDEFAULT == null ? logFolderPath != null : !LOG_FOLDER_PATH_EDEFAULT.equals(logFolderPath);
			case PasysPackage.WORKFLOW__IS_RUNNING:
				return isRunning != IS_RUNNING_EDEFAULT;
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
		if (baseClass == SystemComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.WORKFLOW__ARTIFACT_NAME: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME;
				case PasysPackage.WORKFLOW__ARTIFACT_LOCATOR: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR;
				case PasysPackage.WORKFLOW__ARGUMENTS: return PasysPackage.SYSTEM_COMPONENT__ARGUMENTS;
				case PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;
				case PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;
				case PasysPackage.WORKFLOW__DATA_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH;
				case PasysPackage.WORKFLOW__LOG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH;
				case PasysPackage.WORKFLOW__IS_RUNNING: return PasysPackage.SYSTEM_COMPONENT__IS_RUNNING;
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
		if (baseClass == SystemComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME: return PasysPackage.WORKFLOW__ARTIFACT_NAME;
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR: return PasysPackage.WORKFLOW__ARTIFACT_LOCATOR;
				case PasysPackage.SYSTEM_COMPONENT__ARGUMENTS: return PasysPackage.WORKFLOW__ARGUMENTS;
				case PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH: return PasysPackage.WORKFLOW__SCRIPT_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH: return PasysPackage.WORKFLOW__CONFIG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH: return PasysPackage.WORKFLOW__DATA_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH: return PasysPackage.WORKFLOW__LOG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__IS_RUNNING: return PasysPackage.WORKFLOW__IS_RUNNING;
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
		if (baseClass == SystemComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.SYSTEM_COMPONENT___DEPLOY: return PasysPackage.WORKFLOW___DEPLOY;
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
			case PasysPackage.WORKFLOW___DEPLOY:
				try {
					deploy();
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
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifactName: ");
		result.append(artifactName);
		result.append(", artifactLocator: ");
		result.append(artifactLocator);
		result.append(", arguments: ");
		result.append(arguments);
		result.append(", scriptFolderPath: ");
		result.append(scriptFolderPath);
		result.append(", configFolderPath: ");
		result.append(configFolderPath);
		result.append(", dataFolderPath: ");
		result.append(dataFolderPath);
		result.append(", logFolderPath: ");
		result.append(logFolderPath);
		result.append(", isRunning: ");
		result.append(isRunning);
		result.append(')');
		return result.toString();
	}

} // WorkflowImpl
