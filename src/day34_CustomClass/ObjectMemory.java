package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list1;

        list1.remove(2);// 30
        System.out.println(list1);// 10, 20, 40

        System.out.println(list2);// 10, 20, 40

        System.out.println("=========================================================");

        String str1 = new String("Cybertek");// string is immutable(ne izmenyaetsya)
        String str2 = str1;

       str1 =  str1.toLowerCase();
        System.out.println(str1);//cybertek , new object==> str1 = str1.toLowerCase();
        System.out.println(str2);//Cybertek, old object, which is immutable



    }
}
