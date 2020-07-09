package Replit;
import java.util.Scanner;
import java.util.Arrays;
public class addToArray_149 {
    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        int [] r2 = new int[r.length+1];
        String result = "";
        for (int a=0; a < r.length; a++){
            result += r2[a] = r[a];
        }


        System.out.println(result+""+n);


    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
