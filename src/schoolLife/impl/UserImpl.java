/**
 */
package schoolLife.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import schoolLife.Compte;
import schoolLife.SchoolLifePackage;
import schoolLife.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.impl.UserImpl#getCompte_utilisateur <em>Compte utilisateur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getCompte_utilisateur() <em>Compte utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompte_utilisateur()
	 * @generated
	 * @ordered
	 */
	protected Compte compte_utilisateur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolLifePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte getCompte_utilisateur() {
		if (compte_utilisateur != null && compte_utilisateur.eIsProxy()) {
			InternalEObject oldCompte_utilisateur = (InternalEObject)compte_utilisateur;
			compte_utilisateur = (Compte)eResolveProxy(oldCompte_utilisateur);
			if (compte_utilisateur != oldCompte_utilisateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchoolLifePackage.USER__COMPTE_UTILISATEUR, oldCompte_utilisateur, compte_utilisateur));
			}
		}
		return compte_utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compte basicGetCompte_utilisateur() {
		return compte_utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompte_utilisateur(Compte newCompte_utilisateur) {
		Compte oldCompte_utilisateur = compte_utilisateur;
		compte_utilisateur = newCompte_utilisateur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolLifePackage.USER__COMPTE_UTILISATEUR, oldCompte_utilisateur, compte_utilisateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolLifePackage.USER__COMPTE_UTILISATEUR:
				if (resolve) return getCompte_utilisateur();
				return basicGetCompte_utilisateur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchoolLifePackage.USER__COMPTE_UTILISATEUR:
				setCompte_utilisateur((Compte)newValue);
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
			case SchoolLifePackage.USER__COMPTE_UTILISATEUR:
				setCompte_utilisateur((Compte)null);
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
			case SchoolLifePackage.USER__COMPTE_UTILISATEUR:
				return compte_utilisateur != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
