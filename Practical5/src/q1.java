import java.util.Scanner;

public class q1 {
   
    public static int countLetter(String str, char ch){
         int count=0;
        for(int i=0;i<str.length();i++){  
          if(Character.toUpperCase(ch)==Character.toUpperCase(str.charAt(i))){
              count++;
          }
          //if((str.charAt(i)+"").equalsIgnoreCase(ch+"")){
          
          
            
        }
        return count;
      
    }
    public static void main(String[]args){
        String str;
        char ch;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        str=scan.nextLine();
        System.out.print("Enter the letter you want to count: ");
        ch=scan.next().charAt(0);
       
        System.out.println(str+" contains "+ countLetter(str,ch)+ch);
        
    }
    
}
