package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        // write a programm that can return uniques objects from arrayList of characters

        Character [] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);// [A, A, B, C, D, D]

        ArrayList<Character> result = new ArrayList<>(); // [B, C]


        /*for(int a = 0; a <= charList.size()-1; a++) {
            int count = Collections.frequency(charList, charList.get(a));
            if (count == 1) {
                result.add(charList.get(a));
            }
        }

        System.out.println(result); //[B, C]*/

        for(Character each : charList) {

            int count = Collections.frequency(charList, each);
            if (count == 1) {
                result.add(each);
            }
        }

        System.out.println(result);// [B, C]



    }
}
