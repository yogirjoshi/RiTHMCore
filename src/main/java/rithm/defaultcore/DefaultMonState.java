package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.MonState;
import rithm.core.PredicateState;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultMonState.
 */
public class DefaultMonState implements MonState{
	
	/** The state. */
	protected String state;
	 
	/** The valuation. */
	protected String valuation;
	
	/** The transitions. */
	protected HashMap<PredicateState, MonState> transitions;
	
	/**
	 * Instantiates a new default mon state.
	 *
	 * @param state the state
	 * @param valuation the valuation
	 */
	public DefaultMonState(DefaultMonState ds){
		this.state = ds.state;
		this.valuation = ds.valuation;
		this.transitions = ds.transitions;
	}
	public DefaultMonState(String state, String valuation)
	{
		this.state = state;
		this.valuation = valuation;
		transitions = new HashMap<PredicateState, MonState>();
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}
	
	/**
	 * Gets the valuation.
	 *
	 * @return the valuation
	 */
	public String getValuation()
	{
		return valuation;
	}
	
	/**
	 * Sets the valuation.
	 *
	 * @param valuation the new valuation
	 */
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
/**
 * Sets the valuation.
 *
 * @param Valuation the valuation
 */
//	}
	public void SetValuation(String Valuation)
	{
		this.valuation = Valuation;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.MonState#GetNextMonState(rithm.core.PredicateState)
	 */
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
	
	/**
	 * Sets the transition.
	 *
	 * @param ps the ps
	 * @param ms the ms
	 * @return true, if successful
	 */
	public boolean SetTransition(PredicateState ps, MonState ms)
	{
		transitions.put(ps, ms);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return this.state.hashCode();
	}
}
