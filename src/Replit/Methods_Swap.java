package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        String str1 = list.get(pos1);
        String str2 = list.get(pos2);
        list.set(pos1,str2);
        list.set(pos2,str1);
        return list;
    }

    public static char[] swap(String str, int a, int b){
        char ch[] = str.toCharArray();
        char temporary  = ch[a];
        ch[a] = ch[b];
        ch[b] = temporary;
        return ch;
    }

    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("night");
        list1.add("silent ");
        list1.add("today is");
        System.out.println(swap(list1,0, 2 ));

        String s = "ann";
        System.out.println(swap(s, 0, 1));


    }//end main


}
