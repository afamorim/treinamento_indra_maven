package es.indra.treinamento.maven.terceiroDia;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    public void testVerdadeApp()
    {
    	App app = new App();
    	if (app.validaTeste(true).equals("TESTE VALIDADO"))
    		assertTrue( true );
    	else
    		assertFalse(false);
    }
    
    public void testeMentiraApp(){
    	App app = new App();
    	if (app.validaTeste(false).equals("TESTE NÃO VALIDADO"))
    		assertTrue( true );
    	else
    		assertFalse(false);
    }
}
