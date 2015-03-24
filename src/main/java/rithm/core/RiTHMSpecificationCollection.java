package rithm.core;

import java.util.Iterator;

abstract public class RiTHMSpecificationCollection implements Iterable<RiTHMSpecification>{
	abstract public RiTHMSpecification at(int index);
	abstract public int length();
	abstract public void remove(int index);
	abstract public void remove(RiTHMSpecification spec);
	abstract public void add(int i, RiTHMSpecification spec);
	abstract public void add(RiTHMSpecification spec);
	abstract public void clear();
	abstract public Iterator<RiTHMSpecification> iterator();
	
}
