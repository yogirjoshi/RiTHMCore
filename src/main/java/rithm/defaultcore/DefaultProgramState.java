package rithm.defaultcore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import rithm.core.ProgState;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultProgramState.
 */
public class DefaultProgramState extends ProgState{
	
	/** The field_dictionary. */
	public HashMap<String, String> field_dictionary;
	
	/**
	 * Instantiates a new default program state.
	 *
	 * @param timestamp the timestamp
	 */
	public DefaultProgramState(double timestamp) {
		// TODO Auto-generated constructor stub
		super(timestamp);
		field_dictionary = new HashMap<String, String>();
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.ProgState#getValue(java.lang.String)
	 */
	@Override
	public String getValue(String progVariable) {
		// TODO Auto-generated method stub
		if(field_dictionary.containsKey(progVariable))
			return field_dictionary.get(progVariable);
		return null;
	}

	/* (non-Javadoc)
	 * @see rithm.core.ProgState#setValue(java.lang.String, java.lang.String)
	 */
	@Override
	public void setValue(String progVariable, String progVariableValue) {
		// TODO Auto-generated method stub
		field_dictionary.put(progVariable, progVariableValue);
	}
	
	/**
	 * Gets the dictionary.
	 *
	 * @return the dictionary
	 */
	public HashMap<String, String> getDictionary()
	{
		return this.field_dictionary;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		StringBuffer str = new StringBuffer();
		for(String key : field_dictionary.keySet())
		{
			str.append(" " + key + ":=" + field_dictionary.get(key) +"\n");
		}
		str.append("\n");
		return str.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Entry<String, String>> iterator() {
		// TODO Auto-generated method stub
		return this.field_dictionary.entrySet().iterator();
	}
	
}
