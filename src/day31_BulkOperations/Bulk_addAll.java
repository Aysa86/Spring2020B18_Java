package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add 30, 20, 40, 50, 45, 35, 200
       /* list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(45);
        list.add(35);
        list.add(200);*/

       list.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));
        System.out.println(list);//[30, 20, 40, 50, 45, 35, 200]

        System.out.println("===========================================================");

        String[] names = {"Aysa", "Eugene", "Ekaterina", "Vladimir", "Chingiz"};
//                           0        1          2            3          4
        //names[5] = "Dzhalaeva";

        System.out.println(Arrays.toString(names));// out of bound we dont have index number 5

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        nameList.add(1, "Dzhalaeva");
        nameList.remove("Chingiz");
        System.out.println(nameList);

        System.out.println("==============================================================");

        Integer [] numbers = {1,2,3,4,5,6,7,8,9,0};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]







    }
}
