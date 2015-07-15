package rithm.defaultcore;

import rithm.core.MonitoringEventListener;
import rithm.core.RitHMSpecification;
import rithm.core.RitHMTruthValue;
// TODO: Auto-generated Javadoc

/**
 * The listener interface for receiving defaultMonitoringEvent events.
 * The class that is interested in processing a defaultMonitoringEvent
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addDefaultMonitoringEventListener<code> method. When
 * the defaultMonitoringEvent event occurs, that object's appropriate
 * method is invoked.
 *
 * @see DefaultMonitoringEventEvent
 */
public class DefaultMonitoringEventListener extends MonitoringEventListener{
	
	/* (non-Javadoc)
	 * @see rithm.core.MonitoringEventListener#MonValuationChanged(rithm.core.RiTHMSpecification, rithm.core.RiTHMTruthValue)
	 */
	@Override
	public void MonValuationChanged(RitHMSpecification Spec, RitHMTruthValue TVal) {
		// TODO Auto-generated method stub
		
	}
	

}
