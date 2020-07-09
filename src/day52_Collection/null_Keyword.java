package day52_Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class null_Keyword {

    static String str; // ==> null
    static String str1 = new String("Cybertek");
    static ArrayList<Integer> list; // ==> null
    static ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3));

    public static void main(String[] args) {

        //System.out.println(str.charAt(0)); // NullPointerException, no object created
        System.out.println(str1.charAt(0)); // "C"
        System.out.println(list1.get(1)); // 3

        String str = null;// for all objects we can assign "null"
        Integer i = null;

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(null);
        System.out.println(list3); // [null] size is 1

        System.out.println("======================================");

       // String number = null;
        //int num1 = Integer.parseInt(number); // convert String to int
        //System.out.println(num1); // NumberFormatException


        String number1 = "123";
        int num2 = Integer.parseInt(number1);
        System.out.println(num2); // 123

        System.out.println("======================================");

        //String[] arr = {null, "Aysa", null};
        //arr[2].toUpperCase(); // NullPointerException

        String name = "aysa dzhalaeva".toUpperCase();
        System.out.println(name);






    }
}
