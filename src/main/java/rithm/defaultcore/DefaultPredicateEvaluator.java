package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;

import com.google.gson.Gson;


// TODO: Auto-generated Javadoc
/**
 * The Class DefaultPredicateEvaluator.
 */
public class DefaultPredicateEvaluator extends PredicateEvaluator{

	/** The include false predicates. */
	boolean includeFalsePredicates;
	
	/**
	 * Instantiates a new default predicate evaluator.
	 */
	public DefaultPredicateEvaluator()
	{
		super();
		includeFalsePredicates = false;
	}
	
	/**
	 * Instantiates a new default predicate evaluator.
	 *
	 * @param includeFalsePredicates the include false predicates
	 */
	public DefaultPredicateEvaluator(boolean includeFalsePredicates)
	{
		super();
		this.includeFalsePredicates = includeFalsePredicates;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.PredicateEvaluator#setProgStateJson(java.lang.String)
	 */
	@Override
	public void setProgStateJson(String pState) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		DefaultProgramState dpState = gson.fromJson(pState, DefaultProgramState.class );
		this.pState = dpState;
	}
	
	/**
	 * Sets the prog state.
	 *
	 * @param pState the new prog state
	 */
	public void setProgState(DefaultProgramState pState) {
		// TODO Auto-generated method stub
		this.pState = pState;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.PredicateEvaluator#evaluatePredicates()
	 */
	@Override
	public PredicateState evaluatePredicates() {
		// TODO Auto-generated method stub
		this.prState = new DefaultPredicateState();
		DefaultProgramState dpstate   = (DefaultProgramState)pState;
		DefaultPredicateState dprstate = (DefaultPredicateState) prState;
		HashMap<String, String> dictProg = dpstate.field_dictionary;
		dprstate.timeStamp = Double.toString(dpstate.getTimestamp());
		for(String key: dictProg.keySet())
		{
			if(dpstate.getDictionary().get(key).equals(Integer.toString(1)))
				dprstate.setValue(key, true);
			else
				if(includeFalsePredicates)
					dprstate.setValue(key, false);
		}
//		if(dpstate.GetVal("trying").equals(Integer.toString(1)))
//			dprstate.SetValue("trying", true);
//		if(dpstate.GetVal("granted").equals(Integer.toString(1)))
//			dprstate.SetValue("granted", true);
		return this.prState;
	}

}
