package com.ecyrd.jspwiki.auth.user;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Andrew R. Jaquith
 */
public class AllTests extends TestCase
{
    public AllTests( String s )
    {
        super( s );
    }

    public static Test suite()
    {
        TestSuite suite = new TestSuite( "User profile and database tests" );
        suite.addTestSuite( UserProfileTest.class );
        suite.addTestSuite( JDBCUserDatabaseTest.class );
        suite.addTestSuite( XMLUserDatabaseTest.class );
        return suite;
    }
}
