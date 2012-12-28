package gameEntities;

import javax.swing.*;

public class Wall extends GameObject {
	
	private ImageIcon image;
	/**
	 * @param path
	 * @param id
	 * @param posX
	 * @param posY
	 * creates new wall
	 * sets path id and x y positions
	 */
	public Wall( String path, String id, int posX, int posY){
		super(id, posX, posY);
		image = new ImageIcon(path);
	}
		
	/**
	 * @return image
	 */
	public ImageIcon getImage(){
		return image;
	}
	
	
	
	public ImageIcon getImageIcon() {
		return image;
	}
	
}
