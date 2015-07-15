package rithm.basemonitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import rithm.core.MonValuation;
import rithm.core.MonitoringEventListener;
import rithm.core.ParserPlugin;
import rithm.core.PredicateEvaluator;
import rithm.core.PredicateState;
import rithm.core.RitHMMonitor;
import rithm.core.RitHMSpecification;
import rithm.core.RitHMSpecificationCollection;

// TODO: Auto-generated Javadoc
/**
 * The Class RiTHMBaseMonitor.
 */
public abstract class RitHMBaseMonitor implements RitHMMonitor{
	
	/** The reset on violation. */
	protected boolean resetOnViolation = false;


	/** The out file name. */
	protected String outFileName;
	
	/** The plot file name. */
	protected String plotFileName;
	
	/** The pipe mode. */
	protected boolean pipeMode = false;
	
	/** The curr specs. */
	protected RitHMSpecificationCollection currSpecs;
	
	/** The mlist. */
	protected ArrayList<MonitoringEventListener> mlist;
	
	/** The valuation. */
	protected MonValuation valuation;
	
	/** The pe. */
	protected PredicateEvaluator pe;
	
	/** The parser. */
	protected ParserPlugin parser;
	
	/** The spec resmap. */
	protected HashMap<RitHMSpecification, String> specResmap;
	
	/** The res pred. */
	protected ArrayList<PredicateState> resPred;
	
	/** The pred list. */
	protected ArrayList<PredicateState> predList;
	
	/** The buffer. */
	protected ArrayList<PredicateState> buffer;
	
	
	/** The my name. */
	protected String myName;
	/**
	 * Instantiates a new ri thm base monitor.
	 */
	public RitHMBaseMonitor()
	{
		mlist = new ArrayList<MonitoringEventListener>();
		predList = null;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setpipeMode(boolean)
	 */
	@Override
	public void setpipeMode(boolean pipeMode) {
		// TODO Auto-generated method stub
		this.pipeMode = pipeMode;
		if(pipeMode)
		{
			specResmap = new HashMap<RitHMSpecification, String>();
			resPred = new ArrayList<PredicateState>();
		}
		else
		{
			specResmap = null;
			resPred = null;
		}
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#getpipeMode()
	 */
	@Override
	public boolean getpipeMode() {
		// TODO Auto-generated method stub
		return pipeMode;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setFormulas(rithm.core.RiTHMSpecificationCollection)
	 */
	@Override
	public boolean setFormulas(RitHMSpecificationCollection specs) {
		if(specs == null)
			throw new IllegalArgumentException("specs cannot be null");
		// TODO Auto-generated method stub
		currSpecs = specs;
		return true;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setTraceFile(java.lang.String)
	 */
	@Override
	public boolean setTraceFile(String FileName) {
		// TODO Auto-generated method stub
		return false;
	}


	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setMonitoringEventListener(rithm.core.MonitoringEventListener)
	 */
	@Override
	public void setMonitoringEventListener(MonitoringEventListener mel) {
		// TODO Auto-generated method stub
		this.mlist.add(mel);
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setMonitorValuation(rithm.core.MonValuation)
	 */
	@Override
	public void setMonitorValuation(MonValuation val) {
		// TODO Auto-generated method stub
		this.valuation = val;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setPredicateEvaluator(rithm.core.PredicateEvaluator)
	 */
	@Override
	public void setPredicateEvaluator(PredicateEvaluator pe) {
		// TODO Auto-generated method stub
		this.pe  = pe;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setOutFile(java.lang.String)
	 */
	@Override
	public void setOutFile(String outFile) {
		// TODO Auto-generated method stub
		this.outFileName = outFile;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setParser(rithm.core.ParserPlugin)
	 */
	@Override
	public void setParser(ParserPlugin parser) {
		// TODO Auto-generated method stub
		this.parser = parser;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setResultPredicateName(rithm.core.RiTHMSpecification, java.lang.String)
	 */
	@Override
	public void setResultPredicateName(RitHMSpecification spec, String resName) {
		// TODO Auto-generated method stub
		if(pipeMode)
			specResmap.put(spec, resName);
		else
			throw new UnsupportedOperationException("Only supported in pipeMode");
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#getTruthValueasPredicate()
	 */
	@Override
	public List<PredicateState> getTruthValueasPredicate() {
		// TODO Auto-generated method stub
		if(pipeMode)
			return resPred;
		else
			throw new UnsupportedOperationException("Only supported in pipeMode");
	}

	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#getTruthValueasPredicateAt(rithm.core.RiTHMSpecification, int)
	 */
	@Override
	public PredicateState getTruthValueasPredicateAt(RitHMSpecification spec, int i) {
		// TODO Auto-generated method stub
		if(pipeMode)
			return resPred.get(i);
		else
			throw new UnsupportedOperationException("Only supported in pipeMode");
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setBuffer(java.util.List)
	 */
	@Override
	public boolean setBuffer(List<PredicateState> ps) {
		// TODO Auto-generated method stub
		if(ps instanceof ArrayList<?>)
			this.buffer = (ArrayList<PredicateState>)ps;
		else
			throw new IllegalArgumentException("Currently only ArrayList is supported!!!!");
		return false;
	}
	
	/* (non-Javadoc)
	 * @see rithm.core.RiTHMMonitor#setPlotFile(java.lang.String)
	 */
	@Override
	public void setPlotFile(String plotFile) {
		// TODO Auto-generated method stub
		this.plotFileName = plotFile;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RitHMMonitor#isResetOnViolation()
	 */
	public boolean isResetOnViolation() {
		return resetOnViolation;
	}

	/* (non-Javadoc)
	 * @see rithm.core.RitHMMonitor#setResetOnViolation(boolean)
	 */
	public void setResetOnViolation(boolean resetOnViolation) {
		this.resetOnViolation = resetOnViolation;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		myName = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}
	
}
