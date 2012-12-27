package gameLogic;

import GUIManager.GUIManager;
import java.awt.Dimension;
import java.util.ArrayList;

import gameEntities.*;
import userInterface.*;

import javax.swing.JFrame;

import mapManagement.RandomMapManager;

import dataManagement.FileManager;


public class GameEngine {

	public final int HELICOPTERX = 150;
	public final int HELICOPTERY = 150;
	private final int MAXIMUM_OBJECTS = 10;
	boolean init = true;
	private Helicopter helicopter;
    private GUIManager guiManager;
	private RandomMapManager randomMapManager;
	private CollisionManager collisionManager;
	Wall wall1;
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	final int ACCELERATION=5;
	//GameCanvas canvas;
	private double randomCaller;
	private String helicopterPath;
	
	private int objectsCount;
	
	public static void main (String [] args){
		GameEngine engine = new GameEngine();
	}

	public GameEngine() {
		initializition();
		play();
		
	}
	public void initializition(){
		if(init){
			objectsCount = 2;
			FileManager fm = new FileManager();
			helicopterPath = fm.getHelicopterSkin(0);
			collisionManager = new CollisionManager();
			//canvas = new GameCanvas();
			randomMapManager = new RandomMapManager();
			helicopter = new Helicopter(helicopterPath, "bir", HELICOPTERX, HELICOPTERY);
			objects.add(helicopter);
			guiManager = new GUIManager();
			guiManager.getCanvas().addImage(objects.get(0).getImageIcon(), objects.get(0).getPosX(),objects.get(0).getPosY());
                        
			guiManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
			guiManager.setResizable(false); //don't allow the user to resize the window
			guiManager.setSize(new Dimension(800,640));
			guiManager.setVisible(true);
			guiManager.setLocationRelativeTo(null);
			randomCaller = 0 + (Math.random()*1);
		}
		init = false;
	}
	
	public void play(){
		long speed = System.currentTimeMillis();
		while(true){
			System.out.print("");
			while(guiManager.getGameLoop()){
				if(speed < System.currentTimeMillis()-10){
					update();
					speed = System.currentTimeMillis();
				}
			if( collisionManager.checkCollision(objects) == "Wall"){
					guiManager.setGameLoop(false);
				}
			}
		}
	}
	public void update(){
		guiManager.getCanvas().addRandomWall(randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getImage(), 
				randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getPosX(), 
				randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getPosY());
		guiManager.getCanvas().addRandomUpperWall(randomMapManager.arrangeUpperBoundryWalls("rsc/wall.PNG").getImage(), 
				randomMapManager.arrangeUpperBoundryWalls("rsc/wall.PNG").getPosX(), 
				randomMapManager.arrangeUpperBoundryWalls("rsc/wall.PNG").getPosY());
		if(randomCaller < 1)
			randomCaller += 0.003;
		else{
			if(objects.size() <= MAXIMUM_OBJECTS){
				objects.add(randomMapManager.createRandomWall("rsc/wall.PNG"));
				guiManager.getCanvas().addImage(objects.get(objects.size() - 1).getImageIcon(), 
						objects.get(objects.size() - 1).getPosX(),objects.get(objects.size() - 1).getPosY());
				objectsCount++;
			}
			else{
				if(objectsCount > MAXIMUM_OBJECTS)
					objectsCount = 2;
				objects.set(objectsCount, randomMapManager.createRandomWall("rsc/wall.PNG"));
				guiManager.getCanvas().setImage(objects.get(objectsCount).getImageIcon(), 
						objects.get(objectsCount).getPosX(),objects.get(objectsCount).getPosY(), objectsCount);
				objectsCount++;
			}
			randomCaller = 0 + (Math.random()*1);
		}
		if(guiManager.getCanvas().getLog() == 1){
			objects.get(0).setPosY(objects.get(0).getPosY() - 2);
			
		}
		else
			objects.get(0).setPosY(objects.get(0).getPosY() + 2);
			
		
		for(int count = 1; count < objects.size(); count++){
			objects.get(count).setPosX(objects.get(count).getPosX() - 3);
			
		}
		for(int count = 0; count < objects.size(); count++){
			guiManager.getCanvas().setImage(objects.get(count).getImageIcon(), objects.get(count).getPosX(),
			objects.get(count).getPosY(), count + 1);
			
		}
	}

}
