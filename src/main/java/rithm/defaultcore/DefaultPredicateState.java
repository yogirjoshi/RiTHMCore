package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.PredicateState;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultPredicateState.
 */
public class DefaultPredicateState implements PredicateState{
	
	/** The pred values. */
	protected HashMap<String, Boolean> predValues;
	
	/** The time stamp. */
	protected String timeStamp;
	
	/**
	 * Instantiates a new default predicate state.
	 */
	public DefaultPredicateState()
	{
		predValues = new HashMap<String, Boolean>();
		timeStamp="0";
	}
	
	/**
	 * Gets the pred values.
	 *
	 * @return the pred values
	 */
	public HashMap<String, Boolean> getpredValues()
	{
		return predValues;
	}
	
	/**
	 * Gets the time stamp.
	 *
	 * @return the time stamp
	 */
	public String gettimeStamp()
	{
		return timeStamp;
	}
	
	/**
	 * Instantiates a new default predicate state.
	 *
	 * @param dpS the dp s
	 */
	public DefaultPredicateState(DefaultPredicateState dpS)
	{
		this.predValues = new HashMap<String, Boolean>();
		for(String key: dpS.predValues.keySet())
		{
			this.predValues.put(key, dpS.predValues.get(key));
		}
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.PredicateState#setValue(java.lang.String, boolean)
	 */
	public boolean setValue(String Name, boolean Value) {
		// TODO Auto-generated method stub
		if(!predValues.containsKey(Name))
		{
			predValues.put(Name, Value);
			return true;
		}
		return false;
	} 

	/* (non-Javadoc)
	 * @see rithm.core.PredicateState#getValue(java.lang.String)
	 */
	public boolean getValue(String Name) throws RuntimeException{
		// TODO Auto-generated method stub
		if(predValues.containsKey(Name))
			return predValues.get(Name);
		else
			return false;
//			throw new RuntimeException("No Predicate Value set for " + Name);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultPredicateState))
			return false;
		DefaultPredicateState dps2 = (DefaultPredicateState) obj;
		if(this.predValues.size() != dps2.predValues.size())
			return false;
		for(String key: this.predValues.keySet())
		{
			if(dps2.predValues.containsKey(key))
			{
				if(dps2.predValues.get(key) != this.predValues.get(key))
					return false;
			}
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String retVal="";
		retVal+="---------------------------\n";
		for(String key : this.predValues.keySet())
		{
			retVal+=key + "=" + this.predValues.get(key).toString() + "\n";
		}
		retVal+= "timestamp =" + this.timeStamp;
		retVal+="---------------------------\n";
		return retVal;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode(){
		int hashVal=0;
		for(String key: predValues.keySet())
		{
			hashVal+=key.hashCode();
			hashVal+=predValues.get(key).hashCode();
		}
		return hashVal;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.PredicateState#setTimestamp(double)
	 */
	@Override
	public void setTimestamp(double Value) {
		// TODO Auto-generated method stub
		this.timeStamp = Double.toString(Value);
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.PredicateState#getTimestamp()
	 */
	@Override
	public double getTimestamp() {
		// TODO Auto-generated method stub
		return Double.parseDouble(timeStamp);
	}
	
}
