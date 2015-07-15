package rithm.core;

import javax.print.DocFlavor.STRING;


// TODO: Auto-generated Javadoc
/**
 * The Class PredicateEvaluator.
 */
public abstract class PredicateEvaluator implements RitHMPlugin{

	/** The p state. */
	protected ProgState pState;
	
	/** The pr state. */
	protected PredicateState prState; 
	protected String myName;
	
	/**
	 * Sets the prog state obj.
	 *
	 * @param pState the state
	 */
	
	public void SetProgStateObj(ProgState pState)
	{
		this.pState = pState;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		myName = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}

	/**
	 * Sets the prog state json.
	 *
	 * @param pState the new prog state json
	 */
	abstract public void setProgStateJson(String pState);
	
	/**
	 * Evaluate predicates.
	 *
	 * @return the predicate state
	 */
	abstract public PredicateState evaluatePredicates();
	
	/**
	 * Gets the predicate value.
	 *
	 * @param predName the pred name
	 * @return the predicate value
	 */
	public boolean getPredicateValue(String predName)
	{
		return prState.getValue(predName);
	}
}
