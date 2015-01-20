/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tr.edu.metu.ceng.xperimenter.Port;
import tr.edu.metu.ceng.xperimenter.SimModelType;
import tr.edu.metu.ceng.xperimenter.Simulation;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.SimulationImpl#getModelFilePath <em>Model File Path</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.SimulationImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.SimulationImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulationImpl extends TypeImpl implements Simulation
{
  /**
   * The default value of the '{@link #getModelFilePath() <em>Model File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFilePath()
   * @generated
   * @ordered
   */
  protected static final String MODEL_FILE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelFilePath() <em>Model File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelFilePath()
   * @generated
   * @ordered
   */
  protected String modelFilePath = MODEL_FILE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected static final SimModelType MODEL_TYPE_EDEFAULT = SimModelType.STATIC;

  /**
   * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected SimModelType modelType = MODEL_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimulationImpl()
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
    return XperimenterPackage.Literals.SIMULATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelFilePath()
  {
    return modelFilePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelFilePath(String newModelFilePath)
  {
    String oldModelFilePath = modelFilePath;
    modelFilePath = newModelFilePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.SIMULATION__MODEL_FILE_PATH, oldModelFilePath, modelFilePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimModelType getModelType()
  {
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelType(SimModelType newModelType)
  {
    SimModelType oldModelType = modelType;
    modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.SIMULATION__MODEL_TYPE, oldModelType, modelType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, XperimenterPackage.SIMULATION__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XperimenterPackage.SIMULATION__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XperimenterPackage.SIMULATION__MODEL_FILE_PATH:
        return getModelFilePath();
      case XperimenterPackage.SIMULATION__MODEL_TYPE:
        return getModelType();
      case XperimenterPackage.SIMULATION__PORTS:
        return getPorts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XperimenterPackage.SIMULATION__MODEL_FILE_PATH:
        setModelFilePath((String)newValue);
        return;
      case XperimenterPackage.SIMULATION__MODEL_TYPE:
        setModelType((SimModelType)newValue);
        return;
      case XperimenterPackage.SIMULATION__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
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
      case XperimenterPackage.SIMULATION__MODEL_FILE_PATH:
        setModelFilePath(MODEL_FILE_PATH_EDEFAULT);
        return;
      case XperimenterPackage.SIMULATION__MODEL_TYPE:
        setModelType(MODEL_TYPE_EDEFAULT);
        return;
      case XperimenterPackage.SIMULATION__PORTS:
        getPorts().clear();
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
      case XperimenterPackage.SIMULATION__MODEL_FILE_PATH:
        return MODEL_FILE_PATH_EDEFAULT == null ? modelFilePath != null : !MODEL_FILE_PATH_EDEFAULT.equals(modelFilePath);
      case XperimenterPackage.SIMULATION__MODEL_TYPE:
        return modelType != MODEL_TYPE_EDEFAULT;
      case XperimenterPackage.SIMULATION__PORTS:
        return ports != null && !ports.isEmpty();
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
    result.append(" (modelFilePath: ");
    result.append(modelFilePath);
    result.append(", modelType: ");
    result.append(modelType);
    result.append(')');
    return result.toString();
  }

} //SimulationImpl
