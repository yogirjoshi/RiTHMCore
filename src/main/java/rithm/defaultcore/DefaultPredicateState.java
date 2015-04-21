package rithm.defaultcore;

import java.util.HashMap;

import rithm.core.PredicateState;

public class DefaultPredicateState implements PredicateState{
	protected HashMap<String, Boolean> predValues;
	protected String timeStamp;
	public DefaultPredicateState()
	{
		predValues = new HashMap<String, Boolean>();
		timeStamp="0";
	}
	public HashMap<String, Boolean> getpredValues()
	{
		return predValues;
	}
	public String gettimeStamp()
	{
		return timeStamp;
	}
	public DefaultPredicateState(DefaultPredicateState dpS)
	{
		this.predValues = new HashMap<String, Boolean>();
		for(String key: dpS.predValues.keySet())
		{
			this.predValues.put(key, dpS.predValues.get(key));
		}
	}
	
	public boolean setValue(String Name, boolean Value) {
		// TODO Auto-generated method stub
		if(!predValues.containsKey(Name))
		{
			predValues.put(Name, Value);
			return true;
		}
		return false;
	} 

	public boolean getValue(String Name) throws RuntimeException{
		// TODO Auto-generated method stub
		if(predValues.containsKey(Name))
			return predValues.get(Name);
		else
			throw new RuntimeException("No Predicate Value set for " + Name);
	}
	
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
	public String toString()
	{
		String retVal="";
		retVal+="---------------------------\n";
		for(String key : this.predValues.keySet())
		{
			retVal+=key + "=" + this.predValues.get(key).toString() + "\n";
		}
		retVal+="---------------------------\n";
		return retVal;
	}
	public int hashCode(){
		int hashVal=0;
		for(String key: predValues.keySet())
		{
			hashVal+=key.hashCode();
			hashVal+=predValues.get(key).hashCode();
		}
		return hashVal;
	}
	@Override
	public void setTimestamp(double Value) {
		// TODO Auto-generated method stub
		this.timeStamp = Double.toString(Value);
	}
	
}
