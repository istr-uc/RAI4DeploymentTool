/**
 */
package PASYS_Metamodel.pasys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>External Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage#getExternalElementType()
 * @model
 * @generated
 */
public enum ExternalElementType implements Enumerator {
	/**
	 * The '<em><b>PROCESSING NODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING_NODE(0, "PROCESSING_NODE", "PROCESSING_NODE"),

	/**
	 * The '<em><b>COMMUNICATION SERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_SERVER(1, "COMMUNICATION_SERVER", "COMMUNICATION_SERVER"),

	/**
	 * The '<em><b>SCHEDULING SERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULING_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULING_SERVER(2, "SCHEDULING_SERVER", "SCHEDULING_SERVER"),

	/**
	 * The '<em><b>NODE CLUSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_CLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_CLUSTER(4, "NODE_CLUSTER", "NODE_CLUSTER"),

	/**
	 * The '<em><b>PLATFORM RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATFORM_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	PLATFORM_RESOURCE(5, "PLATFORM_RESOURCE", "PLATFORM_RESOURCE"),

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW(6, "WORKFLOW", "WORKFLOW"),

	/**
	 * The '<em><b>SCHEDULABLE SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULABLE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULABLE_SET(7, "SCHEDULABLE_SET", "SCHEDULABLE_SET"),

	/**
	 * The '<em><b>TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(8, "TASK", "TASK");

	/**
	 * The '<em><b>PROCESSING NODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSING NODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_NODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_NODE_VALUE = 0;

	/**
	 * The '<em><b>COMMUNICATION SERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMUNICATION SERVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_SERVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_SERVER_VALUE = 1;

	/**
	 * The '<em><b>SCHEDULING SERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHEDULING SERVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULING_SERVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULING_SERVER_VALUE = 2;

	/**
	 * The '<em><b>NODE CLUSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NODE CLUSTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODE_CLUSTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODE_CLUSTER_VALUE = 4;

	/**
	 * The '<em><b>PLATFORM RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLATFORM RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLATFORM_RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLATFORM_RESOURCE_VALUE = 5;

	/**
	 * The '<em><b>WORKFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WORKFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_VALUE = 6;

	/**
	 * The '<em><b>SCHEDULABLE SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHEDULABLE SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULABLE_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULABLE_SET_VALUE = 7;

	/**
	 * The '<em><b>TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 8;

	/**
	 * An array of all the '<em><b>External Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExternalElementType[] VALUES_ARRAY =
		new ExternalElementType[] {
			PROCESSING_NODE,
			COMMUNICATION_SERVER,
			SCHEDULING_SERVER,
			NODE_CLUSTER,
			PLATFORM_RESOURCE,
			WORKFLOW,
			SCHEDULABLE_SET,
			TASK,
		};

	/**
	 * A public read-only list of all the '<em><b>External Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExternalElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>External Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExternalElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>External Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExternalElementType get(int value) {
		switch (value) {
			case PROCESSING_NODE_VALUE: return PROCESSING_NODE;
			case COMMUNICATION_SERVER_VALUE: return COMMUNICATION_SERVER;
			case SCHEDULING_SERVER_VALUE: return SCHEDULING_SERVER;
			case NODE_CLUSTER_VALUE: return NODE_CLUSTER;
			case PLATFORM_RESOURCE_VALUE: return PLATFORM_RESOURCE;
			case WORKFLOW_VALUE: return WORKFLOW;
			case SCHEDULABLE_SET_VALUE: return SCHEDULABLE_SET;
			case TASK_VALUE: return TASK;
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
	private ExternalElementType(int value, String name, String literal) {
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
	
} //ExternalElementType
