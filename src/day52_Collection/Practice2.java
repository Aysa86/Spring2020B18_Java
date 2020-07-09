package day52_Collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {
        /*
        2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"
            str2 ="ab";
            output: true
         */
/*
        String str1 = "abababab";
        String str2 = "baba";

        String[] arr1 =  str1.split(""); // converts String to array
        String []arr2 = str2.split("");

        TreeSet<String> t1 = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> t2 = new TreeSet<>(Arrays.asList(arr2));    FIRST SOLUTION

        System.out.println(t1); // [a, b]
        System.out.println(t2); // [a, b]

        str1 = t1.toString();
        str2 = t2.toString();

        System.out.println(str1.equals(str2)); // true

*/

        String str1 = "abababab";
        String str2 = "baba";

      str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
      str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2)); // true
    }
}
