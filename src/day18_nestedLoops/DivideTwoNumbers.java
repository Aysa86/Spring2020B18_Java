package day18_nestedLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {
/*
1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
			10/3 = 3 remainder 1
			10 - 3 - 3 - 3 = 1
 */
        int a = 10;
        int b = 3;

        if(b == 0){
            System.out.println("Divisor can not be zero");// if zero we have to stop program
            System.exit(0);
        }

        int count = 0; // count the execution of the loop
        while (a >= b) {
            a -= b; // a = a - b;
            count++;
        }
        if (a == 0) {
            System.out.println("The result is: " + count);
        } else {
            System.out.println("The result is: " + count + " with the remainder of " + a); //remainder
        }
    }
}
