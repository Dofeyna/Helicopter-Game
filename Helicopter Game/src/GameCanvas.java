import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GameCanvas extends JPanel implements KeyListener, MouseListener {
	ArrayList<ImageIcon> objectsImage = new ArrayList <ImageIcon>();
	ArrayList<Integer> posX = new ArrayList<Integer>();
	ArrayList<Integer> posY = new ArrayList<Integer>();
	ImageIcon background = new ImageIcon ("rsc/Wall Pattern.JPG");
	int log;
	public GameCanvas() {
		setFocusable(true);
		addKeyListener(this);
		addMouseListener(this);
		objectsImage.add(background);
		posX.add(0);
		posY.add(0);
	}
	public void addImage(ImageIcon i, int x, int y){
		objectsImage.add(i);
		posX.add(x);
		posY.add(y);
	}
	public int getLog(){
		return log;
	}
	public void setLog(int i){
		log = i;
	}
	public void setImage(ImageIcon i, int x, int y, int count){
		objectsImage.set(count, i);
		posX.set(count, x);
		posY.add(count, y);
		updateUI();
	}
	public void paint(Graphics g){
		for(int i = 0; i<objectsImage.size(); i++){
			g.drawImage(objectsImage.get(i).getImage(), posX.get(i), posY.get(i), null);
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
