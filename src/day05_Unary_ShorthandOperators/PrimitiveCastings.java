package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {


    public static void main(String[] args) {


        int a = 10;
        long b = a;//implicite casting done automatically;
        //b = 10L;

        int a1 = 100;
        long b1 = (long)a1; //manually doing the implicit casting;

        //both of them is implicit casting, its done automatically;

        int Inum = 100;
        byte Bnum = (byte) Inum;
        short Snum = (short)Inum;// the same size;
        short Snum1 = (byte) Inum; // the smaller size;

        double Dnum = 5.5;
        float Fnum = (float) Dnum; //5.5;
        System.out.println(Fnum);
       // System.out.println(Fnum + 1); //6.5;

        char ch1 = 'a';

        short sh1 = (short)ch1; //  corresponding number of a = 97, in a ascii table

        char ch2 = 23456; // Chineese character;

        double dbl = ch2; //23456.0 larger than char

        int z1 = 10;
        double dbl2 = z1; // 10.0;
        short y1 = (short)z1;












    }
}
