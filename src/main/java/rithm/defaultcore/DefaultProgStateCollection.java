package rithm.defaultcore;

import java.util.ArrayList;
import java.util.Iterator;

import rithm.core.ProgState;
import rithm.core.RitHMProgStateCollection;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultProgStateCollection.
 */
public class DefaultProgStateCollection extends RitHMProgStateCollection{
	
	/** The prog state list. */
	protected ArrayList<ProgState> progStateList;
	
	/**
	 * Instantiates a new default prog state collection.
	 */
	public DefaultProgStateCollection()
	{
		progStateList = new ArrayList<ProgState>();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<ProgState> iterator() {
		// TODO Auto-generated method stub
		return progStateList.iterator();
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMProgStateCollection#add(rithm.core.ProgState)
	 */
	public boolean add(ProgState progStateObj)
	{
		progStateList.add(progStateObj);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMProgStateCollection#get(int)
	 */
	@Override
	public ProgState get(int index) {
		// TODO Auto-generated method stub
		return progStateList.get((int)index);
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMProgStateCollection#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.progStateList.clear();
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMProgStateCollection#length()
	 */
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.progStateList.size();
	}
	
}
