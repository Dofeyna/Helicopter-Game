/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class HelpMenu extends Menu{

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
    	initComponents();
    }

 
    @Override
    public void initComponents() {
    	
    	JLabel jLabel4 = new JLabel();
    	JTextArea jTextArea2 = new JTextArea();
    	JScrollPane jScrollPane3 = new JScrollPane();
    	
    	setPreferredSize(new java.awt.Dimension(776, 429));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("HELP");

		jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Gameplay\n\tOriginally, the player uses a mouse to play the game. The player must press the left button of the mouse to fly \nthe helicopter. As the player keeps pressing the button, the helicopter ascends and as the player stop pushing it, the \nhelicopter descends. However, the game has an option to choose the button which will be used. Therefore, the player can \nspecify the button as he wants rather than the mouse. Moreover, the player needs the keyboard to pause the game by pressing \nto the \"ESC\" button. After pressing ESC and pause the game, the player change settings, exit game or continue to play.\n\n2. Obstacles\nThere will be different kinds of obstacles in the game and the player tries not to crash to them. Generally, the obstacles\n will be like walls which are located in different places on the helicopter's road. The helicopter must pass either under \nthe wall or over the wall. Therefore, the height of the walls and the place of the walls are important for the player. There\n will be other obstacles which are like a ring. The helicopter must pass inside of that types of obstacles and again the\n area of the obstacles is important for the player because small ones will be harder to pass through.\n\n3. Power-ups and Diamonds\n\tPower-ups are designed to provide different features for the helicopter and diamonds are designed to collect points. \nThey will be placed randomly on the helicopter's road and the player tries to collect them as many as possible. There will \nbe 4 types of power ups which all have different features. Here are the types of power-ups:\n\nSpeed: It provides speed to the helicopter. Yet, it will not crash any obstacles while player is under the impact of\n\tspeed power-up.\n\nRocket: It enables the helicopter to destroy the obstacles.\n\nGhost: It enables the helicopter to pass through the obstacles without crashing them like a ghost.\n\nMagnet: It enables the helicopter to collect the diamonds more easily. It magnetizes diamonds toward the \nhelicopter, so the helicopter can collect them without passing over the diamonds.\n\nDiamonds enable the helicopter to collect more points in addition to the points it collects from the distance taken.\n\n");
        jTextArea2.setEditable(false);
        
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout helpMenuLayout = new javax.swing.GroupLayout(this);
        setLayout(helpMenuLayout);
        helpMenuLayout.setHorizontalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(362, 362, 362))
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        helpMenuLayout.setVerticalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
    }


}
