/**
 */
package schoolLife.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import schoolLife.Admin;
import schoolLife.Censeur;
import schoolLife.Classe;
import schoolLife.Compte;
import schoolLife.Compte_Eleve;
import schoolLife.Compte_Proviseur;
import schoolLife.Compte_admin;
import schoolLife.Compte_parent;
import schoolLife.Compte_prof;
import schoolLife.Eleve;
import schoolLife.Matiere;
import schoolLife.Parent;
import schoolLife.Professeur;
import schoolLife.Profil_utilisateur;
import schoolLife.Proviseur;
import schoolLife.SchoolLifePackage;
import schoolLife.Surveillant;
import schoolLife.User;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see schoolLife.SchoolLifePackage
 * @generated
 */
public class SchoolLifeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchoolLifePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolLifeSwitch() {
		if (modelPackage == null) {
			modelPackage = SchoolLifePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SchoolLifePackage.SYSTEM: {
				schoolLife.System system = (schoolLife.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.PROFESSEUR: {
				Professeur professeur = (Professeur)theEObject;
				T result = caseProfesseur(professeur);
				if (result == null) result = caseUser(professeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.ELEVE: {
				Eleve eleve = (Eleve)theEObject;
				T result = caseEleve(eleve);
				if (result == null) result = caseUser(eleve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.PARENT: {
				Parent parent = (Parent)theEObject;
				T result = caseParent(parent);
				if (result == null) result = caseUser(parent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.ADMIN: {
				Admin admin = (Admin)theEObject;
				T result = caseAdmin(admin);
				if (result == null) result = caseUser(admin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.SURVEILLANT: {
				Surveillant surveillant = (Surveillant)theEObject;
				T result = caseSurveillant(surveillant);
				if (result == null) result = caseUser(surveillant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.CENSEUR: {
				Censeur censeur = (Censeur)theEObject;
				T result = caseCenseur(censeur);
				if (result == null) result = caseUser(censeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.PROVISEUR: {
				Proviseur proviseur = (Proviseur)theEObject;
				T result = caseProviseur(proviseur);
				if (result == null) result = caseUser(proviseur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.PROFIL_UTILISATEUR: {
				Profil_utilisateur profil_utilisateur = (Profil_utilisateur)theEObject;
				T result = caseProfil_utilisateur(profil_utilisateur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.CLASSE: {
				Classe classe = (Classe)theEObject;
				T result = caseClasse(classe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.MATIERE: {
				Matiere matiere = (Matiere)theEObject;
				T result = caseMatiere(matiere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE: {
				Compte compte = (Compte)theEObject;
				T result = caseCompte(compte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE_PARENT: {
				Compte_parent compte_parent = (Compte_parent)theEObject;
				T result = caseCompte_parent(compte_parent);
				if (result == null) result = caseCompte(compte_parent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE_ELEVE: {
				Compte_Eleve compte_Eleve = (Compte_Eleve)theEObject;
				T result = caseCompte_Eleve(compte_Eleve);
				if (result == null) result = caseCompte(compte_Eleve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE_PROF: {
				Compte_prof compte_prof = (Compte_prof)theEObject;
				T result = caseCompte_prof(compte_prof);
				if (result == null) result = caseCompte(compte_prof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE_ADMIN: {
				Compte_admin compte_admin = (Compte_admin)theEObject;
				T result = caseCompte_admin(compte_admin);
				if (result == null) result = caseCompte(compte_admin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SchoolLifePackage.COMPTE_PROVISEUR: {
				Compte_Proviseur compte_Proviseur = (Compte_Proviseur)theEObject;
				T result = caseCompte_Proviseur(compte_Proviseur);
				if (result == null) result = caseCompte(compte_Proviseur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(schoolLife.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfesseur(Professeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eleve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eleve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEleve(Eleve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParent(Parent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surveillant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surveillant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurveillant(Surveillant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Censeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Censeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenseur(Censeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proviseur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proviseur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviseur(Proviseur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profil utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profil utilisateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfil_utilisateur(Profil_utilisateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasse(Classe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matiere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matiere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatiere(Matiere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte(Compte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte_parent(Compte_parent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte Eleve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte Eleve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte_Eleve(Compte_Eleve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte prof</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte prof</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte_prof(Compte_prof object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte_admin(Compte_admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compte Proviseur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compte Proviseur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompte_Proviseur(Compte_Proviseur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SchoolLifeSwitch
