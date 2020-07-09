package StringManipulations;

public class NonStart{
    /*
    Given 2 strings, return their concatenation,
    except omit the first char of each.
    The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
     */
    public static String nonStart(String a, String b){
        String result = ( a.substring(0,1)).concat(b.substring(0,1));
        return result;
    }

    public static void main(String[] args) {
        
        nonStart("Hello", "World");
    }
}
