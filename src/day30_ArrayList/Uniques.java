package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /*
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//{1, 2, 1}
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();


      // list.get(0) ==> 1
        for(int a = 0; a < list.size(); a++) {

            int count = 0;
            for (Integer each : list) {
                if (each == list.get(a)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(a));
            }

        }
        /*
        for(Integer each2 : list){
            int count = 0;
            for(Integer each  : list ){
                if(each == each2 ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(each2); // 0 1 2
            }
        }
         */







        System.out.println(list);//[1, 2, 1, 4, 3]
        System.out.println(uniques);//[2, 4, 3]

    }
}
