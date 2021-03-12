import java.util.Scanner;
public class q2 {
    
    public static void main(String[]args){
        String str;
      
      
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter a string: ");
        str=scan.nextLine();
        System.out.println(str.toUpperCase()); 
        
       
       System.out.println(str.replaceAll("[AEIOU]", "X"));
        
    }
    
}
