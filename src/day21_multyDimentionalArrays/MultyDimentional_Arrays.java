package day21_multyDimentionalArrays;

import java.util.Arrays;

public class MultyDimentional_Arrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3};
//                          0 1 2    0 1 2 3
        int [] [] arr2D = {{1,2,3}, {4,5,6,7}};
        //    index number   0    ,    1

        System.out.println(arr2D.length); //2

        int [] arr1D = arr2D[1];// {1,2,3}

        System.out.println(Arrays.toString(arr2D[1]));

       int num1 =  arr2D[1] [3];
        System.out.println(num1);


        //                      0    1       0    1    2      0     1    2
        char [] [] ch2D = {   {'A', 'B'} , {'D', 'E', 'F'} , {'G', 'H', 'I'}  };
        //            index       0              1                 2

        char ch = ch2D[1] [0];
        System.out.println(ch);

         char [] ch2 = ch2D [2];// {'G', 'H', 'I'}

        System.out.println(Arrays.toString(ch2));

    }
}
