package Replit;
import java.util.Scanner;
public class Method_145 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int[] arr){
        int numberOfPositives=0;
        int numberOfNegatives=0;
        int numberOfZeros=0;
        for(int each:arr){
            if(each>0){
                numberOfPositives++;
            }else if(each<0){
                numberOfNegatives++;
            }else{
                numberOfZeros++;
            }
        }
        System.out.println("positives:"+numberOfPositives+", negatives:"+numberOfNegatives+", zeros:"+numberOfZeros);
    }
}




