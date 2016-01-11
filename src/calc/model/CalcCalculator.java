package calc.model;

public class CalcCalculator
{
	private double num1;
	private double num2;
	private String function;

	public CalcCalculator()
	{
		this.num1 = 0;
		this.num2 = 0;
		function = "add";
	}

	public double multiply()
	{
		num1 = num1 * num2;
		num2 = 0;
		return num1;
	}
	
	public double getNum1()
	{
		return num1;
	}

	public void setNum1(double num1)
	{
		this.num1 = num1;
	}

	public double getNum2()
	{
		return num2;
	}

	public void setNum2(double num2)
	{
		this.num2 = num2;
	}

}
