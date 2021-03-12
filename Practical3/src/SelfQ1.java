import java.util.Scanner;

/**
 *
 * @author Chrisann Lee
 */
public class SelfQ1 {
    public static void getQty(int[] denomination,int[]qty){
         Scanner scan=new Scanner(System.in);
          for(int i=0;i<denomination.length;i++){
             System.out.print(denomination[i]+"\t\t\t");
             qty[i]=scan.nextInt();
             
              
          }
       
    }
     public static int[] calculateValue(int[] denomination,int[]qty){
            int[]subtotal=new int[denomination.length];
          for(int i=0;i<denomination.length;i++){
             subtotal[i]=denomination[i]*qty[i];

              
          }
           return subtotal;   
      }
    public static void main(String []args){
 
       
        int []deno={100,50,20,10,5,1};
        int []qty=new int[deno.length];
        int []value=new int[deno.length];
        int total=0;
      
       System.out.println("\nDenomination(RM)     Quantity");
       getQty(deno,qty);
       
       value=calculateValue(deno,qty);
      
       System.out.println("\nDenomination(RM)\tQuantity \tValue(RM)");
       for(int i=0;i<deno.length;i++){
           total+=value[i];
           if(value[i]>0){
              System.out.printf("%15d \t %7d \t%8d\n",deno[i],qty[i],value[i]);
              
           }
           
       }
       System.out.println("Total = RM"+total);
        
        
    }
     
    
}
