/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;
import javax.swing.JOptionPane;


/**
 *
 * @author tudor
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* EmployeeUI myUI = new EmployeeUI();
    String ans;
    do{
        myUI.menu();  
        ans = JOptionPane.showInputDialog(null,"Would you like to see the menu again?");
        
    }
    while(ans.equals("yes"));
*/
        
        //MAKE AND PRINT INSTANCE OF EMPLOYEE, MANAGER AND FLOORSTAFF
        EmployeeGUI myGUI = new EmployeeGUI();
        myGUI.setVisible(true);
        
    }
    
}
