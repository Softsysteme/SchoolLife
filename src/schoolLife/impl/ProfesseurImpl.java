/**
 */
package schoolLife.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import schoolLife.Classe;
import schoolLife.Professeur;
import schoolLife.SchoolLifePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.impl.ProfesseurImpl#getClassList <em>Class List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfesseurImpl extends UserImpl implements Professeur {
	/**
	 * The cached value of the '{@link #getClassList() <em>Class List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassList()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> classList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfesseurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchoolLifePackage.Literals.PROFESSEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClassList() {
		if (classList == null) {
			classList = new EObjectResolvingEList<Classe>(Classe.class, this, SchoolLifePackage.PROFESSEUR__CLASS_LIST);
		}
		return classList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchoolLifePackage.PROFESSEUR__CLASS_LIST:
				return getClassList();
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
			case SchoolLifePackage.PROFESSEUR__CLASS_LIST:
				getClassList().clear();
				getClassList().addAll((Collection<? extends Classe>)newValue);
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
			case SchoolLifePackage.PROFESSEUR__CLASS_LIST:
				getClassList().clear();
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
			case SchoolLifePackage.PROFESSEUR__CLASS_LIST:
				return classList != null && !classList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProfesseurImpl
