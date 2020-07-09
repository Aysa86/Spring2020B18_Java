package day18_nestedLoops;

import java.util.Scanner;

public class FactorialNumber {
    /*
    write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int result = 1;

        while (num >= 1){
            result*=num;// result = result*num
            num--;
        }
        System.out.println(result);


    }
}
