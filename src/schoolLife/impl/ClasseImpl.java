/**
 */
package schoolLife.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import schoolLife.Classe;
import schoolLife.Eleve;
import schoolLife.Matiere;
import schoolLife.SchoolLifePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.impl.ClasseImpl#getEleveList <em>Eleve List</em>}</li>
 *   <li>{@link schoolLife.impl.ClasseImpl#getMatiereList <em>Matiere List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClasseImpl extends MinimalEObjectImpl.Container implements Classe {
	/**
	 * The cached value of the '{@link #getEleveList() <em>Eleve List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEleveList()
	 * @generated
	 * @ordered
	 */
	protected EList<Eleve> eleveList;

	/**
	 * The cached value of the '{@link #getMatiereList() <em>Matiere List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatiereList()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> matiereList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolLifePackage.Literals.CLASSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eleve> getEleveList() {
		if (eleveList == null) {
			eleveList = new EObjectResolvingEList<Eleve>(Eleve.class, this, SchoolLifePackage.CLASSE__ELEVE_LIST);
		}
		return eleveList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getMatiereList() {
		if (matiereList == null) {
			matiereList = new EObjectResolvingEList<Matiere>(Matiere.class, this, SchoolLifePackage.CLASSE__MATIERE_LIST);
		}
		return matiereList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolLifePackage.CLASSE__ELEVE_LIST:
				return getEleveList();
			case SchoolLifePackage.CLASSE__MATIERE_LIST:
				return getMatiereList();
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
			case SchoolLifePackage.CLASSE__ELEVE_LIST:
				getEleveList().clear();
				getEleveList().addAll((Collection<? extends Eleve>)newValue);
				return;
			case SchoolLifePackage.CLASSE__MATIERE_LIST:
				getMatiereList().clear();
				getMatiereList().addAll((Collection<? extends Matiere>)newValue);
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
			case SchoolLifePackage.CLASSE__ELEVE_LIST:
				getEleveList().clear();
				return;
			case SchoolLifePackage.CLASSE__MATIERE_LIST:
				getMatiereList().clear();
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
			case SchoolLifePackage.CLASSE__ELEVE_LIST:
				return eleveList != null && !eleveList.isEmpty();
			case SchoolLifePackage.CLASSE__MATIERE_LIST:
				return matiereList != null && !matiereList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClasseImpl
