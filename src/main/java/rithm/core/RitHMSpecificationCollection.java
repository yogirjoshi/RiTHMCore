package rithm.core;

import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class RiTHMSpecificationCollection.
 */
abstract public class RitHMSpecificationCollection implements Iterable<RitHMSpecification>{
	
	/**
	 * At.
	 *
	 * @param index the index
	 * @return the ri thm specification
	 */
	abstract public RitHMSpecification at(int index);
	
	/**
	 * Length.
	 *
	 * @return the int
	 */
	abstract public int length();
	
	/**
	 * Removes the.
	 *
	 * @param index the index
	 */
	abstract public void remove(int index);
	
	/**
	 * Removes the.
	 *
	 * @param spec the spec
	 */
	abstract public void remove(RitHMSpecification spec);
	
	/**
	 * Adds the.
	 *
	 * @param i the i
	 * @param spec the spec
	 */
	abstract public void add(int i, RitHMSpecification spec);
	
	/**
	 * Adds the.
	 *
	 * @param spec the spec
	 */
	abstract public void add(RitHMSpecification spec);
	
	/**
	 * Clear.
	 */
	abstract public void clear();
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	abstract public Iterator<RitHMSpecification> iterator();
	
}
