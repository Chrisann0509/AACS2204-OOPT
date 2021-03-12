/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Studentexp {
    private String name;
    private double gpa; //not allow user simply to change the data
    
    public Studentexp(){
        name="";
        gpa=0.00;
}
    public void setName(String n){
        name=n;
    }
    public void setGPA(double value){
        if(value<0||value>4.0){
            System.out.println("Invalid GPA");
        }else{
             gpa=value;
        }
       
    }
    
    public String getName(){
        return name;
    }
    public double getGPA(){
    return gpa;
    }
     
    
}
