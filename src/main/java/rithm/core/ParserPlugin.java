package rithm.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import rithm.defaultcore.DefaultRiTHMSpecification;
// TODO: Auto-generated Javadoc

/**
 * The Class ParserPlugin.
 */
public abstract class 
ParserPlugin
implements RitHMPlugin{

	/** The parser_name. */
	protected String parser_name;
	
	/**
	 * The Enum type_enum.
	 */
	private enum type_enum
	{
		
		/** The native. */
		NATIVE,
		
		/** The java. */
		JAVA
	}
	
	/** The parser_type. */
	protected type_enum parser_type;
	
	/** The loaded_count. */
	public static int loaded_count = 0;
	
	/**
	 * Set the name of Parser Plugin .
	 *
	 * @param name This is the name to be set
	 */
	public void setName(String name)
	{
		parser_name = name;
	}
	
	/**
	 * Get the name of Parser Plugin .
	 *
	 * @return Name of Parser Plugin
	 */
	public String getName()
	{
		return parser_name;
	}
	
	/**
	 * Load a set of {@link DefaultRiTHMSpecification} in a file.
	 *
	 * @param filename which specify the file from which the {@link DefaultRiTHMSpecification}'s will be loaded
	 * @return whether the loading was successful
	 */
	abstract public boolean loadSpecs(String filename);
	
	/**
	 * Load a set of {@link DefaultRiTHMSpecification} from a collection of type {@link RitHMSpecificationCollection}.
	 *
	 * @param Specs the specs
	 * @return whether the loading was successful
	 */
	abstract public boolean loadSpecs(RitHMSpecificationCollection Specs);
	
	/**
	 * Validate previously loaded formulae of type <Formula>.
	 *
	 * @return a collection of type <T1>
	 */
	abstract public List<Boolean> validateSpecs();
	
	/**
	 * Append a <Formula> to previously loaded formulae.
	 *
	 * @param Spec the spec
	 * @return whether the append was successful
	 */
	abstract public boolean appendSpec(RitHMSpecification Spec);
	
	/**
	 * Remove a specification of type <Formula>.
	 *
	 * @param Spec the spec
	 * @return whether the removal was successful
	 */
	abstract public boolean removeSpec(RitHMSpecification Spec);
	
	/**
	 * Get the results of the validation of loaded specifications.
	 *
	 * @return a collection of type <T1>
	 */
	abstract public List<Boolean> validationResults();
	
	/**
	 * Export the specifications in a different syntax.
	 *
	 * @param Specs the specs
	 * @return whether the export is successful
	 */
	abstract public boolean exportSpecs(RitHMSpecificationCollection Specs);
	
	/**
	 * Rewrite the specifications in a different syntax.
	 *
	 * @param Specs the specs
	 * @return whether the rewrite is successful
	 */
	abstract public boolean rewriteSpecs(RitHMSpecificationCollection Specs);
	
	/**
	 * Returns the currently loaded specifications.
	 *
	 * @return a collection of type <T2>
	 */
	abstract public RitHMSpecificationCollection getSpecs();
	
	/**
	 * Returns the predicates of currently loaded specifications.
	 *
	 * @return a collection of type <T3>
	 */
	abstract public ArrayList<RitHMPredicate> getPredicates();
	
	/**
	 * Returns the error messages (if any) of the specifications whose loading was attempted.
	 *
	 * @return a collection of type <T4>
	 */
	abstract public HashMap<RitHMSpecification, String> getErrorMessages();
	
	/**
	 * Clears the error history of the attempted loads.
	 */
	abstract public void clearErrors();
	
	/**
	 * Returns the error messages for a particular Formula.
	 *
	 * @param Spec the spec
	 * @return Error Message <T4>
	 */
	abstract public String getErrorforSpec(RitHMSpecification Spec);
	
	/**
	 * Clears all the loaded specifications .
	 *
	 * @return whether the removal was successful
	 */
	abstract public boolean removeAllSpecs();
	
	/**
	 * Returns the antlr parse tree for a particular Formula.
	 *
	 * @param spec the spec
	 * @return ParseTree <ParseTree>
	 */
	
	abstract public ParseTree getTreeforSpec(RitHMSpecification spec);
	
	/**
	 * Gets the preds for spec.
	 *
	 * @param spec the spec
	 * @return the preds for spec
	 */
	// TODO change to rithm types
	abstract public ArrayList<String> getPredsForSpec(String spec);
	
	/**
	 * Rewrite spec.
	 *
	 * @param spec the spec
	 * @return the string
	 */
	abstract public String rewriteSpec(RitHMSpecification spec);
}
