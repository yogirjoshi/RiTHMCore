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
	public double getTimestamp()
	{
		return timestamp;
	}
	abstract public String getValue(String progVariable);
	abstract public void  setValue(String progVariable, String progVariableValue);
	
}
