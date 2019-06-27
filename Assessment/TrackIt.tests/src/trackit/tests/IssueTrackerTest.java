/**
 */
package trackit.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import trackit.IssueTracker;
import trackit.TrackitFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Issue Tracker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueTrackerTest extends TestCase {

	/**
	 * The fixture for this Issue Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueTracker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IssueTrackerTest.class);
	}

	/**
	 * Constructs a new Issue Tracker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTrackerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Issue Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IssueTracker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Issue Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueTracker getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrackitFactory.eINSTANCE.createIssueTracker());
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

} //IssueTrackerTest
