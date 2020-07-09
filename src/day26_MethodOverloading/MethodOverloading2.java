package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    1st method : print sum of two int numbers
    2nd method : print sum of three int numbers
    3rd method : print sum of four int numbers
     */

    public static void main(String[] args) {
        //10,5
        sum2Numbers(10,5);
        //10,5,5
        sum3Numbers(10,5,5);
        // 10,5,5,10
        sum4Numbers(10,5,5,10);

        System.out.println("===================================================================");
        // 10,5
        sum(10,5);
        //10,5,5
        sum(10,5,5);
        //10,5,5,10
        sum(10,5,5,10);

        int []arr1 = {1,5,9,2,6};
        char []arr2 = {'a','e','m'};
        double[] arr3 = {3.7, 8.9, 2.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }

    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

//====================================================================================================
    public static void sum(int a, int b){
    System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }





}
