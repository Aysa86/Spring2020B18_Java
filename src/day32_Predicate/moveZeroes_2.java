package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZeroes_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);// [1, 0, 2, 0, 3, 0, 4, 0]

        int count = Collections.frequency(list, 0);// return how many 0 in the list as an int
        System.out.println(count); //4

        list.removeAll(Arrays.asList(0));
        System.out.println(list);//[1, 2, 3, 4]

        for(int a = 0; a < count; a++){
            list.add(0); //depending on count, we add all zeroes at the last index
        }   //list.add(0,0);   if we have to add all zeroes at the beginning
//               index number, 0

        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

    }
}
