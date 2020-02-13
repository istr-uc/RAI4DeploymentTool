/**
 */
package PASYS_Metamodel.pasys.impl;

import PASYS_Metamodel.pasys.PasysPackage;
import PASYS_Metamodel.pasys.PersistenceServer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PersistenceServerImpl#getLogging <em>Logging</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PersistenceServerImpl#getPasswd <em>Passwd</em>}</li>
 *   <li>{@link PASYS_Metamodel.pasys.impl.PersistenceServerImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersistenceServerImpl extends PlatformServerImpl implements PersistenceServer {
	/**
	 * The default value of the '{@link #getLogging() <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogging()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogging() <em>Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogging()
	 * @generated
	 * @ordered
	 */
	protected String logging = LOGGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswd() <em>Passwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswd()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswd() <em>Passwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswd()
	 * @generated
	 * @ordered
	 */
	protected String passwd = PASSWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 9098;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PERSISTENCE_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogging() {
		return logging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogging(String newLogging) {
		String oldLogging = logging;
		logging = newLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PERSISTENCE_SERVER__LOGGING, oldLogging, logging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswd() {
		return passwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswd(String newPasswd) {
		String oldPasswd = passwd;
		passwd = newPasswd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PERSISTENCE_SERVER__PASSWD, oldPasswd, passwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PERSISTENCE_SERVER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PERSISTENCE_SERVER__LOGGING:
				return getLogging();
			case PasysPackage.PERSISTENCE_SERVER__PASSWD:
				return getPasswd();
			case PasysPackage.PERSISTENCE_SERVER__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.PERSISTENCE_SERVER__LOGGING:
				setLogging((String)newValue);
				return;
			case PasysPackage.PERSISTENCE_SERVER__PASSWD:
				setPasswd((String)newValue);
				return;
			case PasysPackage.PERSISTENCE_SERVER__PORT:
				setPort((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.PERSISTENCE_SERVER__LOGGING:
				setLogging(LOGGING_EDEFAULT);
				return;
			case PasysPackage.PERSISTENCE_SERVER__PASSWD:
				setPasswd(PASSWD_EDEFAULT);
				return;
			case PasysPackage.PERSISTENCE_SERVER__PORT:
				setPort(PORT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.PERSISTENCE_SERVER__LOGGING:
				return LOGGING_EDEFAULT == null ? logging != null : !LOGGING_EDEFAULT.equals(logging);
			case PasysPackage.PERSISTENCE_SERVER__PASSWD:
				return PASSWD_EDEFAULT == null ? passwd != null : !PASSWD_EDEFAULT.equals(passwd);
			case PasysPackage.PERSISTENCE_SERVER__PORT:
				return port != PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logging: ");
		result.append(logging);
		result.append(", passwd: ");
		result.append(passwd);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //PersistenceServerImpl
