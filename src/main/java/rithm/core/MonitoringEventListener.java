package rithm.core;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving monitoringEvent events.
 * The class that is interested in processing a monitoringEvent
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addMonitoringEventListener<code> method. When
 * the monitoringEvent event occurs, that object's appropriate
 * method is invoked.
 *
 * @see MonitoringEventEvent
 */
public abstract class MonitoringEventListener implements RitHMPlugin{
	
	/**
	 * Mon valuation changed.
	 *
	 * @param Spec the spec
	 * @param truthVal the truth val
	 */
	protected String myName;
	abstract public void MonValuationChanged(RitHMSpecification Spec, RitHMTruthValue truthVal);

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
