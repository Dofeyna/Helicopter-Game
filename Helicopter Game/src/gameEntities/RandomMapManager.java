package gameEntities;

import javax.swing.*;

public class RandomMapManager {
	
	private ImageIcon backgroundImage;
	private int wallCounter;
	private final int MAXHEIGHT = 500;
	private final int MINHEIGHT = 140;
	public RandomMapManager(){
		wallCounter = 0;
	}
	
	public ImageIcon getBackgroundImage()
	{
		return backgroundImage;
	}
	
	public void setBackgroundImage( ImageIcon backgroundImage)
	{
		this.backgroundImage = backgroundImage;
	}
	public Wall createRandomWall(){
		wallCounter++;
		String s = "Wall";
		Wall w = new Wall (s, 750, randomYGenerator());
		return w;
	}
	private int randomYGenerator(){
		int randomInt = MINHEIGHT + (int)(Math.random()*MAXHEIGHT);
		return randomInt;
	}
	

}
