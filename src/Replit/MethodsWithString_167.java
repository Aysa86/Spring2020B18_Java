package Replit;
import java.util.*;
public class MethodsWithString_167 {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result = "";
        for(int a = 0; a <= str.length()-1; a++){
            char ch = str.charAt(a);
            int count = 0;
            for(int b = 0; b <= str.length()-1; b++){
                char ch1 = str.charAt(b);
                if(ch == ch1){
                    count++;
                }

            }
            if(count == 1){
                result+=str.charAt(a);
            }
        }
        return result;
    }
}
