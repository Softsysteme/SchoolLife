/**
 */
package schoolLife;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.Compte#getProfil_utilisateur <em>Profil utilisateur</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getCompte()
 * @model
 * @generated
 */
public interface Compte extends EObject {
	/**
	 * Returns the value of the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profil utilisateur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profil utilisateur</em>' containment reference.
	 * @see #setProfil_utilisateur(Profil_utilisateur)
	 * @see schoolLife.SchoolLifePackage#getCompte_Profil_utilisateur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Profil_utilisateur getProfil_utilisateur();

	/**
	 * Sets the value of the '{@link schoolLife.Compte#getProfil_utilisateur <em>Profil utilisateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profil utilisateur</em>' containment reference.
	 * @see #getProfil_utilisateur()
	 * @generated
	 */
	void setProfil_utilisateur(Profil_utilisateur value);

} // Compte
