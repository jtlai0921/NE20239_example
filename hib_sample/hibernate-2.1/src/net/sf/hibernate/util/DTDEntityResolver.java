//$Id: DTDEntityResolver.java,v 1.9 2005/01/26 21:59:33 oneovthafew Exp $
//Contributed by Markus Meissner
package net.sf.hibernate.util;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

public class DTDEntityResolver implements EntityResolver {
	
	Log log = LogFactory.getLog(DTDEntityResolver.class);
	
	private static final String URL = "http://hibernate.sourceforge.net/";
	
	public InputSource resolveEntity (String publicId, String systemId) {
		if ( systemId!=null && systemId.startsWith(URL) ) {
			log.debug("trying to locate " + systemId + " in classpath under net/sf/hibernate/");
			// Search for DTD
			String path = "net/sf/hibernate/" + systemId.substring( URL.length() );
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream dtdStream = classLoader==null ? 
					getClass().getResourceAsStream(path) :
					classLoader.getResourceAsStream(path);
			if (dtdStream==null) {
				log.debug(systemId + "not found in classpath");
				return null;
			}
			else {
				log.debug("found " + systemId + " in classpath");
				InputSource source = new InputSource(dtdStream);
				source.setPublicId(publicId);
				source.setSystemId(systemId);
				return source;
			}
		}
		else {
			// use the default behaviour
			return null;
		}
	}
	
}







