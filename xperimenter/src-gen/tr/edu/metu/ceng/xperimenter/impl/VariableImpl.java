/**
 */
package tr.edu.metu.ceng.xperimenter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tr.edu.metu.ceng.xperimenter.NumberGenerator;
import tr.edu.metu.ceng.xperimenter.Variable;
import tr.edu.metu.ceng.xperimenter.VariableGroup;
import tr.edu.metu.ceng.xperimenter.VariableType;
import tr.edu.metu.ceng.xperimenter.XperimenterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.xperimenter.impl.VariableImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends TypeImpl implements Variable
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final VariableType TYPE_EDEFAULT = VariableType.BOOLEAN;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VariableType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final VariableGroup GROUP_EDEFAULT = VariableGroup.FACTOR;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected VariableGroup group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowValue()
   * @generated
   * @ordered
   */
  protected static final int LOW_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowValue()
   * @generated
   * @ordered
   */
  protected int lowValue = LOW_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighValue()
   * @generated
   * @ordered
   */
  protected static final int HIGH_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighValue()
   * @generated
   * @ordered
   */
  protected int highValue = HIGH_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
  protected NumberGenerator generator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return XperimenterPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VariableType newType)
  {
    VariableType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.VARIABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableGroup getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(VariableGroup newGroup)
  {
    VariableGroup oldGroup = group;
    group = newGroup == null ? GROUP_EDEFAULT : newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.VARIABLE__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowValue()
  {
    return lowValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowValue(int newLowValue)
  {
    int oldLowValue = lowValue;
    lowValue = newLowValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.VARIABLE__LOW_VALUE, oldLowValue, lowValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHighValue()
  {
    return highValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighValue(int newHighValue)
  {
    int oldHighValue = highValue;
    highValue = newHighValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.VARIABLE__HIGH_VALUE, oldHighValue, highValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberGenerator getGenerator()
  {
    if (generator != null && generator.eIsProxy())
    {
      InternalEObject oldGenerator = (InternalEObject)generator;
      generator = (NumberGenerator)eResolveProxy(oldGenerator);
      if (generator != oldGenerator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XperimenterPackage.VARIABLE__GENERATOR, oldGenerator, generator));
      }
    }
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberGenerator basicGetGenerator()
  {
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerator(NumberGenerator newGenerator)
  {
    NumberGenerator oldGenerator = generator;
    generator = newGenerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XperimenterPackage.VARIABLE__GENERATOR, oldGenerator, generator));
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
      case XperimenterPackage.VARIABLE__TYPE:
        return getType();
      case XperimenterPackage.VARIABLE__GROUP:
        return getGroup();
      case XperimenterPackage.VARIABLE__LOW_VALUE:
        return getLowValue();
      case XperimenterPackage.VARIABLE__HIGH_VALUE:
        return getHighValue();
      case XperimenterPackage.VARIABLE__GENERATOR:
        if (resolve) return getGenerator();
        return basicGetGenerator();
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
      case XperimenterPackage.VARIABLE__TYPE:
        setType((VariableType)newValue);
        return;
      case XperimenterPackage.VARIABLE__GROUP:
        setGroup((VariableGroup)newValue);
        return;
      case XperimenterPackage.VARIABLE__LOW_VALUE:
        setLowValue((Integer)newValue);
        return;
      case XperimenterPackage.VARIABLE__HIGH_VALUE:
        setHighValue((Integer)newValue);
        return;
      case XperimenterPackage.VARIABLE__GENERATOR:
        setGenerator((NumberGenerator)newValue);
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
      case XperimenterPackage.VARIABLE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case XperimenterPackage.VARIABLE__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case XperimenterPackage.VARIABLE__LOW_VALUE:
        setLowValue(LOW_VALUE_EDEFAULT);
        return;
      case XperimenterPackage.VARIABLE__HIGH_VALUE:
        setHighValue(HIGH_VALUE_EDEFAULT);
        return;
      case XperimenterPackage.VARIABLE__GENERATOR:
        setGenerator((NumberGenerator)null);
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
      case XperimenterPackage.VARIABLE__TYPE:
        return type != TYPE_EDEFAULT;
      case XperimenterPackage.VARIABLE__GROUP:
        return group != GROUP_EDEFAULT;
      case XperimenterPackage.VARIABLE__LOW_VALUE:
        return lowValue != LOW_VALUE_EDEFAULT;
      case XperimenterPackage.VARIABLE__HIGH_VALUE:
        return highValue != HIGH_VALUE_EDEFAULT;
      case XperimenterPackage.VARIABLE__GENERATOR:
        return generator != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", group: ");
    result.append(group);
    result.append(", lowValue: ");
    result.append(lowValue);
    result.append(", highValue: ");
    result.append(highValue);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
