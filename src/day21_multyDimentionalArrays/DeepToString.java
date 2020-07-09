package day21_multyDimentionalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {

        int [] arr1D = {1,2,3,};

        System.out.println(Arrays.toString(arr1D));


        int [][] arr2D = {{1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(arr2D));

    }
}
