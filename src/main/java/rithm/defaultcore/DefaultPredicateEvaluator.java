package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;

import com.google.gson.Gson;


public class DefaultPredicateEvaluator extends PredicateEvaluator{

	@Override
	public void setProgStateJson(String pState) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		DefaultProgramState dpState = gson.fromJson(pState, DefaultProgramState.class );
		this.pState = dpState;
	}
	public void setProgState(DefaultProgramState pState) {
		// TODO Auto-generated method stub
		this.pState = pState;
	}
	@Override
	public PredicateState evaluatePredicates() {
		// TODO Auto-generated method stub
		this.prState = new DefaultPredicateState();
		DefaultProgramState dpstate   = (DefaultProgramState)pState;
		DefaultPredicateState dprstate = (DefaultPredicateState) prState;
		HashMap<String, String> dictProg = dpstate.field_dictionary;
		dprstate.timeStamp = dpstate.field_dictionary.get("timestamp");
		for(String key: dictProg.keySet())
		{
			if(dpstate.getDictionary().get(key).equals(Integer.toString(1)))
				dprstate.setValue(key, true);
//			else
//				dprstate.SetValue(key, false);
		}
//		if(dpstate.GetVal("trying").equals(Integer.toString(1)))
//			dprstate.SetValue("trying", true);
//		if(dpstate.GetVal("granted").equals(Integer.toString(1)))
//			dprstate.SetValue("granted", true);
		return this.prState;
	}

}
