/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public void setName(String name) {  //modify name
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) { //modify salary
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    
    public String toString(){
        return  "Employee Name: "+name+"\n"+
                "Year Joined: "+yearJoined+"\n"+
                "Basic Salary: "+basicSalary;
    }
    public double calculateSalary(){
        return basicSalary;
    }
        
    public boolean equals(Object obj){  //default extends Object 
        Employee temp=(Employee)obj;
        if(temp.getName().equals(name)){  //e1.equals(e2)
            return true;
        }else{
            return false;
        }
    }
    

    
  
    
}
