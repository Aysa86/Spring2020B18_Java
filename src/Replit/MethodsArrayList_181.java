package Replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/*
combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"
 */
public class MethodsArrayList_181 {
    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String> combineRs = new ArrayList<>();
        for(String eachElement : r1){
            combineRs.add(eachElement);
        }
        for(String eachElement : r2){
            combineRs.add(eachElement);

        }
        String result="";
        for(String each: combineRs){
            result+=each;
        }
        return result;




    }

    public static void main(String[] args) {
        String[] r1 = {"a", "b"};
        String[] r2 = {"c", "d"};
        System.out.println(  combineRs(r1, r2));
    }
}
