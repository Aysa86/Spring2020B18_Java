package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>(); // rejects duplicates
        names.addAll(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Douglas", "Vladimir", "Tina", "Douglas"));

       Iterator<String> it = names.iterator();

       while (it.hasNext()){
           String s = it.next();
          if( s.contains("e") || s.contains("E")){
              it.remove();
          }
       }
        System.out.println(names); // [Aysa, Tina, Douglas, Vladimir]

        System.out.println("===========================================");

        LinkedHashSet<String> students = new LinkedHashSet<>(); // rejects duplicates
        students.addAll(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Douglas", "Vladimir", "Tina", "Douglas"));

        for (Iterator<String> it2 = students.iterator(); it2.hasNext();){
            String s1 = it2.next();
            if (s1.contains("E") || s1.contains("e")){
                it2.remove();
            }

        }
        System.out.println(students); // [Aysa, Tina, Douglas, Vladimir]

        System.out.println("======================================");

        LinkedHashSet<String> employees = new LinkedHashSet<>();
        employees.addAll(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Douglas", "Vladimir", "Tina", "Douglas"));

        employees.removeIf(p -> p.contains("E") || p.contains("e"));
        System.out.println(employees); // [Aysa, Tina, Douglas, Vladimir]

        System.out.println("========================================");

        LinkedHashSet<String> friends = new LinkedHashSet<>();
        friends.addAll(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Douglas", "Vladimir"));
        friends.removeAll(Arrays.asList("Ekaterina", "Vladimir"));
        System.out.println(friends); // [Aysa, Eugene, Tina, Douglas]

        System.out.println("========================================");

        LinkedHashSet<String> family = new LinkedHashSet<>();
        family.addAll(Arrays.asList("Aysa", "Eugene", "Ekaterina", "Tina", "Douglas", "Vladimir", "Tina", "Douglas"));
        family.retainAll(Arrays.asList("Aysa", "Ekaterina", "Vladimir"));
        System.out.println(family); // [Aysa, Ekaterina, Vladimir]

        System.out.println("=========================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,4,5,6,7,2,3,4,5));

        // verify 5, 6, 8 are contained in the list

       boolean result = list.containsAll(Arrays.asList(5,6,8));
        System.out.println(result); // true










    }
}
