package day17_WhileLoops;

public class WhileLoopPractice2 {
    /*
    write a program that calculates the sum of the even numbers between 0~10
     */


    public static void main(String[] args) {

        for(int a = 0; a <= 10; a++){
            if(a % 2 == 0){
                System.out.println(a);
            }
        }

        System.out.println("================================");
        int sum = 0;
        int a = 0;
        while(a <= 10){
            if(a % 2 == 0) {
                //System.out.println(a);
                sum += a;
            }
            a ++;
        }
        System.out.println(sum);


    }
}