package day06_Shortland_LogicalOperators;

public class ShortHandOperators {


    public static void main(String[] args) {


        int X = 20;
        X  += 10; // X = X + 10 = 30;

        System.out.println(X); //30;

        X += 60;
        //  X = X + 60; X = 90;

        String schoolName = "Cybertek";
        schoolName += 12345; // schoolName = schoolName + 12345;
        System.out.println(schoolName); // Cybertek12345;


        int A = 100;
        A -= 90;
        System.out.println(A); //10;

        int B = 200;
        B -= A; // B = B-A;
        System.out.println(B); //190;


        int a = 2;
        a *= 3;
        System.out.println(a); // 6;

        int b = a *= 10;
        //b = a = a * 10 = 60
        System.out.println(b); //60;
        System.out.println(a); //60;

        int a1 = 100; //200;
        int b1 = (a1 *= 2) + ++a1;

        // b1 = 200 + 201;
        //b1 = 401;

        int x1 = 10;
        int y = x1 += 10*2; //x1 = x1 + 20
                //x1 += 20; ==> 30;

        int q = 20;
        int p = q*=20*3;
             // q*= 60; q = q *60;

        int num1 = 300;
        num1 /= 2; //num1 = num1 / 2 ==> 150;
        System.out.println(num1); //150;
        int num2 = 400;
        num2 /= 20 + 10; // num2 = num2 / 30;
                         //  num2 = 400 / 30 ==> 13.123;
                         // num2 = 13;
        System.out.println(num2); //13;

        int num3 = 300;
        num3 %= 10+20; //  num3 %= 30; first calculate right side and left side;
                       // num3 = num3 % 30;
                       // num3 = 300 % 30 ==> 0;
        System.out.println(num3); //0; remainder cannot be negative;

        int n1 = 400;
        n1 %= 3 * 5; // n1 % 15;
                     // n1 = n1 %= 15;
                     //n1 = 400 % 15;
                     // 400 / 15 = 26.666
                     // remainder: 400 - (15 * 26) = 10;
        System.out.println(n1); //10





    }
}
