package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

/*
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password

     */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String inputUserName = input.nextLine();

        System.out.println("Enter password");
        String inputPassword = input.nextLine();

        boolean ToLogIn = inputUserName.equals("Cybertek") && inputPassword.equals("cybertekschool");
        // user entered valid user name and valid password
        boolean InvalidUserName =! inputUserName.equals("Cybertek") && inputPassword.equals("cybertekschool");
        // user entered invalid user name and valid password
        boolean InvalidPassword = inputUserName.equals("Cybertek") && ! inputPassword.equals("cybertekschool");
        // user entered valid user name and invalid password



        if(! inputUserName.isEmpty() && !inputPassword.isEmpty()){// user name and password r not empty
           if (ToLogIn){
               System.out.println("Logged In");
           }else if(InvalidUserName){
               System.out.println("Password is correct, user name is invalid");
            }else if(InvalidPassword){
               System.out.println("User name is correct, password is invalid");
           }else{
               System.out.println("Both user name and password are incorrect");
           }


        }else{ // user name and password r empty
            System.out.println("Please enter the credentials");
        }









    }
}
