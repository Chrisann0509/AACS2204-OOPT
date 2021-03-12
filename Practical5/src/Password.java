import java.util.Scanner;

public class Password {
    
    public static boolean validPassword(String password){
        int countLetter=0;
        int countDigit=0;
        if(password.length()<7){
            return false;
        }else{
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(!Character.isLetter(ch)&&!Character.isDigit(ch)){
                    return false;
                }else{
                    if(Character.isLetter(ch)){
                        countLetter++;
                    }else if(Character.isDigit(ch)){
                        countDigit++;
                    }
                }
            }
            
            if(countLetter!=0&&countDigit!=0){
                return true;
            }else{
                return false;
            }
        }
        
    }
 
    public static void main(String []args){
        String password;
 
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter password: ");
        password=scan.nextLine();
        boolean result=validPassword(password);
        
        
        if(result==true){
            System.out.println("Valid password.");
        }else{
            System.out.println("Invalid password.");
        }
        
    }
    
}
