package Replit;

import java.util.Scanner;

public class Methods_154Palindrome {
    /*
    Complete a method isPalindrome() that will check
    if number is a palindrome. Print your result as a boolean (true or false).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String str=""+num;
        String reversed="";
        for (int a=str.length()-1; a>=0; a--){
            reversed+=str.charAt(a);
        }
        boolean result= (str.equals(reversed)) ? true : false;
        System.out.println(result);
        /*if(str.equals(reversed)){
         boolean result = true;
        }else {
            boolean result = false;

            System.out.println(result);
        }*/
    }
}
