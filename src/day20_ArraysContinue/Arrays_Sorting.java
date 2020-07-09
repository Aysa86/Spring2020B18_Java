package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int [] arr1 = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Min number is: " + arr1[0]);
        System.out.println("Max number is: "+ arr1[arr1.length-1]);


        System.out.println("==========================================");

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

        System.out.println("===========================================");

        String [] names = {"Deniz", "Osman", "Rustem", "Aysa", "Ali"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("============================================");

        int [] arr = {3,1,4, -1, 100, -100, 200,155};
        Arrays.sort(arr);//[-100;-1,3,4,100,155,200]
                     //index:0    1 2 3 4 5  6    7

        int [] arrDescending = new int[arr.length]; //[0,0,0,0,0,0,0,0]
                                           //index:    0,1,2,3,4,5,6,7
        System.out.println(Arrays.toString(arr));// ascending order

        int j = 0;

        for(int i = arr.length-1; i >=0; i--){
            //System.out.print(arr[i]+" ");
            arrDescending[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arrDescending));


    }
}
