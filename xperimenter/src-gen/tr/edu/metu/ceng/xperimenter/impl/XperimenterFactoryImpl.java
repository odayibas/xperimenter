/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tr.edu.metu.ceng.xperimenter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XperimenterFactoryImpl extends EFactoryImpl implements XperimenterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XperimenterFactory init()
  {
    try
    {
      XperimenterFactory theXperimenterFactory = (XperimenterFactory)EPackage.Registry.INSTANCE.getEFactory(XperimenterPackage.eNS_URI);
      if (theXperimenterFactory != null)
      {
        return theXperimenterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XperimenterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XperimenterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XperimenterPackage.MODEL: return createModel();
      case XperimenterPackage.TYPE: return createType();
      case XperimenterPackage.EXPERIMENT: return createExperiment();
      case XperimenterPackage.DESIGN: return createDesign();
      case XperimenterPackage.SIMULATION: return createSimulation();
      case XperimenterPackage.STAT_ANALYSIS: return createStatAnalysis();
      case XperimenterPackage.PORT: return createPort();
      case XperimenterPackage.IN_PORT: return createInPort();
      case XperimenterPackage.OUT_PORT: return createOutPort();
      case XperimenterPackage.VARIABLE: return createVariable();
      case XperimenterPackage.NUMBER_GENERATOR: return createNumberGenerator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case XperimenterPackage.OBJECTIVE:
        return createObjectiveFromString(eDataType, initialValue);
      case XperimenterPackage.SIM_MODEL_TYPE:
        return createSimModelTypeFromString(eDataType, initialValue);
      case XperimenterPackage.VARIABLE_GROUP:
        return createVariableGroupFromString(eDataType, initialValue);
      case XperimenterPackage.VARIABLE_TYPE:
        return createVariableTypeFromString(eDataType, initialValue);
      case XperimenterPackage.SAMPLING_METHOD:
        return createSamplingMethodFromString(eDataType, initialValue);
      case XperimenterPackage.STAT_ANALYSIS_TYPE:
        return createStatAnalysisTypeFromString(eDataType, initialValue);
      case XperimenterPackage.VISUALIZATION_TYPE:
        return createVisualizationTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case XperimenterPackage.OBJECTIVE:
        return convertObjectiveToString(eDataType, instanceValue);
      case XperimenterPackage.SIM_MODEL_TYPE:
        return convertSimModelTypeToString(eDataType, instanceValue);
      case XperimenterPackage.VARIABLE_GROUP:
        return convertVariableGroupToString(eDataType, instanceValue);
      case XperimenterPackage.VARIABLE_TYPE:
        return convertVariableTypeToString(eDataType, instanceValue);
      case XperimenterPackage.SAMPLING_METHOD:
        return convertSamplingMethodToString(eDataType, instanceValue);
      case XperimenterPackage.STAT_ANALYSIS_TYPE:
        return convertStatAnalysisTypeToString(eDataType, instanceValue);
      case XperimenterPackage.VISUALIZATION_TYPE:
        return convertVisualizationTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Experiment createExperiment()
  {
    ExperimentImpl experiment = new ExperimentImpl();
    return experiment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design createDesign()
  {
    DesignImpl design = new DesignImpl();
    return design;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simulation createSimulation()
  {
    SimulationImpl simulation = new SimulationImpl();
    return simulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatAnalysis createStatAnalysis()
  {
    StatAnalysisImpl statAnalysis = new StatAnalysisImpl();
    return statAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPort createInPort()
  {
    InPortImpl inPort = new InPortImpl();
    return inPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutPort createOutPort()
  {
    OutPortImpl outPort = new OutPortImpl();
    return outPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberGenerator createNumberGenerator()
  {
    NumberGeneratorImpl numberGenerator = new NumberGeneratorImpl();
    return numberGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective createObjectiveFromString(EDataType eDataType, String initialValue)
  {
    Objective result = Objective.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertObjectiveToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimModelType createSimModelTypeFromString(EDataType eDataType, String initialValue)
  {
    SimModelType result = SimModelType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSimModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableGroup createVariableGroupFromString(EDataType eDataType, String initialValue)
  {
    VariableGroup result = VariableGroup.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariableGroupToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue)
  {
    VariableType result = VariableType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariableTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamplingMethod createSamplingMethodFromString(EDataType eDataType, String initialValue)
  {
    SamplingMethod result = SamplingMethod.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSamplingMethodToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatAnalysisType createStatAnalysisTypeFromString(EDataType eDataType, String initialValue)
  {
    StatAnalysisType result = StatAnalysisType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStatAnalysisTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationType createVisualizationTypeFromString(EDataType eDataType, String initialValue)
  {
    VisualizationType result = VisualizationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisualizationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XperimenterPackage getXperimenterPackage()
  {
    return (XperimenterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XperimenterPackage getPackage()
  {
    return XperimenterPackage.eINSTANCE;
  }

} //XperimenterFactoryImpl
