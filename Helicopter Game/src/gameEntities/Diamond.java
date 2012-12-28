package gameEntities;

import java.applet.AudioClip;
import javax.swing.ImageIcon;

public class Diamond extends GameObject {

	
	private ImageIcon image;
	/**
	 * @param path
	 * @param id
	 * @param posX
	 * @param posY
	 * creates new diamond
	 * sets path id and x y positions
	 */
	public Diamond( String path, String id, int posX, int posY){
		super(id, posX, posY);
		image = new ImageIcon(path);
	}
	/**
	 * @return image
	 */
	public ImageIcon getImage(){
		return image;
	}
	
	/**
	 * @param image
	 * sets image
	 */
	public void setImage( ImageIcon image)
	{
		this.image = image;
	}
	
	public ImageIcon getImageIcon() {
		return image;
	}
}
