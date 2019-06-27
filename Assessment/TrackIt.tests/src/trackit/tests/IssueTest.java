/**
 */
package trackit.tests;

import junit.textui.TestRunner;

import trackit.Issue;
import trackit.TrackitFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueTest extends IdentifiableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IssueTest.class);
	}

	/**
	 * Constructs a new Issue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Issue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Issue getFixture() {
		return (Issue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TrackitFactory.eINSTANCE.createIssue());
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

} //IssueTest
