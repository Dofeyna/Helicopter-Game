package gameLogic;
import java.util.ArrayList;
import gameEntities.GameObject;
public class CollisionManager {
	
	private int xposition;
	private int yposition;
	private int deletionIndex;
	public CollisionManager() {
		xposition = 150;
	}
	public String checkCollision ( ArrayList<GameObject> objects){
		yposition = objects.get(0).getPosY();
		for (int count = 1; count < objects.size(); count++)
		{
			for ( int count2 = xposition; count2 <= xposition + 106; count2++)
			{
				if( count2 >= objects.get(count).getPosX() && 
						count2 <= objects.get(count).getPosX() + 35){
					for( int count3 = yposition; count3 <= yposition + 48; count3++){
						if(count3 >= objects.get(count).getPosY() && 
						count3 <= objects.get(count).getPosY() + 65){
							this.deletionIndex = count;
							return objects.get(count).getId();
						}
					}
				}
			}
		}
		if(yposition <= 73 || yposition >= 465){
			System.out.println("Üst alt");
			return "Wall";
		}
		return null;
	}
	public int getDeletionIndex(){
		return deletionIndex;
	}
}
