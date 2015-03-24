package rithm.core;

import java.util.Collection;
import java.util.HashMap;

public interface MonValuation {
	public void setValues(Collection<RiTHMTruthValue> TruthValues);
	public void setSemanticDescription(HashMap<RiTHMTruthValue, String> Desc);
	public String getSemanticDescription(RiTHMTruthValue Semantic);
	public RiTHMTruthValue getDefaultValuation();
}
