/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestEmployee {
    public static void main(String[]args){
        Employee [] empArray={new Employee("Alex",3,1000.00),new CommissionEmployee("Alex",2,1000.00,200.00,0.05),
                              new Clerk("John",4,1200.00,300.00,5)};
       
      printElements(empArray);
        
        //equals
      for(int i=1;i<empArray.length;i++){
          System.out.println("Does employee "+i+" have the same name with employee "+(i+1)+"?");
          System.out.println(empArray[i-1].equals(empArray[i]));
         }
    }
    
    public static void printElements(Employee []empArray){
         //Types of employee
        for(int i=0;i<empArray.length;i++){
            if(empArray[i] instanceof Clerk){
                System.out.println("Clerk");
            }else if(empArray[i] instanceof CommissionEmployee){
                System.out.println("Commission Employee");
            }else{
                System.out.println("Employee");
            }
            System.out.println(empArray[i].toString()+"\n"+
                    "Monthly Salary: "+empArray[i].calculateSalary()+"\n");
        
    }
        
    }
    
}
