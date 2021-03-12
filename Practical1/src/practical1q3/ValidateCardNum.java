
package practical1q3;
import java.util.Scanner;

public class ValidateCardNum {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        System.out.print("Enter 8-digit card number: ");
        String cardNo=scan.nextLine();
        
        for(int i=7;i>=0;i-=2){
            int temp=cardNo.charAt(i)-'0';
            sum1+=temp;  
        }
        for(int i=6;i>=0;i-=2){
            int temp =cardNo.charAt(i)-'0';
            int doubling =temp*2;
            if(doubling>=10){
                int q=doubling/10;
                int r=doubling %10;
                sum2+=(q+r);
            }
            else{
                sum2+=doubling;
                
            }
            
        }
           System.out.println(sum1+sum2);
           if((sum1+sum2)%10==0){
               System.out.println("Valid Number!");
           }
           else{
               System.out.println("Invalid Number!");
           }
           
    }
    
}
