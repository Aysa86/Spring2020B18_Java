package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

     boolean r1 =    list1.contains("Z");
        System.out.println(r1); //false

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1);//{A, B, C, D}
        Collections.sort(list2);//{A, B, C, D}

      boolean r2 =  list1.equals(list2);
        System.out.println(r2);  // true

        System.out.println("==================================================");

       ArrayList<Integer> list3 = new ArrayList<Integer>();
       list3.add(10);
       list3.add(20);
       list3.add(35);
       list3.add(5);

       Collections.sort(list3);// [5, 10, 20, 35]
        System.out.println(list3);

        ArrayList<Integer> ReversedList3 = new ArrayList<>();

        for(int a = list3.size()-1; a >= 0; a--){
           // System.out.print( list3.get(a)+ " ");// 35 20 10 5

            ReversedList3.add(list3.get(a));
        }
        System.out.println(ReversedList3);// [35, 20, 10, 5]

        //list3 = ReversedList3; if we assign list3 to Reversed List3, list3 is not gonna be in ascending order
       // System.out.println(list3);[35, 20, 10, 5]


        System.out.println(list3.size());// 4
        boolean r4 = list3.isEmpty();
        System.out.println(r4); // false

        list3.clear();// removes everything
        boolean r5 = list3.isEmpty();
        System.out.println(r5);// true







    }
}
