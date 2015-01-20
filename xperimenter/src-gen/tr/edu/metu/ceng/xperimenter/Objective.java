/**
 */
package tr.edu.metu.ceng.xperimenter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Objective</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getObjective()
 * @model
 * @generated
 */
public enum Objective implements Enumerator
{
  /**
   * The '<em><b>COMPARATIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARATIVE_VALUE
   * @generated
   * @ordered
   */
  COMPARATIVE(0, "COMPARATIVE", "COMPARATIVE"),

  /**
   * The '<em><b>SCREENING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCREENING_VALUE
   * @generated
   * @ordered
   */
  SCREENING(1, "SCREENING", "SCREENING"),

  /**
   * The '<em><b>RESPSURFACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESPSURFACE_VALUE
   * @generated
   * @ordered
   */
  RESPSURFACE(2, "RESPSURFACE", "RESPSURFACE");

  /**
   * The '<em><b>COMPARATIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPARATIVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARATIVE
   * @model
   * @generated
   * @ordered
   */
  public static final int COMPARATIVE_VALUE = 0;

  /**
   * The '<em><b>SCREENING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SCREENING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SCREENING
   * @model
   * @generated
   * @ordered
   */
  public static final int SCREENING_VALUE = 1;

  /**
   * The '<em><b>RESPSURFACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RESPSURFACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESPSURFACE
   * @model
   * @generated
   * @ordered
   */
  public static final int RESPSURFACE_VALUE = 2;

  /**
   * An array of all the '<em><b>Objective</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Objective[] VALUES_ARRAY =
    new Objective[]
    {
      COMPARATIVE,
      SCREENING,
      RESPSURFACE,
    };

  /**
   * A public read-only list of all the '<em><b>Objective</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Objective> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Objective</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Objective get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Objective result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Objective</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Objective getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Objective result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Objective</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Objective get(int value)
  {
    switch (value)
    {
      case COMPARATIVE_VALUE: return COMPARATIVE;
      case SCREENING_VALUE: return SCREENING;
      case RESPSURFACE_VALUE: return RESPSURFACE;
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
  private Objective(int value, String name, String literal)
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
  
} //Objective
