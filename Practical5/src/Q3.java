/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Q3 {
    public static void main(String []args){
        
     if(args.length==0){
                System.out.println("Please enter data");
                System.exit(-1);
            }
                String sName="";
                String fName="";
                String title="";
                boolean isFound=false;
        //  System.out.print("To:" );
        for(int i=0;i<args.length-1;i++){   //-1 don't want Mr //String  .length()  array  .length
            String data=args[i];
            
          //  if(data.charAt(0)=='['){
           //     data.replace('[', '\0');
           //     data.replace(']','\0');
          //  }
            
            if(data.matches("\\[.*\\]")){ //"^\\"
                data=data.replaceAll("[\\[\\]]", "");
                isFound=true;
                 
            }
            data=data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
            fName+=(data+" ");
            title=args[args.length-1];
            // System.out.print(data+" "); display the three name
            
            if(isFound){
                sName=data;
                isFound=false;
            } 
            
        }
        
         System.out.println("To :"+fName);
         System.out.println("Wishing you a Merry Christmas," +title+" "+sName);
           
     
        
       
    }     
    
}
