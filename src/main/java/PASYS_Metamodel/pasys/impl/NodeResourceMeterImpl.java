/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.NodeResourceMeter;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNodeMemory;
import PASYS_Metamodel.pasys.ProcessingNodeUtilization;
import PASYS_Metamodel.pasys.SystemComponentType;
import deploymentTool.DeploymentToolsUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Node
 * Resource Meter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl#getUMetric <em>UMetric</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.NodeResourceMeterImpl#getMMetric <em>MMetric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeResourceMeterImpl extends NodeHostedMeterImpl implements NodeResourceMeter {
	/**
	 * The cached value of the '{@link #getUMetric() <em>UMetric</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUMetric()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNodeUtilization uMetric;

	/**
	 * The cached value of the '{@link #getMMetric() <em>MMetric</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMMetric()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNodeMemory mMetric;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResourceMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.NODE_RESOURCE_METER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeUtilization getUMetric() {
		if (uMetric != null && uMetric.eIsProxy()) {
			InternalEObject oldUMetric = (InternalEObject)uMetric;
			uMetric = (ProcessingNodeUtilization)eResolveProxy(oldUMetric);
			if (uMetric != oldUMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.NODE_RESOURCE_METER__UMETRIC, oldUMetric, uMetric));
			}
		}
		return uMetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeUtilization basicGetUMetric() {
		return uMetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMetric(ProcessingNodeUtilization newUMetric, NotificationChain msgs) {
		ProcessingNodeUtilization oldUMetric = uMetric;
		uMetric = newUMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_RESOURCE_METER__UMETRIC, oldUMetric, newUMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUMetric(ProcessingNodeUtilization newUMetric) {
		if (newUMetric != uMetric) {
			NotificationChain msgs = null;
			if (uMetric != null)
				msgs = ((InternalEObject)uMetric).eInverseRemove(this, PasysPackage.PROCESSING_NODE_UTILIZATION__METER, ProcessingNodeUtilization.class, msgs);
			if (newUMetric != null)
				msgs = ((InternalEObject)newUMetric).eInverseAdd(this, PasysPackage.PROCESSING_NODE_UTILIZATION__METER, ProcessingNodeUtilization.class, msgs);
			msgs = basicSetUMetric(newUMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_RESOURCE_METER__UMETRIC, newUMetric, newUMetric));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeMemory getMMetric() {
		if (mMetric != null && mMetric.eIsProxy()) {
			InternalEObject oldMMetric = (InternalEObject)mMetric;
			mMetric = (ProcessingNodeMemory)eResolveProxy(oldMMetric);
			if (mMetric != oldMMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.NODE_RESOURCE_METER__MMETRIC, oldMMetric, mMetric));
			}
		}
		return mMetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeMemory basicGetMMetric() {
		return mMetric;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMetric(ProcessingNodeMemory newMMetric, NotificationChain msgs) {
		ProcessingNodeMemory oldMMetric = mMetric;
		mMetric = newMMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_RESOURCE_METER__MMETRIC, oldMMetric, newMMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMMetric(ProcessingNodeMemory newMMetric) {
		if (newMMetric != mMetric) {
			NotificationChain msgs = null;
			if (mMetric != null)
				msgs = ((InternalEObject)mMetric).eInverseRemove(this, PasysPackage.PROCESSING_NODE_MEMORY__METER, ProcessingNodeMemory.class, msgs);
			if (newMMetric != null)
				msgs = ((InternalEObject)newMMetric).eInverseAdd(this, PasysPackage.PROCESSING_NODE_MEMORY__METER, ProcessingNodeMemory.class, msgs);
			msgs = basicSetMMetric(newMMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.NODE_RESOURCE_METER__MMETRIC, newMMetric, newMMetric));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				if (uMetric != null)
					msgs = ((InternalEObject)uMetric).eInverseRemove(this, PasysPackage.PROCESSING_NODE_UTILIZATION__METER, ProcessingNodeUtilization.class, msgs);
				return basicSetUMetric((ProcessingNodeUtilization)otherEnd, msgs);
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				if (mMetric != null)
					msgs = ((InternalEObject)mMetric).eInverseRemove(this, PasysPackage.PROCESSING_NODE_MEMORY__METER, ProcessingNodeMemory.class, msgs);
				return basicSetMMetric((ProcessingNodeMemory)otherEnd, msgs);
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
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				return basicSetUMetric(null, msgs);
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				return basicSetMMetric(null, msgs);
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
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				if (resolve) return getUMetric();
				return basicGetUMetric();
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				if (resolve) return getMMetric();
				return basicGetMMetric();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				setUMetric((ProcessingNodeUtilization)newValue);
				return;
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				setMMetric((ProcessingNodeMemory)newValue);
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
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				setUMetric((ProcessingNodeUtilization)null);
				return;
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				setMMetric((ProcessingNodeMemory)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void deploy() throws ConfigurationException {
		//System.out.println("deploy in PrometheusNodeMeter " + this.getId());
		// No configuration needed

		// Launching script generation
		String scriptContent = "/usr/local/bin/launch "; 
		scriptContent+= this.getArtifactLocator() + "/" + this.getArtifactName() + " "
				+ "--no-collector.arp --no-collector.bcache " 
				+ "--no-collector.bonding --no-collector.conntrack "
				+ "--no-collector.diskstats --no-collector.edac --no-collector.entropy "
				+ "--no-collector.filefd --no-collector.filesystem "
				+ "--no-collector.hwmon --no-collector.infiniband --no-collector.ipvs "
				+ "--no-collector.loadavg --no-collector.mdadm "
				+ "--no-collector.netdev --no-collector.netstat --no-collector.nfs "
				+ "--no-collector.nfsd --no-collector.sockstat --no-collector.stat "
				+ "--no-collector.textfile --no-collector.time --no-collector.timex "
				+ "--no-collector.uname --no-collector.vmstat --no-collector.wifi "
				+ "--no-collector.xfs --no-collector.zfs";

		// if any ProcessingNodeUtilization.meter==this exists => collector-cpu
		if (uMetric != null)
			scriptContent += " --collector.cpu ";
		else
			scriptContent += " --no-collector.cpu ";

		// if ProcessingMemoryUtilization.meter==this exists ==>
		// collector-meminfo
		if (mMetric != null)
			scriptContent += " --collector.meminfo";
		else
			scriptContent += " --no-collector.meminfo";
		
		//scriptContent = "cd "+getScriptFolderPath()+"\n"+scriptContent;
		scriptContent=DeploymentToolsUtils.scriptHeaders(getScriptFolderPath())+scriptContent;
		// Add the script to the scriptFiles of the host
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl("NodeResourceMeter"+this.getId()+".sh",
				scriptFolderPath, scriptContent, SystemComponentType.NODE_RESOURCE_METER);
		this.getOwner().getLaunchingScripts().add(script);
	}

	@Override
	public String getPrometheusServerConfiguration() {
		return "  - job_name: " + this.getId() + "\n" + "    scrape_interval: " + this.getMonitoringTime() + "s\n"
				+ "    static_configs:\n" + "      - targets: ['" + this.getOwner().getIp() + ":" + this.getMonitoringPort()
				+ "']\n";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.NODE_RESOURCE_METER__UMETRIC:
				return uMetric != null;
			case PasysPackage.NODE_RESOURCE_METER__MMETRIC:
				return mMetric != null;
		}
		return super.eIsSet(featureID);
	}

} // NodeResourceMeterImpl
