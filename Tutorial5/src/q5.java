/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class q5 {
    public static boolean validateCreditCardNumber(String creditCardNumber){
        if(creditCardNumber.length()!=16){
            return false;
          
        }else{
            for(int i=0;i<creditCardNumber.length();i++){
              char ch=creditCardNumber.charAt(i);
              if(!Character.isDigit(ch)){
                  return false;
              }
            }
            return true;
        }
        
    
}
public static void main(String []args){
        String cardNo="1234567891234567";
        System.out.println(validateCreditCardNumber(cardNo));
        
    }
    
}
