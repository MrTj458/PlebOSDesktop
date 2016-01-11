package pos.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import pos.controller.PosController;

public class PosFrame extends JFrame
{
	private PosController baseController;
	
	public PosFrame(PosController baseController)
	{
		this.baseController = baseController;
		
		setupFrame();
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
	
	public void changePanel(JPanel panel)
	{
		this.setContentPane(panel);
		this.validate();
	}
}
