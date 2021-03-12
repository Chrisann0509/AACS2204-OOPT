
public class Palindrome {
    
    public static boolean check(String str){
        for(int i=0;i<str.length()/2;i++){
            char ch1=str.charAt(i);
            char ch2=str.charAt(str.length()-1-i);
            
            if(ch1!=ch2){
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String []args){
        
        
        String s1="madam";
        String s2="madam      ";
        s1.toUpperCase();
        String []temp=s1.split("d");
        System.out.println(check(s1));
        System.out.println(s1.substring(3));
        
        System.out.println(s1);//toUppercase won't change the value
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim()+"--------");
        System.out.println(temp[0]);
    }
    
}
