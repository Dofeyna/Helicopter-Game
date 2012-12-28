package mapManagement;

import java.util.ArrayList;

import gameEntities.*;

import javax.swing.*;
/**
 *  This class generates random wall objects and arranges positions of them.
 */
public class RandomMapManager {
	
	private ImageIcon backgroundImage;
	private final int MAXHEIGHT = 500;
	private final int MINHEIGHT = 140;
	private final int WALLWIDTH = 2;
	private final int WINDOWWIDTH = 720;
	private int numberOfWalls ;
	private ArrayList<Wall> wallsUp ;
	private ArrayList<Wall> wallsUpFixed ;
	private ArrayList<Wall> wallsDown ;
	private ArrayList<Wall> wallsDownFixed ;

    /** The constructor creates ArrayLists to hold wall blocks that will be painted to top and bottom of the screen.
     *  It arranges the positions of these ArrayLists.
     * */
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
	
	
	/**
	 * @return backgroundImage
	 */
	public ImageIcon getBackgroundImage()
	{
		return backgroundImage;
	}
	
	/**
	 * @param backgroundImage
	 * sets backgroundImage
	 */
	public void setBackgroundImage( ImageIcon backgroundImage)
	{
		this.backgroundImage = backgroundImage;
	}
	
	/**
	 * @param i
	 * @param path
	 * @return GameObject o
	 * Creates wall or diamond object according to parameter i with imagepath path
	 */
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
	
	/**
	 * @return randomInt
	 * calculates a random number that will fit in the screen as a y position
	 */
	private int randomYGenerator(){
		int randomInt = MINHEIGHT + (int)(Math.random()*MAXHEIGHT);
		return randomInt;
	}
	
	/**
	 * @param path
	 * @return Wall w
	 * returns a wall placed in the bottom right of screen
	 */
	public Wall generateBottomWall (String path) {
		return new Wall (path, "Wall", WINDOWWIDTH, 500 );
	}
	/**
	 * @param path
	 * @return Wall w
	 * returns a wall placed in the top right of the screen
	 */
	public Wall generateUpperWall (String path) {
		return new Wall (path, "Wall", WINDOWWIDTH, 0 );
	}
	
	/**
	 * @return WINDOWWIDTH
	 */
	public final int getWindowWidth (){
		return WINDOWWIDTH ;
	}
	
	/**
	 * @return numberOfWalls
	 */
	public int getNumberOfWalls (){
		return numberOfWalls ;
	}
	
	/**
	 * @param i
	 * @return Wall w
	 * returns  ith object in the ArrayList wallsUp
	 *
	 */
	public Wall getWallsUp (int i){
		return wallsUp.get(i) ;
	}
	
	/**
	 * @param i
	 * @return Wall w
	 * returns  ith object in the ArrayList wallsDown
	 *
	 */
	public Wall getWallsDown (int i){
		return wallsDown.get(i) ;
	}
	
	/**
	 * @param i
	 * @return Wall w
	 * @return ith object in the ArrayList wallsDownFixed
	 */
	public Wall getWallsDownFixed (int i){
		return wallsDownFixed.get(i) ;
	}
	
	/**
	 * @param i
	 * @return Wall w
	 * @return ith object in the ArrayList wallsUpFixed
	 */
	public Wall getWallsUpFixed (int i){
		return wallsUpFixed.get(i) ;
	}
	
	/**
	 * @param i
	 * @param w
	 * sets ith element of the ArrayList wallsUp w
	 */
	public void setWallsUp (int i, Wall w){
		wallsUp.set(i, w) ;
	}
	
	/**
	 * @param path
	 * removes the first elements of wallsUp and wallsDown and adds a new wall at the end of the each ArrayList
	 * randomly increments of decrements Y positions of the added elements while they are not intersecting with the game screen
	 */
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
