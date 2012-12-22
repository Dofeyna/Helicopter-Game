package mapManagement;

import javax.swing.JButton;

public class menu{
    private int posX;
    private int posY;
    private JButton backButton;
    private int width;
    private int length;
    private int menuId;
	private int height;
    
    public menu(){}
    
    public menu( int menuId,int posX, int posY, int width, int length, JButton backButton){
         this.posX=posX;
         this.posY=posY;
         this.width = width;
         this.length = length;
         this.menuId=menuId;
         this.backButton=backButton;
    }
        public void drawmenu(){
        	}
   
        public int getMenuId() {
                return menuId;
        }

        public void setMenuId(int menuId) {
                this.menuId = menuId;
        }
        public JButton getBackButton() {
                return backButton;
        }

        public void setbackButton(JButton backButton) {
                this.backButton = backButton;
        }



        public int getPosX() {
                return posX;
        }

        public void setPosX(int posX) {
                this.posX = posX;
        }
        public int getPosY() {
                return posY;
        }

        public void setPosY(int posY) {
                this.posY = posY;
        }
        public int getWidth() {
                return width;
        }

        public void setWidth(int width) {
                this.width = width;
        }

        public int getLength() {
                return length;
        }

        public void setLength(int length) {
                this.height = length;
        }
}
