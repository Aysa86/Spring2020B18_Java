package Replit;

import java.util.Scanner;

public class name {

    /*3. Ask user to enter a word. Print true is the first and last characters
    of the string are same characters, print false otherwise.
            Input:
    abba
    Output:
            true*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.next();


        String firstCh =scan.next() ;
        String lastCh =scan.next() ;

        if(word.startsWith(firstCh) && word.endsWith(lastCh)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }











    }

}
