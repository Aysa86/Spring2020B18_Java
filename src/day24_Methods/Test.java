package day24_Methods;
import Resourses.Library;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "Dzhalaeva";

        String RevString = Library.Reverse(str);
        System.out.println(RevString);


        int [] arr = {2000, 5000, 399, 50, 3999};
        arr =  Library.sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
