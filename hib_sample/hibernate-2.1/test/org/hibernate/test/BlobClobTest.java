/*
 * Created on 28-Dec-2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.hibernate.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import net.sf.hibernate.Hibernate;
import net.sf.hibernate.Session;
import net.sf.hibernate.dialect.HSQLDialect;
import net.sf.hibernate.dialect.MySQLDialect;
import net.sf.hibernate.dialect.OracleDialect;
import net.sf.hibernate.dialect.PostgreSQLDialect;
import net.sf.hibernate.dialect.TimesTenDialect;

/**
 * @author max
 *
 * 
 */
public class BlobClobTest extends TestCase {

    /**
     * @param x
     */
    public BlobClobTest(String x) {
        super(x);
        // TODO Auto-generated constructor stub
    }

    public void testBlobClob() throws Exception {
        
        if (
                getDialect() instanceof MySQLDialect ||
                getDialect() instanceof PostgreSQLDialect ||
                getDialect() instanceof HSQLDialect ||
                getDialect() instanceof OracleDialect ||
                getDialect() instanceof TimesTenDialect
            ) return;

        Session s = openSession();
        Blobber b = new Blobber();
        b.setBlob( Hibernate.createBlob( "foo/bar/baz".getBytes() ) );
        b.setClob( Hibernate.createClob("foo/bar/baz") );
        s.save(b);
        //s.refresh(b);
        //assertTrue( b.getClob() instanceof ClobImpl );
        s.flush();
        s.refresh(b);
        //b.getBlob().setBytes( 2, "abc".getBytes() );
        b.getClob().getSubString(2, 3);
        //b.getClob().setString(2, "abc");
        s.flush();
        s.connection().commit();
        s.close();

        s = openSession();
        b = (Blobber) s.load( Blobber.class, new Integer( b.getId() ) );
        Blobber b2 = new Blobber();
        s.save(b2);
        b2.setBlob( b.getBlob() );
        b.setBlob(null);
        //assertTrue( b.getClob().getSubString(1, 3).equals("fab") );
        b.getClob().getSubString(1, 6);
        //b.getClob().setString(1, "qwerty");
        s.flush();
        s.connection().commit();
        s.close();

        s = openSession();
        b = (Blobber) s.load( Blobber.class, new Integer( b.getId() ) );
        b.setClob( Hibernate.createClob("xcvfxvc xcvbx cvbx cvbx cvbxcvbxcvbxcvb") );
        s.flush();
        s.connection().commit();
        s.close();

        s = openSession();
        b = (Blobber) s.load( Blobber.class, new Integer( b.getId() ) );
        assertTrue( b.getClob().getSubString(1, 7).equals("xcvfxvc") );
        //b.getClob().setString(5, "1234567890");
        s.flush();
        s.connection().commit();
        s.close();


        /*InputStream is = getClass().getClassLoader().getResourceAsStream("jdbc20.pdf");
        s = sessionsopenSession();
        b = (Blobber) s.load( Blobber.class, new Integer( b.getId() ) );
        System.out.println( is.available() );
        int size = is.available();
        b.setBlob( Hibernate.createBlob( is, is.available() ) );
        s.flush();
        s.connection().commit();
        ResultSet rs = s.connection().createStatement().executeQuery("select datalength(blob_) from blobber where id=" + b.getId() );
        rs.next();
        assertTrue( size==rs.getInt(1) );
        rs.close();
        s.close();

        s = sessionsopenSession();
        b = (Blobber) s.load( Blobber.class, new Integer( b.getId() ) );
        File f = new File("C:/foo.pdf");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        Blob blob = b.getBlob();
        byte[] bytes = blob.getBytes( 1, (int) blob.length() );
        System.out.println( bytes.length );
        fos.write(bytes);
        fos.flush();
        fos.close();
        s.close();*/

    }

    /* (non-Javadoc)
     * @see org.hibernate.test.TestCase#getMappings()
     */
    protected String[] getMappings() {
        return new String[] { "Blobber.hbm.xml"};
    }

    /**
     * @return
     */
    public static Test suite() {
            return new TestSuite(BlobClobTest.class);
    }

}
