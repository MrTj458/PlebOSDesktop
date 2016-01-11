package pos.controller;

import pos.view.*;
import pos.model.PosGlobalVariables;

public class PosController
{
	private PosGlobalVariables globalVars;
	private PosFrame baseFrame;
	private PosLogoPanel logoPanel;
	private PosMainMenu mainMenu;
	
	public PosController()
	{
		globalVars = new PosGlobalVariables();
		baseFrame = new PosFrame(this);
		logoPanel = new PosLogoPanel(this);
		mainMenu = new PosMainMenu(this);
	}
	
	public void start()
	{
		baseFrame.changePanel(logoPanel);
		try
		{
			Thread.sleep(3000);
			System.out.println("Waited Sucessful");
		}
		catch (Exception e)
		{
			System.out.println("Error");
		}
		baseFrame.changePanel(mainMenu);
	}
	
	public PosGlobalVariables getVariable()
	{
		return globalVars;
	}
}
