/**
 */
package trackit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trackit.Comment#getText <em>Text</em>}</li>
 *   <li>{@link trackit.Comment#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link trackit.Comment#getIssue <em>Issue</em>}</li>
 *   <li>{@link trackit.Comment#getAuthor <em>Author</em>}</li>
 *   <li>{@link trackit.Comment#getParent <em>Parent</em>}</li>
 *   <li>{@link trackit.Comment#getReplies <em>Replies</em>}</li>
 * </ul>
 * </p>
 *
 * @see trackit.TrackitPackage#getComment()
 * @model annotation="gmf.node label='text'"
 * @generated
 */
public interface Comment extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see trackit.TrackitPackage#getComment_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link trackit.Comment#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

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
	 * @see trackit.TrackitPackage#getComment_DateCreated()
	 * @model
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link trackit.Comment#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * Returns the value of the '<em><b>Replies</b></em>' containment reference list.
	 * The list contents are of type {@link trackit.Comment}.
	 * It is bidirectional and its opposite is '{@link trackit.Comment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replies</em>' containment reference list.
	 * @see trackit.TrackitPackage#getComment_Replies()
	 * @see trackit.Comment#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Comment> getReplies();

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' container reference.
	 * @see #setIssue(Issue)
	 * @see trackit.TrackitPackage#getComment_Issue()
	 * @see trackit.Issue#getComments
	 * @model opposite="comments" transient="false"
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link trackit.Comment#getIssue <em>Issue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' container reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trackit.Comment#getReplies <em>Replies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Comment)
	 * @see trackit.TrackitPackage#getComment_Parent()
	 * @see trackit.Comment#getReplies
	 * @model opposite="replies" transient="false"
	 * @generated
	 */
	Comment getParent();

	/**
	 * Sets the value of the '{@link trackit.Comment#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Comment value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link trackit.Member#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Member)
	 * @see trackit.TrackitPackage#getComment_Author()
	 * @see trackit.Member#getComments
	 * @model opposite="comments"
	 * @generated
	 */
	Member getAuthor();

	/**
	 * Sets the value of the '{@link trackit.Comment#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Member value);

} // Comment
