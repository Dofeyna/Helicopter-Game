/*
 * Credits Menu shows the creaters of this game.
 */
package userInterface;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class CreditsMenu extends Menu {

    /**
     * Creates new form CreditsMenu
     */
    public CreditsMenu() {

        initComponents();
    }


    @Override
    public void initComponents() {
    	JLabel jLabel6 = new JLabel();
    	JTextArea jTextArea4 = new JTextArea();
    	JScrollPane jScrollPane7 = new JScrollPane();
    	jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CREDITS");

        javax.swing.GroupLayout creditsMenuLayout = new javax.swing.GroupLayout(this);
        setLayout(creditsMenuLayout);
        creditsMenuLayout.setHorizontalGroup(
            creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditsMenuLayout.createSequentialGroup()
                .addGroup(creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creditsMenuLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creditsMenuLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel6)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        creditsMenuLayout.setVerticalGroup(
            creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Tufan Türkaslan\n Buse Özarslan \n Evrim Þay \n Onur Canan \n Furkan Þirin");
        jTextArea4.setEditable(false);
        jScrollPane7.setViewportView(jTextArea4);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CREDITS");

        javax.swing.GroupLayout creditsMenuLayout1 = new javax.swing.GroupLayout(this);
        setLayout(creditsMenuLayout1);
        creditsMenuLayout1.setHorizontalGroup(
            creditsMenuLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditsMenuLayout1.createSequentialGroup()
                .addGroup(creditsMenuLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creditsMenuLayout1.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creditsMenuLayout1.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel6)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        creditsMenuLayout1.setVerticalGroup(
            creditsMenuLayout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsMenuLayout1.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }

}
