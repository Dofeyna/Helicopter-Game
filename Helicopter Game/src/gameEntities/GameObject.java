package gameEntities;

import javax.swing.ImageIcon;


	abstract public class GameObject{

	private String id;
	protected int posX;
	protected int posY;
	
	public GameObject() {
		
	}
	/**
	 * @param id
	 * @param posX
	 * @param posY
	 * sets id and x y positions
	 */
	public GameObject(String id, int posX, int posY){
		this.id = id;
		this.posX = posX;
		this.posY = posY;
	}
	/**
	 * @return String id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param String id
	 * sets id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return posX
	 * 
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	/**
	 * @return imageIcon
	 */
	public abstract ImageIcon getImageIcon();
}
