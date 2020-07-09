package Replit;
import java.util.Scanner;
public class Arrays_101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String firstLetter = "";
        String lastLetter = "";
        for(String eachWord : words) {
            // System.out.println(eachWord);
            firstLetter = eachWord.substring(0, 1);
            lastLetter = eachWord.substring(eachWord.length() - 1);

            System.out.println(firstLetter + lastLetter);
        }
    }
}

