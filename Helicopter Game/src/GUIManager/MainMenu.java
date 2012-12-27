/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIManager;

import javax.swing.JButton;


/**
 *
 * @author naakal
 */
public class MainMenu extends Menu{

    
       public MainMenu(){  
           initComponents() ; 
       }
       public MainMenu(int menuId,int posX, int posY, int width, int length, JButton backButton){ 
           super();
           
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        shopButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();
        achievementsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        playButtton = new javax.swing.JButton();
        highscore = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 640));
        setLayout(null);

        shopButton.setText("Shop");
        shopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopButtonActionPerformed(evt);
            }
        });
        add(shopButton);
        shopButton.setBounds(330, 180, 60, 20);

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        add(helpButton);
        helpButton.setBounds(330, 270, 53, 30);

        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });
        add(creditsButton);
        creditsButton.setBounds(320, 310, 67, 23);

        achievementsButton.setText("Achievements");
        achievementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achievementsButtonActionPerformed(evt);
            }
        });
        add(achievementsButton);
        achievementsButton.setBounds(300, 240, 110, 23);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        add(exitButton);
        exitButton.setBounds(330, 340, 51, 23);

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        add(settingsButton);
        settingsButton.setBounds(320, 210, 71, 23);

        playButtton.setText("Play");
        playButtton.setName("playButton"); // NOI18N
        playButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButttonActionPerformed(evt);
            }
        });
        add(playButtton);
        playButtton.setBounds(330, 150, 53, 23);
        playButtton.getAccessibleContext().setAccessibleDescription("");
        playButtton.getAccessibleContext().setAccessibleParent(playButtton);

        highscore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        highscore.setText("Highscore:2222");
        add(highscore);
        highscore.setBounds(10, 384, 140, 30);

        score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        score.setText("Score:1111");
        add(score);
        score.setBounds(650, 380, 90, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
       
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void playButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButttonActionPerformed
     
    }//GEN-LAST:event_playButttonActionPerformed

    private void achievementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achievementsButtonActionPerformed
      
    }//GEN-LAST:event_achievementsButtonActionPerformed

    private void shopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopButtonActionPerformed
        
    }//GEN-LAST:event_shopButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
       
    }//GEN-LAST:event_helpButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
      
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
     
    }//GEN-LAST:event_exitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achievementsButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel highscore;
    private javax.swing.JButton playButtton;
    private javax.swing.JLabel score;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton shopButton;
    // End of variables declaration//GEN-END:variables
 
    @Override
    public void drawmenu() {
        this.setVisible(true);
    }
}
