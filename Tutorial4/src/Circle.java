
//Circle =data type/template
class Circle {
    private double radius;
    
    public Circle(){ //do not have return type even void
        radius=1.0;//default value ,if user didn't assign value to radius
    }
    
     public Circle(double r){ //Circle c2=new Circle(2); - user ditn't assign will have error if does not have constructor
        setRadius(r); //if user assign direct at the object
        //at the TestCircle user didn't assign ,will use the  first constructor
    }
     
    void setRadius(double r){ //easy for user to change data(radius)
        
        if(r<=0){
            System.out.println("Invalid radius");
        }else{
            radius=r;
        }
    }
    
    double getRadius(){
        return radius;
    }
    
    double findArea(){
        return Math.PI*Math.pow(radius,2);
    }
    
}
