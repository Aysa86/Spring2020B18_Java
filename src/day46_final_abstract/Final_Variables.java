package day46_final_abstract;

public class Final_Variables {

  final  int instanceVariable = 300;
 // final  int instanceVariable2;   final instance variable MUST be initialized immediately


  final static int staticVariable = 1000;
// final static int staticVariable2; final static variable MUST be initialized immediately


    public static void main(String[] args) {

       final double PI = 3.14;
       // PI = 3.15;

     final String gender = "Female"; // variable with "final" cannot be reassigned
      //  gender = "Male";

      final int score;// local variables can be initialized later, before we use it
      score = 100;
     // score = 200;
        System.out.println(score);

        System.out.println("=================================================");

        Final_Variables obj = new Final_Variables();
       // obj.instanceVariable = 400;


        System.out.println("=================================================");

       // staticVariable = 2000;

    }


}
