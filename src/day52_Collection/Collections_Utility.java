package day52_Collection;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(9,2,5,7,8,1,7)); // no sorted
        Collections.sort(list1); // will sort list

        System.out.println(list1); // [1, 2, 5, 7, 7, 8, 9]

        System.out.println("========================================");

        // write a programm that can remove the duplicates
        // and print out in ascending order


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,8,2,2,4,8,9,1,4,4,3));

        TreeSet<Integer> sortedUnique = new TreeSet<>(nums);
        nums = new ArrayList<>(sortedUnique); // reinitialized ArrayList to TreeSet
        System.out.println(nums);// [1, 2, 3, 4, 5, 8, 9]
        System.out.println(sortedUnique); // [1, 2, 3, 4, 5, 8, 9]

        System.out.println("============================================");

        // write a program that can remove duplicates fom ArrayList.
        // Do not change the order

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(6,6,6,5,1,1));
        numbers = new ArrayList<>( new LinkedHashSet<>(numbers));
        System.out.println(numbers); // [6, 5, 1]

        System.out.println("===========================================");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Aysa"));
        boolean result = Collections.frequency(names, "Aysa") == 1;
        System.out.println(result); // false





    }
}
