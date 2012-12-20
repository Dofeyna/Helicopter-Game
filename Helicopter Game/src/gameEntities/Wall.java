package gameEntities;

import java.applet.*;
import javax.swing.*;

public class Wall extends GameObject {
	
	private ImageIcon image;
	private AudioClip audio;

	public Wall()
	{	
		
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

	@Override
	public ImageIcon getImageIcon() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
