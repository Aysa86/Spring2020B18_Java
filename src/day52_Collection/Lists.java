package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
       // List<String> list0 = new List<String>(); it's an interface, that's why we can't create an object


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.remove(0);

        System.out.println("=======================================");


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);

        Vector<Integer> vector = new Vector<>();
        vector.add(2);

        Stack<Integer> stack = new Stack<>();
        stack.add(2);

        System.out.println("==========================================");

        Stack<String> names = new Stack<>();
        names.add("Aysa");
        names.add("Eugene");
        names.add("Tina");
        names.add("Douglas");
        names.add("Ekaterina");

        System.out.println(names);//[Aysa, Eugene, Tina, Douglas, Ekaterina]

        String s1 = names.pop();// "Ekaterina"
        System.out.println(s1);

        System.out.println(names); // [Aysa, Eugene, Tina, Douglas]

        String s2 = names.pop();
        System.out.println(s2); // "Douglas"

        System.out.println(names); // [Aysa, Eugene, Tina]

        names.push("Mama");

        System.out.println(names); // [Aysa, Eugene, Tina, Mama]












    }

    public synchronized void method(){}
    // we achieve thread-safety
}
