package rithm.core;

// TODO: Auto-generated Javadoc
/**
 * The Class RiTHMProgStateCollection.
 */
public abstract class RitHMProgStateCollection implements Iterable<ProgState>{
	
	/**
	 * Adds the.
	 *
	 * @param progStateObj the prog state obj
	 * @return true, if successful
	 */
	abstract public boolean add(ProgState progStateObj);
	
	/**
	 * Gets the.
	 *
	 * @param index the index
	 * @return the prog state
	 */
	abstract public ProgState get(int index);
	
	/**
	 * Clear.
	 */
	abstract public void clear();
	
	/**
	 * Length.
	 *
	 * @return the int
	 */
	abstract public int length();
}
