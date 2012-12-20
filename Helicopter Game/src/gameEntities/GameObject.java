package gameEntities;

import javax.swing.ImageIcon;


	abstract public class GameObject{

	private String id;
	protected int posX;
	protected int posY;
	
	public GameObject() {
		
	}
	public GameObject(String id, int posX, int posY){
		this.id = id;
		this.posX = posX;
		this.posY = posY;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void destroy() {}
	
	public void playAudio(){}
	
	public void draw(){}
	public abstract ImageIcon getImageIcon();
}
