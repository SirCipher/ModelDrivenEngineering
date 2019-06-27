/**
 */
package trackit.impl;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import trackit.Comment;
import trackit.Issue;
import trackit.Member;
import trackit.TrackitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trackit.impl.CommentImpl#getText <em>Text</em>}</li>
 *   <li>{@link trackit.impl.CommentImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link trackit.impl.CommentImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link trackit.impl.CommentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link trackit.impl.CommentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link trackit.impl.CommentImpl#getReplies <em>Replies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends IdentifiableImpl implements Comment {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected String dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Member author;

	/**
	 * The cached value of the '{@link #getReplies() <em>Replies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplies()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> replies;
	
	/**
	 * <!-- begin-user-doc -->
	 * Date class was instantiated
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	protected Date date = new Date();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackitPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDateCreated() {
		if (dateCreated == null) {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
			dateCreated = format.format(date);
		}
				
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(String newDateCreated) {
		String oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getReplies() {
		if (replies == null) {
			replies = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, TrackitPackage.COMMENT__REPLIES, TrackitPackage.COMMENT__PARENT);
		}
		return replies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getIssue() {
		if (eContainerFeatureID() != TrackitPackage.COMMENT__ISSUE) return null;
		return (Issue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(Issue newIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIssue, TrackitPackage.COMMENT__ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		if (newIssue != eInternalContainer() || (eContainerFeatureID() != TrackitPackage.COMMENT__ISSUE && newIssue != null)) {
			if (EcoreUtil.isAncestor(this, newIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIssue != null)
				msgs = ((InternalEObject)newIssue).eInverseAdd(this, TrackitPackage.ISSUE__COMMENTS, Issue.class, msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__ISSUE, newIssue, newIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getParent() {
		if (eContainerFeatureID() != TrackitPackage.COMMENT__PARENT) return null;
		return (Comment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Comment newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, TrackitPackage.COMMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Comment newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TrackitPackage.COMMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TrackitPackage.COMMENT__REPLIES, Comment.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Member)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrackitPackage.COMMENT__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Member newAuthor, NotificationChain msgs) {
		Member oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Member newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, TrackitPackage.MEMBER__COMMENTS, Member.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, TrackitPackage.MEMBER__COMMENTS, Member.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.COMMENT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackitPackage.COMMENT__ISSUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIssue((Issue)otherEnd, msgs);
			case TrackitPackage.COMMENT__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, TrackitPackage.MEMBER__COMMENTS, Member.class, msgs);
				return basicSetAuthor((Member)otherEnd, msgs);
			case TrackitPackage.COMMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Comment)otherEnd, msgs);
			case TrackitPackage.COMMENT__REPLIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReplies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackitPackage.COMMENT__ISSUE:
				return basicSetIssue(null, msgs);
			case TrackitPackage.COMMENT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case TrackitPackage.COMMENT__PARENT:
				return basicSetParent(null, msgs);
			case TrackitPackage.COMMENT__REPLIES:
				return ((InternalEList<?>)getReplies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TrackitPackage.COMMENT__ISSUE:
				return eInternalContainer().eInverseRemove(this, TrackitPackage.ISSUE__COMMENTS, Issue.class, msgs);
			case TrackitPackage.COMMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, TrackitPackage.COMMENT__REPLIES, Comment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackitPackage.COMMENT__TEXT:
				return getText();
			case TrackitPackage.COMMENT__DATE_CREATED:
				return getDateCreated();
			case TrackitPackage.COMMENT__ISSUE:
				return getIssue();
			case TrackitPackage.COMMENT__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case TrackitPackage.COMMENT__PARENT:
				return getParent();
			case TrackitPackage.COMMENT__REPLIES:
				return getReplies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrackitPackage.COMMENT__TEXT:
				setText((String)newValue);
				return;
			case TrackitPackage.COMMENT__DATE_CREATED:
				setDateCreated((String)newValue);
				return;
			case TrackitPackage.COMMENT__ISSUE:
				setIssue((Issue)newValue);
				return;
			case TrackitPackage.COMMENT__AUTHOR:
				setAuthor((Member)newValue);
				return;
			case TrackitPackage.COMMENT__PARENT:
				setParent((Comment)newValue);
				return;
			case TrackitPackage.COMMENT__REPLIES:
				getReplies().clear();
				getReplies().addAll((Collection<? extends Comment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrackitPackage.COMMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TrackitPackage.COMMENT__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case TrackitPackage.COMMENT__ISSUE:
				setIssue((Issue)null);
				return;
			case TrackitPackage.COMMENT__AUTHOR:
				setAuthor((Member)null);
				return;
			case TrackitPackage.COMMENT__PARENT:
				setParent((Comment)null);
				return;
			case TrackitPackage.COMMENT__REPLIES:
				getReplies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrackitPackage.COMMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TrackitPackage.COMMENT__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case TrackitPackage.COMMENT__ISSUE:
				return getIssue() != null;
			case TrackitPackage.COMMENT__AUTHOR:
				return author != null;
			case TrackitPackage.COMMENT__PARENT:
				return getParent() != null;
			case TrackitPackage.COMMENT__REPLIES:
				return replies != null && !replies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
