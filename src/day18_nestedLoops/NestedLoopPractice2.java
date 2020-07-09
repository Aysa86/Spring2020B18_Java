package day18_nestedLoops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        /*
             *
             * *
             * * *
             * * * *
             * * * * *
        */
        for(int b = 1; b <= 5; b++) {


            for (int a = 1; a <= b; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=======================================");
        for(int b = 9; b >= 0; b--) {


            for (int a = 1; a <= b; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("========================================");
        /*
        a
        a b
        a b c
        a b c d
        a b c d e
        */
       for(char ch1 = 'a'; ch1 <= 'z'; ch1++) {


           for (char ch = 'a'; ch <= ch1; ch++) {
               System.out.print(ch + " ");
           }
           System.out.println();

       }
        System.out.println("=================================================");

        for(char ch1 = 'z'; ch1 >= 'a'; ch1--) {


            for (char ch = 'a'; ch <= ch1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();


        }
    }
}
