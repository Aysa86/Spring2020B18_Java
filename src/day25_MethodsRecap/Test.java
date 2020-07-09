package day25_MethodsRecap;

import Resourses.Library;

public class Test {

    public static void main(String[] args) {

     String str = "ABCDABABCDAB";
     String result = Library.RemoveDuplicates(str);

        System.out.println(result);//ABCD

        String str1 = "AABBCCDD";
        String str2 = "B";
      int num1  =  Library.Frequency(str1,str2);
        System.out.println(num1);//2


        String str3 = "JFFYYYYYXDDDDKKKKKPPPPSSSS";
        String result2 = Library.FrequencyOfChars(str3);
        System.out.println(result2);//J1F2Y5X1D4K5P4S4
    }
}
