package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {

       /*
       while(10>9){
            System.out.println("Hello World");
        }*/
       for(int i = 0; i<=5; i++){
        // initiliz condition iterator
           System.out.println(i);
       }

        System.out.println("=================================");
       int i = 0;
       while(i <= 5){
           //condition
           System.out.println(i);
           i++; // iterator needs to be placed after print statement
       }

        System.out.println("===================================");

       while(true){
           System.out.println("Hello World");
       }


    }
}
