/**
 */
package PASYS_Metamodel.pasys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage#getServiceType()
 * @model
 * @generated
 */
public enum ServiceType implements Enumerator {
	/**
	 * The '<em><b>LOAD BALANCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_BALANCER(0, "LOAD_BALANCER", "LOAD_BALANCER"),

	/**
	 * The '<em><b>CLUSTER IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_IP(0, "CLUSTER_IP", "CLUSTER_IP");

	/**
	 * The '<em><b>LOAD BALANCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BALANCER_VALUE = 0;

	/**
	 * The '<em><b>CLUSTER IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_IP_VALUE = 0;

	/**
	 * An array of all the '<em><b>Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceType[] VALUES_ARRAY =
		new ServiceType[] {
			LOAD_BALANCER,
			CLUSTER_IP,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType get(int value) {
		switch (value) {
			case LOAD_BALANCER_VALUE: return LOAD_BALANCER;
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
	private ServiceType(int value, String name, String literal) {
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
	
} //ServiceType
