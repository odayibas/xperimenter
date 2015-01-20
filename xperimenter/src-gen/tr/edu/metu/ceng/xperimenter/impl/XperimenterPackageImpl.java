/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tr.edu.metu.ceng.xperimenter.Design;
import tr.edu.metu.ceng.xperimenter.Experiment;
import tr.edu.metu.ceng.xperimenter.InPort;
import tr.edu.metu.ceng.xperimenter.Model;
import tr.edu.metu.ceng.xperimenter.NumberGenerator;
import tr.edu.metu.ceng.xperimenter.Objective;
import tr.edu.metu.ceng.xperimenter.OutPort;
import tr.edu.metu.ceng.xperimenter.Port;
import tr.edu.metu.ceng.xperimenter.SamplingMethod;
import tr.edu.metu.ceng.xperimenter.SimModelType;
import tr.edu.metu.ceng.xperimenter.Simulation;
import tr.edu.metu.ceng.xperimenter.StatAnalysis;
import tr.edu.metu.ceng.xperimenter.StatAnalysisType;
import tr.edu.metu.ceng.xperimenter.Type;
import tr.edu.metu.ceng.xperimenter.Variable;
import tr.edu.metu.ceng.xperimenter.VariableGroup;
import tr.edu.metu.ceng.xperimenter.VariableType;
import tr.edu.metu.ceng.xperimenter.VisualizationType;
import tr.edu.metu.ceng.xperimenter.XperimenterFactory;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XperimenterPackageImpl extends EPackageImpl implements XperimenterPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass experimentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass designEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simulationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statAnalysisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum objectiveEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum simModelTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum variableGroupEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum variableTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum samplingMethodEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum statAnalysisTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visualizationTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XperimenterPackageImpl()
  {
    super(eNS_URI, XperimenterFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XperimenterPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XperimenterPackage init()
  {
    if (isInited) return (XperimenterPackage)EPackage.Registry.INSTANCE.getEPackage(XperimenterPackage.eNS_URI);

    // Obtain or create and register package
    XperimenterPackageImpl theXperimenterPackage = (XperimenterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XperimenterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XperimenterPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXperimenterPackage.createPackageContents();

    // Initialize created meta-data
    theXperimenterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXperimenterPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XperimenterPackage.eNS_URI, theXperimenterPackage);
    return theXperimenterPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExperiment()
  {
    return experimentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperiment_Description()
  {
    return (EAttribute)experimentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperiment_Objective()
  {
    return (EAttribute)experimentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperiment_Design()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperiment_Simulation()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExperiment_Analysis()
  {
    return (EReference)experimentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperiment_Visualization()
  {
    return (EAttribute)experimentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExperiment_Timeout()
  {
    return (EAttribute)experimentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesign()
  {
    return designEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesign_Method()
  {
    return (EAttribute)designEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDesign_Variables()
  {
    return (EReference)designEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimulation()
  {
    return simulationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimulation_ModelFilePath()
  {
    return (EAttribute)simulationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimulation_ModelType()
  {
    return (EAttribute)simulationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulation_Ports()
  {
    return (EReference)simulationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatAnalysis()
  {
    return statAnalysisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatAnalysis_Uri()
  {
    return (EAttribute)statAnalysisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Name()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_Variable()
  {
    return (EReference)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInPort()
  {
    return inPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutPort()
  {
    return outPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Type()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Group()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_LowValue()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_HighValue()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Generator()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberGenerator()
  {
    return numberGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberGenerator_Name()
  {
    return (EAttribute)numberGeneratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberGenerator_Uri()
  {
    return (EAttribute)numberGeneratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberGenerator_Seed()
  {
    return (EAttribute)numberGeneratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getObjective()
  {
    return objectiveEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSimModelType()
  {
    return simModelTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVariableGroup()
  {
    return variableGroupEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVariableType()
  {
    return variableTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSamplingMethod()
  {
    return samplingMethodEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStatAnalysisType()
  {
    return statAnalysisTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisualizationType()
  {
    return visualizationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XperimenterFactory getXperimenterFactory()
  {
    return (XperimenterFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    experimentEClass = createEClass(EXPERIMENT);
    createEAttribute(experimentEClass, EXPERIMENT__DESCRIPTION);
    createEAttribute(experimentEClass, EXPERIMENT__OBJECTIVE);
    createEReference(experimentEClass, EXPERIMENT__DESIGN);
    createEReference(experimentEClass, EXPERIMENT__SIMULATION);
    createEReference(experimentEClass, EXPERIMENT__ANALYSIS);
    createEAttribute(experimentEClass, EXPERIMENT__VISUALIZATION);
    createEAttribute(experimentEClass, EXPERIMENT__TIMEOUT);

    designEClass = createEClass(DESIGN);
    createEAttribute(designEClass, DESIGN__METHOD);
    createEReference(designEClass, DESIGN__VARIABLES);

    simulationEClass = createEClass(SIMULATION);
    createEAttribute(simulationEClass, SIMULATION__MODEL_FILE_PATH);
    createEAttribute(simulationEClass, SIMULATION__MODEL_TYPE);
    createEReference(simulationEClass, SIMULATION__PORTS);

    statAnalysisEClass = createEClass(STAT_ANALYSIS);
    createEAttribute(statAnalysisEClass, STAT_ANALYSIS__URI);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__NAME);
    createEReference(portEClass, PORT__VARIABLE);

    inPortEClass = createEClass(IN_PORT);

    outPortEClass = createEClass(OUT_PORT);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__TYPE);
    createEAttribute(variableEClass, VARIABLE__GROUP);
    createEAttribute(variableEClass, VARIABLE__LOW_VALUE);
    createEAttribute(variableEClass, VARIABLE__HIGH_VALUE);
    createEReference(variableEClass, VARIABLE__GENERATOR);

    numberGeneratorEClass = createEClass(NUMBER_GENERATOR);
    createEAttribute(numberGeneratorEClass, NUMBER_GENERATOR__NAME);
    createEAttribute(numberGeneratorEClass, NUMBER_GENERATOR__URI);
    createEAttribute(numberGeneratorEClass, NUMBER_GENERATOR__SEED);

    // Create enums
    objectiveEEnum = createEEnum(OBJECTIVE);
    simModelTypeEEnum = createEEnum(SIM_MODEL_TYPE);
    variableGroupEEnum = createEEnum(VARIABLE_GROUP);
    variableTypeEEnum = createEEnum(VARIABLE_TYPE);
    samplingMethodEEnum = createEEnum(SAMPLING_METHOD);
    statAnalysisTypeEEnum = createEEnum(STAT_ANALYSIS_TYPE);
    visualizationTypeEEnum = createEEnum(VISUALIZATION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    experimentEClass.getESuperTypes().add(this.getType());
    designEClass.getESuperTypes().add(this.getType());
    simulationEClass.getESuperTypes().add(this.getType());
    statAnalysisEClass.getESuperTypes().add(this.getType());
    inPortEClass.getESuperTypes().add(this.getPort());
    outPortEClass.getESuperTypes().add(this.getPort());
    variableEClass.getESuperTypes().add(this.getType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getType(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExperiment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperiment_Objective(), this.getObjective(), "objective", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_Design(), this.getDesign(), null, "design", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_Simulation(), this.getSimulation(), null, "simulation", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExperiment_Analysis(), this.getStatAnalysis(), null, "analysis", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperiment_Visualization(), this.getVisualizationType(), "visualization", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExperiment_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(designEClass, Design.class, "Design", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesign_Method(), this.getSamplingMethod(), "method", null, 0, 1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDesign_Variables(), this.getVariable(), null, "variables", null, 0, -1, Design.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimulation_ModelFilePath(), ecorePackage.getEString(), "modelFilePath", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimulation_ModelType(), this.getSimModelType(), "modelType", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulation_Ports(), this.getPort(), null, "ports", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statAnalysisEClass, StatAnalysis.class, "StatAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatAnalysis_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, StatAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPort_Variable(), this.getVariable(), null, "variable", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inPortEClass, InPort.class, "InPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outPortEClass, OutPort.class, "OutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Type(), this.getVariableType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Group(), this.getVariableGroup(), "group", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_LowValue(), ecorePackage.getEInt(), "lowValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_HighValue(), ecorePackage.getEInt(), "highValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Generator(), this.getNumberGenerator(), null, "generator", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberGeneratorEClass, NumberGenerator.class, "NumberGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberGenerator_Name(), ecorePackage.getEString(), "name", null, 0, 1, NumberGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberGenerator_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, NumberGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberGenerator_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, NumberGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(objectiveEEnum, Objective.class, "Objective");
    addEEnumLiteral(objectiveEEnum, Objective.COMPARATIVE);
    addEEnumLiteral(objectiveEEnum, Objective.SCREENING);
    addEEnumLiteral(objectiveEEnum, Objective.RESPSURFACE);

    initEEnum(simModelTypeEEnum, SimModelType.class, "SimModelType");
    addEEnumLiteral(simModelTypeEEnum, SimModelType.STATIC);
    addEEnumLiteral(simModelTypeEEnum, SimModelType.CONTINUOUS);
    addEEnumLiteral(simModelTypeEEnum, SimModelType.DISCRETEEVENT);

    initEEnum(variableGroupEEnum, VariableGroup.class, "VariableGroup");
    addEEnumLiteral(variableGroupEEnum, VariableGroup.FACTOR);
    addEEnumLiteral(variableGroupEEnum, VariableGroup.RESPONSE);

    initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
    addEEnumLiteral(variableTypeEEnum, VariableType.BOOLEAN);
    addEEnumLiteral(variableTypeEEnum, VariableType.INTEGER);
    addEEnumLiteral(variableTypeEEnum, VariableType.FLOAT);
    addEEnumLiteral(variableTypeEEnum, VariableType.STRING);

    initEEnum(samplingMethodEEnum, SamplingMethod.class, "SamplingMethod");
    addEEnumLiteral(samplingMethodEEnum, SamplingMethod.RANDOMIZED);
    addEEnumLiteral(samplingMethodEEnum, SamplingMethod.RANDOMIZEDBLOCK);
    addEEnumLiteral(samplingMethodEEnum, SamplingMethod.FACTORIAL);
    addEEnumLiteral(samplingMethodEEnum, SamplingMethod.FRACFACTORIAL);
    addEEnumLiteral(samplingMethodEEnum, SamplingMethod.CENTRALCOMP);

    initEEnum(statAnalysisTypeEEnum, StatAnalysisType.class, "StatAnalysisType");
    addEEnumLiteral(statAnalysisTypeEEnum, StatAnalysisType.HYPOTESTING);
    addEEnumLiteral(statAnalysisTypeEEnum, StatAnalysisType.ANOVA);
    addEEnumLiteral(statAnalysisTypeEEnum, StatAnalysisType.MANOVA);
    addEEnumLiteral(statAnalysisTypeEEnum, StatAnalysisType.CONFINTERVAL);

    initEEnum(visualizationTypeEEnum, VisualizationType.class, "VisualizationType");
    addEEnumLiteral(visualizationTypeEEnum, VisualizationType.HISTOGRAM);
    addEEnumLiteral(visualizationTypeEEnum, VisualizationType.SCATTERPLOT);

    // Create resource
    createResource(eNS_URI);
  }

} //XperimenterPackageImpl
