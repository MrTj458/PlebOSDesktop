package calc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import calc.controller.CalcController;

public class CalcPanel extends JPanel
{
	private CalcController baseCalcController;
	private SpringLayout baseLayout;
	private JLabel numberLabel;
	private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, funcPlus, funcMinus, funcMultiply, funcDivide, funcEquals, clearButton;

	public CalcPanel(CalcController baseCalcController)
	{
		this.baseCalcController = baseCalcController;
		baseLayout = new SpringLayout();
		numberLabel = new JLabel("0");
		num0 = new JButton("0");
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		funcPlus = new JButton("+");
		funcMinus = new JButton("-");
		funcMultiply = new JButton("*");
		funcDivide = new JButton("/");
		funcEquals = new JButton("=");
		clearButton = new JButton("Clear");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(numberLabel);
		this.add(num0);
		this.add(num1);
		this.add(num2);
		this.add(num3);
		this.add(num4);
		this.add(num5);
		this.add(num6);
		this.add(num7);
		this.add(num8);
		this.add(num9);
		this.add(funcPlus);
		this.add(funcMinus);
		this.add(funcMultiply);
		this.add(funcDivide);
		this.add(funcEquals);
		this.add(clearButton);
	}

	private void setupLayout()
	{
		numberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		numberLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		numberLabel.setForeground(Color.BLACK);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 51, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, num8, -65, SpringLayout.WEST, num9);
		numberLabel.setBackground(Color.LIGHT_GRAY);
		baseLayout.putConstraint(SpringLayout.SOUTH, num1, 29, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, num2, 105, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.NORTH, num2, 6, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, num2, 55, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.EAST, num1, 60, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, num0, 55, SpringLayout.EAST, funcPlus);
		baseLayout.putConstraint(SpringLayout.NORTH, num1, 6, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, num9, 6, SpringLayout.SOUTH, num6);
		baseLayout.putConstraint(SpringLayout.NORTH, num5, 6, SpringLayout.SOUTH, num2);
		baseLayout.putConstraint(SpringLayout.WEST, num5, 55, SpringLayout.EAST, num4);
		baseLayout.putConstraint(SpringLayout.WEST, num8, 55, SpringLayout.EAST, num7);
		baseLayout.putConstraint(SpringLayout.NORTH, num0, 6, SpringLayout.SOUTH, num8);
		baseLayout.putConstraint(SpringLayout.NORTH, clearButton, 6, SpringLayout.SOUTH, funcEquals);
		baseLayout.putConstraint(SpringLayout.WEST, clearButton, 112, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, clearButton, -113, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, funcEquals, 6, SpringLayout.SOUTH, num0);
		baseLayout.putConstraint(SpringLayout.WEST, funcEquals, 55, SpringLayout.EAST, funcMultiply);
		baseLayout.putConstraint(SpringLayout.EAST, funcEquals, -65, SpringLayout.WEST, funcDivide);
		baseLayout.putConstraint(SpringLayout.NORTH, num8, 6, SpringLayout.SOUTH, num5);
		baseLayout.putConstraint(SpringLayout.WEST, num9, 0, SpringLayout.WEST, num3);
		baseLayout.putConstraint(SpringLayout.NORTH, num6, 6, SpringLayout.SOUTH, num3);
		baseLayout.putConstraint(SpringLayout.WEST, num6, 0, SpringLayout.WEST, num3);
		baseLayout.putConstraint(SpringLayout.EAST, num0, -65, SpringLayout.WEST, funcMinus);
		baseLayout.putConstraint(SpringLayout.NORTH, funcMultiply, 6, SpringLayout.SOUTH, funcPlus);
		baseLayout.putConstraint(SpringLayout.WEST, funcMultiply, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, num5, -65, SpringLayout.WEST, num6);
		baseLayout.putConstraint(SpringLayout.EAST, funcMultiply, 0, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.NORTH, funcPlus, 6, SpringLayout.SOUTH, num7);
		baseLayout.putConstraint(SpringLayout.NORTH, funcMinus, 6, SpringLayout.SOUTH, num9);
		baseLayout.putConstraint(SpringLayout.NORTH, funcDivide, 6, SpringLayout.SOUTH, funcMinus);
		baseLayout.putConstraint(SpringLayout.WEST, funcDivide, 0, SpringLayout.WEST, num3);
		baseLayout.putConstraint(SpringLayout.WEST, funcMinus, 0, SpringLayout.WEST, num3);
		baseLayout.putConstraint(SpringLayout.WEST, funcPlus, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, funcPlus, 0, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.WEST, num1, 10, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, num4, 6, SpringLayout.SOUTH, num1);
		baseLayout.putConstraint(SpringLayout.WEST, num4, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, num4, 0, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.NORTH, num7, 6, SpringLayout.SOUTH, num4);
		baseLayout.putConstraint(SpringLayout.WEST, num7, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, num7, 0, SpringLayout.EAST, num1);
		baseLayout.putConstraint(SpringLayout.NORTH, num3, 6, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, num3, -50, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, num3, 0, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, num6, 0, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, num9, 0, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, funcMinus, 0, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, funcDivide, 0, SpringLayout.EAST, numberLabel);
	}

	private void setupListeners()
	{
		num0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(0);
			}
		});

		num1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(1);
			}
		});

		num2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(2);
			}
		});

		num3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(3);
			}
		});

		num4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(4);
			}
		});

		num5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(5);
			}
		});

		num6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(6);
			}
		});

		num7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(7);
			}
		});

		num8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(8);
			}
		});

		num9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				numberClicked(9);
			}
		});

		funcPlus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().functionClicked("+");
				refresh("+");
			}
		});

		funcMinus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().functionClicked("-");
				refresh("-");
			}
		});

		funcMultiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().functionClicked("*");
				refresh("*");
			}
		});

		funcDivide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().functionClicked("/");
				refresh("/");
			}
		});

		funcEquals.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().solve();
				refresh();
			}
		});

		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseCalcController.getCalculator().setNum1(0);
				baseCalcController.getCalculator().setNum2(0);
				baseCalcController.getCalculator().setFunction("+");
				refresh();
			}
		});
	}

	private void numberClicked(double number)
	{
		baseCalcController.getCalculator().setNum1((baseCalcController.getCalculator().getNum1() * 10) + number);
		refresh();
	}

	private void refresh()
	{
		numberLabel.setText(Double.toString(baseCalcController.getCalculator().getNum1()));
	}
	
	private void refresh(String func)
	{
		numberLabel.setText(func);
	}
}
