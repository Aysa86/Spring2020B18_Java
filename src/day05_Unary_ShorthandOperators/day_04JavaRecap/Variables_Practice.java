package day05_Unary_ShorthandOperators.day_04JavaRecap;

public class Variables_Practice {


    public static void main(String[] args) {


        // DataType variableName = Data;

        byte num1 = 127;
        short num2 = num1; //double>float>long>int>short>byte;
        // byte num3 = num2; byte is less than short;


        int num4 = num2; // int is prefered by compiler;

        long num5 = 99999999999999l;
        float num6 = 100l;

        System.out.println(num6); // 100.0

        float num7 = 0.5f;
        System.out.println(num7); //0.5;

        double num8 = 0.5f;
        double num9 = 9999999l;
        double num10 = 100.5;

        char ch1 = '$';
        System.out.println(ch1); // $;
        char ch2 = 22000; //0->65565;
        System.out.println(ch2);



        int a1 = '8';
        System.out.println(a1); //56 in ascii table;

        int a2 = 'z'; //122;
        System.out.println(a2);


        double d1 = 'z' + '8'; // 178.0;
        System.out.println(d1);


        boolean b1 = true;
        boolean b2 = false;

        System.out.println( 9> 10); //false;
        System.out.println(9>=9);// false;
        System.out.println(9 != 10); //false;
        System.out.println('a'=='b');// false;
        //System.out.println('a' == "a"); doesnt match "" and ''

        System.out.println('a' == 'b'-1); //true;
        // a = 97 (in ascii table)
        //97 == 98-1
        // 97==97 ==> true;

        boolean r1 = !true; // false;
        System.out.println(r1);

        System.out.println(!r1);//true;
        System.out.println(!true == false); //true;

        System.out.println(!true !=!false);



    }



}
