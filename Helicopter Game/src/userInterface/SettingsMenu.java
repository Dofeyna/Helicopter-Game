package userInterface;

import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naakal
 */
public class SettingsMenu extends Menu {

    /**
     * Creates new form SettingsMenu
     */
    public SettingsMenu() {
        initComponents();
    }


    @Override
    public void initComponents() {

        audioMenu = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        JLabel jLabel3 = new javax.swing.JLabel();

        audioLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        audioMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("Mute");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Audio Level");

        javax.swing.GroupLayout audioMenuLayout = new javax.swing.GroupLayout(audioMenu);
        audioMenu.setLayout(audioMenuLayout);
        audioMenuLayout.setHorizontalGroup(
            audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(audioMenuLayout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        audioMenuLayout.setVerticalGroup(
            audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, audioMenuLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addComponent(jCheckBox1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        audioLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        audioLabel.setText("Audio Settings");

        saveButton.setText("Save Settings");

        javax.swing.GroupLayout settingsMenuLayout = new javax.swing.GroupLayout(this);
        setLayout(settingsMenuLayout);
        settingsMenuLayout.setHorizontalGroup(
            settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsMenuLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(audioLabel)
                .addGap(115, 115, 115)
                .addComponent(audioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(28, 28, 28))
        );
        settingsMenuLayout.setVerticalGroup(
            settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsMenuLayout.createSequentialGroup()
                .addGroup(settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(audioLabel))
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(audioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111)
                .addComponent(saveButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel audioLabel;
    private javax.swing.JPanel audioMenu;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
