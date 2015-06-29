/**
 * 
 */
package rithm.core;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author y2joshi
 *
 */
public abstract class ProgState implements Iterable<Map.Entry<String, String>>, Serializable{
	protected double timestamp;
	public ProgState(double timestamp) {
		this.timestamp = timestamp;
	}
	public final double getTimestamp()
	{
		return timestamp;
	}
	public final void setTimestamp(double timestamp)
	{
		this.timestamp = timestamp;
	}
	abstract public String getValue(String progVariable);
	abstract public void  setValue(String progVariable, String progVariableValue);
	
}
