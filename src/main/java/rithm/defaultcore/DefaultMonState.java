package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.MonState;
import rithm.core.PredicateState;

public class DefaultMonState implements MonState{
	protected String state;
	protected String valuation;
	protected HashMap<PredicateState, MonState> transitions;
	public DefaultMonState(String state, String valuation)
	{
		this.state = state;
		this.valuation = valuation;
		transitions = new HashMap<PredicateState, MonState>();
	}
	public String getState()
	{
		return state;
	}
	public String getValuation()
	{
		return valuation;
	}
	public void setValuation(String valuation)
	{
		this.valuation = valuation;
	}
//	public DefaultMonState(DefaultMonState ds)
//	{
//		this.State = ds.State;
//		this.Valuation = ds.Valuation;
//		this.Transitions = new HashMap<PredicateState, MonState>();
//		for(PredicateState ps: ds.Transitions.keySet())
//		{
//			this.Transitions.put(ps, ds.Transitions.get(ps));
//		}
//	}
	public void SetValuation(String Valuation)
	{
		this.valuation = Valuation;
	}
	public MonState GetNextMonState(PredicateState Pred) {
		// TODO Auto-generated method stub
		DefaultPredicateState dpState;
		if(Pred.getClass().isAssignableFrom(DefaultPredicateState.class))
		{
			dpState = (DefaultPredicateState)Pred;
			MonState m = transitions.get(dpState);
			return m;
		}
		return null;
	}
	public boolean SetTransition(PredicateState ps, MonState ms)
	{
		transitions.put(ps, ms);
		return true;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultMonState))
			return false;
		DefaultMonState state2 = (DefaultMonState) obj;
		if(state2.state.equals(this.state))
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return this.state.hashCode();
	}
}
