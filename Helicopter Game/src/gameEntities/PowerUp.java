package gameEntities;

import java.applet.*;

import javax.swing.ImageIcon;

public class PowerUp extends GameObject{
	
	private int distance;
	private AudioClip audio;
	
	public int getDistance()
	{
		return distance;
	}
	
	public AudioClip getAudio()
	{
		return audio;
	}
	
	public void setDistance( int distance)
	{
		this.distance = distance;
	}
	
	public void setAudio( AudioClip audio)
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
