package rithm.defaultcore;

import java.util.ArrayList;
import java.util.Iterator;

import rithm.core.ProgState;
import rithm.core.RiTHMProgStateCollection;

public class DefaultProgStateCollection extends RiTHMProgStateCollection{
	protected ArrayList<ProgState> progStateList;
	
	public DefaultProgStateCollection()
	{
		progStateList = new ArrayList<ProgState>();
	}
	@Override
	public Iterator<ProgState> iterator() {
		// TODO Auto-generated method stub
		return progStateList.iterator();
	}
	public boolean add(ProgState progStateObj)
	{
		progStateList.add(progStateObj);
		return true;
	}
	@Override
	public ProgState get(long index) {
		// TODO Auto-generated method stub
		return progStateList.get((int)index);
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.progStateList.clear();
	}
	
}
