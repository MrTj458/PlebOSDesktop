package pos.apps.magic8.model;

import java.util.ArrayList;

public class Magic8Ball
{
	private ArrayList<String> answerList;
	
	public Magic8Ball()
	{
		answerList = new ArrayList<String>();
		
		setupAnswerList();
	}
	
	private void setupAnswerList()
	{
		answerList.add("Yes.");
		answerList.add("No.");
		answerList.add("Maybe");
		answerList.add("Most definately.");
		answerList.add("Ask again later.");
		answerList.add("You need to talk to someone aboot that.");
		answerList.add("You want some mapel suyrup eh?");
		answerList.add("It's not going to be like that Trevor.");
		answerList.add("dflskdlfks;kldfsdfjkls");
		answerList.add("adskfjklsdfj");
	}
	
	public String getAnswer()
	{
		String answer;
		
		int randomNum = (int) (Math.random() * answerList.size());
		answer = answerList.get(randomNum);
		
		return answer;
	}
}
