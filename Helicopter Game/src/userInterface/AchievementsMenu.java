/**
 * This Menu page holds some challenges for players which are mostly about score and highscore. 
 * According challenges state achievements will be unlocked or stay as locked.
 */
package userInterface;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class AchievementsMenu extends Menu{

    JLabel jLabel5 ,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21;
    public AchievementsMenu() {
        initComponents();
    }

    /** This method modifies the labels which either say "Locked" or "Unlocked" according to 
     * corresponding achievement's challenge.
     * @param coins an integer which holds the total score 
     * @param highScore an integer which holds the highscore 
     * */
    
    public void setLabels(int coins, int highScore){
    	if(coins <= 20000)
        	jLabel16.setText("Locked");
        else
        	jLabel16.setText("Unlocked");
        
    	if(highScore <= 5000)
        	jLabel17.setText("Locked");
        else
        	jLabel17.setText("Unlocked");
        if(highScore <= 2000)
        	jLabel18.setText("Locked");
        else
        	jLabel18.setText("Unlocked");
        if(highScore <= 500)
        	jLabel19.setText("Locked");
        else
        	jLabel19.setText("Unlocked");
        if( coins <= 5000)
        	jLabel20.setText("Locked");
        else
        	jLabel20.setText("Unlocked");
        if(coins <= 10000)
        	jLabel21.setText("Locked");
        else
        	jLabel21.setText("Unlocked");
    }
    @Override
    public void initComponents() {
    	
    	setLayout(null);


        JPanel jPanel6,jPanel7,jPanel8,jPanel9,jPanel10,jPanel11;
        JTextArea jTextArea3,jTextArea5,jTextArea6,jTextArea7,jTextArea8;
        JScrollPane jScrollPane1,jScrollPane2,jScrollPane5,jScrollPane6,jScrollPane8;
        jLabel5 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jPanel8 = new JPanel();
        jPanel9 = new JPanel();
        jPanel10 = new JPanel();
        jPanel11 = new JPanel();
        jTextArea3 = new JTextArea();
        jTextArea5 = new JTextArea();
        jTextArea6 = new JTextArea();
        jTextArea7 = new JTextArea();
        jTextArea8 = new JTextArea();
        jScrollPane1 = new JScrollPane();
        jScrollPane2 = new JScrollPane();
        jScrollPane5 = new JScrollPane();
        jScrollPane6 = new JScrollPane();
        jScrollPane8 = new JScrollPane();
		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ACHIEVEMENTS");
        add(jLabel5);
        jLabel5.setBounds(322, 11, 129, 22);

       
		jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 20000TP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));


        JTextArea jTextArea22 = new JTextArea();
		jTextArea22 .setColumns(20);
        jTextArea22.setRows(5);
        jTextArea22.setText("Get 20000 total \npoints to unlock\nthis achievemet.");
        jTextArea22.setEditable(false);
        jScrollPane1.setViewportView(jTextArea22);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel6);
        jPanel6.setBounds(490, 210, 150, 150);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 5000P", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Get 5000 points \nin single game to\nunlock this \nachievemet.");
        jTextArea3.setEditable(false);
        jScrollPane2.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel7);
        jPanel7.setBounds(490, 40, 150, 150);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 2000P", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Get 2000 points \nin single game to\nunlock this \nachievemet.");
        jTextArea5.setEditable(false);
        JScrollPane jScrollPane30 = new JScrollPane();
		jScrollPane30.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel8);
        jPanel8.setBounds(320, 40, 150, 150);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 500P", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Get 500 points \nin single game to \nunlock this \nachievemet.");
        jTextArea6.setEditable(false);
        jScrollPane5.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel9);
        jPanel9.setBounds(150, 40, 150, 150);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 5000TP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("Get 5000 total \npoints to unlock\nthis achievemet.");
        jTextArea7.setEditable(false);
        jScrollPane6.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel10);
        jPanel10.setBounds(150, 210, 150, 150);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Achievement 10000TP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));


        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Get 10000 total \npoints to unlock\nthis achievemet.");
        jTextArea8.setEditable(false);
        jScrollPane8.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel11);
        jPanel11.setBounds(320, 210, 150, 150);
        setPreferredSize(new java.awt.Dimension(776, 429));
    
        
    }


}
