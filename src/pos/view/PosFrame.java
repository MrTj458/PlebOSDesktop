package pos.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import pos.controller.PosController;

public class PosFrame extends JFrame
{
	private PosController baseController;
	private JMenuBar menuBar;
	private JMenu optionsMenu;
	private JMenuItem settingsButton;
	private JMenuItem quitButton;
	
	public PosFrame(PosController baseController)
	{
		this.baseController = baseController;
		menuBar = new JMenuBar();
		optionsMenu = new JMenu("Options");
		settingsButton = new JMenuItem("Settings");
		quitButton = new JMenuItem("Quit");
		
		setupFrame();
		setupMenu();
		setupMenuListeners();
	}
	
	private void setupFrame()
	{
		this.setResizable(false);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setTitle("Pleb OS | " + baseController.getVariable().getVersion());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void setupMenu()
	{
		this.setJMenuBar(menuBar);
		menuBar.add(optionsMenu);
		optionsMenu.add(settingsButton);
		optionsMenu.addSeparator();
		optionsMenu.add(quitButton);
	}
	
	private void setupMenuListeners()
	{
		settingsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.out.println("Settings Clicked");
			}
		});
		
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.exit(0);
				System.out.println("Exit Clicked");
			}
		});
	}
	
	public void changePanel(JPanel panel, boolean menuOn)
	{
		this.setContentPane(panel);
		this.validate();
		
		if(menuOn)
		{
			menuBar.setVisible(true);
		}
		else
		{
			menuBar.setVisible(false);
		}
	}
}
