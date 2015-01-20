/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Design#getMethod <em>Method</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Design#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getDesign()
 * @model
 * @generated
 */
public interface Design extends Type
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.SamplingMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.SamplingMethod
   * @see #setMethod(SamplingMethod)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getDesign_Method()
   * @model
   * @generated
   */
  SamplingMethod getMethod();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Design#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.SamplingMethod
   * @see #getMethod()
   * @generated
   */
  void setMethod(SamplingMethod value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.xperimenter.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getDesign_Variables()
   * @model
   * @generated
   */
  EList<Variable> getVariables();

} // Design
