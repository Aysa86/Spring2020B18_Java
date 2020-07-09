package Replit;
import java.util.Scanner;
public class Pluralizer {

    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("# in:");
            int amt = inp.nextInt();
            inp.nextLine(); //this line is necessary
            System.out.print("word:");
            String word = inp.nextLine();
            //leave the above unedited, write your code below:


/*

In this project, you will be creating a program that takes a given non-negative integer
and a given singular noun as a String.  You will have to print out the number,
followed by the string in its plural form (unless the number is 1).

The given inputs are:
int amt;
String word;

For example, let's say your inputs are as follows:
# in: 4
word: apple
Your program should print out "4 apples"

# in: 0
word: apple
Your program should print out "0 apples"

 */
        String plural = "";
        if(amt == 1){
            plural = amt +" "+word;
        }else if(amt == 0 || amt >= 2){
            if(word.endsWith("fe")){
                plural = amt+" "+word.substring(0,word.length() - 2) + "ves";
            }else if(word.endsWith("sh") || word.endsWith("ch")){
                plural = amt +" "+ word + "es";
            }else if(word.endsWith("us")){
                plural = amt+" "+word.substring(0,word.length()- 2) + "i";
            }else if(word.endsWith("y")){
                if(word.endsWith("ay") || word.endsWith("uy")
                        || word.endsWith("oy") || word.endsWith("ey")){
                    plural = amt+" "+word+"s";
                }else{
                    plural = amt+" "+word.substring(0,word.length()-1) + "ies";
                }
            }else{
                plural = amt +" "+word+"s";
            }
        }
        System.out.println(plural);
    }



        }

