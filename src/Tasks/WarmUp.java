package Tasks;

import java.util.Arrays;

public class WarmUp {
    /*
     1. write a return method that can return the minimum number from an int array

     */
    public static void main(String[] args) {
        int [] arr = {200, 80, 500, 400, 250};
       /* Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int firstIndex = arr[0];
        int MinNumber = arr[firstIndex];
        System.out.println(MinNumber);*/

        int num1 = MinNumber(arr);
        System.out.println(num1);

        int [] arr2 = {300, 600, 750, 10, 30};
       int num2 =  MinNumber(arr2);
        System.out.println(num2);


    }

    public static int MinNumber(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int MinNumber = arr[0];
        System.out.println(MinNumber);



        return MinNumber;
    }




}
