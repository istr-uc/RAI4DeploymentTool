/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prometheus Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PrometheusService#getExportersData <em>Exporters Data</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusService()
 * @model
 * @generated
 */
public interface PrometheusService extends MonitoringService {
	/**
	 * Returns the value of the '<em><b>Exporters Data</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.ExporterData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporters Data</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusService_ExportersData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExporterData> getExportersData();

} // PrometheusService
