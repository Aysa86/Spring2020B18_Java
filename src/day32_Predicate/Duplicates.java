package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);


        ArrayList<String> duplicates = new ArrayList<>();// all duplicates add to new list

        for (int a = 0; a<=list.size()-1; a++) {// this loop will check all elements in the list
            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(a))) {// frequency of first index
                    count++;
                }
            }
            if (count > 1 && ! duplicates.contains(list.get(a))) {//if the frequency is greater than 1 and if its not contained in duplicates list yet, than add it
                duplicates.add(list.get(a)); // if its true, it will be add to duplicates list
            }
        }

         /*   //list.get(0) ==> "A"
            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(0))) {// frequency of first index
                    count++;
                }
            }
            if (count > 1) {
                duplicates.add(list.get(0)); // if its true, it will be add to duplicates list
            }
*/
        System.out.println(duplicates);//[A]


    }
}
