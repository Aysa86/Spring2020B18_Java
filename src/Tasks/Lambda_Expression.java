package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        Predicate<Integer> DivisibleBy3And5 = n -> n % 3 ==0 || n % 5 == 0;

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3,4,5,9, 8, 10, 15));
        nums.removeIf(DivisibleBy3And5);

        System.out.println(nums); // [4, 8]

        System.out.println("==============================================");

        Predicate<Character> specialCharacter = c -> c >= 33 && c <= 47;

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('1', '5', '$', '#', '*'));
        chars.removeIf(specialCharacter);

        System.out.println(chars); // [1, 5]
        System.out.println("================================================");

        /*
      3.  create an ArrayList of string called country names
		 write a program that can remove all the country names that have length of 10 or greater
      4. write a program that can extract the sepecial characters, digits and alphebets from a string
       and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
         */

         Predicate<String> countryName = c -> c.length() >=10;

         ArrayList<String> list = new ArrayList<>();
         list.addAll(Arrays.asList("United States", "Argentina", "Russia", "Kuba", "France"));
         list.removeIf(countryName);
        System.out.println(list);//[Argentina, Russia, Kuba, France]

        System.out.println("============================================================");


















    }
}
