/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class T4Q4 {
    private int no1;
    int no2;
    
    T4Q4(int a,int b){
        no1=a;
        no2=b;
    }
    int sum(){
        return no1+no2;
    }
    
}
class TestQuestion{
    public static void main(String []args){
        T4Q4 q=new T4Q4(1,2);
        System.out.println("Sum="+q.sum());
    }
}
