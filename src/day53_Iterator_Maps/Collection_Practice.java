package day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {
    /*
     access-modifiers specifier return-type methodsName(Parameter){}
     specifiers: static, abstract, final, synchronized ==> to achieve thread safety
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list);// thread safe

        Set<Integer> set = new HashSet<>();
        Collections.synchronizedSet(set); // achieving tread-safety

        System.out.println("=====================================");

        //1. write a program that remove the duplicates fron an array of String

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};
        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr));// String is an Object, that's why I can use Arrays.asList
        System.out.println(st); // [E, B, A, D, C]


        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arrayList);
        System.out.println(st2); // [E, B, A, D, C]








    }
    public synchronized void append(){

    }

}
