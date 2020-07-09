package Replit;


import java.util.Scanner;

public class EnterWord {
    public static void main(String[] args) {

       /* 4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
                Input:
        Seriously
        Output:
        really?
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String word1 = "really?";
        String word2 = "never mind";

        if(word.endsWith("ly")){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }


    }
}
