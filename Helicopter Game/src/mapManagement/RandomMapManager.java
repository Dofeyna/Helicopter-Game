package mapManagement;

import gameEntities.Wall;

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
	public Wall createRandomWall(String path){
		wallCounter++;
		String s = "Wall";
		Wall w = new Wall (path, s, 750, randomYGenerator());
		return w;
	}
	private int randomYGenerator(){
		int randomInt = MINHEIGHT + (int)(Math.random()*MAXHEIGHT);
		return randomInt;
	}
	public Wall arrangeBoundryWalls (String path) {
		return new Wall (path, "Wall", 770, 500 + (int) (Math.random()*60) );
	}
}
