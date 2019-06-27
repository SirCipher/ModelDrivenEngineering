/**
 */
package trackit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trackit.Comment;
import trackit.Issue;
import trackit.Member;
import trackit.TrackitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trackit.impl.MemberImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link trackit.impl.MemberImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link trackit.impl.MemberImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link trackit.impl.MemberImpl#getIssuesCreated <em>Issues Created</em>}</li>
 *   <li>{@link trackit.impl.MemberImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link trackit.impl.MemberImpl#getIssuesAssigned <em>Issues Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberImpl extends IdentifiableImpl implements Member {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssuesCreated() <em>Issues Created</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuesCreated()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issuesCreated;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getIssuesAssigned() <em>Issues Assigned</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuesAssigned()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issuesAssigned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackitPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.MEMBER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.MEMBER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullName() {
		return (firstName == null ? "" : firstName) + " "  + (lastName == null ? "" : lastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFullName(String newFullName) {
		// Full name is derived
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssuesCreated() {
		if (issuesCreated == null) {
			issuesCreated = new EObjectWithInverseResolvingEList<Issue>(Issue.class, this, TrackitPackage.MEMBER__ISSUES_CREATED, TrackitPackage.ISSUE__AUTHOR);
		}
		return issuesCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssuesAssigned() {
		if (issuesAssigned == null) {
			issuesAssigned = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, TrackitPackage.MEMBER__ISSUES_ASSIGNED, TrackitPackage.ISSUE__ASSIGNED_TO);
		}
		return issuesAssigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectWithInverseResolvingEList<Comment>(Comment.class, this, TrackitPackage.MEMBER__COMMENTS, TrackitPackage.COMMENT__AUTHOR);
		}
		return comments;
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
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssuesCreated()).basicAdd(otherEnd, msgs);
			case TrackitPackage.MEMBER__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIssuesAssigned()).basicAdd(otherEnd, msgs);
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
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				return ((InternalEList<?>)getIssuesCreated()).basicRemove(otherEnd, msgs);
			case TrackitPackage.MEMBER__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				return ((InternalEList<?>)getIssuesAssigned()).basicRemove(otherEnd, msgs);
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
			case TrackitPackage.MEMBER__FIRST_NAME:
				return getFirstName();
			case TrackitPackage.MEMBER__LAST_NAME:
				return getLastName();
			case TrackitPackage.MEMBER__FULL_NAME:
				return getFullName();
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				return getIssuesCreated();
			case TrackitPackage.MEMBER__COMMENTS:
				return getComments();
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				return getIssuesAssigned();
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
			case TrackitPackage.MEMBER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case TrackitPackage.MEMBER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case TrackitPackage.MEMBER__FULL_NAME:
				setFullName((String)newValue);
				return;
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				getIssuesCreated().clear();
				getIssuesCreated().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackitPackage.MEMBER__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				getIssuesAssigned().clear();
				getIssuesAssigned().addAll((Collection<? extends Issue>)newValue);
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
			case TrackitPackage.MEMBER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case TrackitPackage.MEMBER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case TrackitPackage.MEMBER__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				getIssuesCreated().clear();
				return;
			case TrackitPackage.MEMBER__COMMENTS:
				getComments().clear();
				return;
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				getIssuesAssigned().clear();
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
			case TrackitPackage.MEMBER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case TrackitPackage.MEMBER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case TrackitPackage.MEMBER__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case TrackitPackage.MEMBER__ISSUES_CREATED:
				return issuesCreated != null && !issuesCreated.isEmpty();
			case TrackitPackage.MEMBER__COMMENTS:
				return comments != null && !comments.isEmpty();
			case TrackitPackage.MEMBER__ISSUES_ASSIGNED:
				return issuesAssigned != null && !issuesAssigned.isEmpty();
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
