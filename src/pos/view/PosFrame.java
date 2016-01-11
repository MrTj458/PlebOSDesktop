package pos.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import pos.controller.PosController;

/**
 * This calss is the Frame for all of the GUI components.
 * @author MrTj458
 */
public class PosFrame extends JFrame
{
	private PosController baseController;
	private JMenuBar menuBar;
	private JMenu optionsMenu;
	private JMenu settingsSubMenu;
	private JMenuItem whiteSetting, graySetting, randomSetting;
	private JMenuItem quitButton;
	
	public PosFrame(PosController baseController)
	{
		this.baseController = baseController;
		menuBar = new JMenuBar();
		
		optionsMenu = new JMenu("Options");
		settingsSubMenu = new JMenu("Settings");
		whiteSetting = new JMenuItem("WhiteBackground");
		graySetting = new JMenuItem("Gray background");
		randomSetting = new JMenuItem("Random background");
		quitButton = new JMenuItem("Quit");
		
		setupFrame();
		setupMenu();
		setupMenuListeners();
	}
	
	/**
	 * Sets up the frame's required settings.
	 */
	private void setupFrame()
	{
		this.setResizable(false);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setTitle("Pleb OS | " + baseController.getVariable().getVersion());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/**
	 * Adds in the menu and all of it's components.
	 */
	private void setupMenu()
	{
		
		this.setJMenuBar(menuBar); //Adds the JMenuBar to this frame
		menuBar.add(optionsMenu); //Adds the Options tab at the top of the menu.
		optionsMenu.add(settingsSubMenu); //Adds the settings sub-menu to the Options tab.
		
		//Adds all of the options in the settings sub-menu.
		//The settings sub-menu will be replaced with a settings panel once the sub-menu gets overcrowded.
		settingsSubMenu.add(whiteSetting);
		settingsSubMenu.add(graySetting);
		settingsSubMenu.add(randomSetting);
		
		optionsMenu.addSeparator(); //Adds the separator line between Settings and Quit.
		optionsMenu.add(quitButton); //Adds the quit button to the options tab.
	}
	
	/**
	 * Sets up the listeners for all of the JMenuitems.
	 */
	private void setupMenuListeners()
	{
		whiteSetting.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.getMainMenu().setBackground(Color.WHITE);
				System.out.println("White background");
			}
		});
		
		graySetting.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.getMainMenu().setBackground(Color.GRAY);
				System.out.println("Gray background");
			}
		});
		
		randomSetting.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int r, b, g;
				
				r = (int) (Math.random() * 256);
				b = (int) (Math.random() * 256);
				g = (int) (Math.random() * 256);
				
				baseController.getMainMenu().setBackground(new Color(r, b, g));
				
				System.out.println("Random background");
			}
		});
		
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.out.println("Exit Clicked");
				System.exit(0);
			}
		});
	}
	
	/**
	 * Changes the panel that the frame is currently showing.
	 * @param panel The panel the frame will display.
	 * @param showMenu Weather or not the JMenuBar is visible.
	 */
	public void changePanel(JPanel panel, boolean showMenu)
	{
		this.setContentPane(panel);
		//Refreshes the frame.
		this.validate();
		
		//Checks weather or not to show the JMenuBar.
		if(showMenu)
		{
			menuBar.setVisible(true);
		}
		else
		{
			menuBar.setVisible(false);
		}
	}
}
