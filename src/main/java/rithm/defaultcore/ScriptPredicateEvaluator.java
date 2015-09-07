package rithm.defaultcore;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

import javax.script.*;

import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

import java.util.Map;

import rithm.core.PredicateState;
import rithm.core.RitHMPredicate;

import org.luaj.vm2.LuaTable;
// TODO: Auto-generated Javadoc

/**
 * The Class ScriptPredicateEvaluator.
 */
public class ScriptPredicateEvaluator extends DefaultPredicateEvaluator{

/** The mgr. */
//	protected ArrayList<RiTHMPredicate> predList;
	protected ScriptEngineManager mgr;
	
	/** The engine. */
	protected ScriptEngine engine;
	
	/** The compiling engine. */
	protected Compilable compilingEngine;
	
	/** The cscript. */
	protected CompiledScript cscript;
	
	/** The script lang. */
	protected String scriptLang;
	
	/**
	 * Instantiates a new script predicate evaluator.
	 *
	 * @param evalScript the eval script
	 * @param scriptLang the script lang
	 * @param isFile the is file
	 */
	public ScriptPredicateEvaluator(String evalScript, String scriptLang, boolean isFile)
	{
		super();
		this.scriptLang = scriptLang;
//		this.predList = predList;
		mgr = new ScriptEngineManager();
		engine = mgr.getEngineByName(scriptLang);
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
			if(isFile)
			{
				br = new BufferedReader(new FileReader(evalScript));
			}
			else
			{
				InputStream is = new ByteArrayInputStream(evalScript.getBytes());
				br = new BufferedReader(new InputStreamReader(is));
			}
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
			if(scriptLang.equals("JavaScript"))
			{
				Bindings obj = (Bindings)cscript.eval(currBindings);
				for(String key1: obj.keySet())
					this.prState.setValue(key1, Boolean.valueOf(obj.get(key1).toString()));
			}
			if(scriptLang.equals("luaj"))
			{
				LuaTable luaTab = (LuaTable) cscript.eval(currBindings);
				for(LuaValue luaKey: luaTab.keys())
					if(Boolean.valueOf(luaTab.get(luaKey).toString()))
						this.prState.setValue(luaKey.toString(), Boolean.valueOf(luaTab.get(luaKey).toString()));
			}
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
		}
		return prState;
	}
	

}
