package Replit;

import java.util.ArrayList;

public class Methods_Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        String str1 = list.get(pos1);
        String str2 = list.get(pos2);
        list.set(pos1,str2);
        list.set(pos2,str1);
        return list;

    }

    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("night");
        list1.add("silent ");
        list1.add("today is");
        System.out.println(swap(list1,0, 2 ));
    }//end main
}
