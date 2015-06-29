package rithm.defaultcore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import rithm.core.ProgState;

public class DefaultProgramState extends ProgState{
	public HashMap<String, String> field_dictionary;
	public DefaultProgramState(double timestamp) {
		// TODO Auto-generated constructor stub
		super(timestamp);
		field_dictionary = new HashMap<String, String>();
	}
	
	@Override
	public String getValue(String progVariable) {
		// TODO Auto-generated method stub
		if(field_dictionary.containsKey(progVariable))
			return field_dictionary.get(progVariable);
		return null;
	}

	@Override
	public void setValue(String progVariable, String progVariableValue) {
		// TODO Auto-generated method stub
		field_dictionary.put(progVariable, progVariableValue);
	}
	
	public HashMap<String, String> getDictionary()
	{
		return this.field_dictionary;
	}
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

	@Override
	public Iterator<Entry<String, String>> iterator() {
		// TODO Auto-generated method stub
		return this.field_dictionary.entrySet().iterator();
	}
	
}
