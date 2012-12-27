package GUIManager;

import javax.swing.JButton;


public abstract class Menu extends javax.swing.JPanel {
    private int posX;
    private int posY;
    private JButton backButton;
    private int width;
    private int length;
    private int menuId;

    
    public Menu(){
        
    }
    
    public Menu( int menuId,int posX, int posY, int width, int length, JButton backButton){
         this.posX=posX;
         this.posY=posY;
         this.width = width;
         this.length = length;
         this.menuId=menuId;
         this.backButton=backButton;
    }
       abstract public void drawmenu();
   
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
        public int getWidth2() {
                return width;
        }

        public void setWidth(int width) {
                this.width = width;
        }

        public int getLength() {
                return length;
        }

        public void setLength(int length) {
                this.length = length;
        }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        highscore = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        highscore.setText("jLabel1");

        score.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(highscore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(score)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(highscore)
                    .addComponent(score))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel highscore;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}