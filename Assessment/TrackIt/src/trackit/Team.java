/**
 */
package trackit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trackit.Team#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link trackit.Team#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see trackit.TrackitPackage#getTeam()
 * @model annotation="gmf.node label='teamName'"
 * @generated
 */
public interface Team extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Name</em>' attribute.
	 * @see #setTeamName(String)
	 * @see trackit.TrackitPackage#getTeam_TeamName()
	 * @model
	 * @generated
	 */
	String getTeamName();

	/**
	 * Sets the value of the '{@link trackit.Team#getTeamName <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Name</em>' attribute.
	 * @see #getTeamName()
	 * @generated
	 */
	void setTeamName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link trackit.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see trackit.TrackitPackage#getTeam_Members()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='solid' color='153,186,221' label='Members'"
	 * @generated
	 */
	EList<Member> getMembers();

} // Team
