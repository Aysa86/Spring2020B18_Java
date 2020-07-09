package day24_Methods;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TasksFromYesterday {
    /*
     4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */



    public static void MaxNumber(int [] array){
        Arrays.sort(array);// ascending order
        System.out.println("Maximum number: "+array[array.length-1]);

    }

    public static void MinNumber(int [] array){
        Arrays.sort(array);
        System.out.println("Minimum number: "+array[0]);
    }

    public static void DescendingOrder(int [] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >=0; i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int [] arr = {5,6,3,8,9,20};
        MaxNumber(arr); //if parameter is array, the argument must be array
        MinNumber(arr);
        DescendingOrder(arr);
        int [] arr2 = {4,6,8,10,200,93,25};
        MaxNumber(arr2);
        MinNumber(arr2);           // REUSABLE
        DescendingOrder(arr2);
    }


}
