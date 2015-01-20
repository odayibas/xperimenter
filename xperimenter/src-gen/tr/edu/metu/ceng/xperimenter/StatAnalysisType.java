/**
 */
package tr.edu.metu.ceng.xperimenter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stat Analysis Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getStatAnalysisType()
 * @model
 * @generated
 */
public enum StatAnalysisType implements Enumerator
{
  /**
   * The '<em><b>HYPOTESTING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HYPOTESTING_VALUE
   * @generated
   * @ordered
   */
  HYPOTESTING(0, "HYPOTESTING", "HYPOTESTING"),

  /**
   * The '<em><b>ANOVA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANOVA_VALUE
   * @generated
   * @ordered
   */
  ANOVA(1, "ANOVA", "ANOVA"),

  /**
   * The '<em><b>MANOVA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANOVA_VALUE
   * @generated
   * @ordered
   */
  MANOVA(2, "MANOVA", "MANOVA"),

  /**
   * The '<em><b>CONFINTERVAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFINTERVAL_VALUE
   * @generated
   * @ordered
   */
  CONFINTERVAL(3, "CONFINTERVAL", "CONFINTERVAL");

  /**
   * The '<em><b>HYPOTESTING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HYPOTESTING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HYPOTESTING
   * @model
   * @generated
   * @ordered
   */
  public static final int HYPOTESTING_VALUE = 0;

  /**
   * The '<em><b>ANOVA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANOVA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANOVA
   * @model
   * @generated
   * @ordered
   */
  public static final int ANOVA_VALUE = 1;

  /**
   * The '<em><b>MANOVA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MANOVA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANOVA
   * @model
   * @generated
   * @ordered
   */
  public static final int MANOVA_VALUE = 2;

  /**
   * The '<em><b>CONFINTERVAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONFINTERVAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONFINTERVAL
   * @model
   * @generated
   * @ordered
   */
  public static final int CONFINTERVAL_VALUE = 3;

  /**
   * An array of all the '<em><b>Stat Analysis Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StatAnalysisType[] VALUES_ARRAY =
    new StatAnalysisType[]
    {
      HYPOTESTING,
      ANOVA,
      MANOVA,
      CONFINTERVAL,
    };

  /**
   * A public read-only list of all the '<em><b>Stat Analysis Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StatAnalysisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Stat Analysis Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StatAnalysisType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StatAnalysisType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stat Analysis Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StatAnalysisType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StatAnalysisType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stat Analysis Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StatAnalysisType get(int value)
  {
    switch (value)
    {
      case HYPOTESTING_VALUE: return HYPOTESTING;
      case ANOVA_VALUE: return ANOVA;
      case MANOVA_VALUE: return MANOVA;
      case CONFINTERVAL_VALUE: return CONFINTERVAL;
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
  private StatAnalysisType(int value, String name, String literal)
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
  
} //StatAnalysisType
