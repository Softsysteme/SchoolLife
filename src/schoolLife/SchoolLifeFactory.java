/**
 */
package schoolLife;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see schoolLife.SchoolLifePackage
 * @generated
 */
public interface SchoolLifeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolLifeFactory eINSTANCE = schoolLife.impl.SchoolLifeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Professeur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professeur</em>'.
	 * @generated
	 */
	Professeur createProfesseur();

	/**
	 * Returns a new object of class '<em>Eleve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eleve</em>'.
	 * @generated
	 */
	Eleve createEleve();

	/**
	 * Returns a new object of class '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent</em>'.
	 * @generated
	 */
	Parent createParent();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Surveillant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surveillant</em>'.
	 * @generated
	 */
	Surveillant createSurveillant();

	/**
	 * Returns a new object of class '<em>Censeur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Censeur</em>'.
	 * @generated
	 */
	Censeur createCenseur();

	/**
	 * Returns a new object of class '<em>Proviseur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proviseur</em>'.
	 * @generated
	 */
	Proviseur createProviseur();

	/**
	 * Returns a new object of class '<em>Profil utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profil utilisateur</em>'.
	 * @generated
	 */
	Profil_utilisateur createProfil_utilisateur();

	/**
	 * Returns a new object of class '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classe</em>'.
	 * @generated
	 */
	Classe createClasse();

	/**
	 * Returns a new object of class '<em>Matiere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matiere</em>'.
	 * @generated
	 */
	Matiere createMatiere();

	/**
	 * Returns a new object of class '<em>Compte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte</em>'.
	 * @generated
	 */
	Compte createCompte();

	/**
	 * Returns a new object of class '<em>Compte parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte parent</em>'.
	 * @generated
	 */
	Compte_parent createCompte_parent();

	/**
	 * Returns a new object of class '<em>Compte Eleve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte Eleve</em>'.
	 * @generated
	 */
	Compte_Eleve createCompte_Eleve();

	/**
	 * Returns a new object of class '<em>Compte prof</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte prof</em>'.
	 * @generated
	 */
	Compte_prof createCompte_prof();

	/**
	 * Returns a new object of class '<em>Compte admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte admin</em>'.
	 * @generated
	 */
	Compte_admin createCompte_admin();

	/**
	 * Returns a new object of class '<em>Compte Proviseur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compte Proviseur</em>'.
	 * @generated
	 */
	Compte_Proviseur createCompte_Proviseur();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchoolLifePackage getSchoolLifePackage();

} //SchoolLifeFactory
