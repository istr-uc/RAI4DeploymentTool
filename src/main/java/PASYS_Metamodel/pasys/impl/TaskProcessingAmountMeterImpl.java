/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PhysicalProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.ProcessingNodeCluster;
import PASYS_Metamodel.pasys.TaskExecutor;
import PASYS_Metamodel.pasys.TaskProcessingAmount;
import PASYS_Metamodel.pasys.TaskProcessingAmountMeter;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Processing Amount Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.TaskProcessingAmountMeterImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskProcessingAmountMeterImpl extends PrometheusMeterImpl implements TaskProcessingAmountMeter {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected TaskProcessingAmount metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskProcessingAmountMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.TASK_PROCESSING_AMOUNT_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskExecutor getOwner() {
		if (eContainerFeatureID() != PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER) return null;
		return (TaskExecutor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(TaskExecutor newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(TaskExecutor newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.TASK_EXECUTOR__OWNED_METERS, TaskExecutor.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskProcessingAmount getMetric() {
		if (metric != null && metric.eIsProxy()) {
			InternalEObject oldMetric = (InternalEObject)metric;
			metric = (TaskProcessingAmount)eResolveProxy(oldMetric);
			if (metric != oldMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC, oldMetric, metric));
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskProcessingAmount basicGetMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(TaskProcessingAmount newMetric, NotificationChain msgs) {
		TaskProcessingAmount oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC, oldMetric, newMetric);
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
	public void setMetric(TaskProcessingAmount newMetric) {
		if (newMetric != metric) {
			NotificationChain msgs = null;
			if (metric != null)
				msgs = ((InternalEObject)metric).eInverseRemove(this, PasysPackage.TASK_PROCESSING_AMOUNT__METER, TaskProcessingAmount.class, msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, PasysPackage.TASK_PROCESSING_AMOUNT__METER, TaskProcessingAmount.class, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((TaskExecutor)otherEnd, msgs);
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				if (metric != null)
					msgs = ((InternalEObject)metric).eInverseRemove(this, PasysPackage.TASK_PROCESSING_AMOUNT__METER, TaskProcessingAmount.class, msgs);
				return basicSetMetric((TaskProcessingAmount)otherEnd, msgs);
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				return basicSetOwner(null, msgs);
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				return basicSetMetric(null, msgs);
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.TASK_EXECUTOR__OWNED_METERS, TaskExecutor.class, msgs);
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				return getOwner();
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				if (resolve) return getMetric();
				return basicGetMetric();
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				setOwner((TaskExecutor)newValue);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				setMetric((TaskProcessingAmount)newValue);
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				setOwner((TaskExecutor)null);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				setMetric((TaskProcessingAmount)null);
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
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER:
				return getOwner() != null;
			case PasysPackage.TASK_PROCESSING_AMOUNT_METER__METRIC:
				return metric != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Returns the configuration info that must be added to the corresponding
	 * Prometheus Server
	 * @return Piece of configuration data to add to the Prometheus Server config file
	 * @generated NOT
	 */
	@Override
	public String getPrometheusServerConfiguration() {
		List<ProcessingNode> nodes = getHosts();
		PhysicalProcessingNode pNode= (PhysicalProcessingNode) nodes.get(0);
		
		String targets = "'"+pNode.getIp()+":"+this.getMonitoringPort()+"'";
		
		for (int i =1; i<nodes.size();i++) {
			pNode=(PhysicalProcessingNode) nodes.get(i);
			targets+=", '"+pNode.getIp()+":"+this.getMonitoringPort()+"'";
		}
		return "  - job_name: "+this.getId()+"\n"
	         + "    scrape_interval: "+this.getMonitoringTime()+"s\n"
			 + "    static_configs:\n"
			 + "      - targets: ["+targets+"]\n";
		
	}
	
	private List<ProcessingNode> getHosts(){
		
		ProcessingNodeCluster cluster = (ProcessingNodeCluster) this.getOwner().getOwner().getScheduler().getHost();
		return cluster.getNodes();
		
	}



} //TaskProcessingAmountMeterImpl
