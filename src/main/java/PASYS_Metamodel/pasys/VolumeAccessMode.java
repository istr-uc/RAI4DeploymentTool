/**
 */
package PASYS_Metamodel.pasys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Volume Access Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PASYS_Metamodel.pasys.PasysPackage#getVolumeAccessMode()
 * @model
 * @generated
 */
public enum VolumeAccessMode implements Enumerator {
	/**
	 * The '<em><b>READWRITEONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEONCE_VALUE
	 * @generated
	 * @ordered
	 */
	READWRITEONCE(0, "READWRITEONCE", "READWRITEONCE"),

	/**
	 * The '<em><b>READONLYMANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READONLYMANY_VALUE
	 * @generated
	 * @ordered
	 */
	READONLYMANY(1, "READONLYMANY", "READONLYMANY"),

	/**
	 * The '<em><b>READWRITEMANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEMANY_VALUE
	 * @generated
	 * @ordered
	 */
	READWRITEMANY(2, "READWRITEMANY", "READWRITEMANY"),

	/**
	 * The '<em><b>READWRITEONCEPOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEONCEPOD_VALUE
	 * @generated
	 * @ordered
	 */
	READWRITEONCEPOD(3, "READWRITEONCEPOD", "READWRITEONCEPOD");

	/**
	 * The '<em><b>READWRITEONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READWRITEONCE_VALUE = 0;

	/**
	 * The '<em><b>READONLYMANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READONLYMANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READONLYMANY_VALUE = 1;

	/**
	 * The '<em><b>READWRITEMANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEMANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READWRITEMANY_VALUE = 2;

	/**
	 * The '<em><b>READWRITEONCEPOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READWRITEONCEPOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READWRITEONCEPOD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Volume Access Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VolumeAccessMode[] VALUES_ARRAY =
		new VolumeAccessMode[] {
			READWRITEONCE,
			READONLYMANY,
			READWRITEMANY,
			READWRITEONCEPOD,
		};

	/**
	 * A public read-only list of all the '<em><b>Volume Access Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VolumeAccessMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Volume Access Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeAccessMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VolumeAccessMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Volume Access Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeAccessMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VolumeAccessMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Volume Access Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VolumeAccessMode get(int value) {
		switch (value) {
			case READWRITEONCE_VALUE: return READWRITEONCE;
			case READONLYMANY_VALUE: return READONLYMANY;
			case READWRITEMANY_VALUE: return READWRITEMANY;
			case READWRITEONCEPOD_VALUE: return READWRITEONCEPOD;
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
	private VolumeAccessMode(int value, String name, String literal) {
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
	
} //VolumeAccessMode
