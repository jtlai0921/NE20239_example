//$Id: JCSCacheProvider.java,v 1.4 2004/12/02 00:45:01 steveebersole Exp $
package net.sf.hibernate.cache;

import java.util.Properties;

/**
 * @author Gavin King
 * @deprecated JCS support will be removed in version 2.1.1
 */
public class JCSCacheProvider implements CacheProvider {

	public Cache buildCache(String regionName, Properties properties)
		throws CacheException {
		return new JCSCache(regionName, properties);
	}

	public long nextTimestamp() {
		return Timestamper.next();
	}

	/**
	 * Callback to perform any necessary initialization of the underlying cache implementation
	 * during SessionFactory construction.
	 *
	 * @param properties current configuration settings.
	 */
	public void start(Properties properties) throws CacheException {
	}

	/**
	 * Callback to perform any necessary cleanup of the underlying cache implementation
	 * during SessionFactory.close().
	 */
	public void stop() {
	}

}
