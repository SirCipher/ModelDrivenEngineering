/**
 */
package trackit.tests;

import junit.textui.TestRunner;

import trackit.Member;
import trackit.TrackitFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link trackit.Member#getFullName() <em>Full Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MemberTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemberTest.class);
	}

	/**
	 * Constructs a new Member test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Member test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Member getFixture() {
		return (Member)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrackitFactory.eINSTANCE.createMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link trackit.Member#getFullName() <em>Full Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.Member#getFullName()
	 * @generated
	 */
	public void testGetFullName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link trackit.Member#setFullName(java.lang.String) <em>Full Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.Member#setFullName(java.lang.String)
	 * @generated
	 */
	public void testSetFullName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //MemberTest
