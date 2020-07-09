package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1,30); //[10, 30, 20]

        System.out.println(list);
        System.out.println(list.size());

       int num1 = list.get(2); // unboxing

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        // {A, E, B, C, D}

        list2.add(2, "E");
        System.out.println(list2);

        for(int a = 0; a <= list2.size()-1; a++){
          String str =   list2.get(a);
            System.out.println(str);
        }

        System.out.println("====================================");

        for(String each : list2){
            System.out.println(each);
        }

       // list2 : {A, B, E, C, D}; replace C with F
        //         0  1  2  3  4

        list2.set(3, "F");//{A, B, E, F, D}
        System.out.println(list2);

        list2.remove(3);// {A, B, E, D};
        System.out.println(list2);

        list2.remove("A");
        System.out.println(list2);//{B, E, D}

        list2.clear();// size: 0
        System.out.println(list2);// []




    }

}
