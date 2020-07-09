package Replit;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        /*
        Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        //String fullName = firstName+lastName;

        //String firstName = fullName.substring(0, fullName.indexOf(" "));
        //String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(firstName.substring(0,1).toUpperCase());
        System.out.println(lastName.substring(0,1).toUpperCase());



    }
}
