

/**
 *
 * @author Chrisann Lee
 */
public class P3Q2 {
    public static int smallestIndex(int []list){
        int sIndex=0;
        int smallest=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]<smallest){
                smallest=list[i];
                sIndex=i;
            }
        }
        return sIndex;
    }
    public static void main(String[]args){
        int []list={1,2,4,5,10,100,2,-22}; 
        System.out.println("The smallest index is"+smallestIndex(list));
    }
    
}
