package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        // indexOf(Object) ==> returns the index num

        ArrayList<Character> list = new ArrayList();
        list.add('A');//0
        list.add('B');//1
        list.add('C');//2
        list.add('D');//3
        list.add('C');//4

       int indexNum =  list.indexOf('C');
        System.out.println(indexNum);
       int lastIndexNum = list.lastIndexOf('C');//4
        System.out.println(lastIndexNum);

        list.remove(list.lastIndexOf('C'));// if i want to remove last 'C'
        System.out.println(list);//[A, B, C, D]

        System.out.println("============================================");
        // combine 2 arrays into list

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int each : arr1){
            list2.add(each);
        }

        for(int each : arr2){
            list2.add(each);
        }
        System.out.println(list2);
    }
}
