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
public abstract class MonitoringEventListener {
	
	/**
	 * Mon valuation changed.
	 *
	 * @param Spec the spec
	 * @param truthVal the truth val
	 */
	abstract public void MonValuationChanged(RitHMSpecification Spec, RitHMTruthValue truthVal);
}
