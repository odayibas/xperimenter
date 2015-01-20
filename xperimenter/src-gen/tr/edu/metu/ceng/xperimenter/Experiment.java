/**
 */
package tr.edu.metu.ceng.xperimenter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getDescription <em>Description</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getObjective <em>Objective</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getDesign <em>Design</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getSimulation <em>Simulation</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.Experiment#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends Type
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Objective</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.Objective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objective</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objective</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.Objective
   * @see #setObjective(Objective)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Objective()
   * @model
   * @generated
   */
  Objective getObjective();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getObjective <em>Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Objective</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.Objective
   * @see #getObjective()
   * @generated
   */
  void setObjective(Objective value);

  /**
   * Returns the value of the '<em><b>Design</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Design</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Design</em>' reference.
   * @see #setDesign(Design)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Design()
   * @model
   * @generated
   */
  Design getDesign();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getDesign <em>Design</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Design</em>' reference.
   * @see #getDesign()
   * @generated
   */
  void setDesign(Design value);

  /**
   * Returns the value of the '<em><b>Simulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simulation</em>' reference.
   * @see #setSimulation(Simulation)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Simulation()
   * @model
   * @generated
   */
  Simulation getSimulation();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getSimulation <em>Simulation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simulation</em>' reference.
   * @see #getSimulation()
   * @generated
   */
  void setSimulation(Simulation value);

  /**
   * Returns the value of the '<em><b>Analysis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analysis</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analysis</em>' reference.
   * @see #setAnalysis(StatAnalysis)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Analysis()
   * @model
   * @generated
   */
  StatAnalysis getAnalysis();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getAnalysis <em>Analysis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analysis</em>' reference.
   * @see #getAnalysis()
   * @generated
   */
  void setAnalysis(StatAnalysis value);

  /**
   * Returns the value of the '<em><b>Visualization</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.xperimenter.VisualizationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visualization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visualization</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VisualizationType
   * @see #setVisualization(VisualizationType)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Visualization()
   * @model
   * @generated
   */
  VisualizationType getVisualization();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getVisualization <em>Visualization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visualization</em>' attribute.
   * @see tr.edu.metu.ceng.xperimenter.VisualizationType
   * @see #getVisualization()
   * @generated
   */
  void setVisualization(VisualizationType value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(int)
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getExperiment_Timeout()
   * @model
   * @generated
   */
  int getTimeout();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.xperimenter.Experiment#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(int value);

} // Experiment
