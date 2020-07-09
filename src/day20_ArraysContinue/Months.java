package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //                     0          1        2        3      4     5      6        7        8            9       10          11
        /*
        String [] months2 = new String[12];
                  months2 = "Jan;
                  ...
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        while(num > 12 || num <= 0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
             num = input.nextInt();

        }

        String result = months[num-1];

        System.out.println(result);



    }
}
