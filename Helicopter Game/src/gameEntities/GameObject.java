package gameEntities;


public class GameObject {

	private String id;
	private int posX;
	private int posY;
	private int width;
	private int height;
	
	public GameObject() {
		
	}
	public GameObject(String id, int posX, int posY, 
			int width, int height){
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void destroy() {}
	
	public void playAudio(){}
	
	public void draw(){}
}
