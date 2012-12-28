package gameEntities;

import  javax.swing.*;

public class Helicopter extends GameObject {
	
	private ImageIcon image;
	private int skinId;
	public Helicopter(String path, String id, int posX, int posY){
		super(id, posX, posY);
		image = new ImageIcon(path);
	}
	public ImageIcon getImageIcon(){
		return image;
	}
	public int getSkinId()
	{
		return skinId;
	}
	public void setImage( ImageIcon image){
		this.image = image;
	}
	public void setSkinId( int skinId){
		this.skinId = skinId;
	}
}
