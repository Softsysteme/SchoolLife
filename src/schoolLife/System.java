/**
 */
package schoolLife;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.System#getClasse <em>Classe</em>}</li>
 *   <li>{@link schoolLife.System#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link schoolLife.System#getCompte <em>Compte</em>}</li>
 *   <li>{@link schoolLife.System#getUtilisateurList <em>Utilisateur List</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' containment reference list.
	 * The list contents are of type {@link schoolLife.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' containment reference list.
	 * @see schoolLife.SchoolLifePackage#getSystem_Classe()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Classe> getClasse();

	/**
	 * Returns the value of the '<em><b>Matiere</b></em>' reference list.
	 * The list contents are of type {@link schoolLife.Matiere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matiere</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matiere</em>' reference list.
	 * @see schoolLife.SchoolLifePackage#getSystem_Matiere()
	 * @model
	 * @generated
	 */
	EList<Matiere> getMatiere();

	/**
	 * Returns the value of the '<em><b>Compte</b></em>' reference list.
	 * The list contents are of type {@link schoolLife.Compte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compte</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compte</em>' reference list.
	 * @see schoolLife.SchoolLifePackage#getSystem_Compte()
	 * @model
	 * @generated
	 */
	EList<Compte> getCompte();

	/**
	 * Returns the value of the '<em><b>Utilisateur List</b></em>' containment reference list.
	 * The list contents are of type {@link schoolLife.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisateur List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateur List</em>' containment reference list.
	 * @see schoolLife.SchoolLifePackage#getSystem_UtilisateurList()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUtilisateurList();

} // System
