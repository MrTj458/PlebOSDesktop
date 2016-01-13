package pos.main.controller;

import javax.swing.JPanel;

import pos.apps.calc.controller.CalcController;
import pos.apps.magic8.controller.Magic8Controller;
import pos.main.model.PosGlobalVariables;
import pos.main.view.PosFrame;
import pos.main.view.PosLogoPanel;
import pos.main.view.PosMainMenu;

/**
 * This class is the main controller for the program.
 * @author MrTj458
 */
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
		//Sets the content pane of the frame to the logo panel.
		baseFrame.changePanel(logoPanel, false);
		System.out.println("Logo panel");
		//Waits 1.5 seconds.
		try
		{
			Thread.sleep(1500);
			System.out.println("Waited Sucessful");
		}
		catch (Exception e)
		{
			System.out.println("Error");
		}
		//Sets the content pane of the frame to the main menu and enables the menu.
		baseFrame.changePanel(mainMenu, true);
		System.out.println("Main menu");
	}
	
	public void launchCalc()
	{
		CalcController calculator = new CalcController();
		calculator.start();
	}
	
	public void launchMagic8()
	{
		Magic8Controller magic8 = new Magic8Controller();
		magic8.start();
	}
	
	/**
	 * Returns the mainMenu JPanel.
	 * @return mainMenu
	 */
	public JPanel getMainMenu()
	{
		return mainMenu;
	}
	
	/**
	 * Returns the PosGlobalVariables class to access it's contents.
	 * @return
	 */
	public PosGlobalVariables getVariable()
	{
		return globalVars;
	}
}
