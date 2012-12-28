package mapManagement;

import java.util.ArrayList;

import gameEntities.*;

import javax.swing.*;

public class RandomMapManager {
	
	private ImageIcon backgroundImage;
	private final int MAXHEIGHT = 500;
	private final int MINHEIGHT = 140;
	private final int WALLWIDTH = 2;
	private final int WINDOWWIDTH = 720;
	private int numberOfWalls ;
	ArrayList<Wall> wallsUp ;
	ArrayList<Wall> wallsUpFixed ;
	ArrayList<Wall> wallsDown ;
	ArrayList<Wall> wallsDownFixed ;

	
	public RandomMapManager(){
		
		numberOfWalls = WINDOWWIDTH / WALLWIDTH ;
		wallsUp = new ArrayList<Wall> ();
		wallsUpFixed = new ArrayList<Wall> ();
		wallsDown = new ArrayList<Wall> ();
		wallsDownFixed = new ArrayList<Wall> ();
		for (int i=0, j=720 ; i<numberOfWalls ; i++, j = j-WALLWIDTH){
			wallsUp.add(generateUpperWall("rsc/wall.PNG"));
			wallsUp.get(i).setPosX(wallsUp.get(i).getPosX()- j) ;
			
			wallsUpFixed.add(new Wall("rsc/wall.PNG", "Wall", WINDOWWIDTH-j, -20));
		}
		for (int i=0, j=720 ; i<numberOfWalls ; i++, j = j-WALLWIDTH){
			wallsDown.add(generateBottomWall("rsc/wall.PNG"));
			wallsDown.get(i).setPosX(wallsDown.get(i).getPosX()- j) ;
			
			wallsDownFixed.add(new Wall("rsc/wall.PNG", "Wall", WINDOWWIDTH-j, 500));
		}
		
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
	public Wall generateBottomWall (String path) {
		return new Wall (path, "Wall", WINDOWWIDTH, 500 );
	}
	public Wall generateUpperWall (String path) {
		return new Wall (path, "Wall", WINDOWWIDTH, 0 );
	}
	
	public final int getWindowWidth (){
		return WINDOWWIDTH ;
	}
	
	public int getNumberOfWalls (){
		return numberOfWalls ;
	}
	
	public Wall getWallsUp (int i){
		return wallsUp.get(i) ;
	}
	
	public Wall getWallsDown (int i){
		return wallsDown.get(i) ;
	}
	public Wall getWallsDownFixed (int i){
		return wallsDownFixed.get(i) ;
	}
	public Wall getWallsUpFixed (int i){
		return wallsUpFixed.get(i) ;
	}
	public void setWallsUp (int i, Wall w){
		wallsUp.set(i, w) ;
	}
	
	public void updateWalls (String path){
		wallsUp.remove(0);
		wallsDown.remove(0);
		for (int i=0 ; i<numberOfWalls-1 ; i++){
			wallsUp.get(i).setPosX(wallsUp.get(i).getPosX()- WALLWIDTH) ;
			wallsDown.get(i).setPosX(wallsDown.get(i).getPosX()- WALLWIDTH) ;
			
		}
		wallsUp.add(new Wall(path, "Wall", 720, ((wallsUp.get(wallsUp.size()-1).getPosY()-1) + (int) (Math.random()*3)))) ;
		while (wallsUp.get(wallsUp.size()-1).getPosY() < -30 || wallsUp.get(wallsUp.size()-1).getPosY() > 30 ){
			wallsUp.get(wallsUp.size()-1).setPosY((wallsUp.get(wallsUp.size()-1).getPosY()-1) + (int) (Math.random()*3));
		}
		wallsDown.add(new Wall(path, "Wall", 720, ((wallsDown.get(wallsDown.size()-1).getPosY()-1) + (int) (Math.random()*3)))) ;
		while (wallsDown.get(wallsDown.size()-1).getPosY() < 450 || wallsDown.get(wallsDown.size()-1).getPosY() > 700 ){
			wallsDown.get(wallsDown.size()-1).setPosY((wallsDown.get(wallsDown.size()-1).getPosY()-1) + (int) (Math.random()*3));
		}
	}
}
