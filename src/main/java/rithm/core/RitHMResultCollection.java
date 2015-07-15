package rithm.core;

import java.io.Serializable;
import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class RiTHMResultCollection.
 */
public abstract class RitHMResultCollection implements Serializable{
	
	/**
	 * Sets the result.
	 *
	 * @param spec the spec
	 * @param truthVal the truth val
	 */
	abstract public void setResult(RitHMSpecification spec, RitHMTruthValue truthVal);
	
	/**
	 * Gets the result.
	 *
	 * @param spec the spec
	 * @return the result
	 */
	abstract public RitHMTruthValue getResult(RitHMSpecification spec);
	
	/**
	 * Iterator.
	 *
	 * @return the iterator
	 */
	abstract public Iterator<RitHMSpecification> iterator();
}
