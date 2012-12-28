package userInterface;

/*
 *  Menu class is an abstract class because each and every class which extends this class 
 *  has same methods and parameters.
 */
public abstract class Menu extends javax.swing.JPanel {

    
    public Menu(){
        
    }
  
    abstract public void initComponents();
    /*
	 *  This method initiates, adds, and places every component of the every Menu object. This method
	 *  will be overwritten by each Menu Class
	 */

}