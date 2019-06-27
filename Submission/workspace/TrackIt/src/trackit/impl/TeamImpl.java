/**
 */
package trackit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trackit.Member;
import trackit.Team;
import trackit.TrackitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trackit.impl.TeamImpl#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link trackit.impl.TeamImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamImpl extends IdentifiableImpl implements Team {
	/**
	 * The default value of the '{@link #getTeamName() <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeamName() <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamName()
	 * @generated
	 * @ordered
	 */
	protected String teamName = TEAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackitPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamName(String newTeamName) {
		String oldTeamName = teamName;
		teamName = newTeamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackitPackage.TEAM__TEAM_NAME, oldTeamName, teamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectResolvingEList<Member>(Member.class, this, TrackitPackage.TEAM__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackitPackage.TEAM__TEAM_NAME:
				return getTeamName();
			case TrackitPackage.TEAM__MEMBERS:
				return getMembers();
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
			case TrackitPackage.TEAM__TEAM_NAME:
				setTeamName((String)newValue);
				return;
			case TrackitPackage.TEAM__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
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
			case TrackitPackage.TEAM__TEAM_NAME:
				setTeamName(TEAM_NAME_EDEFAULT);
				return;
			case TrackitPackage.TEAM__MEMBERS:
				getMembers().clear();
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
			case TrackitPackage.TEAM__TEAM_NAME:
				return TEAM_NAME_EDEFAULT == null ? teamName != null : !TEAM_NAME_EDEFAULT.equals(teamName);
			case TrackitPackage.TEAM__MEMBERS:
				return members != null && !members.isEmpty();
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
		result.append(" (teamName: ");
		result.append(teamName);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
