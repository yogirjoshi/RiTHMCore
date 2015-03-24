package rithm.core;

public abstract class RiTHMResultCollection {
	abstract public void setResult(RiTHMSpecification spec, RiTHMTruthValue truthVal);
	abstract public RiTHMTruthValue getResult(RiTHMSpecification spec);
}
