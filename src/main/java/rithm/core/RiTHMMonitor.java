package rithm.core;


public interface RiTHMMonitor{
	public boolean setFormulas(RiTHMSpecificationCollection Specs);
	public boolean synthesizeMonitors(RiTHMSpecificationCollection Specs);
	public boolean synthesizeMonitors(String Filename);
	public RiTHMResultCollection runMonitor();
	public boolean setTraceFile(String FileName);
	public boolean fillBuffer(ProgState ps);
	public void setMonitoringEventListener(MonitoringEventListener mel);
	public void setMonitorValuation(MonValuation val);
	public void setPredicateEvaluator(PredicateEvaluator pe);
	public void setOutFile(String outFile);
	public void setParser(ParserPlugin parser);
}
