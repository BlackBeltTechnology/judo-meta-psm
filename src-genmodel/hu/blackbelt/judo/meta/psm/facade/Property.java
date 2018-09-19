/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getPath <em>Path</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderIndex <em>Order Index</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderDirection <em>Order Direction</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#isViewable <em>Viewable</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(DataType)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_DataType()
     * @model required="true" derived="true"
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getDataType <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_Path()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.NavigationExpression" required="true"
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

    /**
     * Returns the value of the '<em><b>Function</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.facade.Function}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.facade.Function
     * @see #setFunction(Function)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_Function()
     * @model required="true"
     * @generated
     */
    Function getFunction();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getFunction <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.facade.Function
     * @see #getFunction()
     * @generated
     */
    void setFunction(Function value);

    /**
     * Returns the value of the '<em><b>Order Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order Index</em>' attribute.
     * @see #setOrderIndex(int)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_OrderIndex()
     * @model
     * @generated
     */
    int getOrderIndex();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderIndex <em>Order Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order Index</em>' attribute.
     * @see #getOrderIndex()
     * @generated
     */
    void setOrderIndex(int value);

    /**
     * Returns the value of the '<em><b>Order Direction</b></em>' attribute.
     * The default value is <code>"ASC"</code>.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.facade.OrderDirection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Order Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Order Direction</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.facade.OrderDirection
     * @see #setOrderDirection(OrderDirection)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_OrderDirection()
     * @model default="ASC"
     * @generated
     */
    OrderDirection getOrderDirection();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderDirection <em>Order Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Order Direction</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.facade.OrderDirection
     * @see #getOrderDirection()
     * @generated
     */
    void setOrderDirection(OrderDirection value);

    /**
     * Returns the value of the '<em><b>Filterable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filterable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filterable</em>' attribute.
     * @see #setFilterable(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_Filterable()
     * @model default="true" required="true"
     * @generated
     */
    boolean isFilterable();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#isFilterable <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filterable</em>' attribute.
     * @see #isFilterable()
     * @generated
     */
    void setFilterable(boolean value);

    /**
     * Returns the value of the '<em><b>Viewable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Viewable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Viewable</em>' attribute.
     * @see #setViewable(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_Viewable()
     * @model default="true" required="true"
     * @generated
     */
    boolean isViewable();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#isViewable <em>Viewable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Viewable</em>' attribute.
     * @see #isViewable()
     * @generated
     */
    void setViewable(boolean value);

} // Property
