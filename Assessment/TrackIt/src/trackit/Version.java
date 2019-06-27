/**
 */
package trackit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trackit.Version#getName <em>Name</em>}</li>
 *   <li>{@link trackit.Version#getStatus <em>Status</em>}</li>
 *   <li>{@link trackit.Version#getProduct <em>Product</em>}</li>
 *   <li>{@link trackit.Version#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @see trackit.TrackitPackage#getVersion()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Version extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trackit.TrackitPackage#getVersion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trackit.Version#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see trackit.TrackitPackage#getVersion_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link trackit.Version#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link trackit.VersionStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see trackit.VersionStatus
	 * @see #setStatus(VersionStatus)
	 * @see trackit.TrackitPackage#getVersion_Status()
	 * @model
	 * @generated
	 */
	VersionStatus getStatus();

	/**
	 * Sets the value of the '{@link trackit.Version#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see trackit.VersionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(VersionStatus value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference list.
	 * The list contents are of type {@link trackit.Issue}.
	 * It is bidirectional and its opposite is '{@link trackit.Issue#getVersionsAffected <em>Versions Affected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference list.
	 * @see trackit.TrackitPackage#getVersion_Issues()
	 * @see trackit.Issue#getVersionsAffected
	 * @model opposite="versionsAffected"
	 * @generated
	 */
	EList<Issue> getIssues();

} // Version
