/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class FixedDepositAccount extends Account{
    private int savingYears;

    public FixedDepositAccount(int savingYears, int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
        super(accountNo, accountHolderName, accountBalance, annualInterestRate);
        this.savingYears = savingYears;
    }

    public void setSavingYears(int savingYears) {
        this.savingYears = savingYears;
    }

    
    public int getSavingYears() {
        return savingYears;
    }

    public double calculateInterest(){
        return super.calculateInterest()*savingYears;
    }
    
    public String toString(){
        return super.toString()+
                "Saving Year:"+savingYears+"\n"+
                "Interest:"+calculateInterest();
    } 
    
    
    
}
