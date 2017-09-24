
package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

  public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
      assertTrue(new App().search(array, 0, "1"));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("a","b","c"));
      assertFalse(new App().search(array, 1,"c"));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array, 1,"0"));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1,"0"));
    }
    public void testEmptyString(){
	ArrayList<String> array = new ArrayList<>(Arrays.asList("a","b","c"));
	assertFalse(new App().search(array,1,""));
    }

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
