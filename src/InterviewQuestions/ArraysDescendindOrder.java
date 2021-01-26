package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDescendindOrder {

    public static int[] descendingOrder(int [] arr) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: arr)

            list.add(each);



        for(int i=0; i < arr.length; i++) {

            arr[i] = findMax(list);

            list.remove(Integer.valueOf(arr[i]));

        }

        return arr;

    }



    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a) {

            max = Math.max(max, each);
        }
        return max;

    }

    public static void main(String[] args) {

    }

    }

