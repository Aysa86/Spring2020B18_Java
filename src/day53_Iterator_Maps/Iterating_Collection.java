package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        for (int a = 0; a < list.size(); a++){
            if (list.get(a) < 4){
                list.remove(a);
            }
        }

        System.out.println(list); // we can't remove objects from Collection using loop

        System.out.println("==================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        list2.removeIf(p -> p < 4);
        System.out.println(list2); // [4, 4, 5, 5] uses the Iterator interface internally

        System.out.println("===================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        Iterator <Integer> it = list3.iterator();

        //System.out.println(it.hasNext()); // true
        //System.out.println(it.next());

        while (it.hasNext()){
           if( it.next() < 4 ){
               it.remove();
           }
        }
        System.out.println(list3); // [4, 4, 5, 5]

        System.out.println("=====================================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

       for (Iterator<Integer> it2 = list4.iterator();it2.hasNext();  ){
          int num = it2.next();
          if (num < 4){
              it2.remove();
          }
       }

        System.out.println(list4); // [4, 4, 5, 5]






    }
}
