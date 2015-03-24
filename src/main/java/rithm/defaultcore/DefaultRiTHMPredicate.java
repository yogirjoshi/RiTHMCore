package rithm.defaultcore;
import rithm.core.RiTHMPredicate;;
public class DefaultRiTHMPredicate implements RiTHMPredicate{

	protected String predTxt;
	public DefaultRiTHMPredicate(String predTxt)
	{
		this.predTxt = predTxt;
	}
	public String getTextDescription() {
		// TODO Auto-generated method stub
		return predTxt;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof DefaultRiTHMPredicate))
			return false;
		DefaultRiTHMPredicate pred2= (DefaultRiTHMPredicate) obj;
		
		return pred2.predTxt.equals(this.predTxt);
	}
	public int hashCode(){
		int hashVal=0;
		hashVal+=this.predTxt.hashCode();
		return hashVal;
	}

}
