package rithm.defaultcore;

import java.util.HashMap;
import java.util.Iterator;

import rithm.core.RitHMResultCollection;
import rithm.core.RitHMSpecification;
import rithm.core.RitHMTruthValue;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRiTHMSpecificationResult.
 */
public class DefaultRiTHMSpecificationResult extends RitHMResultCollection{
	
	/** The spec status. */
	HashMap<RitHMSpecification,RitHMTruthValue> specStatus;
	
	/**
	 * Instantiates a new default ri thm specification result.
	 */
	public DefaultRiTHMSpecificationResult()
	{
		specStatus = new HashMap<RitHMSpecification, RitHMTruthValue>();
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMResultCollection#setResult(rithm.core.RiTHMSpecification, rithm.core.RiTHMTruthValue)
	 */
	@Override
	public void setResult(RitHMSpecification spec, RitHMTruthValue truthVal) {
		// TODO Auto-generated method stub
		specStatus.put(spec, truthVal);
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMResultCollection#getResult(rithm.core.RiTHMSpecification)
	 */
	@Override
	public RitHMTruthValue getResult(RitHMSpecification spec) {
		// TODO Auto-generated method stub
		return specStatus.get(spec);
//		return null;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMResultCollection#iterator()
	 */
	@Override
	public Iterator<RitHMSpecification> iterator() {
		// TODO Auto-generated method stub
		if(specStatus != null)
			return specStatus.keySet().iterator();
		else
			throw new IllegalArgumentException("Iterator on a null collectio");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return specStatus.toString();
	}
}
