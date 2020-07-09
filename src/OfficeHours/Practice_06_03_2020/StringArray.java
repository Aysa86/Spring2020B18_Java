package OfficeHours.Practice_06_03_2020;


import java.util.Arrays;

public class StringArray {
    /*
    7) Create a method that will accept a String of multiple words
     separated by a space and return a 2D array.
     Each array in the multidimensional array will have two elements:
     the number of uppercase letters and the number of lowercase letters
     */

    public static int[][] countAll(String str){

        String [] words = str.split(" ");
                           // how many words we have
        int [][] count = new int[words.length][2];
        int index = 0;

        for (String each : words){
          int upper = 0;
          int lower = 0;

          for(int a = 0; a < each.length(); a++){

              if(Character.isUpperCase(each.charAt(a))){
                  upper++;
              }else {
                  lower++;
              }
          }
          int [] array = {upper, lower};
          count[index++] = array;

        }



       return count;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(countAll("ThE FaMoUs sOng")));
    }




}
