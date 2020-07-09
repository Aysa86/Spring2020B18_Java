package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*userName: cybertek
          passWord: cybertekschool
        */

        String validUserName = "cybertek";
        String validPassword = "cybertekschool";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String inputUserName = input.next();

        System.out.println("Enter password");
        String inputPassword = input.next();

        if(inputUserName.equals(validUserName) && inputPassword.equals(validPassword)) {
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }

        /*boolean validCredentials = (inputUserName.equals(validUserName) && inputPassword.equals(validPassword))
        if(validCredentials) {
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }*/
    }

}
