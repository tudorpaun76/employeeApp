/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author tudor
 */
public class Manager extends Employee {
    private double salary;

    public Manager() {
        super();
        salary=0.0;
    }

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }
    


public double getSalary(){
    return salary;
}

public void setSalary(double salary){
    this.salary=salary;

}
    
    
    



    
    
}
