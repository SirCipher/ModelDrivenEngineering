/**
 */
package trackit.tests;

import junit.textui.TestRunner;

import trackit.TrackitFactory;
import trackit.Version;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VersionTest.class);
	}

	/**
	 * Constructs a new Version test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Version getFixture() {
		return (Version)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrackitFactory.eINSTANCE.createVersion());
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

} //VersionTest
