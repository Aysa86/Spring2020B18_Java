package day54_Maps;

public class String_vs_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {

        String str1 = "Cybertek";
         str1.concat(" School"); // immutable

        System.out.println(str1); // Cybertek

        System.out.println("=====================================");

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");
        System.out.println(builder); // Cybertek School

        System.out.println("=====================================");

        StringBuffer buffer = new StringBuffer("Aysa");
        buffer.append(" Dzhalaeva");
        System.out.println(buffer);

        System.out.println("======================================");


        String word = "ABCD";

        StringBuilder sb = new StringBuilder(word);
         sb.reverse();

        System.out.println(sb); // DCBA

        word = sb.toString();
        System.out.println(word);







    }
}
