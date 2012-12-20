import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GameEngine {

	JFrame GameFrame;
	boolean init = true;
	public static void main (String [] args){
		GameEngine engine = new GameEngine();
	}

	public GameEngine() {
		initializition();
	}
	public void initializition(){
		if(init){
			GameCanvas c = new GameCanvas();
			GameFrame = new JFrame("Helicopter Game"); 
			GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
			GameFrame.setResizable(false); //don't allow the user to resize the window
			GameFrame.setSize(new Dimension(800,640));
			GameFrame.setVisible(true);
			GameFrame.setLocationRelativeTo(null);
		
			GameFrame.add(c);
		}
		init = false;
	}

}
