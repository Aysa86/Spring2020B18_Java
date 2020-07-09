package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {

        String []arr1 = {"A", "B", "C"};
        String []arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();//{"A", "B", "C", "D", "E", "F", "G"}

        for(int a = 0; a <= arr1.length-1; a++){
         String eachElement = arr1[a];
         list.add(eachElement);//list.add(arr1[a]);
        }

        for(String eachElement : arr2){
            list.add(eachElement);
        }

        System.out.println(list);//[A, B, C, D, E, F, G]




    }
}
