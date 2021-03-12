
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
public class Current extends Account{
    
  private final static int FREE_TRANS=3;
  private final static double TRANS_CHARGES=0.50;
  private int transactionCount=0;

    public Current(String accountNo, double balance) {
        super(accountNo, balance);
        
    }
    
    private void resetTransactionCount(){
        transactionCount=0;
    }

    public static int getFREE_TRANS() {
        return FREE_TRANS;
    }

    public static double getTRANS_CHARGES() {
        return TRANS_CHARGES;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
    
    public void increaseTransactionCount(){
        transactionCount++;
    }
    
    public void addCharges(){
        
        super.withdrawal(TRANS_CHARGES);
    }
    
    public boolean withdrawal(double amount){
        if(super.withdrawal(amount)){
             transactionCount++;
            if( transactionCount>FREE_TRANS){
              addCharges();
               System.out.println("You have already withdraw more than 3 times in this month.");       
              System.out.println("Charges:"+TRANS_CHARGES);
             }
            return true;
        }else{
            return false;
        }
      
      
        
    }
    
    public void deposit(double amount){
        super.deposit(amount);
        increaseTransactionCount();
         if(getTransactionCount()>FREE_TRANS){
              addCharges();
               System.out.println("You have already withdraw more than 3 times in this month.");       
              System.out.println("Charges:"+TRANS_CHARGES);
             }
      
    } 
    
    public String toString(){
        return super.toString()+"\n"+
                "Transaction Count: "+transactionCount;
    }
  
    
}
