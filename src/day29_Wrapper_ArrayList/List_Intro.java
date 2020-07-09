package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        // ArraysList <DataType> listName = new ArraysList<DataType>();
        ArrayList <Integer> scores = new ArrayList<Integer>();// size: 0

        scores.add(10); // autoboxing, 10 is int, we can assign it to Integer. size==> 1
        scores.add(20); // autoboxing, size : 2
        scores.add(30); // size : 3

        System.out.println(scores);

       Integer i1 =  scores.get(2);// none
       int i2 = scores.get(2);// unboxing
       double i3 = scores.get(2);// unboxing

        System.out.println(i1);// i2, i3 ==> the same [30]


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(35);
        nums.add(47);
        nums.add(59);
        int max = Integer.MIN_VALUE;
        for(Integer each : nums){
           if( each > max){
               max = each;
           }
        }

        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for(Integer each : nums){
            if(each < min){
                min = each;
            }
        }
        System.out.println(min);

    }
}
