package rithm.core;

import java.util.ArrayList;

import rithm.defaultcore.DefaultProgramState;
import rithm.defaultcore.DefaultRiTHMPredicate;
import rithm.defaultcore.JSPredicateEvaluator;
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
    public void testApp()
    {
    	ArrayList<RiTHMPredicate> predList = new ArrayList<RiTHMPredicate>();
    	predList.add(new DefaultRiTHMPredicate("X"));
    	predList.add(new DefaultRiTHMPredicate("Y"));
        JSPredicateEvaluator jsEvaluator = new JSPredicateEvaluator("/home/y2joshi/workspace/RiTHMCore/src/test/java/rithm/core/test.js", predList);
        DefaultProgramState pState = new DefaultProgramState(0);
        pState.setValue("x", "5");
        pState.setValue("y", "4");
        jsEvaluator.setProgState(pState);
        jsEvaluator.evaluatePredicates();
    }
}
