package day05_Unary_ShorthandOperators.day_04JavaRecap;


public class ArithmeticOperators {

    public static void main(String[] args) {

//10/3 ==> 3.3333

        int a = 10/3; //3 int hasnt decimal numbers; compiler takes it like whole number;
         //10/4 ==> 2.5;
        System.out.println(10/4); //2

        double d = 10/4;
        //d = 2;
        // d ==> 2.0;
        System.out.println(d); //2.0;
        System.out.println(10.0 / 4);//2.5;
        System.out.println(10/4.0);//2.5;


        System.out.println(10.0/4.0);//2.5;


        boolean evenNumber = 25%2 ==0;

        // if 25/2 has a remainder of zero, then its even number;

        System.out.println(evenNumber); //false;
        System.out.println(25%2); // 1;

        boolean oddNumber = 22%2 !=0; // 0!=0==> false;

        System.out.println(10%2 ==0); //true; 10 is even number;

        System.out.println(11%2 !=0); //true; 11 is odd number;


        System.out.println(" 10 is even number: " + (10 % 2 == 0));// true

        System.out.println(" 11 is even number: " + (11 % 2 == 0)); // false;

        System.out.println("25 is odd number: " + (25% 2 != 0 ) );

        System.out.println("25 is even number: " + !(25 % 2 != 0)); // true, ! opposite or use (15%2 == 0);









    }


}
