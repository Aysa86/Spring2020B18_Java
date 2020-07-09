package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);// wrapper class Integer, 123

        System.out.println(a);//123

        double b = Integer.valueOf(str);// unboxing
      //double = Integer
        System.out.println(b);

        String str2 = "15.5";
       double d1 =  Double.valueOf(str2);
       //returns wrapper class, we assign to primitive as well==> double = Double, unboxing

       double d2 = Double.parseDouble(str2);
       //returns primitive ==> double = double, none autoboxing or unboxing

        System.out.println(d1);//15.5
        System.out.println(d2);//15.5

        System.out.println(d1==d2);//true

        System.out.println("=============================================");

        int z1 = 2000;
        Integer l1 = z1;// wrapper class dedicates to its primitive

        Short sh1 = 3000;
        int z2 = sh1;

       String r1 = "tRUe";
       Boolean t1 = Boolean.valueOf(r1);// Boolean, true
            // Boolean = Boolean , none

       boolean t2 = Boolean.valueOf(r1);// Boolean, true
       //boolean = Boolean // unboxing
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("================================================");


        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);//2147483647, it prints on the console

        double maxNum1 = Double.MAX_VALUE;
        System.out.println(maxNum1);//1.7976931348623157E308,it prints on the console

        int MinNum = Integer.MIN_VALUE;
        System.out.println(MinNum);//-2147483648,it prints on the console

        byte MaxNum = Byte.MAX_VALUE;
        System.out.println(MaxNum);//127

        byte MinNum1 = Byte.MIN_VALUE;
        System.out.println(MinNum1);// -128

        System.out.println("===================================================");

        int [] arr = new int[3];
        System.out.println(Arrays.toString(arr));//[0,0,0] default value

        Boolean [] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2));// [null, null, null] default value





    }
}
