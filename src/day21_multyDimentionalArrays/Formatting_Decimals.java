package day21_multyDimentionalArrays;

import java.text.DecimalFormat;

public class Formatting_Decimals {
    public static void main(String[] args) {
                                              // string
        DecimalFormat DF = new DecimalFormat("0.00");// number will be round to 2 decimals

        double a = 10.0/3.0;// 3.33333333 ==> 3.33

        System.out.println(DF.format(a));







    }
}
