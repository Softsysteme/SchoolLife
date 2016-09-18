/**
 */
package schoolLife.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import schoolLife.SchoolLifeFactory;
import schoolLife.SchoolLifePackage;
import schoolLife.Surveillant;
import schoolLife.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoolLifeFactoryImpl extends EFactoryImpl implements SchoolLifeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchoolLifeFactory init() {
		try {
			SchoolLifeFactory theSchoolLifeFactory = (SchoolLifeFactory)EPackage.Registry.INSTANCE.getEFactory(SchoolLifePackage.eNS_URI);
			if (theSchoolLifeFactory != null) {
				return theSchoolLifeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchoolLifeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolLifeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchoolLifePackage.SYSTEM: return createSystem();
			case SchoolLifePackage.USER: return createUser();
			case SchoolLifePackage.PROFESSEUR: return createProfesseur();
			case SchoolLifePackage.ELEVE: return createEleve();
			case SchoolLifePackage.PARENT: return createParent();
			case SchoolLifePackage.ADMIN: return createAdmin();
			case SchoolLifePackage.SURVEILLANT: return createSurveillant();
			case SchoolLifePackage.CENSEUR: return createCenseur();
			case SchoolLifePackage.PROVISEUR: return createProviseur();
			case SchoolLifePackage.PROFIL_UTILISATEUR: return createProfil_utilisateur();
			case SchoolLifePackage.CLASSE: return createClasse();
			case SchoolLifePackage.MATIERE: return createMatiere();
			case SchoolLifePackage.COMPTE: return createCompte();
			case SchoolLifePackage.COMPTE_PARENT: return createCompte_parent();
			case SchoolLifePackage.COMPTE_ELEVE: return createCompte_Eleve();
			case SchoolLifePackage.COMPTE_PROF: return createCompte_prof();
			case SchoolLifePackage.COMPTE_ADMIN: return createCompte_admin();
			case SchoolLifePackage.COMPTE_PROVISEUR: return createCompte_Proviseur();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schoolLife.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professeur createProfesseur() {
		ProfesseurImpl professeur = new ProfesseurImpl();
		return professeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eleve createEleve() {
		EleveImpl eleve = new EleveImpl();
		return eleve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surveillant createSurveillant() {
		SurveillantImpl surveillant = new SurveillantImpl();
		return surveillant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Censeur createCenseur() {
		CenseurImpl censeur = new CenseurImpl();
		return censeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proviseur createProviseur() {
		ProviseurImpl proviseur = new ProviseurImpl();
		return proviseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profil_utilisateur createProfil_utilisateur() {
		Profil_utilisateurImpl profil_utilisateur = new Profil_utilisateurImpl();
		return profil_utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere createMatiere() {
		MatiereImpl matiere = new MatiereImpl();
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte createCompte() {
		CompteImpl compte = new CompteImpl();
		return compte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte_parent createCompte_parent() {
		Compte_parentImpl compte_parent = new Compte_parentImpl();
		return compte_parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte_Eleve createCompte_Eleve() {
		Compte_EleveImpl compte_Eleve = new Compte_EleveImpl();
		return compte_Eleve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte_prof createCompte_prof() {
		Compte_profImpl compte_prof = new Compte_profImpl();
		return compte_prof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte_admin createCompte_admin() {
		Compte_adminImpl compte_admin = new Compte_adminImpl();
		return compte_admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte_Proviseur createCompte_Proviseur() {
		Compte_ProviseurImpl compte_Proviseur = new Compte_ProviseurImpl();
		return compte_Proviseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolLifePackage getSchoolLifePackage() {
		return (SchoolLifePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchoolLifePackage getPackage() {
		return SchoolLifePackage.eINSTANCE;
	}

} //SchoolLifeFactoryImpl
