package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        /*
        nested loop: loop inside another loop
                    inner loop & outer loop
                    we only need nested loop when we want to repeat the loop
         */


        int b = 5;
        while(b < 10) {


            for (int a = 10; a <= 50; a += 10) {
                System.out.print(a + " ");
            }
            System.out.println();// to break the line on the console

            b++;
        }

        System.out.println("=========================================");
        /*
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
         */
        for(int d = 1; d <= 8; d++) {// vertical line

            for (int c = 0; c <= 5; c++) { // horizontal line
                System.out.print("* ");
            }
            System.out.println();// break the line

        }

        System.out.println("=========================================");
        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *

         */


        for(int f = 1; f < 8; f++) {


            for (int e = 0; e < f; e++) { //
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("===================================");

        for(int f = 8; f > 0; f--) {


            for (int e = 0; e < f; e++) { //
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
