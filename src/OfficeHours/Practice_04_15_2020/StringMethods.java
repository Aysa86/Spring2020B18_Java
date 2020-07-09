package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String methods:
                        split(): splits string by given str, returns string arra
                        toCharArray(): returns char array
         */

        String str = "Cybertek";

      char[] ch =   str.toCharArray(); //['C','y','b','e','r','t','e','k']

        System.out.println(str.length() == ch.length); //true

        /*
        str1 = "abc', str2 = "cab";

       1. ['a','b','c']
          ['c','a','b']==>

        sort them
        2.['a','b','c']
          ['a','b','c']
         */

        String str1 = "abc";
        String str2 = "cab";

        char []ch1 = str1.toCharArray();//['a','b','c']
        char []ch2 = str2.toCharArray();//['c','a','b']

        Arrays.sort(ch1);//['a','b','c']
        Arrays.sort(ch2);//['a','b','c']

        System.out.println(Arrays.equals(ch1,ch2)); //true

        System.out.println("========================================================");

        String sentence = "I like to learn Java";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));


        int totalNumbersWords = words.length;
        System.out.println(totalNumbersWords);// 5 words

        //Java learn to like I
        String result = "";
        for(int i = words.length-1; i >=0; i--) {
            //System.out.print(words[i]+" ");
            result += words[i] + " ";
        }
            System.out.println(result);









    }
}
