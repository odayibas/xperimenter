/**
 */
package tr.edu.metu.ceng.xperimenter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visualization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.xperimenter.XperimenterPackage#getVisualizationType()
 * @model
 * @generated
 */
public enum VisualizationType implements Enumerator
{
  /**
   * The '<em><b>HISTOGRAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HISTOGRAM_VALUE
   * @generated
   * @ordered
   */
  HISTOGRAM(0, "HISTOGRAM", "HISTOGRAM"),

  /**
   * The '<em><b>SCATTERPLOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SCATTERPLOT_VALUE
   * @generated
   * @ordered
   */
  SCATTERPLOT(1, "SCATTERPLOT", "SCATTERPLOT");

  /**
   * The '<em><b>HISTOGRAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HISTOGRAM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HISTOGRAM
   * @model
   * @generated
   * @ordered
   */
  public static final int HISTOGRAM_VALUE = 0;

  /**
   * The '<em><b>SCATTERPLOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SCATTERPLOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SCATTERPLOT
   * @model
   * @generated
   * @ordered
   */
  public static final int SCATTERPLOT_VALUE = 1;

  /**
   * An array of all the '<em><b>Visualization Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VisualizationType[] VALUES_ARRAY =
    new VisualizationType[]
    {
      HISTOGRAM,
      SCATTERPLOT,
    };

  /**
   * A public read-only list of all the '<em><b>Visualization Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VisualizationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Visualization Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualizationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisualizationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visualization Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualizationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VisualizationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Visualization Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualizationType get(int value)
  {
    switch (value)
    {
      case HISTOGRAM_VALUE: return HISTOGRAM;
      case SCATTERPLOT_VALUE: return SCATTERPLOT;
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
  private VisualizationType(int value, String name, String literal)
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
  
} //VisualizationType
