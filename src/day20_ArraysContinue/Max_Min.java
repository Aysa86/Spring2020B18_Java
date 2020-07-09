package day20_ArraysContinue;

public class Max_Min {
    public static void main(String[] args) {

        /*
        1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
         */

         int [] arr = {2,3,4,5,6,7,8,9};
         int lastIndex = arr.length-1;
         int maxNum = arr[0];
         int minNum = arr[0];
         for(int i = 0; i <= lastIndex; i++){

            if(arr[i] > maxNum){ // array's indexes r compared with each other, and whichever is greater will be assigned to maxNum
                maxNum = arr[i];
            }
            if(arr[i] < minNum){//array's indexes r compared with each other, and whichever is smaller will be assigned to minNum
                minNum = arr[i];
            }


         }

        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
