/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ArtifactDescriptor;
import PASYS_Metamodel.pasys.CassandraServer;
import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.KafkaServer;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PlatformResource;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.PrometheusServer;
import PASYS_Metamodel.pasys.ResourceCluster;
import PASYS_Metamodel.pasys.SystemComponent;
import PASYS_Metamodel.pasys.SystemComponentType;
import PASYS_Metamodel.pasys.Task;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;
import PASYS_Metamodel.pasys.Workflow;
import deploymentTool.DeploymentToolsUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task
 * Executor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#isIsRunning <em>Is Running</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskExecutorImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskExecutorImpl extends NamedElementImpl implements TaskExecutor {
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
	 * The cached value of the '{@link #getExecutedTasks() <em>Executed
	 * Tasks</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getExecutedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> executedTasks;

	/**
	 * The cached value of the '{@link #getOwnedMeters() <em>Owned Meters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskProcessingAmountMeter> ownedMeters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.TASK_EXECUTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME, oldArtifactName, artifactName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR, oldArtifactLocator, artifactLocator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArguments() {
		if (arguments == null) {
			arguments = new EDataTypeUniqueEList<String>(String.class, this, PasysPackage.TASK_EXECUTOR__ARGUMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH, oldScriptFolderPath, scriptFolderPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH, oldConfigFolderPath, configFolderPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH, oldDataFolderPath, dataFolderPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH, oldLogFolderPath, logFolderPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__IS_RUNNING, oldIsRunning, isRunning));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getExecutedTasks() {
		if (executedTasks == null) {
			executedTasks = new EObjectResolvingEList<Task>(Task.class, this, PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS);
		}
		return executedTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskProcessingAmountMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<TaskProcessingAmountMeter>(TaskProcessingAmountMeter.class, this, PasysPackage.TASK_EXECUTOR__OWNED_METERS, PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER);
		}
		return ownedMeters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getOwner() {
		if (eContainerFeatureID() != PasysPackage.TASK_EXECUTOR__OWNER) return null;
		return (Workflow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Workflow newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.TASK_EXECUTOR__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Workflow newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.TASK_EXECUTOR__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS, Workflow.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deploy() throws ConfigurationException {
		// For each cluster (node + kafka + cassandra) in which the taskExecutor is deployed
		ResourceCluster resourceCluster = this.getOwner().getScheduler().getTarget();
		for (PlatformResource c : resourceCluster.getResources()) {
			ResourceCluster rc = (ResourceCluster) c;
			deployInNode(rc);
		} // end for Node
	}

	public void deployInNode(ResourceCluster rsrcCluster) throws ConfigurationException {
		ProcessingNode pNode=null;
		KafkaServer kfkServer = null;
		CassandraServer csServer = null;
		
		for (PlatformResource pr:rsrcCluster.getResources()) {
			if (pr instanceof ProcessingNode) 
				pNode = (ProcessingNode)pr;
			if (pr instanceof KafkaServer)
				kfkServer = (KafkaServer) pr;
			if (pr instanceof CassandraServer) 
				csServer = (CassandraServer)pr;
		}
		
		// ConfigurationFile generation
		String configFileContent = generateConfigFileContent(pNode);
		DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl("TaskExecutor"+this.getId()+".cfg", 
				configFolderPath, configFileContent, SystemComponentType.TASK_EXECUTOR );
		pNode.getConfigFiles().add(configFile);
		
		
		//Script generation
		String scriptContent = generateScriptContent(pNode, kfkServer, csServer);
		String scriptName = "TaskExecutor"+this.getId() + ".sh";	
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, scriptFolderPath, 
				scriptContent, SystemComponentType.TASK_EXECUTOR);
		pNode.getLaunchingScripts().add(script);
		
		// Artifact to move to the corresponding nodes
		ArtifactDescriptor artifact = new ArtifactDescriptorImpl(this.artifactName, scriptFolderPath, this.artifactLocator);
		pNode.getCodeFiles().add(artifact);
	}

	private String generateScriptContent(ProcessingNode pNode, KafkaServer kfkServer,
			CassandraServer csServer) {
		String scriptContent = "java ";
		if (getOwnedMeters().size()>0) {
			String agentLocation = null;
			PrometheusServer ps = (PrometheusServer) getOwnedMeters().get(0).getMonitoringServer();
			for (ExporterData ed : ps.getExportersData()) {
				if (ed.getName().equals("TaskProcessingAmountAgent")) {
					agentLocation=ed.getArtifact();
				}
			}
			scriptContent+="-javaagent:"+agentLocation+"="+getId()+";"+configFolderPath+"/"+getId()+".cfg ";
		}
		scriptContent +="-jar "+ scriptFolderPath + "/" + artifactName;
		
		// Default arguments
		scriptContent += " "+getOwner().getId()+" "+pNode.getIp()+":"+kfkServer.getClientPort()+" "+pNode.getIp()+":"+csServer.getPort();
		if (this.getArguments().size() > 0)
			scriptContent += " "+DeploymentToolsUtils.argumentsToString(arguments);
		
		//scriptContent = "cd "+getScriptFolderPath()+"\n"+scriptContent;
		scriptContent=DeploymentToolsUtils.scriptHeaders(getScriptFolderPath())+scriptContent;
		return scriptContent;
	}

	private String generateConfigFileContent(ProcessingNode pNode) throws ConfigurationException {
		// Configuration generation
		String taskIDList = "";
		String taskClassesList = "";

		/*
		 * This version works with the configuration in a single file on each
		 * node for (TaskProcessingAmountMeter tpaMeter:this.getOwnedMeters()) {
		 * Task task = tpaMeter.getMetric().getTarget(); TaskProcessingAmount
		 * tpa= tpaMeter.getMetric(); taskIDList+=task.getId();
		 * taskClassesList+=task.getImplementingClass(); // PropertyConfigFiles
		 * pNode.addPropertyConfigData(this.getId()+task.getId()+
		 * ".tpaScrapingPort", Integer.toString(tpaMeter.getMonitoringPort()));
		 * pNode.addPropertyConfigData(this.getId()+task.getId()+
		 * ".expectedMaxTPA",
		 * Long.toString(tpaMeter.getMetric().getExpectedMaxTPA()));
		 * pNode.addPropertyConfigData(this.getId()+task.getId()+
		 * ".expectedMinTPA",
		 * Long.toString(tpaMeter.getMetric().getExpectedMinTPA()));
		 * pNode.addPropertyConfigData(this.getId()+task.getId()+
		 * ".histogramBucketsNum",
		 * Long.toString(tpaMeter.getMetric().getHistogramBuckectNum()));
		 * pNode.addPropertyConfigData(this.getId()+task.getId()+
		 * ".linearBucketsDistribution",
		 * Boolean.toString(tpaMeter.getMetric().isLinearBucketDistribution()));
		 * 
		 * } pNode.addPropertyConfigData(this.getId()+".tpaTaskIdList",
		 * taskIDList);
		 * pNode.addPropertyConfigData(this.getId()+".taskClassesList",
		 * taskClassesList);
		 */

		// Version with configuration file per taskExecutor
		Properties prop = new Properties();
		prop.setProperty("hostID", pNode.getId());
		prop.setProperty("speedFactor", Double.toString(pNode.getSpeedFactor()));
		for (TaskProcessingAmountMeter tpaMeter : this.getOwnedMeters()) {
			TaskProcessingAmount tpa = tpaMeter.getMetric();
			Task task = tpa.getTarget();
			taskIDList += task.getId() + " ";
			taskClassesList += task.getImplementingClassName() + " ";
			// PropertyConfigFiles
			prop.setProperty(this.getId() + "." + task.getId() + ".tpaScrapingPort",
					Integer.toString(tpaMeter.getMonitoringPort()));
			prop.setProperty(this.getId() + "." + task.getId() + ".expectedMaxTPA",
					Long.toString(tpaMeter.getMetric().getExpectedMaxTPA()));
			prop.setProperty(this.getId() + "." + task.getId() + ".expectedMinTPA",
					Long.toString(tpaMeter.getMetric().getExpectedMinTPA()));
			prop.setProperty(this.getId() + "." + task.getId() + ".histogramBucketsNum",
					Long.toString(tpaMeter.getMetric().getHistogramBuckectNum()));
			prop.setProperty(this.getId() + "." + task.getId() + ".linearBucketsDistribution",
					Boolean.toString(tpaMeter.getMetric().isLinearBucketDistribution()));

		}
		prop.setProperty(this.getId() + ".tpaTaskIdList", taskIDList);
		prop.setProperty(this.getId() + ".taskClassesList", taskClassesList);
		
		String configFileContent;
		try {
			configFileContent = DeploymentToolsUtils.propertiesToString(prop);
		} catch (IOException e) {
			throw new ConfigurationException("Error in serializing properties of the TaskExecutor "+id);
		}
		return configFileContent;
	}



	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Workflow)otherEnd, msgs);
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
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
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return basicSetOwner(null, msgs);
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS, Workflow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME:
				return getArtifactName();
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR:
				return getArtifactLocator();
			case PasysPackage.TASK_EXECUTOR__ARGUMENTS:
				return getArguments();
			case PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH:
				return getScriptFolderPath();
			case PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH:
				return getConfigFolderPath();
			case PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH:
				return getDataFolderPath();
			case PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH:
				return getLogFolderPath();
			case PasysPackage.TASK_EXECUTOR__IS_RUNNING:
				return isIsRunning();
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return getOwner();
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				return getExecutedTasks();
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
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
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR:
				setArtifactLocator((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends String>)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH:
				setScriptFolderPath((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH:
				setConfigFolderPath((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH:
				setDataFolderPath((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH:
				setLogFolderPath((String)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__IS_RUNNING:
				setIsRunning((Boolean)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				setOwner((Workflow)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				getExecutedTasks().clear();
				getExecutedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends TaskProcessingAmountMeter>)newValue);
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
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR:
				setArtifactLocator(ARTIFACT_LOCATOR_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__ARGUMENTS:
				getArguments().clear();
				return;
			case PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH:
				setScriptFolderPath(SCRIPT_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH:
				setConfigFolderPath(CONFIG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH:
				setDataFolderPath(DATA_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH:
				setLogFolderPath(LOG_FOLDER_PATH_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__IS_RUNNING:
				setIsRunning(IS_RUNNING_EDEFAULT);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				setOwner((Workflow)null);
				return;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				getExecutedTasks().clear();
				return;
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
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
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR:
				return ARTIFACT_LOCATOR_EDEFAULT == null ? artifactLocator != null : !ARTIFACT_LOCATOR_EDEFAULT.equals(artifactLocator);
			case PasysPackage.TASK_EXECUTOR__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH:
				return SCRIPT_FOLDER_PATH_EDEFAULT == null ? scriptFolderPath != null : !SCRIPT_FOLDER_PATH_EDEFAULT.equals(scriptFolderPath);
			case PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH:
				return CONFIG_FOLDER_PATH_EDEFAULT == null ? configFolderPath != null : !CONFIG_FOLDER_PATH_EDEFAULT.equals(configFolderPath);
			case PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH:
				return DATA_FOLDER_PATH_EDEFAULT == null ? dataFolderPath != null : !DATA_FOLDER_PATH_EDEFAULT.equals(dataFolderPath);
			case PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH:
				return LOG_FOLDER_PATH_EDEFAULT == null ? logFolderPath != null : !LOG_FOLDER_PATH_EDEFAULT.equals(logFolderPath);
			case PasysPackage.TASK_EXECUTOR__IS_RUNNING:
				return isRunning != IS_RUNNING_EDEFAULT;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return getOwner() != null;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				return executedTasks != null && !executedTasks.isEmpty();
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
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
				case PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME;
				case PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR: return PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR;
				case PasysPackage.TASK_EXECUTOR__ARGUMENTS: return PasysPackage.SYSTEM_COMPONENT__ARGUMENTS;
				case PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH;
				case PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH;
				case PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH;
				case PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH: return PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH;
				case PasysPackage.TASK_EXECUTOR__IS_RUNNING: return PasysPackage.SYSTEM_COMPONENT__IS_RUNNING;
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
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_NAME: return PasysPackage.TASK_EXECUTOR__ARTIFACT_NAME;
				case PasysPackage.SYSTEM_COMPONENT__ARTIFACT_LOCATOR: return PasysPackage.TASK_EXECUTOR__ARTIFACT_LOCATOR;
				case PasysPackage.SYSTEM_COMPONENT__ARGUMENTS: return PasysPackage.TASK_EXECUTOR__ARGUMENTS;
				case PasysPackage.SYSTEM_COMPONENT__SCRIPT_FOLDER_PATH: return PasysPackage.TASK_EXECUTOR__SCRIPT_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__CONFIG_FOLDER_PATH: return PasysPackage.TASK_EXECUTOR__CONFIG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__DATA_FOLDER_PATH: return PasysPackage.TASK_EXECUTOR__DATA_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__LOG_FOLDER_PATH: return PasysPackage.TASK_EXECUTOR__LOG_FOLDER_PATH;
				case PasysPackage.SYSTEM_COMPONENT__IS_RUNNING: return PasysPackage.TASK_EXECUTOR__IS_RUNNING;
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
				case PasysPackage.SYSTEM_COMPONENT___DEPLOY: return PasysPackage.TASK_EXECUTOR___DEPLOY;
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
			case PasysPackage.TASK_EXECUTOR___DEPLOY:
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

} // TaskExecutorImpl
