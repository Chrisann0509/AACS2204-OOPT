/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TestPatient {
    
    
    
    public static void main(String[] args){
        PatientBill []pList={
            new Inpatient(100.00,300.00,'S',2,"P1001","John"),
            new Inpatient(100.00,300.00,'S',2,"P1002","Alex"),
            new Outpatient(100.00,"O1001","Lee"),
            new Outpatient(100.00,"O1002","Chris")
        };
        for(int i=0;i<pList.length;i++){
             System.out.println(pList[i].toString()+"\n");
        }
      
        System.out.println("Total Amount of Collection:"+computeTotalCollection(pList));
        System.out.println(pList[0].compareTo(pList[1]));
        
    }
    
   
    
    public static double computeTotalCollection(PatientBill []pList){
        double totalAmount=0.00;
        for(int i=0;i<pList.length;i++){
            totalAmount+=pList[i].calculateTotalCharges();
        }
        return totalAmount;
    }
    
}
