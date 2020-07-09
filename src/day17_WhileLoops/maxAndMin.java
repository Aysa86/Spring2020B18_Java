package day17_WhileLoops;

import java.util.Scanner;

public class maxAndMin {
    /*
    1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = -999999999;//any number user provided will be greater than this number
                       //first user entered variable will be initialized to maxNumber

        int minNumber = 999999999;


        for(int i = 1; i<=5; i++  ) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>maxNumber){ // to compare each user inputs and assign maximum number to maxNumber variable
                maxNumber = num;
            }
            if(num<minNumber){// to compare each user inputs and assign minimum number to minNumber variable
                minNumber = num;
            }

        }

        System.out.println("Maximum number: "+maxNumber);
        System.out.println("Minimum number: "+minNumber);





    }
}
