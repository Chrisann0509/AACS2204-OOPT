/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class ComparableCircle extends Circle implements Comparable,Colorable{

    public ComparableCircle(double radius) {
        super(radius);
    }
    
    
    
     public int compareTo(Object o){  //classCastingException  - if not same class
       
         if(o==null){
            throw new NullPointerException("empty");
        }else if(!(o instanceof ComparableCircle)){
             throw new ClassCastException("Invalid class");
        }else{
            ComparableCircle temp=(ComparableCircle)o;
            if(this.getRadius()>temp.getRadius()){
                return 1;
            }else if(this.getRadius()<temp.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }
        
        
       
    }
    public void howToColor(){
        System.out.println("Fill with red color");
    }
}
