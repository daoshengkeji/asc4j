/**
 * 
 */
package net.odyssi.asc4j.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory class that creates JAX-RS client proxy instances for interacting
 * with the App Store Connect API
 * 
 *
 */
public class ServiceProxyFactory {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(ServiceProxyFactory.class);

	private static ServiceProxyFactory instance = null;

	protected ServiceProxyFactory() {

	}

	/**
	 * Returns a singleton instance of the factory
	 * 
	 * @return The factory instance
	 */
	synchronized public static ServiceProxyFactory getInstance() {
		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - start"); //$NON-NLS-1$
		}

		if (instance == null) {
			instance = new ServiceProxyFactory();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - end"); //$NON-NLS-1$
		}
		return instance;
	}

	/**
	 * Creates a JAX-RS client proxy instance for the given proxy class
	 * 
	 * @param proxyClass The client proxy class
	 * @return The client proxy
	 */
	public <T> T createServiceProxy(Class<T> proxyClass) {
		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>) - start"); //$NON-NLS-1$
		}

		// TODO Need authorization header

		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>) - Generating API client proxy... - proxyClass={}", proxyClass); //$NON-NLS-1$
		}

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(ASC4JConstants.API_ENDPOINT);
		ResteasyWebTarget webTarget = (ResteasyWebTarget) target;

		T clientProxy = webTarget.proxy(proxyClass);

		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>) - end"); //$NON-NLS-1$
		}
		return clientProxy;
	}
}
