/**
 */
package trackit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trackit.TrackitFactory
 * @model kind="package"
 * @generated
 */
public interface TrackitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trackit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "trackit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trackit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrackitPackage eINSTANCE = trackit.impl.TrackitPackageImpl.init();

	/**
	 * The meta object id for the '{@link trackit.impl.IssueTrackerImpl <em>Issue Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.IssueTrackerImpl
	 * @see trackit.impl.TrackitPackageImpl#getIssueTracker()
	 * @generated
	 */
	int ISSUE_TRACKER = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__ISSUES = 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER__MEMBERS = 4;

	/**
	 * The number of structural features of the '<em>Issue Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TRACKER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link trackit.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.IdentifiableImpl
	 * @see trackit.impl.TrackitPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link trackit.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.MemberImpl
	 * @see trackit.impl.TrackitPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FIRST_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LAST_NAME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FULL_NAME = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issues Created</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ISSUES_CREATED = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENTS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Issues Assigned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ISSUES_ASSIGNED = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link trackit.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.TeamImpl
	 * @see trackit.impl.TrackitPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TEAM_NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MEMBERS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link trackit.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.VersionImpl
	 * @see trackit.impl.TrackitPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 5;

	/**
	 * The meta object id for the '{@link trackit.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.ProductImpl
	 * @see trackit.impl.TrackitPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__STATUS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__PRODUCT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ISSUES = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link trackit.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.IssueImpl
	 * @see trackit.impl.TrackitPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DATE_CREATED = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_TYPE = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__AUTHOR = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blockers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BLOCKERS = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNED_TO = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__COMMENTS = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUPLICATE_OF = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DEPENDENCIES = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Versions Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__VERSIONS_AFFECTED = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BLOCKING = IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link trackit.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.impl.CommentImpl
	 * @see trackit.impl.TrackitPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DATE_CREATED = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ISSUE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PARENT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Replies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REPLIES = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link trackit.VersionStatus <em>Version Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.VersionStatus
	 * @see trackit.impl.TrackitPackageImpl#getVersionStatus()
	 * @generated
	 */
	int VERSION_STATUS = 8;

	/**
	 * The meta object id for the '{@link trackit.IssueStatus <em>Issue Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.IssueStatus
	 * @see trackit.impl.TrackitPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 9;

	/**
	 * The meta object id for the '{@link trackit.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trackit.IssueType
	 * @see trackit.impl.TrackitPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link trackit.IssueTracker <em>Issue Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Tracker</em>'.
	 * @see trackit.IssueTracker
	 * @generated
	 */
	EClass getIssueTracker();

	/**
	 * Returns the meta object for the attribute '{@link trackit.IssueTracker#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see trackit.IssueTracker#getProjectName()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EAttribute getIssueTracker_ProjectName();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.IssueTracker#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see trackit.IssueTracker#getTeams()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.IssueTracker#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see trackit.IssueTracker#getProducts()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.IssueTracker#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see trackit.IssueTracker#getIssues()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Issues();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.IssueTracker#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see trackit.IssueTracker#getMembers()
	 * @see #getIssueTracker()
	 * @generated
	 */
	EReference getIssueTracker_Members();

	/**
	 * Returns the meta object for class '{@link trackit.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see trackit.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see trackit.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for class '{@link trackit.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see trackit.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Member#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see trackit.Member#getFirstName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Member#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see trackit.Member#getLastName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_LastName();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Member#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see trackit.Member#getFullName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_FullName();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Member#getIssuesCreated <em>Issues Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues Created</em>'.
	 * @see trackit.Member#getIssuesCreated()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_IssuesCreated();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Member#getIssuesAssigned <em>Issues Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues Assigned</em>'.
	 * @see trackit.Member#getIssuesAssigned()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_IssuesAssigned();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Member#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see trackit.Member#getComments()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Comments();

	/**
	 * Returns the meta object for class '{@link trackit.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see trackit.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Team#getTeamName <em>Team Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Name</em>'.
	 * @see trackit.Team#getTeamName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_TeamName();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Team#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see trackit.Team#getMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Members();

	/**
	 * Returns the meta object for class '{@link trackit.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see trackit.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trackit.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for the reference '{@link trackit.Version#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see trackit.Version#getProduct()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Product();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Version#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see trackit.Version#getStatus()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Status();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Version#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see trackit.Version#getIssues()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Issues();

	/**
	 * Returns the meta object for class '{@link trackit.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see trackit.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trackit.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.Product#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see trackit.Product#getVersion()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Version();

	/**
	 * Returns the meta object for class '{@link trackit.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see trackit.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Issue#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see trackit.Issue#getTitle()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Title();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see trackit.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see trackit.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the attribute list '{@link trackit.Issue#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Issue Type</em>'.
	 * @see trackit.Issue#getIssueType()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_IssueType();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Issue#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see trackit.Issue#getDateCreated()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DateCreated();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see trackit.Issue#getComments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Comments();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getDuplicateOf <em>Duplicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Duplicate Of</em>'.
	 * @see trackit.Issue#getDuplicateOf()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_DuplicateOf();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see trackit.Issue#getDependencies()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Dependencies();

	/**
	 * Returns the meta object for the reference '{@link trackit.Issue#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see trackit.Issue#getAuthor()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Author();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned To</em>'.
	 * @see trackit.Issue#getAssignedTo()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AssignedTo();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getVersionsAffected <em>Versions Affected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions Affected</em>'.
	 * @see trackit.Issue#getVersionsAffected()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_VersionsAffected();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocking</em>'.
	 * @see trackit.Issue#getBlocking()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Blocking();

	/**
	 * Returns the meta object for the reference list '{@link trackit.Issue#getBlockers <em>Blockers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blockers</em>'.
	 * @see trackit.Issue#getBlockers()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Blockers();

	/**
	 * Returns the meta object for class '{@link trackit.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see trackit.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see trackit.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for the attribute '{@link trackit.Comment#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see trackit.Comment#getDateCreated()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_DateCreated();

	/**
	 * Returns the meta object for the containment reference list '{@link trackit.Comment#getReplies <em>Replies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replies</em>'.
	 * @see trackit.Comment#getReplies()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Replies();

	/**
	 * Returns the meta object for the container reference '{@link trackit.Comment#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Issue</em>'.
	 * @see trackit.Comment#getIssue()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Issue();

	/**
	 * Returns the meta object for the container reference '{@link trackit.Comment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see trackit.Comment#getParent()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Parent();

	/**
	 * Returns the meta object for the reference '{@link trackit.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see trackit.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Author();

	/**
	 * Returns the meta object for enum '{@link trackit.VersionStatus <em>Version Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Status</em>'.
	 * @see trackit.VersionStatus
	 * @generated
	 */
	EEnum getVersionStatus();

	/**
	 * Returns the meta object for enum '{@link trackit.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Status</em>'.
	 * @see trackit.IssueStatus
	 * @generated
	 */
	EEnum getIssueStatus();

	/**
	 * Returns the meta object for enum '{@link trackit.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see trackit.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrackitFactory getTrackitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link trackit.impl.IssueTrackerImpl <em>Issue Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.IssueTrackerImpl
		 * @see trackit.impl.TrackitPackageImpl#getIssueTracker()
		 * @generated
		 */
		EClass ISSUE_TRACKER = eINSTANCE.getIssueTracker();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_TRACKER__PROJECT_NAME = eINSTANCE.getIssueTracker_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__TEAMS = eINSTANCE.getIssueTracker_Teams();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__PRODUCTS = eINSTANCE.getIssueTracker_Products();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__ISSUES = eINSTANCE.getIssueTracker_Issues();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TRACKER__MEMBERS = eINSTANCE.getIssueTracker_Members();

		/**
		 * The meta object literal for the '{@link trackit.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.IdentifiableImpl
		 * @see trackit.impl.TrackitPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '{@link trackit.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.MemberImpl
		 * @see trackit.impl.TrackitPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__FIRST_NAME = eINSTANCE.getMember_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__LAST_NAME = eINSTANCE.getMember_LastName();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__FULL_NAME = eINSTANCE.getMember_FullName();

		/**
		 * The meta object literal for the '<em><b>Issues Created</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__ISSUES_CREATED = eINSTANCE.getMember_IssuesCreated();

		/**
		 * The meta object literal for the '<em><b>Issues Assigned</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__ISSUES_ASSIGNED = eINSTANCE.getMember_IssuesAssigned();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__COMMENTS = eINSTANCE.getMember_Comments();

		/**
		 * The meta object literal for the '{@link trackit.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.TeamImpl
		 * @see trackit.impl.TrackitPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Team Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__TEAM_NAME = eINSTANCE.getTeam_TeamName();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MEMBERS = eINSTANCE.getTeam_Members();

		/**
		 * The meta object literal for the '{@link trackit.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.VersionImpl
		 * @see trackit.impl.TrackitPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__PRODUCT = eINSTANCE.getVersion_Product();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__STATUS = eINSTANCE.getVersion_Status();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__ISSUES = eINSTANCE.getVersion_Issues();

		/**
		 * The meta object literal for the '{@link trackit.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.ProductImpl
		 * @see trackit.impl.TrackitPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__VERSION = eINSTANCE.getProduct_Version();

		/**
		 * The meta object literal for the '{@link trackit.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.IssueImpl
		 * @see trackit.impl.TrackitPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__TITLE = eINSTANCE.getIssue_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ISSUE_TYPE = eINSTANCE.getIssue_IssueType();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DATE_CREATED = eINSTANCE.getIssue_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__COMMENTS = eINSTANCE.getIssue_Comments();

		/**
		 * The meta object literal for the '<em><b>Duplicate Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__DUPLICATE_OF = eINSTANCE.getIssue_DuplicateOf();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__DEPENDENCIES = eINSTANCE.getIssue_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__AUTHOR = eINSTANCE.getIssue_Author();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNED_TO = eINSTANCE.getIssue_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Versions Affected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__VERSIONS_AFFECTED = eINSTANCE.getIssue_VersionsAffected();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__BLOCKING = eINSTANCE.getIssue_Blocking();

		/**
		 * The meta object literal for the '<em><b>Blockers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__BLOCKERS = eINSTANCE.getIssue_Blockers();

		/**
		 * The meta object literal for the '{@link trackit.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.impl.CommentImpl
		 * @see trackit.impl.TrackitPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DATE_CREATED = eINSTANCE.getComment_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Replies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__REPLIES = eINSTANCE.getComment_Replies();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ISSUE = eINSTANCE.getComment_Issue();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__PARENT = eINSTANCE.getComment_Parent();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '{@link trackit.VersionStatus <em>Version Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.VersionStatus
		 * @see trackit.impl.TrackitPackageImpl#getVersionStatus()
		 * @generated
		 */
		EEnum VERSION_STATUS = eINSTANCE.getVersionStatus();

		/**
		 * The meta object literal for the '{@link trackit.IssueStatus <em>Issue Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.IssueStatus
		 * @see trackit.impl.TrackitPackageImpl#getIssueStatus()
		 * @generated
		 */
		EEnum ISSUE_STATUS = eINSTANCE.getIssueStatus();

		/**
		 * The meta object literal for the '{@link trackit.IssueType <em>Issue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trackit.IssueType
		 * @see trackit.impl.TrackitPackageImpl#getIssueType()
		 * @generated
		 */
		EEnum ISSUE_TYPE = eINSTANCE.getIssueType();

	}

} //TrackitPackage
