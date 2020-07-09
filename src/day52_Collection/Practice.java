package day52_Collection;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice {
    /*
    Tasks:
 1. write a program that can remove the duplicated characters from String
 2. write a program that can identify if two strings are build out of the same letters
        ex:
            str1 = "abababa"
            str2 ="ab";
            output: true

     */


    public static void main(String[] args) {
        String str = "ABABABCDEF"; //["A", "B", "C", "D", "E", "F"]
        String[] arr = str.split("");
        str = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(arr))){
            str+=each;
        }
        System.out.println(str); // ABCDEF



/*
        String str = "ABABABCDEF"; //["A", "B", "C", "D", "E", "F"]
        String[] arr = str.split("");
        LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(ls); // [A, B, C, D, E, F]

        String result = "";
        for(String each : ls){
          result+=each;
        }
        System.out.println(result); // ABCDEF
*/

    }
}
