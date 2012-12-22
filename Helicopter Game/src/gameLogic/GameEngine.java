package gameLogic;

import java.awt.Dimension;
import java.util.ArrayList;

import gameEntities.*;
import userInterface.*;

import javax.swing.JFrame;


public class GameEngine {

	public final int HELICOPTERX = 150;
	public final int HELICOPTERY = 150;
	JFrame GameFrame;
	boolean init = true;
	Helicopter helicopter;
	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	final int ACCELERATION=5;
	GameCanvas c;
	
	public static void main (String [] args){
		GameEngine engine = new GameEngine();
	}

	public GameEngine() {
		initializition();
		play();
	}
	public void initializition(){
		if(init){
			c = new GameCanvas();
			helicopter = new Helicopter("bir", HELICOPTERX, HELICOPTERY);
			objects.add(helicopter);
			c.addImage(objects.get(0).getImageIcon(), objects.get(0).getPosX(),objects.get(0).getPosY());
			GameFrame = new JFrame("Helicopter Game"); 
			GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
			//GameFrame.setResizable(false); //don't allow the user to resize the window
			GameFrame.setSize(new Dimension(800,640));
			GameFrame.setVisible(true);
			GameFrame.setLocationRelativeTo(null);
			GameFrame.add(c);
		}
		init = false;
	}
	long x = System.currentTimeMillis();
	public void play(){
		while(true){
			 
			if(x < System.currentTimeMillis()-10){
				update();
				x = System.currentTimeMillis();
			}
		}
	}
	public void update(){
		if(c.getLog() == 1){
			objects.get(0).setPosY(objects.get(0).getPosY() - 4);
		}
		objects.get(0).setPosY(objects.get(0).getPosY() + 2);
		for(int count = 0; count < objects.size(); count++){
			c.setImage(objects.get(count).getImageIcon(), objects.get(count).getPosX(),
					objects.get(count).getPosY(), count + 1);
		}
	}

}
