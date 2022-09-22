/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author tudor
 */
public class EmployeeUI {
    private ArrayList <Employee> employees;



public EmployeeUI(){
    employees = new ArrayList<>();

}

public void add(){
    int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to add 1. Mangager or 2. Floor staff member?"));
    
    if(type == 1){
        Manager m = new Manager();
        m.setName(JOptionPane.showInputDialog(null,"Enter name"));
        m.setDob(JOptionPane.showInputDialog(null,"Enter DOB"));
        m.setId(JOptionPane.showInputDialog(null,"Enter ID"));
        m.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter salary")));
        
        employees.add(m);
       
    }
    else if(type == 2){
        FloorStaff f = new FloorStaff();
        f.setName(JOptionPane.showInputDialog(null,"Enter name"));
        f.setDob(JOptionPane.showInputDialog(null,"Enter DOB"));
        f.setId(JOptionPane.showInputDialog(null,"Enter ID"));
        f.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hourly rate")));
        f.setHours(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter hours")));
        
        employees.add(f);

        
        

    }

}
public void print(){
   /* for(int i = 0; i< count;i++){
        Employee e = employees[i];
        if(e instanceof Manager){
            JOptionPane.showMessageDialog(null, "Name: "+e.getName()+", DOB:"+e.getDob()+", ID:"+e.getId()+", Salary: "+((Manager) e).getSalary());
            
        }
        else if(e instanceof FloorStaff){
            JOptionPane.showMessageDialog(null,"Name: "+e.getName()+", DOB:"+e.getDob()+", ID:"+e.getId()+",Hourly Rate: "+((FloorStaff) e).getHours());
        }*/
        for(int i = 0;i<employees.size();i++){
            Employee e = employees.get(i);
            JOptionPane.showMessageDialog(null,e.getDetails());
        }
    }
    public void search(){
        if(employees.size()==0){
            JOptionPane.showMessageDialog(null, "Sorry, there are no employees to search");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an ID to search for");
            for(Employee e:employees){
                if(e.getId().equals(searchTerm)){
                    JOptionPane.showMessageDialog(null, e.getDetails());
                }
            }
        }
    }
    
    public void delete(){
        if(employees.isEmpty()){
            JOptionPane.showMessageDialog(null, "Sorry, there are no employees to search");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an ID to delete");
            for(int i=0; i < employees.size(); i++){
                if(employees.get(i).getId().equals(searchTerm)){
                    employees.remove(employees.get(i));
                    
                }
                break;
            }
        }
        
    }
    
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null,"1.Add \n2.Display\n 3.Search\n 4.Delete"));
        switch(ans){
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
}



