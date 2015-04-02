package rithm.defaultcore;

import rithm.core.RiTHMTruthValue;

public class DefaultRiTHMTimedTruthValue implements RiTHMTruthValue {

	String truthValue;
	double timeStamp;
	public DefaultRiTHMTimedTruthValue(String truthValue)
	{
		this.truthValue = truthValue;
	}
	public String getTruthValueDescription() {
		// TODO Auto-generated method stub
		return truthValue;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMTimedTruthValue))
			return false;
		DefaultRiTHMTimedTruthValue spec2= (DefaultRiTHMTimedTruthValue) obj;
		
		return spec2.truthValue.equals(this.truthValue) && this.timeStamp == spec2.timeStamp;
	}
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.truthValue.hashCode();
		return hashVal;
	}
}
