/**
 * 
 */
package rithm.core;

import java.rmi.NoSuchObjectException;

/**
 * @author y2joshi
 *
 */
public interface PredicateState {
	public boolean setValue(String Name, boolean Value);
	public boolean getValue(String Name);
}
