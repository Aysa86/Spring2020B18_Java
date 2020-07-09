package day03_VariablesContinue;

public class VariablesContinue {

    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9; // true
        System.out.println(result3);

        System.out.println( true == false);
        System.out.println("Aysa" == "good girl");// totally false good girl is not equal Aysa;

        // bad girl == good girl ==> false;
        System.out.println("Aysa" != "good girl");
        boolean r1 = true != true; // false;
        System.out.println(r1); // false;
        boolean r2 = "Batch 17" =="Batch 18";
        System.out.println(r2);
        System.out.println("====================================================");


        char ch1 = 'A';
        System.out.println(ch1); // A, char = all unicodes values from 0 to 65,535;
        char ch2 = 45000; // its gonna be not number but character in different language;

        System.out.println(ch2);
        char ch3 = 25000;
        System.out.println(ch3);
        char ch4 = 100; // in ASCII table 100=> d
        System.out.println(ch4);

        char ch5 = 'D'; // if capital its gonna be 'D';

        System.out.println(ch5);

        int num1 = 'D'; // number;
        System.out.println(num1); // in Ascii table D means 68;

        char a1 = 'z';
        byte b1 = 'z';

        //byte  b1 = a1; char is larger than short;

        int i1 = a1; // int is larger than char;








    }
}
