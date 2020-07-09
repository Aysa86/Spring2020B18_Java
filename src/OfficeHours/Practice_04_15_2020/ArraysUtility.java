package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        /*
        Arrays.sort(): sorts the array in ascending order
        Arrays.equal(arr1, arr2): check if two arrays are equal or not
        Arrays.toString(): converts single dimensional array to string

        Arrays.deepToString(): converts any multi dimensional array to string
         */

        int [] arr = {9,3,6,1,8,4,0,3};

        Arrays.sort(arr);//[0, 1, 3, 3, 4, 6, 8, 9]
        System.out.println(Arrays.toString(arr));


        int salaries [] = { 947333, 333333, 50000, 6666666, 8888888 };
        int length = salaries.length;
        int lastIndex = length-1;

        Arrays.sort(salaries);// ascending order

        System.out.println("Minimum salary: "+salaries[0]);// after sorting index[0] min number
        System.out.println("Maximum salary: "+salaries[length-1]);// last index[length-1]

        System.out.println("================================================");

        int [] arr1 = {2,1,3};
        int [] arr2 = {3,2,1};

        Arrays.sort(arr1);//{1,2,3}
        Arrays.sort(arr2);//{1,2,3}

        System.out.println(Arrays.equals(arr1,arr2));// true






    }
}
