/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ConfigurationException;
import PASYS_Metamodel.pasys.DeploymentFileDescriptor;
import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.Meter;
import PASYS_Metamodel.pasys.NodeClusterDeploymentConf;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.ProcessingNode;
import PASYS_Metamodel.pasys.PrometheusMeter;
import PASYS_Metamodel.pasys.PrometheusService;
import PASYS_Metamodel.pasys.SystemComponentType;
import deploymentTool.DeploymentToolsUtils;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prometheus Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PrometheusServiceImpl#getExportersData <em>Exporters Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrometheusServiceImpl extends MonitoringServiceImpl implements PrometheusService {
	/**
	 * The cached value of the '{@link #getExportersData() <em>Exporters Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportersData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExporterData> exportersData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrometheusServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROMETHEUS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExporterData> getExportersData() {
		if (exportersData == null) {
			exportersData = new EObjectContainmentEList<ExporterData>(ExporterData.class, this, PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA);
		}
		return exportersData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return ((InternalEList<?>)getExportersData()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return getExportersData();
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				getExportersData().clear();
				getExportersData().addAll((Collection<? extends ExporterData>)newValue);
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				getExportersData().clear();
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return exportersData != null && !exportersData.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		super.configureDeployment();
		if (getHost()!=null)
			configureDeploymentOnHost();
		else
			configureDeploymentOnOrchestrator();
	}
	
	private void configureDeploymentOnOrchestrator() {
		// TODO Auto-generated method stub
	}

	private void configureDeploymentOnHost() throws ConfigurationException {
		NodeClusterDeploymentConf conf = (NodeClusterDeploymentConf) getDeploymentConfig();
		
		// prometheus.yml file generation
		String prometheusConfigFile ="prometheus"+getId()+".yml";
		String prometheusConfigContent=CONFIG_FILE_HEAD;
		for(Meter meter:this.getMonitorizedMeters()){
			PrometheusMeter pMeter =(PrometheusMeter) meter;
				prometheusConfigContent+=pMeter.getPrometheusServerConfiguration();
		}
		
		// Add file to the legatedConfigFiles of the host
		DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl(
				prometheusConfigFile, conf.getConfigFolderPath(), 
				prometheusConfigContent, SystemComponentType.PROMETHEUS_SERVER);
		
		// Launching script generation
		String scriptContent =  "/usr/local/bin/launch ";
		scriptContent += conf.getArtifactLocator()+"/"+conf.getArtifactName()+
				" --config.file="+conf.getConfigFolderPath()+"/"+prometheusConfigFile;
		scriptContent=DeploymentToolsUtils.scriptHeaders(conf.getScriptFolderPath())+scriptContent;
		String scriptName = "prometheusScript.sh";
		
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, 
				conf.getScriptFolderPath(), scriptContent, SystemComponentType.PROMETHEUS_SERVER);

		for (ProcessingNode node: getHost().getNodes()) {
			node.getLaunchingScripts().add(script);
			node.getConfigFiles().add(configFile);
		}
	}
	
	public static final String CONFIG_FILE_HEAD= "# my global config\nglobal:\n"
			+ "  scrape_interval: 5s "
			+ "# Set the scrape interval to every 15 seconds. Default is every 1 minute.\n"
			+ "  evaluation_interval: 15s "
			+ "# Evaluate rules every 15 seconds. The default is every 1 minute.\n"
			+ "  # scrape_timeout is set to the global default (10s).\n\n"
			+ "# Alertmanager configuration\n"
			+ "alerting:\n"
			+ "  alertmanagers:\n"
			+ "  - static_configs:\n"
			+ "    - targets:\n"
			+ "      # - alertmanager:9093\n\n"
			+ "# Load rules once and periodically evaluate them according to the global 'evaluation_interval'.\n"
			+ "rule_files:\n"
			+ "  # - \""+"first_rules.yml"+"\""+"\n"
			+ "  # - \""+"second_rules.yml"+"\""+"\n\n"
			+"# A scrape configuration containing exactly one endpoint to scrape:\n"
			+"# Here it's Prometheus itself.\n"
			+ "scrape_configs:\n"
			+ "  # The job name is added as a label `job=<job_name>` to any timeseries scraped from this config.\n"
			+ "  - job_name: 'prometheus'\n"
			+ "    # metrics_path defaults to '/metrics'\n"
			+ "    # scheme defaults to 'http'.\n"
			+ "    static_configs:\n"
			+ "      - targets: ['localhost:9090']\n";


} //PrometheusServiceImpl
