/**
 */
package PASYS_Metamodel.pasys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nomad Driver</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage#getNomadDriver()
 * @model
 * @generated
 */
public enum NomadDriver implements Enumerator {
	/**
	 * The '<em><b>JAVA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA(0, "JAVA", "JAVA"),

	/**
	 * The '<em><b>DOCKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER(0, "DOCKER", "DOCKER"),

	/**
	 * The '<em><b>QEMU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QEMU_VALUE
	 * @generated
	 * @ordered
	 */
	QEMU(0, "QEMU", "QEMU"),

	/**
	 * The '<em><b>PODMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PODMAN_VALUE
	 * @generated
	 * @ordered
	 */
	PODMAN(0, "PODMAN", "PODMAN"),

	/**
	 * The '<em><b>EXEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXEC_VALUE
	 * @generated
	 * @ordered
	 */
	EXEC(0, "EXEC", "EXEC");

	/**
	 * The '<em><b>JAVA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VALUE = 0;

	/**
	 * The '<em><b>DOCKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_VALUE = 0;

	/**
	 * The '<em><b>QEMU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QEMU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QEMU_VALUE = 0;

	/**
	 * The '<em><b>PODMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PODMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PODMAN_VALUE = 0;

	/**
	 * The '<em><b>EXEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXEC_VALUE = 0;

	/**
	 * An array of all the '<em><b>Nomad Driver</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NomadDriver[] VALUES_ARRAY =
		new NomadDriver[] {
			JAVA,
			DOCKER,
			QEMU,
			PODMAN,
			EXEC,
		};

	/**
	 * A public read-only list of all the '<em><b>Nomad Driver</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NomadDriver> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nomad Driver</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NomadDriver get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NomadDriver result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nomad Driver</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NomadDriver getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NomadDriver result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nomad Driver</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NomadDriver get(int value) {
		switch (value) {
			case JAVA_VALUE: return JAVA;
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
	private NomadDriver(int value, String name, String literal) {
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
	
} //NomadDriver
