package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

        //  Create a method that will accept an int array and return the sum of all the numbers in the given array

    public  static int  sum(int[] arr){

        int  sum = 0;
        for(int a = 0; a < arr.length; a++){
          sum+=arr[a];

        }
        return sum;
    }

   // 2) Overload the method to accept an ArrayList of integers and return
    // the sum of all the numbers in the given ArrayList
     public static Integer sum(ArrayList<Integer>list){
        int sum = 0;
        for(Integer each : list){
            sum+=each;
        }
        return sum;
     }

      /*
      int sum = 0;
      for(int a = 0; a < list.size(); a++){
      sum+=list.get(a);

      }
      return sum;
       */
      public static void main(String[] args) {

          int [] arr = {1,2,3,4};
          System.out.println(sum(arr));
          ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
          System.out.println();
      }
}
