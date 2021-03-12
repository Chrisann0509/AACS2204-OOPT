import java.util.Scanner;

public class TestPayroll {

  public static void processPayroll(Payslip[] payslips) {
    Scanner scn = new Scanner(System.in);
    int selection;
    System.out.println("PAYROLL PROCESSING");
    System.out.println("------------------");
    for(int i=0;i<payslips.length;i++){
        System.out.println("\nprocessing payroll for employee #"+(i+1));
        System.out.println(payslips[i].getEmployee());
        if(payslips[i] instanceof FullTimePayslip){
         System.out.print("Enter mode of contribution.[1]Volunteer or [2] Donation: ");
         Scanner scan=new Scanner(System.in);
         selection=scan.nextInt();
         
         switch(selection){
             case 1:
                 ((FullTimePayslip)payslips[i]).volunteer();
                 break;
             case 2:
                 System.out.print("Enter amount to donate: RM");
                 double donation=scan.nextDouble();
                  ((FullTimePayslip)payslips[i]).donate(donation);
                 break;
         }
        }
    }
    
    //todo:: get inputs and process payroll
  }

  public static void displayPayslips(Payslip[] payslips) {
    System.out.println("\n\nGENERATING PAYSLIPS FOR " + Payslip.getMonthAndYear());
    System.out.println("------------------------------------------");

    for (int i = 0; i < payslips.length; ++i) {
      //todo:: display payslop result
      System.out.println("Employee #"+(i+1));
      System.out.println(payslips[i].toString());
    }
  }

  public static void main(String[] args) {
      
      //todo:: using Array, created 4 payslip objects
      
      Payslip[]p1={new FullTimePayslip(new Employee(1,"John"),2000.00,100.00),
                   new FullTimePayslip(new Employee(1,"Alex"),2000.00,100.00),
                   new FullTimePayslip(new Employee(1,"Max"),2000.00,100.00),
                   new PartTimePayslip(new Employee(1,"Ryan"),20),

      };
      //todo:: process payroll
      processPayroll(p1);
      
      //todo:: display pay slip

      displayPayslips(p1);
      //todo:: display total donation
      System.out.println("\nTotal Donation: "+FullTimePayslip.getDonationFund());
      
      //todo:: display total number of volunteer
      System.out.println("\nTotal volunteer number: "+FullTimePayslip.getVolunteerCount());
  }
}