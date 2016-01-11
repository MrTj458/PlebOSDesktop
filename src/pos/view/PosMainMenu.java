package pos.view;

import pos.controller.PosController;
import javax.swing.*;
import java.awt.Color;

public class PosMainMenu extends JPanel
{
	private SpringLayout baseLayout;
	private PosController baseController;
	private JLabel placeHolder;
	private JMenuBar menuBar;
	
	/**
	 * This class will be the main menu for the whole program.
	 * It will be the connection between all apps added to this program.
	 * @param baseController
	 */
	public PosMainMenu(PosController baseController)
	{
		baseLayout = new SpringLayout(); 
		this.baseController = baseController;
		placeHolder = new JLabel("Main Menu");
		menuBar = new JMenuBar();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(placeHolder);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, placeHolder, 293, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, placeHolder, 274, SpringLayout.WEST, this);
		setBackground(Color.WHITE);
	}
	
	private void setupListeners()
	{
		
	}
}
