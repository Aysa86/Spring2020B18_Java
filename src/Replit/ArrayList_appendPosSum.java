package Replit;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_appendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, -5, 0, 2, 2));
        System.out.println( appendPosSum(list3));
    }


    /*Create a static method that:

    is called appendPosSum
    returns an ArrayList of Integers
    takes one parameter: an ArrayList of Integers

    This method should:
    Create a new ArrayList of Integers
    Add only the positive Integers to the new ArrayList
    Sum the positive Integers in the new ArrayList and add the Sum as the last element

    For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
    the ArrayList that gets returned should be (4,3,4,3,14),
    with 14 being the sum of (4,3,4,3).
    The original ArrayList should remain unchanged.
     */
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        int sum = 0;
        ArrayList<Integer> list2 = new ArrayList<>();
        /*for(int a = 0; a < list.size(); a ++){
            if(list.get(a) > 0){
               list2.add(list.get(a));
               sum+=list.get(a);
            }
        }
        list2.add(sum);
        return list2;
    }*/

        for (Integer eachNumber : list){
            if(eachNumber > 0){
                list2.add(eachNumber);
                sum+=eachNumber;
            }
        }
        list2.add(sum);
        return list2;
    }
}