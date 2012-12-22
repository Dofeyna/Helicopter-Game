package gameLogic;

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
	private JFrame GameFrame;
	boolean init = true;
	private Helicopter helicopter;
	private RandomMapManager randomMapManager;
	private CollisionManager collisionManager;
	Wall wall1;
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	final int ACCELERATION=5;
	GameCanvas canvas;
	private double randomCaller;
	private boolean gameLoop = true;
	private String helicopterPath;
	
	public static void main (String [] args){
		GameEngine engine = new GameEngine();
	}

	public GameEngine() {
		initializition();
		play();
		
	}
	public void initializition(){
		if(init){
			FileManager fm = new FileManager();
			helicopterPath = fm.getHelicopterSkin(0);
			collisionManager = new CollisionManager();
			canvas = new GameCanvas();
			randomMapManager = new RandomMapManager();
			helicopter = new Helicopter(helicopterPath, "bir", HELICOPTERX, HELICOPTERY);
			objects.add(helicopter);
			canvas.addImage(objects.get(0).getImageIcon(), objects.get(0).getPosX(),objects.get(0).getPosY());
			GameFrame = new JFrame("Helicopter Game"); 
			GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
			GameFrame.setResizable(false); //don't allow the user to resize the window
			GameFrame.setSize(new Dimension(800,640));
			GameFrame.setVisible(true);
			GameFrame.setLocationRelativeTo(null);
			GameFrame.add(canvas);
			randomCaller = 0 + (Math.random()*1);
		}
		init = false;
	}
	public void play(){
		long speed = System.currentTimeMillis();
		while(gameLoop){
			if(speed < System.currentTimeMillis()-10){
				update();
				speed = System.currentTimeMillis();
			}
			if( collisionManager.checkCollision(objects) == "Wall"){
				gameLoop = false;
			}
		}
	}
	public void update(){
		canvas.addRandomWall(randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getImage(), 
				randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getPosX(), 
				randomMapManager.arrangeBoundryWalls("rsc/wall.PNG").getPosY());
		if(randomCaller < 1)
			randomCaller += 0.003;
		else{
			objects.add(randomMapManager.createRandomWall("rsc/wall.PNG"));
			randomCaller = 0 + (Math.random()*1);
			canvas.addImage(objects.get(objects.size() - 1).getImageIcon(), 
					objects.get(objects.size() - 1).getPosX(),objects.get(objects.size() - 1).getPosY());
		}
		if(canvas.getLog() == 1){
			objects.get(0).setPosY(objects.get(0).getPosY() - 2);
		}
		else
			objects.get(0).setPosY(objects.get(0).getPosY() + 2);
		
		for(int count = 1; count < objects.size(); count++){
			objects.get(count).setPosX(objects.get(count).getPosX() - 3);
		}
		for(int count = 0; count < objects.size(); count++){
			canvas.setImage(objects.get(count).getImageIcon(), objects.get(count).getPosX(),
					objects.get(count).getPosY(), count + 1);
		}
	}

}
