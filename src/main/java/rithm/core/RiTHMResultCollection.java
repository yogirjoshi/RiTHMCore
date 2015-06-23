package rithm.core;

import java.io.Serializable;
import java.util.Iterator;

public abstract class RiTHMResultCollection implements Serializable{
	abstract public void setResult(RiTHMSpecification spec, RiTHMTruthValue truthVal);
	abstract public RiTHMTruthValue getResult(RiTHMSpecification spec);
	abstract public Iterator<RiTHMSpecification> iterator();
}
