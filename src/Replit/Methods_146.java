package Replit;
import java.util.Scanner;
public class Methods_146 {





        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.next();
            person(s) ;
        }

        public static void person(String info) {

            //your code here

            String firstName=info.substring(0,info.indexOf(","));
            info=info.replaceFirst(",", " ");
            String lastName=info.substring(info.indexOf(" ")+1,info.indexOf(","));
            String age =info.substring(info.indexOf(",")+1,info.length());
            System.out.println("person name: "+firstName+" last name: "+lastName+" age: "+age);
        }//end person

    }

