package calc.view;

import javax.swing.JPanel;

import calc.controller.CalcController;

public class CalcPanel extends JPanel
{
	private CalcController baseCalcController;
	
	public CalcPanel(CalcController baseCalcController)
	{
		this.baseCalcController = baseCalcController;
	}
}
