package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
     /*
     user name: cybertek
     password: cybertek123
      */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = input.next();// old value, first

        System.out.println("Enter password");
        String password = input.next();

        boolean valid = ( userName.equals("cybertek") &&  password.equals("cybertek123"));// false
                     //validating the first username and password
        int count = 1;
        while( ! valid) {
            // ! true
            System.out.println("Please re-enter your credentionals");
            System.out.println("Enter user name");
            userName = input.next();// new value

            System.out.println("Enter your password");
            password = input.next();// new value
            valid = (userName.equals("cybertek") && password.equals("cybertek123"));// true
            // validating new username and password

            count++;
            if (count == 3 && !valid) {// already have 3 attempt and credentials are still incorrect
                System.out.println("Your account is locked");
                break;

            }
        }

            if (valid) {
                System.out.println("Logged in");
            }


    }
}
