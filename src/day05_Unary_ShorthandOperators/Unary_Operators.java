package day05_Unary_ShorthandOperators;

public class Unary_Operators {

    public static void main(String[] args) {


        int a = 10; // positive 10;
        int b = +a; //positive 10, no need to put +

         int a2 = -10;
         boolean result1 = a2 > 0; // false;
        boolean result2 = a2<0; // true;

        int x1 = -10;
        int y1 = -x1; //  positive 10; -(-10) ==> 10;


        int x2 = +20;
        int y2 = -x2; // -(+20) ==> -20;

        int x3 = +20;
        int y3 = +3; // +(+20) ==> +20;


        int z = 100;
        System.out.println(++z);// 101;increase immediatly;
        System.out.println(z);// 101;


        int P = 100;
        System.out.println(P++); // 100; first passes current value
        System.out.println(P); // 101; icrease the value by 1;









    }
}
