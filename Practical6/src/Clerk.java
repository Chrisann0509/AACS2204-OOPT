/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Clerk extends Employee{
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate=10.0;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
       
    }

   

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static void setOvertimeRate(double overtimeRate) {
        Clerk.overtimeRate = overtimeRate;
    }

    public double getAllowance() {
        return allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }
    
    public String toString(){
        return super.toString()+"\n"+
                "Allowance: "+allowance+"\n"+
                "Overtime Hours: "+overtimeHours+"\n"+
                "Overtime Rate: "+overtimeRate;
        
    }
    public double calculateSalary(){
        return super.calculateSalary()+allowance+(overtimeHours*overtimeRate);
    }
    
       
    public boolean equals(Object obj){ 
       
        if(super.equals(obj)){
            return true;
        }else{
            return false;
        }
    }
    
}
