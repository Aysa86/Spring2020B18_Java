package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {
    /*
    2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int a = 1; a <= 5; a++){ // created an ArrayList from 1 to 5
            list.add(a);
        }
        System.out.println(list);//[1, 2, 3, 4, 5]

        ArrayList<Integer> reversedList = new ArrayList<>();

        for(int a = list.size()-1; a >= 0; a-- ) {
            int eachNum = list.get(a);// unboxing
            reversedList.add(eachNum);

        }

        System.out.println(reversedList);//[5, 4, 3, 2, 1]
    }
}
