/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tr.edu.metu.ceng.xperimenter.Design;
import tr.edu.metu.ceng.xperimenter.Experiment;
import tr.edu.metu.ceng.xperimenter.Objective;
import tr.edu.metu.ceng.xperimenter.Simulation;
import tr.edu.metu.ceng.xperimenter.StatAnalysis;
import tr.edu.metu.ceng.xperimenter.VisualizationType;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getSimulation <em>Simulation</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.ExperimentImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentImpl extends TypeImpl implements Experiment
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected static final Objective OBJECTIVE_EDEFAULT = Objective.COMPARATIVE;

  /**
   * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjective()
   * @generated
   * @ordered
   */
  protected Objective objective = OBJECTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesign()
   * @generated
   * @ordered
   */
  protected Design design;

  /**
   * The cached value of the '{@link #getSimulation() <em>Simulation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimulation()
   * @generated
   * @ordered
   */
  protected Simulation simulation;

  /**
   * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalysis()
   * @generated
   * @ordered
   */
  protected StatAnalysis analysis;

  /**
   * The default value of the '{@link #getVisualization() <em>Visualization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisualization()
   * @generated
   * @ordered
   */
  protected static final VisualizationType VISUALIZATION_EDEFAULT = VisualizationType.HISTOGRAM;

  /**
   * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisualization()
   * @generated
   * @ordered
   */
  protected VisualizationType visualization = VISUALIZATION_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final int TIMEOUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected int timeout = TIMEOUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExperimentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XperimenterPackage.Literals.EXPERIMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objective getObjective()
  {
    return objective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjective(Objective newObjective)
  {
    Objective oldObjective = objective;
    objective = newObjective == null ? OBJECTIVE_EDEFAULT : newObjective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__OBJECTIVE, oldObjective, objective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design getDesign()
  {
    if (design != null && design.eIsProxy())
    {
      InternalEObject oldDesign = (InternalEObject)design;
      design = (Design)eResolveProxy(oldDesign);
      if (design != oldDesign)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XperimenterPackage.EXPERIMENT__DESIGN, oldDesign, design));
      }
    }
    return design;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design basicGetDesign()
  {
    return design;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesign(Design newDesign)
  {
    Design oldDesign = design;
    design = newDesign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__DESIGN, oldDesign, design));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simulation getSimulation()
  {
    if (simulation != null && simulation.eIsProxy())
    {
      InternalEObject oldSimulation = (InternalEObject)simulation;
      simulation = (Simulation)eResolveProxy(oldSimulation);
      if (simulation != oldSimulation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XperimenterPackage.EXPERIMENT__SIMULATION, oldSimulation, simulation));
      }
    }
    return simulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simulation basicGetSimulation()
  {
    return simulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimulation(Simulation newSimulation)
  {
    Simulation oldSimulation = simulation;
    simulation = newSimulation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__SIMULATION, oldSimulation, simulation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatAnalysis getAnalysis()
  {
    if (analysis != null && analysis.eIsProxy())
    {
      InternalEObject oldAnalysis = (InternalEObject)analysis;
      analysis = (StatAnalysis)eResolveProxy(oldAnalysis);
      if (analysis != oldAnalysis)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XperimenterPackage.EXPERIMENT__ANALYSIS, oldAnalysis, analysis));
      }
    }
    return analysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatAnalysis basicGetAnalysis()
  {
    return analysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalysis(StatAnalysis newAnalysis)
  {
    StatAnalysis oldAnalysis = analysis;
    analysis = newAnalysis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__ANALYSIS, oldAnalysis, analysis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationType getVisualization()
  {
    return visualization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisualization(VisualizationType newVisualization)
  {
    VisualizationType oldVisualization = visualization;
    visualization = newVisualization == null ? VISUALIZATION_EDEFAULT : newVisualization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__VISUALIZATION, oldVisualization, visualization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeout(int newTimeout)
  {
    int oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.EXPERIMENT__TIMEOUT, oldTimeout, timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XperimenterPackage.EXPERIMENT__DESCRIPTION:
        return getDescription();
      case XperimenterPackage.EXPERIMENT__OBJECTIVE:
        return getObjective();
      case XperimenterPackage.EXPERIMENT__DESIGN:
        if (resolve) return getDesign();
        return basicGetDesign();
      case XperimenterPackage.EXPERIMENT__SIMULATION:
        if (resolve) return getSimulation();
        return basicGetSimulation();
      case XperimenterPackage.EXPERIMENT__ANALYSIS:
        if (resolve) return getAnalysis();
        return basicGetAnalysis();
      case XperimenterPackage.EXPERIMENT__VISUALIZATION:
        return getVisualization();
      case XperimenterPackage.EXPERIMENT__TIMEOUT:
        return getTimeout();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XperimenterPackage.EXPERIMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__OBJECTIVE:
        setObjective((Objective)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__DESIGN:
        setDesign((Design)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__SIMULATION:
        setSimulation((Simulation)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__ANALYSIS:
        setAnalysis((StatAnalysis)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__VISUALIZATION:
        setVisualization((VisualizationType)newValue);
        return;
      case XperimenterPackage.EXPERIMENT__TIMEOUT:
        setTimeout((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XperimenterPackage.EXPERIMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case XperimenterPackage.EXPERIMENT__OBJECTIVE:
        setObjective(OBJECTIVE_EDEFAULT);
        return;
      case XperimenterPackage.EXPERIMENT__DESIGN:
        setDesign((Design)null);
        return;
      case XperimenterPackage.EXPERIMENT__SIMULATION:
        setSimulation((Simulation)null);
        return;
      case XperimenterPackage.EXPERIMENT__ANALYSIS:
        setAnalysis((StatAnalysis)null);
        return;
      case XperimenterPackage.EXPERIMENT__VISUALIZATION:
        setVisualization(VISUALIZATION_EDEFAULT);
        return;
      case XperimenterPackage.EXPERIMENT__TIMEOUT:
        setTimeout(TIMEOUT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XperimenterPackage.EXPERIMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case XperimenterPackage.EXPERIMENT__OBJECTIVE:
        return objective != OBJECTIVE_EDEFAULT;
      case XperimenterPackage.EXPERIMENT__DESIGN:
        return design != null;
      case XperimenterPackage.EXPERIMENT__SIMULATION:
        return simulation != null;
      case XperimenterPackage.EXPERIMENT__ANALYSIS:
        return analysis != null;
      case XperimenterPackage.EXPERIMENT__VISUALIZATION:
        return visualization != VISUALIZATION_EDEFAULT;
      case XperimenterPackage.EXPERIMENT__TIMEOUT:
        return timeout != TIMEOUT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", objective: ");
    result.append(objective);
    result.append(", visualization: ");
    result.append(visualization);
    result.append(", timeout: ");
    result.append(timeout);
    result.append(')');
    return result.toString();
  }

} //ExperimentImpl
