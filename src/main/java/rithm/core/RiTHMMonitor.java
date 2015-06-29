package rithm.core;

import java.util.ArrayList;
import java.util.List;


public interface RiTHMMonitor{
	public void setpipeMode(boolean pipeMode);
	public boolean getpipeMode();
	public void setResultPredicateName(RiTHMSpecification spec, String resName);
	public boolean setFormulas(RiTHMSpecificationCollection Specs);
	public boolean synthesizeMonitors(RiTHMSpecificationCollection Specs);
	public boolean synthesizeMonitors(String Filename, boolean isFile);
	public RiTHMResultCollection runMonitor();
	public boolean setTraceFile(String FileName);
	public boolean fillBuffer(ProgState ps);
	public boolean setBuffer(List<PredicateState> ps);
	public void setMonitoringEventListener(MonitoringEventListener mel);
	public void setMonitorValuation(MonValuation val);
	public void setPredicateEvaluator(PredicateEvaluator pe);
	public void setOutFile(String outFile);
	public void setPlotFile(String plotFile);
	public void setParser(ParserPlugin parser);
	public List<PredicateState> getTruthValueasPredicate();
	public PredicateState getTruthValueasPredicateAt(RiTHMSpecification spec, int i);
}
