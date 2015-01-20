/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelFilePath <em>Model File Path</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelType <em>Model Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Simulation#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends Type
{
  /**
   * Returns the value of the '<em><b>Model File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model File Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model File Path</em>' attribute.
   * @see #setModelFilePath(String)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getSimulation_ModelFilePath()
   * @model
   * @generated
   */
  String getModelFilePath();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelFilePath <em>Model File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model File Path</em>' attribute.
   * @see #getModelFilePath()
   * @generated
   */
  void setModelFilePath(String value);

  /**
   * Returns the value of the '<em><b>Model Type</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.SimModelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Type</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.SimModelType
   * @see #setModelType(SimModelType)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getSimulation_ModelType()
   * @model
   * @generated
   */
  SimModelType getModelType();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelType <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Type</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.SimModelType
   * @see #getModelType()
   * @generated
   */
  void setModelType(SimModelType value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link tr.edu.metu.ceng.xperimenter.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getSimulation_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

} // Simulation
