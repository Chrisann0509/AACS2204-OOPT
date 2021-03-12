/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class TestCircle {
    
    public static void main(String[] args){
        ComparableCircle circle1=new ComparableCircle(2.2);
        ComparableCircle circle2=new ComparableCircle(1.2);
        
        if(circle1.compareTo(circle2)==0){
            System.out.println("Same");
        }else if(circle1.compareTo(circle2)>0){
            System.out.println("Circle 1 greater than circle 2");
        }else{
            System.out.println("Circle 2 greater than circle 1");
        }
        
        circle1.howToColor();
    }
    
}
