package rithm.core;


public interface RiTHMMonitor{
	public boolean SetFormulas(RiTHMSpecificationCollection Specs);
	public boolean SynthesizeMonitors(RiTHMSpecificationCollection Specs);
	public boolean SynthesizeMonitors(String Filename);
	public RiTHMResultCollection runMonitor();
	public boolean SetTraceFile(String FileName);
	public boolean FillBuffer(ProgState ps);
	public void SetMonitoringEventListener(MonitoringEventListener mel);
	public void SetMonitorValuation(MonValuation val);
	public void SetPredicateEvaluator(PredicateEvaluator pe);
	public void setOutFile(String outFile);
	public void setParser(ParserPlugin parser);
}
