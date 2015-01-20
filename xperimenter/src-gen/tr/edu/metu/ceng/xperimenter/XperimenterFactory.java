/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage
 * @generated
 */
public interface XperimenterFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XperimenterFactory eINSTANCE = tr.edu.metu.ceng.xperimenter.impl.XperimenterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Experiment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Experiment</em>'.
   * @generated
   */
  Experiment createExperiment();

  /**
   * Returns a new object of class '<em>Design</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design</em>'.
   * @generated
   */
  Design createDesign();

  /**
   * Returns a new object of class '<em>Simulation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simulation</em>'.
   * @generated
   */
  Simulation createSimulation();

  /**
   * Returns a new object of class '<em>Stat Analysis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stat Analysis</em>'.
   * @generated
   */
  StatAnalysis createStatAnalysis();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>In Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Port</em>'.
   * @generated
   */
  InPort createInPort();

  /**
   * Returns a new object of class '<em>Out Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Port</em>'.
   * @generated
   */
  OutPort createOutPort();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Number Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Generator</em>'.
   * @generated
   */
  NumberGenerator createNumberGenerator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XperimenterPackage getXperimenterPackage();

} //XperimenterFactory
