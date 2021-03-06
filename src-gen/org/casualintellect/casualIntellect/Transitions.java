/**
 * generated by Xtext 2.9.1
 */
package org.casualintellect.casualIntellect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.casualintellect.casualIntellect.Transitions#getList <em>List</em>}</li>
 *   <li>{@link org.casualintellect.casualIntellect.Transitions#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.casualintellect.casualIntellect.CasualIntellectPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link org.casualintellect.casualIntellect.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see org.casualintellect.casualIntellect.CasualIntellectPackage#getTransitions_List()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getList();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.casualintellect.casualIntellect.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.casualintellect.casualIntellect.CasualIntellectPackage#getTransitions_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Transitions
