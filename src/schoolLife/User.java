/**
 */
package schoolLife;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.User#getCompte_utilisateur <em>Compte utilisateur</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compte utilisateur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compte utilisateur</em>' reference.
	 * @see #setCompte_utilisateur(Compte)
	 * @see schoolLife.SchoolLifePackage#getUser_Compte_utilisateur()
	 * @model required="true"
	 * @generated
	 */
	Compte getCompte_utilisateur();

	/**
	 * Sets the value of the '{@link schoolLife.User#getCompte_utilisateur <em>Compte utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compte utilisateur</em>' reference.
	 * @see #getCompte_utilisateur()
	 * @generated
	 */
	void setCompte_utilisateur(Compte value);

} // User
