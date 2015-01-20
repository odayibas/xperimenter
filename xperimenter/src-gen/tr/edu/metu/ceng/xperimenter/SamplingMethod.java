/**
 */
package tr.edu.metu.ceng.xperimenter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sampling Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getSamplingMethod()
 * @model
 * @generated
 */
public enum SamplingMethod implements Enumerator
{
  /**
   * The '<em><b>RANDOMIZED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANDOMIZED_VALUE
   * @generated
   * @ordered
   */
  RANDOMIZED(0, "RANDOMIZED", "RANDOMIZED"),

  /**
   * The '<em><b>RANDOMIZEDBLOCK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANDOMIZEDBLOCK_VALUE
   * @generated
   * @ordered
   */
  RANDOMIZEDBLOCK(1, "RANDOMIZEDBLOCK", "RANDOMIZEDBLOCK"),

  /**
   * The '<em><b>FACTORIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FACTORIAL_VALUE
   * @generated
   * @ordered
   */
  FACTORIAL(2, "FACTORIAL", "FACTORIAL"),

  /**
   * The '<em><b>FRACFACTORIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRACFACTORIAL_VALUE
   * @generated
   * @ordered
   */
  FRACFACTORIAL(3, "FRACFACTORIAL", "FRACFACTORIAL"),

  /**
   * The '<em><b>CENTRALCOMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CENTRALCOMP_VALUE
   * @generated
   * @ordered
   */
  CENTRALCOMP(4, "CENTRALCOMP", "CENTRALCOMP");

  /**
   * The '<em><b>RANDOMIZED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RANDOMIZED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANDOMIZED
   * @model
   * @generated
   * @ordered
   */
  public static final int RANDOMIZED_VALUE = 0;

  /**
   * The '<em><b>RANDOMIZEDBLOCK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RANDOMIZEDBLOCK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANDOMIZEDBLOCK
   * @model
   * @generated
   * @ordered
   */
  public static final int RANDOMIZEDBLOCK_VALUE = 1;

  /**
   * The '<em><b>FACTORIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FACTORIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FACTORIAL
   * @model
   * @generated
   * @ordered
   */
  public static final int FACTORIAL_VALUE = 2;

  /**
   * The '<em><b>FRACFACTORIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FRACFACTORIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRACFACTORIAL
   * @model
   * @generated
   * @ordered
   */
  public static final int FRACFACTORIAL_VALUE = 3;

  /**
   * The '<em><b>CENTRALCOMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CENTRALCOMP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CENTRALCOMP
   * @model
   * @generated
   * @ordered
   */
  public static final int CENTRALCOMP_VALUE = 4;

  /**
   * An array of all the '<em><b>Sampling Method</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SamplingMethod[] VALUES_ARRAY =
    new SamplingMethod[]
    {
      RANDOMIZED,
      RANDOMIZEDBLOCK,
      FACTORIAL,
      FRACFACTORIAL,
      CENTRALCOMP,
    };

  /**
   * A public read-only list of all the '<em><b>Sampling Method</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SamplingMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Sampling Method</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SamplingMethod get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SamplingMethod result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sampling Method</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SamplingMethod getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SamplingMethod result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Sampling Method</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SamplingMethod get(int value)
  {
    switch (value)
    {
      case RANDOMIZED_VALUE: return RANDOMIZED;
      case RANDOMIZEDBLOCK_VALUE: return RANDOMIZEDBLOCK;
      case FACTORIAL_VALUE: return FACTORIAL;
      case FRACFACTORIAL_VALUE: return FRACFACTORIAL;
      case CENTRALCOMP_VALUE: return CENTRALCOMP;
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
  private SamplingMethod(int value, String name, String literal)
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
  
} //SamplingMethod
