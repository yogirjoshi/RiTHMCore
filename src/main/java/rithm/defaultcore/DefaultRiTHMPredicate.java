package rithm.defaultcore;
import rithm.core.RitHMPredicate;
// TODO: Auto-generated Javadoc

/**
 * The Class DefaultRiTHMPredicate.
 */
public class DefaultRiTHMPredicate implements RitHMPredicate{

	/** The pred txt. */
	protected String predTxt;
	
	/**
	 * Instantiates a new default ri thm predicate.
	 *
	 * @param predTxt the pred txt
	 */
	public DefaultRiTHMPredicate(String predTxt)
	{
		this.predTxt = predTxt;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMPredicate#getTextDescription()
	 */
	public String getTextDescription() {
		// TODO Auto-generated method stub
		return predTxt;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMPredicate))
			return false;
		DefaultRiTHMPredicate pred2= (DefaultRiTHMPredicate) obj;
		
		return pred2.predTxt.equals(this.predTxt);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.predTxt.hashCode();
		return hashVal;
	}

}
