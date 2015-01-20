/**
 */
package tr.edu.metu.ceng.xperimenter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Group</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVariableGroup()
 * @model
 * @generated
 */
public enum VariableGroup implements Enumerator
{
  /**
   * The '<em><b>FACTOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FACTOR_VALUE
   * @generated
   * @ordered
   */
  FACTOR(0, "FACTOR", "FACTOR"),

  /**
   * The '<em><b>RESPONSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESPONSE_VALUE
   * @generated
   * @ordered
   */
  RESPONSE(1, "RESPONSE", "RESPONSE");

  /**
   * The '<em><b>FACTOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FACTOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FACTOR
   * @model
   * @generated
   * @ordered
   */
  public static final int FACTOR_VALUE = 0;

  /**
   * The '<em><b>RESPONSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RESPONSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESPONSE
   * @model
   * @generated
   * @ordered
   */
  public static final int RESPONSE_VALUE = 1;

  /**
   * An array of all the '<em><b>Variable Group</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VariableGroup[] VALUES_ARRAY =
    new VariableGroup[]
    {
      FACTOR,
      RESPONSE,
    };

  /**
   * A public read-only list of all the '<em><b>Variable Group</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VariableGroup> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Variable Group</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableGroup get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VariableGroup result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Variable Group</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableGroup getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VariableGroup result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Variable Group</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariableGroup get(int value)
  {
    switch (value)
    {
      case FACTOR_VALUE: return FACTOR;
      case RESPONSE_VALUE: return RESPONSE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private VariableGroup(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //VariableGroup
