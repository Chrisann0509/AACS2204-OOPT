
import java.util.Scanner;

public class TestAccount {
    private static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){
       
        Account acc1=new Account(909,"Ali Baba",1000);
        Account.setAnnualInterestRate(10.0);
        int choice;
        do{
          choice=displayMenu();
        switch(choice){
            case 1:
                System.out.println("Account Balance:"+acc1.getBalance());
                break;
            case 2:
                System.out.print("Enter amount of cash in: ");
                double cashIn=scan.nextDouble();
                acc1.cashIn(cashIn);
                System.out.println("Account Balance:"+acc1.getBalance());
                break;
            case 3:
                System.out.print("Enter amount of cash out: ");
                double cashOut=scan.nextDouble();
                acc1.cashOut(cashOut);
                System.out.println("Account Balance:"+acc1.getBalance());
                break;
            case 4:
                System.out.println("Interest amount: "+acc1.calculateInterest());
                break;
           
        }
        
        
        }while(choice!=5);
        
       
    }
    
    public static int displayMenu(){
        int selection;
         System.out.println("Main Menu");
        System.out.println("1: Check balance");
        System.out.println("2: Cash In");
        System.out.println("3: Cash Out");
        System.out.println("4: Interest");
        System.out.println("5: Exit");
        System.out.print("Enter a choice: ");
        selection=scan.nextInt();  
        return selection;
    }
    
}
