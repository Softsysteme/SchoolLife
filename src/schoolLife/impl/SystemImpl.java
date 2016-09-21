/**
 */
package schoolLife.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import schoolLife.Classe;
import schoolLife.Compte;
import schoolLife.Matiere;
import schoolLife.SchoolLifePackage;
import schoolLife.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.impl.SystemImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link schoolLife.impl.SystemImpl#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link schoolLife.impl.SystemImpl#getCompte <em>Compte</em>}</li>
 *   <li>{@link schoolLife.impl.SystemImpl#getUtilisateurList <em>Utilisateur List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements schoolLife.System {
	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> classe;

	/**
	 * The cached value of the '{@link #getMatiere() <em>Matiere</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatiere()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> matiere;

	/**
	 * The cached value of the '{@link #getCompte() <em>Compte</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompte()
	 * @generated
	 * @ordered
	 */
	protected EList<Compte> compte;

	/**
	 * The cached value of the '{@link #getUtilisateurList() <em>Utilisateur List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisateurList()
	 * @generated
	 * @ordered
	 */
	protected EList<User> utilisateurList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolLifePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClasse() {
		if (classe == null) {
			classe = new EObjectContainmentEList<Classe>(Classe.class, this, SchoolLifePackage.SYSTEM__CLASSE);
		}
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getMatiere() {
		if (matiere == null) {
			matiere = new EObjectResolvingEList<Matiere>(Matiere.class, this, SchoolLifePackage.SYSTEM__MATIERE);
		}
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compte> getCompte() {
		if (compte == null) {
			compte = new EObjectResolvingEList<Compte>(Compte.class, this, SchoolLifePackage.SYSTEM__COMPTE);
		}
		return compte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUtilisateurList() {
		if (utilisateurList == null) {
			utilisateurList = new EObjectContainmentEList<User>(User.class, this, SchoolLifePackage.SYSTEM__UTILISATEUR_LIST);
		}
		return utilisateurList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolLifePackage.SYSTEM__CLASSE:
				return ((InternalEList<?>)getClasse()).basicRemove(otherEnd, msgs);
			case SchoolLifePackage.SYSTEM__UTILISATEUR_LIST:
				return ((InternalEList<?>)getUtilisateurList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolLifePackage.SYSTEM__CLASSE:
				return getClasse();
			case SchoolLifePackage.SYSTEM__MATIERE:
				return getMatiere();
			case SchoolLifePackage.SYSTEM__COMPTE:
				return getCompte();
			case SchoolLifePackage.SYSTEM__UTILISATEUR_LIST:
				return getUtilisateurList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchoolLifePackage.SYSTEM__CLASSE:
				getClasse().clear();
				getClasse().addAll((Collection<? extends Classe>)newValue);
				return;
			case SchoolLifePackage.SYSTEM__MATIERE:
				getMatiere().clear();
				getMatiere().addAll((Collection<? extends Matiere>)newValue);
				return;
			case SchoolLifePackage.SYSTEM__COMPTE:
				getCompte().clear();
				getCompte().addAll((Collection<? extends Compte>)newValue);
				return;
			case SchoolLifePackage.SYSTEM__UTILISATEUR_LIST:
				getUtilisateurList().clear();
				getUtilisateurList().addAll((Collection<? extends User>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchoolLifePackage.SYSTEM__CLASSE:
				getClasse().clear();
				return;
			case SchoolLifePackage.SYSTEM__MATIERE:
				getMatiere().clear();
				return;
			case SchoolLifePackage.SYSTEM__COMPTE:
				getCompte().clear();
				return;
			case SchoolLifePackage.SYSTEM__UTILISATEUR_LIST:
				getUtilisateurList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchoolLifePackage.SYSTEM__CLASSE:
				return classe != null && !classe.isEmpty();
			case SchoolLifePackage.SYSTEM__MATIERE:
				return matiere != null && !matiere.isEmpty();
			case SchoolLifePackage.SYSTEM__COMPTE:
				return compte != null && !compte.isEmpty();
			case SchoolLifePackage.SYSTEM__UTILISATEUR_LIST:
				return utilisateurList != null && !utilisateurList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
