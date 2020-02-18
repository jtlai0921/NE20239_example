//$Id: JDBCExceptionReporter.java,v 1.9 2004/11/11 20:42:35 steveebersole Exp $
package net.sf.hibernate.util;

import java.sql.SQLException;
import java.sql.SQLWarning;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class JDBCExceptionReporter {
	
	private static final Log log = LogFactory.getLog(JDBCExceptionReporter.class);
	public static final String DEFAULT_EXCEPTION_MSG = "SQL Exception";
	public static final String DEFAULT_WARNING_MSG = "SQL Warning";

	private JDBCExceptionReporter() {}

	public static void logWarnings(SQLWarning warning) {
		logWarnings(warning, null);
	}

	public static void logWarnings(SQLWarning warning, String message) {
		if ( log.isWarnEnabled() ) {
			if ( log.isDebugEnabled() && warning != null ) {
				message = StringHelper.isNotEmpty(message) ? message : DEFAULT_WARNING_MSG;
				log.debug( message, warning );
			}
			while (warning != null) {
				StringBuffer buf = new StringBuffer(30)
				        .append( "SQL Warning: ")
						.append( warning.getErrorCode() )
						.append( ", SQLState: ")
						.append( warning.getSQLState() );
				log.warn( buf.toString() );
				log.warn( warning.getMessage() );
				warning = warning.getNextWarning();
			}
		}
	}

	public static void logExceptions(SQLException ex) {
		logExceptions(ex, null);
	}

	public static void logExceptions(SQLException ex, String message) {
		if ( log.isErrorEnabled() ) {
			if ( log.isDebugEnabled() ) {
				message = StringHelper.isNotEmpty(message) ? message : DEFAULT_EXCEPTION_MSG;
				log.debug( message, ex );
			}
			while (ex != null) {
				StringBuffer buf = new StringBuffer(30)
						.append( "SQL Error: " )
				        .append( ex.getErrorCode() )
				        .append( ", SQLState: " )
				        .append( ex.getSQLState() );
				log.warn( buf.toString() );
				log.error( ex.getMessage() );
				ex = ex.getNextException();
			}
		}
	}

}






