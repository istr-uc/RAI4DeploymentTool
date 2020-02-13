/**
 */
package PASYS_Metamodel.pasys;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prometheus Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.PrometheusServer#getExportersData <em>Exporters Data</em>}</li>
 * </ul>
 *
 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusServer()
 * @model
 * @generated
 */
public interface PrometheusServer extends MonitoringServer, SystemComponent {

	/**
	 * Returns the value of the '<em><b>Exporters Data</b></em>' containment reference list.
	 * The list contents are of type {@link PASYS_Metamodel.pasys.ExporterData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporters Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporters Data</em>' containment reference list.
	 * @see PASYS_Metamodel.pasys.PasysPackage#getPrometheusServer_ExportersData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExporterData> getExportersData();

} // PrometheusServer
