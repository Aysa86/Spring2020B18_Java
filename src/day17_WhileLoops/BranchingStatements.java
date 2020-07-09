package day17_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        // System.exit(0): stops the entire program immediately
        /*for(int i = 0; i < 5; i++){
            if(i % 2 != 0){
                System.exit(0);
            }
            System.out.println(i);
        }*/

        if (10 > 9) {  // true, exits programm immediatly. if false nothing is gonna happen (10<9)
            System.exit(0);

        }



        System.out.println("Hello World");// its not gonna be printed

    }
}
