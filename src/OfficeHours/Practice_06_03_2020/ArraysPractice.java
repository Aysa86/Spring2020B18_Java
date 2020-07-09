package OfficeHours.Practice_06_03_2020;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    /*
    3) Create a method that will accept an int array and reverse
     the order of elements. Return the reversed array.*/

    public static int [] reversed(int[]arr){
      // 1,3,2,4 ==> 4,2,3,1

      for(int a = 0; a < arr.length / 2; a++){
          int temporarily = arr[a];
          arr[a] = arr[arr.length-1 - a];
          arr[arr.length-1 - a] = temporarily;
      }


      return arr;
    }



    /*4) Overload the method to accept an ArrayList of integers
    and reverse the order of the elements. Return the reversed ArrayList*/

    public static ArrayList<Integer> reverse(ArrayList<Integer>list){
        ArrayList<Integer> reverse = new ArrayList<>();

        for(int a = list.size()-1; a >= 0; a -- ){
            reverse.add(list.get(a));// reads each element from the list
        }
       return reverse;

    }



    public static void main(String[] args) {

        int a [] = {5,2,5,8,3,1,6};
        System.out.println(Arrays.toString(reversed(a)));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,6,9,6,1));
        System.out.println(reverse(list));


    }
}

