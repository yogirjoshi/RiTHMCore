package rithm.core;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Interface RiTHMMonitor.
 */
public interface RitHMMonitor extends RitHMPlugin{
	
	/**
	 * Sets the pipe mode.
	 *
	 * @param pipeMode the new pipe mode
	 */
	public void setpipeMode(boolean pipeMode);
	
	/**
	 * Gets the pipe mode.
	 *
	 * @return the pipe mode
	 */
	public boolean getpipeMode();
	
	/**
	 * Sets the result predicate name.
	 *
	 * @param spec the spec
	 * @param resName the res name
	 */
	public void setResultPredicateName(RitHMSpecification spec, String resName);
	
	/**
	 * Sets the formulas.
	 *
	 * @param Specs the specs
	 * @return true, if successful
	 */
	public boolean setFormulas(RitHMSpecificationCollection Specs);
	
	/**
	 * Synthesize monitors.
	 *
	 * @param Specs the specs
	 * @return true, if successful
	 */
	public boolean synthesizeMonitors(RitHMSpecificationCollection Specs);
	
	/**
	 * Synthesize monitors.
	 *
	 * @param Filename the filename
	 * @param isFile the is file
	 * @return true, if successful
	 */
	public boolean synthesizeMonitors(String Filename, boolean isFile);
	
	/**
	 * Run monitor.
	 *
	 * @return the ri thm result collection
	 */
	public RitHMResultCollection runMonitor();
	
	/**
	 * Sets the trace file.
	 *
	 * @param FileName the file name
	 * @return true, if successful
	 */
	public boolean setTraceFile(String FileName);
	
	/**
	 * Fill buffer.
	 *
	 * @param ps the ps
	 * @return true, if successful
	 */
	public boolean fillBuffer(ProgState ps);
	
	/**
	 * Sets the buffer.
	 *
	 * @param ps the ps
	 * @return true, if successful
	 */
	public boolean setBuffer(List<PredicateState> ps);
	
	/**
	 * Sets the monitoring event listener.
	 *
	 * @param mel the new monitoring event listener
	 */
	public void setMonitoringEventListener(MonitoringEventListener mel);
	
	/**
	 * Sets the monitor valuation.
	 *
	 * @param val the new monitor valuation
	 */
	public void setMonitorValuation(MonValuation val);
	
	/**
	 * Sets the predicate evaluator.
	 *
	 * @param pe the new predicate evaluator
	 */
	public void setPredicateEvaluator(PredicateEvaluator pe);
	
	/**
	 * Sets the out file.
	 *
	 * @param outFile the new out file
	 */
	public void setOutFile(String outFile);
	
	/**
	 * Sets the plot file.
	 *
	 * @param plotFile the new plot file
	 */
	public void setPlotFile(String plotFile);
	
	/**
	 * Sets the parser.
	 *
	 * @param parser the new parser
	 */
	public void setParser(ParserPlugin parser);
	
	/**
	 * Gets the truth valueas predicate.
	 *
	 * @return the truth valueas predicate
	 */
	public List<PredicateState> getTruthValueasPredicate();
	
	/**
	 * Gets the truth valueas predicate at.
	 *
	 * @param spec the spec
	 * @param i the i
	 * @return the truth valueas predicate at
	 */
	public PredicateState getTruthValueasPredicateAt(RitHMSpecification spec, int i);
	
	/**
	 * Reset specification verdict.
	 *
	 * @return true, if is reset on violation
	 */
	public boolean isResetOnViolation();
	
	/**
	 * Sets the reset on violation.
	 *
	 * @param resetOnViolation the new reset on violation
	 */
	public void setResetOnViolation(boolean resetOnViolation); 
}
