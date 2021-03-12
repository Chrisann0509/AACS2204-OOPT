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
    private double balance;
    static int accountCount;
    private static double annualInterestRate;
    
   public Account(int accountNo,String accountHolderName, double accountBalance){
       this.accountNo=accountNo;
       this.accountHolderName=accountHolderName;
       balance=accountBalance;
       accountCount++;
       
   } 
 
   public void setAccountHolderName(String accountHolderName){
       this.accountHolderName=accountHolderName;
   }
   
   public static void setAnnualInterestRate(double annualInterestRate){
       Account.annualInterestRate=annualInterestRate;
   }
   public int getAccountNo(){
       return accountNo;
   }
   public String getAccountHolderName(){
    return accountHolderName;   
   }
   public double getBalance(){
       return balance;
   }
   public int getAccountCount(){
       return accountCount;
   }
   public double getAnnualInterestRate(){
       return annualInterestRate;
   }
   public void cashIn(double cash){
       balance+=cash;
   }
    public void cashOut(double cash){
       balance-=cash;
   }
    public double calculateInterest(){
        return balance*annualInterestRate;
    }
   
    
}
