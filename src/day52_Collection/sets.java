package day52_Collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {
                            // new LinkedHashSet ==> keeps insertion order
        Set<String> names = new HashSet<>(); // no insertion order
        names.add("Aysa");
        names.add("Eugene");
        names.add("Tina");
        names.add("Aysa");
        names.add("Aysa");

        System.out.println(names); // [Aysa, Eugene, Tina] no duplicates


        String [] arr = {"A", "A", "C", "D", "B", "A"}; // A, C, D, B

       LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1); // [A, C, D, B]


        System.out.println("=================================");

        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10, 9, 10, 9, 8, 7, 8, 7, 6, 5, 6));
        System.out.println(numbers); // [5, 6, 7, 8, 9, 10] removes duplicates and sort it


        System.out.println("=======================================");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(null);

        System.out.println(treeSet); // doesn't except null ==> NullPointerException




    }
}
