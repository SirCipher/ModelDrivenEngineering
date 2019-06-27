/**
 */
package trackit.tests;

import junit.textui.TestRunner;

import trackit.Team;
import trackit.TrackitFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamTest.class);
	}

	/**
	 * Constructs a new Team test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Team test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Team getFixture() {
		return (Team)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrackitFactory.eINSTANCE.createTeam());
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

} //TeamTest
