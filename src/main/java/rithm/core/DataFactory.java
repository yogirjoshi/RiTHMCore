/**
 * 
 */
package rithm.core;

import java.util.Collection;

/**
 * @author y2joshi
 *
 */
public abstract class DataFactory implements RiTHMPlugin{
	protected RiTHMProgStateCollection eventQueue; 
	abstract public String getNextJSONEvent();
	abstract public void setFile(String Inputfilename);
	abstract public void export (String Outputfilename);
	abstract public ProgState getNextProgState();
	abstract public boolean resetFilePosition();
	abstract public String getJSONAt(long i);
	abstract public ProgState getProgStateAt(long i);
	abstract public String getJSONAtTimeStamp(double Ts);
	abstract public ProgState getProgStateAtTimeStamp(double Ts);
	abstract public void clearBuffer();
}
