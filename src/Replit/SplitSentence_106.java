package Replit;
import java.util.Arrays;
import java.util.Scanner;
public class SplitSentence_106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below



        //TODO: start your code here

        String words [] = sentence.split(" ");
        //System.out.println(Arrays.toString(words));
        for(int c = words.length-1; c >= 0; c--){
            String eachWord = words[c];
            //End your code here. do not modify below statement
            System.out.print(eachWord+" ");







        }
    }
}




