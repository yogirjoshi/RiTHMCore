package rithm.defaultcore;

import java.util.ArrayList;
import java.util.Iterator;

import rithm.core.RitHMSpecification;
import rithm.core.RitHMSpecificationCollection;

// TODO: Auto-generated Javadoc
/**
 * The Class DefaultRiTHMSpecificationCollection.
 */
public class DefaultRiTHMSpecificationCollection extends RitHMSpecificationCollection {

	
	/** The spec lst. */
	protected ArrayList<RitHMSpecification> specLst;
	
	/**
	 * Instantiates a new default ri thm specification collection.
	 */
	public DefaultRiTHMSpecificationCollection()
	{
		specLst = new ArrayList<RitHMSpecification>();
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#at(int)
	 */
	@Override
	public RitHMSpecification at(int index) {
		// TODO Auto-generated method stub
		return specLst.get(index);
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#remove(rithm.core.RiTHMSpecification)
	 */
	@Override
	public void remove(RitHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.remove(spec);
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#length()
	 */
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return specLst.size();
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#remove(int)
	 */
	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		specLst.remove(index);
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#add(rithm.core.RiTHMSpecification)
	 */
	@Override
	public void add(RitHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.add(spec);
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#add(int, rithm.core.RiTHMSpecification)
	 */
	@Override
	public void add(int i, RitHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.add(i, spec);
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		specLst.clear();
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMSpecificationCollection#iterator()
	 */
	@Override
	public Iterator<RitHMSpecification> iterator() {
		// TODO Auto-generated method stub
		return specLst.iterator();
	}

}
