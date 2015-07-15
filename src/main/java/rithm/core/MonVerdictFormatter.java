/**
 * 
 */
package rithm.core;

// TODO: Auto-generated Javadoc
/**
 * The Interface MonVerdictFormatter.
 *
 * @author y2joshi
 */
public interface MonVerdictFormatter{
	
	/**
	 * Buffer verdict.
	 *
	 * @param specId the spec id
	 * @param monState the mon state
	 */
	public void bufferVerdict(RitHMSpecification specId,MonState monState);
	
	/**
	 * Write verdict.
	 */
	public void writeVerdict();
	
	/**
	 * Write all.
	 */
	public void writeAll();
}
