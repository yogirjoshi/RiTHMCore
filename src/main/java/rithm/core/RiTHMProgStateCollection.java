package rithm.core;

public abstract class RiTHMProgStateCollection implements Iterable<ProgState>{
	abstract public boolean add(ProgState progStateObj);
	abstract public ProgState get(long index);
	abstract public void clear();
}
