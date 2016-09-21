/**
 */
package schoolLife;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.Classe#getEleveList <em>Eleve List</em>}</li>
 *   <li>{@link schoolLife.Classe#getMatiereList <em>Matiere List</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends EObject {
	/**
	 * Returns the value of the '<em><b>Eleve List</b></em>' reference list.
	 * The list contents are of type {@link schoolLife.Eleve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eleve List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eleve List</em>' reference list.
	 * @see schoolLife.SchoolLifePackage#getClasse_EleveList()
	 * @model
	 * @generated
	 */
	EList<Eleve> getEleveList();

	/**
	 * Returns the value of the '<em><b>Matiere List</b></em>' reference list.
	 * The list contents are of type {@link schoolLife.Matiere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matiere List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matiere List</em>' reference list.
	 * @see schoolLife.SchoolLifePackage#getClasse_MatiereList()
	 * @model required="true"
	 * @generated
	 */
	EList<Matiere> getMatiereList();

} // Classe
