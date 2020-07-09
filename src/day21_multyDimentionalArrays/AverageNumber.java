package day21_multyDimentionalArrays;

public class AverageNumber {
    public static void main(String[] args) {
        /*
        1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
         */

        int [] arr = {10,20,30,40,50};
        // average: sum of all numbers, divide by total numbers, (length)

        int length = arr.length; // total number of elements
        int sum = 0;
                     //i<length;
        for(int i = 0; i<= length-1; i++){
          int eachNumber = arr[i];
          sum+=eachNumber;
        }
        System.out.println(sum);
        double average = sum/(double)length; // exact number
        System.out.println(average);

    }
}
