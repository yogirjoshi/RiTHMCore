package rithm.defaultcore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.script.*;

import java.util.Map;

import rithm.core.PredicateState;
import rithm.core.RiTHMPredicate;
import jdk.nashorn.api.scripting.*;
public class JSPredicateEvaluator extends DefaultPredicateEvaluator{
	protected ArrayList<RiTHMPredicate> predList;
	protected ScriptEngineManager mgr;
	protected ScriptEngine engine;
	protected Compilable compilingEngine;
	protected CompiledScript cscript;
	public JSPredicateEvaluator(String filePath, ArrayList<RiTHMPredicate> predList)
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
//		for(RiTHMPredicate pred: predList)
//		{
//			currBindings.put(pred.getTextDescription() + "Val","");
//		}
		try
		{
			ScriptObjectMirror obj = (ScriptObjectMirror)cscript.eval(currBindings);
			for(String key1: obj.getOwnKeys(true))
			{
				System.out.println(obj.getMember(key1));
			}
			for(RiTHMPredicate pred: predList)
			{
				System.out.println("\"" + pred.getTextDescription() + "Val" + "\"");
//				cscript.getEngine().get("\"" + pred.getTextDescription() + "Val" + "\"");
//				Object obj = inv.invokeFunction("eval" + pred.getTextDescription());

	//			prState.setValue(pred.getTextDescription(),Boolean.parseBoolean(obj.toString()));
	//			String funcName = "eval" + pred.getTextDescription();
	//			invocable.invoke()
	//			prState.setValue( pred.getTextDescription(), Value);
			}
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
		}
//		prState.setTimestamp(Double.parseDouble(pState.getValue("timestamp")));
		return prState;
	}
	

}
