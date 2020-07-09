package day19_Arrays;

import java.util.Scanner;

public class Uniques {
    /*
    1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = ""; //B, D, F, to store the unique characters



        for(int b = 0; b <= str.length()-1; b++) {
            char ch2 = str.charAt(b);
            int count = 0; // to count the occurrence of the character, yavlenie

            for (int a = 0; a <= str.length() - 1; a++) {
                char ch = str.charAt(a);
                if (ch == ch2) {// check how many time character is occurred in the string
                    count++;
                }
            }
            if (count == 1) { // if unique
                result += str.charAt(b);
            }
        }

        System.out.println(result);



    }
}
