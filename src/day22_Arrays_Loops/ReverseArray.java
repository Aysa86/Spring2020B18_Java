package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //1. write a program that can reverse the array

       int [] arr = {1,2,3,4,5};

       for(int i = arr.length - 1; i >=0; i--){
          int eachNum = arr[i];
           System.out.println(eachNum);
       }

        System.out.println("================================================================");

       // [5,4,3,2,1]

       int [] reversedArr = new int [arr.length];// [0,0,0,0,0]

        /*reversedArr[0] = arr[4];
        reversedArr[1] = arr[3];
        reversedArr[2] = arr[2];
        reversedArr[3] = arr[1];
        reversedArr[4] = arr[0];*/

        int j = arr.length-1;

        for(int i = 0; i < arr.length;i++ ){
            reversedArr[i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(reversedArr));


    }
}
