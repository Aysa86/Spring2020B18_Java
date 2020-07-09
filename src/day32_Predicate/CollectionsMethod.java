package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

       int max = Collections.max(list);
       System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        System.out.println("========================================================");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        //second max = 3


        int secondMax = 0;

        Integer maxNum =  Collections.max(numbers);// returns Object, 4
        numbers.removeAll(Arrays.asList(maxNum));// remove all max numbers
        secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("========================================================");

        // second min = 2
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        int secondMin = 0;

       Integer minNum = Collections.min(numbers1);
       numbers1.removeAll(Arrays.asList(minNum));// removes all min numbers
       secondMin = Collections.min(numbers1);

        System.out.println(secondMin);

        System.out.println("=========================================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll((Arrays.asList(1,2,3,4,5)));
        Collections.swap(list3,0, 4 );
        System.out.println(list3);//[5, 2, 3, 4, 1]

        System.out.println("===========================================================");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Dzhalaeva", "Dzhalaeva", "Vladimirovna", "Dzhalaeva"));

        /*names.set(0, "Aysa");
        names.set(1, "Aysa");
        names.set(3, "Aysa");
        System.out.println(names);[Aysa, Aysa, Vladimirovna, Aysa]*/


        Collections.replaceAll(names, "Dzhalaeva", "Aysa" );
        System.out.println(names);// [Aysa, Aysa, Vladimirovna, Aysa]






    }
}
