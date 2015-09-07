/**
 * 
 */
package rithm.core;

/**
 * A factory for creating Data objects.
 *
 * @author y2joshi
 */
public abstract class DataFactory implements RitHMPlugin{
	
	/** The event queue. */
	protected RitHMProgStateCollection eventQueue; 
	
	protected String myName;
	/**
	 * Gets the next json event.
	 *
	 * @return the next json event
	 */
	abstract public String getNextJSONEvent();
	
	/**
	 * Sets the file.
	 *
	 * @param Inputfilename the new file
	 */
	abstract public void setFile(String Inputfilename);
	
	/**
	 * Export.
	 *
	 * @param Outputfilename the outputfilename
	 */
	abstract public void export (String Outputfilename);
	
	/**
	 * Gets the next prog state.
	 *
	 * @return the next prog state
	 */
	abstract public ProgState getNextProgState();
	
	/**
	 * Reset file position.
	 *
	 * @return true, if successful
	 */
	abstract public boolean resetFilePosition();
	
	/**
	 * Gets the JSON at.
	 *
	 * @param i the i
	 * @return the JSON at
	 */
	abstract public String getJSONAt(long i);
	
	/**
	 * Gets the prog state at.
	 *
	 * @param i the i
	 * @return the prog state at
	 */
	abstract public ProgState getProgStateAt(long i);
	
	/**
	 * Gets the JSON at time stamp.
	 *
	 * @param Ts the ts
	 * @return the JSON at time stamp
	 */
	abstract public String getJSONAtTimeStamp(double Ts);
	
	/**
	 * Gets the prog state at time stamp.
	 *
	 * @param Ts the ts
	 * @return the prog state at time stamp
	 */
	abstract public ProgState getProgStateAtTimeStamp(double Ts);
	
	/**
	 * Clear buffer.
	 */
	abstract public void clearBuffer();

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		myName = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}
	abstract public boolean closeDataSource();
	
}
