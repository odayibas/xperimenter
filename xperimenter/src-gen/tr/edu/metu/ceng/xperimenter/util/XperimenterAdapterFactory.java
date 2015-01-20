/**
 */
package tr.edu.metu.ceng.xperimenter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tr.edu.metu.ceng.xperimenter.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage
 * @generated
 */
public class XperimenterAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XperimenterPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XperimenterAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XperimenterPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XperimenterSwitch<Adapter> modelSwitch =
    new XperimenterSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseExperiment(Experiment object)
      {
        return createExperimentAdapter();
      }
      @Override
      public Adapter caseDesign(Design object)
      {
        return createDesignAdapter();
      }
      @Override
      public Adapter caseSimulation(Simulation object)
      {
        return createSimulationAdapter();
      }
      @Override
      public Adapter caseStatAnalysis(StatAnalysis object)
      {
        return createStatAnalysisAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseInPort(InPort object)
      {
        return createInPortAdapter();
      }
      @Override
      public Adapter caseOutPort(OutPort object)
      {
        return createOutPortAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseNumberGenerator(NumberGenerator object)
      {
        return createNumberGeneratorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Experiment <em>Experiment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Experiment
   * @generated
   */
  public Adapter createExperimentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Design
   * @generated
   */
  public Adapter createDesignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Simulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Simulation
   * @generated
   */
  public Adapter createSimulationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.StatAnalysis <em>Stat Analysis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.StatAnalysis
   * @generated
   */
  public Adapter createStatAnalysisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.InPort <em>In Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.InPort
   * @generated
   */
  public Adapter createInPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.OutPort <em>Out Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.OutPort
   * @generated
   */
  public Adapter createOutPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tr.edu.metu.ceng.xperimenter.NumberGenerator <em>Number Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tr.edu.metu.ceng.xperimenter.NumberGenerator
   * @generated
   */
  public Adapter createNumberGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XperimenterAdapterFactory
