package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));// [A, D]

        ArrayList<String> duplicates = new ArrayList<>();// [A, D]
/*
        for(String each : list){
            int count =  Collections.frequency(list, each ); //
            if(count > 1){
                if(duplicates.contains(each)){// if each contained in the duplicates list
                    continue;// skip it
                }
                duplicates.add(each);
            }
        }

        /*
      int count =  Collections.frequency(list, list.get(0) ); // first element
        if(count > 1){
            duplicates.add(list.get(0));
        }
*/
       // System.out.println(duplicates);//[A, D]

        for(int a = 0; a < list.size(); a++){

            int count = Collections.frequency(list, list.get(a) );
            if(count > 1 && ! duplicates.contains(list.get(a))){
                duplicates.add(list.get(a));
            }

        }

        System.out.println(duplicates);//[A, D]


    }
}
