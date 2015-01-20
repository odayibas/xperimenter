/**
 */
package tr.edu.metu.ceng.xperimenter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterFactory
 * @model kind="package"
 * @generated
 */
public interface XperimenterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xperimenter";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ceng.metu.edu.tr/~e1564178/xperimenter";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xperimenter";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XperimenterPackage eINSTANCE = tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl.init();

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.ModelImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.TypeImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl <em>Experiment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getExperiment()
   * @generated
   */
  int EXPERIMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__DESCRIPTION = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__OBJECTIVE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Design</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__DESIGN = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Simulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__SIMULATION = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Analysis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__ANALYSIS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Visualization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__VISUALIZATION = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT__TIMEOUT = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Experiment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERIMENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.DesignImpl <em>Design</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.DesignImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getDesign()
   * @generated
   */
  int DESIGN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__METHOD = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__VARIABLES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Design</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.SimulationImpl <em>Simulation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.SimulationImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSimulation()
   * @generated
   */
  int SIMULATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Model File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__MODEL_FILE_PATH = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__MODEL_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION__PORTS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Simulation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.StatAnalysisImpl <em>Stat Analysis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.StatAnalysisImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getStatAnalysis()
   * @generated
   */
  int STAT_ANALYSIS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_ANALYSIS__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_ANALYSIS__URI = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stat Analysis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_ANALYSIS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.PortImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getPort()
   * @generated
   */
  int PORT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.InPortImpl <em>In Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.InPortImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getInPort()
   * @generated
   */
  int IN_PORT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PORT__VARIABLE = PORT__VARIABLE;

  /**
   * The number of structural features of the '<em>In Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.OutPortImpl <em>Out Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.OutPortImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getOutPort()
   * @generated
   */
  int OUT_PORT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PORT__VARIABLE = PORT__VARIABLE;

  /**
   * The number of structural features of the '<em>Out Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.VariableImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__GROUP = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Low Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__LOW_VALUE = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>High Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__HIGH_VALUE = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__GENERATOR = TYPE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.impl.NumberGeneratorImpl <em>Number Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.impl.NumberGeneratorImpl
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getNumberGenerator()
   * @generated
   */
  int NUMBER_GENERATOR = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GENERATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GENERATOR__URI = 1;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GENERATOR__SEED = 2;

  /**
   * The number of structural features of the '<em>Number Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_GENERATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.Objective <em>Objective</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.Objective
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getObjective()
   * @generated
   */
  int OBJECTIVE = 11;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.SimModelType <em>Sim Model Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.SimModelType
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSimModelType()
   * @generated
   */
  int SIM_MODEL_TYPE = 12;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.VariableGroup <em>Variable Group</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.VariableGroup
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariableGroup()
   * @generated
   */
  int VARIABLE_GROUP = 13;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.VariableType <em>Variable Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.VariableType
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariableType()
   * @generated
   */
  int VARIABLE_TYPE = 14;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.SamplingMethod <em>Sampling Method</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.SamplingMethod
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSamplingMethod()
   * @generated
   */
  int SAMPLING_METHOD = 15;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.StatAnalysisType <em>Stat Analysis Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.StatAnalysisType
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getStatAnalysisType()
   * @generated
   */
  int STAT_ANALYSIS_TYPE = 16;

  /**
   * The meta object id for the '{@link tr.edu.metu.ceng.xperimenter.VisualizationType <em>Visualization Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tr.edu.metu.ceng.xperimenter.VisualizationType
   * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVisualizationType()
   * @generated
   */
  int VISUALIZATION_TYPE = 17;


  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link tr.edu.metu.ceng.xperimenter.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Experiment <em>Experiment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Experiment</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment
   * @generated
   */
  EClass getExperiment();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Experiment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getDescription()
   * @see #getExperiment()
   * @generated
   */
  EAttribute getExperiment_Description();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Experiment#getObjective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Objective</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getObjective()
   * @see #getExperiment()
   * @generated
   */
  EAttribute getExperiment_Objective();

  /**
   * Returns the meta object for the reference '{@link tr.edu.metu.ceng.xperimenter.Experiment#getDesign <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Design</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getDesign()
   * @see #getExperiment()
   * @generated
   */
  EReference getExperiment_Design();

  /**
   * Returns the meta object for the reference '{@link tr.edu.metu.ceng.xperimenter.Experiment#getSimulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Simulation</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getSimulation()
   * @see #getExperiment()
   * @generated
   */
  EReference getExperiment_Simulation();

  /**
   * Returns the meta object for the reference '{@link tr.edu.metu.ceng.xperimenter.Experiment#getAnalysis <em>Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Analysis</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getAnalysis()
   * @see #getExperiment()
   * @generated
   */
  EReference getExperiment_Analysis();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Experiment#getVisualization <em>Visualization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visualization</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getVisualization()
   * @see #getExperiment()
   * @generated
   */
  EAttribute getExperiment_Visualization();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Experiment#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Experiment#getTimeout()
   * @see #getExperiment()
   * @generated
   */
  EAttribute getExperiment_Timeout();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Design</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Design
   * @generated
   */
  EClass getDesign();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Design#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Design#getMethod()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_Method();

  /**
   * Returns the meta object for the reference list '{@link tr.edu.metu.ceng.xperimenter.Design#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variables</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Design#getVariables()
   * @see #getDesign()
   * @generated
   */
  EReference getDesign_Variables();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Simulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simulation</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Simulation
   * @generated
   */
  EClass getSimulation();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelFilePath <em>Model File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model File Path</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Simulation#getModelFilePath()
   * @see #getSimulation()
   * @generated
   */
  EAttribute getSimulation_ModelFilePath();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Simulation#getModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Simulation#getModelType()
   * @see #getSimulation()
   * @generated
   */
  EAttribute getSimulation_ModelType();

  /**
   * Returns the meta object for the containment reference list '{@link tr.edu.metu.ceng.xperimenter.Simulation#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Simulation#getPorts()
   * @see #getSimulation()
   * @generated
   */
  EReference getSimulation_Ports();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.StatAnalysis <em>Stat Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stat Analysis</em>'.
   * @see tr.edu.metu.ceng.xperimenter.StatAnalysis
   * @generated
   */
  EClass getStatAnalysis();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.StatAnalysis#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see tr.edu.metu.ceng.xperimenter.StatAnalysis#getUri()
   * @see #getStatAnalysis()
   * @generated
   */
  EAttribute getStatAnalysis_Uri();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link tr.edu.metu.ceng.xperimenter.Port#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Port#getVariable()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Variable();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.InPort <em>In Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Port</em>'.
   * @see tr.edu.metu.ceng.xperimenter.InPort
   * @generated
   */
  EClass getInPort();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.OutPort <em>Out Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Port</em>'.
   * @see tr.edu.metu.ceng.xperimenter.OutPort
   * @generated
   */
  EClass getOutPort();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Variable#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable#getGroup()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Group();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Variable#getLowValue <em>Low Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Low Value</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable#getLowValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_LowValue();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.Variable#getHighValue <em>High Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High Value</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable#getHighValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_HighValue();

  /**
   * Returns the meta object for the reference '{@link tr.edu.metu.ceng.xperimenter.Variable#getGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Generator</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Variable#getGenerator()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Generator();

  /**
   * Returns the meta object for class '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator <em>Number Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Generator</em>'.
   * @see tr.edu.metu.ceng.xperimenter.NumberGenerator
   * @generated
   */
  EClass getNumberGenerator();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tr.edu.metu.ceng.xperimenter.NumberGenerator#getName()
   * @see #getNumberGenerator()
   * @generated
   */
  EAttribute getNumberGenerator_Name();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see tr.edu.metu.ceng.xperimenter.NumberGenerator#getUri()
   * @see #getNumberGenerator()
   * @generated
   */
  EAttribute getNumberGenerator_Uri();

  /**
   * Returns the meta object for the attribute '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see tr.edu.metu.ceng.xperimenter.NumberGenerator#getSeed()
   * @see #getNumberGenerator()
   * @generated
   */
  EAttribute getNumberGenerator_Seed();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.Objective <em>Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Objective</em>'.
   * @see tr.edu.metu.ceng.xperimenter.Objective
   * @generated
   */
  EEnum getObjective();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.SimModelType <em>Sim Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sim Model Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.SimModelType
   * @generated
   */
  EEnum getSimModelType();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.VariableGroup <em>Variable Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Variable Group</em>'.
   * @see tr.edu.metu.ceng.xperimenter.VariableGroup
   * @generated
   */
  EEnum getVariableGroup();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.VariableType <em>Variable Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Variable Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.VariableType
   * @generated
   */
  EEnum getVariableType();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.SamplingMethod <em>Sampling Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sampling Method</em>'.
   * @see tr.edu.metu.ceng.xperimenter.SamplingMethod
   * @generated
   */
  EEnum getSamplingMethod();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.StatAnalysisType <em>Stat Analysis Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stat Analysis Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.StatAnalysisType
   * @generated
   */
  EEnum getStatAnalysisType();

  /**
   * Returns the meta object for enum '{@link tr.edu.metu.ceng.xperimenter.VisualizationType <em>Visualization Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visualization Type</em>'.
   * @see tr.edu.metu.ceng.xperimenter.VisualizationType
   * @generated
   */
  EEnum getVisualizationType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XperimenterFactory getXperimenterFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.ModelImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.TypeImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl <em>Experiment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getExperiment()
     * @generated
     */
    EClass EXPERIMENT = eINSTANCE.getExperiment();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT__DESCRIPTION = eINSTANCE.getExperiment_Description();

    /**
     * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT__OBJECTIVE = eINSTANCE.getExperiment_Objective();

    /**
     * The meta object literal for the '<em><b>Design</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT__DESIGN = eINSTANCE.getExperiment_Design();

    /**
     * The meta object literal for the '<em><b>Simulation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT__SIMULATION = eINSTANCE.getExperiment_Simulation();

    /**
     * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERIMENT__ANALYSIS = eINSTANCE.getExperiment_Analysis();

    /**
     * The meta object literal for the '<em><b>Visualization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT__VISUALIZATION = eINSTANCE.getExperiment_Visualization();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERIMENT__TIMEOUT = eINSTANCE.getExperiment_Timeout();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.DesignImpl <em>Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.DesignImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getDesign()
     * @generated
     */
    EClass DESIGN = eINSTANCE.getDesign();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__METHOD = eINSTANCE.getDesign_Method();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGN__VARIABLES = eINSTANCE.getDesign_Variables();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.SimulationImpl <em>Simulation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.SimulationImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSimulation()
     * @generated
     */
    EClass SIMULATION = eINSTANCE.getSimulation();

    /**
     * The meta object literal for the '<em><b>Model File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULATION__MODEL_FILE_PATH = eINSTANCE.getSimulation_ModelFilePath();

    /**
     * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMULATION__MODEL_TYPE = eINSTANCE.getSimulation_ModelType();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION__PORTS = eINSTANCE.getSimulation_Ports();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.StatAnalysisImpl <em>Stat Analysis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.StatAnalysisImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getStatAnalysis()
     * @generated
     */
    EClass STAT_ANALYSIS = eINSTANCE.getStatAnalysis();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAT_ANALYSIS__URI = eINSTANCE.getStatAnalysis_Uri();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.PortImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__VARIABLE = eINSTANCE.getPort_Variable();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.InPortImpl <em>In Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.InPortImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getInPort()
     * @generated
     */
    EClass IN_PORT = eINSTANCE.getInPort();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.OutPortImpl <em>Out Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.OutPortImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getOutPort()
     * @generated
     */
    EClass OUT_PORT = eINSTANCE.getOutPort();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.VariableImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__GROUP = eINSTANCE.getVariable_Group();

    /**
     * The meta object literal for the '<em><b>Low Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__LOW_VALUE = eINSTANCE.getVariable_LowValue();

    /**
     * The meta object literal for the '<em><b>High Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__HIGH_VALUE = eINSTANCE.getVariable_HighValue();

    /**
     * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__GENERATOR = eINSTANCE.getVariable_Generator();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.impl.NumberGeneratorImpl <em>Number Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.impl.NumberGeneratorImpl
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getNumberGenerator()
     * @generated
     */
    EClass NUMBER_GENERATOR = eINSTANCE.getNumberGenerator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_GENERATOR__NAME = eINSTANCE.getNumberGenerator_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_GENERATOR__URI = eINSTANCE.getNumberGenerator_Uri();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_GENERATOR__SEED = eINSTANCE.getNumberGenerator_Seed();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.Objective <em>Objective</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.Objective
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getObjective()
     * @generated
     */
    EEnum OBJECTIVE = eINSTANCE.getObjective();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.SimModelType <em>Sim Model Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.SimModelType
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSimModelType()
     * @generated
     */
    EEnum SIM_MODEL_TYPE = eINSTANCE.getSimModelType();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.VariableGroup <em>Variable Group</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.VariableGroup
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariableGroup()
     * @generated
     */
    EEnum VARIABLE_GROUP = eINSTANCE.getVariableGroup();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.VariableType <em>Variable Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.VariableType
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVariableType()
     * @generated
     */
    EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.SamplingMethod <em>Sampling Method</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.SamplingMethod
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getSamplingMethod()
     * @generated
     */
    EEnum SAMPLING_METHOD = eINSTANCE.getSamplingMethod();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.StatAnalysisType <em>Stat Analysis Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.StatAnalysisType
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getStatAnalysisType()
     * @generated
     */
    EEnum STAT_ANALYSIS_TYPE = eINSTANCE.getStatAnalysisType();

    /**
     * The meta object literal for the '{@link tr.edu.metu.ceng.xperimenter.VisualizationType <em>Visualization Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tr.edu.metu.ceng.xperimenter.VisualizationType
     * @see tr.edu.metu.ceng.xperimenter.impl.XperimenterPackageImpl#getVisualizationType()
     * @generated
     */
    EEnum VISUALIZATION_TYPE = eINSTANCE.getVisualizationType();

  }

} //XperimenterPackage
