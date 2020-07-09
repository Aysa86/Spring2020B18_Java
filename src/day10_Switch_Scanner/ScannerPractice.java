package day10_Switch_Scanner;


import java.util.Scanner;


public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte();
        System.out.println("Enter your second number: ");
        byte num2 = input.nextByte();
        //int total = (num1+num2);
        System.out.println("The sum of those two numbers are: "+(num1+num2));
                         //"The sum of"+num1+"and"+num2+"is: "+total ;



    }
}
