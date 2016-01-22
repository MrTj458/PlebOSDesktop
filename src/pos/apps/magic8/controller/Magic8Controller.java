package pos.apps.magic8.controller;

import pos.apps.magic8.view.Magic8Frame;
import pos.apps.magic8.model.Magic8Ball;

public class Magic8Controller
{
	private Magic8Ball magicBrain;
	private Magic8Frame baseFrame;
	
	public Magic8Controller()
	{
		magicBrain = new Magic8Ball();
		baseFrame = new Magic8Frame(this);
	}
	
	public void start()
	{
		
	}
	
	public Magic8Ball getBrain()
	{
		return magicBrain;
	}
}
