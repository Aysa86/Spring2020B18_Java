package Resourses;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    public static String RemoveDuplicates(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);// every character in a string
            if( ! result.contains(""+ch)){// ""converts char into string
                result += ch;

            }
        }
        return result;
    }

    public static int Frequency(String str1, String str2){
        int count = 0;

        while(str1.contains(str2)){
            count++;
            str1 =  str1.replaceFirst(str2, "");// we need to make sure that we r not counting the same index over again
        }

        return count;



    }

    public static String FrequencyOfChars(String str){
        String NonDuplicate =  Library.RemoveDuplicates(str);
        String result = "";
        for(int i = 0; i < NonDuplicate.length(); i++) {

            String ch = "" + NonDuplicate.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            //System.out.print(ch + num);
            result+=ch+num;
        }
        return result;

    }

    public static int frequency(String str, char ch) { // counts char' frequency

        char[] arr = str.toCharArray();// [A, A, A]

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }

    public static int max(ArrayList<Integer> list){
        int maxNum = Integer.MIN_VALUE;// or int maxNum = list.get(0);

        for(int a = 0; a <=list.size()-1; a++ ){// i: 0,1,2,3,4
            if(list.get(a) > maxNum){
                maxNum = list.get(a);
            }
        }
        return maxNum;
    }



}

