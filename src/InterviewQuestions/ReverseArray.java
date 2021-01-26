package InterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {

        Integer[] arr = {4,6,8,11,5,88};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        System.out.println("===============================");

        int[] arr1 = {2,5,9,0,1,5};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
