package Replit;
import java.util.*;
public class MethodsArrayList_search {
    public static String search(ArrayList<String> r, String find) {
/*
search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"
 */


        for (String each : r) {
            if (each.contains(find)) {
                r.add(each);
            }
        }
        return find;
    }
        public static void main (String[]args){

            ArrayList<String> arr = new ArrayList<String>();
            arr.add("2");
            arr.add("6");
            arr.add("foo bar");
            arr.add("abc");


            String find_tst = search(arr, "foo");
            System.out.print(find_tst);//foo bar


        }//end main

}