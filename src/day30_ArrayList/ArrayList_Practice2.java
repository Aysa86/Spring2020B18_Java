package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");//0
        list.add("B");//1
        list.add("C");//2

       // list.remove(1);

       boolean bool =  list.remove("B");
       boolean bool1 = list.remove("F");// false, we don't have "F" in the list

        System.out.println(list);//[A, C]
        System.out.println(bool);// true


        list.clear();
        System.out.println(list);// []
        System.out.println(list.size()); // 0

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);//0
        list2.add(1);//1
        list2.add(2);//2
        list2.add(3);//3

       int num1 =  list2.indexOf(1);// Integer = int, autoboxing
        System.out.println(num1);// 0, index number of first matching 1

       int num2 =  list2.indexOf(100);
        System.out.println(num2); // -1, object isn't exist at the given array
       

    }
}
