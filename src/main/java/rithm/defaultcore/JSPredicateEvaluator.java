package rithm.defaultcore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.script.*;

import java.util.Map;

import rithm.core.PredicateState;
import rithm.core.RitHMPredicate;

// TODO: Auto-generated Javadoc
/**
 * The Class JSPredicateEvaluator.
 */
public class JSPredicateEvaluator extends DefaultPredicateEvaluator{
	
	/** The pred list. */
	protected ArrayList<RitHMPredicate> predList;
	
	/** The mgr. */
	protected ScriptEngineManager mgr;
	
	/** The engine. */
	protected ScriptEngine engine;
	
	/** The compiling engine. */
	protected Compilable compilingEngine;
	
	/** The cscript. */
	protected CompiledScript cscript;
	
	/**
	 * Instantiates a new JS predicate evaluator.
	 *
	 * @param filePath the file path
	 * @param predList the pred list
	 */
	public JSPredicateEvaluator(String filePath, ArrayList<RitHMPredicate> predList)
	{
		super();
		this.predList = predList;
		mgr = new ScriptEngineManager();
		engine = mgr.getEngineByName("JavaScript");
		Compilable compilingEngine;
		if(engine instanceof Compilable)
		{
			 compilingEngine = (Compilable) engine;
		}
		else
		{
			throw new RuntimeException("No Compilable JS engine found");
		}
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader(filePath));
			cscript = compilingEngine.compile(br);
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		catch (ScriptException se) {
			// TODO: handle exceptio
			System.out.println(se.getMessage());
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see rithm.defaultcore.DefaultPredicateEvaluator#evaluatePredicates()
	 */
	@Override
	public PredicateState evaluatePredicates() {
		// TODO Auto-generated method stub
		this.prState = new DefaultPredicateState();
		Iterator<Map.Entry<String, String>> piterator = this.pState.iterator();
		Bindings currBindings = engine.createBindings();
		while(piterator.hasNext())
		{
			String key = piterator.next().getKey();
			String Val = pState.getValue(key);
			currBindings.put(key, Val);
		}
		try
		{
			Bindings obj = (Bindings)cscript.eval(currBindings);
			for(String key1: obj.keySet())
				this.prState.setValue(key1, Boolean.valueOf(obj.get(key1).toString()));
//			System.out.println("Hi" + this.prState);
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
		}
//		if(pState.getValue("timestamp") != null)
//			prState.setTimestamp(Double.parseDouble(pState.getValue("timestamp")));
		return prState;
	}
	

}
