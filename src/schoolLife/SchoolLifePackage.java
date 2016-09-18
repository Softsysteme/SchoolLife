/**
 */
package schoolLife;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see schoolLife.SchoolLifeFactory
 * @model kind="package"
 * @generated
 */
public interface SchoolLifePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schoolLife";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softsystems.schoolLife";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schoolLife";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolLifePackage eINSTANCE = schoolLife.impl.SchoolLifePackageImpl.init();

	/**
	 * The meta object id for the '{@link schoolLife.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.SystemImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CLASSE = 0;

	/**
	 * The feature id for the '<em><b>Matiere</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MATIERE = 1;

	/**
	 * The feature id for the '<em><b>Compte</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPTE = 2;

	/**
	 * The feature id for the '<em><b>Utilisateur List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__UTILISATEUR_LIST = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.UserImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COMPTE_UTILISATEUR = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.ProfesseurImpl <em>Professeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.ProfesseurImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getProfesseur()
	 * @generated
	 */
	int PROFESSEUR = 2;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The feature id for the '<em><b>Class List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR__CLASS_LIST = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSEUR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.EleveImpl <em>Eleve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.EleveImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getEleve()
	 * @generated
	 */
	int ELEVE = 3;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVE__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVE__CLASS = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eleve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVE_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eleve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.ParentImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 4;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.AdminImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 5;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.SurveillantImpl <em>Surveillant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.SurveillantImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getSurveillant()
	 * @generated
	 */
	int SURVEILLANT = 6;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEILLANT__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Surveillant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEILLANT_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Surveillant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEILLANT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.CenseurImpl <em>Censeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.CenseurImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCenseur()
	 * @generated
	 */
	int CENSEUR = 7;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSEUR__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Censeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSEUR_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Censeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSEUR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.ProviseurImpl <em>Proviseur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.ProviseurImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getProviseur()
	 * @generated
	 */
	int PROVISEUR = 8;

	/**
	 * The feature id for the '<em><b>Compte utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISEUR__COMPTE_UTILISATEUR = USER__COMPTE_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Proviseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISEUR_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proviseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVISEUR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Profil_utilisateurImpl <em>Profil utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Profil_utilisateurImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getProfil_utilisateur()
	 * @generated
	 */
	int PROFIL_UTILISATEUR = 9;

	/**
	 * The number of structural features of the '<em>Profil utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL_UTILISATEUR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Profil utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIL_UTILISATEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.ClasseImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 10;

	/**
	 * The feature id for the '<em><b>Eleve List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ELEVE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Matiere List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__MATIERE_LIST = 1;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.MatiereImpl <em>Matiere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.MatiereImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getMatiere()
	 * @generated
	 */
	int MATIERE = 11;

	/**
	 * The number of structural features of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.CompteImpl <em>Compte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.CompteImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte()
	 * @generated
	 */
	int COMPTE = 12;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE__PROFIL_UTILISATEUR = 0;

	/**
	 * The number of structural features of the '<em>Compte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Compte_parentImpl <em>Compte parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Compte_parentImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_parent()
	 * @generated
	 */
	int COMPTE_PARENT = 13;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PARENT__PROFIL_UTILISATEUR = COMPTE__PROFIL_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Compte parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PARENT_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compte parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PARENT_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Compte_EleveImpl <em>Compte Eleve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Compte_EleveImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_Eleve()
	 * @generated
	 */
	int COMPTE_ELEVE = 14;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ELEVE__PROFIL_UTILISATEUR = COMPTE__PROFIL_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Compte Eleve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ELEVE_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compte Eleve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ELEVE_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Compte_profImpl <em>Compte prof</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Compte_profImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_prof()
	 * @generated
	 */
	int COMPTE_PROF = 15;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROF__PROFIL_UTILISATEUR = COMPTE__PROFIL_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Compte prof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROF_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compte prof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROF_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Compte_adminImpl <em>Compte admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Compte_adminImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_admin()
	 * @generated
	 */
	int COMPTE_ADMIN = 16;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ADMIN__PROFIL_UTILISATEUR = COMPTE__PROFIL_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Compte admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ADMIN_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compte admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_ADMIN_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schoolLife.impl.Compte_ProviseurImpl <em>Compte Proviseur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schoolLife.impl.Compte_ProviseurImpl
	 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_Proviseur()
	 * @generated
	 */
	int COMPTE_PROVISEUR = 17;

	/**
	 * The feature id for the '<em><b>Profil utilisateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROVISEUR__PROFIL_UTILISATEUR = COMPTE__PROFIL_UTILISATEUR;

	/**
	 * The number of structural features of the '<em>Compte Proviseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROVISEUR_FEATURE_COUNT = COMPTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compte Proviseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPTE_PROVISEUR_OPERATION_COUNT = COMPTE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link schoolLife.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see schoolLife.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link schoolLife.System#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classe</em>'.
	 * @see schoolLife.System#getClasse()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Classe();

	/**
	 * Returns the meta object for the reference list '{@link schoolLife.System#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matiere</em>'.
	 * @see schoolLife.System#getMatiere()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Matiere();

	/**
	 * Returns the meta object for the reference list '{@link schoolLife.System#getCompte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compte</em>'.
	 * @see schoolLife.System#getCompte()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Compte();

	/**
	 * Returns the meta object for the containment reference list '{@link schoolLife.System#getUtilisateurList <em>Utilisateur List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utilisateur List</em>'.
	 * @see schoolLife.System#getUtilisateurList()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_UtilisateurList();

	/**
	 * Returns the meta object for class '{@link schoolLife.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see schoolLife.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link schoolLife.User#getCompte_utilisateur <em>Compte utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compte utilisateur</em>'.
	 * @see schoolLife.User#getCompte_utilisateur()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Compte_utilisateur();

	/**
	 * Returns the meta object for class '{@link schoolLife.Professeur <em>Professeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professeur</em>'.
	 * @see schoolLife.Professeur
	 * @generated
	 */
	EClass getProfesseur();

	/**
	 * Returns the meta object for the reference list '{@link schoolLife.Professeur#getClassList <em>Class List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class List</em>'.
	 * @see schoolLife.Professeur#getClassList()
	 * @see #getProfesseur()
	 * @generated
	 */
	EReference getProfesseur_ClassList();

	/**
	 * Returns the meta object for class '{@link schoolLife.Eleve <em>Eleve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eleve</em>'.
	 * @see schoolLife.Eleve
	 * @generated
	 */
	EClass getEleve();

	/**
	 * Returns the meta object for the reference '{@link schoolLife.Eleve#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see schoolLife.Eleve#getClass_()
	 * @see #getEleve()
	 * @generated
	 */
	EReference getEleve_Class();

	/**
	 * Returns the meta object for class '{@link schoolLife.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see schoolLife.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for class '{@link schoolLife.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see schoolLife.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for class '{@link schoolLife.Surveillant <em>Surveillant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surveillant</em>'.
	 * @see schoolLife.Surveillant
	 * @generated
	 */
	EClass getSurveillant();

	/**
	 * Returns the meta object for class '{@link schoolLife.Censeur <em>Censeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Censeur</em>'.
	 * @see schoolLife.Censeur
	 * @generated
	 */
	EClass getCenseur();

	/**
	 * Returns the meta object for class '{@link schoolLife.Proviseur <em>Proviseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proviseur</em>'.
	 * @see schoolLife.Proviseur
	 * @generated
	 */
	EClass getProviseur();

	/**
	 * Returns the meta object for class '{@link schoolLife.Profil_utilisateur <em>Profil utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profil utilisateur</em>'.
	 * @see schoolLife.Profil_utilisateur
	 * @generated
	 */
	EClass getProfil_utilisateur();

	/**
	 * Returns the meta object for class '{@link schoolLife.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see schoolLife.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the reference list '{@link schoolLife.Classe#getEleveList <em>Eleve List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eleve List</em>'.
	 * @see schoolLife.Classe#getEleveList()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_EleveList();

	/**
	 * Returns the meta object for the reference list '{@link schoolLife.Classe#getMatiereList <em>Matiere List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matiere List</em>'.
	 * @see schoolLife.Classe#getMatiereList()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_MatiereList();

	/**
	 * Returns the meta object for class '{@link schoolLife.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matiere</em>'.
	 * @see schoolLife.Matiere
	 * @generated
	 */
	EClass getMatiere();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte <em>Compte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte</em>'.
	 * @see schoolLife.Compte
	 * @generated
	 */
	EClass getCompte();

	/**
	 * Returns the meta object for the containment reference '{@link schoolLife.Compte#getProfil_utilisateur <em>Profil utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profil utilisateur</em>'.
	 * @see schoolLife.Compte#getProfil_utilisateur()
	 * @see #getCompte()
	 * @generated
	 */
	EReference getCompte_Profil_utilisateur();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte_parent <em>Compte parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte parent</em>'.
	 * @see schoolLife.Compte_parent
	 * @generated
	 */
	EClass getCompte_parent();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte_Eleve <em>Compte Eleve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte Eleve</em>'.
	 * @see schoolLife.Compte_Eleve
	 * @generated
	 */
	EClass getCompte_Eleve();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte_prof <em>Compte prof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte prof</em>'.
	 * @see schoolLife.Compte_prof
	 * @generated
	 */
	EClass getCompte_prof();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte_admin <em>Compte admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte admin</em>'.
	 * @see schoolLife.Compte_admin
	 * @generated
	 */
	EClass getCompte_admin();

	/**
	 * Returns the meta object for class '{@link schoolLife.Compte_Proviseur <em>Compte Proviseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compte Proviseur</em>'.
	 * @see schoolLife.Compte_Proviseur
	 * @generated
	 */
	EClass getCompte_Proviseur();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoolLifeFactory getSchoolLifeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link schoolLife.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.SystemImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CLASSE = eINSTANCE.getSystem_Classe();

		/**
		 * The meta object literal for the '<em><b>Matiere</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MATIERE = eINSTANCE.getSystem_Matiere();

		/**
		 * The meta object literal for the '<em><b>Compte</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPTE = eINSTANCE.getSystem_Compte();

		/**
		 * The meta object literal for the '<em><b>Utilisateur List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__UTILISATEUR_LIST = eINSTANCE.getSystem_UtilisateurList();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.UserImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Compte utilisateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__COMPTE_UTILISATEUR = eINSTANCE.getUser_Compte_utilisateur();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.ProfesseurImpl <em>Professeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.ProfesseurImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getProfesseur()
		 * @generated
		 */
		EClass PROFESSEUR = eINSTANCE.getProfesseur();

		/**
		 * The meta object literal for the '<em><b>Class List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSEUR__CLASS_LIST = eINSTANCE.getProfesseur_ClassList();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.EleveImpl <em>Eleve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.EleveImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getEleve()
		 * @generated
		 */
		EClass ELEVE = eINSTANCE.getEleve();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEVE__CLASS = eINSTANCE.getEleve_Class();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.ParentImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.AdminImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.SurveillantImpl <em>Surveillant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.SurveillantImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getSurveillant()
		 * @generated
		 */
		EClass SURVEILLANT = eINSTANCE.getSurveillant();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.CenseurImpl <em>Censeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.CenseurImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCenseur()
		 * @generated
		 */
		EClass CENSEUR = eINSTANCE.getCenseur();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.ProviseurImpl <em>Proviseur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.ProviseurImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getProviseur()
		 * @generated
		 */
		EClass PROVISEUR = eINSTANCE.getProviseur();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Profil_utilisateurImpl <em>Profil utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Profil_utilisateurImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getProfil_utilisateur()
		 * @generated
		 */
		EClass PROFIL_UTILISATEUR = eINSTANCE.getProfil_utilisateur();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.ClasseImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>Eleve List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__ELEVE_LIST = eINSTANCE.getClasse_EleveList();

		/**
		 * The meta object literal for the '<em><b>Matiere List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__MATIERE_LIST = eINSTANCE.getClasse_MatiereList();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.MatiereImpl <em>Matiere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.MatiereImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getMatiere()
		 * @generated
		 */
		EClass MATIERE = eINSTANCE.getMatiere();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.CompteImpl <em>Compte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.CompteImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte()
		 * @generated
		 */
		EClass COMPTE = eINSTANCE.getCompte();

		/**
		 * The meta object literal for the '<em><b>Profil utilisateur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPTE__PROFIL_UTILISATEUR = eINSTANCE.getCompte_Profil_utilisateur();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Compte_parentImpl <em>Compte parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Compte_parentImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_parent()
		 * @generated
		 */
		EClass COMPTE_PARENT = eINSTANCE.getCompte_parent();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Compte_EleveImpl <em>Compte Eleve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Compte_EleveImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_Eleve()
		 * @generated
		 */
		EClass COMPTE_ELEVE = eINSTANCE.getCompte_Eleve();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Compte_profImpl <em>Compte prof</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Compte_profImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_prof()
		 * @generated
		 */
		EClass COMPTE_PROF = eINSTANCE.getCompte_prof();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Compte_adminImpl <em>Compte admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Compte_adminImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_admin()
		 * @generated
		 */
		EClass COMPTE_ADMIN = eINSTANCE.getCompte_admin();

		/**
		 * The meta object literal for the '{@link schoolLife.impl.Compte_ProviseurImpl <em>Compte Proviseur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schoolLife.impl.Compte_ProviseurImpl
		 * @see schoolLife.impl.SchoolLifePackageImpl#getCompte_Proviseur()
		 * @generated
		 */
		EClass COMPTE_PROVISEUR = eINSTANCE.getCompte_Proviseur();

	}

} //SchoolLifePackage
