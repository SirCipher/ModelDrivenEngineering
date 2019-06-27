/**
 */
package trackit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trackit.TrackitPackage#getIssueType()
 * @model
 * @generated
 */
public enum IssueType implements Enumerator {
	/**
	 * The '<em><b>ENHANCEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENHANCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENHANCEMENT(0, "ENHANCEMENT", "ENHANCEMENT"),

	/**
	 * The '<em><b>BUG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUG_VALUE
	 * @generated
	 * @ordered
	 */
	BUG(1, "BUG", "BUG"),

	/**
	 * The '<em><b>WONT FIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WONT_FIX_VALUE
	 * @generated
	 * @ordered
	 */
	WONT_FIX(2, "WONT_FIX", "WONT_FIX"),

	/**
	 * The '<em><b>HELP REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	HELP_REQUIRED(3, "HELP_REQUIRED", "HELP_REQUIRED"),

	/**
	 * The '<em><b>DUPLICATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(4, "DUPLICATE", "DUPLICATE");

	/**
	 * The '<em><b>ENHANCEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENHANCEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENHANCEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENHANCEMENT_VALUE = 0;

	/**
	 * The '<em><b>BUG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUG_VALUE = 1;

	/**
	 * The '<em><b>WONT FIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WONT FIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WONT_FIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WONT_FIX_VALUE = 2;

	/**
	 * The '<em><b>HELP REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HELP REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HELP_REQUIRED_VALUE = 3;

	/**
	 * The '<em><b>DUPLICATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUPLICATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Issue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueType[] VALUES_ARRAY =
		new IssueType[] {
			ENHANCEMENT,
			BUG,
			WONT_FIX,
			HELP_REQUIRED,
			DUPLICATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssueType get(int value) {
		switch (value) {
			case ENHANCEMENT_VALUE: return ENHANCEMENT;
			case BUG_VALUE: return BUG;
			case WONT_FIX_VALUE: return WONT_FIX;
			case HELP_REQUIRED_VALUE: return HELP_REQUIRED;
			case DUPLICATE_VALUE: return DUPLICATE;
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
	private IssueType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //IssueType
