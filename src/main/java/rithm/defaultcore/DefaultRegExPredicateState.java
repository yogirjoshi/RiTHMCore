package rithm.defaultcore;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRegExPredicateState.
 */
public class DefaultRegExPredicateState extends DefaultPredicateState{

	/**
	 * Instantiates a new default reg ex predicate state.
	 */
	public DefaultRegExPredicateState()
	{
		super();
	}
	
	/**
	 * Instantiates a new default reg ex predicate state.
	 *
	 * @param dpState the dp state
	 */
	public DefaultRegExPredicateState(DefaultPredicateState dpState)
	{
		super();
		this.predValues = dpState.predValues;
		this.timeStamp = dpState.timeStamp;
	}
	
	/**
	 * Gets the predicate string.
	 *
	 * @return the predicate string
	 */
	public String getPredicateString()
	{
		StringBuffer retBuff = new StringBuffer();
		for(String key: this.predValues.keySet())
		{
			if(predValues.containsKey(key))
				if(predValues.get(key).equals("1"))
					retBuff.append(key);
				else
					retBuff.append("!" + key);
			else
				retBuff.append("!" + key);
			
			retBuff.append("&&");
		}
		retBuff.delete(retBuff.length()-2, retBuff.length()-2);
		return retBuff.toString();
	}
}
