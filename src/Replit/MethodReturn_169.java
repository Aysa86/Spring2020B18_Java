package Replit;



public class MethodReturn_169 {
    public static int wordCount(String words) {

        int count = 0;
        for(int a = 0; a <= words.length()-1; a++){
         count++;
}

        return count;
    }

    public static void main(String[] args) {
        int count = wordCount("foo bar");
        System.out.println(count);
    }
}
