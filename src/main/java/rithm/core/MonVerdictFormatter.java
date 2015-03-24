/**
 * 
 */
package rithm.core;

/**
 * @author y2joshi
 *
 */
public interface MonVerdictFormatter{
	
	public void bufferVerdict(RiTHMSpecification specId,MonState monState);
	public void writeVerdict();
	public void writeAll();
}
