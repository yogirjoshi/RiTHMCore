/**
 * 
 */
package rithm.core;


// TODO: Auto-generated Javadoc
/**
 * The Interface PredicateState.
 *
 * @author y2joshi
 */
public interface PredicateState {
	
	/**
	 * Sets the value.
	 *
	 * @param Name the name
	 * @param Value the value
	 * @return true, if successful
	 */
	public boolean setValue(String Name, boolean Value);
	
	/**
	 * Gets the value.
	 *
	 * @param Name the name
	 * @return the value
	 */
	public boolean getValue(String Name);
	
	/**
	 * Sets the timestamp.
	 *
	 * @param Value the new timestamp
	 */
	public void setTimestamp(double Value);
	
	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public double getTimestamp();
}
