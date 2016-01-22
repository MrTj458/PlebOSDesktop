package pos.apps.magic8.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import pos.apps.magic8.controller.Magic8Controller;

public class Magic8Panel extends JPanel
{
	private Magic8Controller baseMagicController;
	private SpringLayout baseLayout;
	private JButton rollButton;
	private JLabel ballImage;
	private JLabel answerLabel;
	
	public Magic8Panel(Magic8Controller baseMagicController)
	{
		this.baseMagicController = baseMagicController;
		baseLayout = new SpringLayout();
		rollButton = new JButton("Click to shake");
		ballImage = new JLabel(new ImageIcon(getClass().getResource("resources/magic8Ball.gif")));
		answerLabel = new JLabel("Ask a question, then click the button for the answer!");
		answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
		this.add(rollButton);
		this.add(ballImage);
		this.add(answerLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, ballImage, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, ballImage, -171, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rollButton, 151, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rollButton, -45, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, answerLabel, 28, SpringLayout.SOUTH, ballImage);
		baseLayout.putConstraint(SpringLayout.WEST, answerLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, answerLabel, -6, SpringLayout.NORTH, rollButton);
		baseLayout.putConstraint(SpringLayout.EAST, answerLabel, 390, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		rollButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				answerLabel.setText(baseMagicController.getBrain().getAnswer());
			}
		});
	}
}
