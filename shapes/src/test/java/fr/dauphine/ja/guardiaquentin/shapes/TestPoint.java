package fr.dauphine.ja.guardiaquentin.shapes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestPoint 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public static void main( String[] args )
    {
    	Point p=new Point();
    }
    public TestPoint( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestPoint.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
