/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Outpatient extends PatientBill{
    public static final double REGISTRATION_FEES=30.00;
    private double consultationFees;

    public Outpatient() {
    }

    public Outpatient(double consultationFees, String visitID, String name) {
        super(visitID, name);
        this.consultationFees = consultationFees;
    }
    
  

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public static double getREGISTRATION_FEES() {
        return REGISTRATION_FEES;
    }


    
    public double calculateTotalCharges(){
        return REGISTRATION_FEES+consultationFees;
    }
    
    
    public String toString(){
        return super.toString()+"\n"+
                "Registration Fees:"+REGISTRATION_FEES+"\n"+
                "Consultation Fees:"+consultationFees+"\n"+
                "Total Charges:"+calculateTotalCharges();
    }
}
