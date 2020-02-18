//$Id: CacheTest.java,v 1.6 2005/01/07 09:59:29 maxcsaucdk Exp $
package org.hibernate.test;

import junit.framework.TestCase;
import net.sf.hibernate.cache.Cache;
import net.sf.hibernate.cache.CacheConcurrencyStrategy;
import net.sf.hibernate.cache.CacheProvider;
import net.sf.hibernate.cache.EhCacheProvider;
import net.sf.hibernate.cache.ReadWriteCache;
import net.sf.hibernate.cache.CacheConcurrencyStrategy.SoftLock;

public class CacheTest extends TestCase {
	
	public CacheTest(String arg0) {
		super(arg0);
	}
	
	public void testCaches() throws Exception {
		//doTestCache( new CoherenceCacheProvider() );
		doTestCache( new EhCacheProvider() );
	}
	
	public void doTestCache(CacheProvider cacheProvider) throws Exception {
        
        cacheProvider.start(System.getProperties());
		Cache cache = cacheProvider.buildCache( String.class.getName(), System.getProperties() );
		
		long longBefore = cache.nextTimestamp();
		
		Thread.sleep(15);
		
		long before = cache.nextTimestamp();
		
		Thread.sleep(15);
		
		//cache.setTimeout(1000);
		CacheConcurrencyStrategy ccs = new ReadWriteCache();
		ccs.setCache(cache);
		
		// cache something
		
		assertTrue( ccs.put("foo", "foo", before, null, null) );
		
		Thread.sleep(15);
		
		long after = cache.nextTimestamp();
		
		assertTrue( ccs.get("foo", longBefore)==null );
		assertTrue( ccs.get("foo", after).equals("foo") );
		
		assertTrue( !ccs.put("foo", "foo", before, null, null) );
		
		// update it:
		
		SoftLock lock = ccs.lock("foo", null);
		
		assertTrue( ccs.get("foo", after)==null );
		assertTrue( ccs.get("foo", longBefore)==null );
		
		assertTrue( !ccs.put("foo", "foo", before, null, null) );
		
		Thread.sleep(15);
		
		long whileLocked = cache.nextTimestamp();
		
		assertTrue( !ccs.put("foo", "foo", whileLocked, null, null) );
		
		Thread.sleep(15);
		
		ccs.release("foo", lock);
		
		assertTrue( ccs.get("foo", after)==null );
		assertTrue( ccs.get("foo", longBefore)==null );
		
		assertTrue( !ccs.put("foo", "bar", whileLocked, null, null) );
		assertTrue( !ccs.put("foo", "bar", after, null, null) );
		
		Thread.sleep(15);
		
		long longAfter = cache.nextTimestamp();
		
		assertTrue( ccs.put("foo", "baz", longAfter, null, null) );
		
		assertTrue( ccs.get("foo", after)==null );
		assertTrue( ccs.get("foo", whileLocked)==null );
		
		Thread.sleep(15);
		
		long longLongAfter = cache.nextTimestamp();
		
		assertTrue( ccs.get("foo", longLongAfter).equals("baz") );
		
		// update it again, with multiple locks:
		
		SoftLock lock1 = ccs.lock("foo", null);
		SoftLock lock2 = ccs.lock("foo", null);
		
		assertTrue( ccs.get("foo", longLongAfter)==null );
		
		Thread.sleep(15);
		
		whileLocked = cache.nextTimestamp();
		
		assertTrue( !ccs.put("foo", "foo", whileLocked, null, null) );
		
		Thread.sleep(15);
		
		ccs.release("foo", lock2);
		
		Thread.sleep(15);
		
		long betweenReleases = cache.nextTimestamp();
		
		assertTrue( !ccs.put("foo", "bar", betweenReleases, null, null) );
		assertTrue( ccs.get("foo", betweenReleases)==null );
		
		Thread.sleep(15);
		
		ccs.release("foo", lock1);
		
		assertTrue( !ccs.put("foo", "bar", whileLocked, null, null) );
		
		Thread.sleep(15);
		
		longAfter = cache.nextTimestamp();
		
		assertTrue( ccs.put("foo", "baz", longAfter, null, null) );
		assertTrue( ccs.get("foo", whileLocked)==null );
		
		Thread.sleep(15);
		
		longLongAfter = cache.nextTimestamp();
		
		assertTrue( ccs.get("foo", longLongAfter).equals("baz") );
		
	}
	
}






