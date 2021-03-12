import java.util.Scanner;

/**
 *
 * @author Chrisann Lee
 */
public class P3Q1 {
    public static double Average(int total,int x){
        return (double)total/x;
    }
    public static int getScore(int []score){
        int total=0;
        Scanner scan=new Scanner(System.in);
          for(int i=0;i<score.length;i++){
            System.out.print("Score "+(i+1)+":");
            score[i]=scan.nextInt();
            total+=score[i];
            
        }
          return total;
        
    }
    public static int calculateAboveAverage(int []score,double avrg){
        int upScore=0;
            for(int i=0;i<score.length;i++){
            if(score[i]>avrg){
                upScore++;
            }
        }
            return upScore;
    }
    public static int calculateBelowAverage(int []score,double avrg){
        int loScore=0;
            for(int i=0;i<score.length;i++){
            if(score[i]<avrg){
                loScore++;
            }
        }
            return loScore;
    }
    
    public static void main(String []args){
        int number;
        int total=0;
        double average;
        
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        number=scan.nextInt();
        int []score=new int[number];
        total=getScore(score);
    
        average=Average(total,number);
       
 
        System.out.println("\nResults");
        System.out.println("=======");
        System.out.println("Average is "+Average(total,number));
        System.out.println("Number of scores above or equal to the average is "+calculateAboveAverage(score,average));
        System.out.println("number of scores below the average is "+calculateBelowAverage(score,average));
        
              
        
       
        
        
    }
    
}
