package pos.apps.calc.model;

public class CalcCalculator
{
	private double num1;
	private double num2;
	private String function;

	public CalcCalculator()
	{
		this.num1 = 0;
		this.num2 = 0;
		function = "";
	}
	
	public void functionClicked(String function)
	{
		if(num2 != 0)
		{
			if(function.equals("+"))
			{
				num2 = num2 + num1;
			}
			else if(function.equals("-"))
			{
				num2 = num2 - num1;
			}
			else if(function.equals("*"))
			{
				num2 = num2 * num1;
			}
			else if(function.equals("/"));
			{
				num2 = num2 / num1;
			}
		}
		else
		{
			num2 = num1;
		}
		num1 = 0;
		this.function = function;
	}
	
	public void solve()
	{
		if(function.equals("+"))
		{
			num1 = num2 + num1;
		}
		else if(function.equals("-"))
		{
			num1 = num2 - num1;
		}
		else if(function.equals("*"))
		{
			num1 = num2 * num1;
		}
		else if(function.equals("/"))
		{
			num1 = num2 / num1;
		}
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

	public String getFunction()
	{
		return function;
	}

	public void setFunction(String function)
	{
		this.function = function;
	}

}
