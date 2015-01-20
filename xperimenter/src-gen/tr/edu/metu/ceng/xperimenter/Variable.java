/**
 */
package tr.edu.metu.ceng.xperimenter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Variable#getType <em>Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Variable#getGroup <em>Group</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Variable#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Variable#getHighValue <em>High Value</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Variable#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.VariableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VariableType
   * @see #setType(VariableType)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable_Type()
   * @model
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Variable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VariableType
   * @see #getType()
   * @generated
   */
  void setType(VariableType value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.VariableGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VariableGroup
   * @see #setGroup(VariableGroup)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable_Group()
   * @model
   * @generated
   */
  VariableGroup getGroup();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Variable#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VariableGroup
   * @see #getGroup()
   * @generated
   */
  void setGroup(VariableGroup value);

  /**
   * Returns the value of the '<em><b>Low Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Value</em>' attribute.
   * @see #setLowValue(int)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable_LowValue()
   * @model
   * @generated
   */
  int getLowValue();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Variable#getLowValue <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Value</em>' attribute.
   * @see #getLowValue()
   * @generated
   */
  void setLowValue(int value);

  /**
   * Returns the value of the '<em><b>High Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Value</em>' attribute.
   * @see #setHighValue(int)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable_HighValue()
   * @model
   * @generated
   */
  int getHighValue();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Variable#getHighValue <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Value</em>' attribute.
   * @see #getHighValue()
   * @generated
   */
  void setHighValue(int value);

  /**
   * Returns the value of the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generator</em>' reference.
   * @see #setGenerator(NumberGenerator)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariable_Generator()
   * @model
   * @generated
   */
  NumberGenerator getGenerator();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Variable#getGenerator <em>Generator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' reference.
   * @see #getGenerator()
   * @generated
   */
  void setGenerator(NumberGenerator value);

} // Variable
