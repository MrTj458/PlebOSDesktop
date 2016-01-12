package pos.apps.calc.controller;

import pos.apps.calc.model.*;
import pos.apps.calc.view.*;

public class CalcController
{
	private CalcCalculator calculator;
	private CalcFrame calcFrame;
	
	public CalcController()
	{
		calculator = new CalcCalculator();
		calcFrame = new CalcFrame(this);
	}
	
	public void start(){}
	
	public CalcCalculator getCalculator()
	{
		return calculator;
	}
}
