/**
 * Thanks to this class users can change helicopter's skin and game's background.
 */
package userInterface;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import userInterface.Menu;


public class ShopMenu extends Menu{

    private int background;
    private int skin;
    public ShopMenu() {
    	initComponents();
    	background = 1;
    }
    @Override
    public void initComponents() {

    	 setLayout(null);

         JLabel jLabel2,jLabel7,jLabel8,jLabel9,jLabel12,jLabel13,jLabel1,jLabel14,jLabel15;
         JPanel jPanel1,jPanel2,jPanel4,jPanel5;
         jLabel1 = new JLabel();
         jLabel2 = new JLabel();
         jLabel7 = new JLabel();
         jLabel8 = new JLabel();
         jLabel9 = new JLabel();
         jLabel12 = new JLabel();
         jLabel13 = new JLabel();
         jLabel14 = new JLabel();
         jLabel15 = new JLabel();
         jPanel1 = new JPanel();
         jPanel2 = new JPanel();
         jPanel4 = new JPanel();
         jPanel5 = new JPanel();
         JButton buyBalloon,buyWitch,buyCat,buyBack;
         buyBalloon = new JButton();
         buyWitch = new JButton();
         buyCat = new JButton();
         buyBack = new JButton();
		 
         jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
         jLabel2.setText("SHOP");
         add(jLabel2);
         jLabel2.setBounds(300, 10, 50, 22);

        
         jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
         jPanel1.setLayout(null);
         
         buyBalloon.setText("Buy");
         jPanel1.add(buyBalloon);
         buyBalloon.setBounds(20, 100, 73, 23);

         jLabel7.setText("Helicopter");
         jPanel1.add(jLabel7);
         jLabel7.setBounds(32, 2, 60, 14);


         jLabel1.setIcon(new javax.swing.ImageIcon("rsc/helicopter1.JPG")); // NOI18N
         jPanel1.add(jLabel1);
         jLabel1.setBounds(30, 30, 60, 60);
 		jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
         jPanel1.setLayout(null);

         add(jPanel1);
         jPanel1.setBounds(350, 70, 110, 130);

         jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
         jPanel2.setLayout(null);

         buyWitch.setText("Buy");
         buyWitch.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 buyWitchActionPerformed(evt);
             }
         });
         buyBalloon.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 buyBalloonActionPerformed(evt);
             }
         });
         buyCat.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 buyCatActionPerformed(evt);
             }
         });
         jPanel2.add(buyWitch);
         buyWitch.setBounds(20, 100, 73, 23);

         jLabel8.setIcon(new javax.swing.ImageIcon("rsc/witch1.GIF")); // NOI18N
         jPanel2.add(jLabel8);
         jLabel8.setBounds(30, 20, 60, 80);

         jLabel9.setText("Witch");
         jPanel2.add(jLabel9);
         jLabel9.setBounds(32, 2, 49, 14);

         add(jPanel2);
         jPanel2.setBounds(60, 70, 110, 130);

         jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
         jPanel4.setLayout(null);

         buyCat.setText("Buy");
         jPanel4.add(buyCat);
         buyCat.setBounds(20, 100, 73, 23);

         jLabel12.setIcon(new javax.swing.ImageIcon("rsc/th_NyanCat.GIF")); // NOI18N
         jPanel4.add(jLabel12);
         jLabel12.setBounds(30, 20, 50, 80);

         jLabel13.setText("Nyan Cat");
         jPanel4.add(jLabel13);
         jLabel13.setBounds(20, 0, 80, 14);
         
         add(jPanel4);
         jPanel4.setBounds(200, 70, 110, 130);
         
         jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
         jPanel5.setLayout(null);

         buyBack.setText("Buy");
         buyBack.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 buyBackActionPerformed(evt);
             }
         });
         jPanel5.add(buyBack);
         buyBack.setBounds(20, 100, 73, 23);

         jLabel14.setIcon(new javax.swing.ImageIcon("rsc/spaceT.jpg")); // NOI18N
         jPanel5.add(jLabel14);
         jLabel14.setBounds(30, 20, 50, 80);

         jLabel15.setText("Space");
         jPanel5.add(jLabel15);
         jLabel15.setBounds(20, 0, 80, 14);
         
         add(jPanel5);
         jPanel5.setBounds(60, 220, 110, 130);
    }
    /**
     * this method is used to get new skin's id which will be used to change helicopter's skin.
     * @return chosen skin's id
     */
    public int getSkin()
    {
    	return skin;
    }
    /**
     * this method is used to get new background's id which will be used to change game's background.
     * @return chosen background's id
     */
    public int getBackGround()
    {
    	return background;
    }

   
    private void buyBackActionPerformed(java.awt.event.ActionEvent evt) {
    	background = 2;
    }
    private void buyWitchActionPerformed(java.awt.event.ActionEvent evt) {
    	skin = 1;
    }
    private void buyCatActionPerformed(java.awt.event.ActionEvent evt) {
		skin = 2;
	}
	private void buyBalloonActionPerformed(java.awt.event.ActionEvent evt) {
		skin = 0;
	}
}