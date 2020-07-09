package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);//remove all odd numbers

        System.out.println(list);//[2, 4, 6, 8, 10]

        System.out.println("===============================================");

        Predicate<Integer> lessThenFive = a -> a < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThenFive);

        System.out.println(list2);// [5, 6, 7, 8, 9, 10]

        System.out.println("===============================================");

        Predicate<String> startsWithA = str ->  str.startsWith("A");//  ! str.startsWith("A") ==>[Aysa, Alisa, Anna]
                                            // str -> str.toLowerCase().startsWith("a") ==> to ignore case Sensitivity
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Aysa", "Eugene", "Dzhalaeva", "Alisa", "Anna"));
        names.removeIf(startsWithA);

        System.out.println(names); // [Eugene, Dzhalaeva]

        System.out.println("=================================================");

        Predicate<String> startsWithMorA = s -> s.startsWith("M") || s.startsWith("A");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar", "Aysa", "Aisya", "Eugene"));
        nameList.removeIf(startsWithMorA);
        System.out.println(nameList);// [Eugene]

        System.out.println("=================================================");

                                          //c >= 48 && c <= 57;==> from Ascii Table
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        chars.removeIf(digits);
        System.out.println(chars); // [A, B, @, &, Z]

        System.out.println("=====================================================");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf(p -> p > 5);// can provide directly without declaring Predicate

        System.out.println(nums);// [1, 2, 3, 4, 5]


    }
}
