package pos.apps.calc.view;

import javax.swing.JFrame;

import pos.apps.calc.controller.CalcController;

public class CalcFrame extends JFrame
{
	private CalcController baseCalcController;
	private CalcPanel basePanel;
	
	public CalcFrame(CalcController baseCalcController)
	{
		this.baseCalcController = baseCalcController;
		basePanel = new CalcPanel(baseCalcController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(300, 280);
		this.setTitle(" Pleb OS | Calculator");
		this.setVisible(true);
	}
}
