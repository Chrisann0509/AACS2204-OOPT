import java.util.Scanner;
public class Template {
    public static void main(String[]args){
        int selection=0;
        Current c=new Current("c1001",100);
        Current c2=new Current("c1001",100);
        Scanner scan=new Scanner(System.in);
        System.out.println(c.equals(c2));
        do{
            System.out.println("1.Withdrawal");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Account Details");
            System.out.println("5.Quit");
            System.out.print("Enter Selection: ");
            selection=scan.nextInt();
            double amount;
            switch(selection){
                case 1:
                    
                    System.out.print("Enter withdraw amount: ");
                    amount=scan.nextDouble();
                    
                    if(c.withdrawal(amount)==true){
                      
                            System.out.println("Withdrawal complete. \n");
                       
                    }else{
                        System.out.println("Your account balance is not enough. \n");
                    }
            
                    break;
                case 2:
                   
                    System.out.print("Enter deposit amount: ");
                    amount=scan.nextDouble();
                    c.deposit(amount);
                    
                    break;
                case 3:
                    System.out.println("Balance: "+c.getBalance());
                    break;
                case 4:
                    System.out.println(c.toString());
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
            }
        }while(selection!=4);
    }
    
}
