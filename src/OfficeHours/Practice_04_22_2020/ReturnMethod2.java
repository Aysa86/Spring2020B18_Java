package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class ReturnMethod2 {

    public static void main(String[] args) {

        int [] arr = {400, 85, 95, 100, 45, -60};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = arr.length-2;

        int secondMaxNum = arr[secondLastIndexNum];
        System.out.println(secondMaxNum);


        int []arr2 = {200, 600, 850, 499, 300};

        int num2 =  SecondMaxNum(arr2);
        System.out.println(num2);

    }

    public static int SecondMaxNum(int[]arr){
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = arr.length-2;

        int secondMaxNum = arr[secondLastIndexNum];
        return secondMaxNum;
    }


}
