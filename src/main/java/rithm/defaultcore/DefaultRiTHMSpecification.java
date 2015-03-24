package rithm.defaultcore;

import rithm.core.RiTHMSpecification;

public class DefaultRiTHMSpecification implements RiTHMSpecification{
	protected String specText;
	public DefaultRiTHMSpecification(String specText)
	{
		this.specText = specText;
	}
	public String getTextDescription() {
		// TODO Auto-generated method stub
		return specText;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMSpecification))
			return false;
		DefaultRiTHMSpecification spec2= (DefaultRiTHMSpecification) obj;
		
		return spec2.specText.equals(this.specText);
	}
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.specText.hashCode();
		return hashVal;
	}
}
