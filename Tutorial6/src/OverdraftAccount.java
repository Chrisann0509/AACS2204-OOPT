/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class OverdraftAccount extends Account{
    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;

    public OverdraftAccount(int accountNo, String accountHolderName, double accountBalance,double annualInterestRate,String accountType) {
        super(accountNo, accountHolderName, accountBalance,annualInterestRate);
        this.accountType = accountType;
        if(accountType=="Premium"){
            overdraftLimit=10000.00;
            overdraftInterestRate=0.05;
            
            
        }else if(accountType=="Gold"){
              overdraftLimit=5000.00;
            overdraftInterestRate=0.065;
            
        }else if(accountType=="Silver"){
             overdraftLimit=2000.00;
            overdraftInterestRate=0.01;
        }
        
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftInterestRate(double overdraftInterestRate) {
        this.overdraftInterestRate = overdraftInterestRate;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public void cashOut(double cash){
        if(super.getAccountBalance()-cash>-(overdraftLimit)){ //balance value bigger than overdraft
           super.cashOut(cash);
        }else{
             System.out.println("Cash out over limit.");
        }
    }
    
    public double calculateInterest(){
        if(super.getAccountBalance()>=0){
            return super.calculateInterest();
        }else{
            return getAccountBalance()*overdraftInterestRate;
        }
        
    }
    
    
    
    
}
