package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Practice {
    /*
    5) Create a method that will accept an ArrayList of Strings
        and return the String that has the biggest length*/


    public static String longest(ArrayList<String>list){
        String biggest = "";
        for(String each : list){
            if(each.length() > biggest.length()){
                biggest = each;
            }
        }
        return biggest;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("car", "Aysa", "Dzhalaeva"));
        System.out.println(longest(list));


    }

}
