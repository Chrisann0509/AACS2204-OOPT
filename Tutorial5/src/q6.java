

public class q6 {
    
    public static boolean validateID(String loginID){
      int count=0;
      int num=0;
        if(loginID.length()<6||loginID.length()>10){
            
            return false;
        }
        else{
            
             char firstLetter=loginID.charAt(0);
               if(!Character.isUpperCase(firstLetter)){
                   return false;
               }
            for(int i=0;i<loginID.length();i++){
               
                char ch=loginID.charAt(i);
             
               if(!Character.isLetter(ch)&&!Character.isDigit(ch)){
                   return false;
                   
               }
               else{
                   
                   if(Character.isLowerCase(ch)){
                       count++;
                   }
                   else if(Character.isDigit(ch)){
                       num++;
                   }
                   
                   
                   }
                   
               }
            if(count!=0&&num!=0){
                       return true;
                   }
                   else{
                       return false;
            }  
            
            
           
        }
        
    }
    public static void main(String []args){
        
        String loginID="@bc12345";
       boolean result=validateID(loginID);
        
        System.out.println(result);
        
    }
    
}
