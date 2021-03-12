
import java.util.Date;


public class Account {
    private String accountNo;
    private double balance;
    private Date dateCreated;
    
    public Account(String accountNo,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
        this.dateCreated=new Date();
    }

   //set method is for change  the data

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    //cannot do return balance eventhough can but this method is for deposit 
    //this method didn't tetle didn't let user know this can return balance
    public void deposit(double amount){
       balance+=amount;
    }
    
    //check withdraw successfully use boolean
    public boolean withdrawal(double amount){
        
        if(this.balance>amount){  //this.balance-10>amount(business rule)account cannot be empty
           balance-=amount; 
           return true;
        }else{
            return false;
        }
        
    }
    
    public String toString(){
        return "Account No: "+accountNo+"\n"+
                "Balance:"+balance+"\n"+
                "Date Created: "+ dateCreated;
    }
    
    public boolean equals(Object obj){
        Account temp=(Account)obj;
        if(temp.getAccountNo().equals(accountNo)){
            return true;
        }else{
            return false;
        }
    }
    
}
