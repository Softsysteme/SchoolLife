/**
 */
package schoolLife;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eleve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schoolLife.Eleve#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see schoolLife.SchoolLifePackage#getEleve()
 * @model
 * @generated
 */
public interface Eleve extends User {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(Classe)
	 * @see schoolLife.SchoolLifePackage#getEleve_Class()
	 * @model required="true"
	 * @generated
	 */
	Classe getClass_();

	/**
	 * Sets the value of the '{@link schoolLife.Eleve#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Classe value);

} // Eleve
