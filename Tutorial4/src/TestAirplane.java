/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestAirplane {
    public static void main(String []args){
        
        
        Airplane a1=new Airplane();
        Airplane a2=new Airplane("XYZ 0001",250000,2005,100);
        a1.setId("AWX 0003");
        a1.setNumOfPassenger(190);
      
        
        System.out.println(a1.toString());
         System.out.println(a2.toString());
        
    }
    
}
