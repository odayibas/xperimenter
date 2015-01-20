/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getName <em>Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getUri <em>Uri</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getSeed <em>Seed</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getNumberGenerator()
 * @model
 * @generated
 */
public interface NumberGenerator extends EObject
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
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getNumberGenerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getNumberGenerator_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seed</em>' attribute.
   * @see #setSeed(int)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getNumberGenerator_Seed()
   * @model
   * @generated
   */
  int getSeed();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getSeed <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seed</em>' attribute.
   * @see #getSeed()
   * @generated
   */
  void setSeed(int value);

} // NumberGenerator
