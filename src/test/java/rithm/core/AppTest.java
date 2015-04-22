package rithm.core;

import java.util.ArrayList;

import javax.script.Bindings;

import rithm.defaultcore.DefaultProgramState;
import rithm.defaultcore.DefaultRiTHMPredicate;
import rithm.defaultcore.ScriptPredicateEvaluator;
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
//    public void testJS1()
//    {
//    	ArrayList<RiTHMPredicate> predList = new ArrayList<RiTHMPredicate>();
//    	predList.add(new DefaultRiTHMPredicate("X"));
//    	predList.add(new DefaultRiTHMPredicate("Y"));
//        ScriptPredicateEvaluator jsEvaluator = new ScriptPredicateEvaluator("/home/y2joshi/workspace/RiTHMCore/src/test/java/rithm/core/test.js", predList, "JavaScript");
//        DefaultProgramState pState = new DefaultProgramState(0);
//        pState.setValue("x", "5");
//        pState.setValue("y", "4");
//        jsEvaluator.setProgState(pState);
//        jsEvaluator.evaluatePredicates();
//    }
    public void testLua1()
    {
    	ArrayList<RiTHMPredicate> predList = new ArrayList<RiTHMPredicate>();
    	predList.add(new DefaultRiTHMPredicate("X"));
    	predList.add(new DefaultRiTHMPredicate("Y"));
        ScriptPredicateEvaluator jsEvaluator = new ScriptPredicateEvaluator("/home/y2joshi/workspace/LuaPredicateScripts/src/main.lua", predList, "luaj");
        DefaultProgramState pState = new DefaultProgramState(0);
        pState.setValue("x", "5");
        pState.setValue("y", "4");
        jsEvaluator.setProgState(pState);
        PredicateState ps = jsEvaluator.evaluatePredicates();
        System.out.println(ps);
    }
    ///home/y2joshi/workspace/LuaPredicateScripts/src/main.lua
}
