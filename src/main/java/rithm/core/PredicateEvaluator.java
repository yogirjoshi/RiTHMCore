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
	abstract public void SetProgStateJson(String pState);
	abstract public PredicateState EvaluatePredicates();
	public boolean getPredicateValue(String predName)
	{
		return prState.getValue(predName);
	}
}
