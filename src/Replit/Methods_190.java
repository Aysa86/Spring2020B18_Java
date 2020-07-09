package Replit;
import java.util.ArrayList;
public class Methods_190 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        System.out.println(   appendPosSum(list1));




    }
    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>nums){
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        for(Integer each : nums){
            if(each >= 0){
                sum+=each;
            }

        }
        //int lastIndex = list.size();
        //nums.add(lastIndex,sum);
        return list;
    }
}

