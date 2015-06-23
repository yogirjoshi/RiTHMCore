package rithm.defaultcore;

import java.util.HashMap;
import java.util.Iterator;

import rithm.core.RiTHMResultCollection;
import rithm.core.RiTHMSpecification;
import rithm.core.RiTHMTruthValue;

public class DefaultRiTHMSpecificationResult extends RiTHMResultCollection{
	
	HashMap<RiTHMSpecification,RiTHMTruthValue> specStatus;
	public DefaultRiTHMSpecificationResult()
	{
		specStatus = new HashMap<RiTHMSpecification, RiTHMTruthValue>();
	}
	@Override
	public void setResult(RiTHMSpecification spec, RiTHMTruthValue truthVal) {
		// TODO Auto-generated method stub
		specStatus.put(spec, truthVal);
	}

	@Override
	public RiTHMTruthValue getResult(RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		return specStatus.get(spec);
//		return null;
	}
	
	@Override
	public Iterator<RiTHMSpecification> iterator() {
		// TODO Auto-generated method stub
		if(specStatus != null)
			return specStatus.keySet().iterator();
		else
			throw new IllegalArgumentException("Iterator on a null collectio");
	}
	public String toString()
	{
		return specStatus.toString();
	}
}
