package Replit;
import java.util.*;
public class MethodsArrayList_removeInstanse {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)
    {

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer each : r){
           if(each != n){
               list.add(each);
           }
        }
        return list;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3,1,1,1,1,5,6,7,8};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main
}
