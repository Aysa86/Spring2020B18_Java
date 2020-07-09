package day21_multyDimentionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";// 'J', 'a', 'v', 'a'
        char[] chars = name.toCharArray();

        System.out.println(chars[0]);// 'J'
        System.out.println(chars[3]);//'a'


        System.out.println("========================================");

        String str = "I like Java";
        String []arr = str.split(" ");

        System.out.println(Arrays.toString(arr));
        System.out.println("====================================================");


        String sentence = "Today is great day"; // day great is Today

        String words [] = sentence.split(" ");
        System.out.println(Arrays.toString(words)); //[Today, is, great, day]

        for(int i = words.length-1; i >= 0; i--){
           String eachWord = words [i];
            System.out.print(eachWord+" ");
        }

        String str2 = "ABCD";
         String arr2 [] = str2.split(""); // ["A", "B", "C", "D"]
        char [] ch2 = str2.toCharArray(); // ['A', 'B', 'C', 'D']
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));


    }
}
