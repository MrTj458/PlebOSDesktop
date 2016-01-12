package calc.controller;

import calc.view.*;
import calc.model.*;

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
