package gameLogic;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import gameEntities.*;
import javax.swing.JFrame;
import userInterface.GUIManager;
import mapManagement.RandomMapManager;
import dataManagement.FileManager;

public class GameEngine {

	public final int HELICOPTERX = 150;
	public final int HELICOPTERY = 150;
	private final int MAXIMUM_OBJECTS = 50;
	boolean init = true;
	private Helicopter helicopter;
    private GUIManager guiManager;
	private CollisionManager collisionManager;
	Wall wall1;
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	final int ACCELERATION=5;
	private double randomCaller;
	private String helicopterPath;
	private double score;
	private int randomObject;
	private String highScore;
	private int highScoreInt;
	private int totalScore = 0;
	private int objectsCount;
	private FileManager fm;
	private String backgroundPath = "";
	
	public static void main (String [] args) throws FileNotFoundException{
		GameEngine engine = new GameEngine();
	}

	public GameEngine() throws FileNotFoundException {
		initializition();
		play();
		
	}
	public void initializition(){
		if(init){
			guiManager = new GUIManager();
			score = 0;
			objectsCount = 2;
			fm = new FileManager();
            highScore = fm.getHighScore();  
            guiManager.setHighScoreLabel(highScore);
			guiManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
			guiManager.setResizable(false); //don't allow the user to resize the window
			guiManager.setSize(new Dimension(800,700));
			guiManager.setVisible(true);
			guiManager.setLocationRelativeTo(null);
			randomCaller = 0 + (Math.random()*1);
			
			collisionManager = new CollisionManager();
		}
		init = false;
	}
	public void init() throws FileNotFoundException
	{
		objects.clear();
		guiManager.setCanvas();
		score = 0;
		objectsCount = 2;
		fm = new FileManager();
        highScore = fm.getHighScore();  
        guiManager.setHighScoreLabel(highScore);
		guiManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
		guiManager.setResizable(false); //don't allow the user to resize the window
		guiManager.setSize(new Dimension(800,700));
		guiManager.setVisible(true);
		guiManager.setLocationRelativeTo(null);
		randomCaller = 0 + (Math.random()*1);
		
		collisionManager = new CollisionManager();
		new RandomMapManager();
		this.play();
	}
	
	public void play() throws FileNotFoundException{
		long speed = System.currentTimeMillis();
		long boundrySpeed = System.currentTimeMillis();
		int skinSelect = 0;
		while(true){
			System.out.print("");
			
			while(guiManager.getGameLoop()){
				if(skinSelect == 0){
					backgroundPath = fm.getBackground(guiManager.getBackGround());
					guiManager.getCanvas().setBackgroundPath(backgroundPath);
					guiManager.getCanvas().setObjectsImage();
					helicopterPath = fm.getHelicopterSkin(guiManager.getSkin());
					helicopter = new Helicopter(helicopterPath, "bir", HELICOPTERX, HELICOPTERY);
					
					objects.add(helicopter);
					guiManager.getCanvas().addImage(objects.get(0).getImageIcon(), objects.get(0).getPosX(),objects.get(0).getPosY());
					skinSelect = 2;
				}
				if(speed < System.currentTimeMillis()-10){
						update();
						score += 0.1;
						guiManager.setScoreLabel(score);
						speed = System.currentTimeMillis();
					}
				if(boundrySpeed<System.currentTimeMillis()-10){
					guiManager.getCanvas().updateCanvasWalls() ;
					boundrySpeed = System.currentTimeMillis() ;
				}
				if( collisionManager.checkCollision(objects) == "Wall"){
					guiManager.setGameLoop(false);
					highScoreInt = Integer.parseInt( highScore );
					totalScore = Integer.parseInt(fm.getTotalScore());
					totalScore += score;
					guiManager.setCoins(totalScore);
					fm.setTotalScore((int)score);
					if(highScoreInt < (int)score )
					{
						int saver = (int)score;
						fm.setHighScore(""+ saver);
					}
					this.init();
					guiManager.setGameLoop(false);
				}
				else if(collisionManager.checkCollision(objects) == "Diamond"){
					objects.remove(collisionManager.getDeletionIndex());
					guiManager.getCanvas().getObjectsImage().remove(collisionManager.getDeletionIndex());
					guiManager.getCanvas().getPosX().remove(collisionManager.getDeletionIndex());
					guiManager.getCanvas().getPosY().remove(collisionManager.getDeletionIndex());
					score +=100.1;
				}
			}
		}
	}
	public void update(){
		randomObject = (int) (Math.random()*2);
		if(randomCaller < 1)
			randomCaller += 0.01;
		else{
			if(objects.size() <= MAXIMUM_OBJECTS){
				if(randomObject == 0)
					objects.add(guiManager.getCanvas().getRandomMapManager().createRandomWall(randomObject, "rsc/wall.PNG"));
				else
					objects.add(guiManager.getCanvas().getRandomMapManager().createRandomWall(randomObject, "rsc/diamond.GIF"));
				guiManager.getCanvas().addImage(objects.get(objects.size() - 1).getImageIcon(), 
						objects.get(objects.size() - 1).getPosX(),objects.get(objects.size() - 1).getPosY());
				objectsCount++;
			}
			else{
				if(objectsCount > MAXIMUM_OBJECTS)
					objectsCount = 2;
				if(randomObject == 0)
					objects.set(objectsCount, guiManager.getCanvas().getRandomMapManager().createRandomWall(randomObject, "rsc/wall.PNG"));
				else
					objects.set(objectsCount, guiManager.getCanvas().getRandomMapManager().createRandomWall(randomObject, "rsc/diamond.GIF"));
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
