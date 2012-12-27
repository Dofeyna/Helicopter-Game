package userInterface;

import gameLogic.GameEngine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class GameCanvas extends javax.swing.JPanel implements KeyListener, MouseListener {
	private ArrayList<ImageIcon> objectsImage = new ArrayList <ImageIcon>();
	private ArrayList<Integer> posX = new ArrayList<Integer>();
	private ArrayList<Integer> posY = new ArrayList<Integer>();
	
	private ArrayList<ImageIcon> boundryWallsImage = new ArrayList <ImageIcon>();
	private ArrayList<Integer> boundryPosX = new ArrayList<Integer>();
	private ArrayList<Integer> boundryPosY = new ArrayList<Integer>();
	
	private ArrayList<ImageIcon> boundryUpperWallsImage = new ArrayList <ImageIcon>();
	private ArrayList<Integer> boundryUpperPosX = new ArrayList<Integer>();
	private ArrayList<Integer> boundryUpperPosY = new ArrayList<Integer>();
	
	
	private ImageIcon background = new ImageIcon ("rsc/Wall Pattern.JPG");
	private int log;
	private int boundryWallSize;
	private int boundryUpperWallSize;
	private int firstUpperBoundryWallSize;
	private int firstBoundryWallSize;
	
	public GameCanvas() {
		boundryWallSize = 0;
		boundryUpperWallSize = 0;
		firstUpperBoundryWallSize = 0;
		firstBoundryWallSize = 0;
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
	public void addRandomWall(ImageIcon i, int x, int y){
		firstBoundryWallSize++;
		if( firstBoundryWallSize > 100){
			boundryPosX.set(boundryWallSize, x);
			boundryPosY.set(boundryWallSize, y);
			boundryWallSize++;
			if( boundryWallSize >= 100)
				boundryWallSize = 0;
		}
		else if( firstBoundryWallSize <= 100){
			boundryWallsImage.add(i);
			boundryPosX.add(x);
			boundryPosY.add(y);
		}
		setRandomWall();
	}
	
	public void addRandomUpperWall(ImageIcon i, int x, int y){
		firstUpperBoundryWallSize++;
		if( firstUpperBoundryWallSize > 100){
			boundryUpperPosX.set(boundryUpperWallSize, x);
			boundryUpperPosY.set(boundryUpperWallSize, y);
			boundryUpperWallSize++;
			if( boundryUpperWallSize >= 100)
				boundryUpperWallSize = 0;
		}
		else if( firstUpperBoundryWallSize <= 100){
			boundryUpperWallsImage.add(i);
			boundryUpperPosX.add(x);
			boundryUpperPosY.add(y);
		}
		setRandomUpperWall();
	}
	public void setImage(ImageIcon i, int x, int y, int count){
		objectsImage.set(count, i);
		posX.set(count, x);
		posY.add(count, y);
		updateUI();
	}
	public int getLog(){
		return log;
	}
	public void setLog(int i){
		log = i;
	}
	public void setRandomWall(){
		for(int count = 0; count < boundryWallSize; count++){
			boundryPosX.set(count, boundryPosX.get(count) - 20);
			updateUI();
		}
	}
	public void setRandomUpperWall(){
		for(int count = 0; count < boundryUpperWallSize; count++){
			boundryUpperPosX.set(count, boundryUpperPosX.get(count) - 20);
			updateUI();
			}
	}
	public void paint(Graphics g){
		for(int i = 0; i<objectsImage.size(); i++){
			g.drawImage(objectsImage.get(i).getImage(), posX.get(i), posY.get(i), null);
		}
		for(int i = 0; i < boundryWallsImage.size(); i++){
			g.drawImage(boundryWallsImage.get(i).getImage(), boundryPosX.get(i), 
					boundryPosY.get(i), null);
		}
		for(int i = 0; i < boundryUpperWallsImage.size(); i++){
			g.drawImage(boundryUpperWallsImage.get(i).getImage(), boundryUpperPosX.get(i), 
					boundryUpperPosY.get(i), null);
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
