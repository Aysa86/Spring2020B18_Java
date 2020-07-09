package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_First_Last {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String firstLetter = "";
        String lastLetter = "";
        for(String eachWord : words) {
            // System.out.println(eachWord);
            firstLetter = eachWord.substring(0, 1);
            lastLetter = eachWord.substring(eachWord.length() - 1);

            System.out.print(firstLetter+ lastLetter);
        }


    }
}
