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
    public static void main(String[]args){
        Circle c1=new Circle();//c1 is pointer references and instance-pointing nothing at the beginning
        Circle c2=new Circle();//Circle c2=new Circle(2);
        c1.setRadius(2);//circle radius cannot be -1
        //do validation at behind class(Circle)
        System.out.println("Area:"+c1.findArea());
        System.out.println("Radius:"+c1.getRadius());
        
        
    }
    
}
