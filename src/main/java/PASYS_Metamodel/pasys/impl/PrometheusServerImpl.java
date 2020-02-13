/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.ExporterData;
import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PrometheusServer;
import deploymentTool.DeploymentToolsUtils;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import PASYS_Metamodel.pasys.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prometheus Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PrometheusServerImpl#getExportersData <em>Exporters Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrometheusServerImpl extends MonitoringServerImpl implements PrometheusServer {
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
	protected PrometheusServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROMETHEUS_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExporterData> getExportersData() {
		if (exportersData == null) {
			exportersData = new EObjectContainmentEList<ExporterData>(ExporterData.class, this, PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA);
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
			case PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA:
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
			case PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA:
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
			case PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA:
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
			case PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA:
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
			case PasysPackage.PROMETHEUS_SERVER__EXPORTERS_DATA:
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
	public void deploy() throws ConfigurationException {
		
		// prometheus.yml file generation
		String prometheusConfigFile ="prometheus"+getId()+".yml";
		String prometheusConfigContent=CONFIG_FILE_HEAD;
		for(Meter meter:this.getMonitorizedMeters()){
			PrometheusMeter pMeter =(PrometheusMeter) meter;
				prometheusConfigContent+=pMeter.getPrometheusServerConfiguration();
		}
		
		// Add file to the legatedConfigFiles of the host
		DeploymentFileDescriptor configFile = new DeploymentFileDescriptorImpl(prometheusConfigFile, configFolderPath, 
					prometheusConfigContent, SystemComponentType.PROMETHEUS_SERVER);
		host.getConfigFiles().add(configFile);

		// Launching script generation
		String scriptContent =  "/usr/local/bin/launch ";
		scriptContent += this.artifactLocator+"/"+this.artifactName+" --config.file="+configFolderPath+"/"+prometheusConfigFile;
		scriptContent=DeploymentToolsUtils.scriptHeaders(getScriptFolderPath())+scriptContent;
		String scriptName = "prometheusScript.sh";
		
		DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, scriptFolderPath, scriptContent, SystemComponentType.PROMETHEUS_SERVER);
		host.getLaunchingScripts().add(script);
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

} //PrometheusServerImpl
