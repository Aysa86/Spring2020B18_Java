package day18_nestedLoops;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i1 = 0; i1<10; i1++){ //outer loop repeating inner loop

            for(int i = 1; i<=5; i++){
                System.out.print(i);

            }

            System.out.println();// break the line
        }

        System.out.println("==============================================");

        /*
            ******
            ******
            ******
            ******
            ******
            ******
            ******
         */

        for(int i = 0; i<7; i++) {


            int a = 1;
            while (a <= 7) {
                System.out.print("*");
                a++;
            }
            System.out.println();


        }

    }
}
