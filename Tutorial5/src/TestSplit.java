/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestSplit {
    
    public static void main(String[]args){
        String rec="John\3.5";
        
        String []data=rec.split("\\|");
        
        double d=Double.parseDouble(data[1]);
        //Integer.parseInteger()
        System.out.println(data[1]);
        
        
        
        //int i1=0;
        //Integer i2=100 (object)
    }
    
}
