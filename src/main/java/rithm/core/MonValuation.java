package rithm.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * The Interface MonValuation.
 */
public interface MonValuation {
	
	/**
	 * Sets the values.
	 *
	 * @param TruthValues the new values
	 */
	public void setValues(ArrayList<RitHMTruthValue> TruthValues);
	
	/**
	 * Sets the semantic description.
	 *
	 * @param Desc the desc
	 */
	public void setSemanticDescription(HashMap<RitHMTruthValue, String> Desc);
	
	/**
	 * Gets the semantic description.
	 *
	 * @param Semantic the semantic
	 * @return the semantic description
	 */
	public String getSemanticDescription(RitHMTruthValue Semantic);
	
	/**
	 * Gets the default valuation.
	 *
	 * @return the default valuation
	 */
	public RitHMTruthValue getDefaultValuation();
}
