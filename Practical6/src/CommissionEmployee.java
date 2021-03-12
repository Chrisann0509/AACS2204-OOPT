/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class CommissionEmployee extends Employee{
    
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

   

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

   public String toString(){
       return super.toString()+"\n"+
               "Gross Sale: "+grossSale+"\n"+
               "Commission Rate: "+commissionRate;
   }
   public double calculateSalary(){
       return super.calculateSalary()+(grossSale*commissionRate);
   }
    
   public boolean equals(Object obj){  
      
        if(super.equals(obj)){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
}
