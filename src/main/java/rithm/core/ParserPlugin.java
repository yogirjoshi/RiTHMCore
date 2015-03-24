package rithm.core;

import java.util.*;
 
public abstract class 
ParserPlugin
implements RiTHMPlugin{

	protected String parser_name;
	private enum type_enum
	{
		NATIVE,
		JAVA
	}
	protected type_enum parser_type;
	public static int loaded_count = 0;
	/**Set the name of Parser Plugin 
	 * @param This is the name to be set*/
	public void setName(String name)
	{
		parser_name = name;
	}
	/**Get the name of Parser Plugin 
	 * @return Name of Parser Plugin*/
	public String getName()
	{
		return parser_name;
	}
	/**Set the type of Parser Plugin 
	* @param {@link {@link ParserPlugin#parser_type}}*/
	public void setType(int type)
	{
		parser_type = type_enum.values()[type];
	}
	/**Get the type of Parser Plugin 
	 * @return type of Parser Plugin*/
	public int getType()
	{
		return parser_type.ordinal();
	}
	/**Load a set of <Formula> in a file
	 * @param filename which specify the file from which the <Formula>'s will be loaded
	 * @return whether the loading was successful*/
	abstract public boolean loadSpecs(String filename);
	
	/**Load a set of <Formula> from a collection of type <T2>
	 * @param a collection of type <T2>
	 * @return whether the loading was successful*/
	abstract public boolean loadSpecs(RiTHMSpecificationCollection Specs);
	
	/**Validate previously loaded formulae of type <Formula>
	 * @return a collection of type <T1>*/
	abstract public List<Boolean> validateSpecs();
	
	/**Append a <Formula> to previously loaded formulae
	 * @return whether the append was successful*/
	abstract public boolean appendSpec(RiTHMSpecification Spec);
	
	/**Remove a specification of type <Formula>
	 * @param a specification of type <Formula>
	 * @return whether the removal was successful*/
	abstract public boolean removeSpec(RiTHMSpecification Spec);
	
	/**Get the results of the validation of loaded specifications
	 * @return a collection of type <T1>*/
	abstract public List<Boolean> validationResults();
	
	/**Export the specifications in a different syntax
	 * @param a collection of type <T2>
	 * @return whether the export is successful*/
	abstract public boolean exportSpecs(RiTHMSpecificationCollection Specs);
	
	/**Rewrite the specifications in a different syntax
	 * @param a collection of type <T2>
	 * @return whether the rewrite is successful*/
	abstract public boolean rewriteSpecs(RiTHMSpecificationCollection Specs);
	
	/**Returns the currently loaded specifications
	 * @return a collection of type <T2>*/
	abstract public RiTHMSpecificationCollection getSpecs();
	
	/**Returns the predicates of currently loaded specifications
	 * @return a collection of type <T3>*/
	abstract public ArrayList<RiTHMPredicate> getPredicates();
	
	/**Returns the error messages (if any) of the specifications whose loading was attempted
	 * @return a collection of type <T4>*/
	abstract public HashMap<RiTHMSpecification, String> getErrorMessages();
	
	/**Clears the error history of the attempted loads*/
	abstract public void clearErrors();
	
	/**Returns the error messages for a particular Formula
	 * @param The specification of type <Formula>
	 * @return Error Message <T4>*/
	abstract public String getErrorforSpec(RiTHMSpecification Spec);
	
	/**Clears all the loaded specifications 
	 * @return whether the removal was successful*/
	abstract public boolean removeAllSpecs();
	
	// TODO change to rithm types
	abstract public ArrayList<String> getPredsForSpec(String spec);
	
	abstract public String rewriteSpec(RiTHMSpecification spec);
}
