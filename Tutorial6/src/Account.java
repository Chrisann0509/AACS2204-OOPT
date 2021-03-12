/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Account {
    
    private int accountNo;
    private String accountHolderName;
    private double accountBalance;
    private double annualInterestRate;
//if static should not pass value in constructor
    public Account(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

  

    public void setAccountHoldername(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void cashIn(double cash){
        accountBalance+=cash;
    }
    
     public void cashOut(double cash){
        accountBalance-=cash;
    }
     
     public double calculateInterest(){
         return accountBalance*annualInterestRate;
     }
     
     public String toString(){
         return "Account No:"+accountNo+"\n"+
                 "Account Holder Name:"+accountHolderName+"\n"+
                 "Account Balance:"+accountBalance+"\n"+
                 "Annual Interest Rate:"+annualInterestRate;
                        
     }
    
}
