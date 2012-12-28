package userInterface;

import gameLogic.GameEngine;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import mapManagement.RandomMapManager;


public class GameCanvas extends javax.swing.JPanel implements KeyListener, MouseListener {
	private ArrayList<ImageIcon> objectsImage = new ArrayList <ImageIcon>();
	private ArrayList<Integer> posX = new ArrayList<Integer>();
	private ArrayList<Integer> posY = new ArrayList<Integer>();
	
	
	
	private ImageIcon background = new ImageIcon ("rsc/Wall Pattern.JPG");
	private int log;

	private RandomMapManager randomMapManager;
	
	public GameCanvas() {
		randomMapManager = new RandomMapManager();
	
		setFocusable(true);
		addKeyListener(this);
		addMouseListener(this);
		this.setDoubleBuffered(true);
		objectsImage.add(background);
		posX.add(0);
		posY.add(0);
	}
	
	public ArrayList<ImageIcon> getObjectsImage(){
		return objectsImage;
	}
	public ArrayList<Integer> getPosX(){
		return posX;
	}
	public ArrayList<Integer> getPosY(){
		return posY;
	}
	public void addImage(ImageIcon i, int x, int y){
		objectsImage.add(i);
		posX.add(x);
		posY.add(y);
	}
	
	public RandomMapManager getRandomMapManager(){
		return randomMapManager ;
	}

	public void setImage(ImageIcon i, int x, int y, int count){
		objectsImage.set(count, i);
		posX.set(count, x);
		posY.add(count, y);
	}
	public int getLog(){
		return log;
	}
	public void setLog(int i){
		log = i;
	}

	
	public void updateCanvasWalls (){
		randomMapManager.updateWalls ("rsc/wall.PNG") ;
		updateUI() ;
	}
	public void paint(Graphics g){
		

		for(int i = 0; i<objectsImage.size(); i++){
			g.drawImage(objectsImage.get(i).getImage(), posX.get(i), posY.get(i), null);
		}
		for  (int i = 0; i < randomMapManager.getNumberOfWalls()-1 ; i++){
			g.drawImage (randomMapManager.getWallsUp(i).getImageIcon().getImage(),randomMapManager.getWallsUp(i).getPosX(), randomMapManager.getWallsUp(i).getPosY(), null );
	
		}
		for  (int i = 0; i < randomMapManager.getNumberOfWalls()-1 ; i++){
			g.drawImage (randomMapManager.getWallsDown(i).getImageIcon().getImage(),randomMapManager.getWallsDown(i).getPosX(), randomMapManager.getWallsDown(i).getPosY(), null );
	
		}
		for  (int i = 0; i < randomMapManager.getNumberOfWalls()-1 ; i++){
			g.drawImage (randomMapManager.getWallsDownFixed(i).getImageIcon().getImage(),randomMapManager.getWallsDownFixed(i).getPosX(), randomMapManager.getWallsDownFixed(i).getPosY(), null );
	
		}
		for  (int i = 0; i < randomMapManager.getNumberOfWalls()-1 ; i++){
			g.drawImage (randomMapManager.getWallsUpFixed(i).getImageIcon().getImage(),randomMapManager.getWallsUpFixed(i).getPosX(), randomMapManager.getWallsUpFixed(i).getPosY(), null );
	
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("KEY");
		System.out.println(keyInputReturn(arg0));
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse");
		log = mouseInputReturn(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setLog(0);
		
	}

	public int keyInputReturn( KeyEvent e){
		return e.getKeyChar();
	}
	
	public int mouseInputReturn( MouseEvent e){
		return e.getButton();
	}
}
