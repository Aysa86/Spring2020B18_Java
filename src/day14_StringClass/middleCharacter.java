package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    /*
    3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();

        String middleCharacter = ""; // to store the middle character at the end

       int totalCharacters = word.length();
       int middleNumber = totalCharacters/2;

       if(totalCharacters % 2 !=0){//odd numbers
           middleCharacter = middleCharacter + word.charAt(middleNumber);
           //middleCharacter += word.charAt(middleNumber);
       }else{// even number
           middleCharacter = middleCharacter + word.charAt(middleNumber - 1) + word.charAt(middleNumber);
       }
        System.out.println(middleCharacter);









    }
}
