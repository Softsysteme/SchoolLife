/**
 */
package schoolLife;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.Professeur#getClassList <em>Class List</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getProfesseur()
 * @model
 * @generated
 */
public interface Professeur extends User {
	/**
	 * Returns the value of the '<em><b>Class List</b></em>' reference list.
	 * The list contents are of type {@link schoolLife.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class List</em>' reference list.
	 * @see schoolLife.SchoolLifePackage#getProfesseur_ClassList()
	 * @model required="true"
	 * @generated
	 */
	EList<Classe> getClassList();

} // Professeur
