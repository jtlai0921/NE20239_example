//$Id: SwarmCacheProvider.java,v 1.8 2004/12/02 00:45:01 steveebersole Exp $
package net.sf.hibernate.cache;

import java.util.Properties;

import net.sf.swarmcache.CacheConfiguration;
import net.sf.swarmcache.CacheConfigurationManager;
import net.sf.swarmcache.CacheFactory;
import net.sf.swarmcache.ObjectCache;

/**
 * Support for SwarmCache replicated cache. SwarmCache does not support
 * locking, so strict "read-write" semantics are unsupported.
 * 
 * @author Jason Carreira
 */
public class SwarmCacheProvider implements CacheProvider {

	private CacheFactory factory;

    public Cache buildCache(String regionName, Properties properties) throws CacheException {
        ObjectCache cache = factory.createCache(regionName);
        if (cache==null) {
	        throw new CacheException("SwarmCache did not create a cache: " + regionName);
        }
        return new SwarmCache(cache);
    }

    public long nextTimestamp() {
        return System.currentTimeMillis() / 100;
    }

	/**
	 * Callback to perform any necessary initialization of the underlying cache implementation
	 * during SessionFactory construction.
	 *
	 * @param properties current configuration settings.
	 */
	public void start(Properties properties) throws CacheException {
        CacheConfiguration config = CacheConfigurationManager.getConfig(properties);
        factory = new CacheFactory(config);
	}

	/**
	 * Callback to perform any necessary cleanup of the underlying cache implementation
	 * during SessionFactory.close().
	 */
	public void stop() {
		if (factory != null) {
			factory.shutdown();
			factory = null;
		}
	}
}