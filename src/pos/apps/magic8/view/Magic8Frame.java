package pos.apps.magic8.view;

import javax.swing.JFrame;
import pos.apps.magic8.controller.Magic8Controller;

public class Magic8Frame extends JFrame
{
	private Magic8Controller baseMagicController;
	private Magic8Panel baseMagicPanel;
	
	public Magic8Frame(Magic8Controller baseMagicController)
	{
		this.baseMagicController = baseMagicController;
		baseMagicPanel = new Magic8Panel(baseMagicController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(baseMagicPanel);
		this.setResizable(false);
		this.setSize(400,400);
		this.setTitle("Magic 8 Ball");
		this.setVisible(true);
	}
}
