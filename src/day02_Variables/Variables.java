package day02_Variables;

public class Variables {

    public static void main(String[] args) {

        /* declare variables:
        DataType variableName = Data




         */
        byte l = 4;
        byte w = 2;
                byte area =8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        // byte = -128 to 127 accept whole numbers


        short num = 1000;
        // short = -32,768 to 32,767

        System.out.println(num);


        int num1 = 20000;
        // int = -2,147,483,648 to 2,147,483,647
        System.out.println(12345); // by default compiler takes it as a primitive number

        int num2 = 1000000000;
        System.out.println(num2);

        //long num3 = 9999999999; // out of int's range. Compiler by default takes it as  int

        long num4 = 9999999999l; // forcefully telling the compiler that this is long data number not an int
        System.out.println(num4);
        System.out.println(99999999999999l);

        System.out.println(3.5);

        // float f1 = 4.5; double primitive is larger than float primitive, cannot be assigned
        double d1  = 3.5;
        float f2 = 5.5f;
        System.out.println(f2);

        System.out.println("==========================================================");

        float pi = 3.14f;
        double p = 3.14f;
        int a1 = 3000;
        double d2 = a1; // 3000.0
        System.out.println(d2);

        long l2 = 40;
        float f3 = l2;





    }
}
