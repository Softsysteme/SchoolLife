/**
 */
package schoolLife.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import schoolLife.Compte;
import schoolLife.Profil_utilisateur;
import schoolLife.SchoolLifePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.impl.CompteImpl#getProfil_utilisateur <em>Profil utilisateur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompteImpl extends MinimalEObjectImpl.Container implements Compte {
	/**
	 * The cached value of the '{@link #getProfil_utilisateur() <em>Profil utilisateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfil_utilisateur()
	 * @generated
	 * @ordered
	 */
	protected Profil_utilisateur profil_utilisateur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolLifePackage.Literals.COMPTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profil_utilisateur getProfil_utilisateur() {
		return profil_utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfil_utilisateur(Profil_utilisateur newProfil_utilisateur, NotificationChain msgs) {
		Profil_utilisateur oldProfil_utilisateur = profil_utilisateur;
		profil_utilisateur = newProfil_utilisateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR, oldProfil_utilisateur, newProfil_utilisateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfil_utilisateur(Profil_utilisateur newProfil_utilisateur) {
		if (newProfil_utilisateur != profil_utilisateur) {
			NotificationChain msgs = null;
			if (profil_utilisateur != null)
				msgs = ((InternalEObject)profil_utilisateur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR, null, msgs);
			if (newProfil_utilisateur != null)
				msgs = ((InternalEObject)newProfil_utilisateur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR, null, msgs);
			msgs = basicSetProfil_utilisateur(newProfil_utilisateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR, newProfil_utilisateur, newProfil_utilisateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR:
				return basicSetProfil_utilisateur(null, msgs);
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
			case SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR:
				return getProfil_utilisateur();
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
			case SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR:
				setProfil_utilisateur((Profil_utilisateur)newValue);
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
			case SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR:
				setProfil_utilisateur((Profil_utilisateur)null);
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
			case SchoolLifePackage.COMPTE__PROFIL_UTILISATEUR:
				return profil_utilisateur != null;
		}
		return super.eIsSet(featureID);
	}

} //CompteImpl
