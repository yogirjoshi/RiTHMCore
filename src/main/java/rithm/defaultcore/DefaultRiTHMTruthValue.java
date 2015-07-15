package rithm.defaultcore;

import rithm.core.RitHMTruthValue;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRiTHMTruthValue.
 */
public class DefaultRiTHMTruthValue implements RitHMTruthValue{
	
	/** The truth value. */
	String truthValue;
	
	/**
	 * Instantiates a new default ri thm truth value.
	 *
	 * @param truthValue the truth value
	 */
	public DefaultRiTHMTruthValue(String truthValue)
	{
		this.truthValue = truthValue;
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
		if(!(obj instanceof DefaultRiTHMTruthValue))
			return false;
		DefaultRiTHMTruthValue spec2= (DefaultRiTHMTruthValue) obj;
		
		return spec2.truthValue.equals(this.truthValue);
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
		return 0;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMTruthValue#setTimetamp(double)
	 */
	@Override
	public void setTimetamp(double ts) {
		// TODO Auto-generated method stub
		
	}
	
}
