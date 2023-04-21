/**
 */
package PASYS_Metamodel.pasys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployable Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage#getDeployableComponentType()
 * @model
 * @generated
 */
public enum DeployableComponentType implements Enumerator {
	/**
	 * The '<em><b>PROMETHEUS SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMETHEUS_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	PROMETHEUS_SERVICE(0, "PROMETHEUS_SERVICE", "PROMETHEUS_SERVICE"),

	/**
	 * The '<em><b>ZOOKEEPER SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOKEEPER_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ZOOKEEPER_SERVICE(1, "ZOOKEEPER_SERVICE", "ZOOKEEPER_SERVICE"),

	/**
	 * The '<em><b>KAFKA SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	KAFKA_SERVICE(2, "KAFKA_SERVICE", "KAFKA_SERVICE"),

	/**
	 * The '<em><b>CASSANDRA SERVICE SEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SERVICE_SEED_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA_SERVICE_SEED(3, "CASSANDRA_SERVICE_SEED", "CASSANDRA_SERVICE_SEED"),

	/**
	 * The '<em><b>CASSANDRA SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA_SERVICE(4, "CASSANDRA_SERVICE", "CASSANDRA_SERVICE"),

	/**
	 * The '<em><b>STORM NIMBUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_NIMBUS_VALUE
	 * @generated
	 * @ordered
	 */
	STORM_NIMBUS(5, "STORM_NIMBUS", "STORM_NIMBUS"),

	/**
	 * The '<em><b>STORM SUPERVISOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_SUPERVISOR_VALUE
	 * @generated
	 * @ordered
	 */
	STORM_SUPERVISOR(6, "STORM_SUPERVISOR", "STORM_SUPERVISOR"),

	/**
	 * The '<em><b>STORM UI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_UI_VALUE
	 * @generated
	 * @ordered
	 */
	STORM_UI(7, "STORM_UI", "STORM_UI"),

	/**
	 * The '<em><b>SPARK SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARK_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SPARK_SERVICE(8, "SPARK_SERVICE", "SPARK_SERVICE"),

	/**
	 * The '<em><b>KAFKA WORKLOAD STREAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_WORKLOAD_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	KAFKA_WORKLOAD_STREAM(9, "KAFKA_WORKLOAD_STREAM", "KAFKA_WORKLOAD_STREAM"),

	/**
	 * The '<em><b>KAFKA FLOW STREAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_FLOW_STREAM_VALUE
	 * @generated
	 * @ordered
	 */
	KAFKA_FLOW_STREAM(10, "KAFKA_FLOW_STREAM", "KAFKA_FLOW_STREAM"),

	/**
	 * The '<em><b>AVRO SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVRO_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	AVRO_SERVICE(11, "AVRO_SERVICE", "AVRO_SERVICE"),

	/**
	 * The '<em><b>NODE RESOURCE METER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_RESOURCE_METER_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_RESOURCE_METER(12, "NODE_RESOURCE_METER", "NODE_RESOURCE_METER"),

	/**
	 * The '<em><b>TASK EXECUTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_EXECUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_EXECUTOR(13, "TASK_EXECUTOR", "TASK_EXECUTOR"),

	/**
	 * The '<em><b>TASK AMOUNT METER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_AMOUNT_METER_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_AMOUNT_METER(14, "TASK_AMOUNT_METER", "TASK_AMOUNT_METER"),

	/**
	 * The '<em><b>DOCKER STACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_STACK_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER_STACK(15, "DOCKER_STACK", "DOCKER_STACK"),

	/**
	 * The '<em><b>CASSANDRA SCHEMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SCHEMA_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA_SCHEMA(16, "CASSANDRA_SCHEMA", "CASSANDRA_SCHEMA"),

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW(17, "WORKFLOW", "WORKFLOW");

	/**
	 * The '<em><b>PROMETHEUS SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMETHEUS_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROMETHEUS_SERVICE_VALUE = 0;

	/**
	 * The '<em><b>ZOOKEEPER SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOKEEPER_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZOOKEEPER_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>KAFKA SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KAFKA_SERVICE_VALUE = 2;

	/**
	 * The '<em><b>CASSANDRA SERVICE SEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SERVICE_SEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_SERVICE_SEED_VALUE = 3;

	/**
	 * The '<em><b>CASSANDRA SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_SERVICE_VALUE = 4;

	/**
	 * The '<em><b>STORM NIMBUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_NIMBUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORM_NIMBUS_VALUE = 5;

	/**
	 * The '<em><b>STORM SUPERVISOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_SUPERVISOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORM_SUPERVISOR_VALUE = 6;

	/**
	 * The '<em><b>STORM UI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_UI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORM_UI_VALUE = 7;

	/**
	 * The '<em><b>SPARK SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARK_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPARK_SERVICE_VALUE = 8;

	/**
	 * The '<em><b>KAFKA WORKLOAD STREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_WORKLOAD_STREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KAFKA_WORKLOAD_STREAM_VALUE = 9;

	/**
	 * The '<em><b>KAFKA FLOW STREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_FLOW_STREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KAFKA_FLOW_STREAM_VALUE = 10;

	/**
	 * The '<em><b>AVRO SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVRO_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVRO_SERVICE_VALUE = 11;

	/**
	 * The '<em><b>NODE RESOURCE METER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_RESOURCE_METER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODE_RESOURCE_METER_VALUE = 12;

	/**
	 * The '<em><b>TASK EXECUTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_EXECUTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_EXECUTOR_VALUE = 13;

	/**
	 * The '<em><b>TASK AMOUNT METER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_AMOUNT_METER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_AMOUNT_METER_VALUE = 14;

	/**
	 * The '<em><b>DOCKER STACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_STACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_STACK_VALUE = 15;

	/**
	 * The '<em><b>CASSANDRA SCHEMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_SCHEMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_SCHEMA_VALUE = 16;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 17;

	/**
	 * An array of all the '<em><b>Deployable Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeployableComponentType[] VALUES_ARRAY =
		new DeployableComponentType[] {
			PROMETHEUS_SERVICE,
			ZOOKEEPER_SERVICE,
			KAFKA_SERVICE,
			CASSANDRA_SERVICE_SEED,
			CASSANDRA_SERVICE,
			STORM_NIMBUS,
			STORM_SUPERVISOR,
			STORM_UI,
			SPARK_SERVICE,
			KAFKA_WORKLOAD_STREAM,
			KAFKA_FLOW_STREAM,
			AVRO_SERVICE,
			NODE_RESOURCE_METER,
			TASK_EXECUTOR,
			TASK_AMOUNT_METER,
			DOCKER_STACK,
			CASSANDRA_SCHEMA,
			WORKFLOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployable Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeployableComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployable Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeployableComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeployableComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployable Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeployableComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeployableComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployable Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeployableComponentType get(int value) {
		switch (value) {
			case PROMETHEUS_SERVICE_VALUE: return PROMETHEUS_SERVICE;
			case ZOOKEEPER_SERVICE_VALUE: return ZOOKEEPER_SERVICE;
			case KAFKA_SERVICE_VALUE: return KAFKA_SERVICE;
			case CASSANDRA_SERVICE_SEED_VALUE: return CASSANDRA_SERVICE_SEED;
			case CASSANDRA_SERVICE_VALUE: return CASSANDRA_SERVICE;
			case STORM_NIMBUS_VALUE: return STORM_NIMBUS;
			case STORM_SUPERVISOR_VALUE: return STORM_SUPERVISOR;
			case STORM_UI_VALUE: return STORM_UI;
			case SPARK_SERVICE_VALUE: return SPARK_SERVICE;
			case KAFKA_WORKLOAD_STREAM_VALUE: return KAFKA_WORKLOAD_STREAM;
			case KAFKA_FLOW_STREAM_VALUE: return KAFKA_FLOW_STREAM;
			case AVRO_SERVICE_VALUE: return AVRO_SERVICE;
			case NODE_RESOURCE_METER_VALUE: return NODE_RESOURCE_METER;
			case TASK_EXECUTOR_VALUE: return TASK_EXECUTOR;
			case TASK_AMOUNT_METER_VALUE: return TASK_AMOUNT_METER;
			case DOCKER_STACK_VALUE: return DOCKER_STACK;
			case CASSANDRA_SCHEMA_VALUE: return CASSANDRA_SCHEMA;
			case WORKFLOW_VALUE: return WORKFLOW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeployableComponentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeployableComponentType
