/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestStudent {
    
    public static void main(String []args){
        Student s=new Student();
        Student s2=new Student();
        s.setStudentID("A12345");
        s.setSchool("FASC");
        s.setName("John");
        s2.setStudentID("B88888");
        s2.setSchool("FAFB");
        s2.setName("Max");
        boolean result=s.validateStudentId(s);
        boolean result2=s2.validateStudentId(s2);
        System.out.println(s.toString());
        if(result==true){
            System.out.println("Valid student ID");
        }else{
            System.out.println("Invalid student ID");
        }
        
         System.out.println("\n"+s2.toString());
        if(result2==true){
            System.out.println("Valid student ID");
        }else{
            System.out.println("Invalid student ID");
        }
        
        
        
    }
    
}
