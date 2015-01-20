/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.xperimenter.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Model
