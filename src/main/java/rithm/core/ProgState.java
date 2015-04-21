/**
 * 
 */
package rithm.core;

import java.util.Iterator;
import java.util.Map;

/**
 * @author y2joshi
 *
 */
public abstract class ProgState implements Iterable<Map.Entry<String, String>>{
	protected double timestamp;
	public ProgState(double timestamp) {
		this.timestamp = timestamp;
	}
	abstract public String getValue(String progVariable);
	abstract public void  setValue(String progVariable, String progVariableValue);
	
}
