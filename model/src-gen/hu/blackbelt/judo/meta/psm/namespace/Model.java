/**
 */
package hu.blackbelt.judo.meta.psm.namespace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Model#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Namespace
{
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"$MODEL_VERSION_PLACEHOLDER$"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getModel_Version()
	 * @model default="$MODEL_VERSION_PLACEHOLDER$" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.namespace.Model#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Model
