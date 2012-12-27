package gameEntities;

import java.applet.AudioClip;
import javax.swing.ImageIcon;

public class Diamond extends GameObject {

	
	private ImageIcon image;
	private AudioClip audio;

	public Diamond( String path, String id, int posX, int posY){
		super(id, posX, posY);
		image = new ImageIcon(path);
	}
	public ImageIcon getImage()
	{
		return image;
	}
	public AudioClip getAudio()
	{
		return audio;
	}
	public void setImage( ImageIcon image)
	{
		this.image = image;
	}
	public void setAudio(AudioClip audio)
	{
		this.audio = audio;
	}
	public ImageIcon getImageIcon() {
		return image;
	}
}
