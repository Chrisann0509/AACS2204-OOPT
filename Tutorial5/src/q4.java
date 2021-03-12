/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class q4 {
        public static boolean nameValidation(String name){
            if(name.indexOf("")!=-1||name.length()<6){ //-1 not equal to false mean have blank space so equal false
                return false;
            }else{
                return true;
            }
        }
        
        public static void main(String []args){
            String name="John";
            System.out.println(nameValidation(name));
        }
}
