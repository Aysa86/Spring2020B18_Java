package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your words");

       String word = input.nextLine();
       String reversedWord = "";

       for(int i = word.length()-1; i>=0; i-- ){
            reversedWord +=  word.charAt(i);
       }

        //System.out.println(reversedWord);

        boolean palindrome = word.equals(reversedWord);//Level ==> leveL ==> word.Ignore.Case(reversedWord)
        System.out.println(palindrome);




    }
}
