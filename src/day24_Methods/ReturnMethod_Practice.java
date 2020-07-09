package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Practice {

    public static void main(String[] args) {
        int [] arr = {30, 59, 93, 53, 60};

        int max = MaxNumber(arr);
        System.out.println(max);

        int min = minNumber(arr);
        System.out.println(min);
    }




    public static int MaxNumber(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }








}
