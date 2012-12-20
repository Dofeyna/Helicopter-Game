package gameEntities;

import javax.swing.*;

public class SpeedPowerUp extends PowerUp{
	
	private ImageIcon image;
	private String feature;
	
	public SpeedPowerUp()
	{
		
	}
	
	public ImageIcon getImage()
	{
		return image;
	}
	
	public String getFeature()
	{
		return feature;
	}
	
	public void setImage( ImageIcon image)
	{
		this.image = image;
	}
	
	public void setFeature( String feature)
	{
		this.feature = feature;
	}
	

}