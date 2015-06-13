/**
 * 
 */
package rithm.core;


/**
 * @author y2joshi
 *
 */
public interface PredicateState {
	public boolean setValue(String Name, boolean Value);
	public boolean getValue(String Name);
	public void setTimestamp(double Value);
	public double getTimestamp();
}
