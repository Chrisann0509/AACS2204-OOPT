/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Test {
    public static void main(String []args){
        
        Studentexp s1=new Studentexp();
        Studentexp s2 =new Studentexp();
        
        try{
            s1.setName("John");
            s1.setGPA(5.0);
            System.out.println(s1.getName());
            System.out.println(s1.getGPA());
        }catch(Exception ex){
            System.out.println("Pls enter valid GPA");//
        }
        
    }
    
}
