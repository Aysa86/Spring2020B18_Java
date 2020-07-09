package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {

       int [] arr = {1,2,3};

       String a = Arrays.toString(arr);
        System.out.println(a);// array must be converted to String before printing


        String [] names = {"Madina", "Fatih", "Osman"};
        System.out.println(Arrays.toString(names));

        double [] nums = {10, 20, 30, 40, 50};// we still can use it
        String b = Arrays.toString(nums);
        System.out.println(b);
        System.out.println(nums[0]); // double

    }
}
