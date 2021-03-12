
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Saving extends Account{
    
    private final static double INTEREST_RATE=0.03; //constant

    public Saving(String accountNo, double balance) {
        super(accountNo, balance);
        
    }

    public static double getINTEREST_RATE() {
        return INTEREST_RATE;
    }
    
    public double calculateInterest(){
        return (getBalance()*INTEREST_RATE)/12;
    }
    
    public void addInterest(){
        double interest=calculateInterest();
        deposit(interest);
    }
    
   
    
    
    
}
