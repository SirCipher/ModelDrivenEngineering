/**
 */
package trackit;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trackit.Issue#getTitle <em>Title</em>}</li>
 *   <li>{@link trackit.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link trackit.Issue#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link trackit.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link trackit.Issue#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link trackit.Issue#getAuthor <em>Author</em>}</li>
 *   <li>{@link trackit.Issue#getBlockers <em>Blockers</em>}</li>
 *   <li>{@link trackit.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link trackit.Issue#getComments <em>Comments</em>}</li>
 *   <li>{@link trackit.Issue#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link trackit.Issue#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link trackit.Issue#getVersionsAffected <em>Versions Affected</em>}</li>
 *   <li>{@link trackit.Issue#getBlocking <em>Blocking</em>}</li>
 * </ul>
 * </p>
 *
 * @see trackit.TrackitPackage#getIssue()
 * @model annotation="gmf.node label='title'"
 * @generated
 */
public interface Issue extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see trackit.TrackitPackage#getIssue_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link trackit.Issue#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see trackit.TrackitPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link trackit.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link trackit.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see trackit.IssueStatus
	 * @see #setStatus(IssueStatus)
	 * @see trackit.TrackitPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link trackit.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see trackit.IssueStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' attribute list.
	 * The list contents are of type {@link trackit.IssueType}.
	 * The literals are from the enumeration {@link trackit.IssueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' attribute list.
	 * @see trackit.IssueType
	 * @see trackit.TrackitPackage#getIssue_IssueType()
	 * @model required="true"
	 * @generated
	 */
	EList<IssueType> getIssueType();

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(String)
	 * @see trackit.TrackitPackage#getIssue_DateCreated()
	 * @model
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link trackit.Issue#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link trackit.Comment}.
	 * It is bidirectional and its opposite is '{@link trackit.Comment#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see trackit.TrackitPackage#getIssue_Comments()
	 * @see trackit.Comment#getIssue
	 * @model opposite="issue" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Duplicate Of</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicate Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Of</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_DuplicateOf()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='220,20,60' label='Duplicate of'"
	 * @generated
	 */
	EList<Issue> getDuplicateOf();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_Dependencies()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='34,139,34' label='Dependencies'"
	 * @generated
	 */
	EList<Issue> getDependencies();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link trackit.Member#getIssuesCreated <em>Issues Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Member)
	 * @see trackit.TrackitPackage#getIssue_Author()
	 * @see trackit.Member#getIssuesCreated
	 * @model opposite="issuesCreated"
	 * @generated
	 */
	Member getAuthor();

	/**
	 * Sets the value of the '{@link trackit.Issue#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Member value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
	 * The list contents are of type {@link trackit.Member}.
	 * It is bidirectional and its opposite is '{@link trackit.Member#getIssuesAssigned <em>Issues Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_AssignedTo()
	 * @see trackit.Member#getIssuesAssigned
	 * @model opposite="issuesAssigned"
	 * @generated
	 */
	EList<Member> getAssignedTo();

	/**
	 * Returns the value of the '<em><b>Versions Affected</b></em>' reference list.
	 * The list contents are of type {@link trackit.Version}.
	 * It is bidirectional and its opposite is '{@link trackit.Version#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions Affected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions Affected</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_VersionsAffected()
	 * @see trackit.Version#getIssues
	 * @model opposite="issues" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' label='Versions Affected'"
	 * @generated
	 */
	EList<Version> getVersionsAffected();

	/**
	 * Returns the value of the '<em><b>Blocking</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getBlockers <em>Blockers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_Blocking()
	 * @see trackit.Issue#getBlockers
	 * @model opposite="blockers"
	 *        annotation="gmf.link target.decoration='arrow' color='255,0,255' label='Blocking'"
	 * @generated
	 */
	EList<Issue> getBlocking();

	/**
	 * Returns the value of the '<em><b>Blockers</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockers</em>' reference list.
	 * @see trackit.TrackitPackage#getIssue_Blockers()
	 * @see trackit.Issue#getBlocking
	 * @model opposite="blocking"
	 * @generated
	 */
	EList<Issue> getBlockers();

} // Issue
