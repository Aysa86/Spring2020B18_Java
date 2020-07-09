package Replit;
import java.util.Scanner;
public class Triple_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //int count = 0 ;
        //WRITE YOUR CODE HERE
        /*
        We'll say that a "triple" in a string is a char appearing three times in a row.
        Print out the number of triples in the given string. The triples may overlap.
        Example:
        input: abcXXXabc
        output: 1
         */


        for(int count = 0; count>=3; count++){
            System.out.println(str.charAt(0));
        }



    }
}
