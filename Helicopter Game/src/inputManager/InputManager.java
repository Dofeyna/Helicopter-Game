package inputManager;

public class InputManager {
	
	int playButtonNo ;
	
	public InputManager (){
		
		playButtonNo = 1 ;
		
	}
	
	public String whichButton(int i){
		

		if ( i == playButtonNo){
			return "MOVEUP" ;
		}
		
		if ( i == 3){  // right click
			
		}
		
		if ( i == 27){
			return "ESCAPE" ;
		}
		
		if (i == 32){
			return "PERFORMPOWERUP" ;
		}
		
		else return "NOACTION" ;
		
		
	}
	
	public int getPlayButtonNo (){
		return playButtonNo ;
	}
	
	public void setPlayButtonNo(int i ){
		playButtonNo = i ;
		
	}

}
