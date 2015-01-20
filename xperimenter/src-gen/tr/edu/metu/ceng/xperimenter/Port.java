/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Port#getName <em>Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Port#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getPort_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Port#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // Port
