package rithm.defaultcore;

import rithm.core.RiTHMTruthValue;

public class DefaultRiTHMTruthValue implements RiTHMTruthValue{
	String truthValue;
	public DefaultRiTHMTruthValue(String truthValue)
	{
		this.truthValue = truthValue;
	}
	public String getTruthValueDescription() {
		// TODO Auto-generated method stub
		return truthValue;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMTruthValue))
			return false;
		DefaultRiTHMTruthValue spec2= (DefaultRiTHMTruthValue) obj;
		
		return spec2.truthValue.equals(this.truthValue);
	}
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.truthValue.hashCode();
		return hashVal;
	}
	@Override
	public double getTimetamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimetamp(double ts) {
		// TODO Auto-generated method stub
		
	}
	
}
