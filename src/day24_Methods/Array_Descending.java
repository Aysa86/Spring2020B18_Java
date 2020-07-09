package day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Descending {


    public static void main(String[] args) {
        int [] arr1 = {3,57,82,0,-47};

        int [] arr2 = {100, 500, 400, 200};

        int [] arr3 = {1000, 4000, 5000, 300};

        arr1 = sortDescending(arr1);
        arr2 = sortDescending(arr2);
        arr3 = sortDescending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static int [] sortDescending(int [] arr){
        Arrays.sort(arr);

        int [] ReversedArr = new int[arr.length];// to make sure that 2 arrays have the same size

        /*          i        j
        ReversedArr[0] = arr[3]
        ReversedArr[1] = arr[2]
        ReversedArr[2] = arr[1]
        ReversedArr[3] = arr[0]
         */
        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++ ){
            ReversedArr[i] = arr[j];
            j--;
        }
           return ReversedArr;                                     //  System.out.println((Arrays.toString(ReversedArr)));
    }



}
