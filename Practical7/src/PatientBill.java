
public abstract class PatientBill implements Comparable{
    protected String visitID;
    protected String name;

    public PatientBill() {
    }
    
    

    public PatientBill(String visitID, String name) {
        this.visitID = visitID;
        this.name = name;
    }

    public void setVisitID(String visitID) {
        this.visitID = visitID;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getVisitID() {
        return visitID;
    }

    public String getName() {
        return name;
    }
    
    public int compareTo(Object o){  //classCastingException  - if not same class
        if(o==null){
            throw new NullPointerException("empty");
        }else if(!(o instanceof PatientBill)){
             throw new ClassCastException("Invalid class");
        }else{
            PatientBill temp=(PatientBill)o;
             return this.name.compareTo(temp.name);
        }
        
        
       
    }
    
  
      
   
  
    public abstract double calculateTotalCharges();
    
    public String toString(){
        return "Visit ID: "+visitID+"\n"+
                "Name:"+name;
    }
    
    
}
