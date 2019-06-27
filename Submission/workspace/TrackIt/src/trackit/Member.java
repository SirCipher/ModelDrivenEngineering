/**
 */
package trackit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trackit.Member#getFirstName <em>First Name</em>}</li>
 *   <li>{@link trackit.Member#getLastName <em>Last Name</em>}</li>
 *   <li>{@link trackit.Member#getFullName <em>Full Name</em>}</li>
 *   <li>{@link trackit.Member#getIssuesCreated <em>Issues Created</em>}</li>
 *   <li>{@link trackit.Member#getComments <em>Comments</em>}</li>
 *   <li>{@link trackit.Member#getIssuesAssigned <em>Issues Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see trackit.TrackitPackage#getMember()
 * @model annotation="gmf.node label='fullName'"
 * @generated
 */
public interface Member extends Identifiable {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see trackit.TrackitPackage#getMember_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link trackit.Member#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see trackit.TrackitPackage#getMember_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link trackit.Member#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see trackit.TrackitPackage#getMember_FullName()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link trackit.Member#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Issues Created</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues Created</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues Created</em>' reference list.
	 * @see trackit.TrackitPackage#getMember_IssuesCreated()
	 * @see trackit.Issue#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Issue> getIssuesCreated();

	/**
	 * Returns the value of the '<em><b>Issues Assigned</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues Assigned</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues Assigned</em>' reference list.
	 * @see trackit.TrackitPackage#getMember_IssuesAssigned()
	 * @see trackit.Issue#getAssignedTo
	 * @model opposite="assignedTo"
	 *        annotation="gmf.link label='Issues assigned' style='solid'"
	 * @generated
	 */
	EList<Issue> getIssuesAssigned();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link trackit.Comment}.
	 * It is bidirectional and its opposite is '{@link trackit.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see trackit.TrackitPackage#getMember_Comments()
	 * @see trackit.Comment#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Comment> getComments();

} // Member
