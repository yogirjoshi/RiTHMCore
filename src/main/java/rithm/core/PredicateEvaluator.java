package rithm.core;


public abstract class PredicateEvaluator{

	protected ProgState pState;
	protected PredicateState prState; 
	public PredicateEvaluator()
	{
	}
	public void SetProgStateObj(ProgState pState)
	{
		this.pState = pState;
	}
	abstract public void setProgStateJson(String pState);
	abstract public PredicateState evaluatePredicates();
	public boolean getPredicateValue(String predName)
	{
		return prState.getValue(predName);
	}
}
