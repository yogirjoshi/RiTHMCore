package rithm.defaultcore;

import rithm.core.RitHMTruthValue;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRiTHMTimedTruthValue.
 */
public class DefaultRiTHMTimedTruthValue implements RitHMTruthValue {

	/** The truth value. */
	String truthValue;
	
	/** The time stamp. */
	double timeStamp;
	
	/**
	 * Instantiates a new default ri thm timed truth value.
	 *
	 * @param truthValue the truth value
	 */
	public DefaultRiTHMTimedTruthValue(String truthValue)
	{
		this.truthValue = truthValue;
	}
	
	/**
	 * Instantiates a new default ri thm timed truth value.
	 *
	 * @param truthValue the truth value
	 * @param timestamp the timestamp
	 */
	public DefaultRiTHMTimedTruthValue(String truthValue, double timestamp)
	{
		this.truthValue = truthValue;
		this.timeStamp = timestamp;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMTruthValue#getTruthValueDescription()
	 */
	public String getTruthValueDescription() {
		// TODO Auto-generated method stub
		return truthValue;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMTimedTruthValue))
			return false;
		DefaultRiTHMTimedTruthValue spec2= (DefaultRiTHMTimedTruthValue) obj;
		
		return spec2.truthValue.equals(this.truthValue) && this.timeStamp == spec2.timeStamp;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.truthValue.hashCode();
		return hashVal;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMTruthValue#getTimetamp()
	 */
	@Override
	public double getTimetamp() {
		// TODO Auto-generated method stub
		return timeStamp;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMTruthValue#setTimetamp(double)
	 */
	@Override
	public void setTimetamp(double ts) {
		// TODO Auto-generated method stub
		this.timeStamp = ts;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return this.getTruthValueDescription() + ":" + this.timeStamp;
	}
}
