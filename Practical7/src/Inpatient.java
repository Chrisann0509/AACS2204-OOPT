/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Inpatient extends PatientBill{
    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationOfStay;
    public static final double STANDARDROOM_RATE=100.00;
     public static final double PRIVATEROOM_RATE=100.00;
     public double roomRate;

    public Inpatient() {
        
    }

    public Inpatient(double specialistCharges, double labCharges, char roomType, int durationOfStay, String visitID, String name) {
        super(visitID, name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
        
    }

 

    public void setSpecialistCharges(double specialistCharges) {
        this.specialistCharges = specialistCharges;
    }

    public void setLabCharges(double labCharges) {
        this.labCharges = labCharges;
    }

    public void setRoomType(char roomType) {
        this.roomType = roomType;
    }

    public void setDurationOfStay(int durationOfStay) {
        this.durationOfStay = durationOfStay;
    }
    
    

    public double getSpecialistCharges() {
        return specialistCharges;
    }

    public double getLabCharges() {
        return labCharges;
    }

    public char getRoomType() {
        return roomType;
    }

    public int getDurationOfStay() {
        return durationOfStay;
    }
 
    
    public double calculateTotalCharges(){
        if(roomType=='S'){
           roomRate=STANDARDROOM_RATE;
        }else{
            roomRate=PRIVATEROOM_RATE;
        }
        
        return specialistCharges+labCharges+(durationOfStay*roomRate);
    }
    
    public String toString(){
        return super.toString()+"\n"+
                "Specialist Charges:"+specialistCharges+"\n"+
                "Lab Charges"+labCharges+"\n"+
                "Room Type:"+roomType+"\n"+
                "Duration of stay:"+durationOfStay+"\n"+
                "Total Charges:"+calculateTotalCharges();
                        
    }
    
    
}
