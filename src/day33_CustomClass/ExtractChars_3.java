package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars_3 {
    /*
    4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:

        DO NOT USE LOOPS
 */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        Character [] ch = new Character[arr.length];
        for(int a = 0; a < arr.length; a++){
         ch[a]  =  arr[a];// reassign char[] arr to Character[] ch
        }

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p -> ! Character.isLetter(p));
        System.out.println(letters);//[A, B, C, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p -> ! Character.isDigit(p));
        System.out.println(digits);// [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        // specialChars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialChars);// [$, %, #, @, &, !]



    }
}
