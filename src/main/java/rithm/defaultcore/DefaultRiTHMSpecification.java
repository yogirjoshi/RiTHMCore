package rithm.defaultcore;

import rithm.core.RitHMSpecification;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRiTHMSpecification.
 */
public class DefaultRiTHMSpecification implements RitHMSpecification{
	
	/** The spec text. */
	protected String specText;
	
	/**
	 * Instantiates a new default ri thm specification.
	 *
	 * @param specText the spec text
	 */
	public DefaultRiTHMSpecification(String specText)
	{
		this.specText = specText;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecification#getTextDescription()
	 */
	public String getTextDescription() {
		// TODO Auto-generated method stub
		return specText;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMSpecification))
			return false;
		DefaultRiTHMSpecification spec2= (DefaultRiTHMSpecification) obj;
		
		return spec2.specText.equals(this.specText);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.specText.hashCode();
		return hashVal;
	}
}
