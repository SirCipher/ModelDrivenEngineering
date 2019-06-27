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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trackit.Comment;
import trackit.Issue;
import trackit.IssueStatus;
import trackit.IssueType;
import trackit.Member;
import trackit.Product;
import trackit.TrackitPackage;
import trackit.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trackit.impl.IssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getBlockers <em>Blockers</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getVersionsAffected <em>Versions Affected</em>}</li>
 *   <li>{@link trackit.impl.IssueImpl#getBlocking <em>Blocking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueImpl extends IdentifiableImpl implements Issue {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IssueStatus STATUS_EDEFAULT = IssueStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected IssueStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueType> issueType;

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
	 * The cached value of the '{@link #getBlockers() <em>Blockers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockers()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> blockers;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> assignedTo;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getDuplicateOf() <em>Duplicate Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> duplicateOf;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> dependencies;

	/**
	 * The cached value of the '{@link #getVersionsAffected() <em>Versions Affected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionsAffected()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versionsAffected;

	/**
	 * The cached value of the '{@link #getBlocking() <em>Blocking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocking()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> blocking;

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
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackitPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IssueStatus newStatus) {
		IssueStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueType> getIssueType() {
		if (issueType == null) {
			issueType = new EDataTypeUniqueEList<IssueType>(IssueType.class, this, TrackitPackage.ISSUE__ISSUE_TYPE);
		}
		return issueType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, TrackitPackage.ISSUE__COMMENTS, TrackitPackage.COMMENT__ISSUE);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getDuplicateOf() {
		if (duplicateOf == null) {
			duplicateOf = new EObjectResolvingEList<Issue>(Issue.class, this, TrackitPackage.ISSUE__DUPLICATE_OF);
		}
		return duplicateOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Issue>(Issue.class, this, TrackitPackage.ISSUE__DEPENDENCIES);
		}
		return dependencies;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrackitPackage.ISSUE__AUTHOR, oldAuthor, author));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__AUTHOR, oldAuthor, newAuthor);
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
				msgs = ((InternalEObject)author).eInverseRemove(this, TrackitPackage.MEMBER__ISSUES_CREATED, Member.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, TrackitPackage.MEMBER__ISSUES_CREATED, Member.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.ISSUE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAssignedTo() {
		if (assignedTo == null) {
			assignedTo = new EObjectWithInverseResolvingEList.ManyInverse<Member>(Member.class, this, TrackitPackage.ISSUE__ASSIGNED_TO, TrackitPackage.MEMBER__ISSUES_ASSIGNED);
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersionsAffected() {
		if (versionsAffected == null) {
			versionsAffected = new EObjectWithInverseResolvingEList.ManyInverse<Version>(Version.class, this, TrackitPackage.ISSUE__VERSIONS_AFFECTED, TrackitPackage.VERSION__ISSUES);
		}
		return versionsAffected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getBlocking() {
		if (blocking == null) {
			blocking = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, TrackitPackage.ISSUE__BLOCKING, TrackitPackage.ISSUE__BLOCKERS);
		}
		return blocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getBlockers() {
		if (blockers == null) {
			blockers = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, TrackitPackage.ISSUE__BLOCKERS, TrackitPackage.ISSUE__BLOCKING);
		}
		return blockers;
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
			case TrackitPackage.ISSUE__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, TrackitPackage.MEMBER__ISSUES_CREATED, Member.class, msgs);
				return basicSetAuthor((Member)otherEnd, msgs);
			case TrackitPackage.ISSUE__BLOCKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlockers()).basicAdd(otherEnd, msgs);
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedTo()).basicAdd(otherEnd, msgs);
			case TrackitPackage.ISSUE__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersionsAffected()).basicAdd(otherEnd, msgs);
			case TrackitPackage.ISSUE__BLOCKING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocking()).basicAdd(otherEnd, msgs);
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
			case TrackitPackage.ISSUE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case TrackitPackage.ISSUE__BLOCKERS:
				return ((InternalEList<?>)getBlockers()).basicRemove(otherEnd, msgs);
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				return ((InternalEList<?>)getAssignedTo()).basicRemove(otherEnd, msgs);
			case TrackitPackage.ISSUE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				return ((InternalEList<?>)getVersionsAffected()).basicRemove(otherEnd, msgs);
			case TrackitPackage.ISSUE__BLOCKING:
				return ((InternalEList<?>)getBlocking()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackitPackage.ISSUE__TITLE:
				return getTitle();
			case TrackitPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case TrackitPackage.ISSUE__DATE_CREATED:
				return getDateCreated();
			case TrackitPackage.ISSUE__STATUS:
				return getStatus();
			case TrackitPackage.ISSUE__ISSUE_TYPE:
				return getIssueType();
			case TrackitPackage.ISSUE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case TrackitPackage.ISSUE__BLOCKERS:
				return getBlockers();
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				return getAssignedTo();
			case TrackitPackage.ISSUE__COMMENTS:
				return getComments();
			case TrackitPackage.ISSUE__DUPLICATE_OF:
				return getDuplicateOf();
			case TrackitPackage.ISSUE__DEPENDENCIES:
				return getDependencies();
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				return getVersionsAffected();
			case TrackitPackage.ISSUE__BLOCKING:
				return getBlocking();
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
			case TrackitPackage.ISSUE__TITLE:
				setTitle((String)newValue);
				return;
			case TrackitPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackitPackage.ISSUE__DATE_CREATED:
				setDateCreated((String)newValue);
				return;
			case TrackitPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
				return;
			case TrackitPackage.ISSUE__ISSUE_TYPE:
				getIssueType().clear();
				getIssueType().addAll((Collection<? extends IssueType>)newValue);
				return;
			case TrackitPackage.ISSUE__AUTHOR:
				setAuthor((Member)newValue);
				return;
			case TrackitPackage.ISSUE__BLOCKERS:
				getBlockers().clear();
				getBlockers().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				getAssignedTo().addAll((Collection<? extends Member>)newValue);
				return;
			case TrackitPackage.ISSUE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case TrackitPackage.ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackitPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				getVersionsAffected().clear();
				getVersionsAffected().addAll((Collection<? extends Version>)newValue);
				return;
			case TrackitPackage.ISSUE__BLOCKING:
				getBlocking().clear();
				getBlocking().addAll((Collection<? extends Issue>)newValue);
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
			case TrackitPackage.ISSUE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TrackitPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackitPackage.ISSUE__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case TrackitPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TrackitPackage.ISSUE__ISSUE_TYPE:
				getIssueType().clear();
				return;
			case TrackitPackage.ISSUE__AUTHOR:
				setAuthor((Member)null);
				return;
			case TrackitPackage.ISSUE__BLOCKERS:
				getBlockers().clear();
				return;
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				getAssignedTo().clear();
				return;
			case TrackitPackage.ISSUE__COMMENTS:
				getComments().clear();
				return;
			case TrackitPackage.ISSUE__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case TrackitPackage.ISSUE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				getVersionsAffected().clear();
				return;
			case TrackitPackage.ISSUE__BLOCKING:
				getBlocking().clear();
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
			case TrackitPackage.ISSUE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TrackitPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TrackitPackage.ISSUE__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case TrackitPackage.ISSUE__STATUS:
				return status != STATUS_EDEFAULT;
			case TrackitPackage.ISSUE__ISSUE_TYPE:
				return issueType != null && !issueType.isEmpty();
			case TrackitPackage.ISSUE__AUTHOR:
				return author != null;
			case TrackitPackage.ISSUE__BLOCKERS:
				return blockers != null && !blockers.isEmpty();
			case TrackitPackage.ISSUE__ASSIGNED_TO:
				return assignedTo != null && !assignedTo.isEmpty();
			case TrackitPackage.ISSUE__COMMENTS:
				return comments != null && !comments.isEmpty();
			case TrackitPackage.ISSUE__DUPLICATE_OF:
				return duplicateOf != null && !duplicateOf.isEmpty();
			case TrackitPackage.ISSUE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case TrackitPackage.ISSUE__VERSIONS_AFFECTED:
				return versionsAffected != null && !versionsAffected.isEmpty();
			case TrackitPackage.ISSUE__BLOCKING:
				return blocking != null && !blocking.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", status: ");
		result.append(status);
		result.append(", issueType: ");
		result.append(issueType);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
