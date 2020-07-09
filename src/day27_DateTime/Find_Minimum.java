package day27_DateTime;

public class Find_Minimum {
    /*
    1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.

     */

    public static void main(String[] args) {

        int [] arr = {1,4,8,6};
        int min = arr[0];

        for(int each : arr){//each: 1, 4, 8, 6
           if(each < min){
               min = each;
           }
        }
        System.out.println(min);

        int [] arr1 = {39, 49, 38, 20, 19};
        System.out.println( MinNumber(arr1) );


        double [] arr2 = {30.9, 0.7, 50.8, 65.8};
        double num =  MinNumber(arr2);
        System.out.println(num);
    }

    public static int MinNumber(int [] arr){
        int min = arr[0];

        for(int each : arr){//each: 1, 4, 8, 6
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public static double MinNumber(double [] arr){
        double min = arr[0];

        for(double each : arr){//each: 1, 4, 8, 6
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}




