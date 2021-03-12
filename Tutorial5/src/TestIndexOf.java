/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestIndexOf {
    
    public static void main(String[]args){
        
        String str="hello John";
        
        for(int i=0;i<str.length();i++){
            int index=str.indexOf("o",i);
            
            if(index!=-1){
                System.out.println(index);
                i=index+1;
            }
        }
    }
    
}
