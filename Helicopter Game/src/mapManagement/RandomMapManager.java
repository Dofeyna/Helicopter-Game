package mapManagement;

import gameEntities.*;

import javax.swing.*;

public class RandomMapManager {
	
	private ImageIcon backgroundImage;
	private final int MAXHEIGHT = 500;
	private final int MINHEIGHT = 140;
	public RandomMapManager(){
	
	}
	public ImageIcon getBackgroundImage()
	{
		return backgroundImage;
	}
	
	public void setBackgroundImage( ImageIcon backgroundImage)
	{
		this.backgroundImage = backgroundImage;
	}
	public GameObject createRandomWall(int i, String path){
		if(i == 0){
			String s = "Wall";
			Wall w = new Wall (path, s, 750, randomYGenerator());
			return w;
		}
		else{
			String s = "Diamond";
			Diamond d = new Diamond (path, s, 750, randomYGenerator());
			return d;
		}
	}
	private int randomYGenerator(){
		int randomInt = MINHEIGHT + (int)(Math.random()*MAXHEIGHT);
		return randomInt;
	}
	public Wall arrangeBoundryWalls (String path) {
		return new Wall (path, "Wall", 770, 500 + (int) (Math.random()*60) );
	}
	public Wall arrangeUpperBoundryWalls (String path) {
		return new Wall (path, "Wall", 770, (-50 + (int) (Math.random()*60)) );
	}
}
