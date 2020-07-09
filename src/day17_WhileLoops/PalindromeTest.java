package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        // write a program

        String str = "level";

        String reversedStr = "";

        int index = str.length()-1;// last index number

        while(index >= 0){
          reversedStr +=  str.charAt(index);
            index--;
        }

        boolean palindrome = reversedStr.equals(str);

        System.out.println(palindrome);

    }
}
