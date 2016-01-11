package pos.model;

/**
 * This class holds variables that all classes can access.
 * This class will soon be written to a file to be saved.
 * It will save all of the settings that the user has set.
 * It will also save any other needed information.
 * @author MrTj458
 */
public class PosGlobalVariables
{
	private String version; //Saved as a string for displaying purposes.
	
	public PosGlobalVariables()
	{
		this.version = "Pre-Alpha 0.1";
	}
	
	public String getVersion()
	{
		return version;
	}
}
