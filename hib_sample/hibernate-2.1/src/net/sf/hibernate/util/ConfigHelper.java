// $Id: ConfigHelper.java,v 1.1 2004/06/26 02:33:28 steveebersole Exp $
package net.sf.hibernate.util;

import net.sf.hibernate.HibernateException;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A simple class to centralize logic needed to locate config files on the system.
 * 
 * @author Steve
 */
public class ConfigHelper {
	private static final Log log = LogFactory.getLog(ConfigHelper.class);

	/** Try to locate a local URL representing the incoming path.  The first attempt
	 * assumes that the incoming path is an actual URL string (file://, etc).  If this
	 * does not work, then the next attempts try to locate this UURL as a java system
	 * resource.
	 *
	 * @param path The path representing the config location.
	 * @return An appropriate URL or null.
	 */
	public static final URL locateConfig(final String path) {
		try {
			return new URL(path);
		}
		catch(MalformedURLException e) {
			return findAsResource(path);
		}
	}

	/** Try to locate a local URL representing the incoming path.  This method <b>only</b>
	 * attempts to locate this UURL as a java system resource.
	 *
	 * @param path The path representing the config location.
	 * @return An appropriate URL or null.
	 */
	public static final URL findAsResource(final String path) {
		URL url = null;

		// First, try to locate this resource through the current
		// context classloader.
		url = Thread.currentThread().getContextClassLoader().getResource(path);
		if (url != null)
			return url;

		// Next, try to locate this resource through this class's classloader
		url = ConfigHelper.class.getClassLoader().getResource(path);
		if (url != null)
			return url;

		// Next, try to locate this resource through the system classloader
		url = ClassLoader.getSystemClassLoader().getResource(path);

		// Anywhere else we should look?
		return url;
	}

	/** Open an InputStream to the URL represented by the incoming path.  First makes a call
	 * to {@link #locateConfig(java.lang.String)} in order to find an appropriate URL.
	 * {@link java.net.URL#openStream()} is then called to obtain the stream.
	 *
	 * @param path The path representing the config location.
	 * @return An input stream to the requested config resource.
	 * @throws HibernateException Unable to open stream to that resource.
	 */
	public static final InputStream getConfigStream(final String path) throws HibernateException {
		final URL url = ConfigHelper.locateConfig(path);

		if (url == null) {
			String msg = "Unable to locate config file: " + path;
			log.fatal(msg);
			throw new HibernateException(msg);
		}

		try {
			return url.openStream();
        }
		catch(IOException e) {
	        throw new HibernateException("Unable to open config file: " + path, e);
        }
	}

	/** Open an Reader to the URL represented by the incoming path.  First makes a call
	 * to {@link #locateConfig(java.lang.String)} in order to find an appropriate URL.
	 * {@link java.net.URL#openStream()} is then called to obtain a stream, which is then
	 * wrapped in a Reader.
	 *
	 * @param path The path representing the config location.
	 * @return An input stream to the requested config resource.
	 * @throws HibernateException Unable to open reader to that resource.
	 */
	public static final Reader getConfigStreamReader(final String path) throws HibernateException {
		return new InputStreamReader( getConfigStream(path) );
	}

	/** Loads a properties instance based on the data at the incoming config location.
	 *
	 * @param path The path representing the config location.
	 * @return The loaded properties instance.
	 * @throws HibernateException Unable to load properties from that resource.
	 */
	public static final Properties getConfigProperties(String path) throws HibernateException {
		try {
			Properties properties = new Properties();
			properties.load( getConfigStream(path) );
			return properties;
		}
		catch(IOException e) {
			throw new HibernateException("Unable to load properties from specified config file: " + path, e);
		}
	}
}
