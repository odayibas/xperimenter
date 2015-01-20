/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tr.edu.metu.ceng.xperimenter.Design;
import tr.edu.metu.ceng.xperimenter.SamplingMethod;
import tr.edu.metu.ceng.xperimenter.Variable;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.DesignImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.DesignImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignImpl extends TypeImpl implements Design
{
  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final SamplingMethod METHOD_EDEFAULT = SamplingMethod.RANDOMIZED;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected SamplingMethod method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignImpl()
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
    return XperimenterPackage.Literals.DESIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamplingMethod getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(SamplingMethod newMethod)
  {
    SamplingMethod oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.DESIGN__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectResolvingEList<Variable>(Variable.class, this, XperimenterPackage.DESIGN__VARIABLES);
    }
    return variables;
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
      case XperimenterPackage.DESIGN__METHOD:
        return getMethod();
      case XperimenterPackage.DESIGN__VARIABLES:
        return getVariables();
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
      case XperimenterPackage.DESIGN__METHOD:
        setMethod((SamplingMethod)newValue);
        return;
      case XperimenterPackage.DESIGN__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
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
      case XperimenterPackage.DESIGN__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case XperimenterPackage.DESIGN__VARIABLES:
        getVariables().clear();
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
      case XperimenterPackage.DESIGN__METHOD:
        return method != METHOD_EDEFAULT;
      case XperimenterPackage.DESIGN__VARIABLES:
        return variables != null && !variables.isEmpty();
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
    result.append(" (method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //DesignImpl
