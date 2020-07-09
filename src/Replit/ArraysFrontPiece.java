package Replit;
import java.util.*;
public class ArraysFrontPiece {
/*
Given an int array of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] arr = new int[2];
        if(num.length < 2){
            System.out.println(Arrays.toString(num));
        }else{
           arr[0] = num[0];
           arr[1] = arr[1];
            System.out.println(Arrays.toString(arr));
        }

    }
}