/**
 */
package schoolLife.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see schoolLife.SchoolLifePackage
 * @generated
 */
public class SchoolLifeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchoolLifePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolLifeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchoolLifePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolLifeSwitch<Adapter> modelSwitch =
		new SchoolLifeSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(schoolLife.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseProfesseur(Professeur object) {
				return createProfesseurAdapter();
			}
			@Override
			public Adapter caseEleve(Eleve object) {
				return createEleveAdapter();
			}
			@Override
			public Adapter caseParent(Parent object) {
				return createParentAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter caseSurveillant(Surveillant object) {
				return createSurveillantAdapter();
			}
			@Override
			public Adapter caseCenseur(Censeur object) {
				return createCenseurAdapter();
			}
			@Override
			public Adapter caseProviseur(Proviseur object) {
				return createProviseurAdapter();
			}
			@Override
			public Adapter caseProfil_utilisateur(Profil_utilisateur object) {
				return createProfil_utilisateurAdapter();
			}
			@Override
			public Adapter caseClasse(Classe object) {
				return createClasseAdapter();
			}
			@Override
			public Adapter caseMatiere(Matiere object) {
				return createMatiereAdapter();
			}
			@Override
			public Adapter caseCompte(Compte object) {
				return createCompteAdapter();
			}
			@Override
			public Adapter caseCompte_parent(Compte_parent object) {
				return createCompte_parentAdapter();
			}
			@Override
			public Adapter caseCompte_Eleve(Compte_Eleve object) {
				return createCompte_EleveAdapter();
			}
			@Override
			public Adapter caseCompte_prof(Compte_prof object) {
				return createCompte_profAdapter();
			}
			@Override
			public Adapter caseCompte_admin(Compte_admin object) {
				return createCompte_adminAdapter();
			}
			@Override
			public Adapter caseCompte_Proviseur(Compte_Proviseur object) {
				return createCompte_ProviseurAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Professeur <em>Professeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Professeur
	 * @generated
	 */
	public Adapter createProfesseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Eleve <em>Eleve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Eleve
	 * @generated
	 */
	public Adapter createEleveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Parent
	 * @generated
	 */
	public Adapter createParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Surveillant <em>Surveillant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Surveillant
	 * @generated
	 */
	public Adapter createSurveillantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Censeur <em>Censeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Censeur
	 * @generated
	 */
	public Adapter createCenseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Proviseur <em>Proviseur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Proviseur
	 * @generated
	 */
	public Adapter createProviseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Profil_utilisateur <em>Profil utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Profil_utilisateur
	 * @generated
	 */
	public Adapter createProfil_utilisateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Classe
	 * @generated
	 */
	public Adapter createClasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Matiere
	 * @generated
	 */
	public Adapter createMatiereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte
	 * @generated
	 */
	public Adapter createCompteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte_parent <em>Compte parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte_parent
	 * @generated
	 */
	public Adapter createCompte_parentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte_Eleve <em>Compte Eleve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte_Eleve
	 * @generated
	 */
	public Adapter createCompte_EleveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte_prof <em>Compte prof</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte_prof
	 * @generated
	 */
	public Adapter createCompte_profAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte_admin <em>Compte admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte_admin
	 * @generated
	 */
	public Adapter createCompte_adminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link schoolLife.Compte_Proviseur <em>Compte Proviseur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see schoolLife.Compte_Proviseur
	 * @generated
	 */
	public Adapter createCompte_ProviseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchoolLifeAdapterFactory
