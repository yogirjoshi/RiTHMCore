/**
 * 
 */
package rithm.core;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class ProgState.
 *
 * @author y2joshi
 */
public abstract class ProgState implements Iterable<Map.Entry<String, String>>, Serializable{
	
	/** The timestamp. */
	protected double timestamp;
	
	/**
	 * Instantiates a new prog state.
	 *
	 * @param timestamp the timestamp
	 */
	public ProgState(double timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public final double getTimestamp()
	{
		return timestamp;
	}
	
	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp the new timestamp
	 */
	public final void setTimestamp(double timestamp)
	{
		this.timestamp = timestamp;
	}
	
	/**
	 * Gets the value.
	 *
	 * @param progVariable the prog variable
	 * @return the value
	 */
	abstract public String getValue(String progVariable);
	
	/**
	 * Sets the value.
	 *
	 * @param progVariable the prog variable
	 * @param progVariableValue the prog variable value
	 */
	abstract public void  setValue(String progVariable, String progVariableValue);
	
}
