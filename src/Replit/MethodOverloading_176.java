package Replit;
import java.util.*;
public class MethodOverloading_176 {

    //WRITE YOUR CODE HERE
/*
In this task, you need to write 2 methods findMax()
that will find a maximum number in the array. First method should work with array
of integers (int[]) and return int, and second method should work with an array of doubles (double[])
 and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */

 public  int  findMax(int[] arr){
     int [] arr1 = {10,30,40,80};
     Arrays.sort(arr1);
     int maxNum = arr1[arr1.length-1];

     return  maxNum;
 }
 public double findMax(double[]arr2){
     double [] arr = {1.5, 6.8, 5.0};
     Arrays.sort(arr);
     double maxNum = arr[arr.length-1];
     return maxNum;
 }

    public static void main(String[] args) {



    }
}

