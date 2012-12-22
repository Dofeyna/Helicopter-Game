package gameEntities;

import java.applet.*;
import javax.swing.*;

public class Wall extends GameObject {
	
	private ImageIcon image;
	private AudioClip audio;

	public Wall( String path, String id, int posX, int posY){
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
	
	public void destroy()
	{
		
	}
	
	public void playAudio()
	{
		
	}

	public void draw()
	{
		
	}

	public ImageIcon getImageIcon() {
		return image;
	}
	
}
