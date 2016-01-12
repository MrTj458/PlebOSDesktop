package pos.main.view;

import pos.main.controller.PosController;

import javax.swing.*;

import java.awt.Color;

/**
 * This class is the logo panel.
 * This class will hold the logo and company information later on.
 * @author MrTj458
 */
public class PosLogoPanel extends JPanel
{
	private SpringLayout baseLayout;
	private PosController baseController;
	private JLabel placeholder;
	
	public PosLogoPanel(PosController baseController)
	{
		baseLayout = new SpringLayout();
		this.baseController = baseController;
		placeholder = new JLabel("Logo Goes Here");
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(placeholder);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, placeholder, 293, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, placeholder, 262, SpringLayout.WEST, this);
		setBackground(Color.BLUE);
		placeholder.setForeground(Color.PINK);
	}

}
