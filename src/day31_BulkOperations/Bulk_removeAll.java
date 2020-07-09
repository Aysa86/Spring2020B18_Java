package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new  ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,1,5,6,3,7,8,9,8,1,1 ));
// remove 1, 3, 5, 8
       /* Integer a = 1;
        list.remove(a);// remove first 1
        list.remove(a);// remove next 1

        Integer b = 3;
        list.remove(b);// remove first 3
        list.remove(b);// remove next 3
        System.out.println(list);*/

        list.removeAll(Arrays.asList(1,8));// removes all 1 and 8

        Integer [] arr = {2,3};             //
        list.removeAll(Arrays.asList(arr));//           the same thing, 1 extra step
        System.out.println(list);

        System.out.println("=====================================================");

         String[] names = {"Aysa", "Vladimirovna", "Dzhalaeva", "Vladimirovna"} ;
         ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

         nameList.removeAll(Arrays.asList("Vladimirovna"));
        System.out.println(nameList);

    }
}
