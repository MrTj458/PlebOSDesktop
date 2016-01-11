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
		setBackground(Color.GREEN);
	}
	
	private void setupListeners()
	{
		
	}
}
