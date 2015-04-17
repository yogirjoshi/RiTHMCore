package rithm.defaultcore;

public class DefaultRegExPredicateState extends DefaultPredicateState{

	public DefaultRegExPredicateState()
	{
		super();
	}
	public DefaultRegExPredicateState(DefaultPredicateState dpState)
	{
		super();
		this.predValues = dpState.predValues;
		this.timeStamp = dpState.timeStamp;
	}
	public String getPredicateString()
	{
		StringBuffer retBuff = new StringBuffer();
		for(String key: this.predValues.keySet())
		{
			retBuff.append(key);
			retBuff.append("&&");
		}
		retBuff.delete(retBuff.length()-2, retBuff.length()-2);
		return retBuff.toString();
	}
}
