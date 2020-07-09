package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result = new ArrayList<>();// empty, expected result = [1,2,3]

        for(Integer each : list){
           if( ! result.contains(each)){
               result.add(each);
           }
        }

        System.out.println(result);

        //remove duplicates from array

        Integer [] arr1 = {1,1,2,2,3,3};
        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for(int a = 0; a <= arr1.length-1; a++){
            if( ! nonDuplicates.contains(arr1[a])){
                nonDuplicates.add(arr1[a]);
            }
        }

        System.out.println(nonDuplicates);




    }
}
