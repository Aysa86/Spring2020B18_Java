package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(40);
        list1.add(95);
        list1.add(20);

        // if 10, 40, 50 exists in arraylist ==> true

/*
        boolean r1 =  list1.contains(10);
        boolean r2 =  list1.contains(40);
        boolean r3 =  list1.contains(50);

       boolean result = r1 == true && r2 == true && r3 == true;

        System.out.println(result); // false*/

        boolean result = list1.containsAll(Arrays.asList(10, 40, 50));
        System.out.println(result); // false

        boolean result2 = list1.containsAll((Arrays.asList(95, 20, 10, 40)));// true
        System.out.println(result2);


        // 10, 20, 40

        Integer[] data = {10, 20, 40};
     boolean result3 =    list1.containsAll(Arrays.asList(data));
        System.out.println(result3);


    }
}
