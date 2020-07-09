package day11_Scanner;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a long number: ");

        long a = scan.nextLong();
        System.out.println("You have entered: "+a);


        System.out.println("Enter a decimal: ");
        float b = scan.nextFloat();// i can use double b = scan.nextFloat(); bc double is larger than float;
        System.out.println("You have entered "+b);

        System.out.println("Enter a decimal number: ");
        double c = scan.nextDouble();
        System.out.println("You have entered: "+c);

        System.out.println("Enter true or false: ");
        boolean bool = scan.nextBoolean();
        System.out.println(bool);


        System.out.println("Enter your sentence: ");
        String str = scan.next();
        System.out.println("You have entered: "+str);



    }

}
