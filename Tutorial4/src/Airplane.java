
public class Airplane {
    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private int numOfAirplane;
    
    public Airplane(){
        
    }
    public Airplane(String id,double price,int yearOfPurchased,int numOfPassenger){
        this.id=id;
        this.price=price;
        this.yearOfPurchased=yearOfPurchased;
        this.numOfPassenger=numOfPassenger;
        this.numOfAirplane++;
        
        
    }
    public void setId(String id){
        this.id=id;
    }
    
   
    
    public void setNumOfPassenger(int numOfPassenger){
        this.numOfPassenger=numOfPassenger;
    }
    
    public String getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public int getYearOfPurchased(){
        return yearOfPurchased;
    }
    
    public int getNumOfPassenger(){
        return numOfPassenger;
    }
    public int getNumOfAirplane(){
        return numOfAirplane;
    }
    
    public double calCurrentValue(){
        
        return price-(price*0.1*(2011-yearOfPurchased));
    }
    public String toString(){
        return "Id:"+id+"\n"+
                "Price:"+price+"\n"+
                "Year of purchased:"+yearOfPurchased+"\n"+
                "Number of Passenger:"+numOfPassenger+"\n"+
                "Current Value:"+calCurrentValue()+"\n";

    }
}
