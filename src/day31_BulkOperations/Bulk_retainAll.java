package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,1,4,5,1,6,3,4,2,4,1,7));
        // only keep 5,6,7

        list.retainAll(Arrays.asList(5,6,7));
        System.out.println(list);//[5, 6, 7]






    }
}
