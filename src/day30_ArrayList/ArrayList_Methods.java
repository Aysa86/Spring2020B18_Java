package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);//0
        list1.add(7);//2
        list1.add(8);//3
        list1.add(1,6);//1

       // list1.add(7, 10); // out of Bound

        list1.set(3,9);



        System.out.println(list1);//[5, 6, 7, 8]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");//{A}
        list2.add("B");//{A,B}
        list2.add(1,"C");//{A,C,B}
        list2.add(1,"D");//{A,D,C,B}

        list2.set(3,"F");
        list2.set(2,"E");

        System.out.println(list2);//[A, D, E, F]

        System.out.println("===========================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);//0
        list3.add(2);//1
        list3.add(3);//2
        list3.add(4);//3
        // 0 1 2 3
       // {1,2,3,4}
        int a = 1;
        list3.remove(a);//{1,3,4};object at the given index will be removed
        list3.remove(1);

        Integer b = 1;
        list3.remove(b);// object will be removed
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        // {10,20,30}

        //list4.remove(1);// we removed 20, provided index number of 20

        Integer a2 = 20;
        boolean bool = list4.remove(a2);// removed 20 by providing object, returns boolean

        System.out.println(list4);
        System.out.println(bool); // true



    }
}
