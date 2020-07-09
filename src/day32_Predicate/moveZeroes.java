package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        /*
        Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);// [1, 0, 2, 0, 3, 0, 4, 0]

        int count = 0;
        for(Integer each : list){
            if(each == 0){ // find how many zeroes we have
              count++;
            }
        }

        System.out.println(count); // 4

        list.removeAll(Arrays.asList(0)); // remove all zeroes from the list
        System.out.println(list); //[1, 2, 3, 4]


        for(int a = 0; a < count; a++){
            list.add(0); //depending on count, we add all zeroes at the last index
        }   //list.add(0,0);   if we have to add all zeroes at the beginning
//               index number, 0
        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]



    }
}
