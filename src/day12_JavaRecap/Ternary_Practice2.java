package day12_JavaRecap;

import java.util.Scanner;

/*
Create a new switch statement using char instead of int.
Create a new char variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found.
 */
public class Ternary_Practice2 {
    public static void main(String[] args) {


        char ch1 = 'A';
        String result = (ch1=='A') ? "A is selected" : (ch1=='B') ? "B is selected" : (ch1=='C') ? "C is selected":(ch1 =='D')
                ? "D is selected" :(ch1=='E')? "E is selected" : "Invalid character";
        System.out.println(result);










    }
}
