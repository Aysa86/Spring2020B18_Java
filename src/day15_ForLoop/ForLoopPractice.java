package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        /*
        print odd numbers between 1 ~ 100 in a single line separated by a space
                                  1 3 5 7 9
         */


        /*for(int number = 1; number<=100; number +=2){
            System.out.print(number+" ");
        }*/
        String resultOdd = "";
        for(int number = 1; number<=100; number+=2){
            //resultOdd += number+"";
            resultOdd = resultOdd + number + " ";
        }

        System.out.println(resultOdd);

        // Even number between 1 ~ 100
            //                  2 4 6 8
        String resultEven =  " ";

        for(int number = 2; number <=100; number +=2){
            resultEven += number + " ";
        }

        System.out.println(resultEven);




    }
}
