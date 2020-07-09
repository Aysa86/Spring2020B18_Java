package OfficeHours.Practice_04_08_2020;

public class do_WhileLoop {
    public static void main(String[] args) {

        boolean b = false;// if true ==> infinite time

        while (b){
            System.out.println("Hello World");// never be executed; nothing on the console
        }
        System.out.println("========================");



        do{
            System.out.println("Hello World");// executes at least 1 time

        }while(b);

        System.out.println("==========================");

        int a = 0;

        do{
            if(a % 15 == 0) {

                System.out.print(a + " ");
            }

            a++;
        }while(a <= 100);


    }
}
