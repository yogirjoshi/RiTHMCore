package rithm.defaultcore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.script.*;

import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

import java.util.Map;

import rithm.core.PredicateState;
import rithm.core.RiTHMPredicate;

import org.luaj.vm2.LuaTable;
public class ScriptPredicateEvaluator extends DefaultPredicateEvaluator{
	protected ArrayList<RiTHMPredicate> predList;
	protected ScriptEngineManager mgr;
	protected ScriptEngine engine;
	protected Compilable compilingEngine;
	protected CompiledScript cscript;
	protected String scriptLang;
	public ScriptPredicateEvaluator(String filePath, ArrayList<RiTHMPredicate> predList, String scriptLang)
	{
		super();
		this.scriptLang = scriptLang;
		this.predList = predList;
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
					this.prState.setValue(luaKey.toString(), Boolean.valueOf(luaTab.get(luaKey).toString()));
			}
//			System.out.println("Hi" + this.prState);
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
		}
		return prState;
	}
	

}
