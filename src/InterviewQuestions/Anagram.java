package InterviewQuestions;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class Anagram {

    public static boolean isAnagram(String a, String b){

        if (a.length() != b.length()) {
            return false;
        }
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);

    }

    public static void main(String[] args) {


        System.out.println(isAnagram("Level", "level")); // false
    }


}
