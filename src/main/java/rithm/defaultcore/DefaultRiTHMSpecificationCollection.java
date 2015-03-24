package rithm.defaultcore;

import java.util.ArrayList;
import java.util.Iterator;

import rithm.core.RiTHMSpecification;
import rithm.core.RiTHMSpecificationCollection;

public class DefaultRiTHMSpecificationCollection extends RiTHMSpecificationCollection {

	
	protected ArrayList<RiTHMSpecification> specLst;
	public DefaultRiTHMSpecificationCollection()
	{
		specLst = new ArrayList<RiTHMSpecification>();
	}
	@Override
	public RiTHMSpecification at(int index) {
		// TODO Auto-generated method stub
		return specLst.get(index);
	}

	@Override
	public void remove(RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.remove(spec);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return specLst.size();
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		specLst.remove(index);
	}
	
	@Override
	public void add(RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.add(spec);
	}
	@Override
	public void add(int i, RiTHMSpecification spec) {
		// TODO Auto-generated method stub
		specLst.add(i, spec);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		specLst.clear();
	}

	@Override
	public Iterator<RiTHMSpecification> iterator() {
		// TODO Auto-generated method stub
		return specLst.iterator();
	}

}
