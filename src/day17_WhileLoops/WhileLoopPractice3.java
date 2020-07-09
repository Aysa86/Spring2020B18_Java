package day17_WhileLoops;

public class WhileLoopPractice3 {
    public static void main(String[] args) {

        /*for(int a = 0; a < 100; a++){
            System.out.print("*");
        }*/

        int a = 0;// int a = 1;
        while(a<100){ // a < 101;
            System.out.print("*");
            a++;
        }
        System.out.println();
        int number = 3;
        /*
        ***
        * *
        * *
        * *
        ***
         */
        System.out.println("***");
        while( number >0){
            System.out.println("* *");
            number--;
        }
        System.out.println("***");


    }
}
